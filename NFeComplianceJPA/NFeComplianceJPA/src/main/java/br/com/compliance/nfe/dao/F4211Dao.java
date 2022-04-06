package br.com.compliance.nfe.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import br.com.compliance.nfe.jdbc.JDBCConnection;
import br.com.compliance.nfe.jdbc.JDBCException;
import br.com.compliance.nfe.jde.domain.F4211;
import br.com.compliance.nfe.jde.domain.F7611B;
import br.com.compliance.nfe.jpa.EntityManagerHelper;
import br.com.compliance.nfe.util.AppConfig;
import br.com.compliance.nfe.util.LogUtil;

public class F4211Dao {

	private static String tabela = "F4211";
	
	public F4211 getF4211byKey(F7611B f){
		
		
		CriteriaBuilder cb = EntityManagerHelper.getEntityManager().getCriteriaBuilder();
		CriteriaQuery<F4211> cQuery = cb.createQuery(F4211.class);
		Root<F4211> cabecalho = cQuery.from(F4211.class);
		
		Expression<F4211> eDOCO = cabecalho.get("SDDOCO");
		Expression<F4211> eDCTO = cabecalho.get("SDDCTO");
		Expression<F4211> eKCOO = cabecalho.get("SDKCOO");
		Expression<F4211> eLNID = cabecalho.get("SDLNID");
		
		Predicate pDOCO = cb.equal(eDOCO, f.getFDDOCO());
		Predicate pDCTO = cb.equal(eDCTO, f.getFDPDCT());
		Predicate pKCOO = cb.equal(eKCOO, f.getFDKCOO());
		Predicate pLNID = cb.equal(eLNID, f.getFDLNID());

		Predicate predicate = cb.and(pDOCO, pDCTO, pKCOO, pLNID);

		cQuery.select(cabecalho);
		cQuery.where(predicate);

		TypedQuery<F4211> query = EntityManagerHelper.getEntityManager().createQuery(cQuery);
		
		F4211 f4211 = new F4211();
		
		//f4211 = query.getSingleResult();
		
		f4211 = query.getResultList().get(0);
		
		return f4211;		
		
	}

	public void updateF4211(F7611B f, F4211 f4211) throws JDBCException, SQLException {

		StringBuilder sbQuery = new StringBuilder();
		Connection conn = null;
		PreparedStatement st = null;
		try {
			conn = JDBCConnection.getConnection();

			sbQuery.append("UPDATE ").append(AppConfig.getSchemaDTA()).append(".F4211 SET SDNXTR = ?, SDLTTR = ? "
					+ ",SDJOBN = ?, SDPID = ?, SDTDAY = ? , SDUSER = ?, SDUPMJ = ? "
					+ "WHERE SDDCTO = ? " + "AND SDDOCO = ? " + "AND SDLNID = ? "
					+ "AND SDKCOO = ?");

			st = conn.prepareStatement(sbQuery.toString());
			
			st.setString(1, f4211.getSDNXTR());
			st.setString(2, f4211.getSDLTTR());			
			st.setString(3, f4211.getSDJOBN());
			st.setString(4, f4211.getSDPID());
			st.setLong(5, f4211.getSDTDAY());
			st.setString(6, f4211.getSDUSER());
			st.setLong(7, f4211.getSDUPMJ());
			st.setString(8, f.getFDPDCT());
			st.setLong(9, f.getFDDOCO());
			st.setLong(10, f.getFDLNID());
			st.setString(11, f.getFDKCOO());			
			
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
