package br.com.compliance.nfe.jde.domain;

import java.io.Serializable;

import javax.persistence.Embeddable;
@Embeddable
public class F55IJC82Id implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer JCBNNF;
	private String JCBSER;
	private Long JCN001;
	private String JCDCT;
	private Integer JCSEQ;
	private Integer JCLIN;
	private String JCUKID;
	
	public F55IJC82Id(){}

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

	public Long getJCN001() {
		return JCN001;
	}

	public void setJCN001(Long jCN001) {
		JCN001 = jCN001;
	}

	public String getJCDCT() {
		return JCDCT;
	}

	public void setJCDCT(String jCDCT) {
		JCDCT = jCDCT;
	}

	public Integer getJCSEQ() {
		return JCSEQ;
	}

	public void setJCSEQ(Integer jCSEQ) {
		JCSEQ = jCSEQ;
	}

	public Integer getJCLIN() {
		return JCLIN;
	}

	public void setJCLIN(Integer jCLIN) {
		JCLIN = jCLIN;
	}

	public String getJCUKID() {
		return JCUKID;
	}

	public void setJCUKID(String jCUKID) {
		JCUKID = jCUKID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((JCBNNF == null) ? 0 : JCBNNF.hashCode());
		result = prime * result + ((JCBSER == null) ? 0 : JCBSER.hashCode());
		result = prime * result + ((JCDCT == null) ? 0 : JCDCT.hashCode());
		result = prime * result + ((JCLIN == null) ? 0 : JCLIN.hashCode());
		result = prime * result + ((JCN001 == null) ? 0 : JCN001.hashCode());
		result = prime * result + ((JCSEQ == null) ? 0 : JCSEQ.hashCode());
		result = prime * result + ((JCUKID == null) ? 0 : JCUKID.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		F55IJC82Id other = (F55IJC82Id) obj;
		if (JCBNNF == null) {
			if (other.JCBNNF != null)
				return false;
		} else if (!JCBNNF.equals(other.JCBNNF))
			return false;
		if (JCBSER == null) {
			if (other.JCBSER != null)
				return false;
		} else if (!JCBSER.equals(other.JCBSER))
			return false;
		if (JCDCT == null) {
			if (other.JCDCT != null)
				return false;
		} else if (!JCDCT.equals(other.JCDCT))
			return false;
		if (JCLIN == null) {
			if (other.JCLIN != null)
				return false;
		} else if (!JCLIN.equals(other.JCLIN))
			return false;
		if (JCN001 == null) {
			if (other.JCN001 != null)
				return false;
		} else if (!JCN001.equals(other.JCN001))
			return false;
		if (JCSEQ == null) {
			if (other.JCSEQ != null)
				return false;
		} else if (!JCSEQ.equals(other.JCSEQ))
			return false;
		if (JCUKID == null) {
			if (other.JCUKID != null)
				return false;
		} else if (!JCUKID.equals(other.JCUKID))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "F55IJC82Id [JCBNNF=" + JCBNNF + ", JCBSER=" + JCBSER + ", JCN001=" + JCN001 + ", JCDCT=" + JCDCT
				+ ", JCSEQ=" + JCSEQ + ", JCLIN=" + JCLIN + ", JCUKID=" + JCUKID + "]";
	}

	
	
	
	

}
