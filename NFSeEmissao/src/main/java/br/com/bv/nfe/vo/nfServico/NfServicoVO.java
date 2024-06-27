package br.com.bv.nfe.vo.nfServico;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.axis.types.NonNegativeInteger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import br.com.bv.vo.EnvioVO;
import br.com.compliance.nfe.dao.F55IJC02Dao;
import br.com.compliance.nfe.jde.domain.F55IJC02;
import br.com.compliance.nfe.jde.domain.F55IJC81;
import br.com.compliance.nfe.jde.domain.F55IJC83;
import br.com.compliance.nfe.jde.domain.F55IJC84;
import br.com.compliance.nfe.jde.domain.F55IJC86;
import br.com.compliance.nfe.util.DateUtil;
import br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpNFRef;
import br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServicos.NfServicos;
import br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServicos.TpDuplicatas;
import br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServicos.TpFatura;
import br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServicos.TpInforAdic;
import br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServicos.TpItens;
import br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServicos.TpNfProcReinf;
import br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServicos.TpParticipante;
import br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.TpCpfCnpj;

public class NfServicoVO {

	private static final Logger log = LogManager.getLogger(NfServicoVO.class.getClass());
	private F55IJC02Dao f55IJC02Dao = new F55IJC02Dao();

	public NfServicos montaNfSe(EnvioVO e) throws Exception {

		log.info("## Montando NFSe ##");

		DateUtil dateUtil = new DateUtil();

		TpCpfCnpj cpfCnpj = new TpCpfCnpj();

		if (!"".equals(e.getHeader().getJCBCPF()) && e.getHeader().getJCBCPF() != null)
			cpfCnpj.setCpf(e.getHeader().getJCBCPF());
		else if (!"".equals(e.getHeader().getJCBCGF()) && e.getHeader().getJCBCGF() != null)
			cpfCnpj.setCnpj(e.getHeader().getJCBCGF());

		TpParticipante participante = null;
		//boolean exportacao = false;
		String cnae84 = "";
		for (F55IJC84 part : e.getParticipanteNFeList()) {
			if (part.getJCIA01() == 1) {
				participante = TpParticipanteVO.montaTpParticipante(part, e.getHeader().getJCADDS());
				cnae84 = part.getJCAA10();
			}
			/*
			if(!"1058".equalsIgnoreCase(part.getJCKA01().toString())) {
				exportacao = true;
			}
			*/
		}

		List<TpNFRef> nfRefList = null;
		if (e.getReferenciaNFeList() != null) {
			nfRefList = new ArrayList<TpNFRef>();
			for (F55IJC86 nfr : e.getReferenciaNFeList()) {
				TpNFRef n = TpNFRefVO.montaNfRef(nfr, e.getHeader());
				nfRefList.add(n);
			}
		}		
		
		TpInforAdic[] inforAdicArray = null;
		
		// TODO: Questionar a montagem desse objeto
		int i = 0;
		List<TpItens> listItens = new ArrayList<TpItens>();
		//TpDetConstrCivil detConstrCivil = null;
		TpNfProcReinf[] nfProcReinfArray = null;

		if (e.getDetalheNFeList() != null) {			
			for (F55IJC81 f55ijc81 : e.getDetalheNFeList()) {
				boolean montaDescricao = false;
				
				if("1".equalsIgnoreCase(f55ijc81.getJCEV08())) {
					montaDescricao = true;
				}else {
					if(!"".equalsIgnoreCase(f55ijc81.getJCNOTTE().trim())) {
						inforAdicArray = new TpInforAdic[1];										
						TpInforAdic infoA = TpInforAdicVO.montaInforAdic(f55ijc81);
						inforAdicArray[0] = infoA;	
					}
				}
				
										
				
				TpItens item = TpItensVO.montaItem(f55ijc81, e.getHeader(), montaDescricao, ++i, cnae84);
				listItens.add(item);

				//detConstrCivil = TpDetConstrCivilVO.montaTpDetConstrCivil(f55ijc81);
				
				if(!"".equalsIgnoreCase(f55ijc81.getJCB76APID()) && 
						("1".equalsIgnoreCase(f55ijc81.getJCPEID()) || "2".equalsIgnoreCase(f55ijc81.getJCPEID()))) {
					nfProcReinfArray = new TpNfProcReinf[1];

					TpNfProcReinf nfProcReinf = TpNfProcReinfVO.montaTpNfProcReinf(f55ijc81);
					nfProcReinfArray[0] = nfProcReinf;
				}
			}
		}

		// TODO: Questionar a montagem desse objeto

//		TpDetConstrCivil detConstrCivil = null;
//
//		for (F55IJC81 f55ijc81 : e.getDetalheNFeList()) {
//			detConstrCivil = TpDetConstrCivilVO.montaTpDetConstrCivil(f55ijc81);
//		}
//
//		TpNfProcReinf[] nfProcReinfArray = null;
//		for (F55IJC81 f55ijc81 : e.getDetalheNFeList()) {
//			nfProcReinfArray = new TpNfProcReinf[1];
//			TpNfProcReinf nfProcReinf = TpNfProcReinfVO.montaTpNfProcReinf(f55ijc81);
//			nfProcReinfArray[0] = nfProcReinf;
//		}
		
		/*TODO: DUPLICATA*/
		TpFatura fatura = new TpFatura();
		List<TpDuplicatas> dList = new ArrayList<TpDuplicatas>();
		int nroFatura = 0;
		for(F55IJC83 venc : e.getVencimentoNFeList()) {
			nroFatura = venc.getJCNSP();
			TpDuplicatas d = new TpDuplicatas();
			d.setDtVencto(dateUtil.getDateFormated((dateUtil.julianToRegular(venc.getJCDDJ()))));
			d.setNroParcela(venc.getJCKI03());
			d.setVlDuplicata(venc.getJCAEXP().divide(new BigDecimal("100")));			
			dList.add(d);	
		}
		TpDuplicatas[] duplicatasList = Arrays.copyOf(dList.toArray(), dList.toArray().length, TpDuplicatas[].class);
		fatura.setDuplicatas(duplicatasList);	
		fatura.setNroFatura(String.valueOf(nroFatura));

		NfServicos nota = new NfServicos();
		
		nota.setFatura(fatura);

		nota.setItens(Arrays.copyOf(listItens.toArray(), listItens.toArray().length,TpItens[].class));
		if(inforAdicArray != null) {
			nota.setInforAdic(inforAdicArray);
		}		
		nota.setParticipante(participante);
		//nota.setDetConstrCivil(detConstrCivil);
		nota.setNfProcReinf(nfProcReinfArray);

		nota.setCpfCnpj(cpfCnpj);
		nota.setDmIndOper(new NonNegativeInteger(e.getHeader().getJCEV07()));
		nota.setDmIndEmit(new NonNegativeInteger(e.getHeader().getJCEV02().toString()));
		nota.setCodPart(e.getHeader().getJCAN8().toString());
		nota.setCodigoModeloFiscal("99");
		nota.setSerie(String.valueOf(Integer.parseInt(e.getHeader().getJCBSER())));
		nota.setNroNf(new NonNegativeInteger(e.getHeader().getJCBNNF().toString()));
		nota.setDtEmiss(dateUtil.getDateFormated((dateUtil.julianToRegular(e.getHeader().getJCISSU()))));
		if(!"".equalsIgnoreCase(e.getHeader().getJCADSD()) && !"0".equalsIgnoreCase(e.getHeader().getJCADSD())) {
			nota.setDtSaiEnt(dateUtil.getDateFormated((dateUtil.julianToRegular(e.getHeader().getJCADSD()))));
		}		
		nota.setSitDocto("00");
		nota.setDmIndPag("".equals(e.getHeader().getJCEV01()) ? new NonNegativeInteger("0")
				: new NonNegativeInteger(e.getHeader().getJCEV01()));
		/*
		if(exportacao) {
			nota.setDmNatOper(new NonNegativeInteger("1"));
		}else {
			nota.setDmNatOper(new NonNegativeInteger(e.getHeader().getJCEV16()));
		}
		*/
		nota.setDmNatOper(new NonNegativeInteger(e.getHeader().getJCEV16()));

		nota.setDmTipoRps(new NonNegativeInteger("1"));
		nota.setDmStatusRps(new NonNegativeInteger(e.getHeader().getJCEV17()));
		nota.setNroRpsSubst(new NonNegativeInteger(e.getHeader().getJCCDCID()));
		nota.setSerieRpsSubst(e.getHeader().getJCA202());
		nota.setDmStProc(BigInteger.ZERO);
		nota.setSistOrig("JDE");
		nota.setDmLegado(new NonNegativeInteger(e.getHeader().getJCLEG()));
		
		if(new NonNegativeInteger(e.getHeader().getJCLEG()).compareTo(new BigInteger("1")) == 0) {
			//nota.setNroAutNfs(e.getHeader().getJCERN());
			
			List<F55IJC02> f55ijc02List = new ArrayList<F55IJC02>();
			f55ijc02List = f55IJC02Dao.getF55IJC02byStatus(e.getId());
			String eln = f55ijc02List.get(0).getJCB76ELN();
			String elnd = f55ijc02List.get(0).getJCB76ELND();
			String eref = f55ijc02List.get(0).getJCB76EREF();
			nota.setChaveNfse(eref);
			nota.setNroAutNfs(eln);
			nota.setDtAutNfs(dateUtil.getDateFormated((dateUtil.julianToRegular(elnd))));
		}else if(new NonNegativeInteger(e.getHeader().getJCLEG()).compareTo(new BigInteger("3")) == 0) {			
			List<F55IJC02> f55ijc02List = new ArrayList<F55IJC02>();
			f55ijc02List = f55IJC02Dao.getF55IJC02byStatus(e.getId());
			String eln = f55ijc02List.get(0).getJCB76ELN();
			String elnd = f55ijc02List.get(0).getJCB76ELND();
			String eref = f55ijc02List.get(0).getJCB76EREF();
			nota.setSitDocto("02");
			nota.setChaveNfse(eref);
			nota.setNroAutNfs(eln);
			nota.setDtAutNfs(dateUtil.getDateFormated((dateUtil.julianToRegular(elnd))));
			nota.setDmStatusRps(new NonNegativeInteger("2"));
		}
		
		if(!"".equalsIgnoreCase(e.getHeader().getJCCDCID())) {
			nota.setNroRpsSubst(new NonNegativeInteger(e.getHeader().getJCCDCID()));
		}
		
		if(!"".equalsIgnoreCase(e.getHeader().getJCA202())) {
			nota.setSerieRpsSubst(e.getHeader().getJCA202());
		}
		

		return nota;
	}

}
