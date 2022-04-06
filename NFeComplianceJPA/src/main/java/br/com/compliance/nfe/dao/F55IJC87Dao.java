package br.com.compliance.nfe.dao;

import java.util.List;

import javax.persistence.CacheStoreMode;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.eclipse.persistence.config.QueryHints;

import br.com.compliance.nfe.jde.domain.F55IJC80Id;
import br.com.compliance.nfe.jde.domain.F55IJC87;
import br.com.compliance.nfe.jpa.EntityManagerHelper;

public class F55IJC87Dao {

	public List<F55IJC87> listF55IJC87ById(F55IJC80Id id) {
		
		CriteriaBuilder cb = EntityManagerHelper.getEntityManager().getCriteriaBuilder();
		CriteriaQuery<F55IJC87> cQuery = cb.createQuery(F55IJC87.class);
		Root<F55IJC87> cabecalho = cQuery.from(F55IJC87.class);

		Expression<F55IJC87> eJCBNNF = cabecalho.get("JCBNNF");
		Expression<F55IJC87> eJCBSER = cabecalho.get("JCBSER");
		Expression<F55IJC87> eJCN001 = cabecalho.get("JCN001");
		Expression<F55IJC87> eJCDCT = cabecalho.get("JCDCT");

		Predicate pJCBNNF = cb.equal(eJCBNNF, id.getJCBNNF());
		Predicate pJCBSER = cb.equal(eJCBSER, id.getJCBSER());
		Predicate pJCN001 = cb.equal(eJCN001, id.getJCN001());
		Predicate pJCDCT = cb.equal(eJCDCT, id.getJCDCT());

		Predicate predicate = cb.and(pJCBNNF, pJCBSER, pJCN001, pJCDCT);

		cQuery.select(cabecalho);
		cQuery.where(predicate);

		TypedQuery<F55IJC87> query = EntityManagerHelper.getEntityManager().createQuery(cQuery);
		query.setHint(QueryHints.CACHE_STORE_MODE, CacheStoreMode.REFRESH);
		List<F55IJC87> listF55IJC87 = query.getResultList();

		EntityManagerHelper.closeEntityManager();

		return listF55IJC87;

		/*
		 * List<F55IJC87> listF55IJC87 = null;
		 * 
		 * String sql = "SELECT f55IJC87 FROM F55IJC87 f55IJC87 " +
		 * "WHERE f55IJC87.JCBNNF = :JCBNNF " + "AND f55IJC87.JCBSER = :JCBSER "
		 * + "AND f55IJC87.JCN001 = :JCN001 " + "AND f55IJC87.JCDCT = :JCDCT";
		 * 
		 * Query query = JPAUtil.getEntityManager().createQuery(sql);
		 * query.setParameter("JCBNNF", id.getJCBNNF());
		 * query.setParameter("JCBSER", id.getJCBSER());
		 * query.setParameter("JCN001", id.getJCN001());
		 * query.setParameter("JCDCT", id.getJCDCT());
		 * 
		 * try{ listF55IJC87 = query.getResultList(); }catch(NoResultException
		 * ex){
		 * 
		 * }
		 * 
		 * return listF55IJC87;
		 */
	}

	public F55IJC87 getF55IJC87ById(F55IJC80Id id){
		
		CriteriaBuilder cb = EntityManagerHelper.getEntityManager().getCriteriaBuilder();
		CriteriaQuery<F55IJC87> cQuery = cb.createQuery(F55IJC87.class);
		Root<F55IJC87> cabecalho = cQuery.from(F55IJC87.class);

		Expression<F55IJC87> eJCBNNF = cabecalho.get("JCBNNF");
		Expression<F55IJC87> eJCBSER = cabecalho.get("JCBSER");
		Expression<F55IJC87> eJCN001 = cabecalho.get("JCN001");
		Expression<F55IJC87> eJCDCT = cabecalho.get("JCDCT");

		Predicate pJCBNNF = cb.equal(eJCBNNF, id.getJCBNNF());
		Predicate pJCBSER = cb.equal(eJCBSER, id.getJCBSER());
		Predicate pJCN001 = cb.equal(eJCN001, id.getJCN001());
		Predicate pJCDCT = cb.equal(eJCDCT, id.getJCDCT());

		Predicate predicate = cb.and(pJCBNNF, pJCBSER, pJCN001, pJCDCT);

		cQuery.select(cabecalho);
		cQuery.where(predicate);

		TypedQuery<F55IJC87> query = EntityManagerHelper.getEntityManager().createQuery(cQuery);
		query.setHint(QueryHints.CACHE_STORE_MODE, CacheStoreMode.REFRESH);
		F55IJC87 f55IJC87 = new F55IJC87();
		
		try{
			f55IJC87 = (F55IJC87) query.getSingleResult();
		}catch(NoResultException ex){
			ex.printStackTrace();
		}finally{
			EntityManagerHelper.closeEntityManager();
		}
		
		return f55IJC87;

		/*
		 * F55IJC87 f55IJC87 = null;
		 * 
		 * String sql = "SELECT f55IJC87 FROM F55IJC87 f55IJC87 " +
		 * "WHERE f55IJC87.JCBNNF = :JCBNNF " + "AND f55IJC87.JCBSER = :JCBSER "
		 * + "AND f55IJC87.JCN001 = :JCN001 " + "AND f55IJC87.JCDCT = :JCDCT";
		 * 
		 * Query query = JPAUtil.getEntityManager().createQuery(sql);
		 * query.setParameter("JCBNNF", id.getJCBNNF());
		 * query.setParameter("JCBSER", id.getJCBSER());
		 * query.setParameter("JCN001", id.getJCN001());
		 * query.setParameter("JCDCT", id.getJCDCT());
		 * 
		 * try{ f55IJC87 = (F55IJC87)query.getSingleResult();
		 * }catch(NoResultException ex){
		 * 
		 * } return f55IJC87;
		 */
	}

}
