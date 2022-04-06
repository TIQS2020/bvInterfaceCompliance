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
import br.com.compliance.nfe.jde.domain.F55IJC7C;
import br.com.compliance.nfe.jde.domain.F55IJC7CId;
import br.com.compliance.nfe.jpa.EntityManagerHelper;
import br.com.compliance.nfe.util.AppConfig;

public class F55IJC7CDao {
	
	public List<F55IJC7C> getF55IJC7CByStatus(String status, String bloco){
		
		List<F55IJC7C> listF55IJC7C = new ArrayList<F55IJC7C>();
		
		CriteriaBuilder cb = EntityManagerHelper.getEntityManager().getCriteriaBuilder();
		CriteriaQuery<F55IJC7C> cQuery = cb.createQuery(F55IJC7C.class);
		Root<F55IJC7C> cabecalho = cQuery.from(F55IJC7C.class);
		
		Expression<F55IJC7C> eJCEV01 = cabecalho.get("JCEV01");	
		Expression<F55IJC7C> eJCEV02 = cabecalho.get("JCEV02");	
		Expression<F55IJC7C> eJCEV03 = cabecalho.get("JCEV03");
		Expression<F55IJC7C> eJCEV04 = cabecalho.get("JCEV04");	
		Expression<F55IJC7C> eJCEV05 = cabecalho.get("JCEV05");	
		Expression<F55IJC7C> eJCEV06 = cabecalho.get("JCEV06");
		Expression<String> eJCA1ST = cabecalho.get("JCA1ST");	
		Expression<String> eJCA2ST = cabecalho.get("JCA2ST");
				
		Expression<String> eJCA1STTrim = cb.trim(eJCA1ST);
		Expression<String> eJCA2STTrim = cb.trim(eJCA2ST);
		
		Predicate pJCEV01 = cb.equal(eJCEV01, "F");
		Predicate pJCEV02 = cb.equal(eJCEV02, "F");		
		Predicate pJCEV03 = cb.equal(eJCEV03, "F");
		Predicate pJCEV04 = cb.equal(eJCEV04, "F");
		Predicate pJCEV05 = cb.equal(eJCEV05, "F");	
		Predicate pJCEV06 = cb.equal(eJCEV06, "F");
		Predicate pJCA1ST = cb.equal(eJCA1STTrim, status);
		Predicate pJCA2ST = cb.equal(eJCA2STTrim, 0);
				
		Predicate predicate = null;
		
		/*TODO: TESTE PRA CADA BLOCO*/
		if("EFD".equalsIgnoreCase(bloco)){
			predicate = cb.and(pJCEV02, pJCA1ST, pJCA2ST);
		}else if("CONTINUO".equalsIgnoreCase(bloco)){
			predicate = cb.and(pJCEV03, pJCA1ST, pJCA2ST);
		}else if("MERCANTIL".equalsIgnoreCase(bloco)){
			predicate = cb.and(pJCEV01, pJCA1ST, pJCA2ST);
		}else if("H".equalsIgnoreCase(bloco)){
			predicate = cb.and(pJCEV04, pJCA1ST, pJCA2ST);
		}else if("K".equalsIgnoreCase(bloco)){
			predicate = cb.and(pJCEV05, pJCA1ST, pJCA2ST);
		}else if ("REINF".equalsIgnoreCase(bloco)) {
			predicate = cb.and(pJCEV06, pJCA1ST, pJCA2ST);
		}
			
		cQuery.select(cabecalho);
		cQuery.where(predicate);
		
		TypedQuery<F55IJC7C> query = EntityManagerHelper.getEntityManager().createQuery(cQuery);
		query.setHint(QueryHints.CACHE_STORE_MODE, CacheStoreMode.REFRESH);
						
		if(!query.getResultList().isEmpty()){
			listF55IJC7C = query.getResultList();
		}				
		
		EntityManagerHelper.closeEntityManager();
		
		return listF55IJC7C;	
		
	}

	public HashMap<String,Integer> atualizaTabelasBlocoK(String lote, int data, int ev15, F55IJC7CId id) throws SQLException, JDBCException {
		StringBuilder sbQuery = new StringBuilder();
		Connection conn = null;	
		PreparedStatement st = null;
		HashMap<String,Integer> atualizacoes = new HashMap<String,Integer>();
		
		for(int index = 1; index <= 6; index++){
			try {			
				conn = JDBCConnection.getConnection();
				String tabela = "F55IJC5" + index;
				sbQuery.append("UPDATE ").append(AppConfig.getSchemaDTA()).append(".").append(tabela).append(" ")
				.append("SET JCUK02 = ?, JCDEJ = ?, JCEV15 = ? ")
				.append("WHERE JCCO = ? ")
				.append("AND JCWJOBS = ? ")
				.append("AND JCBEGDATE = ? ")
				.append("AND JCENDDATE = ?");
						
				st = conn.prepareStatement(sbQuery.toString());	
				
				st.setString(1, lote);
				st.setInt(2, data);
				st.setLong(3, ev15);
				
				st.setString(4, id.getJCCO());				
				st.setLong(5, id.getJCWJOBS());
				st.setString(6, id.getJCBEGDATE());
				st.setString(7, id.getJCENDDATE());
								
				int linhas = st.executeUpdate();				
				atualizacoes.put(tabela, linhas);
			} catch (SQLException ex) {
				ex.printStackTrace();
			} finally {
				st.close();
				conn.close();
			}
		}	
		
		return atualizacoes;
		
	}

	public void atualizaTabelaControle(F55IJC7CId id, boolean retorno, boolean error) throws JDBCException, SQLException {
		// TODO Auto-generated method stub
		StringBuilder sbQuery = new StringBuilder();
		Connection conn = null;	
		PreparedStatement st = null;
		//HashMap<String,Integer> atualizacoes = new HashMap<String,Integer>();	
		
		try {			
			conn = JDBCConnection.getConnection();
			String tabela = "F55IJC7C";
			sbQuery.append("UPDATE ").append(AppConfig.getSchemaDTA()).append(".").append(tabela).append(" ")
			.append("SET JCA2ST = ? ")			
			//.append("WHERE JCCO = ? ")
			.append("WHERE ")
			.append("JCWJOBS = ? ")
			.append("AND JCBEGDATE = ? ")
			.append("AND JCENDDATE = ?");
					
			st = conn.prepareStatement(sbQuery.toString());	
			
			if(retorno){
				/*TODO: DEFINIR CAMPO DE STATUS PARA INFORMAR QUE O JOB JÁ FOI FECHADO*/
				if(error){
					st.setString(1, "9");
					//st.setString(2, "I");
				}else{
					st.setString(1, "2");
					//st.setString(2, "I");
				}
				
			}else{
				st.setString(1, "1");
				//st.setString(2, "I");
			}			
			
//			st.setString(2, id.getJCCO());				
			st.setLong(2, id.getJCWJOBS());
			st.setString(3, id.getJCBEGDATE());
			st.setString(4, id.getJCENDDATE());
							
			st.executeUpdate();			
			conn.commit();
		} catch (SQLException ex) {
			ex.printStackTrace();
		} finally {
			st.close();
			conn.close();
		}
		
	}

	public List<F55IJC7C> getF55IJC7CRetorno() {
		List<F55IJC7C> listF55IJC7C = new ArrayList<F55IJC7C>();
		
		CriteriaBuilder cb = EntityManagerHelper.getEntityManager().getCriteriaBuilder();
		CriteriaQuery<F55IJC7C> cQuery = cb.createQuery(F55IJC7C.class);
		Root<F55IJC7C> cabecalho = cQuery.from(F55IJC7C.class);				
			
		Expression<String> eJCA2ST = cabecalho.get("JCA2ST");				
		
		Expression<String> eJCA2STTrim = cb.trim(eJCA2ST);
		
		Predicate pJCA2ST = cb.equal(eJCA2STTrim, 1);		
			
		cQuery.select(cabecalho);
		cQuery.where(pJCA2ST);
		
		TypedQuery<F55IJC7C> query = EntityManagerHelper.getEntityManager().createQuery(cQuery);
		query.setHint(QueryHints.CACHE_STORE_MODE, CacheStoreMode.REFRESH);
						
		if(!query.getResultList().isEmpty()){
			listF55IJC7C = query.getResultList();
		}				
		
		EntityManagerHelper.closeEntityManager();
		
		return listF55IJC7C;	
	}

	

}
