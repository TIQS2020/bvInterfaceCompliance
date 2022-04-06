package br.com.compliance.nfe.jde.domain;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class F55IJC7CId implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String JCCO;
	//private String JCTAX;
	private Long JCWJOBS;
	private String JCBEGDATE;
	private String JCENDDATE;
	private String JCEV04;
	
	public F55IJC7CId() {
		super();
		// TODO Auto-generated constructor stub
	}

	public F55IJC7CId(Long jCWJOBS, String jCBEGDATE, String jCENDDATE, String jCEV04, String jCCO) {
		super();
		//JCTAX = jCTAX;
		JCWJOBS = jCWJOBS;
		JCBEGDATE = jCBEGDATE;
		JCENDDATE = jCENDDATE;
		JCEV04 = jCEV04;
		JCCO = jCCO;
	}

	/*
	public String getJCTAX() {
		return JCTAX;
	}

	public void setJCTAX(String jCTAX) {
		JCTAX = jCTAX;
	}
	*/
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

	public String getJCEV04() {
		return JCEV04;
	}

	public void setJCEV04(String jCEV04) {
		JCEV04 = jCEV04;
	}	

	public String getJCCO() {
		return JCCO;
	}

	public void setJCCO(String jCCO) {
		JCCO = jCCO;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((JCBEGDATE == null) ? 0 : JCBEGDATE.hashCode());
		result = prime * result + ((JCCO == null) ? 0 : JCCO.hashCode());
		result = prime * result + ((JCENDDATE == null) ? 0 : JCENDDATE.hashCode());
		result = prime * result + ((JCEV04 == null) ? 0 : JCEV04.hashCode());
		//result = prime * result + ((JCTAX == null) ? 0 : JCTAX.hashCode());
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
		F55IJC7CId other = (F55IJC7CId) obj;
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
		if (JCEV04 == null) {
			if (other.JCEV04 != null)
				return false;
		} else if (!JCEV04.equals(other.JCEV04))
			return false;
		/*
		if (JCTAX == null) {
			if (other.JCTAX != null)
				return false;
		} else if (!JCTAX.equals(other.JCTAX))
			return false;*/
		if (JCWJOBS == null) {
			if (other.JCWJOBS != null)
				return false;
		} else if (!JCWJOBS.equals(other.JCWJOBS))
			return false;
		return true;
	}

	

	
	

}
