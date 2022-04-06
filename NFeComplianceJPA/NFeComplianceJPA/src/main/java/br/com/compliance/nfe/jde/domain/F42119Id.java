package br.com.compliance.nfe.jde.domain;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class F42119Id implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String SDKCOO;
	private Long SDDOCO;
	private String SDDCTO;
	private Long SDLNID;
	
	public F42119Id(){}
	
	public F42119Id(String sDKCOO, Long sDDOCO, String sDDCTO, Long sDLNID) {
		super();
		SDKCOO = sDKCOO;
		SDDOCO = sDDOCO;
		SDDCTO = sDDCTO;
		SDLNID = sDLNID;
	}

	public String getSDKCOO() {
		return SDKCOO;
	}

	public void setSDKCOO(String sDKCOO) {
		SDKCOO = sDKCOO;
	}

	public Long getSDDOCO() {
		return SDDOCO;
	}

	public void setSDDOCO(Long sDDOCO) {
		SDDOCO = sDDOCO;
	}

	public String getSDDCTO() {
		return SDDCTO;
	}

	public void setSDDCTO(String sDDCTO) {
		SDDCTO = sDDCTO;
	}

	public Long getSDLNID() {
		return SDLNID;
	}

	public void setSDLNID(Long sDLNID) {
		SDLNID = sDLNID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((SDDCTO == null) ? 0 : SDDCTO.hashCode());
		result = prime * result + ((SDDOCO == null) ? 0 : SDDOCO.hashCode());
		result = prime * result + ((SDKCOO == null) ? 0 : SDKCOO.hashCode());
		result = prime * result + ((SDLNID == null) ? 0 : SDLNID.hashCode());
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
		F42119Id other = (F42119Id) obj;
		if (SDDCTO == null) {
			if (other.SDDCTO != null)
				return false;
		} else if (!SDDCTO.equals(other.SDDCTO))
			return false;
		if (SDDOCO == null) {
			if (other.SDDOCO != null)
				return false;
		} else if (!SDDOCO.equals(other.SDDOCO))
			return false;
		if (SDKCOO == null) {
			if (other.SDKCOO != null)
				return false;
		} else if (!SDKCOO.equals(other.SDKCOO))
			return false;
		if (SDLNID == null) {
			if (other.SDLNID != null)
				return false;
		} else if (!SDLNID.equals(other.SDLNID))
			return false;
		return true;
	}
	
	
	
	

}
