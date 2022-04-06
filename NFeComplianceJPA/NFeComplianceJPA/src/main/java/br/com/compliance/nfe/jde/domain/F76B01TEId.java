package br.com.compliance.nfe.jde.domain;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class F76B01TEId implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;	
	private Integer FHBNNF;
	private String FHBSER;
	private Integer FHN001;
	private String FHDCT;
	
	public F76B01TEId(){}

	public F76B01TEId(Integer fHBNNF, String fHBSER, Integer fHN001, String fHDCT) {
		super();
		FHBNNF = fHBNNF;
		FHBSER = fHBSER;
		FHN001 = fHN001;
		FHDCT = fHDCT;
	}

	public Integer getFHBNNF() {
		return FHBNNF;
	}

	public void setFHBNNF(Integer fHBNNF) {
		FHBNNF = fHBNNF;
	}

	public String getFHBSER() {
		return FHBSER;
	}

	public void setFHBSER(String fHBSER) {
		FHBSER = fHBSER;
	}

	public Integer getFHN001() {
		return FHN001;
	}

	public void setFHN001(Integer fHN001) {
		FHN001 = fHN001;
	}

	public String getFHDCT() {
		return FHDCT;
	}

	public void setFHDCT(String fHDCT) {
		FHDCT = fHDCT;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((FHBNNF == null) ? 0 : FHBNNF.hashCode());
		result = prime * result + ((FHBSER == null) ? 0 : FHBSER.hashCode());
		result = prime * result + ((FHDCT == null) ? 0 : FHDCT.hashCode());
		result = prime * result + ((FHN001 == null) ? 0 : FHN001.hashCode());
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
		F76B01TEId other = (F76B01TEId) obj;
		if (FHBNNF == null) {
			if (other.FHBNNF != null)
				return false;
		} else if (!FHBNNF.equals(other.FHBNNF))
			return false;
		if (FHBSER == null) {
			if (other.FHBSER != null)
				return false;
		} else if (!FHBSER.equals(other.FHBSER))
			return false;
		if (FHDCT == null) {
			if (other.FHDCT != null)
				return false;
		} else if (!FHDCT.equals(other.FHDCT))
			return false;
		if (FHN001 == null) {
			if (other.FHN001 != null)
				return false;
		} else if (!FHN001.equals(other.FHN001))
			return false;
		return true;
	}

	
	
	
	

}
