package br.com.bv.nfe.controle;

import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.xml.rpc.ServiceException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import br.com.bv.nfe.vo.Item.ItemVO;
import br.com.bv.nfe.vo.naturezaOperacao.NaturezaOperacaoVO;
import br.com.bv.nfe.vo.nfEFD.NfServicoEFDVO;
import br.com.bv.nfe.vo.nfMercantil.NfMercantilTerceirosVO;
import br.com.bv.nfe.vo.nfMercantil.participante.ParticipanteVO;
import br.com.bv.nfe.vo.nfServCont.NFSeContVO;
import br.com.bv.nfe.vo.unidade.UnidadeVO;
import br.com.bv.vo.EmissaoVO;
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
import br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.item.Item;
import br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.naturezaOperacao.NaturezaOperacao;
import br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.NfSe;
import br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServCont.NfServCont;
import br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServicos.NfServicos;
import br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.participante.Participante;
import br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.unidade.Unidade;
import br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.LoteIntWSResponse;
import br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.MultOrgAuthentication;
import br.com.compliancefiscal.services.integracao.services.v1.itemService.CadastrarItemRequest;
import br.com.compliancefiscal.services.integracao.services.v1.itemService.CadastrarItemResponse;
import br.com.compliancefiscal.services.integracao.services.v1.itemService.ItemService_PortType;
import br.com.compliancefiscal.services.integracao.services.v1.itemService.ItemService_ServiceLocator;
import br.com.compliancefiscal.services.integracao.services.v1.natOpService.CadastrarNaturezaOpRequest;
import br.com.compliancefiscal.services.integracao.services.v1.natOpService.CadastrarNaturezaOpResponse;
import br.com.compliancefiscal.services.integracao.services.v1.natOpService.NaturezaOperacaoService_PortType;
import br.com.compliancefiscal.services.integracao.services.v1.natOpService.NaturezaOperacaoService_ServiceLocator;
import br.com.compliancefiscal.services.integracao.services.v1.nfMercantilService.CadastrarNfMercantilRequest;
import br.com.compliancefiscal.services.integracao.services.v1.nfMercantilService.CadastrarNfMercantilResponse;
import br.com.compliancefiscal.services.integracao.services.v1.nfMercantilService.NfMercantilService_PortType;
import br.com.compliancefiscal.services.integracao.services.v1.nfMercantilService.NfMercantilService_ServiceLocator;
import br.com.compliancefiscal.services.integracao.services.v1.nfServicoContinuoService.CadastrarNfServicoRequest;
import br.com.compliancefiscal.services.integracao.services.v1.nfServicoContinuoService.CadastrarNfServicoResponse;
import br.com.compliancefiscal.services.integracao.services.v1.nfServicoContinuoService.NfServicoContinuoService_PortType;
import br.com.compliancefiscal.services.integracao.services.v1.nfServicoContinuoService.NfServicoContinuoService_ServiceLocator;
import br.com.compliancefiscal.services.integracao.services.v1.nfServicoService.CadastroNotaServicoRequest;
import br.com.compliancefiscal.services.integracao.services.v1.nfServicoService.CadastroNotaServicoResponse;
import br.com.compliancefiscal.services.integracao.services.v1.nfServicoService.NfServicoService_PortType;
import br.com.compliancefiscal.services.integracao.services.v1.nfServicoService.NfServicoService_ServiceLocator;
import br.com.compliancefiscal.services.integracao.services.v1.participanteService.CadastrarParticipanteRequest;
import br.com.compliancefiscal.services.integracao.services.v1.participanteService.CadastrarParticipanteResponse;
import br.com.compliancefiscal.services.integracao.services.v1.participanteService.ParticipanteService_PortType;
import br.com.compliancefiscal.services.integracao.services.v1.participanteService.ParticipanteService_ServiceLocator;
import br.com.compliancefiscal.services.integracao.services.v1.unidadeService.CadastrarUnidadeRequest;
import br.com.compliancefiscal.services.integracao.services.v1.unidadeService.CadastrarUnidadeResponse;
import br.com.compliancefiscal.services.integracao.services.v1.unidadeService.UnidadeService_PortType;
import br.com.compliancefiscal.services.integracao.services.v1.unidadeService.UnidadeService_ServiceLocator;

public class EmissaoEntradaControle {

	MultOrgAuthentication autenticacao = null;	
	EmissaoVO emissaoVO = null;	
	private static final String STATUS_EMISSAO = "3";
	//private static final String BLOCO = "C";
	private static final String[] modeloFiscalNFMercantil = {"55"};
	private static final String[] modeloFiscalEFD = {"99"};	
	private static final String[] modeloFiscalServContinuo = {"06","21","22","28","29"};
	private static final String mercantil = "MERCANTIL";
	private static final String efd = "EFD";
	private static final String continuo = "CONTINUO";
	private String loteEnvio;
	private static final Logger log = LogManager.getLogger(EmissaoEntradaControle.class.getName());
	private List<F55IJC70> listF55IJC70;
	private List<F55IJC7C> listF55IJC7CNFMercantil;
	private List<F55IJC7C> listF55IJC7CEFD;
	private List<F55IJC7C> listF55IJC7CServContinuo;
	private F55IJC7CDao f55IJC7CDao = new F55IJC7CDao();
	private ServicesVO servicesVO;
	private F55IJC70Dao f55IJC70Dao = new F55IJC70Dao();
	private F55IJC71Dao f55IJC71Dao = new F55IJC71Dao();
	private F55IJC72Dao f55IJC72Dao = new F55IJC72Dao();
	private F55IJC74Dao f55IJC74Dao = new F55IJC74Dao();

	public EmissaoEntradaControle() {
	}

	public void inicializaProcesso(ServicesVO services) {
		try {
			log.info("## LISTANDO JOBS ##");
						
			/*TODO: Listagem jobs nf mercantil */
			
			listF55IJC7CNFMercantil = new ArrayList<F55IJC7C>();
			listF55IJC7CNFMercantil = f55IJC7CDao.getF55IJC7CByStatus(STATUS_EMISSAO, mercantil);	
			if(!listF55IJC7CNFMercantil.isEmpty()){
				log.info("## Mercantil - Jobs listados: " + listF55IJC7CNFMercantil.toString() + " ##");
				servicesVO = services;
				montaObjetosNFMercantil();
			}else{
				log.info("## Mercantil - Nao ha jobs para integracao.");
			}	
			
			/*TODO: Listagem jobs EFD */
			
			listF55IJC7CEFD = new ArrayList<F55IJC7C>();
			listF55IJC7CEFD = f55IJC7CDao.getF55IJC7CByStatus(STATUS_EMISSAO, efd);	
			if(!listF55IJC7CEFD.isEmpty()){
				log.info("## EFD - Jobs listados: " + listF55IJC7CEFD.toString() + " ##");
				servicesVO = services;
				montaObjetosEFD();
			}else{
				log.info("## EFD - Nao ha jobs para integracao.");
			}			
			
			/*TODO: Listagem jobs nf servicos continuos */
			
			listF55IJC7CServContinuo = new ArrayList<F55IJC7C>();
			listF55IJC7CServContinuo = f55IJC7CDao.getF55IJC7CByStatus(STATUS_EMISSAO, continuo);/*TODO: verificar com o gilvan qual vai ser o bloco*/	
			if(!listF55IJC7CServContinuo.isEmpty()){
				log.info("## Continuo - Jobs listados: " + listF55IJC7CServContinuo.toString() + " ##");
				servicesVO = services;
				montaObjetosNFServContinuos();
			}else{
				log.info("## Continuo - Nao ha jobs para integracao.");
			}
			
		} catch (Exception ex) {		
			log.error("## ERRO DE INTEGRACAO: ERRO NA LISTAGEM DE NOTAS - EXCECAO --> " + ex.getMessage());
			for (StackTraceElement s : ex.getStackTrace()) {
				log.error(" - METODO: " + s.getFileName() + " - LINHA: " + s.getLineNumber());
			}
		}
	}
	
	public void montaObjetosNFMercantil() {

		log.info("## Mercantil - Montando Objetos - Percorrendo listagem de notas Mercantil ##");
		listF55IJC70 = new ArrayList<F55IJC70>();
		for(F55IJC7C f55IJC7C : listF55IJC7CNFMercantil){
			
			log.info("## Mercantil - JOB CARREGADO - "+ f55IJC7C.getJCWJOBS() +" ##");
			
			listF55IJC70 = f55IJC70Dao.getF55IJC70byStatus(f55IJC7C.getId(), modeloFiscalNFMercantil);
			
			if (!listF55IJC70.isEmpty()) {
				log.info("## Mercantil - Notas Listadas - "+ listF55IJC70.toString() + " ##");
				Iterator<F55IJC70> it = listF55IJC70.iterator();
				while (it.hasNext()) {
					try {
						F55IJC70 f = it.next();

						log.info("## Mercantil - Nota ##");
						log.info("+ Mercantil - Numero: " + f.getJCBNNF());
						log.info("+ Mercantil - Serie: " + f.getJCBSER());
						log.info("+ Mercantil - Pre Nota: " + f.getJCN001());
						log.info("+ Mercantil - Tipo: " + f.getJCDCT());

						if (f.getJCBSER().length() == 1) {
							f.setJCBSER(f.getJCBSER() + " ");
						}

						if (f.getJCDCT().length() == 1) {
							f.setJCDCT(f.getJCDCT() + " ");
						}

						emissaoVO = new EmissaoVO();
						emissaoVO.setHeader(f);
						emissaoVO.setId(new F55IJC70Id(f.getJCBNNF(), f.getJCBSER(), f.getJCN001(), f.getJCDCT(), f.getJCWJOBS()));
						emissaoVO.setDetalheNFeList(f55IJC71Dao.listF55IJC71ById(emissaoVO.getId()));
						emissaoVO.setMenssagemNFeList(f55IJC72Dao.listF55IJC72ById(emissaoVO.getId()));
						emissaoVO.setParticipanteNFeList(f55IJC74Dao.listF55IJC74ById(emissaoVO.getId()));

						for (F55IJC74 part : emissaoVO.getParticipanteNFeList()) {
							if (part.getJCIA01() == 1) {
								emissaoVO.setCodigoMultOrg(part.getJCAAIL());
								emissaoVO.setHashMultOrg(part.getJCDESTIN());
							}
						}

						if (emissaoVO.getCodigoMultOrg() != null && !emissaoVO.getCodigoMultOrg().isEmpty()) {
							autenticacao = new MultOrgAuthentication(emissaoVO.getCodigoMultOrg(),
									emissaoVO.getHashMultOrg());
						} else {
							autenticacao = new MultOrgAuthentication(f55IJC7C.getJCAAIL().trim(),
									f55IJC7C.getJCDESTIN().trim());
						}

						cadastraItem(servicesVO.getItemServiceURL());
						cadastraParticipante(servicesVO.getParticipanteServiceURL(), mercantil);
						cadastrarNaturezaOperacao(servicesVO.getNatOpServiceURL());
						//cadastrarUnidade(servicesVO.getUnidadeServiceURL());

						envioEntradaNFeMercantil(servicesVO.getEmissaoEntradaServiceURL());
						atualizaF55IJC70(loteEnvio, mercantil);

						it.remove();
					} catch (Exception ex) {
						log.error("## Mercantil - ERRO DE INTEGRACAO: NOTA --> " + emissaoVO.getHeader().getJCBNNF()
								+ " EXCECAO --> " + ex);
						for (StackTraceElement s : ex.getStackTrace()) {
							log.error(" - METODO: " + s.getFileName() + " - LINHA: " + s.getLineNumber());

						}

						try {
							f55IJC70Dao.updateF55IJC70Erro(emissaoVO.getHeader());
							/*mudar status da nota pra 614 e jogar registro da 80 pra F no EV15*/
						} catch (Exception e) {
							log.error("## Mercantil - ERRO DE INTEGRACAO: CADASTRO PARTICIPANTE -- NOTA --> "
									+ emissaoVO.getHeader().getJCBNNF() + " EXCECAO --> " + e);
							for (StackTraceElement s : e.getStackTrace()) {
								log.error(" - METODO: " + s.getFileName() + " - LINHA: " + s.getLineNumber());

							}
						}
					}
				}
				
				
				
			} else {
				log.info("++ Mercantil - Nao ha notas para envio.");
			}
			
		}
		
		
		log.info("## Mercantil - Fechando o metodo de montagem de Objetos ##");
	}
	
	private void montaObjetosEFD() {
		// TODO Auto-generated method stub
		
		log.info("## EFD - Montando Objetos - Percorrendo listagem de notas EFD ##");
		listF55IJC70 = new ArrayList<F55IJC70>();
		for(F55IJC7C f55IJC7C : listF55IJC7CEFD){
			
			log.info("## EFD - JOB CARREGADO - "+ f55IJC7C.getJCWJOBS() +" ##");
			
			listF55IJC70 = f55IJC70Dao.getF55IJC70byStatus(f55IJC7C.getId(), modeloFiscalEFD);
			
			if (!listF55IJC70.isEmpty()) {
				log.info("## EFD - Notas Listadas - "+ listF55IJC70.toString() + " ##");
				Iterator<F55IJC70> it = listF55IJC70.iterator();
				while (it.hasNext()) {
					try {
						F55IJC70 f = it.next();

						log.info("## EFD - Nota ##");
						log.info("+ EFD - Numero: " + f.getJCBNNF());
						log.info("+ EFD - Serie: " + f.getJCBSER());
						log.info("+ EFD - Pre Nota: " + f.getJCN001());
						log.info("+ EFD - Tipo: " + f.getJCDCT());

						if (f.getJCBSER().length() == 1) {
							f.setJCBSER(f.getJCBSER() + " ");
						}

						if (f.getJCDCT().length() == 1) {
							f.setJCDCT(f.getJCDCT() + " ");
						}

						emissaoVO = new EmissaoVO();
						emissaoVO.setHeader(f);
						emissaoVO.setId(new F55IJC70Id(f.getJCBNNF(), f.getJCBSER(), f.getJCN001(), f.getJCDCT(), f.getJCWJOBS()));
						emissaoVO.setDetalheNFeList(f55IJC71Dao.listF55IJC71ById(emissaoVO.getId()));
						emissaoVO.setMenssagemNFeList(f55IJC72Dao.listF55IJC72ById(emissaoVO.getId()));
						emissaoVO.setParticipanteNFeList(f55IJC74Dao.listF55IJC74ById(emissaoVO.getId()));

						for (F55IJC74 part : emissaoVO.getParticipanteNFeList()) {
							if (part.getJCIA01() == 1) {
								emissaoVO.setCodigoMultOrg(part.getJCAAIL());
								emissaoVO.setHashMultOrg(part.getJCDESTIN());
							}
						}

						if (emissaoVO.getCodigoMultOrg() != null && !emissaoVO.getCodigoMultOrg().isEmpty()) {
							autenticacao = new MultOrgAuthentication(emissaoVO.getCodigoMultOrg(),
									emissaoVO.getHashMultOrg());
						}
						
						cadastraItem(servicesVO.getItemServiceURL());
						cadastraParticipante(servicesVO.getParticipanteServiceURL(), efd);
						//cadastrarNaturezaOperacao(servicesVO.getNatOpServiceURL());
						//cadastrarUnidade(servicesVO.getUnidadeServiceURL());						
						
						envioNFEFD(servicesVO.getEmissaoEFDURL());
						
						atualizaF55IJC70(loteEnvio, efd);					

						it.remove();
					} catch (Exception ex) {
						log.error("## EFD - ERRO DE INTEGRACAO: NOTA --> " + emissaoVO.getHeader().getJCBNNF()
								+ " EXCECAO --> " + ex);
						for (StackTraceElement s : ex.getStackTrace()) {
							log.error(" - METODO: " + s.getFileName() + " - LINHA: " + s.getLineNumber());

						}

						try {
							f55IJC70Dao.updateF55IJC70Erro(emissaoVO.getHeader());
							/*mudar status da nota pra 614 e jogar registro da 80 pra F no EV15*/
						} catch (Exception e) {
							log.error("## EFD - ERRO DE INTEGRACAO: CADASTRO PARTICIPANTE -- NOTA --> "
									+ emissaoVO.getHeader().getJCBNNF() + " EXCECAO --> " + e);
							for (StackTraceElement s : e.getStackTrace()) {
								log.error(" - METODO: " + s.getFileName() + " - LINHA: " + s.getLineNumber());

							}
						}
					}
				}
				
				
			} else {
				log.info("++ EFD - Nao ha notas para envio.");
			}
			
		}
		
		log.info("## EFD - Fechando o método de montagem de Objetos ##");
		
	}	

	private void montaObjetosNFServContinuos() {
		// TODO Auto-generated method stub
		
		log.info("## Continuo - Montando Objetos - Percorrendo listagem de notas Servico Continuo ##");
		listF55IJC70 = new ArrayList<F55IJC70>();
		for(F55IJC7C f55IJC7C : listF55IJC7CServContinuo){
			log.info("## Continuo - JOB CARREGADO - "+ f55IJC7C.getJCWJOBS() +" ##");
			
			try {
				f55IJC7CDao.atualizaTabelaControle(f55IJC7C.getId(), false, false);
			} catch (JDBCException e) {
				log.error("## Continuo - ERRO DE INTEGRACAO: JOB --> " + f55IJC7C.getJCWJOBS() + " EXCECAO --> " + e);
				for (StackTraceElement s : e.getStackTrace()) {
					log.error(" - METODO: " + s.getFileName() + " - LINHA: " + s.getLineNumber());
				}
			} catch (SQLException e) {
				log.error("## Continuo - ERRO DE INTEGRACAO: JOB --> " + f55IJC7C.getJCWJOBS() + " EXCECAO --> " + e);
				for (StackTraceElement s : e.getStackTrace()) {
					log.error(" - METODO: " + s.getFileName() + " - LINHA: " + s.getLineNumber());
				}
			}
			
			listF55IJC70 = f55IJC70Dao.getF55IJC70byStatus(f55IJC7C.getId(),modeloFiscalServContinuo);			
		
			if (!listF55IJC70.isEmpty()) {
				log.info("## Continuo - Notas Listadas - "+ listF55IJC70.toString() + " ##");
				Iterator<F55IJC70> it = listF55IJC70.iterator();
				while (it.hasNext()) {
					try {
						F55IJC70 f = it.next();

						log.info("## Continuo - Nota ##");
						log.info("+ Continuo - Numero: " + f.getJCBNNF());
						log.info("+ Continuo - Serie: " + f.getJCBSER());
						log.info("+ Continuo - Pre Nota: " + f.getJCN001());
						log.info("+ Continuo - Tipo: " + f.getJCDCT());

						if (f.getJCBSER().length() == 1) {
							f.setJCBSER(f.getJCBSER() + " ");
						}

						if (f.getJCDCT().length() == 1) {
							f.setJCDCT(f.getJCDCT() + " ");
						}

						emissaoVO = new EmissaoVO();
						emissaoVO.setHeader(f);
						emissaoVO.setId(new F55IJC70Id(f.getJCBNNF(), f.getJCBSER(), f.getJCN001(), f.getJCDCT(), f.getJCWJOBS()));
						emissaoVO.setDetalheNFeList(f55IJC71Dao.listF55IJC71ById(emissaoVO.getId()));
						emissaoVO.setMenssagemNFeList(f55IJC72Dao.listF55IJC72ById(emissaoVO.getId()));
						emissaoVO.setParticipanteNFeList(f55IJC74Dao.listF55IJC74ById(emissaoVO.getId()));

						for (F55IJC74 part : emissaoVO.getParticipanteNFeList()) {
							if (part.getJCIA01() == 1) {
								emissaoVO.setCodigoMultOrg(part.getJCAAIL());
								emissaoVO.setHashMultOrg(part.getJCDESTIN());
							}
						}

						if (emissaoVO.getCodigoMultOrg() != null && !emissaoVO.getCodigoMultOrg().isEmpty()) {
							autenticacao = new MultOrgAuthentication(emissaoVO.getCodigoMultOrg(),
									emissaoVO.getHashMultOrg());
						}
						
						cadastraParticipante(servicesVO.getParticipanteServiceURL(), continuo);
						envioNFSeCont(servicesVO.getEmissaoNFSeContServiceURL());
						atualizaF55IJC70(loteEnvio, continuo);

						it.remove();
					} catch (Exception ex) {
						log.error("## Continuo - ERRO DE INTEGRACAO: NOTA --> " + emissaoVO.getHeader().getJCBNNF()
								+ " EXCECAO --> " + ex);
						for (StackTraceElement s : ex.getStackTrace()) {
							log.error(" - METODO: " + s.getFileName() + " - LINHA: " + s.getLineNumber());

						}

						try {
							f55IJC70Dao.updateF55IJC70Erro(emissaoVO.getHeader());
							/*mudar status da nota pra 614 e jogar registro da 80 pra F no EV15*/
						} catch (Exception e) {
							log.error("## Continuo - ERRO DE INTEGRACAO: CADASTRO PARTICIPANTE -- NOTA --> "
									+ emissaoVO.getHeader().getJCBNNF() + " EXCECAO --> " + e);
							for (StackTraceElement s : e.getStackTrace()) {
								log.error(" - METODO: " + s.getFileName() + " - LINHA: " + s.getLineNumber());

							}
						}
					}

				}
			} else {
				log.info("++ Continuo - Nao ha notas para envio.");
			}
		
		}
		
		
		log.info("## Continuo - Fechando o método de montagem de Objetos ##");
		
	}

	public void atualizaF55IJC70(String numeroLote, String tipo) {

		if (numeroLote != null) {			
			try {				
				emissaoVO.getHeader().setJCDEJ(DateUtil.convertToJulian(new Date()));
				emissaoVO.getHeader().setJCUK02(Long.parseLong(numeroLote));
				emissaoVO.getHeader().setJCBRNFDE(DateUtil.convertToJulian(new Date()));
				f55IJC70Dao.updateF55IJC70(emissaoVO.getHeader());				
			} catch (Exception e) {
				log.error("## ERRO DE INTEGRACAO: CADASTRO PARTICIPANTE -- NOTA --> "
						+ emissaoVO.getHeader().getJCBNNF() + " EXCECAO --> " + e);
				for (StackTraceElement s : e.getStackTrace()) {
					log.error(" - METODO: " + s.getFileName() + " - LINHA: " + s.getLineNumber());

				}
			}
		}

	}

	public void envioEntradaNFeMercantil(String emissaoEntradaNFeServiceURL) throws Exception {

		log.info("## Mercantil - Cadastro de NFe ##");

		if (autenticacao != null) {
			if (emissaoVO.getHeader() != null) {
				NfSe nfe = NfMercantilTerceirosVO.montaNfe(emissaoVO);
				NfSe[] nfeArray = new NfSe[1];
				nfeArray[0] = nfe;

				CadastrarNfMercantilRequest nfeParameters = new CadastrarNfMercantilRequest(nfeArray, autenticacao);
				NfMercantilService_ServiceLocator loc = new NfMercantilService_ServiceLocator();
				// loc.setNfMercantilEmissaoPropServiceSOAP_address(emissaoEntradaNFeServiceURL);

				loc.setNfMercantilServiceSOAP_address(emissaoEntradaNFeServiceURL);
				loteEnvio = "";
				try {
					NfMercantilService_PortType cad = loc.getnfMercantilServiceSOAP();
					CadastrarNfMercantilResponse response = cad.cadastrarNfMercantil(nfeParameters);
					LoteIntWSResponse lote = response.getLoteWSResponse();
					
					log.info("++ Mercantil - Cadastro NFe : Protocolo do lote = " + lote.getNumeroProtocoloLote());
					loteEnvio = lote.getNumeroProtocoloLote().toString();
				} catch (ServiceException e) {
					log.error("## Mercantil - ERRO DE INTEGRACAO: NOTA --> " + emissaoVO.getHeader().getJCBNNF()
							+ " EXCECAO --> " + e);
					for (StackTraceElement s : e.getStackTrace()) {
						log.error(" - METODO: " + s.getFileName() + " - LINHA: " + s.getLineNumber());

					}
				} catch (RemoteException e) {
					log.error("## Mercantil - ERRO DE INTEGRACAO: ENVIO DE NOTA -- NOTA --> "
							+ emissaoVO.getHeader().getJCBNNF() + " EXCECAO --> " + e);
					for (StackTraceElement s : e.getStackTrace()) {
						log.error(" - METODO: " + s.getFileName() + " - LINHA: " + s.getLineNumber());

					}
				}
			} else {
				log.info("++ Mercantil - Cadastro NFe: Nao ha NFe para serem cadastradas ++");
			}
		} else {
			log.info("++ Mercantil - Cadastro NFe: Nao ha codigo de autenticacao ++");
		}

	}
	
	private void envioNFEFD(String emissaoEFDURL)  throws Exception {
		// TODO Auto-generated method stub
		
		log.info("## EFD - Cadastro de NFe ##");

		if (autenticacao != null) {
			if (emissaoVO.getHeader() != null) {
				NfServicos nfe = NfServicoEFDVO.montaNfe(emissaoVO);
				NfServicos[] nfeArray = new NfServicos[1];
				nfeArray[0] = nfe;

				CadastroNotaServicoRequest nfeParameters = new CadastroNotaServicoRequest(nfeArray, autenticacao);
				NfServicoService_ServiceLocator loc = new NfServicoService_ServiceLocator();
				// loc.setNfMercantilEmissaoPropServiceSOAP_address(emissaoEntradaNFeServiceURL);				

				loc.setNfServicoServiceSOAP_address(emissaoEFDURL);
				loteEnvio = "";
				try {
					NfServicoService_PortType cad = loc.getnfServicoServiceSOAP();
					CadastroNotaServicoResponse response = cad.cadastroNotaServico(nfeParameters);
					LoteIntWSResponse lote = response.getLoteWSResponse();
					log.info("++ EFD - Cadastro NFe : Protocolo do lote = " + lote.getNumeroProtocoloLote());
					loteEnvio = lote.getNumeroProtocoloLote().toString();
				} catch (ServiceException e) {
					// TODO Auto-generated catch block
					log.error("## EFD - ERRO DE INTEGRACAO: NOTA --> " + emissaoVO.getHeader().getJCBNNF()
							+ " EXCECAO --> " + e);
					for (StackTraceElement s : e.getStackTrace()) {
						log.error(" - METODO: " + s.getFileName() + " - LINHA: " + s.getLineNumber());

					}
				} catch (RemoteException e) {
					log.error("## EFD - ERRO DE INTEGRACAO: ENVIO DE NOTA -- NOTA --> "
							+ emissaoVO.getHeader().getJCBNNF() + " EXCECAO --> " + e);
					for (StackTraceElement s : e.getStackTrace()) {
						log.error(" - METODO: " + s.getFileName() + " - LINHA: " + s.getLineNumber());

					}
				}
			} else {
				log.info("++ EFD - Cadastro NFe: Nao ha NFe para serem cadastradas ++");
			}
		} else {
			log.info("++ EFD - Cadastro NFe: Nao ha codigo de autenticação ++");
		}
		
	}
	
	private void envioNFSeCont(String emissaoNFSeContServiceURL) throws Exception {
		// TODO Auto-generated method stub
		log.info("## Continuo - Cadastro de NFe ##");
		
		if (autenticacao != null) {
			if (emissaoVO.getHeader() != null) {
				NfServCont nfsecont = NFSeContVO.montaNfe(emissaoVO);
				NfServCont[] nfseContArray = new NfServCont[1];
				nfseContArray[0] = nfsecont;

				CadastrarNfServicoRequest nfeParameters = new CadastrarNfServicoRequest(nfseContArray, autenticacao);
				NfServicoContinuoService_ServiceLocator loc = new NfServicoContinuoService_ServiceLocator();
				// loc.setNfMercantilEmissaoPropServiceSOAP_address(emissaoEntradaNFeServiceURL);

				loc.setNfServicoContinuoServiceSOAP_address(emissaoNFSeContServiceURL);

				try {
					NfServicoContinuoService_PortType cad = loc.getnfServicoContinuoServiceSOAP();
					CadastrarNfServicoResponse response = cad.cadastrarNfServico(nfeParameters);
					LoteIntWSResponse lote = response.getLoteWSResponse();
					log.info("++ Continuo - Cadastro NFe : Protocolo do lote = " + lote.getNumeroProtocoloLote());
					loteEnvio = lote.getNumeroProtocoloLote().toString();
				} catch (ServiceException e) {
					// TODO Auto-generated catch block
					log.error("## Continuo - ERRO DE INTEGRACAO: NOTA --> " + emissaoVO.getHeader().getJCBNNF()
							+ " EXCECAO --> " + e);
					for (StackTraceElement s : e.getStackTrace()) {
						log.error(" - METODO: " + s.getFileName() + " - LINHA: " + s.getLineNumber());

					}
				} catch (RemoteException e) {
					log.error("## Continuo - ERRO DE INTEGRACAO: ENVIO DE NOTA -- NOTA --> "
							+ emissaoVO.getHeader().getJCBNNF() + " EXCECAO --> " + e);
					for (StackTraceElement s : e.getStackTrace()) {
						log.error(" - METODO: " + s.getFileName() + " - LINHA: " + s.getLineNumber());

					}
				}
			} else {
				log.info("++ Continuo - Cadastro NFe: Nao ha NFe para serem cadastradas ++");
			}
		} else {
			log.info("++ Continuo - Cadastro NFe: Nao ha codigo de autenticação ++");
		}
	}
	

	
	public void cadastraParticipante(String participanteServiceURL, String tipo) throws Exception {

		log.info("## "+ tipo +" - Cadastro de Participante ##");	
		
		if (autenticacao != null) {
			/*
			List<?> pList = null;

			if(mercantil.equalsIgnoreCase(tipo)) {
				pList = new ArrayList<Participante>();
				pList = (List<Participante>)ParticipanteVO.montaParticipantes(emissaoVO);
			}else if(efd.equalsIgnoreCase(tipo)) {
				pList = new ArrayList<TpParticipante>();
				pList = (List<TpParticipante>)TpParticipanteVO.montaParticipantes(emissaoVO);
			}else if(continuo.equalsIgnoreCase(tipo)) {
				pList = new ArrayList<Participante>();
				pList = (List<TpParticipante>)TpParticipanteContinuoVO.montaParticipantes(emissaoVO);
			}*/
			List<Participante> pList = new ArrayList<Participante>();
			pList = (List<Participante>)ParticipanteVO.montaParticipantes(emissaoVO);
			if (!pList.isEmpty()) {				
				Participante[] pArray = Arrays.copyOf(pList.toArray(), pList.toArray().length, Participante[].class);
				ParticipanteService_ServiceLocator loc = new ParticipanteService_ServiceLocator();
				loc.setParticipanteServiceSOAP_address(participanteServiceURL);
				CadastrarParticipanteRequest parameters = new CadastrarParticipanteRequest(pArray, autenticacao);
				try {
					ParticipanteService_PortType cad = loc.getparticipanteServiceSOAP();
					CadastrarParticipanteResponse response = cad.cadastrarParticipante(parameters);
					LoteIntWSResponse lote = response.getLoteWsResponse();
					log.info("++ "+ tipo +" - Cadastro Participante : Protocolo do lote = " + lote.getNumeroProtocoloLote());
				} catch (ServiceException e) {
					log.error("## "+ tipo +" - ERRO DE INTEGRACAO: CADASTRO PARTICIPANTE -- NOTA --> "
							+ emissaoVO.getHeader().getJCBNNF() + " EXCECAO --> " + e);
					for (StackTraceElement s : e.getStackTrace()) {
						log.error(" - METODO: " + s.getFileName() + " - LINHA: " + s.getLineNumber());

					}
				} catch (RemoteException e) {
					log.error("## "+ tipo +" - ERRO DE INTEGRACAO: CADASTRO PARTICIPANTE -- NOTA --> "
							+ emissaoVO.getHeader().getJCBNNF() + " EXCECAO --> " + e);
					for (StackTraceElement s : e.getStackTrace()) {
						log.error(" - METODO: " + s.getFileName() + " - LINHA: " + s.getLineNumber());

					}
				}
			} else {
				log.info("++ "+ tipo +" - Cadastro Participante: Nao ha Participante para serem cadastrados ++");
			}
		} else {
			log.info("++ "+ tipo +" - Cadastro Participante: Nao ha codigo de autenticacao ++");
		}

	}

	public void cadastraItem(String itemServiceURL) throws Exception {

		log.info("## Cadastro de Item ##");

		if (autenticacao != null) {
			if (emissaoVO.getDetalheNFeList() != null) {
				List<Item> itemList = ItemVO.montarItem(emissaoVO);
				Item[] itensArray = Arrays.copyOf(itemList.toArray(), itemList.toArray().length, Item[].class);
				ItemService_ServiceLocator loc = new ItemService_ServiceLocator();
				loc.setItemServiceSOAP_address(itemServiceURL);
				CadastrarItemRequest parameters = new CadastrarItemRequest(autenticacao, itensArray);
				try {
					ItemService_PortType cad = loc.getitemServiceSOAP();
					CadastrarItemResponse response = cad.cadastrarItem(parameters);
					LoteIntWSResponse lote = response.getLoteWSResponse();
					log.info("++ Cadastro Item : Protocolo do lote = " + lote.getNumeroProtocoloLote());
				} catch (ServiceException e) {
					log.error("## ERRO DE INTEGRACAO: CADASTRO ITEM -- NOTA --> "
							+ emissaoVO.getHeader().getJCBNNF() + " EXCECAO --> " + e);
					for (StackTraceElement s : e.getStackTrace()) {
						log.error(" - METODO: " + s.getFileName() + " - LINHA: " + s.getLineNumber());

					}
				} catch (RemoteException e) {
					log.error("## ERRO DE INTEGRACAO: CADASTRO ITEM -- NOTA --> "
							+ emissaoVO.getHeader().getJCBNNF() + " EXCECAO --> " + e);
					for (StackTraceElement s : e.getStackTrace()) {
						log.error(" - METODO: " + s.getFileName() + " - LINHA: " + s.getLineNumber());

					}
				}
			} else {
				log.info("++ Cadastro Item: Nao ha itens para serem cadastrados ++");
			}
		} else {
			log.info("++ Cadastro Item: Nao ha codigo de autenticacao ++");
		}

	}

	public void cadastrarNaturezaOperacao(String natOpServiceURL) throws Exception {

		log.info("## Cadastro de Natureza Operacao ##");

		if (autenticacao != null) {
			if (emissaoVO.getHeader() != null) {
				List<NaturezaOperacao> natOpList = NaturezaOperacaoVO.montaNatOp(emissaoVO);
				NaturezaOperacao[] natOprArray = Arrays.copyOf(natOpList.toArray(), natOpList.toArray().length,
						NaturezaOperacao[].class);
				NaturezaOperacaoService_ServiceLocator loc = new NaturezaOperacaoService_ServiceLocator();
				loc.setNaturezaOperacaoServiceSOAP_address(natOpServiceURL);
				CadastrarNaturezaOpRequest parameters = new CadastrarNaturezaOpRequest(natOprArray, autenticacao);
				try {
					NaturezaOperacaoService_PortType cad = loc.getnaturezaOperacaoServiceSOAP();
					CadastrarNaturezaOpResponse response = cad.cadastrarNaturezaOp(parameters);
					LoteIntWSResponse lote = response.getLoteWsResponse();
					log.info("++ Cadastro Natureza Operacao : Protocolo do lote = " + lote.getNumeroProtocoloLote());
				} catch (ServiceException e) {
					log.error("## ERRO DE INTEGRACAO: CADASTRO NATUREZA OPERACAO -- NOTA --> "
							+ emissaoVO.getHeader().getJCBNNF() + " EXCECAO --> " + e);
					for (StackTraceElement s : e.getStackTrace()) {
						log.error(" - METODO: " + s.getFileName() + " - LINHA: " + s.getLineNumber());

					}
				} catch (RemoteException e) {
					log.error("## ERRO DE INTEGRACAO: CADASTRO NATUREZA OPERACAO -- NOTA --> "
							+ emissaoVO.getHeader().getJCBNNF() + " EXCECAO --> " + e);
					for (StackTraceElement s : e.getStackTrace()) {
						log.error(" - METODO: " + s.getFileName() + " - LINHA: " + s.getLineNumber());

					}
				}
			} else {
				log.info("++ Cadastro Natureza Operacao: Nao ha Natureza Operacao para serem cadastradas ++");
			}
		} else {
			log.info("++ Cadastro Natureza Operacao: Nao ha codigo de autenticacao ++");
		}

	}

	public void cadastrarUnidade(String unidadeServiceURL) throws Exception {

		log.info("## Cadastro de Unidade ##");

		if (autenticacao != null) {
			if (emissaoVO.getDetalheNFeList() != null) {
				List<Unidade> unidadeList = UnidadeVO.montaUnidade(emissaoVO);
				Unidade[] unidadeArray = Arrays.copyOf(unidadeList.toArray(), unidadeList.toArray().length,
						Unidade[].class);
				UnidadeService_ServiceLocator loc = new UnidadeService_ServiceLocator();
				loc.setUnidadeServiceSOAP_address(unidadeServiceURL);
				CadastrarUnidadeRequest parameters = new CadastrarUnidadeRequest(unidadeArray, autenticacao);
				try {
					UnidadeService_PortType cad = loc.getunidadeServiceSOAP();
					CadastrarUnidadeResponse response = cad.cadastrarUnidade(parameters);
					LoteIntWSResponse lote = response.getLoteWSResponse();
					System.out.println("Protocolo do lote: " + lote.getNumeroProtocoloLote());
					// consultaGenerica(lote.getNumeroProtocoloLote().toString());
				} catch (ServiceException e) {
					log.error("## ERRO DE INTEGRACAO: CADASTRO UNIDADE -- NOTA --> "
							+ emissaoVO.getHeader().getJCBNNF() + " EXCECAO --> " + e);
					for (StackTraceElement s : e.getStackTrace()) {
						log.error(" - METODO: " + s.getFileName() + " - LINHA: " + s.getLineNumber());

					}
				} catch (RemoteException e) {
					log.error("## ERRO DE INTEGRACAO: CADASTRO UNIDADE -- NOTA --> "
							+ emissaoVO.getHeader().getJCBNNF() + " EXCECAO --> " + e);
					for (StackTraceElement s : e.getStackTrace()) {
						log.error(" - METODO: " + s.getFileName() + " - LINHA: " + s.getLineNumber());

					}
				}
			} else {
				log.info("++ Cadastro Unidade: Nao ha Unidades para serem cadastradas ++");
			}
		} else {
			log.info("++ Cadastro Unidade: Nao ha codigo de autenticacao ++");
		}

	}
}
