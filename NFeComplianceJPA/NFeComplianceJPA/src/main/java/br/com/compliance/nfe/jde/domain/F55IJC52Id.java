package br.com.compliance.nfe.jde.domain;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class F55IJC52Id implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String JCCO;			
	private Long JCWJOBS;
	private String JCBEGDATE;
	private String JCENDDATE;
	private String JCSTRT;
	private Integer JCITM;
	private Integer JCKIT;
	
	public F55IJC52Id() {
		super();
	}
	public F55IJC52Id(String jCCO, Long jCWJOBS, String jCBEGDATE, String jCENDDATE, String jCSTRT, Integer jCITM,
			Integer jCKIT) {
		super();
		JCCO = jCCO;
		JCWJOBS = jCWJOBS;
		JCBEGDATE = jCBEGDATE;
		JCENDDATE = jCENDDATE;
		JCSTRT = jCSTRT;
		JCITM = jCITM;
		JCKIT = jCKIT;
	}
	
	
	
	public F55IJC52Id(String jCCO, Long jCWJOBS, String jCBEGDATE, String jCENDDATE) {
		super();
		JCCO = jCCO;
		JCWJOBS = jCWJOBS;
		JCBEGDATE = jCBEGDATE;
		JCENDDATE = jCENDDATE;
	}
	
	public String getJCCO() {
		return JCCO;
	}
	public void setJCCO(String jCCO) {
		JCCO = jCCO;
	}
	public Long getJCWJOBS() {
		return JCWJOBS;
	}
	public void setJCWJOBS(Long jCWJOBS) {
		JCWJOBS = jCWJOBS;
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
	public String getJCSTRT() {
		return JCSTRT;
	}
	public void setJCSTRT(String jCSTRT) {
		JCSTRT = jCSTRT;
	}
	public Integer getJCITM() {
		return JCITM;
	}
	public void setJCITM(Integer jCITM) {
		JCITM = jCITM;
	}
	public Integer getJCKIT() {
		return JCKIT;
	}
	public void setJCKIT(Integer jCKIT) {
		JCKIT = jCKIT;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((JCBEGDATE == null) ? 0 : JCBEGDATE.hashCode());
		result = prime * result + ((JCCO == null) ? 0 : JCCO.hashCode());
		result = prime * result + ((JCENDDATE == null) ? 0 : JCENDDATE.hashCode());
		result = prime * result + ((JCITM == null) ? 0 : JCITM.hashCode());
		result = prime * result + ((JCKIT == null) ? 0 : JCKIT.hashCode());
		result = prime * result + ((JCSTRT == null) ? 0 : JCSTRT.hashCode());
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
		F55IJC52Id other = (F55IJC52Id) obj;
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
		if (JCKIT == null) {
			if (other.JCKIT != null)
				return false;
		} else if (!JCKIT.equals(other.JCKIT))
			return false;
		if (JCSTRT == null) {
			if (other.JCSTRT != null)
				return false;
		} else if (!JCSTRT.equals(other.JCSTRT))
			return false;
		if (JCWJOBS == null) {
			if (other.JCWJOBS != null)
				return false;
		} else if (!JCWJOBS.equals(other.JCWJOBS))
			return false;
		return true;
	}
	
	

}
