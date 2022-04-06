package br.com.bv.nfe.controle;

import java.rmi.RemoteException;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.xml.rpc.ServiceException;

import org.apache.axis.types.NonNegativeInteger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import br.com.bv.nfe.vo.CancelamentoVO;
import br.com.bv.nfe.vo.ServicesVO;
import br.com.compliance.nfe.dao.F55IJC80Dao;
import br.com.compliance.nfe.dao.F55IJC84Dao;
import br.com.compliance.nfe.jde.domain.F55IJC80;
import br.com.compliance.nfe.jde.domain.F55IJC80Id;
import br.com.compliance.nfe.jde.domain.F55IJC84;
import br.com.compliance.nfe.util.DateUtil;
import br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfCancServ.NfCancServ;
import br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.LoteIntWSResponse;
import br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.MultOrgAuthentication;
import br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.TpCpfCnpj;
import br.com.compliancefiscal.services.integracao.services.v1.nfServicoCancelamentoService.CancelarNfServicoRequest;
import br.com.compliancefiscal.services.integracao.services.v1.nfServicoCancelamentoService.CancelarNfServicoResponse;
import br.com.compliancefiscal.services.integracao.services.v1.nfServicoCancelamentoService.NfServicoCancelamentoService_PortType;
import br.com.compliancefiscal.services.integracao.services.v1.nfServicoCancelamentoService.NfServicoCancelamentoService_ServiceLocator;

public class CancelamentoControle {

	MultOrgAuthentication autenticacao = null;
	private static final String[] STATUS_CANCELAMENTO = {"2","3"};
	CancelamentoVO cancelVO = null;
	DateUtil dateUtil = new DateUtil();
	String loteCancelamento;
	private List<F55IJC80> listF55IJC80;
	private ServicesVO servicesVO;
	private static final Logger log = LogManager.getLogger(CancelamentoControle.class.getName());
	private F55IJC80Dao f55IJC80Dao = new F55IJC80Dao();
	private F55IJC84Dao f55IJC84Dao = new F55IJC84Dao();

	public CancelamentoControle() {
	}

	public void inicializaProcesso(ServicesVO services) {
		try {
			listF55IJC80 = f55IJC80Dao.getF55IJC80byStatus(STATUS_CANCELAMENTO);
			servicesVO = services;
			log.info("## INICIANDO PROCESSO DE CANCELAMENTO ##");
			montaObjetos();
			log.info("## FINALIZANDO PROCESSO DE CANCELAMENTO ##");
		} catch (Exception ex) {
			log.error("## ERRO DE INTEGRACAO: ERRO NA LISTAGEM DE NOTAS - EXCECAO --> " + ex.getStackTrace());
			for (StackTraceElement s : ex.getStackTrace()) {
				log.error(" - METODO: " + s.getFileName() + " - LINHA: " + s.getLineNumber());

			}
		}
	}

	public void montaObjetos() {

		log.info("## Montando Objetos ##");

		if (!listF55IJC80.isEmpty()) {
			Iterator<F55IJC80> it = listF55IJC80.iterator();
			while (it.hasNext()) {

				try {
					F55IJC80 f = it.next();

					log.info("## Nota ##");
					log.info("+ Numero: " + f.getJCBNNF());
					log.info("+ Serie: " + f.getJCBSER());
					log.info("+ Pre Nota: " + f.getJCN001());
					log.info("+ Tipo: " + f.getJCDCT());

					cancelVO = new CancelamentoVO();
					cancelVO.setHeader(f);
					cancelVO.setId(new F55IJC80Id(f.getJCBNNF(), f.getJCBSER(), f.getJCN001(), f.getJCDCT()));

					List<F55IJC84> listPart = f55IJC84Dao.listF55IJC84ById(cancelVO.getId());

					for (F55IJC84 part : listPart) {
						if (part.getJCIA01() == 5) {
							cancelVO.setCodigoMultOrg(part.getJCAAIL());
							cancelVO.setHashMultOrg(part.getJCDESTIN());
						}
					}

					if (cancelVO.getCodigoMultOrg() != null && !cancelVO.getCodigoMultOrg().isEmpty()) {
						autenticacao = new MultOrgAuthentication(cancelVO.getCodigoMultOrg(), cancelVO.getHashMultOrg());
					}

					cadastrarCancelamento(servicesVO.getCancelamentoServiceURL());
					atualizaF55IJC80(loteCancelamento);
				} catch (Exception ex) {
					log.error("## ERRO DE INTEGRACAO: NOTA --> " + cancelVO.getHeader().getJCBNNF() + " - EXCECAO --> " + ex);
					for (StackTraceElement s : ex.getStackTrace()) {
						log.error(" - METODO: " + s.getFileName() + " - LINHA: " + s.getLineNumber());

					}
					try {
						f55IJC80Dao.updateF55IJC80Erro(cancelVO.getHeader());
					} catch (Exception e) {
						log.error("## Erro Cancelamento NFe: " + e);
					}
				}
			}
		} else {
			log.info("++ Nao ha notas para cancelamento.");
		}

		log.info("## Fechando o mótodo de montagem de Objetos ##");

	}

	public void atualizaF55IJC80(String numeroLote) {

		if (numeroLote != null) {
			cancelVO.getHeader().setJCDEJ(DateUtil.convertToJulian(new Date()));
			cancelVO.getHeader().setJCUK02(Long.parseLong(numeroLote));
			cancelVO.getHeader().setJCBRNFDE(DateUtil.convertToJulian(new Date()));

			try {
				f55IJC80Dao.updateF55IJC80(cancelVO.getHeader());
			} catch (Exception e) {
				log.error("## Erro Cancelamento NFe: " + e);
			}
		}

	}

	public void cadastrarCancelamento(String cancelamentoURLService) throws Exception {

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
				nCancel.setNroNf(new NonNegativeInteger(cancelVO.getHeader().getJCBNNF().toString()));
				nCancel.setSerie(String.valueOf(Integer.parseInt(cancelVO.getHeader().getJCBSER())));
				nCancel.setJustif(cancelVO.getHeader().getJCDTA1());
				
				Date dataCancel = new Date();				
				
				dateUtil.getDateFormated(dateUtil.julianToRegular(cancelVO.getHeader().getJCCAND().toString()));				
				
				nCancel.setDtCanc(dataCancel);

				NfCancServ[] cancelArray = new NfCancServ[1];
				cancelArray[0] = nCancel;

				CancelarNfServicoRequest nfCancParam = new CancelarNfServicoRequest(cancelArray, autenticacao);
				NfServicoCancelamentoService_ServiceLocator loc = new NfServicoCancelamentoService_ServiceLocator();
				loc.setNfServicoCancelamentoServiceSOAP_address(cancelamentoURLService);
				loteCancelamento = "";		
				
				try {
					NfServicoCancelamentoService_PortType cad = loc.getnfServicoCancelamentoServiceSOAP();
					CancelarNfServicoResponse response = cad.cancelarNfServico(nfCancParam);
					LoteIntWSResponse lote = response.getLoteWSResponse();
					loteCancelamento = lote.getNumeroProtocoloLote().toString();
					log.info("++ Cancelamento NFe : Protocolo do lote = " + lote.getNumeroProtocoloLote());
				} catch (ServiceException e) {
					log.error("## Erro Cancelamento NFe: " + e);
					e.printStackTrace();
				} catch (RemoteException e) {
					log.error("## Erro Cancelamento NFe: " + e);
					e.printStackTrace();
				}

			} else {
				log.info("++ Cancelamento NFe: Nao ha NFe para serem cadastradas ++");
			}
		} else {
			log.info("++ Cancelamento NFe: Nao ha código de autenticação ++");
		}
	}

}
