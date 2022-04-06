package br.com.bv.nfe.vo;

import java.util.List;

import br.com.compliance.nfe.jde.domain.F55IJC70;
import br.com.compliance.nfe.jde.domain.F55IJC70Id;
import br.com.compliance.nfe.jde.domain.F55IJC71;
import br.com.compliance.nfe.jde.domain.F55IJC72;
import br.com.compliance.nfe.jde.domain.F55IJC73;
import br.com.compliance.nfe.jde.domain.F55IJC74;

public class EmissaoEFDVO {
	
	private F55IJC70 header;		
	private F55IJC70Id id;
	
	private List<F55IJC71> detalheNFSeList;
	private List<F55IJC72> menssagemNFSeList;
	private List<F55IJC73> duplicataNFSeList;
	private List<F55IJC74> participanteNFSeList;	
	private java.lang.String codigoMultOrg;
	private java.lang.String hashMultOrg;
	
	
	public EmissaoEFDVO(){
		
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


	public List<F55IJC71> getDetalheNFeList() {
		return detalheNFSeList;
	}


	public void setDetalheNFeList(List<F55IJC71> detalheNFeList) {
		this.detalheNFSeList = detalheNFeList;
	}


	public List<F55IJC72> getMenssagemNFeList() {
		return menssagemNFSeList;
	}


	public void setMenssagemNFeList(List<F55IJC72> menssagemNFeList) {
		this.menssagemNFSeList = menssagemNFeList;
	}


	public List<F55IJC74> getParticipanteNFeList() {
		return participanteNFSeList;
	}


	public void setParticipanteNFeList(List<F55IJC74> participanteNFeList) {
		this.participanteNFSeList = participanteNFeList;
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


	public List<F55IJC73> getDuplicataNFSeList() {
		return duplicataNFSeList;
	}


	public void setDuplicataNFSeList(List<F55IJC73> duplicataNFSeList) {
		this.duplicataNFSeList = duplicataNFSeList;
	}

	
	
}
