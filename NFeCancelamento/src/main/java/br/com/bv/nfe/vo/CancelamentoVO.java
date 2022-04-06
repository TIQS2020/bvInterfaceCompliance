package br.com.bv.nfe.vo;

import br.com.compliance.nfe.jde.domain.F55IJC80;
import br.com.compliance.nfe.jde.domain.F55IJC80Id;

public class CancelamentoVO {
	
	private F55IJC80 header;
	private F55IJC80Id id;
	private java.lang.String codigoMultOrg;
	private java.lang.String hashMultOrg;
	
	public CancelamentoVO(){}

	public F55IJC80 getHeader() {
		return header;
	}

	public void setHeader(F55IJC80 header) {
		this.header = header;
	}	

	public F55IJC80Id getId() {
		return id;
	}

	public void setId(F55IJC80Id id) {
		this.id = id;
	}

	public java.lang.String getCodigoMultOrg() {
		return codigoMultOrg;
	}

	public void setCodigoMultOrg(java.lang.String codigoMultOrg) {
		this.codigoMultOrg = codigoMultOrg;
	}

	public java.lang.String getHashMultOrg() {
		return hashMultOrg;
	}

	public void setHashMultOrg(java.lang.String hashMultOrg) {
		this.hashMultOrg = hashMultOrg;
	}	

}
