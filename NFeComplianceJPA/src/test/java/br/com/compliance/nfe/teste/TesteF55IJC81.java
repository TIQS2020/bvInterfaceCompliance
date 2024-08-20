package br.com.compliance.nfe.teste;

import java.sql.SQLException;

import br.com.compliance.nfe.dao.F55IJC81Dao;
import br.com.compliance.nfe.jdbc.JDBCException;
import br.com.compliance.nfe.jde.domain.F55IJC81;
import br.com.compliance.nfe.jde.domain.F55IJC81Id;

public class TesteF55IJC81 {

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

		F55IJC81 f55ijc81 = new F55IJC81();
		F55IJC81Id id = new F55IJC81Id();

		id.setJCBNNF(37999);
		id.setJCBSER("01");
		id.setJCDCT("NS");
		id.setJCUKID((long) 123456789);
		id.setJCN001((long) 93516);

		f55ijc81.setId(id);
		f55ijc81.setJCISSU("124288");

		F55IJC81Dao dao = new F55IJC81Dao();

		try {
			dao.insertF55IJC81(f55ijc81);
		} catch (JDBCException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
