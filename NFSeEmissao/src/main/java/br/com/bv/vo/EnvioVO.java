package br.com.bv.vo;

import java.util.List;

import br.com.compliance.nfe.jde.domain.F55IJC80;
import br.com.compliance.nfe.jde.domain.F55IJC80Id;
import br.com.compliance.nfe.jde.domain.F55IJC81;
import br.com.compliance.nfe.jde.domain.F55IJC82;
import br.com.compliance.nfe.jde.domain.F55IJC83;
import br.com.compliance.nfe.jde.domain.F55IJC84;
import br.com.compliance.nfe.jde.domain.F55IJC86;
import br.com.compliance.nfe.jde.domain.F55IJC87;
import br.com.compliance.nfe.jde.domain.F55IJC90;
import br.com.compliance.nfe.jde.domain.F76B01TE;

public class EnvioVO {
	
	private F55IJC80 header;		
	private F55IJC80Id id;
	
	private List<F55IJC81> detalheNFeList;
	private List<F55IJC82> menssagemNFeList;
	private List<F55IJC83> vencimentoNFeList;
	private List<F55IJC84> participanteNFeList;
	private List<F55IJC86> referenciaNFeList;
	private F55IJC87 exportacaoNFe;
	private java.lang.String codigoMultOrg;
	private java.lang.String hashMultOrg;
	private F76B01TE f76b01te;
	
	
	/*NFe4.0*/
	private List<F55IJC90> formaPgtoList;
	
	
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


	public List<F55IJC82> getMenssagemNFeList() {
		return menssagemNFeList;
	}


	public void setMenssagemNFeList(List<F55IJC82> menssagemNFeList) {
		this.menssagemNFeList = menssagemNFeList;
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

	public List<F55IJC86> getReferenciaNFeList() {
		return referenciaNFeList;
	}


	public void setReferenciaNFeList(List<F55IJC86> referenciaNFeList) {
		this.referenciaNFeList = referenciaNFeList;
	}

	public F55IJC87 getExportacaoNFe() {
		return exportacaoNFe;
	}


	public void setExportacaoNFe(F55IJC87 exportacaoNFe) {
		this.exportacaoNFe = exportacaoNFe;
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


	public F76B01TE getF76b01te() {
		return f76b01te;
	}


	public void setF76b01te(F76B01TE f76b01te) {
		this.f76b01te = f76b01te;
	}


	public List<F55IJC90> getFormaPgtoList() {
		return formaPgtoList;
	}


	public void setFormaPgtoList(List<F55IJC90> formaPgtoList) {
		this.formaPgtoList = formaPgtoList;
	}
	
	
}
