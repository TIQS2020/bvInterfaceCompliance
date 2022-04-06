package br.com.compliance.nfe.teste;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import br.com.compliance.nfe.jdbc.JDBCConnection;
import br.com.compliance.nfe.util.AppConfig;

public class TesteJDBC {

	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement st = null;
		// Statement stm = null;
		//OraclePreparedStatement ost = null;

		try {
			conn = JDBCConnection.getConnection();

			String sql = "SELECT JCBNNF, JCEV14, JCEV15 FROM " + AppConfig.getSchemaDTA()
					+ ".F55IJC80 WHERE JCDEJ = ?  AND JCEV14 = ? AND JCEV15 = ?";

			// String sql2 = "SELECT * FROM TESTDTA.F0101 WHERE ABAT2 = ?";
			System.out.println(sql);

			st = conn.prepareStatement(sql);

			// st.setString(1, "N");

			st.setInt(1, 0);
			st.setString(2, "1");
			st.setString(3, "0");

			// stm = conn.createStatement();
			ResultSet rs = st.executeQuery();

			while (rs.next()) {
				System.out.println("EV14: " + rs.getString("JCEV14"));
				System.out.println("EV15: " + rs.getString("JCEV15"));
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}
