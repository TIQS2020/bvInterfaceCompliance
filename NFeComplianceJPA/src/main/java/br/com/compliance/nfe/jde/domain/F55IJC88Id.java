package br.com.compliance.nfe.jde.domain;

import java.io.Serializable;

import javax.persistence.Embeddable;
@Embeddable
public class F55IJC88Id implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer JCBNNF;
	private String JCBSER;
	private Long JCN001;
	private String JCDCT;
	private Integer JCSBSQ;
	
	public F55IJC88Id(){}

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

	public Integer getJCSBSQ() {
		return JCSBSQ;
	}

	public void setJCSBSQ(Integer jCSBSQ) {
		JCSBSQ = jCSBSQ;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((JCBNNF == null) ? 0 : JCBNNF.hashCode());
		result = prime * result + ((JCBSER == null) ? 0 : JCBSER.hashCode());
		result = prime * result + ((JCDCT == null) ? 0 : JCDCT.hashCode());
		result = prime * result + ((JCN001 == null) ? 0 : JCN001.hashCode());
		result = prime * result + ((JCSBSQ == null) ? 0 : JCSBSQ.hashCode());
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
		F55IJC88Id other = (F55IJC88Id) obj;
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
		if (JCN001 == null) {
			if (other.JCN001 != null)
				return false;
		} else if (!JCN001.equals(other.JCN001))
			return false;
		if (JCSBSQ == null) {
			if (other.JCSBSQ != null)
				return false;
		} else if (!JCSBSQ.equals(other.JCSBSQ))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "F55IJC88Id [JCBNNF=" + JCBNNF + ", JCBSER=" + JCBSER + ", JCN001=" + JCN001 + ", JCDCT=" + JCDCT
				+ ", JCSBSQ=" + JCSBSQ + "]";
	}

	
	
	

}
