package br.com.bv.nfe.vo.nfMercantil;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.axis.types.NonNegativeInteger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import br.com.bv.vo.EmissaoVO;
import br.com.compliance.nfe.jde.domain.F55IJC71;
import br.com.compliance.nfe.jde.domain.F55IJC72;
import br.com.compliance.nfe.jde.domain.F55IJC74;
import br.com.compliance.nfe.util.DateUtil;
import br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.NfSe;
import br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpDestinatario;
import br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpEmitente;
import br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpInforAdic;
import br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpItens;
import br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpTotaisNf;
import br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpTransp;
import br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.TpCpfCnpj;

public class NfMercantilTerceirosVO {
	
	private static final Logger log = LogManager.getLogger(NfMercantilTerceirosVO.class.getClass());			
	
	public static NfSe montaNfe(EmissaoVO e) throws Exception{
		
		log.info("## Montando NFe ##");
		
		DateUtil dateUtil = new DateUtil();		
		
		TpCpfCnpj cpfCnpj = new TpCpfCnpj();
		if(!"".equals(e.getHeader().getJCBCPT()) && e.getHeader().getJCBCPT() != null){
			cpfCnpj.setCpf(e.getHeader().getJCBCPT());
		}else if(!"".equals(e.getHeader().getJCBCGT()) && e.getHeader().getJCBCGT() != null){
			cpfCnpj.setCnpj(e.getHeader().getJCBCGT());
		}		
					
		TpDestinatario destinatario = null;		
		TpTransp transp = null;
		TpEmitente emitente = null;
		
		/*
		 * destinatario = 1
		 * local de retirada = 2
		 * local de entrega = 3
		 * transporte = 4
		 * emitente = 5
		 * */			
		
		for(F55IJC74 part : e.getParticipanteNFeList()){			
			if(part.getJCIA01() == 1){
				destinatario = TpDestinatarioVO.montaDestinatario(e.getHeader(),part);				
			}else if(part.getJCIA01() == 5){				
				emitente = TpEmitenteVO.montaEmitente(e.getHeader(),part);		
			}	
		}			
		
		TpTotaisNf totaisNf = TpTotaisNfVO.montaTotaisNf(e.getHeader());	
				
		TpInforAdic[] inforAdicArray = null; 
		if(e.getMenssagemNFeList() != null){
			inforAdicArray = new TpInforAdic[1];
			StringBuilder sbInforAdic = new StringBuilder();
			for(F55IJC72 i : e.getMenssagemNFeList()){		
				sbInforAdic.append(i.getJCAPTA());			
			}
			TpInforAdic infoA = TpInforAdicVO.montaInforAdic(sbInforAdic);
			inforAdicArray[0] = infoA;
		}		
						
	
		List<TpItens> listItens = new ArrayList<TpItens>();
		int i = 1;
		for(F55IJC71 it : e.getDetalheNFeList()){			
			TpItens item = TpItensVO.montaItem(it, e.getHeader(), i);
			listItens.add(item);
			i++;				
		}	
		
		NfSe nfe = new NfSe();					
		nfe.setCpfCnpj(cpfCnpj);
		nfe.setDmIndOper(new NonNegativeInteger(e.getHeader().getJCEV07()));
		nfe.setDmIndEmit(new NonNegativeInteger(e.getHeader().getJCEV02().toString()));
		nfe.setCodPart(e.getHeader().getJCAN8V().toString());
		nfe.setCodigoModeloFiscal(e.getHeader().getJCB76MOTY());
		//nfe.setSerie(e.getHeader().getJCB76SNF().trim());
		nfe.setSerie(e.getHeader().getJCBSER().trim());
		//nfe.setNroNf(new NonNegativeInteger(e.getHeader().getJCBNNF().toString()));
		nfe.setNroNf(new NonNegativeInteger(e.getHeader().getJCBRPB().toString()));
		nfe.setSitDocto("00");
		nfe.setCodNatOper(e.getHeader().getJCAA10());
		nfe.setDescrNatOper(e.getHeader().getJCWTXT());
		nfe.setDmIndPag("".equals(e.getHeader().getJCEV01()) ? new NonNegativeInteger("0") : new NonNegativeInteger(e.getHeader().getJCEV01()));				
		nfe.setDtEmiss(dateUtil.getDateFormated((dateUtil.julianToRegular(e.getHeader().getJCISSU()))));
		/*modifica��o lindem 14/07*/
		nfe.setDtSaiEnt(dateUtil.getDateFormated((dateUtil.julianToRegular(String.valueOf(e.getHeader().getJCADDJ())))));
		nfe.setNroChaveNfe(e.getHeader().getJCB76AKEY());
		nfe.setCidadeIbgeEmit(emitente.getCidadeIbge());
		/*fim das modifica��es*/
		
		if(!"".equalsIgnoreCase(e.getHeader().getJCID1().trim())){
			nfe.setNfEmpenho(e.getHeader().getJCID1());
		}		
		/*teste Rodrigo 28-08-2017*/
		/*dmStproc de 0 para 4*/
		nfe.setDmStProc(new BigInteger("4"));
		nfe.setDmLegado(new NonNegativeInteger("1"));
		/*fim*/
		nfe.setDmFinNFe("".equals(e.getHeader().getJCEV03()) ? new NonNegativeInteger("0") : new NonNegativeInteger(e.getHeader().getJCEV03()));
		
		nfe.setUfIbgeEmit(e.getHeader().getJCAA07()); //TODO: anteriomente como header.getJCAA02() ==> JCADDS
		nfe.setDmIdDest("".equals(e.getHeader().getJCEV04().toString()) ? new NonNegativeInteger("0") : new NonNegativeInteger(e.getHeader().getJCEV04().toString()));
		nfe.setDmIndFinal("".equals(e.getHeader().getJCEV05().toString()) ? new NonNegativeInteger("0") : new NonNegativeInteger(e.getHeader().getJCEV05().toString()));
		nfe.setDmIndPres("".equals(e.getHeader().getJCEV06().toString()) ? new NonNegativeInteger("0") : new NonNegativeInteger(e.getHeader().getJCEV06().toString()));
		
		/*TODO: comentado xml*/
		//nfe.setComplNf(complNf);
		if(emitente != null){
			nfe.setEmitente(emitente);
		}
		if(destinatario != null){
			nfe.setDestinatario(destinatario);
		}			
		nfe.setTotaisNf(totaisNf);	
		
		transp = TpTranspVO.montaTransporte(e.getHeader());
		nfe.setTransp(transp);			
		
		nfe.setItens(Arrays.copyOf(listItens.toArray(), listItens.toArray().length,TpItens[].class ));	
		
		log.info("+ NFe: " + nfe.toString());
		
		return nfe;		
	}

}
