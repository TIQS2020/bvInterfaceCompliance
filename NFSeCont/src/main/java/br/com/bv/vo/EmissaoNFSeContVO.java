package br.com.bv.vo;

import java.util.List;

import br.com.compliance.nfe.jde.domain.F55IJC70;
import br.com.compliance.nfe.jde.domain.F55IJC70Id;
import br.com.compliance.nfe.jde.domain.F55IJC71;
import br.com.compliance.nfe.jde.domain.F55IJC72;
import br.com.compliance.nfe.jde.domain.F55IJC74;

public class EmissaoNFSeContVO {
	
	private F55IJC70 header;		
	private F55IJC70Id id;
	
	private List<F55IJC71> detalheNFSeContList;
	private List<F55IJC72> menssagemNFSeContList;	
	private List<F55IJC74> participanteNFSeContList;	
	private java.lang.String codigoMultOrg;
	private java.lang.String hashMultOrg;
	
	
	public EmissaoNFSeContVO(){
		
	}


	public F55IJC70 getHeader() {
		return header;
	}


	public void setHeader(F55IJC70 header) {
		this.header = header;
	}


	public F55IJC70Id getId() {
		return id;
	}


	public void setId(F55IJC70Id id) {
		this.id = id;
	}


	public List<F55IJC71> getDetalheNFSeContList() {
		return detalheNFSeContList;
	}


	public void setDetalheNFSeContList(List<F55IJC71> detalheNFSeContList) {
		this.detalheNFSeContList = detalheNFSeContList;
	}


	public List<F55IJC72> getMenssagemNFSeContList() {
		return menssagemNFSeContList;
	}


	public void setMenssagemNFSeContList(List<F55IJC72> menssagemNFSeContList) {
		this.menssagemNFSeContList = menssagemNFSeContList;
	}


	public List<F55IJC74> getParticipanteNFSeContList() {
		return participanteNFSeContList;
	}


	public void setParticipanteNFSeContList(List<F55IJC74> participanteNFSeContList) {
		this.participanteNFSeContList = participanteNFSeContList;
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
