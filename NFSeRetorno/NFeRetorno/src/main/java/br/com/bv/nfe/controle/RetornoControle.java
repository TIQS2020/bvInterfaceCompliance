package br.com.bv.nfe.controle;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.apache.axis.types.NonNegativeInteger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import br.com.bv.nfe.util.StatusProperties;
import br.com.bv.nfe.vo.RetornoVO;
import br.com.compliance.nfe.dao.F40203Dao;
import br.com.compliance.nfe.dao.F4211Dao;
import br.com.compliance.nfe.dao.F55IJC80Dao;
import br.com.compliance.nfe.dao.F55IJC84Dao;
import br.com.compliance.nfe.dao.F7611BDao;
import br.com.compliance.nfe.dao.F76B01TEDao;
import br.com.compliance.nfe.dao.F76B12TEDao;
import br.com.compliance.nfe.jde.domain.F40203;
import br.com.compliance.nfe.jde.domain.F4211;
import br.com.compliance.nfe.jde.domain.F55IJC80;
import br.com.compliance.nfe.jde.domain.F55IJC80Id;
import br.com.compliance.nfe.jde.domain.F55IJC84;
import br.com.compliance.nfe.jde.domain.F7611B;
import br.com.compliance.nfe.jde.domain.F76B01TE;
import br.com.compliance.nfe.jde.domain.F76B01TEId;
import br.com.compliance.nfe.util.DateUtil;
import br.com.compliance.nfe.util.DirectionEnum;
import br.com.compliance.nfe.util.StringUtil;
import br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.consultaGenerica.ConsultaGenerica;
import br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.consultaGenerica.Dados;
import br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.consultaGenerica.ErroLote;
import br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.MultOrgAuthentication;
import br.com.compliancefiscal.services.integracao.services.v1.consultaGenericaService.ConsultaGenericaService_PortType;
import br.com.compliancefiscal.services.integracao.services.v1.consultaGenericaService.ConsultaGenericaService_ServiceLocator;
import br.com.compliancefiscal.services.integracao.services.v1.consultaGenericaService.ConsultarLoteRequest;
import br.com.compliancefiscal.services.integracao.services.v1.consultaGenericaService.ConsultarLoteResponse;

public class RetornoControle {

	private RetornoVO retornoVO = null;
	private MultOrgAuthentication autenticacao = null;
	private static final Logger log = LogManager.getLogger(RetornoControle.class.getName());
	private List<F55IJC80> listF55IJC80Recebida = new ArrayList<F55IJC80>();
	String retornoServiceURL;
	private F55IJC80Dao f55IJC80Dao = new F55IJC80Dao();
	private F55IJC84Dao f55IJC84Dao = new F55IJC84Dao();
	private F7611BDao f7611BDao = new F7611BDao();
	private F76B01TEDao f76B01TEDao = new F76B01TEDao();
	private F4211Dao f4211Dao = new F4211Dao();
//	private F42119Dao f42119Dao = new F42119Dao();
	private F40203Dao f40203Dao = new F40203Dao();
	private F76B12TEDao f76B12TEDao = new F76B12TEDao();
	SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss");

	public RetornoControle() {
	}

	public void inicializaProcesso(String retornoURL) {
		try {
			log.info("## INICIANDO PROCESSO DE RETORNO ##");
			listF55IJC80Recebida = f55IJC80Dao.getF55IJC80Recebida();
			retornoServiceURL = retornoURL;

			log.info("## INICIANDO MONTAGEM DOS OBJETOS RETORNO ##");
			montaObjetos();
			log.info("## FINALIZANDO PROCESSO DE RETORNO ##");
		} catch (Exception ex) {
			log.error("## ERRO DE INTEGRACAO: ERRO NA LISTAGEM DE NOTAS - EXCECAO --> " + ex);
			for (StackTraceElement s : ex.getStackTrace()) {
				log.error(" - METODO: " + s.getFileName() + " - LINHA: " + s.getLineNumber());

			}
		}
	}

	public void montaObjetos() {

		log.info("## Montando OBjetos ##");

		if (!listF55IJC80Recebida.isEmpty()) {
			Iterator<F55IJC80> it = listF55IJC80Recebida.iterator();

			while (it.hasNext()) {

				try {
					F55IJC80 f = it.next();

					log.info("## Nota ##");
					log.info("+ Numero: " + f.getJCBNNF());
					log.info("+ Serie: " + f.getJCBSER());
					log.info("+ Pre Nota: " + f.getJCN001());
					log.info("+ Tipo: " + f.getJCDCT());

					F76B01TE f76b01te = new F76B01TE();
					F4211 f4211 = new F4211();
					F7611B f7611b = new F7611B();

					retornoVO = new RetornoVO();
					retornoVO.setHeader(f);
					retornoVO.setId(new F55IJC80Id(f.getJCBNNF(), f.getJCBSER(), f.getJCN001(), f.getJCDCT()));

					F55IJC84 part = f55IJC84Dao.getF55IJC84ByIdPart5(retornoVO.getHeader());
					if (part != null) {
						autenticacao = new MultOrgAuthentication(part.getJCAAIL(), part.getJCDESTIN());
					}

					retornoVO.setF76b01te(f76b01te);
					retornoVO.setF4211(f4211);
					retornoVO.setF7611b(f7611b);

					consultaLote(retornoServiceURL);
					it.remove();

				} catch (Exception ex) {
					log.error("## ERRO DE INTEGRACAO: NOTA --> " + retornoVO.getHeader().getJCBNNF() + " - EXCECAO --> "
							+ ex);
					for (StackTraceElement s : ex.getStackTrace()) {
						log.error(" - METODO: " + s.getFileName() + " - LINHA: " + s.getLineNumber());
					}
					try {
						f55IJC80Dao.updateF55IJC80Erro(retornoVO.getHeader());

						retornoVO.getF76b01te().setFHB76EST("E");
						retornoVO.getF76b01te().setFHBNNF(retornoVO.getHeader().getJCBNNF());
						retornoVO.getF76b01te().setFHBSER(retornoVO.getHeader().getJCBSER());
						retornoVO.getF76b01te().setFHN001(retornoVO.getHeader().getJCN001());
						retornoVO.getF76b01te().setFHDCT(retornoVO.getHeader().getJCDCT());

						atualizaF76B01TEErro(retornoVO);
					} catch (Exception e) {
						log.error("## Erro Retorno NFe: " + e);
						e.printStackTrace();
					}
				}
			}

			System.out.println("Finalizado em: " + dateFormat.format(new Date()));

		} else {
			log.info("++ Nao ha notas para retorno.");
		}

		log.info("## Fechando o metodo de montagem de Objetos ##");

	}

	public void consultaLote(String retornoServiceURL) throws Exception {

		log.info("## Consulta Lote ##");

		boolean atualizaStatusErro = false;		
		boolean cancelamentoContabilizado = false;

		List<F7611B> f7611List = f7611BDao.listF7611B(retornoVO.getId());

		log.info("Lote: " + retornoVO.getHeader().getJCUK02().toString());
		if (autenticacao != null) {
			ConsultarLoteRequest consulta = new ConsultarLoteRequest(
					new NonNegativeInteger(retornoVO.getHeader().getJCUK02().toString()), autenticacao);
			ConsultaGenericaService_ServiceLocator loc = new ConsultaGenericaService_ServiceLocator();
			loc.setConsultaGenericaServiceSOAP_address(retornoServiceURL);

			ConsultaGenericaService_PortType cad = loc.getconsultaGenericaServiceSOAP();
			ConsultarLoteResponse response = cad.consultarLote(consulta);
			ConsultaGenerica lote = response.getConsultaGenerica();

			log.info("++ Retorno Consulta ++");
			log.info("+ Numero do Lote: " + lote.getNroLote());
			log.info("+ Situacao Lote: " + lote.getSituacaoLote());
			log.info("+ Descricao Situacao Lote: " + lote.getDescrSitLote());

			StringBuilder sbError = new StringBuilder();
			
			/*TODO: gravação da descrição do erro quando o lote sequer é gerado*/
			retornoVO.getHeader().setJCAPTA(lote.getDescrSitLote());
						
			ErroLote erroLote = lote.getErroLote();
			if (erroLote != null) {
				String[] error = erroLote.getListaErroLote();
				if (error.length > 0) {
					log.info("++ Erro lote ++");
					for (String s : error) {
						if (lote.getSituacaoLote().compareTo(new NonNegativeInteger("5")) == 0
								&& sbError.length() < 1500) {
							sbError.append(s);
							/* TODO: Gravar erro situacao 5 - lote rejeitado - no campo JCAPTA da 80 */
							retornoVO.getHeader().setJCAPTA(sbError.toString());
						}
						log.info("+ Erro: " + s);
					}
				}
			}			

			F76B01TEId id = new F76B01TEId(retornoVO.getId().getJCBNNF(), retornoVO.getId().getJCBSER(),
					retornoVO.getId().getJCN001(), retornoVO.getId().getJCDCT());

			F76B01TE f76b01te = f76B01TEDao.findF76b01te(id);
			retornoVO.setF76b01te(f76b01te);
			retornoVO.getHeader().setJCEV15(lote.getSituacaoLote().toString());

			if (lote.getSituacaoLote().compareTo(new NonNegativeInteger("5")) == 0) {
				retornoVO.getF76b01te().setFHB76EST("R");
				atualizaStatusErro = true;
			} else if (lote.getSituacaoLote().compareTo(new NonNegativeInteger("4")) == 0) {
				retornoVO.getF76b01te().setFHB76EST("E");
				atualizaStatusErro = true;
			} else if (lote.getSituacaoLote().compareTo(new NonNegativeInteger("2")) == 0) {
				retornoVO.getF76b01te().setFHB76EST("P");
			}

			if (lote.getDados() != null && lote.getDados().length > 0) {
				log.info("++ Dados lote ++");
				for (Dados d : lote.getDados()) {

					retornoVO.getHeader().setJCA203(d.getSituacao().toString());

					if (d.getSituacao().compareTo(new NonNegativeInteger("10")) == 0) {
						retornoVO.getF76b01te().setFHB76EST("E");
						atualizaStatusErro = true;
					} else if (d.getSituacao().compareTo(new NonNegativeInteger("5")) == 0) {
						retornoVO.getF76b01te().setFHB76EST("R");
						atualizaStatusErro = true;
					}

					if ((d.getSituacao().compareTo(new NonNegativeInteger("4")) == 0)
							|| (d.getSituacao().compareTo(new NonNegativeInteger("7")) == 0)) {
						atualizaStatusErro = false;

						retornoVO.getF76b01te().setFHUSER("IJC");
						retornoVO.getF76b01te().setFHPID("IJCRET");

						retornoVO.getF4211().setSDTDAY(Long.parseLong(DateUtil.getTimetoJDE(new Date())));
						retornoVO.getF4211().setSDUPMJ(Long.valueOf(DateUtil.convertToJulian(new Date())));
						retornoVO.getHeader().setJCUPMJ(Long.valueOf(DateUtil.convertToJulian(new Date())).toString());
						retornoVO.getHeader().setJCTDAY(Long.parseLong(DateUtil.getTimetoJDE(new Date())));

						retornoVO.getF4211().setSDPID("IJCRET");
						retornoVO.getF4211().setSDUSER("IJC");
						retornoVO.getF4211().setSDJOBN("WEBSERV");

						retornoVO.getHeader().setJCUSER("IJC");
						retornoVO.getHeader().setJCJOBN("WEBSERV");
						retornoVO.getHeader().setJCPID("IJCRET");

						for (F7611B f7611b : f7611List) {

							retornoVO.setF7611b(f7611b);

							retornoVO.getF7611b().setFDJOBN("WEBSERV");
							retornoVO.getF7611b().setFDPID("IJCRET");

							retornoVO.getF7611b().setFDUSER("IJC");

							F4211 f4211 = null;
							// F42119 f42119 = null;
							F40203 f40203StatusPedido = new F40203();
							F40203 f40203StatusNota = new F40203();

							// boolean atualizaPedido = false;

							HashMap<String, String> statusProperties = StatusProperties.getStatus();

							if (f7611b.getFDDOCO() != 0) {
								if ("1".equalsIgnoreCase(retornoVO.getHeader().getJCEV14())) {
									f4211 = new F4211();
									f4211 = f4211Dao.getF4211byKey(f7611b);
									retornoVO.setF4211(f4211);
									retornoVO.getF4211().setSDLTTR(f4211.getSDNXTR());
									f40203StatusPedido = f40203Dao.getF40203Status(f4211.getSDDCTO(), StringUtil
											.formatJDECharString(f4211.getSDLNTY(), ' ', 2, DirectionEnum.RIGHT),
											f4211.getSDNXTR());
									if (f40203StatusPedido != null) {
										retornoVO.getF4211().setSDNXTR(f40203StatusPedido.getFSNXTR());
									}

									f40203StatusNota = f40203Dao.getF40203Status(f7611b.getFDDCT(), StringUtil
											.formatJDECharString(f7611b.getFDLNTY(), ' ', 2, DirectionEnum.RIGHT),
											f7611b.getFDNXTR());

									retornoVO.getF7611b().setFDLTTR(f7611b.getFDNXTR());
									if (f40203StatusNota != null) {
										retornoVO.getF7611b().setFDNXTR(f40203StatusNota.getFSNXTR());
									}
								} else if ("2".equalsIgnoreCase(retornoVO.getHeader().getJCEV14())) {
									f4211 = new F4211();
									f4211 = f4211Dao.getF4211byKey(f7611b);
									retornoVO.setF4211(f4211);
									retornoVO.getF4211().setSDLTTR(f4211.getSDNXTR());
									for (String key : statusProperties.keySet()) {
										if ("pedido".equalsIgnoreCase(key)) {
											retornoVO.getF4211().setSDNXTR(statusProperties.get(key));
										} else if ("cancelamento".equalsIgnoreCase(key)) {
											retornoVO.getF7611b().setFDNXTR(statusProperties.get(key));
										} else if ("standAlone".equalsIgnoreCase(key)) {
											retornoVO.getF7611b().setFDNXTR(statusProperties.get(key));
										}
									}
								} else if ("3".equalsIgnoreCase(retornoVO.getHeader().getJCEV14())) {
									cancelamentoContabilizado = true;
									for (String key : statusProperties.keySet()) {
										if ("cancelamentoContabilizado".equalsIgnoreCase(key)) {
											retornoVO.getF7611b().setFDNXTR(statusProperties.get(key));
										} 
									}
									
									/*
									 * f4211 = f4211Dao.getF4211byKey(f7611b); if(f4211 != null) {
									 * retornoVO.getF4211().setSDCNDJ(f4211.getSDCNDJ());
									 * retornoVO.getF4211().setSDSOCN(f4211.getSDUORG());
									 * retornoVO.getF4211().setSDSOQS(0D);
									 * retornoVO.getF4211().setSDNXTR(statusProperties.get(
									 * "status.nfPedidoLegadoNXTR"));
									 * retornoVO.getF4211().setSDLTTR(statusProperties.get(
									 * "status.nfPedidoLegadoLTTR")); }
									 */

									/*
									 * f42119 = f42119Dao.getF42119byKey(f7611b); if(f42119 != null) {
									 * retornoVO.getF42119().setSDCNDJ(f42119.getSDCNDJ());
									 * retornoVO.getF42119().setSDSOCN(f42119.getSDUORG());
									 * retornoVO.getF42119().setSDSOQS(0D);
									 * retornoVO.getF42119().setSDNXTR(statusProperties.get(
									 * "status.nfPedidoLegadoNXTR"));
									 * retornoVO.getF42119().setSDLTTR(statusProperties.get(
									 * "status.nfPedidoLegadoLTTR")); }else { f4211 =
									 * f4211Dao.getF4211byKey(f7611b);
									 * retornoVO.getF4211().setSDCNDJ(f4211.getSDCNDJ());
									 * retornoVO.getF4211().setSDSOCN(f4211.getSDUORG());
									 * retornoVO.getF4211().setSDSOQS(0D);
									 * retornoVO.getF4211().setSDNXTR(statusProperties.get(
									 * "status.nfPedidoLegadoNXTR"));
									 * retornoVO.getF4211().setSDLTTR(statusProperties.get(
									 * "status.nfPedidoLegadoLTTR")); }
									 */
								}
							}

							Date dateAut = new Date();
							SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
							String data = d.getChaveLogica().getDtAutNfs().substring(0, 10);
							String hora = d.getChaveLogica().getDtAutNfs().substring(11, 16);
							String dataStr = data + " " + hora;
							dateAut = dateFormat.parse(dataStr);
							if (d.getSituacao().compareTo(new NonNegativeInteger("4")) == 0) {
								retornoVO.getF76b01te().setFHB76EST("A");
								retornoVO.getHeader().setJCEV15("#");
								retornoVO.getF76b01te().setFHTORG("BRNFEO");
								retornoVO.getF76b01te().setFHB76ESTC("100");
								// retornoVO.getF76b01te().setFHB76EAA(d.getChaveLogica().getCodVerifNfs());;
								retornoVO.getF76b01te().setFHB76EREF(d.getChaveLogica().getCodVerifNfs());
								retornoVO.getF76b01te().setFHB76ELN(String.valueOf(d.getChaveLogica().getNroAutNfs()));
								retornoVO.getF76b01te().setFHB76ELND(Double.valueOf(DateUtil.convertToJulian(dateAut)));
								retornoVO.getF76b01te().setFHB76ELNT(Double.valueOf(DateUtil.getTimetoJDE(dateAut)));
								f76B12TEDao.updateF76B12TE(retornoVO.getF76b01te());
								if (retornoVO.getF4211() != null) {
									// atualiza 4211 e 7611b//
									atualizaF4211(retornoVO);
									atualizaF7611B(retornoVO);
								} else {
									// atualiza 7611b
									atualizaF7611B(retornoVO);
								}

							} else if (d.getSituacao().compareTo(new NonNegativeInteger("7")) == 0) {
								retornoVO.getF76b01te().setFHB76EST("C");
								retornoVO.getHeader().setJCEV15("#");
								retornoVO.getF76b01te().setFHTORG("BRNFEO");
								retornoVO.getF76b01te().setFHB76ESTC("135");
								retornoVO.getF76b01te().setFHB76EREF(d.getChaveLogica().getCodVerifNfs());
								retornoVO.getF76b01te().setFHB76ELN(String.valueOf(d.getChaveLogica().getNroAutNfs()));
								retornoVO.getF76b01te().setFHB76ELND(Double.valueOf(DateUtil.convertToJulian(dateAut)));
								retornoVO.getF76b01te().setFHB76ELNT(Double.valueOf(DateUtil.getTimetoJDE(dateAut)));
								f76B12TEDao.updateF76B12TE(retornoVO.getF76b01te());
								if (retornoVO.getF4211() != null && cancelamentoContabilizado == false) {
									atualizaF4211(retornoVO);
									atualizaF7611B(retornoVO);
								} else {
									// atualizaF42119(retornoVO);
									atualizaF7611B(retornoVO);
								}

							} else {
								retornoVO.getF76b01te().setFHB76EST(retornoVO.getF76b01te().getFHB76EST());
							}
						}
						if (atualizaF55IJC80() > 0) {
							atualizaF76B01TE(retornoVO);
						}
					}
//					} else {						
//						atualizaStatusErro = true;					
//					}
				}

			} else {
				// atualizaStatusErro = true;
//				atualizaF55IJC80();
//				atualizaF76B01TEErro(retornoVO);
				log.info("##Nao ha dados do retorno da SEFAZ");
			}

		} else {
			atualizaStatusErro = true;
			log.info("++ Cadastro Consulta Generica: Nao ha codigo de autenticacaoo ++");
		}

		if (atualizaStatusErro) {
			atualizaErro(retornoVO, f7611List);
		}

	}

	private void atualizaErro(RetornoVO retornoVO, List<F7611B> f7611List) {
		// TODO Auto-generated method stub
		log.info("++ Atualizando notas com erro ++");
		/*
		 * Atualizar 7611b e a 4211 F7611B.NXTR = 614 F4211.NXTR = 614 O LTTR deve ser o
		 * 616 EV15 da 80 passa a receber F, falha, para atualizar
		 */

		retornoVO.getHeader().setJCEV15("F");

		for (F7611B f7611bER : f7611List) {

			retornoVO.setF7611b(f7611bER);
			retornoVO.getF7611b().setFDTDAY(Long.parseLong(DateUtil.getTimetoJDE(new Date())));
			retornoVO.getF7611b().setFDUPMJ(Long.valueOf(DateUtil.convertToJulian(new Date())));
			retornoVO.getF7611b().setFDPID("IJCRET");
			retornoVO.getF7611b().setFDUSER("IJC");
			retornoVO.getF7611b().setFDJOBN("WEBSERV");
			retornoVO.getF7611b().setFDNXTR("614");
			retornoVO.getF7611b().setFDLTTR("616");

			if (f7611bER.getFDDOCO() != 0) {
				F4211 f4211ER = new F4211();
				f4211ER = f4211Dao.getF4211byKey(f7611bER);

				retornoVO.setF4211(f4211ER);
				retornoVO.getF4211().setSDTDAY(Long.parseLong(DateUtil.getTimetoJDE(new Date())));
				retornoVO.getF4211().setSDUPMJ(Long.valueOf(DateUtil.convertToJulian(new Date())));
				retornoVO.getF4211().setSDPID("IJCRET");
				retornoVO.getF4211().setSDUSER("IJC");
				retornoVO.getF4211().setSDJOBN("WEBSERV");
				retornoVO.getF4211().setSDNXTR("614");
				retornoVO.getF4211().setSDLTTR("616");

				if (retornoVO.getF4211() != null) {
					atualizaF4211(retornoVO);
					atualizaF7611B(retornoVO);
				} else {
					atualizaF7611B(retornoVO);
				}
			}
		}
		atualizaF55IJC80();
		atualizaF76B01TEErro(retornoVO);
	}

	private void atualizaF76B01TEErro(RetornoVO retornoVO) {
		try {
			f76B01TEDao.updateF76b01teErro(retornoVO.getF76b01te());
		} catch (Exception e) {
			log.error("## Erro Retorno NFSe: " + e);
			e.printStackTrace();
		}

	}

	/*
	 * private void insereHistorico(F4211 f4211) { try { F42199Dao dao = new
	 * F42199Dao(F42199.class); dao.insertHistorico(f4211); } catch (Exception e) {
	 * log.error("## Erro Retorno NFe: " + e); e.printStackTrace(); } }
	 */

	public int atualizaF55IJC80() {
		int linhas = 0;
		try {
			linhas = f55IJC80Dao.updateF55IJC80Retorno(retornoVO.getHeader());
		} catch (Exception e) {
			log.error("## Erro Retorno NFSe: " + e);
			e.printStackTrace();
		}
		return linhas;
	}

	public void atualizaF76B01TE(RetornoVO retornoVO) {
		try {
			f76B01TEDao.updateF76b01te(retornoVO.getF76b01te());
		} catch (Exception e) {
			log.error("## Erro Retorno NFSe: " + e);
			e.printStackTrace();
		}
	}

	public void atualizaF7611B(RetornoVO retornoVO) {
		try {
			f7611BDao.updateF7611B(retornoVO.getF7611b());

		} catch (Exception e) {
			log.error("## Erro Retorno NFSe: " + e);
			e.printStackTrace();
		}

	}

	public void atualizaF4211(RetornoVO retornoVO) {
		try {
			f4211Dao.updateF4211(retornoVO.getF7611b(), retornoVO.getF4211());
		} catch (Exception e) {
			log.error("## Erro Retorno NFSe: " + e);
			e.printStackTrace();
		}
	}

//	private void atualizaF42119(RetornoVO retornoVO2) {
//		// TODO Auto-generated method stub
//		try {
//			f42119Dao.updateF42119(retornoVO.getF7611b(), retornoVO.getF42119());
//		} catch (Exception e) {
//			log.error("## Erro Retorno NFSe: " + e);
//			e.printStackTrace();
//		}
//	}

}
