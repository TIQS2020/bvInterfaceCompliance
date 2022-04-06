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

import br.com.compliance.nfe.jde.domain.F55IJC02;
import br.com.compliance.nfe.jde.domain.F55IJC80Id;
import br.com.compliance.nfe.jpa.EntityManagerHelper;

public class F55IJC02Dao {

	public List<F55IJC02> getF55IJC02byStatus(F55IJC80Id id) {

		CriteriaBuilder cb = EntityManagerHelper.getEntityManager().getCriteriaBuilder();
		CriteriaQuery<F55IJC02> cQuery = cb.createQuery(F55IJC02.class);
		Root<F55IJC02> cabecalho = cQuery.from(F55IJC02.class);

		Expression<F55IJC02> eJcbnnf = cabecalho.get("JCBNNF");
		Expression<F55IJC02> eJcbser = cabecalho.get("JCBSER");
		Expression<F55IJC02> eJcn001 = cabecalho.get("JCN001");
		Expression<F55IJC02> eJcdct = cabecalho.get("JCDCT");

		Predicate pJcbnnf = cb.equal(eJcbnnf, id.getJCBNNF());
		Predicate pJcbser = cb.equal(eJcbser, id.getJCBSER());
		Predicate pJcn001 = cb.equal(eJcn001, id.getJCN001());
		Predicate pJcdct = cb.equal(eJcdct, id.getJCDCT());
		Predicate predicate = cb.and(pJcbnnf, pJcbser, pJcn001, pJcdct);

		cQuery.select(cabecalho);
		cQuery.where(predicate);

		TypedQuery<F55IJC02> query = EntityManagerHelper.getEntityManager().createQuery(cQuery);
		// query.setHint(QueryHints.CACHE_USAGE, CacheUsage.NoCache);
		query.setHint(QueryHints.CACHE_STORE_MODE, CacheStoreMode.REFRESH);
		List<F55IJC02> listF55IJC02 = query.getResultList();

		EntityManagerHelper.closeEntityManager();

		return listF55IJC02;
	}

}
