package br.com.compliance.nfe.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
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
import br.com.compliance.nfe.jde.domain.F55IJC70;
import br.com.compliance.nfe.jde.domain.F55IJC7CId;
import br.com.compliance.nfe.jpa.EntityManagerHelper;
import br.com.compliance.nfe.util.AppConfig;
import br.com.compliance.nfe.util.LogUtil;

//public class F55IJC70Dao<T> extends AbstractDatabaseHandler<T> {
public class F55IJC70Dao {
	
	/*
	public F55IJC70Dao(Class<T> type) {
		super(type);		
	}
	*/

	private static String tabela = "F55IJC70";
	
	/*
	public List<T> getF55IJC70byStatus(F55IJC7CId f55IJC7CId, String bloco) throws SQLException {	
		
		StringBuilder sbQuery = new StringBuilder();
		Connection conn = null;	
		PreparedStatement st = null;
		ResultSet rs = null;
		List<T> f55IJC70List = null;
		String jCEV08 = "";
		String jCEV01 = "F";
		try{
			conn = JDBCConnection.getConnection();
			
			sbQuery.append("SELECT ").append(super.getColumns(false, "70.")).append(" FROM ")
					.append(AppConfig.getSchemaDTA()).append(".F55IJC70 70 ")
					.append("INNER JOIN ")
					.append(AppConfig.getSchemaDTA()).append(".F55IJC7C 7C ")
					.append("ON 70.JCBEGDATE = 7C.JCBEGDATE ")
					.append("AND 70.JCENDDATE = 7C.JCENDDATE ")
					.append("AND 70.JCWJOBS = 7C.JCWJOBS ")
					.append("WHERE 7C.JCA1ST = '3' AND 7C.JCA2ST = '0' AND (70.JCEV15 = 0 OR 70.JCEV15 = ' ' OR JCEV15 IS NULL) ");				
			
					if("A".equalsIgnoreCase(bloco)){
						jCEV08 = "7"; 
						sbQuery.append("AND 7C.JCEV01 = ? AND 70.JCEV08 = ? ");
					}else if("C".equalsIgnoreCase(bloco)){
						sbQuery.append("AND 7C.JCEV02 = ? AND 70.JCEV08 = ? ");
						jCEV08 = "6";
					}			
			
			st = conn.prepareStatement(sbQuery.toString());		
			
			st.setString(1, jCEV01);
			st.setString(2, jCEV08);
			
			rs = st.executeQuery();

			f55IJC70List = getResultSetObject(rs);
					
			
		}catch (Exception ex) {
			LogUtil.logError(ex, tabela);
		} finally {
			st.close();
			conn.close();
		}
		return f55IJC70List;		 
		
	}*/
	
	public List<F55IJC70> getF55IJC70byStatus(F55IJC7CId id, String[] modelofiscal){		
	
		CriteriaBuilder cb = EntityManagerHelper.getEntityManager().getCriteriaBuilder();
		CriteriaQuery<F55IJC70> cQuery = cb.createQuery(F55IJC70.class);
		Root<F55IJC70> cabecalho = cQuery.from(F55IJC70.class);
		
		List<String> modelofiscalArr = Arrays.asList(modelofiscal);

		/*TODO: [MAPEAMENTO] ASSUMI A CHAVE COMO CRITÉRIO DA BUSCA*/
		//Expression<F55IJC51> eJCCO = cabecalho.get("JCCO");
		Expression<F55IJC70> eJCWJOBS = cabecalho.get("JCWJOBS");
		Expression<F55IJC70> eJCBEGDATE = cabecalho.get("JCBEGDATE");
		Expression<F55IJC70> eJCENDDATE = cabecalho.get("JCENDDATE");
		//Expression<F55IJC51> eJCITM = cabecalho.get("JCITM");
		//Expression<F55IJC51> eJCUOM1 = cabecalho.get("JCUOM1");
		Expression<F55IJC70> eJCEV15 = cabecalho.get("JCEV15");
		Expression<F55IJC70> eJCB76MOTY = cabecalho.get("JCB76MOTY");		
				
		//Predicate pJCCO = cb.equal(eJCCO, id.getJCCO());
		Predicate pJCB76MOTY = eJCB76MOTY.in(modelofiscalArr);
		Predicate pJCWJOBS = cb.equal(eJCWJOBS, id.getJCWJOBS());
		Predicate pJCBEGDATE = cb.equal(eJCBEGDATE, id.getJCBEGDATE());
		Predicate pJCENDDATE = cb.equal(eJCENDDATE, id.getJCENDDATE());
		//Predicate pJCITM = cb.equal(eJCITM, id.getJCITM());
		//Predicate pJCUOM1 = cb.equal(eJCUOM1, id.getJCUOM1());
		Predicate pJCEV15Zero = cb.equal(eJCEV15, "0");
		Predicate pJCEV15Branco = cb.equal(eJCEV15, " ");
		Predicate pJCEV15Null = cb.isNull(eJCEV15);
				
		/*TODO: FILTRO PROPOSTO NA FUNCIONAL*/
		Predicate predicateEV15 = cb.or(pJCEV15Zero,pJCEV15Branco,pJCEV15Null);
		Predicate predicate = cb.and(pJCWJOBS,pJCBEGDATE,pJCENDDATE, predicateEV15, pJCB76MOTY);

		cQuery.select(cabecalho);
		cQuery.where(predicate);

		TypedQuery<F55IJC70> query = EntityManagerHelper.getEntityManager().createQuery(cQuery);
		query.setHint(QueryHints.CACHE_STORE_MODE, CacheStoreMode.REFRESH);
		
		List<F55IJC70> f55IJC70List = new ArrayList<F55IJC70>();
		
		f55IJC70List = query.getResultList();	

		
		EntityManagerHelper.closeEntityManager();
		return f55IJC70List;
		
	}

	public List<F55IJC70> getF55IJC70Recebida(Long job) {	

		CriteriaBuilder cb = EntityManagerHelper.getEntityManager().getCriteriaBuilder();
		CriteriaQuery<F55IJC70> cQuery = cb.createQuery(F55IJC70.class);
		Root<F55IJC70> cabecalho = cQuery.from(F55IJC70.class);

		Expression<F55IJC70> eLote = cabecalho.get("JCUK02");
		Expression<F55IJC70> eStatus = cabecalho.get("JCEV15");
		Expression<F55IJC70> eJcdej = cabecalho.get("JCDEJ");
		Expression<F55IJC70> eJcwjobs = cabecalho.get("JCWJOBS");
		
		Predicate pLote = cb.isNotNull(eLote);
		Predicate pStatus = cb.notEqual(eStatus, "#");
		Predicate pJcedj = cb.notEqual(eJcdej, "0");	
		Predicate pJcwjobs = cb.equal(eJcwjobs, job);

		Predicate predicate = cb.and(pStatus, pLote, pJcedj, pJcwjobs);

		cQuery.select(cabecalho);
		cQuery.where(predicate);
		//cQuery.orderBy(cb.asc(cabecalho.get("JCWJOBS")));

		TypedQuery<F55IJC70> query = EntityManagerHelper.getEntityManager().createQuery(cQuery);
		query.setHint(QueryHints.CACHE_STORE_MODE, CacheStoreMode.REFRESH);
		List<F55IJC70> listF55IJC70 = query.getResultList();

		EntityManagerHelper.closeEntityManager();
		return listF55IJC70;
	}	
	
	
	
	public void updateF55IJC70Retorno(F55IJC70 f) throws  JDBCException, SQLException{
		
		StringBuilder sbQuery = new StringBuilder();
		Connection conn = null;	
		PreparedStatement st = null;		

		try {			
			conn = JDBCConnection.getConnection();
			
			sbQuery.append("UPDATE ").append(AppConfig.getSchemaDTA()).append(".F55IJC70 SET JCEV15 = ?, JCA203 = ? "
					+ ",JCJOBN = ?, JCPID = ?, JCTDAY = ? , JCUSER = ?, JCUPMJ = ? "
					+ "WHERE JCBNNF = ? "
					+ "AND JCBSER = ? "
					+ "AND JCDCT = ? "
					+ "AND JCN001 = ? "
					+ "AND JCWJOBS = ?");
					
			st = conn.prepareStatement(sbQuery.toString());			
						
			st.setString(1, f.getJCEV15());
			st.setString(2, f.getJCA203());
			st.setString(3, f.getJCJOBN());
			st.setString(4, f.getJCPID());
			st.setLong(5, f.getJCTDAY());
			st.setString(6, f.getJCUSER());
			st.setString(7, f.getJCUPMJ());
			
			st.setInt(8, f.getJCBNNF());
			st.setString(9, f.getJCBSER());
			st.setString(10, f.getJCDCT());
			st.setInt(11, f.getJCN001());	
			st.setInt(12, f.getJCWJOBS());	
			
			/*
			List<String> parametros = new ArrayList<String>();
			parametros.add(f.getJCEV15());
			parametros.add(f.getJCA203());
			parametros.add(f.getJCJOBN());
			parametros.add(f.getJCPID());
			parametros.add(f.getJCTDAY().toString());
			parametros.add(f.getJCUSER());			
			parametros.add(f.getJCUPMJ());			
			parametros.add(f.getJCBNNF().toString());
			parametros.add(f.getJCBSER());
			parametros.add(f.getJCDCT());
			parametros.add(f.getJCN001().toString());			
			
			Map<String, Object> mapLog = new HashMap<String, Object>();
			mapLog.put("Query", sbQuery.toString());
			mapLog.put("Parametros", parametros);	
			
			LogUtil.logInfo(mapLog, tabela);
			*/
			st.executeUpdate();
			
		} catch (Exception ex) {
			LogUtil.logError(ex, tabela);
		} finally {
			st.close();
			conn.close();
		}
	}
	
	
	public void updateF55IJC70(F55IJC70 f)  throws  JDBCException, SQLException{

		StringBuilder sbQuery = new StringBuilder();
		Connection conn = null;	
		PreparedStatement st = null;
				
		try {
			conn = JDBCConnection.getConnection();
			
			sbQuery.append("UPDATE ").append(AppConfig.getSchemaDTA()).append(".F55IJC70 SET JCDEJ = ?, JCEV15 = ?, JCUK02 = ?, JCBRNFDE = ?  "
					+ "WHERE JCBNNF = ? "
					+ "AND JCBSER = ? "
					+ "AND JCDCT = ? "
					+ "AND JCN001 = ?");
			
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
			List<String> parametros = new ArrayList<String>();
			parametros.add(f.getJCDEJ().toString());
			parametros.add(f.getJCEV15());
			parametros.add(f.getJCUK02().toString());
			parametros.add(f.getJCBRNFDE().toString());					
			parametros.add(f.getJCBNNF().toString());
			parametros.add(f.getJCBSER());
			parametros.add(f.getJCDCT());
			parametros.add(f.getJCN001().toString());			
			
			Map<String, Object> mapLog = new HashMap<String, Object>();
			mapLog.put("Query", sbQuery.toString());
			mapLog.put("Parametros", parametros);	
			
			LogUtil.logInfo(mapLog, tabela);
			*/
			st.executeUpdate();	
			
		} catch (Exception ex) {
			LogUtil.logError(ex, tabela);
		} finally {
			st.close();
			conn.close();
		}

	}
	
	public void updateF55IJC70Erro(F55IJC70 f) throws  JDBCException, SQLException{
		
		StringBuilder sbQuery = new StringBuilder();
		Connection conn = null;	
		PreparedStatement st = null;		

		try {			
			conn = JDBCConnection.getConnection();
			
			sbQuery.append("UPDATE ").append(AppConfig.getSchemaDTA()).append(".F55IJC70 SET JCEV15 = ?, SET JCUK02 = ?  "
				+ "WHERE JCBNNF = ? "
				+ "AND JCBSER = ? "
				+ "AND JCDCT = ? "
				+ "AND JCN001 = ?");
			
			st = conn.prepareStatement(sbQuery.toString());	
						
			st.setString(1, "E");
			st.setLong(2, new Long(0));
			st.setInt(3, f.getJCBNNF());
			st.setString(4, f.getJCBSER());
			st.setString(5, f.getJCDCT());
			st.setInt(6, f.getJCN001());
			
			/*
			List<String> parametros = new ArrayList<String>();
			parametros.add("E");
			parametros.add(f.getJCBNNF().toString());
			parametros.add(f.getJCBSER());
			parametros.add(f.getJCDCT());
			parametros.add(f.getJCN001().toString());			
			
			Map<String, Object> mapLog = new HashMap<String, Object>();
			mapLog.put("Query", sbQuery.toString());
			mapLog.put("Parametros", parametros);	
			
			LogUtil.logInfo(mapLog, tabela);
			*/
			st.executeUpdate();			
			
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			st.close();
			conn.close();
		}
	}

}
