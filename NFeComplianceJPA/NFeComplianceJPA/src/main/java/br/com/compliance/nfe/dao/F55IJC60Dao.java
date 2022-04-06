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
import br.com.compliance.nfe.jde.domain.F55IJC60;
import br.com.compliance.nfe.jde.domain.F55IJC7CId;
import br.com.compliance.nfe.jpa.EntityManagerHelper;
import br.com.compliance.nfe.util.AppConfig;

public class F55IJC60Dao {
	
	public List<F55IJC60> getF55IJC60(F55IJC7CId id){
		List<F55IJC60> f55IJC60List = new ArrayList<F55IJC60>();
		
		CriteriaBuilder cb = EntityManagerHelper.getEntityManager().getCriteriaBuilder();
		CriteriaQuery<F55IJC60> cQuery = cb.createQuery(F55IJC60.class);
		Root<F55IJC60> cabecalho = cQuery.from(F55IJC60.class);
		
		/*TODO: [MAPEAMENTO] ASSUMI A CHAVE COMO CRITÉRIO DA BUSCA*/
		//Expression<F55IJC51> eJCCO = cabecalho.get("JCCO");
		Expression<F55IJC60> eJCWJOBS = cabecalho.get("JCWJOBS");
		Expression<F55IJC60> eJCBEGDATE = cabecalho.get("JCBEGDATE");
		Expression<F55IJC60> eJCENDDATE = cabecalho.get("JCENDDATE");
		//Expression<F55IJC51> eJCITM = cabecalho.get("JCITM");
		//Expression<F55IJC51> eJCUOM1 = cabecalho.get("JCUOM1");
		Expression<F55IJC60> eJCEV15 = cabecalho.get("JCEV15");
				
		//Predicate pJCCO = cb.equal(eJCCO, id.getJCCO());
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
		Predicate predicate = cb.and(pJCWJOBS,pJCBEGDATE,pJCENDDATE, predicateEV15);
		
		/*TODO: CHAVE DA TABELA NO BANCO
		Predicate predicate = cb.and(pJCCO,pJCWJOBS,pJCBEGDATE,pJCENDDATE,pJCITM,pJCUOM1);
		*/
		
		cQuery.select(cabecalho);
		cQuery.where(predicate);
		
		TypedQuery<F55IJC60> query = EntityManagerHelper.getEntityManager().createQuery(cQuery);
		query.setHint(QueryHints.CACHE_STORE_MODE, CacheStoreMode.REFRESH);
						
		if(!query.getResultList().isEmpty()){
			f55IJC60List = query.getResultList();
		}				
		
		EntityManagerHelper.closeEntityManager();
		
		return f55IJC60List;
	}

	public HashMap<String, Integer> atualizaTabela(String lote, int data, int ev15, F55IJC60 id) throws JDBCException, SQLException {
		StringBuilder sbQuery = new StringBuilder();
		Connection conn = null;	
		PreparedStatement st = null;
		HashMap<String,Integer> atualizacoes = new HashMap<String,Integer>();		
		
		try {			
			conn = JDBCConnection.getConnection();
			String tabela = "F55IJC60";
			sbQuery.append("UPDATE ").append(AppConfig.getSchemaDTA()).append(".").append(tabela).append(" ")
			.append("SET JCUK02 = ?, JCDEJ = ?, JCEV15 = ? ")
			.append("WHERE  JCWJOBS = ? AND trim(JCTAX) = ? AND trim(JCLITM) = ? AND JCAN8 = ? ");
					
			st = conn.prepareStatement(sbQuery.toString());	
			
			st.setString(1, lote);
			st.setInt(2, data);
			st.setLong(3, ev15);			
			st.setLong(4, id.getJCWJOBS());
			st.setString(5, id.getJCTAX());
			st.setString(6, id.getJCLITM());
			st.setLong(7, id.getJCAN8());
							
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

}
