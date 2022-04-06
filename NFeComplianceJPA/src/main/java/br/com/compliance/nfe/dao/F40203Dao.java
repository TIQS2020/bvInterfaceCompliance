package br.com.compliance.nfe.dao;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import br.com.compliance.nfe.jde.domain.F40203;
import br.com.compliance.nfe.jde.domain.F4211;
import br.com.compliance.nfe.jde.domain.F7611B;
import br.com.compliance.nfe.jpa.EntityManagerHelper;

public class F40203Dao {
	
	private static String tabela = "F40203";
	
	public F40203 getF40203Status(String DCTO, String LNTY, String TRTY){	

		CriteriaBuilder cb = EntityManagerHelper.getEntityManager().getCriteriaBuilder();
		
		CriteriaQuery<F40203> cQuery = cb.createQuery(F40203.class);
		Root<F40203> cabecalho = cQuery.from(F40203.class);
		
		Expression<F40203> eDCTO = cabecalho.get("FSDCTO");
		Expression<F40203> eLNTY = cabecalho.get("FSLNTY");
		Expression<F40203> eTRTY = cabecalho.get("FSTRTY");		
		
		Predicate pDCTO = cb.equal(eDCTO, DCTO);
		Predicate pLNTY = cb.equal(eLNTY, LNTY);
		Predicate pTRTY = cb.equal(eTRTY, TRTY);		

		Predicate predicate = cb.and(pDCTO, pLNTY, pTRTY);

		cQuery.select(cabecalho);
		cQuery.where(predicate);

		TypedQuery<F40203> query = EntityManagerHelper.getEntityManager().createQuery(cQuery);
		
		F40203 f40203 = null;
		
		if(!query.getResultList().isEmpty()){
			f40203 = new F40203();
			f40203 = query.getResultList().get(0);
		}	
		
		return f40203;		
		
	}
	
public F40203 getF40203NotaFiscalStatus(F7611B f7611b, F4211 f4211){
		
		
		CriteriaBuilder cb = EntityManagerHelper.getEntityManager().getCriteriaBuilder();
		
		CriteriaQuery<F40203> cQuery = cb.createQuery(F40203.class);
		Root<F40203> cabecalho = cQuery.from(F40203.class);
		
		Expression<F40203> eDCTO = cabecalho.get("FSDCTO");
		Expression<F40203> eLNTY = cabecalho.get("FSLNTY");
		Expression<F40203> eTRTY = cabecalho.get("FSTRTY");		
		
		Predicate pDCTO = cb.equal(eDCTO, f7611b.getFDDCT());
		Predicate pLNTY = cb.equal(eLNTY, f7611b.getFDLNTY());
		Predicate pTRTY = cb.equal(eTRTY, f7611b.getFDNXTR());		

		Predicate predicate = cb.and(pDCTO, pLNTY, pTRTY);

		cQuery.select(cabecalho);
		cQuery.where(predicate);

		TypedQuery<F40203> query = EntityManagerHelper.getEntityManager().createQuery(cQuery);
		
		F40203 f40203 = new F40203();
		
		f40203 = query.getSingleResult();
		
		return f40203;		
		
	}

}
