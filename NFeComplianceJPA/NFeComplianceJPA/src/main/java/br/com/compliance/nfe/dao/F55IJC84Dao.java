package br.com.compliance.nfe.dao;

import java.util.List;

import javax.persistence.CacheStoreMode;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.eclipse.persistence.config.QueryHints;

import br.com.compliance.nfe.jde.domain.F55IJC80;
import br.com.compliance.nfe.jde.domain.F55IJC80Id;
import br.com.compliance.nfe.jde.domain.F55IJC84;
import br.com.compliance.nfe.jpa.EntityManagerHelper;

public class F55IJC84Dao {
	
	
	public List<F55IJC84> listF55IJC84ById(F55IJC80Id id){	
		
		CriteriaBuilder cb = EntityManagerHelper.getEntityManager().getCriteriaBuilder();
		CriteriaQuery<F55IJC84> cQuery = cb.createQuery(F55IJC84.class);
		Root<F55IJC84> cabecalho = cQuery.from(F55IJC84.class);
		
		Expression<F55IJC84> eJCBNNF = cabecalho.get("JCBNNF");
		Expression<F55IJC84> eJCBSER = cabecalho.get("JCBSER");
		Expression<F55IJC84> eJCN001 = cabecalho.get("JCN001");
		Expression<F55IJC84> eJCDCT = cabecalho.get("JCDCT");
		
		Predicate pJCBNNF = cb.equal(eJCBNNF, id.getJCBNNF());
		Predicate pJCBSER = cb.equal(eJCBSER, id.getJCBSER());
		Predicate pJCN001 = cb.equal(eJCN001, id.getJCN001());
		Predicate pJCDCT = cb.equal(eJCDCT, id.getJCDCT());
		
		Predicate predicate = cb.and(pJCBNNF,pJCBSER,pJCN001,pJCDCT);
		
		cQuery.select(cabecalho);
		cQuery.where(predicate);
		
		TypedQuery<F55IJC84> query = EntityManagerHelper.getEntityManager().createQuery(cQuery);
		query.setHint(QueryHints.CACHE_STORE_MODE, CacheStoreMode.REFRESH);
		List<F55IJC84> listF55IJC84 = null;
		
		if(!query.getResultList().isEmpty()){
			listF55IJC84 = query.getResultList();
		}
		
		EntityManagerHelper.closeEntityManager();
		
		return listF55IJC84;
		/*
		
		String sql = "SELECT f55IJC84 FROM F55IJC84 f55IJC84 "
				+ "WHERE f55IJC84.JCBNNF = :JCBNNF "
				+ "AND f55IJC84.JCBSER = :JCBSER "
				+ "AND f55IJC84.JCN001 = :JCN001 "
				+ "AND f55IJC84.JCDCT = :JCDCT";
				
		Query query = JPAUtil.getEntityManager().createQuery(sql);	
		query.setParameter("JCBNNF", id.getJCBNNF());
		query.setParameter("JCBSER", id.getJCBSER());
		query.setParameter("JCN001", id.getJCN001());
		query.setParameter("JCDCT", id.getJCDCT());
		
		List<F55IJC84> listF55IJC84 = query.getResultList();
		
		return listF55IJC84;
		*/
	}

	public F55IJC84 getF55IJC84ByIdPart5(F55IJC80 id) {
		CriteriaBuilder cb = EntityManagerHelper.getEntityManager().getCriteriaBuilder();
		CriteriaQuery<F55IJC84> cQuery = cb.createQuery(F55IJC84.class);
		Root<F55IJC84> cabecalho = cQuery.from(F55IJC84.class);
		
		Expression<F55IJC84> eJCBNNF = cabecalho.get("JCBNNF");
		Expression<F55IJC84> eJCBSER = cabecalho.get("JCBSER");
		Expression<F55IJC84> eJCN001 = cabecalho.get("JCN001");
		Expression<F55IJC84> eJCDCT = cabecalho.get("JCDCT");
		
		Expression<F55IJC84> eJcia01 = cabecalho.get("JCIA01");
		
		Predicate pJCBNNF = cb.equal(eJCBNNF, id.getJCBNNF());
		Predicate pJCBSER = cb.equal(eJCBSER, id.getJCBSER());
		Predicate pJCN001 = cb.equal(eJCN001, id.getJCN001());
		Predicate pJCDCT = cb.equal(eJCDCT, id.getJCDCT());
		
		Predicate pJcia01 = cb.equal(eJcia01, "5");
		
		Predicate predicate = cb.and(pJCBNNF,pJCBSER,pJCN001,pJCDCT,pJcia01);
		
		cQuery.select(cabecalho);
		cQuery.where(predicate);
		
		TypedQuery<F55IJC84> query = EntityManagerHelper.getEntityManager().createQuery(cQuery);
		
		F55IJC84 f55IJC84 = query.getSingleResult();	
		
		EntityManagerHelper.closeEntityManager();
		
		return f55IJC84;
	}

}
