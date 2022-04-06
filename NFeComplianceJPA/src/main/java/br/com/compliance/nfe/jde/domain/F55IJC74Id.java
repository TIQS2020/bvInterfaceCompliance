package br.com.compliance.nfe.jde.domain;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class F55IJC74Id implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -386493371662742251L;
	
	private Integer JCBNNF;
	private String JCBSER;
	private Integer JCN001;
	private String JCDCT;
	private String JCKY1;
	private Integer JCIA01;
	public F55IJC74Id() {
		super();
		// TODO Auto-generated constructor stub
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
	public String getJCKY1() {
		return JCKY1;
	}
	public void setJCKY1(String jCKY1) {
		JCKY1 = jCKY1;
	}
	public Integer getJCIA01() {
		return JCIA01;
	}
	public void setJCIA01(Integer jCIA01) {
		JCIA01 = jCIA01;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((JCBNNF == null) ? 0 : JCBNNF.hashCode());
		result = prime * result + ((JCBSER == null) ? 0 : JCBSER.hashCode());
		result = prime * result + ((JCDCT == null) ? 0 : JCDCT.hashCode());
		result = prime * result + ((JCIA01 == null) ? 0 : JCIA01.hashCode());
		result = prime * result + ((JCKY1 == null) ? 0 : JCKY1.hashCode());
		result = prime * result + ((JCN001 == null) ? 0 : JCN001.hashCode());
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
		F55IJC74Id other = (F55IJC74Id) obj;
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
		if (JCIA01 == null) {
			if (other.JCIA01 != null)
				return false;
		} else if (!JCIA01.equals(other.JCIA01))
			return false;
		if (JCKY1 == null) {
			if (other.JCKY1 != null)
				return false;
		} else if (!JCKY1.equals(other.JCKY1))
			return false;
		if (JCN001 == null) {
			if (other.JCN001 != null)
				return false;
		} else if (!JCN001.equals(other.JCN001))
			return false;
		return true;
	}
	
	

}
