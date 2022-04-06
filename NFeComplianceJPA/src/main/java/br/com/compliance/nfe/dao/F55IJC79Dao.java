package br.com.compliance.nfe.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.persistence.CacheStoreMode;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.eclipse.persistence.config.QueryHints;

import br.com.compliance.nfe.jdbc.JDBCConnection;
import br.com.compliance.nfe.jdbc.JDBCException;
import br.com.compliance.nfe.jde.domain.F55IJC79;
import br.com.compliance.nfe.jde.domain.F55IJC79Id;
import br.com.compliance.nfe.jde.domain.F55IJC7CId;
import br.com.compliance.nfe.jpa.EntityManagerHelper;
import br.com.compliance.nfe.util.AppConfig;

public class F55IJC79Dao {

	// private static String tabela = "F55IJC79";

	public List<F55IJC79> getF55IJC70byStatus(F55IJC7CId id) {

		CriteriaBuilder cb = EntityManagerHelper.getEntityManager().getCriteriaBuilder();
		CriteriaQuery<F55IJC79> cQuery = cb.createQuery(F55IJC79.class);
		Root<F55IJC79> cabecalho = cQuery.from(F55IJC79.class);

		/* TODO: [MAPEAMENTO] ASSUMI A CHAVE COMO CRITÉRIO DA BUSCA */
		// Expression<F55IJC51> eJCCO = cabecalho.get("JCCO");
		Expression<F55IJC79> eJCWJOBS = cabecalho.get("JCWJOBS");
		Expression<F55IJC79> eJCBEGDATE = cabecalho.get("JCBEGDATE");
		Expression<F55IJC79> eJCENDDATE = cabecalho.get("JCENDDATE");
		Expression<F55IJC79> eJCEV15 = cabecalho.get("JCEV15");

		Predicate pJCWJOBS = cb.equal(eJCWJOBS, id.getJCWJOBS());
		Predicate pJCBEGDATE = cb.equal(eJCBEGDATE, id.getJCBEGDATE());
		Predicate pJCENDDATE = cb.equal(eJCENDDATE, id.getJCENDDATE());
		Predicate pJCEV15Zero = cb.equal(eJCEV15, "0");
		Predicate pJCEV15Branco = cb.equal(eJCEV15, " ");
		Predicate pJCEV15Null = cb.isNull(eJCEV15);
		Predicate predicateEV15 = cb.or(pJCEV15Zero, pJCEV15Branco, pJCEV15Null);
		Predicate predicate = cb.and(pJCWJOBS, pJCBEGDATE, pJCENDDATE, predicateEV15);

		cQuery.select(cabecalho);
		cQuery.where(predicate);

		TypedQuery<F55IJC79> query = EntityManagerHelper.getEntityManager().createQuery(cQuery);
		query.setHint(QueryHints.CACHE_STORE_MODE, CacheStoreMode.REFRESH);

		List<F55IJC79> f55IJC79List = new ArrayList<F55IJC79>();

		f55IJC79List = query.getResultList();

		EntityManagerHelper.closeEntityManager();
		return f55IJC79List;

	}

	public HashMap<String, Integer> atualizaTabela(String lote, int data, int ev15, F55IJC79Id id)
			throws JDBCException, SQLException {
		StringBuilder sbQuery = new StringBuilder();
		Connection conn = null;
		PreparedStatement st = null;
		HashMap<String, Integer> atualizacoes = new HashMap<String, Integer>();

		try {
			conn = JDBCConnection.getConnection();

			String tabela = "F55IJC79";
			/*
			 * sbQuery.append("UPDATE ").append(AppConfig.getSchemaDTA()).append(".").append
			 * (tabela).append(" ") .append("SET JCUK02 = ?, JCDEJ = ?, JCEV15 = ? ")
			 * .append("WHERE  JCWJOBS = ? AND trim(JCTAX) = ? AND trim(JCLITM) = ? AND JCAN8 = ? "
			 * );
			 */

			sbQuery.append("UPDATE ").append(AppConfig.getSchemaDTA()).append(".").append(tabela).append(" ")
					.append("SET JCUK02 = ?, JCDEJ = ?, JCEV15 = ? ")
					.append("WHERE  JCWJOBS = ? AND trim(JCTAX) = ? AND JCAN8 = ? ");

			st = conn.prepareStatement(sbQuery.toString());

			st.setString(1, lote);
			st.setInt(2, data);
			st.setLong(3, ev15);
			st.setLong(4, id.getJCWJOBS());
			st.setString(5, id.getJCTAX());
			// st.setString(6, id.getJCLITM());
			st.setLong(6, id.getJCAN8());

			int linhas = st.executeUpdate();
			atualizacoes.put(tabela, linhas);
		} catch (SQLException ex) {
			ex.printStackTrace();
		} finally {
			st.close();
			conn.close();
		}

		return atualizacoes;
	}

//	public List<F55IJC70> getF55IJC70Recebida() {
//
//		CriteriaBuilder cb = EntityManagerHelper.getEntityManager().getCriteriaBuilder();
//		CriteriaQuery<F55IJC70> cQuery = cb.createQuery(F55IJC70.class);
//		Root<F55IJC70> cabecalho = cQuery.from(F55IJC70.class);
//
//		Expression<F55IJC70> eLote = cabecalho.get("JCUK02");
//		Expression<F55IJC70> eStatus = cabecalho.get("JCEV15");
//		Expression<F55IJC70> eJcdej = cabecalho.get("JCDEJ");
//
//		Predicate pLote = cb.isNotNull(eLote);
//		Predicate pStatus = cb.notEqual(eStatus, "#");
//		Predicate pJcedj = cb.notEqual(eJcdej, "0");
//
//		Predicate predicate = cb.and(pStatus, pLote, pJcedj);
//
//		cQuery.select(cabecalho);
//		cQuery.where(predicate);
//
//		TypedQuery<F55IJC70> query = EntityManagerHelper.getEntityManager().createQuery(cQuery);
//		query.setHint(QueryHints.CACHE_STORE_MODE, CacheStoreMode.REFRESH);
//		List<F55IJC70> listF55IJC70 = query.getResultList();
//
//		EntityManagerHelper.closeEntityManager();
//		return listF55IJC70;
//	}
//
//	public void updateF55IJC70Retorno(F55IJC70 f) throws JDBCException, SQLException {
//
//		StringBuilder sbQuery = new StringBuilder();
//		Connection conn = null;
//		PreparedStatement st = null;
//
//		try {
//			conn = JDBCConnection.getConnection();
//
//			sbQuery.append("UPDATE ").append(AppConfig.getSchemaDTA())
//					.append(".F55IJC70 SET JCEV15 = ?, JCA203 = ? "
//							+ ",JCJOBN = ?, JCPID = ?, JCTDAY = ? , JCUSER = ?, JCUPMJ = ? " + "WHERE JCBNNF = ? "
//							+ "AND JCBSER = ? " + "AND JCDCT = ? " + "AND JCN001 = ?");
//
//			st = conn.prepareStatement(sbQuery.toString());
//
//			st.setString(1, f.getJCEV15());
//			st.setString(2, f.getJCA203());
//			st.setString(3, f.getJCJOBN());
//			st.setString(4, f.getJCPID());
//			st.setLong(5, f.getJCTDAY());
//			st.setString(6, f.getJCUSER());
//			st.setString(7, f.getJCUPMJ());
//
//			st.setInt(8, f.getJCBNNF());
//			st.setString(9, f.getJCBSER());
//			st.setString(10, f.getJCDCT());
//			st.setInt(11, f.getJCN001());
//
//			/*
//			 * List<String> parametros = new ArrayList<String>();
//			 * parametros.add(f.getJCEV15()); parametros.add(f.getJCA203());
//			 * parametros.add(f.getJCJOBN()); parametros.add(f.getJCPID());
//			 * parametros.add(f.getJCTDAY().toString()); parametros.add(f.getJCUSER());
//			 * parametros.add(f.getJCUPMJ()); parametros.add(f.getJCBNNF().toString());
//			 * parametros.add(f.getJCBSER()); parametros.add(f.getJCDCT());
//			 * parametros.add(f.getJCN001().toString());
//			 * 
//			 * Map<String, Object> mapLog = new HashMap<String, Object>();
//			 * mapLog.put("Query", sbQuery.toString()); mapLog.put("Parametros",
//			 * parametros);
//			 * 
//			 * LogUtil.logInfo(mapLog, tabela);
//			 */
//			st.executeUpdate();
//
//		} catch (Exception ex) {
//			LogUtil.logError(ex, tabela);
//		} finally {
//			st.close();
//			conn.close();
//		}
//	}
//
//	public void updateF55IJC70(F55IJC70 f) throws JDBCException, SQLException {
//
//		StringBuilder sbQuery = new StringBuilder();
//		Connection conn = null;
//		PreparedStatement st = null;
//
//		try {
//			conn = JDBCConnection.getConnection();
//
//			sbQuery.append("UPDATE ").append(AppConfig.getSchemaDTA())
//					.append(".F55IJC70 SET JCDEJ = ?, JCEV15 = ?, JCUK02 = ?, JCBRNFDE = ?  " + "WHERE JCBNNF = ? "
//							+ "AND JCBSER = ? " + "AND JCDCT = ? " + "AND JCN001 = ?");
//
//			st = conn.prepareStatement(sbQuery.toString());
//
//			st.setInt(1, f.getJCDEJ());
//			st.setString(2, f.getJCEV15());
//			st.setLong(3, f.getJCUK02());
//			st.setInt(4, f.getJCBRNFDE());
//
//			st.setInt(5, f.getJCBNNF());
//			st.setString(6, f.getJCBSER());
//			st.setString(7, f.getJCDCT());
//			st.setInt(8, f.getJCN001());
//
//			/*
//			 * List<String> parametros = new ArrayList<String>();
//			 * parametros.add(f.getJCDEJ().toString()); parametros.add(f.getJCEV15());
//			 * parametros.add(f.getJCUK02().toString());
//			 * parametros.add(f.getJCBRNFDE().toString());
//			 * parametros.add(f.getJCBNNF().toString()); parametros.add(f.getJCBSER());
//			 * parametros.add(f.getJCDCT()); parametros.add(f.getJCN001().toString());
//			 * 
//			 * Map<String, Object> mapLog = new HashMap<String, Object>();
//			 * mapLog.put("Query", sbQuery.toString()); mapLog.put("Parametros",
//			 * parametros);
//			 * 
//			 * LogUtil.logInfo(mapLog, tabela);
//			 */
//			st.executeUpdate();
//
//		} catch (Exception ex) {
//			LogUtil.logError(ex, tabela);
//		} finally {
//			st.close();
//			conn.close();
//		}
//
//	}
//
//	public void updateF55IJC70Erro(F55IJC70 f) throws JDBCException, SQLException {
//
//		StringBuilder sbQuery = new StringBuilder();
//		Connection conn = null;
//		PreparedStatement st = null;
//
//		try {
//			conn = JDBCConnection.getConnection();
//
//			sbQuery.append("UPDATE ").append(AppConfig.getSchemaDTA()).append(".F55IJC70 SET JCEV15 = ?  "
//					+ "WHERE JCBNNF = ? " + "AND JCBSER = ? " + "AND JCDCT = ? " + "AND JCN001 = ?");
//
//			st = conn.prepareStatement(sbQuery.toString());
//
//			st.setString(1, "E");
//			st.setInt(2, f.getJCBNNF());
//			st.setString(3, f.getJCBSER());
//			st.setString(4, f.getJCDCT());
//			st.setInt(5, f.getJCN001());
//
//			/*
//			 * List<String> parametros = new ArrayList<String>(); parametros.add("E");
//			 * parametros.add(f.getJCBNNF().toString()); parametros.add(f.getJCBSER());
//			 * parametros.add(f.getJCDCT()); parametros.add(f.getJCN001().toString());
//			 * 
//			 * Map<String, Object> mapLog = new HashMap<String, Object>();
//			 * mapLog.put("Query", sbQuery.toString()); mapLog.put("Parametros",
//			 * parametros);
//			 * 
//			 * LogUtil.logInfo(mapLog, tabela);
//			 */
//			st.executeUpdate();
//
//		} catch (Exception ex) {
//			ex.printStackTrace();
//		} finally {
//			st.close();
//			conn.close();
//		}
//	}

}
