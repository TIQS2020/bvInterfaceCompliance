package br.com.compliance.nfe.jde.domain;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class F7611BId implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer FDBNNF;
	private String FDBSER;
	private Integer FDN001;
	private String FDDCT;
	private Long FDUKID;
	
	public F7611BId(){}

	public F7611BId(Integer fDBNNF, String fDBSER, Integer fDN001, String fDDCT, Long fDUKID) {
		super();
		FDBNNF = fDBNNF;
		FDBSER = fDBSER;
		FDN001 = fDN001;
		FDDCT = fDDCT;
		FDUKID = fDUKID;
	}

	public Integer getFDBNNF() {
		return FDBNNF;
	}

	public void setFDBNNF(Integer fDBNNF) {
		FDBNNF = fDBNNF;
	}

	public String getFDBSER() {
		return FDBSER;
	}

	public void setFDBSER(String fDBSER) {
		FDBSER = fDBSER;
	}

	public Integer getFDN001() {
		return FDN001;
	}

	public void setFDN001(Integer fDN001) {
		FDN001 = fDN001;
	}

	public String getFDDCT() {
		return FDDCT;
	}

	public void setFDDCT(String fDDCT) {
		FDDCT = fDDCT;
	}

	public Long getFDUKID() {
		return FDUKID;
	}

	public void setFDUKID(Long fDUKID) {
		FDUKID = fDUKID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((FDBNNF == null) ? 0 : FDBNNF.hashCode());
		result = prime * result + ((FDBSER == null) ? 0 : FDBSER.hashCode());
		result = prime * result + ((FDDCT == null) ? 0 : FDDCT.hashCode());
		result = prime * result + ((FDN001 == null) ? 0 : FDN001.hashCode());
		result = prime * result + ((FDUKID == null) ? 0 : FDUKID.hashCode());
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
		F7611BId other = (F7611BId) obj;
		if (FDBNNF == null) {
			if (other.FDBNNF != null)
				return false;
		} else if (!FDBNNF.equals(other.FDBNNF))
			return false;
		if (FDBSER == null) {
			if (other.FDBSER != null)
				return false;
		} else if (!FDBSER.equals(other.FDBSER))
			return false;
		if (FDDCT == null) {
			if (other.FDDCT != null)
				return false;
		} else if (!FDDCT.equals(other.FDDCT))
			return false;
		if (FDN001 == null) {
			if (other.FDN001 != null)
				return false;
		} else if (!FDN001.equals(other.FDN001))
			return false;
		if (FDUKID == null) {
			if (other.FDUKID != null)
				return false;
		} else if (!FDUKID.equals(other.FDUKID))
			return false;
		return true;
	}
	
	

}
