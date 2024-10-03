package br.com.bv.vo;

import java.util.List;

import br.com.compliance.nfe.jde.domain.F55IJC02;
import br.com.compliance.nfe.jde.domain.F55IJC80;
import br.com.compliance.nfe.jde.domain.F55IJC80Id;
import br.com.compliance.nfe.jde.domain.F55IJC81;
import br.com.compliance.nfe.jde.domain.F55IJC83;
import br.com.compliance.nfe.jde.domain.F55IJC84;

public class EnvioVO {
	
	private F55IJC80 header;		
	private F55IJC80Id id;
	
	private List<F55IJC81> detalheNFeList;	
	private List<F55IJC83> vencimentoNFeList;
	private List<F55IJC84> participanteNFeList;	
	private java.lang.String codigoMultOrg;
	private java.lang.String hashMultOrg;

	private F55IJC02 legado;
	
	public EnvioVO(){
		
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


	public List<F55IJC81> getDetalheNFeList() {
		return detalheNFeList;
	}


	public void setDetalheNFeList(List<F55IJC81> detalheNFeList) {
		this.detalheNFeList = detalheNFeList;
	}
	

	public List<F55IJC83> getVencimentoNFeList() {
		return vencimentoNFeList;
	}


	public void setVencimentoNFeList(List<F55IJC83> vencimentoNFeList) {
		this.vencimentoNFeList = vencimentoNFeList;
	}


	public List<F55IJC84> getParticipanteNFeList() {
		return participanteNFeList;
	}


	public void setParticipanteNFeList(List<F55IJC84> participanteNFeList) {
		this.participanteNFeList = participanteNFeList;
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

	public F55IJC02 getLegado() {
		return legado;
	}

	public void setLegado(F55IJC02 legado) {
		this.legado = legado;
	}
}
