package br.com.compliance.nfe.jde.domain;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class F42199Id implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String SLKCOO;      
	private Double SLDOCO;      
	private String SLDCTO;      
	private Double SLLNID; 
	private Long SLUPMJ;
	private Long SLTDAY;
	
	public F42199Id() {
		super();
	}

	public String getSLKCOO() {
		return SLKCOO;
	}

	public void setSLKCOO(String sLKCOO) {
		SLKCOO = sLKCOO;
	}

	public Double getSLDOCO() {
		return SLDOCO;
	}

	public void setSLDOCO(Double sLDOCO) {
		SLDOCO = sLDOCO;
	}

	public String getSLDCTO() {
		return SLDCTO;
	}

	public void setSLDCTO(String sLDCTO) {
		SLDCTO = sLDCTO;
	}

	public Double getSLLNID() {
		return SLLNID;
	}

	public void setSLLNID(Double sLLNID) {
		SLLNID = sLLNID;
	}

	public Long getSLUPMJ() {
		return SLUPMJ;
	}

	public void setSLUPMJ(Long sLUPMJ) {
		SLUPMJ = sLUPMJ;
	}

	public Long getSLTDAY() {
		return SLTDAY;
	}

	public void setSLTDAY(Long sLTDAY) {
		SLTDAY = sLTDAY;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((SLDCTO == null) ? 0 : SLDCTO.hashCode());
		result = prime * result + ((SLDOCO == null) ? 0 : SLDOCO.hashCode());
		result = prime * result + ((SLKCOO == null) ? 0 : SLKCOO.hashCode());
		result = prime * result + ((SLLNID == null) ? 0 : SLLNID.hashCode());
		result = prime * result + ((SLTDAY == null) ? 0 : SLTDAY.hashCode());
		result = prime * result + ((SLUPMJ == null) ? 0 : SLUPMJ.hashCode());
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
		F42199Id other = (F42199Id) obj;
		if (SLDCTO == null) {
			if (other.SLDCTO != null)
				return false;
		} else if (!SLDCTO.equals(other.SLDCTO))
			return false;
		if (SLDOCO == null) {
			if (other.SLDOCO != null)
				return false;
		} else if (!SLDOCO.equals(other.SLDOCO))
			return false;
		if (SLKCOO == null) {
			if (other.SLKCOO != null)
				return false;
		} else if (!SLKCOO.equals(other.SLKCOO))
			return false;
		if (SLLNID == null) {
			if (other.SLLNID != null)
				return false;
		} else if (!SLLNID.equals(other.SLLNID))
			return false;
		if (SLTDAY == null) {
			if (other.SLTDAY != null)
				return false;
		} else if (!SLTDAY.equals(other.SLTDAY))
			return false;
		if (SLUPMJ == null) {
			if (other.SLUPMJ != null)
				return false;
		} else if (!SLUPMJ.equals(other.SLUPMJ))
			return false;
		return true;
	}
	

}
