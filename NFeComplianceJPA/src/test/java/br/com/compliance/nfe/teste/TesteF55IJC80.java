package br.com.compliance.nfe.teste;

import java.sql.SQLException;

import br.com.compliance.nfe.dao.F55IJC80Dao;
import br.com.compliance.nfe.jdbc.JDBCException;
import br.com.compliance.nfe.jde.domain.F55IJC80;
import br.com.compliance.nfe.jde.domain.F55IJC80Id;

public class TesteF55IJC80 {

	public static void main(String[] args) {

		/*
		 * <F55IJC80>
		 * <JCBNNF>37999</JCBNNF>
		 * <JCBSER>01</JCBSER>
		 * <JCN001>93516</JCN001>
		 * <JCDCT>NS</JCDCT>
		 * <JCISSU>124228</JCISSU>
		 * </F55IJC80>
		 */

		F55IJC80 f55ijc80 = new F55IJC80();
		F55IJC80Id id = new F55IJC80Id();
				
		id.setJCBNNF(37999);
		id.setJCBSER("01");
		id.setJCDCT("NS");
		id.setJCN001(93516);
				
		
		f55ijc80.setId(id);
		f55ijc80.setJCISSU("124288");

		F55IJC80Dao dao = new F55IJC80Dao();

		try {
			dao.insertF55IJC80(f55ijc80);
		} catch (JDBCException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
