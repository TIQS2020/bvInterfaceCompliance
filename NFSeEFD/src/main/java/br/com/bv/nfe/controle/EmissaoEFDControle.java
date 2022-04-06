package br.com.bv.nfe.controle;

import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import javax.xml.rpc.ServiceException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import br.com.bv.nfe.vo.EmissaoEFDVO;
import br.com.bv.nfe.vo.ServicesVO;
import br.com.bv.nfe.vo.Item.ItemVO;
import br.com.bv.nfe.vo.naturezaOperacao.NaturezaOperacaoVO;
import br.com.bv.nfe.vo.nfServico.NfServicoEFDVO;
import br.com.bv.nfe.vo.participante.ParticipanteVO;
import br.com.bv.nfe.vo.unidade.UnidadeVO;
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

public class EmissaoEFDControle {

	MultOrgAuthentication autenticacao = null;
	EmissaoEFDVO emissaoEFDVO = null;	
	private static final String STATUS_EMISSAO = "3";
	private static final String BLOCO = "A";
	private static final String[] modeloFiscal = {"99"};
	private String loteEnvio;
	private static final Logger log = LogManager.getLogger(EmissaoEFDControle.class.getName());
	private List<F55IJC70> listF55IJC70;
	private List<F55IJC7C> listF55IJC7C;
	private ServicesVO servicesVO;
	private F55IJC70Dao f55IJC70Dao = new F55IJC70Dao();
	private F55IJC71Dao f55IJC71Dao = new F55IJC71Dao();
	private F55IJC72Dao f55IJC72Dao = new F55IJC72Dao();
	//private F55IJC73Dao f55IJC73Dao = new F55IJC73Dao();
	private F55IJC74Dao f55IJC74Dao = new F55IJC74Dao();
	private F55IJC7CDao f55IJC7CDao = new F55IJC7CDao(); 
	
	public EmissaoEFDControle() {
	}

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
			
			listF55IJC70 = f55IJC70Dao.getF55IJC70byStatus(f55IJC7C.getId(), modeloFiscal);	
			
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
				log.info("Notas Listadas: " + listF55IJC70.toString());
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

						emissaoEFDVO = new EmissaoEFDVO();
						emissaoEFDVO.setHeader(f);
						emissaoEFDVO.setId(new F55IJC70Id(f.getJCBNNF(), f.getJCBSER(), f.getJCN001(), f.getJCDCT(), f.getJCWJOBS()));
						emissaoEFDVO.setDetalheNFeList(f55IJC71Dao.listF55IJC71ById(emissaoEFDVO.getId()));
						emissaoEFDVO.setMenssagemNFeList(f55IJC72Dao.listF55IJC72ById(emissaoEFDVO.getId()));
						emissaoEFDVO.setParticipanteNFeList(f55IJC74Dao.listF55IJC74ById(emissaoEFDVO.getId()));

						for (F55IJC74 part : emissaoEFDVO.getParticipanteNFeList()) {
							if (part.getJCIA01() == 1) {
								emissaoEFDVO.setCodigoMultOrg(part.getJCAAIL());
								emissaoEFDVO.setHashMultOrg(part.getJCDESTIN());
							}
						}

						if (emissaoEFDVO.getCodigoMultOrg() != null && !emissaoEFDVO.getCodigoMultOrg().isEmpty()) {
							autenticacao = new MultOrgAuthentication(emissaoEFDVO.getCodigoMultOrg(),
									emissaoEFDVO.getHashMultOrg());
						}
						
						cadastraItem(servicesVO.getItemServiceURL());
						cadastraParticipante(servicesVO.getParticipanteServiceURL());
						//cadastrarNaturezaOperacao(servicesVO.getNatOpServiceURL());
						//cadastrarUnidade(servicesVO.getUnidadeServiceURL());						
						
						emissaoEntradaNFeServicos(servicesVO.getEmissaoEFD());
						
						atualizaF55IJC70(loteEnvio);					

						it.remove();
					} catch (Exception ex) {
						log.error("## ERRO DE INTEGRACAO: NOTA --> " + emissaoEFDVO.getHeader().getJCBNNF()
								+ " EXCECAO --> " + ex);
						for (StackTraceElement s : ex.getStackTrace()) {
							log.error(" - METODO: " + s.getFileName() + " - LINHA: " + s.getLineNumber());

						}

						try {
							f55IJC70Dao.updateF55IJC70Erro(emissaoEFDVO.getHeader());
						} catch (Exception e) {
							log.error("## ERRO DE INTEGRACAO: CADASTRO PARTICIPANTE -- NOTA --> "
									+ emissaoEFDVO.getHeader().getJCBNNF() + " EXCECAO --> " + e);
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
			emissaoEFDVO.getHeader().setJCDEJ(DateUtil.convertToJulian(new Date()));
			emissaoEFDVO.getHeader().setJCUK02(Long.parseLong(numeroLote));
			emissaoEFDVO.getHeader().setJCBRNFDE(DateUtil.convertToJulian(new Date()));

			try {
				f55IJC70Dao.updateF55IJC70(emissaoEFDVO.getHeader());
			} catch (Exception e) {
				log.error("## ERRO DE INTEGRACAO: CADASTRO PARTICIPANTE -- NOTA --> "
						+ emissaoEFDVO.getHeader().getJCBNNF() + " EXCECAO --> " + e);
				for (StackTraceElement s : e.getStackTrace()) {
					log.error(" - METODO: " + s.getFileName() + " - LINHA: " + s.getLineNumber());

				}
			}
		}

	}

	public void emissaoEntradaNFeServicos(String emissaoEntradaEFDNFeServiceURL) throws Exception {

		log.info("## Cadastro de NFe ##");

		if (autenticacao != null) {
			if (emissaoEFDVO.getHeader() != null) {
				NfServicos nfe = NfServicoEFDVO.montaNfe(emissaoEFDVO);
				NfServicos[] nfeArray = new NfServicos[1];
				nfeArray[0] = nfe;

				CadastroNotaServicoRequest nfeParameters = new CadastroNotaServicoRequest(nfeArray, autenticacao);
				NfServicoService_ServiceLocator loc = new NfServicoService_ServiceLocator();
				// loc.setNfMercantilEmissaoPropServiceSOAP_address(emissaoEntradaNFeServiceURL);				

				loc.setNfServicoServiceSOAP_address(emissaoEntradaEFDNFeServiceURL);
				loteEnvio = "";
				try {
					NfServicoService_PortType cad = loc.getnfServicoServiceSOAP();
					CadastroNotaServicoResponse response = cad.cadastroNotaServico(nfeParameters);
					LoteIntWSResponse lote = response.getLoteWSResponse();
					log.info("++ Cadastro NFe : Protocolo do lote = " + lote.getNumeroProtocoloLote());
					loteEnvio = lote.getNumeroProtocoloLote().toString();
				} catch (ServiceException e) {
					// TODO Auto-generated catch block
					log.error("## ERRO DE INTEGRACAO: NOTA --> " + emissaoEFDVO.getHeader().getJCBNNF()
							+ " EXCECAO --> " + e);
					for (StackTraceElement s : e.getStackTrace()) {
						log.error(" - METODO: " + s.getFileName() + " - LINHA: " + s.getLineNumber());

					}
				} catch (RemoteException e) {
					log.error("## ERRO DE INTEGRACAO: ENVIO DE NOTA -- NOTA --> "
							+ emissaoEFDVO.getHeader().getJCBNNF() + " EXCECAO --> " + e);
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
	
	public void cadastraParticipante(String participanteServiceURL) throws Exception {

		log.info("## Cadastro de Participante ##");

		if (autenticacao != null) {
			if (emissaoEFDVO.getParticipanteNFeList() != null) {
				List<Participante> pList = ParticipanteVO.montaParticipantes(emissaoEFDVO);
				Participante[] pArray = Arrays.copyOf(pList.toArray(), pList.toArray().length, Participante[].class);
				ParticipanteService_ServiceLocator loc = new ParticipanteService_ServiceLocator();
				loc.setParticipanteServiceSOAP_address(participanteServiceURL);
				CadastrarParticipanteRequest parameters = new CadastrarParticipanteRequest(pArray, autenticacao);
				try {
					ParticipanteService_PortType cad = loc.getparticipanteServiceSOAP();
					CadastrarParticipanteResponse response = cad.cadastrarParticipante(parameters);
					LoteIntWSResponse lote = response.getLoteWsResponse();
					log.info("++ Cadastro Participante : Protocolo do lote = " + lote.getNumeroProtocoloLote());
				} catch (ServiceException e) {
					log.error("## ERRO DE INTEGRACAO: CADASTRO PARTICIPANTE -- NOTA --> "
							+ emissaoEFDVO.getHeader().getJCBNNF() + " EXCECAO --> " + e);
					for (StackTraceElement s : e.getStackTrace()) {
						log.error(" - METODO: " + s.getFileName() + " - LINHA: " + s.getLineNumber());

					}
				} catch (RemoteException e) {
					log.error("## ERRO DE INTEGRACAO: CADASTRO PARTICIPANTE -- NOTA --> "
							+ emissaoEFDVO.getHeader().getJCBNNF() + " EXCECAO --> " + e);
					for (StackTraceElement s : e.getStackTrace()) {
						log.error(" - METODO: " + s.getFileName() + " - LINHA: " + s.getLineNumber());

					}
				}
			} else {
				log.info("++ Cadastro Item: Não há Participante para serem cadastrados ++");
			}
		} else {
			log.info("++ Cadastro Participante: Não há código de autenticação ++");
		}

	}

	public void cadastraItem(String itemServiceURL) throws Exception {

		log.info("## Cadastro de Item ##");

		if (autenticacao != null) {
			if (emissaoEFDVO.getDetalheNFeList() != null) {
				List<Item> itemList = ItemVO.montarItem(emissaoEFDVO);
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
							+ emissaoEFDVO.getHeader().getJCBNNF() + " EXCECAO --> " + e);
					for (StackTraceElement s : e.getStackTrace()) {
						log.error(" - METODO: " + s.getFileName() + " - LINHA: " + s.getLineNumber());

					}
				} catch (RemoteException e) {
					log.error("## ERRO DE INTEGRACAO: CADASTRO ITEM -- NOTA --> "
							+ emissaoEFDVO.getHeader().getJCBNNF() + " EXCECAO --> " + e);
					for (StackTraceElement s : e.getStackTrace()) {
						log.error(" - METODO: " + s.getFileName() + " - LINHA: " + s.getLineNumber());

					}
				}
			} else {
				log.info("++ Cadastro Item: Não há itens para serem cadastrados ++");
			}
		} else {
			log.info("++ Cadastro Item: Não há código de autenticação ++");
		}

	}

	public void cadastrarNaturezaOperacao(String natOpServiceURL) throws Exception {

		log.info("## Cadastro de Natureza Operação ##");

		if (autenticacao != null) {
			if (emissaoEFDVO.getHeader() != null) {
				List<NaturezaOperacao> natOpList = NaturezaOperacaoVO.montaNatOp(emissaoEFDVO);
				NaturezaOperacao[] natOprArray = Arrays.copyOf(natOpList.toArray(), natOpList.toArray().length,
						NaturezaOperacao[].class);
				NaturezaOperacaoService_ServiceLocator loc = new NaturezaOperacaoService_ServiceLocator();
				loc.setNaturezaOperacaoServiceSOAP_address(natOpServiceURL);
				CadastrarNaturezaOpRequest parameters = new CadastrarNaturezaOpRequest(natOprArray, autenticacao);
				try {
					NaturezaOperacaoService_PortType cad = loc.getnaturezaOperacaoServiceSOAP();
					CadastrarNaturezaOpResponse response = cad.cadastrarNaturezaOp(parameters);
					LoteIntWSResponse lote = response.getLoteWsResponse();
					log.info("++ Cadastro Natureza Operação : Protocolo do lote = " + lote.getNumeroProtocoloLote());
				} catch (ServiceException e) {
					// TODO Auto-generated catch block
					log.error("## ERRO DE INTEGRACAO: CADASTRO NATUREZA OPERACAO -- NOTA --> "
							+ emissaoEFDVO.getHeader().getJCBNNF() + " EXCECAO --> " + e);
					for (StackTraceElement s : e.getStackTrace()) {
						log.error(" - METODO: " + s.getFileName() + " - LINHA: " + s.getLineNumber());

					}
				} catch (RemoteException e) {
					// TODO Auto-generated catch block
					log.error("## ERRO DE INTEGRACAO: CADASTRO NATUREZA OPERACAO -- NOTA --> "
							+ emissaoEFDVO.getHeader().getJCBNNF() + " EXCECAO --> " + e);
					for (StackTraceElement s : e.getStackTrace()) {
						log.error(" - METODO: " + s.getFileName() + " - LINHA: " + s.getLineNumber());

					}
				}
			} else {
				log.info("++ Cadastro Natureza Operação: Não há Natureza Operação para serem cadastradas ++");
			}
		} else {
			log.info("++ Cadastro Natureza Operação: Não há código de autenticação ++");
		}

	}

	public void cadastrarUnidade(String unidadeServiceURL) throws Exception {

		log.info("## Cadastro de Unidade ##");

		if (autenticacao != null) {
			if (emissaoEFDVO.getDetalheNFeList() != null) {
				List<Unidade> unidadeList = UnidadeVO.montaUnidade(emissaoEFDVO);
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
							+ emissaoEFDVO.getHeader().getJCBNNF() + " EXCECAO --> " + e);
					for (StackTraceElement s : e.getStackTrace()) {
						log.error(" - METODO: " + s.getFileName() + " - LINHA: " + s.getLineNumber());

					}
				} catch (RemoteException e) {
					log.error("## ERRO DE INTEGRACAO: CADASTRO UNIDADE -- NOTA --> "
							+ emissaoEFDVO.getHeader().getJCBNNF() + " EXCECAO --> " + e);
					for (StackTraceElement s : e.getStackTrace()) {
						log.error(" - METODO: " + s.getFileName() + " - LINHA: " + s.getLineNumber());

					}
				}
			} else {
				log.info("++ Cadastro Unidade: Não há Unidades para serem cadastradas ++");
			}
		} else {
			log.info("++ Cadastro Unidade: Não há código de autenticação ++");
		}

	}
	
	
}
