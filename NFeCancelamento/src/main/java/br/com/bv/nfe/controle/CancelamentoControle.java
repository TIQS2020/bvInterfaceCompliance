package br.com.bv.nfe.controle;

import br.com.bv.nfe.vo.CancelamentoVO;
import br.com.bv.nfe.vo.ServicesVO;
import br.com.compliance.nfe.dao.F55IJC80Dao;
import br.com.compliance.nfe.dao.F55IJC84Dao;
import br.com.compliance.nfe.jde.domain.F55IJC80;
import br.com.compliance.nfe.jde.domain.F55IJC80Id;
import br.com.compliance.nfe.jde.domain.F55IJC84;
import br.com.compliance.nfe.jde.domain.F55IJC84Id;
import br.com.compliance.nfe.jpa.EntityManagerHelper;
import br.com.compliance.nfe.util.DateUtil;
import br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfCancServ.NfCancServ;
import br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.LoteIntWSResponse;
import br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.MultOrgAuthentication;
import br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.TpCpfCnpj;
import br.com.compliancefiscal.services.integracao.services.v1.nfServicoCancelamentoService.CancelarNfServicoRequest;
import br.com.compliancefiscal.services.integracao.services.v1.nfServicoCancelamentoService.CancelarNfServicoResponse;
import br.com.compliancefiscal.services.integracao.services.v1.nfServicoCancelamentoService.NfServicoCancelamentoService_PortType;
import br.com.compliancefiscal.services.integracao.services.v1.nfServicoCancelamentoService.NfServicoCancelamentoService_ServiceLocator;
import br.com.nfe.control.XmlFileControl;
import br.com.nfe.util.Operacao;
import br.com.nfe.vo.ArquivoVo;
import br.com.nfe.xml.cancelamento.XmlFileCancelamentoRoot;
import br.com.nfe.xml.envio.XmlFileEnvioRoot;
import br.com.nfe.xml.retorno.vo.CaminhosVO;
import org.apache.axis.types.NonNegativeInteger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.persistence.EntityManager;
import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CancelamentoControle {

	MultOrgAuthentication autenticacao = null;
	private static final String[] STATUS_CANCELAMENTO = {"2","3"};
	CancelamentoVO cancelVO = null;
	DateUtil dateUtil = new DateUtil();
	private List<F55IJC80> listF55IJC80 = new ArrayList<>();
	private ServicesVO servicesVO;
	private static final Logger log = LogManager.getLogger(CancelamentoControle.class.getName());
	private F55IJC80Dao f55IJC80Dao = new F55IJC80Dao();
	private F55IJC84Dao f55IJC84Dao = new F55IJC84Dao();
	XmlFileControl xmlFileControl = new XmlFileControl();

	private XmlFileCancelamentoRoot xmlFileCancelamentoRoot = null;

	public CancelamentoControle() {
	}

	public void inicializaProcesso(ServicesVO services, CaminhosVO caminhosVO) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy as HH:mm:ss");
		try {
			log.info("## INICIANDO PROCESSO DE CANCELAMENTO - "+dateFormat+" ##");
			log.info("++ VERIFICANDO PASTA DE ARQUIVOS ++");
			XmlFileCancelamentoRoot xmlFileCancelamentoRoot = new XmlFileCancelamentoRoot();
			Operacao<XmlFileEnvioRoot, XmlFileCancelamentoRoot> operacao = new Operacao<>(null, xmlFileCancelamentoRoot);

			List<ArquivoVo> arquivoVoList = xmlFileControl.xmlTransformToObject(operacao);

			if(arquivoVoList.size() > 0) {

				for(ArquivoVo arquivoVo : arquivoVoList) {

					if(arquivoVo.getXmlFileCancelamentoRoot() != null) {
						EntityManager manager = EntityManagerHelper.getEntityManager();

						xmlFileCancelamentoRoot = arquivoVo.getXmlFileCancelamentoRoot();

						try {
							manager.getTransaction().begin();

							F55IJC80Id f55IJC80Id = new F55IJC80Id(xmlFileCancelamentoRoot.getJCBNNF(), xmlFileCancelamentoRoot.getJCBSER(), xmlFileCancelamentoRoot.getJCN001(), xmlFileCancelamentoRoot.getJCDCT());

							F55IJC80 f = manager.find(F55IJC80.class, f55IJC80Id);

							if (f != null) {
								F55IJC80 f55ijc80 = f;

								f55ijc80.setJCAN8(xmlFileCancelamentoRoot.getJCAN8());
								f55ijc80.setJCEV02(xmlFileCancelamentoRoot.getJCEV02());
								f55ijc80.setJCEV07(xmlFileCancelamentoRoot.getJCEV07());
								f55ijc80.setJCDTA1(xmlFileCancelamentoRoot.getJCDTA1());
								f55ijc80.setJCCAND(xmlFileCancelamentoRoot.getJCCAND());

								manager.merge(f55ijc80);
							}

							manager.getTransaction().commit();

							String sourceStr = caminhosVO.getRecebido() + "\\" + arquivoVo.getNome();
							String destStr = caminhosVO.getProcessando() + "\\" + arquivoVo.getNome();
							xmlFileControl.moveFile(sourceStr, destStr);

							log.info("## INICIANDO MONTAGEM DOS OBJETOS DE EMISSAO ##");
							servicesVO = services;
							montaObjetos(caminhosVO, arquivoVo, f);
							log.info("## FINALIZANDO PROCESSO DE CANCELAMENTO ##");

						} catch (Exception e) {
							String sourceStr = caminhosVO.getProcessando() + "\\" + arquivoVo.getNome();
							String destStr = caminhosVO.getErro() + "\\" + arquivoVo.getNome();
							xmlFileControl.moveFile(sourceStr, destStr);
							log.error("## ERRO DE INTEGRACAO: ERRO AO INICIALIZAR O PROCESSO COM OS ARQUIVOS E BANCO LOCAL - EXCECAO --> " + e);
							if (manager.getTransaction().isActive()) {
								manager.getTransaction().rollback();
							}
						} finally {
							manager.close();
						}

					}else {
						log.info("++ NENHUM ARQUIVO ENCONTRADO ++");
						log.info("## FINALIZANDO PROCESSO DE CANCELAMENTO ##");
					}
				}
			}else {
				log.info("++ NENHUM ARQUIVO ENCONTRADO ++");
				log.info("## FINALIZANDO PROCESSO DE CANCELAMENTO ##");
			}
		} catch (Exception ex) {
			log.error("## ERRO DE INTEGRACAO: ERRO NA LISTAGEM DE NOTAS - EXCECAO --> " + ex.getStackTrace());
			for (StackTraceElement s : ex.getStackTrace()) {
				log.error(" - METODO: " + s.getFileName() + " - LINHA: " + s.getLineNumber());

			}
		}
	}

	public void montaObjetos(CaminhosVO caminhosVO, ArquivoVo arquivoVo, F55IJC80 f) {

		log.info("## Montando Objetos ##");

		try {
			log.info("## Nota ##");
			log.info("+ Numero: " + f.getId().getJCBNNF());
			log.info("+ Serie: " + f.getId().getJCBSER());
			log.info("+ Pre Nota: " + f.getId().getJCN001());
			log.info("+ Tipo: " + f.getId().getJCDCT());

			cancelVO = new CancelamentoVO();
			cancelVO.setHeader(f);
			cancelVO.setId(new F55IJC80Id(f.getId().getJCBNNF(), f.getId().getJCBSER(), f.getId().getJCN001(), f.getId().getJCDCT()));

			F55IJC84Id id = new F55IJC84Id(f.getId().getJCBNNF(), f.getId().getJCBSER(), f.getId().getJCN001().longValue(), f.getId().getJCDCT(), 5);
			F55IJC84 part = f55IJC84Dao.getF55IJC84ById(id);

			if (part != null) {
				cancelVO.setCodigoMultOrg(part.getJCAAIL());
				cancelVO.setHashMultOrg(part.getJCDESTIN());
			}

			if (cancelVO.getCodigoMultOrg() != null && !cancelVO.getCodigoMultOrg().isEmpty()) {
				autenticacao = new MultOrgAuthentication(cancelVO.getCodigoMultOrg(), cancelVO.getHashMultOrg());
			}

			cadastrarCancelamento(servicesVO.getCancelamentoServiceURL(), caminhosVO, arquivoVo);
			atualizaF55IJC80();

			String sourceStr = caminhosVO.getProcessando() + "\\" + arquivoVo.getNome();
			String destStr = caminhosVO.getFinalizado() + "\\" + arquivoVo.getNome();
			xmlFileControl.moveFile(sourceStr, destStr);

		} catch (Exception ex) {
			log.error("## ERRO DE INTEGRACAO: NOTA --> " + cancelVO.getHeader().getId().getJCBNNF() + " - EXCECAO --> " + ex);
			for (StackTraceElement s : ex.getStackTrace()) {
				log.error(" - METODO: " + s.getFileName() + " - LINHA: " + s.getLineNumber());

			}
			try {
				cancelVO.getHeader().setJCEV15("E");
				f55IJC80Dao.updateF55IJC80(cancelVO.getHeader());
				String sourceStr = caminhosVO.getProcessando() + "\\" + arquivoVo.getNome();
				String destStr = caminhosVO.getErro() + "\\" + arquivoVo.getNome();
				xmlFileControl.moveFile(sourceStr, destStr);
			} catch (Exception e) {
				log.error("## Erro Cancelamento NFe: " + e);
			}
		}

		log.info("## Fechando o mótodo de montagem de Objetos ##");

	}

	public void atualizaF55IJC80() {
		try {
			f55IJC80Dao.updateF55IJC80(cancelVO.getHeader());
		} catch (Exception e) {
			log.error("## Erro na interface de cancelamento NFe ao atualizar o objeto no banco de dados: " + e);
		}

	}

	public void cadastrarCancelamento(String cancelamentoURLService, CaminhosVO caminhosVO, ArquivoVo arquivoVo) throws Exception {

		log.info("## Cancelamento de NFe ##");

		if (autenticacao != null) {
			if (cancelVO != null) {
				TpCpfCnpj cpfCnpj = new TpCpfCnpj();
				if (!"".equals(cancelVO.getHeader().getJCBCPF()) && cancelVO.getHeader().getJCBCPF() != null) {
					cpfCnpj.setCpf(cancelVO.getHeader().getJCBCPF());
				} else if (!"".equals(cancelVO.getHeader().getJCBCGF()) && cancelVO.getHeader().getJCBCGF() != null) {
					cpfCnpj.setCnpj(cancelVO.getHeader().getJCBCGF());
				}
				
				NfCancServ nCancel = new NfCancServ();				
				nCancel.setCpfCnpj(cpfCnpj);
				nCancel.setCodigoModeloFiscal(new NonNegativeInteger("99"));
				nCancel.setCodPart(cancelVO.getHeader().getJCAN8().toString());
				nCancel.setDmIndEmit(new NonNegativeInteger(cancelVO.getHeader().getJCEV02()));
				nCancel.setDmIndOper(new NonNegativeInteger(cancelVO.getHeader().getJCEV07()));
				nCancel.setNroNf(new NonNegativeInteger(cancelVO.getHeader().getId().getJCBNNF().toString()));
				nCancel.setSerie(String.valueOf(Integer.parseInt(cancelVO.getHeader().getId().getJCBSER())));
				nCancel.setJustif(cancelVO.getHeader().getJCDTA1());
				
				Date dataCancel = new Date();				
				
				dateUtil.getDateFormated(dateUtil.julianToRegular(cancelVO.getHeader().getJCCAND().toString()));				
				
				nCancel.setDtCanc(dataCancel);

				NfCancServ[] cancelArray = new NfCancServ[1];
				cancelArray[0] = nCancel;

				CancelarNfServicoRequest nfCancParam = new CancelarNfServicoRequest(cancelArray, autenticacao);
				NfServicoCancelamentoService_ServiceLocator loc = new NfServicoCancelamentoService_ServiceLocator();
				loc.setNfServicoCancelamentoServiceSOAP_address(cancelamentoURLService);
				
				try {
					NfServicoCancelamentoService_PortType cad = loc.getnfServicoCancelamentoServiceSOAP();
					CancelarNfServicoResponse response = cad.cancelarNfServico(nfCancParam);
					LoteIntWSResponse lote = response.getLoteWSResponse();
					//loteCancelamento = lote.getNumeroProtocoloLote().toString();
					cancelVO.getHeader().setJCUK02(Long.parseLong(lote.getNumeroProtocoloLote().toString()));
					cancelVO.getHeader().setJCEV15("1");
					log.info("++ Cancelamento NFe : Protocolo do lote = " + lote.getNumeroProtocoloLote());

				} catch (ServiceException e) {
					log.error("## Erro Cancelamento NFe: " + e);
					cancelVO.getHeader().setJCEV15("E");
					String sourceStr = caminhosVO.getProcessando() + "\\" + arquivoVo.getNome();
					String destStr = caminhosVO.getErro() + "\\" + arquivoVo.getNome();
					xmlFileControl.moveFile(sourceStr, destStr);
				} catch (RemoteException e) {
					log.error("## Erro Cancelamento NFe: " + e);
					cancelVO.getHeader().setJCEV15("E");
					String sourceStr = caminhosVO.getProcessando() + "\\" + arquivoVo.getNome();
					String destStr = caminhosVO.getErro() + "\\" + arquivoVo.getNome();
					xmlFileControl.moveFile(sourceStr, destStr);
				}

			} else {
				log.info("++ Cancelamento NFe: Nao ha NFe para serem cadastradas ++");
			}
		} else {
			log.info("++ Cancelamento NFe: Nao ha código de autenticação ++");
		}
	}

}
