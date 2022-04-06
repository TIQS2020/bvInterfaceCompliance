package br.com.compliance.nfe.jde.domain;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;


@Entity
public class F55IJC02 {

	/* Classe chave */
	@EmbeddedId
	private F55IJC02Id id;

	/* campos chave */
	private Integer JCBNNF;
	private String JCBSER;
	private Integer JCN001;
	private String JCDCT;
	
	private String JCB76ELN;
	private String JCB76ELND;
	private String JCB76EREF;
	
	public F55IJC02() {
		super();
		// TODO Auto-generated constructor stub
	}
	public F55IJC02Id getId() {
		return id;
	}
	public void setId(F55IJC02Id id) {
		this.id = id;
	}
	public Integer getJCBNNF() {
		return JCBNNF;
	}
	public void setJCBNNF(Integer jCBNNF) {
		JCBNNF = jCBNNF;
	}
	public String getJCBSER() {
		return JCBSER;
	}
	public void setJCBSER(String jCBSER) {
		JCBSER = jCBSER;
	}
	public Integer getJCN001() {
		return JCN001;
	}
	public void setJCN001(Integer jCN001) {
		JCN001 = jCN001;
	}
	public String getJCDCT() {
		return JCDCT;
	}
	public void setJCDCT(String jCDCT) {
		JCDCT = jCDCT;
	}
	public String getJCB76ELN() {
		return JCB76ELN;
	}
	public void setJCB76ELN(String jCB76ELN) {
		JCB76ELN = jCB76ELN;
	}
	public String getJCB76ELND() {
		return JCB76ELND;
	}
	public void setJCB76ELND(String jCB76ELND) {
		JCB76ELND = jCB76ELND;
	}
	public String getJCB76EREF() {
		return JCB76EREF;
	}
	public void setJCB76EREF(String jCB76EREF) {
		JCB76EREF = jCB76EREF;
	}
	
	
	
	
}
