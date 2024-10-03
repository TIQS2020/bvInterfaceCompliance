package br.com.compliance.nfe.dao;

import java.sql.SQLException;
import java.util.List;

import javax.persistence.CacheStoreMode;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.eclipse.persistence.config.QueryHints;

import br.com.compliance.nfe.jdbc.JDBCException;
import br.com.compliance.nfe.jde.domain.F55IJC80Id;
import br.com.compliance.nfe.jde.domain.F55IJC81;
import br.com.compliance.nfe.jpa.EntityManagerHelper;

public class F55IJC81Dao {

	public List<F55IJC81> listF55IJC81ById(F55IJC80Id id) {

		CriteriaBuilder cb = EntityManagerHelper.getEntityManager().getCriteriaBuilder();
		CriteriaQuery<F55IJC81> cQuery = cb.createQuery(F55IJC81.class);
		Root<F55IJC81> cabecalho = cQuery.from(F55IJC81.class);

		Expression<F55IJC81> eJCBNNF = cabecalho.get("JCBNNF");
		Expression<F55IJC81> eJCBSER = cabecalho.get("JCBSER");
		Expression<F55IJC81> eJCN001 = cabecalho.get("JCN001");
		Expression<F55IJC81> eJCDCT = cabecalho.get("JCDCT");

		Predicate pJCBNNF = cb.equal(eJCBNNF, id.getJCBNNF());
		Predicate pJCBSER = cb.equal(eJCBSER, id.getJCBSER());
		Predicate pJCN001 = cb.equal(eJCN001, id.getJCN001());
		Predicate pJCDCT = cb.equal(eJCDCT, id.getJCDCT());

		Predicate predicate = cb.and(pJCBNNF, pJCBSER, pJCN001, pJCDCT);

		cQuery.select(cabecalho);
		cQuery.where(predicate);

		TypedQuery<F55IJC81> query = EntityManagerHelper.getEntityManager().createQuery(cQuery);
		query.setHint(QueryHints.CACHE_STORE_MODE, CacheStoreMode.REFRESH);
		List<F55IJC81> listF55IJC81 = null;

		if (!query.getResultList().isEmpty()) {
			listF55IJC81 = query.getResultList();
		}

		EntityManagerHelper.closeEntityManager();

		return listF55IJC81;

		/*
		 * 
		 * String sql = "SELECT f55IJC81 FROM F55IJC81 f55IJC81 " +
		 * "WHERE f55IJC81.JCBNNF = :JCBNNF " + "AND f55IJC81.JCBSER = :JCBSER " +
		 * "AND f55IJC81.JCN001 = :JCN001 " + "AND f55IJC81.JCDCT = :JCDCT";
		 * 
		 * Query query = JPAUtil.getEntityManager().createQuery(sql);
		 * query.setParameter("JCBNNF", id.getJCBNNF()); query.setParameter("JCBSER",
		 * id.getJCBSER()); query.setParameter("JCN001", id.getJCN001());
		 * query.setParameter("JCDCT", id.getJCDCT());
		 * 
		 * List<F55IJC81> listF55IJC81 = query.getResultList();
		 * 
		 * JPAUtil.closeEntityManager(); JPAUtil.closeEntityManagerFactory();
		 */

	}

	public void insertF55IJC81(F55IJC81 f) throws JDBCException, SQLException {

		EntityManager manager = EntityManagerHelper.getEntityManager();

		try {
			manager.getTransaction().begin();
			manager.persist(f);
			manager.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (manager.getTransaction().isActive()) {
				manager.getTransaction().rollback();
			}
		} finally {
			manager.close();
		}

	}

	public F55IJC81 findById(F55IJC80Id id){
		EntityManager manager = EntityManagerHelper.getEntityManager();
		TypedQuery<F55IJC81> query = manager.createQuery("SELECT f FROM F55IJC81 f WHERE f.id = :id", F55IJC81.class);
		query.setParameter("id", id);
		List<F55IJC81> f55IJC81List = query.getResultList();
		manager.close();
		return f55IJC81List.get(0);
	}

}
