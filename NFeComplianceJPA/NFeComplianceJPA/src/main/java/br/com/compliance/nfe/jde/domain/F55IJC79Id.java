package br.com.compliance.nfe.jde.domain;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class F55IJC79Id implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long JCWJOBS;
	private String JCTAX;
	private Long JCAN8;
	private String JCVINV;
	private Long JCDDJ;
	private Long JCDMTJ;
	private String JCBRTXTP;
	private Long JCBRRCT;

	public F55IJC79Id() {
		super();
	}

	
	
	public F55IJC79Id(Long jCWJOBS, String jCTAX, Long jCAN8, String jCVINV, Long jCDDJ, Long jCDMTJ, String jCBRTXTP,
			Long jCBRRCT) {
		super();
		JCWJOBS = jCWJOBS;
		JCTAX = jCTAX;
		JCAN8 = jCAN8;
		JCVINV = jCVINV;
		JCDDJ = jCDDJ;
		JCDMTJ = jCDMTJ;
		JCBRTXTP = jCBRTXTP;
		JCBRRCT = jCBRRCT;
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

	public Long getJCAN8() {
		return JCAN8;
	}

	public void setJCAN8(Long jCAN8) {
		JCAN8 = jCAN8;
	}

	public String getJCVINV() {
		return JCVINV;
	}

	public void setJCVINV(String jCVINV) {
		JCVINV = jCVINV;
	}

	public Long getJCDDJ() {
		return JCDDJ;
	}

	public void setJCDDJ(Long jCDDJ) {
		JCDDJ = jCDDJ;
	}

	public Long getJCDMTJ() {
		return JCDMTJ;
	}

	public void setJCDMTJ(Long jCDMTJ) {
		JCDMTJ = jCDMTJ;
	}

	public String getJCBRTXTP() {
		return JCBRTXTP;
	}

	public void setJCBRTXTP(String jCBRTXTP) {
		JCBRTXTP = jCBRTXTP;
	}

	public Long getJCBRRCT() {
		return JCBRRCT;
	}

	public void setJCBRRCT(Long jCBRRCT) {
		JCBRRCT = jCBRRCT;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((JCAN8 == null) ? 0 : JCAN8.hashCode());
		result = prime * result + ((JCBRRCT == null) ? 0 : JCBRRCT.hashCode());
		result = prime * result + ((JCBRTXTP == null) ? 0 : JCBRTXTP.hashCode());
		result = prime * result + ((JCDDJ == null) ? 0 : JCDDJ.hashCode());
		result = prime * result + ((JCDMTJ == null) ? 0 : JCDMTJ.hashCode());
		result = prime * result + ((JCTAX == null) ? 0 : JCTAX.hashCode());
		result = prime * result + ((JCVINV == null) ? 0 : JCVINV.hashCode());
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
		F55IJC79Id other = (F55IJC79Id) obj;
		if (JCAN8 == null) {
			if (other.JCAN8 != null)
				return false;
		} else if (!JCAN8.equals(other.JCAN8))
			return false;
		if (JCBRRCT == null) {
			if (other.JCBRRCT != null)
				return false;
		} else if (!JCBRRCT.equals(other.JCBRRCT))
			return false;
		if (JCBRTXTP == null) {
			if (other.JCBRTXTP != null)
				return false;
		} else if (!JCBRTXTP.equals(other.JCBRTXTP))
			return false;
		if (JCDDJ == null) {
			if (other.JCDDJ != null)
				return false;
		} else if (!JCDDJ.equals(other.JCDDJ))
			return false;
		if (JCDMTJ == null) {
			if (other.JCDMTJ != null)
				return false;
		} else if (!JCDMTJ.equals(other.JCDMTJ))
			return false;
		if (JCTAX == null) {
			if (other.JCTAX != null)
				return false;
		} else if (!JCTAX.equals(other.JCTAX))
			return false;
		if (JCVINV == null) {
			if (other.JCVINV != null)
				return false;
		} else if (!JCVINV.equals(other.JCVINV))
			return false;
		if (JCWJOBS == null) {
			if (other.JCWJOBS != null)
				return false;
		} else if (!JCWJOBS.equals(other.JCWJOBS))
			return false;
		return true;
	}
	
	

}
