package br.com.compliance.nfe.teste;

import java.sql.SQLException;

import br.com.compliance.nfe.dao.F55IJC82Dao;
import br.com.compliance.nfe.jdbc.JDBCException;
import br.com.compliance.nfe.jde.domain.F55IJC82;
import br.com.compliance.nfe.jde.domain.F55IJC82Id;

public class TesteF55IJC82 {

	public static void main(String[] args) {

		/*
		 * <F55IJC80> <JCBNNF>37999</JCBNNF> <JCBSER>01</JCBSER> <JCN001>93516</JCN001>
		 * <JCDCT>NS</JCDCT> <JCISSU>124228</JCISSU> </F55IJC82>
		 */

		F55IJC82 f55ijc82 = new F55IJC82();
		F55IJC82Id id = new F55IJC82Id();

		id.setJCBNNF(37999);
		id.setJCBSER("01");
		id.setJCDCT("NS");
		id.setJCN001((long) 93516);
		id.setJCUKID("123456789");
		id.setJCSEQ(1234);
		id.setJCLIN(12345);

		f55ijc82.setId(id);
//		f55ijc82.setJCISSU("124288");

		F55IJC82Dao dao = new F55IJC82Dao();

		try {
			dao.insertF55IJC82(f55ijc82);
		} catch (JDBCException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
