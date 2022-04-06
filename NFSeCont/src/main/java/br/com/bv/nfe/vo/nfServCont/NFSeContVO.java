package br.com.bv.nfe.vo.nfServCont;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.axis.types.NonNegativeInteger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import br.com.bv.vo.EmissaoNFSeContVO;
import br.com.compliance.nfe.jde.domain.F55IJC71;
import br.com.compliance.nfe.util.DateUtil;
import br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServCont.NfServCont;
import br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServCont.TpProcRef;
import br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServCont.TpRegImpostoCofins;
import br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServCont.TpRegImpostoIcms;
import br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServCont.TpRegImpostoPis;
import br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServCont.TpValores;
import br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.TpCpfCnpj;

public class NFSeContVO {
	
	private static final Logger log = LogManager.getLogger(NFSeContVO.class.getClass());			
	
	public static NfServCont montaNfe(EmissaoNFSeContVO e) throws Exception{
		
		log.info("## Montando NFSeCont ##");
		
		DateUtil dateUtil = new DateUtil();		
		
		TpCpfCnpj cpfCnpj = new TpCpfCnpj();
		if(!"".equals(e.getHeader().getJCBCPT()) && e.getHeader().getJCBCPT() != null){
			cpfCnpj.setCpf(e.getHeader().getJCBCPT());
		}else if(!"".equals(e.getHeader().getJCBCGT()) && e.getHeader().getJCBCGT() != null){
			cpfCnpj.setCnpj(e.getHeader().getJCBCGT());
		}
		
		TpValores valores = new TpValores();
		valores.setVlDoc(e.getHeader().getJCBVTN().divide(new BigDecimal("100")));
		valores.setVlDesc(e.getHeader().getJCBDES().divide(new BigDecimal("100")));
		valores.setVlServ(e.getHeader().getJCBVTN().divide(new BigDecimal("100")));
		valores.setVlServNt(e.getHeader().getJCBVTN().divide(new BigDecimal("100")));
		valores.setVlTerc(e.getHeader().getJCBVTN().divide(new BigDecimal("100")));
		valores.setVlBcIcms(e.getHeader().getJCBBCL().divide(new BigDecimal("100")));
		valores.setVlIcms(e.getHeader().getJCBICM().divide(new BigDecimal("100")));
		valores.setVlPis(e.getHeader().getJCAN01().divide(new BigDecimal("100")));
		valores.setVlCofins(e.getHeader().getJCAN02().divide(new BigDecimal("100")));
		valores.setVlDa(e.getHeader().getJCBDFN().divide(new BigDecimal("100")));		
	
		List<TpRegImpostoIcms> listTpRegImpostoIcms = new ArrayList<TpRegImpostoIcms>();		
		for(F55IJC71 it : e.getDetalheNFSeContList()){			
			TpRegImpostoIcms item = TpRegImpostoIcmsVO.montaIcms(it);
			listTpRegImpostoIcms.add(item);						
		}
		
		List<TpRegImpostoPis> listTpRegImpostoPis = new ArrayList<TpRegImpostoPis>();		
		for(F55IJC71 it : e.getDetalheNFSeContList()){			
			TpRegImpostoPis item = TpRegImpostoPisVO.montaPis(it);
			listTpRegImpostoPis.add(item);
		}
		
		List<TpRegImpostoCofins> listTpRegImpostoCofins = new ArrayList<TpRegImpostoCofins>();		
		for(F55IJC71 it : e.getDetalheNFSeContList()){			
			TpRegImpostoCofins item = TpRegImpostoCofinsVO.montaCofins(it);
			listTpRegImpostoCofins.add(item);
		}
		
		List<TpProcRef> listTpProcRef = new ArrayList<TpProcRef>();		
		for(F55IJC71 it : e.getDetalheNFSeContList()){			
			TpProcRef item = TpProcRefVO.montaProcRef(it);
			listTpProcRef.add(item);
		}
		
		NfServCont nfseCont = new NfServCont();					
		nfseCont.setCpfCnpj(cpfCnpj);
		nfseCont.setDmIndOper(new NonNegativeInteger(e.getHeader().getJCEV07()));
		nfseCont.setDmIndEmit(new NonNegativeInteger(e.getHeader().getJCEV02().toString()));
		nfseCont.setCodPart(e.getHeader().getJCAN8V().toString());
		nfseCont.setCodigoModeloFiscal("06");
		nfseCont.setSerie(e.getHeader().getJCBSER());		
		nfseCont.setNroNf(new NonNegativeInteger(e.getHeader().getJCBNNF().toString()));
		nfseCont.setSitDocto("00");		
		nfseCont.setDtEmiss(dateUtil.getDateFormated((dateUtil.julianToRegular(e.getHeader().getJCISSU()))));
		nfseCont.setDtSaiEnt(dateUtil.getDateFormated((dateUtil.julianToRegular(String.valueOf(e.getHeader().getJCADDJ())))));
		nfseCont.setValores(valores);		
		
		nfseCont.setRegImpostoIcms(Arrays.copyOf(listTpRegImpostoIcms.toArray(), listTpRegImpostoIcms.toArray().length,TpRegImpostoIcms[].class ));
		nfseCont.setRegImpostoPis(Arrays.copyOf(listTpRegImpostoPis.toArray(), listTpRegImpostoPis.toArray().length,TpRegImpostoPis[].class ));
		nfseCont.setRegImpostoCofins(Arrays.copyOf(listTpRegImpostoCofins.toArray(), listTpRegImpostoCofins.toArray().length,TpRegImpostoCofins[].class ));
		nfseCont.setProcRef(Arrays.copyOf(listTpProcRef.toArray(), listTpProcRef.toArray().length,TpProcRef[].class ));
		
		log.info("+ NFSeCont: " + nfseCont.toString());
		
		return nfseCont;		
	}

}
