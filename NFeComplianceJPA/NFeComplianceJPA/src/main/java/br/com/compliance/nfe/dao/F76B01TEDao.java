package br.com.compliance.nfe.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import br.com.compliance.nfe.jdbc.JDBCConnection;
import br.com.compliance.nfe.jdbc.JDBCException;
import br.com.compliance.nfe.jde.domain.F76B01TE;
import br.com.compliance.nfe.jde.domain.F76B01TEId;
import br.com.compliance.nfe.jpa.EntityManagerHelper;
import br.com.compliance.nfe.util.AppConfig;
import br.com.compliance.nfe.util.LogUtil;

public class F76B01TEDao {
	
	private static String tabela = "F76B01TE";
	
	public F76B01TE findF76b01te(F76B01TEId id) {
		
		CriteriaBuilder cb = EntityManagerHelper.getEntityManager().getCriteriaBuilder();
		CriteriaQuery<F76B01TE> cQuery = cb.createQuery(F76B01TE.class);
		Root<F76B01TE> cabecalho = cQuery.from(F76B01TE.class);

		Expression<F76B01TE> eBnnf = cabecalho.get("FHBNNF");
		Expression<F76B01TE> eBser = cabecalho.get("FHBSER");
		Expression<F76B01TE> eN001 = cabecalho.get("FHN001");
		Expression<F76B01TE> eDct = cabecalho.get("FHDCT");

		Predicate pBnnf = cb.equal(eBnnf, id.getFHBNNF());
		Predicate pBser = cb.equal(eBser, id.getFHBSER());
		Predicate pN001 = cb.equal(eN001, id.getFHN001());
		Predicate pDct = cb.equal(eDct, id.getFHDCT());

		Predicate predicate = cb.and(pBnnf, pBser, pN001, pDct);

		cQuery.select(cabecalho);
		cQuery.where(predicate);

		TypedQuery<F76B01TE> query = EntityManagerHelper.getEntityManager().createQuery(cQuery);
		F76B01TE f5576NFE = new F76B01TE();
		try {
			f5576NFE = (F76B01TE)query.getSingleResult();
		} catch (NoResultException ex) {
			// TODO: tratar excecao
			ex.printStackTrace();
		} finally {
			EntityManagerHelper.closeEntityManager();
		}
		return f5576NFE;
	}
	
	public void updateF76b01te(F76B01TE fNFe) throws  JDBCException, SQLException{	
		
		StringBuilder sbQuery = new StringBuilder();
		Connection conn = null;	
		PreparedStatement st = null;		
		
		try{
			conn = JDBCConnection.getConnection();
			
			sbQuery.append("UPDATE ").append(AppConfig.getSchemaDTA()).append(".F76B01TE SET FHB76ESTC = ?, "
					+ "FHUPMJ = ?, FHTDAY = ?, FHB76ELN  = ?, FHB76EAN  = ?, "
				+ "FHB76ERN = ?, FHUSER = ?, FHPID = ?, FHB76EST = ?, FHTORG = ?, FHB76ELND = ?, FHB76EREF = ?, "
				+ " FHB76ELNT = ? "
				+ "WHERE FHBNNF = ? "
				+ "AND FHBSER = ? "
				+ "AND FHDCT = ? "
				+ "AND FHN001 = ?");
		
			
			st = conn.prepareStatement(sbQuery.toString());			
			
			st.setString(1, fNFe.getFHB76ESTC());
			st.setDouble(2, fNFe.getFHUPMJ());
			st.setDouble(3, fNFe.getFHTDAY());
			st.setString(4, fNFe.getFHB76ELN());
			st.setString(5, fNFe.getFHB76EAN());
			//st.setString(4, fNFe.getFHB76AKEY());
			st.setString(6, fNFe.getFHB76ERN());
			st.setString(7, fNFe.getFHUSER());
			st.setString(8, fNFe.getFHPID());
			st.setString(9, fNFe.getFHB76EST());		
			st.setString(10, fNFe.getFHTORG());
			st.setDouble(11, fNFe.getFHB76ELND());
			st.setString(12, fNFe.getFHB76EREF());
			st.setDouble(13, fNFe.getFHB76ELNT());
			
			st.setInt(14, fNFe.getFHBNNF());
			st.setString(15, fNFe.getFHBSER());
			st.setString(16, fNFe.getFHDCT());
			st.setInt(17, fNFe.getFHN001());
			
			
			/*
			List<String> parametros = new ArrayList<String>();
			parametros.add(fNFe.getNEB76ESTC());
			parametros.add(fNFe.getNEUPMJ().toString());
			parametros.add(fNFe.getNEUPMT().toString());
			parametros.add(fNFe.getNEB76AKEY());
			parametros.add(fNFe.getNEB76ERN());
			parametros.add(fNFe.getNEUSER());			
			parametros.add(fNFe.getNEPID());
			parametros.add(fNFe.getNEB76EST());
			parametros.add(fNFe.getNEBNNF().toString());
			parametros.add(fNFe.getNEBSER());
			parametros.add(fNFe.getNEDCT());
			parametros.add(fNFe.getNEN001().toString());			
			
			Map<String, Object> mapLog = new HashMap<String, Object>();
			mapLog.put("Query", sbQuery.toString());
			mapLog.put("Parametros", parametros);	
			
			LogUtil.logInfo(mapLog, tabela);
			*/
			st.executeUpdate();			
			
		}catch(Exception ex){
			LogUtil.logError(ex, tabela);
		}finally{
			st.close();
			conn.close();
		}		
		
	}

	public void updateF76b01teErro(F76B01TE f76b01te)  throws  JDBCException, SQLException{
		StringBuilder sbQuery = new StringBuilder();
		Connection conn = null;	
		PreparedStatement st = null;		
		
		try{
			conn = JDBCConnection.getConnection();
			
			sbQuery.append("UPDATE ").append(AppConfig.getSchemaDTA()).append(".F76B01TE SET FHB76EST = ? "					
				+ "WHERE FHBNNF = ? "
				+ "AND FHBSER = ? "
				+ "AND FHDCT = ? "
				+ "AND FHN001 = ?");
		
			
			st = conn.prepareStatement(sbQuery.toString());			
			
			st.setString(1, f76b01te.getFHB76EST());			
			st.setInt(2, f76b01te.getFHBNNF());
			st.setString(3, f76b01te.getFHBSER());
			st.setString(4, f76b01te.getFHDCT());
			st.setInt(5, f76b01te.getFHN001());			
			st.executeUpdate();			
			
		}catch(Exception ex){
			LogUtil.logError(ex, tabela);
		}finally{
			st.close();
			conn.close();
		}
		
		
	}

}
