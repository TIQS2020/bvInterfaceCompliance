package br.com.compliance.nfe.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.compliance.nfe.jdbc.JDBCConnection;
import br.com.compliance.nfe.jdbc.JDBCException;
import br.com.compliance.nfe.jde.domain.F76B01TE;
import br.com.compliance.nfe.util.AppConfig;
import br.com.compliance.nfe.util.LogUtil;

public class F76B12TEDao {
	
	private static String tabela = "F76B12TE";
	
	public void updateF76B12TE(F76B01TE f76b01te)  throws  JDBCException, SQLException{
		StringBuilder sbQuery = new StringBuilder();
		Connection conn = null;	
		PreparedStatement st = null;		
		
		try{
			conn = JDBCConnection.getConnection();
			
			sbQuery.append("UPDATE ").append(AppConfig.getSchemaDTA()).append(".F76B12TE SET SLB76PRON = ? "	
				+ ",  SLB76EMTY = ?"
				+ ", SLB76NFST = ?"
				+ ",  SLB76SACT = ?"	
				+ ",  SLB76TNF = ?"
				+ ",  SLB76AKEY = ?"
				+ ",  SLB76EPRD = ?"
				+ ",  SLB76EPRT = ?"
				+ ",  SLB76RSPC = ?"
				+ " WHERE SLBNNF = ? "
				+ "AND SLBSER = ? "
				+ "AND SLDCT = ? "
				+ "AND SLN001 = ?");
		
			
			st = conn.prepareStatement(sbQuery.toString());	
			
			
			
			st.setLong(1, f76b01te.getFHB76ERN() == null || "".equalsIgnoreCase(f76b01te.getFHB76ERN()) ? 0 : Long.parseLong(f76b01te.getFHB76ERN()));
			st.setString(2, "1");
			st.setString(3, "A");
			st.setString(4, "Y");
			st.setString(5, "BRNFEO");
			st.setString(6, f76b01te.getFHB76ELN() + f76b01te.getFHB76EAN());
			st.setLong(7, f76b01te.getFHUPMJ());			
			st.setLong(8, f76b01te.getFHTDAY());
			st.setInt(9, 100);
			st.setInt(10, f76b01te.getFHBNNF());
			st.setString(11, f76b01te.getFHBSER());
			st.setString(12, f76b01te.getFHDCT());
			st.setInt(13, f76b01te.getFHN001());			
			st.executeUpdate();			
			
		}catch(Exception ex){
			LogUtil.logError(ex, tabela);
		}finally{
			st.close();
			conn.close();
		}
		
		
	}

}
