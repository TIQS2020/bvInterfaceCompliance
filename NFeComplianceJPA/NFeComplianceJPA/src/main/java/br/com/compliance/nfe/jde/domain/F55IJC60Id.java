package br.com.compliance.nfe.jde.domain;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class F55IJC60Id implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long JCWJOBS;
	private String JCTAX;
	private String JCLITM;
	private Long JCISSU;
	
	public F55IJC60Id() {
		super();
		// TODO Auto-generated constructor stub
	}

	public F55IJC60Id(Long jCWJOBS, String jCTAX, String jCLITM, Long jCISSU) {
		super();
		JCWJOBS = jCWJOBS;
		JCTAX = jCTAX;
		JCLITM = jCLITM;
		JCISSU = jCISSU;
	}

	public Long getJCWJOBS() {
		return JCWJOBS;
	}

	public void setJCWJOBS(Long jCWJOBS) {
		JCWJOBS = jCWJOBS;
	}

	public String getJCTAX() {
		return JCTAX;
	}

	public void setJCTAX(String jCTAX) {
		JCTAX = jCTAX;
	}

	public String getJCLITM() {
		return JCLITM;
	}

	public void setJCLITM(String jCLITM) {
		JCLITM = jCLITM;
	}

	public Long getJCISSU() {
		return JCISSU;
	}

	public void setJCISSU(Long jCISSU) {
		JCISSU = jCISSU;
	}

	@Override
	public String toString() {
		return "F55IJC60Id [JCWJOBS=" + JCWJOBS + ", JCTAX=" + JCTAX + ", JCLITM=" + JCLITM + ", JCISSU=" + JCISSU
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((JCISSU == null) ? 0 : JCISSU.hashCode());
		result = prime * result + ((JCLITM == null) ? 0 : JCLITM.hashCode());
		result = prime * result + ((JCTAX == null) ? 0 : JCTAX.hashCode());
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
		F55IJC60Id other = (F55IJC60Id) obj;
		if (JCISSU == null) {
			if (other.JCISSU != null)
				return false;
		} else if (!JCISSU.equals(other.JCISSU))
			return false;
		if (JCLITM == null) {
			if (other.JCLITM != null)
				return false;
		} else if (!JCLITM.equals(other.JCLITM))
			return false;
		if (JCTAX == null) {
			if (other.JCTAX != null)
				return false;
		} else if (!JCTAX.equals(other.JCTAX))
			return false;
		if (JCWJOBS == null) {
			if (other.JCWJOBS != null)
				return false;
		} else if (!JCWJOBS.equals(other.JCWJOBS))
			return false;
		return true;
	}

	

}
