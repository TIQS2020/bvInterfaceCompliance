package br.com.compliance.nfe.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import br.com.compliance.nfe.jdbc.JDBCConnection;
import br.com.compliance.nfe.jdbc.JDBCException;
import br.com.compliance.nfe.jde.domain.F55IJC80Id;
import br.com.compliance.nfe.jde.domain.F7611B;
import br.com.compliance.nfe.jpa.EntityManagerHelper;
import br.com.compliance.nfe.util.AppConfig;
import br.com.compliance.nfe.util.LogUtil;

public class F7611BDao {
	
	private static String tabela = "F7611B";

	public List<F7611B> listF7611B(F55IJC80Id f) {

		CriteriaBuilder cb = EntityManagerHelper.getEntityManager().getCriteriaBuilder();
		CriteriaQuery<F7611B> cQuery = cb.createQuery(F7611B.class);
		Root<F7611B> cabecalho = cQuery.from(F7611B.class);

		Expression<F7611B> eBNNF = cabecalho.get("FDBNNF");
		Expression<F7611B> eBSER = cabecalho.get("FDBSER");
		Expression<F7611B> eDCT = cabecalho.get("FDDCT");
		Expression<F7611B> eN001 = cabecalho.get("FDN001");

		Predicate pBNNF = cb.equal(eBNNF, f.getJCBNNF());
		Predicate pBSER = cb.equal(eBSER, f.getJCBSER());
		Predicate pDCT = cb.equal(eDCT, f.getJCDCT());
		Predicate pN001 = cb.equal(eN001, f.getJCN001());

		Predicate predicate = cb.and(pBNNF, pBSER, pDCT, pN001);

		cQuery.select(cabecalho);
		cQuery.where(predicate);

		TypedQuery<F7611B> query = EntityManagerHelper.getEntityManager().createQuery(cQuery);

		List<F7611B> f7611bList = query.getResultList();

		EntityManagerHelper.closeEntityManager();

		return f7611bList;

	}
	
	public F7611B getF7611B(F55IJC80Id f) {

		CriteriaBuilder cb = EntityManagerHelper.getEntityManager().getCriteriaBuilder();
		CriteriaQuery<F7611B> cQuery = cb.createQuery(F7611B.class);
		Root<F7611B> cabecalho = cQuery.from(F7611B.class);

		Expression<F7611B> eBNNF = cabecalho.get("FDBNNF");
		Expression<F7611B> eBSER = cabecalho.get("FDBSER");
		Expression<F7611B> eDCT = cabecalho.get("FDDCT");
		Expression<F7611B> eN001 = cabecalho.get("FDN001");

		Predicate pBNNF = cb.equal(eBNNF, f.getJCBNNF());
		Predicate pBSER = cb.equal(eBSER, f.getJCBSER());
		Predicate pDCT = cb.equal(eDCT, f.getJCDCT());
		Predicate pN001 = cb.equal(eN001, f.getJCN001());

		Predicate predicate = cb.and(pBNNF, pBSER, pDCT, pN001);

		cQuery.select(cabecalho);
		cQuery.where(predicate);

		TypedQuery<F7611B> query = EntityManagerHelper.getEntityManager().createQuery(cQuery);
		query.setMaxResults(1);
		List<F7611B> f7611bList = query.getResultList();

		EntityManagerHelper.closeEntityManager();

		return f7611bList.get(0);

	}

	public void updateF7611B(F7611B f7611b) throws  JDBCException, SQLException{

		StringBuilder sbQuery = new StringBuilder();
		Connection conn = null;	
		PreparedStatement st = null;	

		try {
			conn = JDBCConnection.getConnection();
			
			sbQuery.append("UPDATE ").append(AppConfig.getSchemaDTA()).append(".F7611B SET FDNXTR = ?, FDLTTR = ? "
				+ ",FDJOBN = ?, FDPID = ?, FDTDAY = ? , FDUSER = ?, FDUPMJ = ? "
				+ "WHERE FDBNNF = ? " + "AND FDBSER = ? " + "AND FDDCT = ? " + "AND FDN001 = ? "
				+ "AND FDLNID = ? ");
			
			st = conn.prepareStatement(sbQuery.toString());	

			st.setString(1, f7611b.getFDNXTR());
			st.setString(2, f7611b.getFDLTTR());
			
			st.setString(3, f7611b.getFDJOBN());
			st.setString(4, f7611b.getFDPID());
			st.setLong(5, f7611b.getFDTDAY());
			st.setString(6, f7611b.getFDUSER());
			st.setLong(7, f7611b.getFDUPMJ());

			st.setInt(8, f7611b.getFDBNNF());
			st.setString(9, f7611b.getFDBSER());
			st.setString(10, f7611b.getFDDCT());
			st.setInt(11, f7611b.getFDN001());
			st.setLong(12, f7611b.getFDLNID());			
			
			st.executeUpdate();
			
		} catch (Exception ex) {
			ex.printStackTrace();
			LogUtil.logError(ex, tabela);
		} finally {
			st.close();
			conn.close();
		}

	}

}
