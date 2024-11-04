package br.com.compliance.nfe.teste;

import java.sql.SQLException;

import br.com.compliance.nfe.dao.F55IJC83Dao;
import br.com.compliance.nfe.jdbc.JDBCException;
import br.com.compliance.nfe.jde.domain.F55IJC83;
import br.com.compliance.nfe.jde.domain.F55IJC83Id;

public class TesteF55IJC83 {

	public static void main(String[] args) {

		/*
		 * <F55IJC80>
		 * <JCBNNF>37999</JCBNNF>
		 * <JCBSER>01</JCBSER>
		 * <JCN001>93516</JCN001>
		 * <JCDCT>NS</JCDCT>
		 * <JCISSU>124228</JCISSU>
		 * </F55IJC83>
		 */

		F55IJC83 f55ijc83 = new F55IJC83();
		F55IJC83Id id = new F55IJC83Id();
				
		id.setJCBNNF(37999);
		id.setJCBSER("01");
		id.setJCDCT("NS");
		id.setJCN001((long) 93516);
		id.setJCNSP(123456);
		
		f55ijc83.setId(id);
//		f55ijc83.setJCISSU("124288");

		F55IJC83Dao dao = new F55IJC83Dao();

		try {
			dao.insertF55IJC83(f55ijc83);
		} catch (JDBCException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
