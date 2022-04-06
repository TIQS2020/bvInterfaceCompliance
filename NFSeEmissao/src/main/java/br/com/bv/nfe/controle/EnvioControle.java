package br.com.bv.nfe.controle;

import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.xml.rpc.ServiceException;

import org.apache.axis.types.NonNegativeInteger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import br.com.bv.nfe.vo.Item.ItemVO;
import br.com.bv.nfe.vo.naturezaOperacao.NaturezaOperacaoVO;
import br.com.bv.nfe.vo.nfServico.NfServicoVO;
import br.com.bv.nfe.vo.participante.ParticipanteVO;
import br.com.bv.nfe.vo.unidade.UnidadeVO;
import br.com.bv.vo.CpfCnpjVO;
import br.com.bv.vo.EnvioVO;
import br.com.bv.vo.ServicesVO;
import br.com.compliance.nfe.dao.F55IJC80Dao;
import br.com.compliance.nfe.dao.F55IJC81Dao;
import br.com.compliance.nfe.dao.F55IJC82Dao;
import br.com.compliance.nfe.dao.F55IJC83Dao;
import br.com.compliance.nfe.dao.F55IJC84Dao;
import br.com.compliance.nfe.dao.F55IJC86Dao;
import br.com.compliance.nfe.dao.F76B01TEDao;
import br.com.compliance.nfe.jde.domain.F55IJC80;
import br.com.compliance.nfe.jde.domain.F55IJC80Id;
import br.com.compliance.nfe.jde.domain.F55IJC84;
import br.com.compliance.nfe.jde.domain.F76B01TE;
import br.com.compliance.nfe.util.DateUtil;
import br.com.compliance.nfe.util.ExceptionHelper;
import br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.consultaGenerica.ErroLote;
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
import br.com.compliancefiscal.services.integracao.services.v1.nfServicoEmissaoService.EmissaoTercNfServicoRequest;
import br.com.compliancefiscal.services.integracao.services.v1.nfServicoEmissaoService.EmissaoTercNfServicoResponse;
import br.com.compliancefiscal.services.integracao.services.v1.nfServicoEmissaoService.NfServicoEmissaoService_PortType;
import br.com.compliancefiscal.services.integracao.services.v1.nfServicoEmissaoService.NfServicoEmissaoService_ServiceLocator;
import br.com.compliancefiscal.services.integracao.services.v1.participanteService.CadastrarParticipanteRequest;
import br.com.compliancefiscal.services.integracao.services.v1.participanteService.CadastrarParticipanteResponse;
import br.com.compliancefiscal.services.integracao.services.v1.participanteService.ParticipanteService_PortType;
import br.com.compliancefiscal.services.integracao.services.v1.participanteService.ParticipanteService_ServiceLocator;
import br.com.compliancefiscal.services.integracao.services.v1.unidadeService.CadastrarUnidadeRequest;
import br.com.compliancefiscal.services.integracao.services.v1.unidadeService.CadastrarUnidadeResponse;
import br.com.compliancefiscal.services.integracao.services.v1.unidadeService.UnidadeService_PortType;
import br.com.compliancefiscal.services.integracao.services.v1.unidadeService.UnidadeService_ServiceLocator;

public class EnvioControle {

	MultOrgAuthentication autenticacao = null;
	EnvioVO envioVO = null;
	//IbgeVO ibgeVO = null;
	CpfCnpjVO cpfCnpjVO = null;
	private static final String[] STATUS_EMISSAO = {"1"};
	private String loteEnvio;
	private static final Logger log = LogManager.getLogger(EnvioControle.class.getName());
	private List<F55IJC80> listF55IJC80;
	private ServicesVO servicesVO;
	private F55IJC80Dao f55IJC80Dao = new F55IJC80Dao();
	private F55IJC81Dao f55IJC81Dao = new F55IJC81Dao();
	private F55IJC82Dao f55IJC82Dao = new F55IJC82Dao();
	private F55IJC83Dao f55IJC83Dao = new F55IJC83Dao();
	private F55IJC84Dao f55IJC84Dao = new F55IJC84Dao();
	private F55IJC86Dao f55IJC86Dao = new F55IJC86Dao();
	private F76B01TEDao f76B01TEDao = new F76B01TEDao();

	public EnvioControle() {
	}

	public void inicializaProcesso(ServicesVO services) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy as HH:mm:ss");
		System.out.println("Iniciado em: " + dateFormat.format(new Date()));

		try {
			log.info("## INICIANDO PROCESSO DE EMISSAO ##");

			listF55IJC80 = f55IJC80Dao.getF55IJC80byStatus(STATUS_EMISSAO);
			servicesVO = services;

			log.info("## INICIANDO MONTAGEM DOS OBJETOS DE EMISSAO ##");
			montaObjetos();
			log.info("## FINALIZANDO PROCESSO DE EMISSAO ##");
		} catch (Exception ex) {
			log.error("## ERRO DE INTEGRACAO: ERRO NA LISTAGEM DE NOTAS - EXCECAO --> " + ex.getMessage());

		}
	}

	public void montaObjetos() {

		log.info("## Montando Objetos - Percorrendo listagem de notas ##");
		
		/*
		 * Montando a lista de prefeituras que deverao 
		 * ter o ponto retirado do codigo ibge
		 * a partir do arquivo txt em 
		 * C:\Java\resources
		 * */
		try {
			//ibgeVO = new IbgeVO();
			//cpfCnpjVO = new CpfCnpjVO();

			if (!listF55IJC80.isEmpty()) {
				log.info("Notas Listadas: " + listF55IJC80.toString());
				Iterator<F55IJC80> it = listF55IJC80.iterator();
				while (it.hasNext()) {
					try {
						F55IJC80 f = it.next();

						log.info("## Nota ##");
						log.info("+ Numero: " + f.getJCBNNF());
						log.info("+ Serie: " + f.getJCBSER());
						log.info("+ Pre Nota: " + f.getJCN001());
						log.info("+ Tipo: " + f.getJCDCT());

						F76B01TE f76b01te = new F76B01TE();

						f76b01te.setFHB76EST("E");
						f76b01te.setFHBNNF(f.getJCBNNF());
						f76b01te.setFHBSER(f.getJCBSER());
						f76b01te.setFHN001(f.getJCN001());
						f76b01te.setFHDCT(f.getJCDCT());

						envioVO = new EnvioVO();
						envioVO.setF76b01te(f76b01te);
						envioVO.setHeader(f);
						envioVO.setId(new F55IJC80Id(f.getJCBNNF(), f.getJCBSER(), f.getJCN001(), f.getJCDCT()));
						envioVO.setDetalheNFeList(f55IJC81Dao.listF55IJC81ById(envioVO.getId()));
						envioVO.setMenssagemNFeList(f55IJC82Dao.listF55IJC82ById(envioVO.getId()));
						envioVO.setVencimentoNFeList(f55IJC83Dao.listF55IJC83ById(envioVO.getId()));
						envioVO.setParticipanteNFeList(f55IJC84Dao.listF55IJC84ById(envioVO.getId()));
						envioVO.setReferenciaNFeList(f55IJC86Dao.listF55IJC86ById(envioVO.getId()));

						List<F55IJC84> listPart = f55IJC84Dao.listF55IJC84ById(envioVO.getId());

						for (F55IJC84 part : listPart) {
							if (part.getJCIA01() == 5) {
								envioVO.setCodigoMultOrg(part.getJCAAIL());
								envioVO.setHashMultOrg(part.getJCDESTIN());
							}
						}

						if (envioVO.getCodigoMultOrg() != null && !envioVO.getCodigoMultOrg().isEmpty()) {
							autenticacao = new MultOrgAuthentication(envioVO.getCodigoMultOrg(),
									envioVO.getHashMultOrg());
						}

						cadastraItem(servicesVO.getItemServiceURL());
						cadastraParticipante(servicesVO.getParticipanteServiceURL());
						cadastrarNaturezaOperacao(servicesVO.getNatOpServiceURL());
						cadastrarUnidade(servicesVO.getUnidadeServiceURL());

						envioNFSe(servicesVO.getEnvioNFeServiceURL());

						atualizaF55IJC80(loteEnvio);

					} catch (Exception ex) {
						log.error("## ERRO DE INTEGRACAO: NOTA --> " + envioVO.getHeader().getJCBNNF() + " EXCECAO --> "
								+ ex);
						ExceptionHelper.error(ex);

						try {
							f55IJC80Dao.updateF55IJC80Erro(envioVO.getHeader());
							f76B01TEDao.updateF76b01teErro(envioVO.getF76b01te());
						} catch (Exception e) {
							log.error("## ERRO DE INTEGRACAO: CADASTRO PARTICIPANTE -- NOTA --> "
									+ envioVO.getHeader().getJCBNNF() + " EXCECAO --> " + e);

							ExceptionHelper.error(ex);
						}
					}

				}
			} else {
				log.info("++ Nao ha notas para envio.");
			}

		} catch (Exception exIbge) {//catch (IOException exIbge) {
			log.error("## ERRO DE INTEGRACAO: ARQUIVO IBGE NAO ENCONTRADO - EXCECAO --> "
					+ exIbge);
			ExceptionHelper.error(exIbge);

			try {
				f55IJC80Dao.updateF55IJC80Erro(envioVO.getHeader());
				f76B01TEDao.updateF76b01teErro(envioVO.getF76b01te());
			} catch (Exception e) {
				log.error("## ERRO DE INTEGRACAO: ERRO AO ATUALIZAR F55IJC80 E F76B01TE - EXCECAO --> " + e);	
			}
		}

		log.info("## Fechando o metodo de montagem de Objetos ##");
	}

	public void atualizaF55IJC80(String numeroLote) {

		if (numeroLote != null) {
			envioVO.getHeader().setJCDEJ(DateUtil.convertToJulian(new Date()));
			envioVO.getHeader().setJCUK02(Long.parseLong(numeroLote));
			envioVO.getHeader().setJCBRNFDE(DateUtil.convertToJulian(new Date()));

			try {
				f55IJC80Dao.updateF55IJC80(envioVO.getHeader());
			} catch (Exception e) {
				log.error("## ERRO DE INTEGRACAO: CADASTRO PARTICIPANTE -- NOTA --> " + envioVO.getHeader().getJCBNNF()
						+ " EXCECAO --> " + e);
				ExceptionHelper.error(e);
			}
		}
	}

	public void envioNFSe(String emissaoServicoURL) throws Exception {

		log.info("## Cadastro de NFe ##");

		if (autenticacao != null) {
			if (envioVO.getHeader() != null) {

				NfServicoVO vo = new NfServicoVO();
				NfServicos nfe = vo.montaNfSe(envioVO);

				NfServicos[] nfeArray = new NfServicos[1];
				nfeArray[0] = nfe;

				EmissaoTercNfServicoRequest nfeParameters = new EmissaoTercNfServicoRequest(nfeArray, autenticacao);
				NfServicoEmissaoService_ServiceLocator loc = new NfServicoEmissaoService_ServiceLocator();
				loc.setNfServicoEmissaoServiceSOAP_address(emissaoServicoURL);

				loteEnvio = "";

				try {

					NfServicoEmissaoService_PortType cad = loc.getnfServicoEmissaoServiceSOAP();
					EmissaoTercNfServicoResponse response = cad.emissaoTercNfServico(nfeParameters);
					LoteIntWSResponse lote = response.getLoteWSResponse();

					log.info("++ Cadastro NFe : Protocolo do lote = " + lote.getNumeroProtocoloLote());

					loteEnvio = lote.getNumeroProtocoloLote().toString();					

				} catch (ServiceException e) {
					log.error(
							"## ERRO DE INTEGRACAO: NOTA --> " + envioVO.getHeader().getJCBNNF() + " EXCECAO --> " + e);
					for (StackTraceElement s : e.getStackTrace()) {
						log.error(" - METODO: " + s.getFileName() + " - LINHA: " + s.getLineNumber());

					}
				} catch (RemoteException e) {
					e.printStackTrace();
					log.error("## ERRO DE INTEGRACAO: ENVIO DE NOTA -- NOTA --> " + envioVO.getHeader().getJCBNNF()
							+ " EXCECAO --> " + e);
					ExceptionHelper.error(e);
				}
			} else {
				log.info("++ Cadastro NFe: Nao ha NFe para serem cadastradas ++");
			}
		} else {
			log.info("++ Cadastro NFe: Nao ha codigo de autenticaï¿½ï¿½o ++");
		}

	}

	public void cadastraParticipante(String participanteServiceURL) throws Exception {

		log.info("## Cadastro de Participante ##");

		if (autenticacao != null) {
			if (envioVO.getParticipanteNFeList() != null) {
				List<Participante> pList = ParticipanteVO.montaParticipantes(envioVO);
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
							+ envioVO.getHeader().getJCBNNF() + " EXCECAO --> " + e);
					ExceptionHelper.error(e);
				} catch (RemoteException e) {
					log.error("## ERRO DE INTEGRACAO: CADASTRO PARTICIPANTE -- NOTA --> "
							+ envioVO.getHeader().getJCBNNF() + " EXCECAO --> " + e);
					ExceptionHelper.error(e);
				}
			} else {
				log.info("++ Cadastro Item: Nï¿½o hï¿½ Participante para serem cadastrados ++");
			}
		} else {
			log.info("++ Cadastro Participante: Nï¿½o hï¿½ cï¿½digo de autenticaï¿½ï¿½o ++");
		}

	}

	public void cadastraItem(String itemServiceURL) throws Exception {

		log.info("## Cadastro de Item ##");

		if (autenticacao != null) {
			if (envioVO.getDetalheNFeList() != null) {

				List<Item> itemList = ItemVO.montarItem(envioVO);

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
					log.error("## ERRO DE INTEGRACAO: CADASTRO ITEM -- NOTA --> " + envioVO.getHeader().getJCBNNF()
							+ " EXCECAO --> " + e);
					ExceptionHelper.error(e);
				} catch (RemoteException e) {
					log.error("## ERRO DE INTEGRACAO: CADASTRO ITEM -- NOTA --> " + envioVO.getHeader().getJCBNNF()
							+ " EXCECAO --> " + e);
					ExceptionHelper.error(e);
				}
			} else {
				log.info("++ Cadastro Item: Nï¿½o hï¿½ itens para serem cadastrados ++");
			}
		} else {
			log.info("++ Cadastro Item: Nï¿½o hï¿½ cï¿½digo de autenticaï¿½ï¿½o ++");
		}

	}

	public void cadastrarNaturezaOperacao(String natOpServiceURL) throws Exception {

		log.info("## Cadastro de Natureza Operaï¿½ï¿½o ##");

		if (autenticacao != null) {
			if (envioVO.getHeader() != null) {
				List<NaturezaOperacao> natOpList = NaturezaOperacaoVO.montaNatOp(envioVO);
				NaturezaOperacao[] natOprArray = Arrays.copyOf(natOpList.toArray(), natOpList.toArray().length,
						NaturezaOperacao[].class);
				NaturezaOperacaoService_ServiceLocator loc = new NaturezaOperacaoService_ServiceLocator();
				loc.setNaturezaOperacaoServiceSOAP_address(natOpServiceURL);
				CadastrarNaturezaOpRequest parameters = new CadastrarNaturezaOpRequest(natOprArray, autenticacao);
				try {
					NaturezaOperacaoService_PortType cad = loc.getnaturezaOperacaoServiceSOAP();
					CadastrarNaturezaOpResponse response = cad.cadastrarNaturezaOp(parameters);
					LoteIntWSResponse lote = response.getLoteWsResponse();
					log.info(
							"++ Cadastro Natureza Operaï¿½ï¿½o : Protocolo do lote = " + lote.getNumeroProtocoloLote());
				} catch (ServiceException e) {
					log.error("## ERRO DE INTEGRACAO: CADASTRO NATUREZA OPERACAO -- NOTA --> "
							+ envioVO.getHeader().getJCBNNF() + " EXCECAO --> " + e);
					ExceptionHelper.error(e);
				} catch (RemoteException e) {
					log.error("## ERRO DE INTEGRACAO: CADASTRO NATUREZA OPERACAO -- NOTA --> "
							+ envioVO.getHeader().getJCBNNF() + " EXCECAO --> " + e);
					ExceptionHelper.error(e);
				}
			} else {
				log.info("++ Cadastro Natureza Operação: Nï¿½o hï¿½ Natureza Operaï¿½ï¿½o para serem cadastradas ++");
			}
		} else {
			log.info("++ Cadastro Natureza Operação: Nï¿½o hï¿½ cï¿½digo de autenticaï¿½ï¿½o ++");
		}

	}

	public void cadastrarUnidade(String unidadeServiceURL) throws Exception {

		log.info("## Cadastro de Unidade ##");

		if (autenticacao != null) {
			if (envioVO.getDetalheNFeList() != null) {
				List<Unidade> unidadeList = UnidadeVO.montaUnidade(envioVO);
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
					log.error("## ERRO DE INTEGRACAO: CADASTRO UNIDADE -- NOTA --> " + envioVO.getHeader().getJCBNNF()
							+ " EXCECAO --> " + e);
					ExceptionHelper.error(e);
				} catch (RemoteException e) {
					log.error("## ERRO DE INTEGRACAO: CADASTRO UNIDADE -- NOTA --> " + envioVO.getHeader().getJCBNNF()
							+ " EXCECAO --> " + e);
					ExceptionHelper.error(e);
				}
			} else {
				log.info("++ Cadastro Unidade: Nï¿½o hï¿½ Unidades para serem cadastradas ++");
			}
		} else {
			log.info("++ Cadastro Unidade: Nï¿½o hï¿½ cï¿½digo de autenticaï¿½ï¿½o ++");
		}

	}
}
