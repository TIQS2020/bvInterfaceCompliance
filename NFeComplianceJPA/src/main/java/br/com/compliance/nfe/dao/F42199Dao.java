package br.com.compliance.nfe.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.compliance.nfe.jdbc.JDBCConnection;
import br.com.compliance.nfe.jdbc.JDBCException;
import br.com.compliance.nfe.jde.domain.F4211;
import br.com.compliance.nfe.util.AbstractDatabaseHandler;
import br.com.compliance.nfe.util.AppConfig;
import br.com.compliance.nfe.util.LogUtil;

public class F42199Dao<T>  extends AbstractDatabaseHandler<T> {
	
	public F42199Dao(Class<T> type) {
		super(type);
	}

	private static String tabela = "F42199";
	
	public void insertHistorico(F4211 f4211)  throws  JDBCException, SQLException{
		
		StringBuilder sbQuery = new StringBuilder();		
		Connection conn = null;	
		PreparedStatement st = null;	
		
		try{			
			conn = JDBCConnection.getConnection();		
			
			sbQuery.append("INSERT INTO ").append(AppConfig.getSchemaDTA()).append(".F42199 ")
				   .append("VALUES(" )
				   .append(super.getColumns(true))
				   .append(" )");			
					
			st = conn.prepareStatement(sbQuery.toString());	
			
			setPreparedStatement(st, f4211);
			
		}catch (Exception ex) {
			LogUtil.logError(ex, tabela);
		} finally {
			st.close();
			conn.close();
		}
		
	}

}
