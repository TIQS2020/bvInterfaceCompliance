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
import br.com.compliance.nfe.jde.domain.F42119;
import br.com.compliance.nfe.jde.domain.F7611B;
import br.com.compliance.nfe.jpa.EntityManagerHelper;
import br.com.compliance.nfe.util.AppConfig;
import br.com.compliance.nfe.util.LogUtil;

public class F42119Dao {

	private static String tabela = "F42119";
	
	public F42119 getF42119byKey(F7611B f){
		
		
		CriteriaBuilder cb = EntityManagerHelper.getEntityManager().getCriteriaBuilder();
		CriteriaQuery<F42119> cQuery = cb.createQuery(F42119.class);
		Root<F42119> cabecalho = cQuery.from(F42119.class);
		
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

		TypedQuery<F42119> query = EntityManagerHelper.getEntityManager().createQuery(cQuery);
		
		F42119 f42119 = new F42119();
		
		//f4211 = query.getSingleResult();
		
		f42119 = query.getResultList().get(0);
		
		return f42119;		
		
	}

	public void updateF42119(F7611B f, F42119 f42119) throws JDBCException, SQLException {

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
			
			st.setString(1, f42119.getSDNXTR());
			st.setString(2, f42119.getSDLTTR());			
			st.setString(3, f42119.getSDJOBN());
			st.setString(4, f42119.getSDPID());
			st.setLong(5, f42119.getSDTDAY());
			st.setString(6, f42119.getSDUSER());
			st.setLong(7, f42119.getSDUPMJ());
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
