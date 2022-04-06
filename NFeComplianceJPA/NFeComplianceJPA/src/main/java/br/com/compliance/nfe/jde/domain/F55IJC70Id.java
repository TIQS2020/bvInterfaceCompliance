package br.com.compliance.nfe.jde.domain;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class F55IJC70Id implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8603029815923680589L;

	private Integer JCBNNF;
	private String JCBSER;
	private Integer JCN001;
	private String JCDCT;
	private Integer JCWJOBS;
	
	public F55IJC70Id() {
		super();
	}
	
	

	public F55IJC70Id(Integer jCBNNF, String jCBSER, Integer jCN001, String jCDCT, Integer jCWJOBS) {
		super();
		JCBNNF = jCBNNF;
		JCBSER = jCBSER;
		JCN001 = jCN001;
		JCDCT = jCDCT;
		JCWJOBS = jCWJOBS;
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



	public Integer getJCWJOBS() {
		return JCWJOBS;
	}



	public void setJCWJOBS(Integer jCWJOBS) {
		JCWJOBS = jCWJOBS;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((JCBNNF == null) ? 0 : JCBNNF.hashCode());
		result = prime * result + ((JCBSER == null) ? 0 : JCBSER.hashCode());
		result = prime * result + ((JCDCT == null) ? 0 : JCDCT.hashCode());
		result = prime * result + ((JCN001 == null) ? 0 : JCN001.hashCode());
		result = prime * result + ((JCWJOBS == null) ? 0 : JCWJOBS.hashCode());
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
		F55IJC70Id other = (F55IJC70Id) obj;
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
		if (JCWJOBS == null) {
			if (other.JCWJOBS != null)
				return false;
		} else if (!JCWJOBS.equals(other.JCWJOBS))
			return false;
		return true;
	}

	

	
	
	
	
}
