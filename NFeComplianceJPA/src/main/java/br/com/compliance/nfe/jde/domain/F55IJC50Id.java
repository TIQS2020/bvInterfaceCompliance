package br.com.compliance.nfe.jde.domain;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Embeddable;

@Embeddable
public class F55IJC50Id implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String JCCO;
	private Long JCWJOBS;
	private Date JCBEGDATE;
	private Date JCENDDATE;
	private Integer JCKIT;
	private Integer JCITM;
	private Long JCUKID;
	
	public F55IJC50Id() {
		super();
	}
	public F55IJC50Id(String jCCO, Long jCWJOBS, Date jCBEGDATE, Date jCENDDATE, Integer jCKIT, Integer jCITM,
			Long jCUKID) {
		super();
		JCCO = jCCO;
		JCWJOBS = jCWJOBS;
		JCBEGDATE = jCBEGDATE;
		JCENDDATE = jCENDDATE;
		JCKIT = jCKIT;
		JCITM = jCITM;
		JCUKID = jCUKID;
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
	public Date getJCBEGDATE() {
		return JCBEGDATE;
	}
	public void setJCBEGDATE(Date jCBEGDATE) {
		JCBEGDATE = jCBEGDATE;
	}
	public Date getJCENDDATE() {
		return JCENDDATE;
	}
	public void setJCENDDATE(Date jCENDDATE) {
		JCENDDATE = jCENDDATE;
	}
	public Integer getJCKIT() {
		return JCKIT;
	}
	public void setJCKIT(Integer jCKIT) {
		JCKIT = jCKIT;
	}
	public Integer getJCITM() {
		return JCITM;
	}
	public void setJCITM(Integer jCITM) {
		JCITM = jCITM;
	}
	public Long getJCUKID() {
		return JCUKID;
	}
	public void setJCUKID(Long jCUKID) {
		JCUKID = jCUKID;
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
		result = prime * result + ((JCUKID == null) ? 0 : JCUKID.hashCode());
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
		F55IJC50Id other = (F55IJC50Id) obj;
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
		if (JCUKID == null) {
			if (other.JCUKID != null)
				return false;
		} else if (!JCUKID.equals(other.JCUKID))
			return false;
		if (JCWJOBS == null) {
			if (other.JCWJOBS != null)
				return false;
		} else if (!JCWJOBS.equals(other.JCWJOBS))
			return false;
		return true;
	}	

	
	
}
