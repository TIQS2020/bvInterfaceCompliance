package br.com.compliance.nfe.teste;

import java.sql.SQLException;

import br.com.compliance.nfe.dao.F55IJC84Dao;
import br.com.compliance.nfe.jdbc.JDBCException;
import br.com.compliance.nfe.jde.domain.F55IJC84;
import br.com.compliance.nfe.jde.domain.F55IJC84Id;

public class TesteF55IJC84 {

	public static void main(String[] args) {

		/*
		 * <F55IJC80>
		 * <JCBNNF>37999</JCBNNF>
		 * <JCBSER>01</JCBSER>
		 * <JCN001>93516</JCN001>
		 * <JCDCT>NS</JCDCT>
		 * <JCISSU>124228</JCISSU>
		 * </F55IJC84>
		 */

		F55IJC84 f55ijc84 = new F55IJC84();
		F55IJC84Id id = new F55IJC84Id();
				
		id.setJCBNNF(37999);
		id.setJCBSER("01");
		id.setJCDCT("NS");
		id.setJCN001((long) 93516);
		id.setJCIA01(123);
				
		
		f55ijc84.setId(id);
//		f55ijc84.setJCISSU("124288");

		F55IJC84Dao dao = new F55IJC84Dao();

		try {
			dao.insertF55IJC84(f55ijc84);
		} catch (JDBCException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
