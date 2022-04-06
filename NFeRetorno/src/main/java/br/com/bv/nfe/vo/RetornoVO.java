package br.com.bv.nfe.vo;

import java.util.List;

import br.com.compliance.nfe.jde.domain.F4211;
import br.com.compliance.nfe.jde.domain.F42119;
import br.com.compliance.nfe.jde.domain.F55IJC70;
import br.com.compliance.nfe.jde.domain.F55IJC70Id;
import br.com.compliance.nfe.jde.domain.F55IJC74;
import br.com.compliance.nfe.jde.domain.F55IJC80;
import br.com.compliance.nfe.jde.domain.F55IJC80Id;
import br.com.compliance.nfe.jde.domain.F55IJC84;
import br.com.compliance.nfe.jde.domain.F7611B;
import br.com.compliance.nfe.jde.domain.F76B01TE;

public class RetornoVO {
	
	private F55IJC80 header;		
	private F55IJC80Id id;
	private List<F55IJC84> participanteNFeList;
	private String codigoMultOrg;
	private String hashMultOrg;
	private F76B01TE f76b01te = new F76B01TE();
	private F4211 f4211 = new F4211();
	private F42119 f42119 = new F42119();
	private F7611B f7611b = new F7611B();
	
	/*acrescimo do retorno da nf de entrada*/
	private F55IJC70 headerEntrada;		
	private F55IJC70Id idEntrada;
	private List<F55IJC74> participanteNFEntradaList;
	
	
	public RetornoVO(){
		
	}

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

	public List<F55IJC84> getParticipanteNFeList() {
		return participanteNFeList;
	}

	public void setParticipanteNFeList(List<F55IJC84> participanteNFeList) {
		this.participanteNFeList = participanteNFeList;
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

	public F76B01TE getF76b01te() {
		return f76b01te;
	}

	public void setF76b01te(F76B01TE f76b01te) {
		this.f76b01te = f76b01te;
	}

	public F4211 getF4211() {
		return f4211;
	}

	public void setF4211(F4211 f4211) {
		this.f4211 = f4211;
	}

	public F7611B getF7611b() {
		return f7611b;
	}

	public void setF7611b(F7611B f7611b) {
		this.f7611b = f7611b;
	}

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

	public F42119 getF42119() {
		return f42119;
	}

	public void setF42119(F42119 f42119) {
		this.f42119 = f42119;
	}

	
	

}
