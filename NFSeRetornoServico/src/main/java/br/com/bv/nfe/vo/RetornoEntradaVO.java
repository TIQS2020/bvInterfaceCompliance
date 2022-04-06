package br.com.bv.nfe.vo;

import java.util.List;

import br.com.compliance.nfe.jde.domain.F4211;
import br.com.compliance.nfe.jde.domain.F55IJC70;
import br.com.compliance.nfe.jde.domain.F55IJC70Id;
import br.com.compliance.nfe.jde.domain.F55IJC74;
import br.com.compliance.nfe.jde.domain.F55IJC80;
import br.com.compliance.nfe.jde.domain.F55IJC80Id;
import br.com.compliance.nfe.jde.domain.F55IJC84;
import br.com.compliance.nfe.jde.domain.F7611B;
import br.com.compliance.nfe.jde.domain.F76B01TE;

public class RetornoEntradaVO {
	
	/*acrescimo do retorno da nf de entrada*/
	private F55IJC70 headerEntrada;		
	private F55IJC70Id idEntrada;
	private List<F55IJC74> participanteNFEntradaList;
	private String codigoMultOrg;
	private String hashMultOrg;
	
	public RetornoEntradaVO(){}

	public F55IJC70 getHeaderEntrada() {
		return headerEntrada;
	}

	public void setHeaderEntrada(F55IJC70 headerEntrada) {
		this.headerEntrada = headerEntrada;
	}

	public F55IJC70Id getIdEntrada() {
		return idEntrada;
	}

	public void setIdEntrada(F55IJC70Id idEntrada) {
		this.idEntrada = idEntrada;
	}

	public List<F55IJC74> getParticipanteNFEntradaList() {
		return participanteNFEntradaList;
	}

	public void setParticipanteNFEntradaList(List<F55IJC74> participanteNFEntradaList) {
		this.participanteNFEntradaList = participanteNFEntradaList;
	}

	public String getCodigoMultOrg() {
		return codigoMultOrg;
	}

	public void setCodigoMultOrg(String codigoMultOrg) {
		this.codigoMultOrg = codigoMultOrg;
	}

	public String getHashMultOrg() {
		return hashMultOrg;
	}

	public void setHashMultOrg(String hashMultOrg) {
		this.hashMultOrg = hashMultOrg;
	}

	
	
	

}
