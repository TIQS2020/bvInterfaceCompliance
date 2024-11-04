package br.com.bv.nfe.controle;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.apache.axis.types.NonNegativeInteger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import br.com.compliance.nfe.dao.F55IJC80Dao;
import br.com.compliance.nfe.dao.F55IJC84Dao;
import br.com.compliance.nfe.jde.domain.F55IJC80;
import br.com.compliance.nfe.jde.domain.F55IJC84;
import br.com.compliance.nfe.jde.domain.F55IJC84Id;
import br.com.compliance.nfe.util.DateUtil;
import br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.consultaGenerica.ConsultaGenerica;
import br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.consultaGenerica.Dados;
import br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.consultaGenerica.ErroLote;
import br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.MultOrgAuthentication;
import br.com.compliancefiscal.services.integracao.services.v1.consultaGenericaService.ConsultaGenericaService_PortType;
import br.com.compliancefiscal.services.integracao.services.v1.consultaGenericaService.ConsultaGenericaService_ServiceLocator;
import br.com.compliancefiscal.services.integracao.services.v1.consultaGenericaService.ConsultarLoteRequest;
import br.com.compliancefiscal.services.integracao.services.v1.consultaGenericaService.ConsultarLoteResponse;
import br.com.nfe.control.XmlFileControl;
import br.com.nfe.xml.retorno.XmlFileRetornoRoot;
import br.com.nfe.xml.retorno.vo.CaminhosVO;
import br.com.nfe.xml.retorno.vo.Situacao;

public class RetornoControle {

	private XmlFileRetornoRoot xmlFileRetornoRoot = null;
	private MultOrgAuthentication autenticacao = null;
	private static final Logger log = LogManager.getLogger(RetornoControle.class.getName());
	private List<F55IJC80> listF55IJC80Retorno = new ArrayList<F55IJC80>();
	String retornoServiceURL;
	private F55IJC80Dao f55IJC80Dao = new F55IJC80Dao();	
	private F55IJC84Dao f55IJC84Dao = new F55IJC84Dao();
	private CaminhosVO caminhosVO = new CaminhosVO();
	SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss");

	String statusAnterior;

	public RetornoControle() {
	}

	public void inicializaProcesso(String retornoURL, CaminhosVO cVo) {

		caminhosVO.setFinalizado(cVo.getFinalizado());

		try {
			log.info("## INICIANDO PROCESSO DE RETORNO " + dateFormat.format(new Date()) + " ##");
			listF55IJC80Retorno = f55IJC80Dao.getF55IJC80Recebida();
			retornoServiceURL = retornoURL;
			log.info("## INICIANDO MONTAGEM DOS OBJETOS RETORNO ##");
			montaObjetos();
			log.info("## FINALIZANDO PROCESSO DE RETORNO "+ dateFormat.format(new Date()) + " ##");
		} catch (Exception ex) {
			log.error("## ERRO DE INTEGRACAO: ERRO NA LISTAGEM DE NOTAS - EXCECAO --> " + ex);
			for (StackTraceElement s : ex.getStackTrace()) {
				log.error(" - METODO: " + s.getFileName() + " - LINHA: " + s.getLineNumber());
			}
		}
	}

	public void montaObjetos() {

		log.info("## Montando OBjetos ##");

		if (!listF55IJC80Retorno.isEmpty()) {
			Iterator<F55IJC80> it = listF55IJC80Retorno.iterator();

			while (it.hasNext()) {

				F55IJC80 f = it.next();
				log.info("## Nota ##");
				log.info("+ Numero: " + f.getId().getJCBNNF());
				log.info("+ Serie: " + f.getId().getJCBSER());
				log.info("+ Pre Nota: " + f.getId().getJCN001());
				log.info("+ Tipo: " + f.getId().getJCDCT());

				statusAnterior = f.getJCEV15();

				try {

					xmlFileRetornoRoot = new XmlFileRetornoRoot(f.getId().getJCBNNF(), f.getId().getJCBSER(), f.getId().getJCN001(), f.getId().getJCDCT());
					xmlFileRetornoRoot.setSituacao(new Situacao());

					F55IJC84Id id = new F55IJC84Id(f.getId().getJCBNNF(), f.getId().getJCBSER(), f.getId().getJCN001().longValue(), f.getId().getJCDCT(), 5);
					F55IJC84 part = f55IJC84Dao.getF55IJC84ById(id);
					if (part != null) {
						autenticacao = new MultOrgAuthentication(part.getJCAAIL(), part.getJCDESTIN());
					}

					consultaLote(retornoServiceURL, xmlFileRetornoRoot, f);
					it.remove();

				} catch (Exception ex) {
					log.error("## ERRO DE INTEGRACAO: NOTA --> " + f.getId().getJCBNNF() + " - EXCECAO --> "
							+ ex);
					for (StackTraceElement s : ex.getStackTrace()) {
						log.error(" - METODO: " + s.getFileName() + " - LINHA: " + s.getLineNumber());
					}
					try {
						f55IJC80Dao.updateF55IJC80(f);

					} catch (Exception e) {
						log.error("## Erro Retorno NFe: " + e);
						e.printStackTrace();
					}
				}
			}

		} else {
			log.info("++ Nao ha notas para retorno.");
		}

		log.info("## Fechando o metodo de montagem de Objetos ##");

	}

	public void consultaLote(String retornoServiceURL, XmlFileRetornoRoot xmlFileRetornoRoot, F55IJC80 f) throws Exception {

		if (autenticacao != null && (f.getJCUK02().compareTo(0L) > 0)) {

			log.info("Consultando Lote: " + f.getJCUK02().toString());
			xmlFileRetornoRoot.setNroLoteIntegra(f.getJCUK02().toString());

			ConsultarLoteRequest consulta = new ConsultarLoteRequest(
					new NonNegativeInteger(f.getJCUK02().toString()), autenticacao);
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

			xmlFileRetornoRoot.getSituacao().setDescricao(lote.getDescrSitLote());
			xmlFileRetornoRoot.setJCEV15(lote.getSituacaoLote().toString());

			ErroLote erroLote = lote.getErroLote();
			if (erroLote != null) {
				String[] error = erroLote.getListaErroLote();
				if (error.length > 0) {
					log.info("++ Erro lote ++");

					for (String s : error) {
						sbError.append(s);
						log.info("+ Erro: " + s);
					}
					f.setJCEV15("E");
					f.setJCA204("E");

					String descricaoSemQuebraLinha = sbError.toString().replaceAll("\\r|\\n", " ");

					if(sbError.toString().length() < 1499){
						xmlFileRetornoRoot.getSituacao().setDescricao(descricaoSemQuebraLinha.substring(0,sbError.toString().length()));
					}else{
						xmlFileRetornoRoot.getSituacao().setDescricao(descricaoSemQuebraLinha.substring(0,1499));
					}

					xmlFileRetornoRoot.setJCEV15(lote.getSituacaoLote().toString());
					xmlFileRetornoRoot.getSituacao().setCodigo("2");
					xmlFileRetornoRoot.setJCEV15("E");
					xmlFileRetornoRoot.setJCB76EST("E");
				}
			}


			if (lote.getDados() != null && lote.getDados().length > 0) {
				log.info("++ Dados lote ++");
				for (Dados d : lote.getDados()) {

					xmlFileRetornoRoot.getSituacao().setDescricao(d.getDescrSituacao());

					if(d.getListaErroCad().length > 0){
						StringBuilder erroCadSB = new StringBuilder();
						for(String s : d.getListaErroCad()){
							erroCadSB.append(s);
						}
						xmlFileRetornoRoot.getSituacao().setDescricao(erroCadSB.toString());
					}

					if (d.getSituacao().compareTo(new NonNegativeInteger("10")) == 0) {
						xmlFileRetornoRoot.getSituacao().setCodigo("2");
						xmlFileRetornoRoot.setJCEV15("E");
						xmlFileRetornoRoot.setJCB76EST("E");
						f.setJCEV15("E");
					} else if (d.getSituacao().compareTo(new NonNegativeInteger("5")) == 0) {
						xmlFileRetornoRoot.getSituacao().setCodigo("3");
						xmlFileRetornoRoot.setJCEV15("R");
						xmlFileRetornoRoot.setJCB76EST("R");
						f.setJCA204("R");
						f.setJCEV15("R");
					}

					if ((d.getSituacao().compareTo(new NonNegativeInteger("4")) == 0)
							|| (d.getSituacao().compareTo(new NonNegativeInteger("7")) == 0)) {

						Date dateAut = new Date();
						SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
						String data = d.getChaveLogica().getDtAutNfs().substring(0, 10);
						String hora = d.getChaveLogica().getDtAutNfs().substring(11, 16);
						String dataStr = data + " " + hora;
						dateAut = dateFormat.parse(dataStr);
						if (d.getSituacao().compareTo(new NonNegativeInteger("4")) == 0) {

							xmlFileRetornoRoot.setJCB76ELN(String.valueOf(d.getChaveLogica().getNroAutNfs()));
							xmlFileRetornoRoot.setJCB76ELND(String.valueOf(DateUtil.convertToJulian(dateAut)));
							xmlFileRetornoRoot.setJCB76ELNT(DateUtil.getTimetoJDE(dateAut));
							xmlFileRetornoRoot.setJCB76EREF(d.getChaveLogica().getCodVerifNfs() == null ? "" : d.getChaveLogica().getCodVerifNfs());
							xmlFileRetornoRoot.setJCB76EST("A");
							xmlFileRetornoRoot.setJCB76ESTC("100");
							xmlFileRetornoRoot.setJCEV15("#");
							xmlFileRetornoRoot.getSituacao().setCodigo("1");
							xmlFileRetornoRoot.getSituacao().setDescricao("NOTA AUTORIZADA");
							f.setJCEV15("#");

						} else if (d.getSituacao().compareTo(new NonNegativeInteger("7")) == 0) {

							xmlFileRetornoRoot.setJCB76ELN(String.valueOf(d.getChaveLogica().getNroAutNfs()));
							xmlFileRetornoRoot.setJCB76ELND(String.valueOf(DateUtil.convertToJulian(dateAut)));
							xmlFileRetornoRoot.setJCB76ELNT(DateUtil.getTimetoJDE(dateAut));
							xmlFileRetornoRoot.setJCB76EREF(d.getChaveLogica().getCodVerifNfs());
							xmlFileRetornoRoot.setJCB76EST("C");
							xmlFileRetornoRoot.setJCB76ESTC("135");
							xmlFileRetornoRoot.setJCEV15("#");
							xmlFileRetornoRoot.getSituacao().setCodigo("4");
							xmlFileRetornoRoot.getSituacao().setDescricao("NOTA CANCELADA");
							f.setJCEV15("#");

						}
					}
				}

			} else {
				log.info("## Nao ha dados de retorno da SEFAZ ##");
			}

		} else {
			f.setJCEV15("E");
			f.setJCA204("E");
			xmlFileRetornoRoot.setJCEV15("E");
			xmlFileRetornoRoot.setJCB76EST("E");
			xmlFileRetornoRoot.getSituacao().setCodigo("2");
			xmlFileRetornoRoot.getSituacao().setDescricao("ERRO AO GERAR LOTE.");
			log.info("++ Cadastro Consulta Generica: Nao ha codigo de autenticacaoo ++");
		}

		if(!statusAnterior.equalsIgnoreCase(f.getJCEV15())){
			XmlFileControl xmlFileControl = new XmlFileControl();
			String nomeArquivo = f.getId().getJCBNNF() + "_" + f.getId().getJCBSER() + "_" + f.getId().getJCDCT() + "_" + f.getJCCO() + "_" + f.getJCAN8() + "_" + f.getJCISSU() + "_response.xml";
			xmlFileControl.objectToRetornoXml(xmlFileRetornoRoot, caminhosVO.getFinalizado() + "//" + nomeArquivo, XmlFileRetornoRoot.class);
		}

		atualizaF55IJC80(f);

	}

	public void atualizaF55IJC80(F55IJC80 f) {

		try {
			f55IJC80Dao.updateF55IJC80(f);
		} catch (Exception e) {
			log.error("## Erro Retorno NFSe: " + e);
			e.printStackTrace();
		}

	}

	
}
