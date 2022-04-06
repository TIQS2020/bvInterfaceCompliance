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
import br.com.compliance.nfe.jde.domain.F55IJC90;
import br.com.compliance.nfe.jpa.EntityManagerHelper;

public class F55IJC90Dao {
	
	public List<F55IJC90> listF55IJC90ById(F55IJC80Id id){
		
		CriteriaBuilder cb = EntityManagerHelper.getEntityManager().getCriteriaBuilder();
		CriteriaQuery<F55IJC90> cQuery = cb.createQuery(F55IJC90.class);
		Root<F55IJC90> cabecalho = cQuery.from(F55IJC90.class);
		
		Expression<F55IJC90> eJCBNNF = cabecalho.get("JCBNNF");
		Expression<F55IJC90> eJCBSER = cabecalho.get("JCBSER");
		Expression<F55IJC90> eJCN001 = cabecalho.get("JCN001");
		Expression<F55IJC90> eJCDCT = cabecalho.get("JCDCT");
		
		Predicate pJCBNNF = cb.equal(eJCBNNF, id.getJCBNNF());
		Predicate pJCBSER = cb.equal(eJCBSER, id.getJCBSER());
		Predicate pJCN001 = cb.equal(eJCN001, id.getJCN001());
		Predicate pJCDCT = cb.equal(eJCDCT, id.getJCDCT());
		
		Predicate predicate = cb.and(pJCBNNF,pJCBSER,pJCN001,pJCDCT);
		
		cQuery.select(cabecalho);
		cQuery.where(predicate);
		
		TypedQuery<F55IJC90> query = EntityManagerHelper.getEntityManager().createQuery(cQuery);
		query.setHint(QueryHints.CACHE_STORE_MODE, CacheStoreMode.REFRESH);
		
		List<F55IJC90> listF55IJC90 = null;
				
		if(!query.getResultList().isEmpty()){
			listF55IJC90 = query.getResultList();
		}
		
		EntityManagerHelper.closeEntityManager();
		
		return listF55IJC90;		
		
	}

}
