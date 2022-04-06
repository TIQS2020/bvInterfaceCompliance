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

import br.com.compliance.nfe.jde.domain.F55IJC70Id;
import br.com.compliance.nfe.jde.domain.F55IJC71;
import br.com.compliance.nfe.jpa.EntityManagerHelper;

public class F55IJC71Dao {

	public List<F55IJC71> listF55IJC71ById(F55IJC70Id id) {
		CriteriaBuilder cb = EntityManagerHelper.getEntityManager().getCriteriaBuilder();
		CriteriaQuery<F55IJC71> cQuery = cb.createQuery(F55IJC71.class);
		Root<F55IJC71> cabecalho = cQuery.from(F55IJC71.class);
		
		Expression<F55IJC71> eJCBNNF = cabecalho.get("JCBNNF");
		Expression<F55IJC71> eJCBSER = cabecalho.get("JCBSER");
		Expression<F55IJC71> eJCN001 = cabecalho.get("JCN001");
		Expression<F55IJC71> eJCDCT = cabecalho.get("JCDCT");
		Expression<F55IJC71> eJCWJOBS = cabecalho.get("JCWJOBS");
		
		Predicate pJCBNNF = cb.equal(eJCBNNF, id.getJCBNNF());
		Predicate pJCBSER = cb.equal(eJCBSER, id.getJCBSER());
		Predicate pJCN001 = cb.equal(eJCN001, id.getJCN001());
		Predicate pJCDCT = cb.equal(eJCDCT, id.getJCDCT());
		Predicate pJCWJOBS = cb.equal(eJCWJOBS, id.getJCWJOBS());
		
		Predicate predicate = cb.and(pJCBNNF,pJCBSER,pJCN001,pJCDCT, pJCWJOBS);
		
		cQuery.select(cabecalho);
		cQuery.where(predicate);
		
		TypedQuery<F55IJC71> query = EntityManagerHelper.getEntityManager().createQuery(cQuery);
		query.setHint(QueryHints.CACHE_STORE_MODE, CacheStoreMode.REFRESH);
		List<F55IJC71> listF55IJC71 = null; 
				
		if(!query.getResultList().isEmpty()){
			listF55IJC71 = query.getResultList();
		}				
		
		EntityManagerHelper.closeEntityManager();
		
		return listF55IJC71;
	}

}
