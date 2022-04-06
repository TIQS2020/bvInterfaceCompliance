package br.com.compliance.nfe.jde.domain;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class F55IJC53Id implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String JCCO;
	private Integer JCITM;
	private String JCBEGDATE;
	private String JCENDDATE;
	private Long JCWJOBS;
	public F55IJC53Id() {
		super();
	}
	
	
	public F55IJC53Id(String jCCO, String jCBEGDATE, String jCENDDATE, Long jCWJOBS) {
		super();
		JCCO = jCCO;
		JCBEGDATE = jCBEGDATE;
		JCENDDATE = jCENDDATE;
		JCWJOBS = jCWJOBS;
	}
	
	public String getJCCO() {
		return JCCO;
	}
	public void setJCCO(String jCCO) {
		JCCO = jCCO;
	}
	public Integer getJCITM() {
		return JCITM;
	}
	public void setJCITM(Integer jCITM) {
		JCITM = jCITM;
	}
	
	public String getJCBEGDATE() {
		return JCBEGDATE;
	}


	public void setJCBEGDATE(String jCBEGDATE) {
		JCBEGDATE = jCBEGDATE;
	}


	public String getJCENDDATE() {
		return JCENDDATE;
	}


	public void setJCENDDATE(String jCENDDATE) {
		JCENDDATE = jCENDDATE;
	}


	public Long getJCWJOBS() {
		return JCWJOBS;
	}
	public void setJCWJOBS(Long jCWJOBS) {
		JCWJOBS = jCWJOBS;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((JCBEGDATE == null) ? 0 : JCBEGDATE.hashCode());
		result = prime * result + ((JCCO == null) ? 0 : JCCO.hashCode());
		result = prime * result + ((JCENDDATE == null) ? 0 : JCENDDATE.hashCode());
		result = prime * result + ((JCITM == null) ? 0 : JCITM.hashCode());
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
		F55IJC53Id other = (F55IJC53Id) obj;
		if (JCBEGDATE == null) {
			if (other.JCBEGDATE != null)
				return false;
		} else if (!JCBEGDATE.equals(other.JCBEGDATE))
			return false;
		if (JCCO == null) {
			if (other.JCCO != null)
				return false;
		} else if (!JCCO.equals(other.JCCO))
			return false;
		if (JCENDDATE == null) {
			if (other.JCENDDATE != null)
				return false;
		} else if (!JCENDDATE.equals(other.JCENDDATE))
			return false;
		if (JCITM == null) {
			if (other.JCITM != null)
				return false;
		} else if (!JCITM.equals(other.JCITM))
			return false;
		if (JCWJOBS == null) {
			if (other.JCWJOBS != null)
				return false;
		} else if (!JCWJOBS.equals(other.JCWJOBS))
			return false;
		return true;
	}
	
	
	

}
