package br.com.bv.nfe.vo.nfEFD;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.axis.types.NonNegativeInteger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import br.com.bv.nfe.vo.nfEFD.tpParticipante.TpParticipanteVO;
import br.com.bv.vo.EmissaoVO;
import br.com.compliance.nfe.jde.domain.F55IJC71;
import br.com.compliance.nfe.jde.domain.F55IJC74;
import br.com.compliance.nfe.util.DateUtil;
import br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServicos.NfServicos;
import br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServicos.TpDuplicatas;
import br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServicos.TpFatura;
import br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServicos.TpInterServ;
import br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServicos.TpItens;
import br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServicos.TpParticipante;
import br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.TpCpfCnpj;

public class NfServicoEFDVO {
	
	private static final Logger log = LogManager.getLogger(NfServicoEFDVO.class.getClass());			
	
	public static NfServicos montaNfe(EmissaoVO e) throws Exception{
		
		log.info("## Montando NFe ##");
		
		DateUtil dateUtil = new DateUtil();		
		
		TpCpfCnpj cpfCnpj = new TpCpfCnpj();
		if(!"".equals(e.getHeader().getJCBCPT()) && e.getHeader().getJCBCPT() != null){
			cpfCnpj.setCpf(e.getHeader().getJCBCPT());
		}else if(!"".equals(e.getHeader().getJCBCGT()) && e.getHeader().getJCBCGT() != null){
			cpfCnpj.setCnpj(e.getHeader().getJCBCGT());
		}			
		
		/*
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
		*/
		
		TpParticipante tpParticipante = null;
		if(e.getParticipanteNFeList() != null){
			for(F55IJC74 part : e.getParticipanteNFeList()){
				if(part.getJCIA01() == 1){					
					tpParticipante = TpParticipanteVO.montaParticipante(part, e);
				}
			}
		}
	
		List<TpItens> listItens = new ArrayList<TpItens>();
		int i = 1;
		for(F55IJC71 it : e.getDetalheNFeList()){			
			TpItens item = TpItensVO.montaItem(it, e.getHeader(), i);
			listItens.add(item);
			i++;				
		}	
		
		NfServicos nfe = new NfServicos();					
		nfe.setCpfCnpj(cpfCnpj);
		//nfe.setDmIndOper(new NonNegativeInteger(e.getHeader().getJCEV07()));
		nfe.setDmIndOper(new NonNegativeInteger("0"));
		//nfe.setDmIndEmit(new NonNegativeInteger(e.getHeader().getJCEV02().toString())); 
		nfe.setDmIndEmit(new NonNegativeInteger("1")); 
		nfe.setCodPart(e.getHeader().getJCAN8V().toString());
		nfe.setCodigoModeloFiscal("99");
		//nfe.setSerie(e.getHeader().getJCB76SNF().trim());
		nfe.setSerie(e.getHeader().getJCBSER().trim());
		nfe.setNroNf(new NonNegativeInteger(e.getHeader().getJCBNNF().toString()));
		
		/*TODO:[Mapeamento] Campos em vermelho na planilha*/
		/*
		nfe.setSubSerie(subSerie);
		nfe.setSitDocto("00");
		nfe.setDtExeServ(dtExeServ);
		nfe.setDmNatOper(dmNatOper);
		nfe.setDmTipoRps(dmTipoRps);
		nfe.setDmStatusRps(dmStatusRps);
		nfe.setNroRpsSubst(nroRpsSubst);
		nfe.setSerieRpsSubst(serieRpsSubst);
		nfe.setCdCidadeModFiscal(cdCidadeModFiscal);
		*/
		
		nfe.setSitDocto("00");
		nfe.setDtEmiss(dateUtil.getDateFormated((dateUtil.julianToRegular(e.getHeader().getJCISSU()))));
		nfe.setDtSaiEnt(dateUtil.getDateFormated((dateUtil.julianToRegular(String.valueOf(e.getHeader().getJCADDJ())))));
		//nfe.setChaveNfse(e.getHeader().getJCB76AKEY());
		//nfe.setDmIndPag("".equals(e.getHeader().getJCEV01()) ? new NonNegativeInteger("0") : new NonNegativeInteger(e.getHeader().getJCEV01()));				
		nfe.setDmIndPag(new NonNegativeInteger("0"));
		nfe.setDmNatOper(new NonNegativeInteger("1"));
		
		nfe.setDmStProc(new BigInteger("0"));
		//nfe.setSistOrig("");
		//nfe.setUnidOrg("JDE");
		//nfe.setDmLegado(new NonNegativeInteger("1"));
				
		nfe.setItens(Arrays.copyOf(listItens.toArray(), listItens.toArray().length,TpItens[].class ));
		
		TpInterServ interServ = new TpInterServ();
		
		/*TODO:[Mapeamento]*/
		/*
		interServ.setNome(nome);
		interServ.setCpfCnpj(cpfCnpj);
		interServ.setInscricaoMunicipal(inscricaoMunicipal);
		nfe.setInterServ(interServ);
				
		TpDetConstrCivil detConstrCivil = new TpDetConstrCivil();
		detConstrCivil.setCodObra(codObra);
		detConstrCivil.setDmIndObra(dmIndObra);
		detConstrCivil.setNroArt(nroArt);
		detConstrCivil.setNroCno(nroCno);
		nfe.setDetConstrCivil(detConstrCivil);
		*/
		
		if(tpParticipante != null){
			nfe.setParticipante(tpParticipante);
		}	
		
		TpFatura fatura = new TpFatura();
		fatura.setNroFatura(e.getHeader().getJCBNNF() + e.getHeader().getJCBSER());
		List<TpDuplicatas> duplicatas = new ArrayList<TpDuplicatas>();
		
		
		//fatura.setDuplicatas(duplicatas);
		
		log.info("+ NFe: " + nfe.toString());
		
		return nfe;		
	}

}
