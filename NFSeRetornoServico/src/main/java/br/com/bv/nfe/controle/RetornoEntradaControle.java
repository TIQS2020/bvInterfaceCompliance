package br.com.bv.nfe.controle;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.axis.types.NonNegativeInteger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import br.com.bv.nfe.vo.RetornoEntradaVO;
import br.com.compliance.nfe.dao.F55IJC70Dao;
import br.com.compliance.nfe.dao.F55IJC74Dao;
import br.com.compliance.nfe.dao.F55IJC7CDao;
import br.com.compliance.nfe.jdbc.JDBCException;
import br.com.compliance.nfe.jde.domain.F55IJC70;
import br.com.compliance.nfe.jde.domain.F55IJC70Id;
import br.com.compliance.nfe.jde.domain.F55IJC74;
import br.com.compliance.nfe.jde.domain.F55IJC7C;
import br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.consultaGenerica.ConsultaGenerica;
import br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.consultaGenerica.ErroLote;
import br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.MultOrgAuthentication;
import br.com.compliancefiscal.services.integracao.services.v1.consultaGenericaService.ConsultaGenericaService_PortType;
import br.com.compliancefiscal.services.integracao.services.v1.consultaGenericaService.ConsultaGenericaService_ServiceLocator;
import br.com.compliancefiscal.services.integracao.services.v1.consultaGenericaService.ConsultarLoteRequest;
import br.com.compliancefiscal.services.integracao.services.v1.consultaGenericaService.ConsultarLoteResponse;

public class RetornoEntradaControle {

	private RetornoEntradaVO retornoVO = null;
	private MultOrgAuthentication autenticacao = null;
	private static final Logger log = LogManager.getLogger(RetornoEntradaControle.class.getName());
	private List<F55IJC70> listF55IJC70Recebida = new ArrayList<F55IJC70>();
	private List<F55IJC7C> listF55IJC7C = new ArrayList<F55IJC7C>();
	String retornoServiceURL;
	private F55IJC70Dao f55IJC70Dao = new F55IJC70Dao();
	private F55IJC74Dao f55IJC74Dao = new F55IJC74Dao();
	private F55IJC7CDao f55IJC7CDao = new F55IJC7CDao(); 

	public RetornoEntradaControle() {
		super();
	}

	public void inicializaProcesso(String retornoURL) {	
		
		try {
			log.info("## Listando JOBS ##");
			listF55IJC7C = new ArrayList<F55IJC7C>();
			listF55IJC7C = f55IJC7CDao.getF55IJC7CRetorno();
			log.info("## Notas listadas: " + listF55IJC7C.size() + " ##");
			retornoServiceURL = retornoURL;
			montaObjetos();
		} catch (Exception ex) {
			log.error("## ERRO DE INTEGRACAO: ERRO NA LISTAGEM DE NOTAS - EXCECAO --> " + ex.getMessage());
			for (StackTraceElement s : ex.getStackTrace()) {
				log.error(" - METODO: " + s.getFileName() + " - LINHA: " + s.getLineNumber());
			}
		}
		
		/*
		try {
			log.info("## INICIANDO PROCESSO DE RETORNO ##");
			log.info("## Listando notas ##");
			listF55IJC70Recebida = f55IJC70Dao.getF55IJC70Recebida();
			retornoServiceURL = retornoURL;
			log.info("## Notas listadas: " + listF55IJC70Recebida.size() + " ##");			
			montaObjetos();
			log.info("## FINALIZANDO PROCESSO DE RETORNO ##");
		} catch (Exception ex) {
			log.error("## ERRO DE INTEGRACAO: ERRO NA LISTAGEM DE NOTAS - EXCECAO --> " + ex);
			for (StackTraceElement s : ex.getStackTrace()) {
				log.error(" - METODO: " + s.getFileName() + " - LINHA: " + s.getLineNumber());

			}
		}
		*/
	}

	public void montaObjetos() {

		log.info("## Montando OBjetos ##");
		
		for(F55IJC7C jobs : listF55IJC7C){
			
			listF55IJC70Recebida = f55IJC70Dao.getF55IJC70Recebida(jobs.getJCWJOBS());
			
			boolean processamento = false;
			
			if (!listF55IJC70Recebida.isEmpty()) {
				Iterator<F55IJC70> it = listF55IJC70Recebida.iterator();

				while (it.hasNext()) {

					try {
						F55IJC70 f = it.next();

						log.info("## Nota ##");
						log.info("+ Numero: " + f.getJCBNNF());
						log.info("+ Serie: " + f.getJCBSER());
						log.info("+ Pre Nota: " + f.getJCN001());
						log.info("+ Tipo: " + f.getJCDCT());
						log.info("+ JOB: " + f.getJCWJOBS());
						
						if(f.getJCBSER().length() == 1){
							f.setJCBSER(f.getJCBSER() + " ");
						}
						
						if(f.getJCDCT().length() == 1){
							f.setJCDCT(f.getJCDCT() + " ");
						}

						F55IJC70Id idEntrada = new F55IJC70Id(f.getJCBNNF(), f.getJCBSER(), f.getJCN001(), f.getJCDCT(), f.getJCWJOBS());

						retornoVO = new RetornoEntradaVO();
						retornoVO.setHeaderEntrada(f);
						retornoVO.setIdEntrada(idEntrada);
						
						for (F55IJC74 part : f55IJC74Dao.listF55IJC74ById(idEntrada)) {
							if (part.getJCIA01() == 1) {
								retornoVO.setCodigoMultOrg(part.getJCAAIL());
								retornoVO.setHashMultOrg(part.getJCDESTIN());
								autenticacao = new MultOrgAuthentication(part.getJCAAIL(), part.getJCDESTIN());
								break;
							}
						}

						processamento = consultaLote(retornoServiceURL);

						it.remove();

					} catch (Exception ex) {
						log.error("## ERRO DE INTEGRACAO: NOTA --> " + retornoVO.getHeaderEntrada().getJCBNNF() + " - EXCECAO --> "
								+ ex);
						for (StackTraceElement s : ex.getStackTrace()) {
							log.error(" - METODO: " + s.getFileName() + " - LINHA: " + s.getLineNumber());
						}
						try {
							f55IJC70Dao.updateF55IJC70Erro(retornoVO.getHeaderEntrada());
						} catch (Exception e) {
							log.error("## Erro Retorno NFe: " + e);
							e.printStackTrace();
						}
					}

				}

			} else {
				log.info("++ Nao ha notas para retorno.");
			}
			
			
			try {
				f55IJC7CDao.atualizaTabelaControle(jobs.getId(), true, processamento);
			} catch (JDBCException e) {
				log.error("## ERRO DE INTEGRACAO: JOB --> " + jobs.getJCWJOBS() + " EXCECAO --> " + e);
				for (StackTraceElement s : e.getStackTrace()) {
					log.error(" - METODO: " + s.getFileName() + " - LINHA: " + s.getLineNumber());
				}
			} catch (SQLException e) {
				log.error("## ERRO DE INTEGRACAO: JOB --> " + jobs.getJCWJOBS() + " EXCECAO --> " + e);
				for (StackTraceElement s : e.getStackTrace()) {
					log.error(" - METODO: " + s.getFileName() + " - LINHA: " + s.getLineNumber());
				}
			}
			
		}

		log.info("## Fechando o método de montagem de Objetos ##");

	}

	private boolean consultaLote(String retornoServiceURL2) throws Exception {
		// TODO Auto-generated method stub
		log.info("## Consulta Lote ##");

		log.info("Lote: " + retornoVO.getHeaderEntrada().getJCUK02().toString());
		log.info("Servico Retorno: " + retornoServiceURL);

		boolean retornoProcessamento = false;
		
		if (autenticacao != null) {
			ConsultarLoteRequest consulta = new ConsultarLoteRequest(
					new NonNegativeInteger(retornoVO.getHeaderEntrada().getJCUK02().toString()), autenticacao);
			ConsultaGenericaService_ServiceLocator loc = new ConsultaGenericaService_ServiceLocator();
			loc.setConsultaGenericaServiceSOAP_address(retornoServiceURL);

			ConsultaGenericaService_PortType cad = loc.getconsultaGenericaServiceSOAP();
			ConsultarLoteResponse response = cad.consultarLote(consulta);
			ConsultaGenerica lote = response.getConsultaGenerica();

			log.info("++ Retorno Consulta ++");
			log.info("+ Numero do Lote: " + lote.getNroLote());
			log.info("+ Situacao Lote: " + lote.getSituacaoLote());
			log.info("+ Descricao Situacao Lote: " + lote.getDescrSitLote());

			if (lote != null) {
				if(lote.getSituacaoLote().compareTo(new NonNegativeInteger("3")) == 0){
					retornoVO.getHeaderEntrada().setJCEV15("#");
					retornoProcessamento = true;
				}else{
					retornoVO.getHeaderEntrada().setJCEV15(String.valueOf(lote.getSituacaoLote()));
				}				
				F55IJC70 f = retornoVO.getHeaderEntrada();
				f55IJC70Dao.updateF55IJC70Retorno(f);
			}

			ErroLote erroLote = lote.getErroLote();
			String[] error = erroLote.getListaErroLote();
			if (error.length > 0) {
				log.info("++ Erro lote ++");
				for (String s : error) {
					log.info("+ Erro: " + s);
				}
			}

		}
		
		return retornoProcessamento;

	}

}
