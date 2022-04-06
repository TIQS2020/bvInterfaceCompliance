package br.com.compliance.nfe.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import br.com.compliance.nfe.util.AppConfig;

public class JDBCConnection {

	Logger logger = LogManager.getLogger(getClass().getName());

	// Metodo q obtem uma nova conexao
	public static Connection getConnection() throws JDBCException {

		try {
			// carrega as configs
			new AppConfig();
			// cria a conexao
			Class.forName(AppConfig.getDriver());
			return DriverManager.getConnection(AppConfig.getUrl(), AppConfig.getUser(), AppConfig.getPassword());
		} catch (Throwable t) {
			t.printStackTrace();
			throw new JDBCException("Erro ao obter uma conexao com o banco de dados.");
		}

	}

	public static void close(Connection connection) {

		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}