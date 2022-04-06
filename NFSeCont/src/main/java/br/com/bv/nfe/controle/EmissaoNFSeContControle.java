package br.com.bv.nfe.controle;

import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.xml.rpc.ServiceException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import br.com.bv.nfe.vo.nfServCont.NFSeContVO;
import br.com.bv.vo.EmissaoNFSeContVO;
import br.com.bv.vo.ServicesVO;
import br.com.compliance.nfe.dao.F55IJC70Dao;
import br.com.compliance.nfe.dao.F55IJC71Dao;
import br.com.compliance.nfe.dao.F55IJC72Dao;
import br.com.compliance.nfe.dao.F55IJC74Dao;
import br.com.compliance.nfe.dao.F55IJC7CDao;
import br.com.compliance.nfe.jdbc.JDBCException;
import br.com.compliance.nfe.jde.domain.F55IJC70;
import br.com.compliance.nfe.jde.domain.F55IJC70Id;
import br.com.compliance.nfe.jde.domain.F55IJC74;
import br.com.compliance.nfe.jde.domain.F55IJC7C;
import br.com.compliance.nfe.util.DateUtil;
import br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServCont.NfServCont;
import br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.LoteIntWSResponse;
import br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.MultOrgAuthentication;
import br.com.compliancefiscal.services.integracao.services.v1.nfServicoContinuoService.CadastrarNfServicoRequest;
import br.com.compliancefiscal.services.integracao.services.v1.nfServicoContinuoService.CadastrarNfServicoResponse;
import br.com.compliancefiscal.services.integracao.services.v1.nfServicoContinuoService.NfServicoContinuoService_PortType;
import br.com.compliancefiscal.services.integracao.services.v1.nfServicoContinuoService.NfServicoContinuoService_ServiceLocator;

public class EmissaoNFSeContControle {

	MultOrgAuthentication autenticacao = null;
	EmissaoNFSeContVO emissaoNFSeContVO = null;
	private static final String STATUS_EMISSAO = "1";
	private static final String BLOCO = "A"; /*TODO: verificar com o gilvan qual vai ser o bloco*/
	private static final String[] modeloFiscal = {"06,21,22,28,29"};
	private String loteEnvio;
	private static final Logger log = LogManager.getLogger(EmissaoNFSeContControle.class.getName());
	private List<F55IJC70> listF55IJC70;
	private List<F55IJC7C> listF55IJC7C;
	private ServicesVO servicesVO;
	private F55IJC70Dao f55IJC70Dao = new F55IJC70Dao();
	private F55IJC71Dao f55IJC71Dao = new F55IJC71Dao();
	private F55IJC72Dao f55IJC72Dao = new F55IJC72Dao();
	private F55IJC74Dao f55IJC74Dao = new F55IJC74Dao();
	private F55IJC7CDao f55IJC7CDao = new F55IJC7CDao(); 

	public EmissaoNFSeContControle() {
	}

//	public void inicializaProcesso(ServicesVO services) {
//		try {
//			log.info("## Listando notas ##");
//			listF55IJC70 = f55IJC70Dao.getF55IJC70byStatus(STATUS_EMISSAO);
//			log.info("## Notas listadas: " + listF55IJC70.size() + " ##");
//			servicesVO = services;
//			montaObjetos();
//		} catch (Exception ex) {
//			log.error("## ERRO DE INTEGRACAO: ERRO NA LISTAGEM DE NOTAS - EXCECAO --> " + ex.getMessage());
//			for (StackTraceElement s : ex.getStackTrace()) {
//				log.error(" - METODO: " + s.getFileName() + " - LINHA: " + s.getLineNumber());
//			}
//		}
//	}
	
	public void inicializaProcesso(ServicesVO services) {
		try {
			log.info("## Listando JOBS ##");
			listF55IJC7C = new ArrayList<F55IJC7C>();
			listF55IJC7C = f55IJC7CDao.getF55IJC7CByStatus(STATUS_EMISSAO, BLOCO);	
			if(!listF55IJC7C.isEmpty()){
				log.info("## Jobs listados: " + listF55IJC7C.size() + " ##");
				servicesVO = services;
				montaObjetos();
			}else{
				log.info("## Não há jobs para integração.");
			}
			
			
		} catch (Exception ex) {
			log.error("## ERRO DE INTEGRACAO: ERRO NA LISTAGEM DE NOTAS - EXCECAO --> " + ex.getMessage());
			for (StackTraceElement s : ex.getStackTrace()) {
				log.error(" - METODO: " + s.getFileName() + " - LINHA: " + s.getLineNumber());
			}
		}
	}

	public void montaObjetos() {

		log.info("## Montando Objetos - Percorrendo listagem de notas ##");
		for(F55IJC7C f55IJC7C : listF55IJC7C){
			log.info("## JOB CARREGADO - "+ f55IJC7C.getJCWJOBS() +" ##");
			
			listF55IJC70 = f55IJC70Dao.getF55IJC70byStatus(f55IJC7C.getId(),modeloFiscal);	
			
			try {						
				f55IJC7CDao.atualizaTabelaControle(f55IJC7C.getId(),  false, false);
			} catch (JDBCException e) {
				log.error("## ERRO DE INTEGRACAO: JOB --> " + f55IJC7C.getJCWJOBS() + " EXCECAO --> " + e);
				for (StackTraceElement s : e.getStackTrace()) {
					log.error(" - METODO: " + s.getFileName() + " - LINHA: " + s.getLineNumber());
				}
			} catch (SQLException e) {
				log.error("## ERRO DE INTEGRACAO: JOB --> " + f55IJC7C.getJCWJOBS() + " EXCECAO --> " + e);
				for (StackTraceElement s : e.getStackTrace()) {
					log.error(" - METODO: " + s.getFileName() + " - LINHA: " + s.getLineNumber());
				}
			}
		
			if (!listF55IJC70.isEmpty()) {
				Iterator<F55IJC70> it = listF55IJC70.iterator();
				while (it.hasNext()) {
					try {
						F55IJC70 f = it.next();

						log.info("## Nota ##");
						log.info("+ Numero: " + f.getJCBNNF());
						log.info("+ Serie: " + f.getJCBSER());
						log.info("+ Pre Nota: " + f.getJCN001());
						log.info("+ Tipo: " + f.getJCDCT());

						if (f.getJCBSER().length() == 1) {
							f.setJCBSER(f.getJCBSER() + " ");
						}

						if (f.getJCDCT().length() == 1) {
							f.setJCDCT(f.getJCDCT() + " ");
						}

						emissaoNFSeContVO = new EmissaoNFSeContVO();
						emissaoNFSeContVO.setHeader(f);
						emissaoNFSeContVO.setId(new F55IJC70Id(f.getJCBNNF(), f.getJCBSER(), f.getJCN001(), f.getJCDCT(), f.getJCWJOBS()));
						emissaoNFSeContVO.setDetalheNFSeContList(f55IJC71Dao.listF55IJC71ById(emissaoNFSeContVO.getId()));
						emissaoNFSeContVO.setMenssagemNFSeContList(f55IJC72Dao.listF55IJC72ById(emissaoNFSeContVO.getId()));
						emissaoNFSeContVO.setParticipanteNFSeContList(f55IJC74Dao.listF55IJC74ById(emissaoNFSeContVO.getId()));

						for (F55IJC74 part : emissaoNFSeContVO.getParticipanteNFSeContList()) {
							if (part.getJCIA01() == 1) {
								emissaoNFSeContVO.setCodigoMultOrg(part.getJCAAIL());
								emissaoNFSeContVO.setHashMultOrg(part.getJCDESTIN());
							}
						}

						if (emissaoNFSeContVO.getCodigoMultOrg() != null && !emissaoNFSeContVO.getCodigoMultOrg().isEmpty()) {
							autenticacao = new MultOrgAuthentication(emissaoNFSeContVO.getCodigoMultOrg(),
									emissaoNFSeContVO.getHashMultOrg());
						}
					
						emissaoNFSeCont(servicesVO.getEmissaoNFSeContServiceURL());
						atualizaF55IJC70(loteEnvio);

						it.remove();
					} catch (Exception ex) {
						log.error("## ERRO DE INTEGRACAO: NOTA --> " + emissaoNFSeContVO.getHeader().getJCBNNF()
								+ " EXCECAO --> " + ex);
						for (StackTraceElement s : ex.getStackTrace()) {
							log.error(" - METODO: " + s.getFileName() + " - LINHA: " + s.getLineNumber());

						}

						try {
							f55IJC70Dao.updateF55IJC70Erro(emissaoNFSeContVO.getHeader());
						} catch (Exception e) {
							log.error("## ERRO DE INTEGRACAO: CADASTRO PARTICIPANTE -- NOTA --> "
									+ emissaoNFSeContVO.getHeader().getJCBNNF() + " EXCECAO --> " + e);
							for (StackTraceElement s : e.getStackTrace()) {
								log.error(" - METODO: " + s.getFileName() + " - LINHA: " + s.getLineNumber());

							}
						}
					}

				}
			} else {
				log.info("++ Nao ha notas para envio.");
			}
		
		}
		
		
		log.info("## Fechando o método de montagem de Objetos ##");
	}

	public void atualizaF55IJC70(String numeroLote) {

		if (numeroLote != null) {
			emissaoNFSeContVO.getHeader().setJCDEJ(DateUtil.convertToJulian(new Date()));
			emissaoNFSeContVO.getHeader().setJCUK02(Long.parseLong(numeroLote));
			emissaoNFSeContVO.getHeader().setJCBRNFDE(DateUtil.convertToJulian(new Date()));

			try {
				f55IJC70Dao.updateF55IJC70(emissaoNFSeContVO.getHeader());
			} catch (Exception e) {
				log.error("## ERRO DE INTEGRACAO: CADASTRO PARTICIPANTE -- NOTA --> "
						+ emissaoNFSeContVO.getHeader().getJCBNNF() + " EXCECAO --> " + e);
				for (StackTraceElement s : e.getStackTrace()) {
					log.error(" - METODO: " + s.getFileName() + " - LINHA: " + s.getLineNumber());

				}
			}
		}

	}

	public void emissaoNFSeCont(String emissaoEntradaNFeServiceURL) throws Exception {

		log.info("## Cadastro de NFe ##");

		if (autenticacao != null) {
			if (emissaoNFSeContVO.getHeader() != null) {
				NfServCont nfsecont = NFSeContVO.montaNfe(emissaoNFSeContVO);
				NfServCont[] nfseContArray = new NfServCont[1];
				nfseContArray[0] = nfsecont;

				CadastrarNfServicoRequest nfeParameters = new CadastrarNfServicoRequest(nfseContArray, autenticacao);
				NfServicoContinuoService_ServiceLocator loc = new NfServicoContinuoService_ServiceLocator();
				// loc.setNfMercantilEmissaoPropServiceSOAP_address(emissaoEntradaNFeServiceURL);

				loc.setNfServicoContinuoServiceSOAP_address(emissaoEntradaNFeServiceURL);

				try {
					NfServicoContinuoService_PortType cad = loc.getnfServicoContinuoServiceSOAP();
					CadastrarNfServicoResponse response = cad.cadastrarNfServico(nfeParameters);
					LoteIntWSResponse lote = response.getLoteWSResponse();
					log.info("++ Cadastro NFe : Protocolo do lote = " + lote.getNumeroProtocoloLote());
					loteEnvio = lote.getNumeroProtocoloLote().toString();
				} catch (ServiceException e) {
					// TODO Auto-generated catch block
					log.error("## ERRO DE INTEGRACAO: NOTA --> " + emissaoNFSeContVO.getHeader().getJCBNNF()
							+ " EXCECAO --> " + e);
					for (StackTraceElement s : e.getStackTrace()) {
						log.error(" - METODO: " + s.getFileName() + " - LINHA: " + s.getLineNumber());

					}
				} catch (RemoteException e) {
					log.error("## ERRO DE INTEGRACAO: ENVIO DE NOTA -- NOTA --> "
							+ emissaoNFSeContVO.getHeader().getJCBNNF() + " EXCECAO --> " + e);
					for (StackTraceElement s : e.getStackTrace()) {
						log.error(" - METODO: " + s.getFileName() + " - LINHA: " + s.getLineNumber());

					}
				}
			} else {
				log.info("++ Cadastro NFe: Nao ha NFe para serem cadastradas ++");
			}
		} else {
			log.info("++ Cadastro NFe: Nao ha codigo de autenticação ++");
		}

	}

	
}
