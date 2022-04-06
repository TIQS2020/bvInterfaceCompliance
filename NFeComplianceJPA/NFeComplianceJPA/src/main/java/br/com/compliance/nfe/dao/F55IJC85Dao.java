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

import br.com.compliance.nfe.jde.domain.F55IJC80Id;
import br.com.compliance.nfe.jde.domain.F55IJC85;
import br.com.compliance.nfe.jpa.EntityManagerHelper;

public class F55IJC85Dao {
	
	
	public List<F55IJC85> listF55IJC85ById(F55IJC80Id id){
		
		CriteriaBuilder cb = EntityManagerHelper.getEntityManager().getCriteriaBuilder();
		CriteriaQuery<F55IJC85> cQuery = cb.createQuery(F55IJC85.class);
		Root<F55IJC85> cabecalho = cQuery.from(F55IJC85.class);
		
		Expression<F55IJC85> eJCBNNF = cabecalho.get("JCBNNF");
		Expression<F55IJC85> eJCBSER = cabecalho.get("JCBSER");
		Expression<F55IJC85> eJCN001 = cabecalho.get("JCN001");
		Expression<F55IJC85> eJCDCT = cabecalho.get("JCDCT");
		
		Predicate pJCBNNF = cb.equal(eJCBNNF, id.getJCBNNF());
		Predicate pJCBSER = cb.equal(eJCBSER, id.getJCBSER());
		Predicate pJCN001 = cb.equal(eJCN001, id.getJCN001());
		Predicate pJCDCT = cb.equal(eJCDCT, id.getJCDCT());
		
		Predicate predicate = cb.and(pJCBNNF,pJCBSER,pJCN001,pJCDCT);
		
		cQuery.select(cabecalho);
		cQuery.where(predicate);
		
		TypedQuery<F55IJC85> query = EntityManagerHelper.getEntityManager().createQuery(cQuery);
		query.setHint(QueryHints.CACHE_STORE_MODE, CacheStoreMode.REFRESH);
		List<F55IJC85> listF55IJC85 = null;
		
		if(!query.getResultList().isEmpty()){
			listF55IJC85 = query.getResultList();
		}		
		
		EntityManagerHelper.closeEntityManager();
		
		return listF55IJC85;
		
		/*
		List<F55IJC85> listF55IJC85 = null;
		
		String sql = "SELECT f55IJC85 FROM F55IJC85 f55IJC85 "
				+ "WHERE f55IJC85.JCBNNF = :JCBNNF "
				+ "AND f55IJC85.JCBSER = :JCBSER "
				+ "AND f55IJC85.JCN001 = :JCN001 "
				+ "AND f55IJC85.JCDCT = :JCDCT";
				
		Query query = JPAUtil.getEntityManager().createQuery(sql);	
		query.setParameter("JCBNNF", id.getJCBNNF());
		query.setParameter("JCBSER", id.getJCBSER());
		query.setParameter("JCN001", id.getJCN001());
		query.setParameter("JCDCT", id.getJCDCT());
		
		try{
			listF55IJC85 = query.getResultList();
		}catch(NoResultException ex){
			
		}	
		
		return listF55IJC85;
		*/
	}

}
