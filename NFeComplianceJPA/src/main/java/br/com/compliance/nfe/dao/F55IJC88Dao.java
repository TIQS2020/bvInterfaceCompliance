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
import br.com.compliance.nfe.jde.domain.F55IJC88;
import br.com.compliance.nfe.jpa.EntityManagerHelper;

public class F55IJC88Dao {
	
	
	public List<F55IJC88> listF55IJC88ById(F55IJC80Id id){
		
		
		CriteriaBuilder cb = EntityManagerHelper.getEntityManager().getCriteriaBuilder();
		CriteriaQuery<F55IJC88> cQuery = cb.createQuery(F55IJC88.class);
		Root<F55IJC88> cabecalho = cQuery.from(F55IJC88.class);
		
		Expression<F55IJC88> eJCBNNF = cabecalho.get("JCBNNF");
		Expression<F55IJC88> eJCBSER = cabecalho.get("JCBSER");
		Expression<F55IJC88> eJCN001 = cabecalho.get("JCN001");
		Expression<F55IJC88> eJCDCT = cabecalho.get("JCDCT");
		
		Predicate pJCBNNF = cb.equal(eJCBNNF, id.getJCBNNF());
		Predicate pJCBSER = cb.equal(eJCBSER, id.getJCBSER());
		Predicate pJCN001 = cb.equal(eJCN001, id.getJCN001());
		Predicate pJCDCT = cb.equal(eJCDCT, id.getJCDCT());
		
		Predicate predicate = cb.and(pJCBNNF,pJCBSER,pJCN001,pJCDCT);
		
		cQuery.select(cabecalho);
		cQuery.where(predicate);
		
		TypedQuery<F55IJC88> query = EntityManagerHelper.getEntityManager().createQuery(cQuery);
		query.setHint(QueryHints.CACHE_STORE_MODE, CacheStoreMode.REFRESH);
		List<F55IJC88> listF55IJC88 = null;
		
		if(!query.getResultList().isEmpty()){
			listF55IJC88 = query.getResultList();
		}
		
		EntityManagerHelper.closeEntityManager();
		
		return listF55IJC88;
		
		/*
		
		List<F55IJC88> listF55IJC88 = null;
		
		String sql = "SELECT f55IJC88 FROM F55IJC88 f55IJC88 "
				+ "WHERE f55IJC88.JCBNNF = :JCBNNF "
				+ "AND f55IJC88.JCBSER = :JCBSER "
				+ "AND f55IJC88.JCN001 = :JCN001 "
				+ "AND f55IJC88.JCDCT = :JCDCT";
				
		Query query = JPAUtil.getEntityManager().createQuery(sql);	
		query.setParameter("JCBNNF", id.getJCBNNF());
		query.setParameter("JCBSER", id.getJCBSER());
		query.setParameter("JCN001", id.getJCN001());
		query.setParameter("JCDCT", id.getJCDCT());
		
		try{
			listF55IJC88 = query.getResultList();
		}catch(NoResultException ex){
			
		}		
		
		return listF55IJC88;
		*/
	}

}
