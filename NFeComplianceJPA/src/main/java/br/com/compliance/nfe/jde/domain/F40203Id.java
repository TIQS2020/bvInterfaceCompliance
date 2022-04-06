package br.com.compliance.nfe.jde.domain;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class F40203Id implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String FSDCTO;
	private String FSTRTY;
	private String FSLNTY;
	
	
	
	public F40203Id() {
		super();
	}

	public F40203Id(String fSDCTO, String fSTRTY, String fSLNTY) {
		super();
		FSDCTO = fSDCTO;
		FSTRTY = fSTRTY;
		FSLNTY = fSLNTY;
	}

	public String getFSDCTO() {
		return FSDCTO;
	}

	public void setFSDCTO(String fSDCTO) {
		FSDCTO = fSDCTO;
	}

	public String getFSTRTY() {
		return FSTRTY;
	}

	public void setFSTRTY(String fSTRTY) {
		FSTRTY = fSTRTY;
	}

	public String getFSLNTY() {
		return FSLNTY;
	}

	public void setFSLNTY(String fSLNTY) {
		FSLNTY = fSLNTY;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((FSDCTO == null) ? 0 : FSDCTO.hashCode());
		result = prime * result + ((FSLNTY == null) ? 0 : FSLNTY.hashCode());
		result = prime * result + ((FSTRTY == null) ? 0 : FSTRTY.hashCode());
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
		F40203Id other = (F40203Id) obj;
		if (FSDCTO == null) {
			if (other.FSDCTO != null)
				return false;
		} else if (!FSDCTO.equals(other.FSDCTO))
			return false;
		if (FSLNTY == null) {
			if (other.FSLNTY != null)
				return false;
		} else if (!FSLNTY.equals(other.FSLNTY))
			return false;
		if (FSTRTY == null) {
			if (other.FSTRTY != null)
				return false;
		} else if (!FSTRTY.equals(other.FSTRTY))
			return false;
		return true;
	}
	
	

}
