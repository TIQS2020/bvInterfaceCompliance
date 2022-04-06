package br.com.compliance.nfe.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
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

import br.com.compliance.nfe.jdbc.JDBCConnection;
import br.com.compliance.nfe.jdbc.JDBCException;
import br.com.compliance.nfe.jde.domain.F55IJC80;
import br.com.compliance.nfe.jpa.EntityManagerHelper;
import br.com.compliance.nfe.util.AppConfig;
import br.com.compliance.nfe.util.LogUtil;

public class F55IJC80Dao {

	private static String tabela = "F55IJC80";

	public List<F55IJC80> getF55IJC80byStatus(String[] status) {

		CriteriaBuilder cb = EntityManagerHelper.getEntityManager().getCriteriaBuilder();
		CriteriaQuery<F55IJC80> cQuery = cb.createQuery(F55IJC80.class);
		Root<F55IJC80> cabecalho = cQuery.from(F55IJC80.class);

		Expression<F55IJC80> eJcdej = cabecalho.get("JCDEJ");
		Expression<F55IJC80> eJcev14 = cabecalho.get("JCEV14");
		Expression<F55IJC80> eJcev15 = cabecalho.get("JCEV15");		
		
		List<String> statusArr = Arrays.asList(status);
		
		Predicate pJcdej = cb.equal(eJcdej, "0");
		Predicate pJcev14 = eJcev14.in(statusArr);
		Predicate pJcev15 = cb.equal(eJcev15, "0");
		Predicate predicate = cb.and(pJcdej, pJcev14, pJcev15);

		cQuery.select(cabecalho);
		cQuery.where(predicate);

		TypedQuery<F55IJC80> query = EntityManagerHelper.getEntityManager().createQuery(cQuery);
		// query.setHint(QueryHints.CACHE_USAGE, CacheUsage.NoCache);
		query.setHint(QueryHints.CACHE_STORE_MODE, CacheStoreMode.REFRESH);
		List<F55IJC80> listF55IJC80 = query.getResultList();

		EntityManagerHelper.closeEntityManager();

		return listF55IJC80;
	}

	public List<F55IJC80> getF55IJC80Recebida() {

		EntityManager manager = EntityManagerHelper.getEntityManager();

		CriteriaBuilder cb = manager.getCriteriaBuilder();
		CriteriaQuery<F55IJC80> cQuery = cb.createQuery(F55IJC80.class);
		Root<F55IJC80> cabecalho = cQuery.from(F55IJC80.class);

		Expression<F55IJC80> eLote = cabecalho.get("JCUK02");
		Expression<F55IJC80> eStatus = cabecalho.get("JCEV15");
		Expression<F55IJC80> eJcdej = cabecalho.get("JCDEJ");

		String[] notInClause = {"#","F"};
		List<String> notInClauseArr = Arrays.asList(notInClause);		
		
		Predicate pLote = cb.isNotNull(eLote);
		Predicate pStatus = eStatus.in(notInClauseArr).not();
		Predicate pJcedj = cb.notEqual(eJcdej, "0");

		Predicate predicate = cb.and(pStatus, pLote, pJcedj);

		cQuery.select(cabecalho);
		cQuery.where(predicate);

		TypedQuery<F55IJC80> query = manager.createQuery(cQuery);
		// query.setHint(QueryHints.CACHE_USAGE, CacheUsage.NoCache);
		query.setHint(QueryHints.CACHE_STORE_MODE, CacheStoreMode.REFRESH);
		List<F55IJC80> listF55IJC80 = query.getResultList();

		manager.close();
		return listF55IJC80;
	}

	public int updateF55IJC80Retorno(F55IJC80 f) throws JDBCException, SQLException {

		StringBuilder sbQuery = new StringBuilder();
		Connection conn = null;
		PreparedStatement st = null;
		int linhas = 0;
		try {
			conn = JDBCConnection.getConnection();
			conn.setAutoCommit(false);
			sbQuery.append("UPDATE ").append(AppConfig.getSchemaDTA())
					.append(".F55IJC80 SET JCEV15 = ?, JCA203 = ? "
							+ ",JCJOBN = ?, JCPID = ?, JCTDAY = ? , JCUSER = ?, JCUPMJ = ?, JCAPTA = ? " + "WHERE JCBNNF = ? "
							+ "AND JCBSER = ? " + "AND JCDCT = ? " + "AND JCN001 = ?" + "	AND JCUK02 = ?");

			st = conn.prepareStatement(sbQuery.toString());

			st.setString(1, f.getJCEV15());
			st.setString(2, f.getJCA203());
			st.setString(3, f.getJCJOBN());
			st.setString(4, f.getJCPID());
			st.setLong(5, f.getJCTDAY());
			st.setString(6, f.getJCUSER());
			st.setString(7, f.getJCUPMJ());
			st.setString(8, f.getJCAPTA());
			
			st.setInt(9, f.getJCBNNF());
			st.setString(10, f.getJCBSER());
			st.setString(11, f.getJCDCT());
			st.setInt(12, f.getJCN001());
			st.setLong(13, f.getJCUK02());

			/*
			 * List<String> parametros = new ArrayList<String>();
			 * parametros.add(f.getJCEV15()); parametros.add(f.getJCA203());
			 * parametros.add(f.getJCJOBN()); parametros.add(f.getJCPID());
			 * parametros.add(f.getJCTDAY().toString()); parametros.add(f.getJCUSER());
			 * parametros.add(f.getJCUPMJ()); parametros.add(f.getJCBNNF().toString());
			 * parametros.add(f.getJCBSER()); parametros.add(f.getJCDCT());
			 * parametros.add(f.getJCN001().toString());
			 * 
			 * Map<String, Object> mapLog = new HashMap<String, Object>();
			 * mapLog.put("Query", sbQuery.toString()); mapLog.put("Parametros",
			 * parametros);
			 * 
			 * LogUtil.logInfo(mapLog, tabela);
			 */

			linhas = st.executeUpdate();
			conn.commit();
		} catch (Exception ex) {
			LogUtil.logError(ex, tabela);
		} finally {
			st.close();
			conn.close();
		}

		return linhas;
	}

	public void updateF55IJC80(F55IJC80 f) throws JDBCException, SQLException {

		StringBuilder sbQuery = new StringBuilder();
		Connection conn = null;
		PreparedStatement st = null;

		try {
			
			conn = JDBCConnection.getConnection();
			conn.setAutoCommit(false);

			sbQuery.append("UPDATE ").append(AppConfig.getSchemaDTA())
					.append(".F55IJC80 SET JCDEJ = ?, JCEV15 = ?, JCUK02 = ?, JCBRNFDE = ?  " + "WHERE JCBNNF = ? "
							+ "AND JCBSER = ? " + "AND JCDCT = ? " + "AND JCN001 = ?");

			st = conn.prepareStatement(sbQuery.toString());

			st.setInt(1, f.getJCDEJ());
			st.setString(2, f.getJCEV15());
			st.setLong(3, f.getJCUK02());
			st.setInt(4, f.getJCBRNFDE());

			st.setInt(5, f.getJCBNNF());
			st.setString(6, f.getJCBSER());
			st.setString(7, f.getJCDCT());
			st.setInt(8, f.getJCN001());

			/*
			 * List<String> parametros = new ArrayList<String>();
			 * parametros.add(f.getJCDEJ().toString()); parametros.add(f.getJCEV15());
			 * parametros.add(f.getJCUK02().toString());
			 * parametros.add(f.getJCBRNFDE().toString());
			 * parametros.add(f.getJCBNNF().toString()); parametros.add(f.getJCBSER());
			 * parametros.add(f.getJCDCT()); parametros.add(f.getJCN001().toString());
			 * 
			 * Map<String, Object> mapLog = new HashMap<String, Object>();
			 * mapLog.put("Query", sbQuery.toString()); mapLog.put("Parametros",
			 * parametros);
			 * 
			 * LogUtil.logInfo(mapLog, tabela);
			 */
			st.executeUpdate();
			conn.commit();

		} catch (Exception ex) {
			LogUtil.logError(ex, tabela);
		} finally {
			st.close();
			conn.close();
		}

	}

	public void updateF55IJC80Erro(F55IJC80 f) throws JDBCException, SQLException {

		StringBuilder sbQuery = new StringBuilder();
		Connection conn = null;
		PreparedStatement st = null;

		try {
			conn = JDBCConnection.getConnection();
			conn.setAutoCommit(false);
			/*
			sbQuery.append("UPDATE ").append(AppConfig.getSchemaDTA())
					.append(".F55IJC80 SET JCEV15 = ?, JCUK02 = ?  " + "WHERE JCBNNF = ? " + "AND JCBSER = ? "
							+ "AND JCDCT = ? " + "AND JCN001 = ?");
			*/
			
			sbQuery.append("UPDATE ").append(AppConfig.getSchemaDTA())
			.append(".F55IJC80 SET JCEV15 = ? WHERE JCBNNF = ? " + "AND JCBSER = ? "
					+ "AND JCDCT = ? " + "AND JCN001 = ?");
			
			st = conn.prepareStatement(sbQuery.toString());

			st.setString(1, "E");
			//st.setLong(2, new Long(0));
			st.setInt(2, f.getJCBNNF());
			st.setString(3, f.getJCBSER());
			st.setString(4, f.getJCDCT());
			st.setInt(5, f.getJCN001());

			/*
			 * List<String> parametros = new ArrayList<String>(); parametros.add("E");
			 * parametros.add(f.getJCBNNF().toString()); parametros.add(f.getJCBSER());
			 * parametros.add(f.getJCDCT()); parametros.add(f.getJCN001().toString());
			 * 
			 * Map<String, Object> mapLog = new HashMap<String, Object>();
			 * mapLog.put("Query", sbQuery.toString()); mapLog.put("Parametros",
			 * parametros);
			 * 
			 * LogUtil.logInfo(mapLog, tabela);
			 */
			st.executeUpdate();
			conn.commit();
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			st.close();
			conn.close();
		}
	}

	public boolean confirmaLote(F55IJC80 f) throws JDBCException, SQLException {
		StringBuilder sbQuery = new StringBuilder();
		Connection conn = null;
		PreparedStatement st = null;
		boolean retorno = false;

		try {
			conn = JDBCConnection.getConnection();

			sbQuery.append("SELECT COUNT(*) FROM ").append(AppConfig.getSchemaDTA())
					.append(".F55IJC80 WHERE JCBNNF = ? " + "AND JCBSER = ? " + "AND JCDCT = ? " + "AND JCN001 = ?"
							+ "AND JCUK02 = ?");

			st = conn.prepareStatement(sbQuery.toString());

			st.setInt(1, f.getJCBNNF());
			st.setString(2, f.getJCBSER());
			st.setString(3, f.getJCDCT());
			st.setInt(4, f.getJCN001());
			st.setLong(5, f.getJCUK02());

			ResultSet rs = st.executeQuery();

			if (rs.next()) {
				retorno = true;
			}

		} catch (Exception ex) {
			LogUtil.logError(ex, tabela);
		} finally {
			st.close();
			conn.close();
		}

		return retorno;
	}

}
