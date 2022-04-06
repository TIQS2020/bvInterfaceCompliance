package br.com.compliance.nfe.jde.domain;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class F55IJC7C {
	
	@EmbeddedId
	private F55IJC7CId id;
	
	private String JCCO;
	private Long JCWJOBS;
	//private String JCTAX;
	private String JCBEGDATE;
	private String JCENDDATE;
	private String JCEV01;
	private String JCEV02;
	private String JCEV03;
	private String JCEV04;
	private String JCEV05;
	private String JCEV06;
	private String JCDESTIN;
	private String JCAAIL;
	private String JCA1ST;
	private String JCA2ST;
	
	public F55IJC7C() {
		super();
		// TODO Auto-generated constructor stub
	}

	public F55IJC7CId getId() {
		return id;
	}

	public void setId(F55IJC7CId id) {
		this.id = id;
	}

	/*
	public String getJCTAX() {
		return JCTAX;
	}

	public void setJCTAX(String jCTAX) {
		JCTAX = jCTAX;
	}
	*/
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

	public String getJCEV01() {
		return JCEV01;
	}

	public void setJCEV01(String jCEV01) {
		JCEV01 = jCEV01;
	}

	public String getJCEV02() {
		return JCEV02;
	}

	public void setJCEV02(String jCEV02) {
		JCEV02 = jCEV02;
	}

	public String getJCEV03() {
		return JCEV03;
	}

	public void setJCEV03(String jCEV03) {
		JCEV03 = jCEV03;
	}

	public String getJCEV05() {
		return JCEV05;
	}

	public void setJCEV05(String jCEV05) {
		JCEV05 = jCEV05;
	}

	public String getJCDESTIN() {
		return JCDESTIN;
	}

	public void setJCDESTIN(String jCDESTIN) {
		JCDESTIN = jCDESTIN;
	}

	public String getJCAAIL() {
		return JCAAIL;
	}

	public void setJCAAIL(String jCAAIL) {
		JCAAIL = jCAAIL;
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

	public String getJCA1ST() {
		return JCA1ST;
	}

	public void setJCA1ST(String jCA1ST) {
		JCA1ST = jCA1ST;
	}

	public String getJCA2ST() {
		return JCA2ST;
	}

	public void setJCA2ST(String jCA2ST) {
		JCA2ST = jCA2ST;
	}

	public String getJCEV06() {
		return JCEV06;
	}

	public void setJCEV06(String jCEV06) {
		JCEV06 = jCEV06;
	}

	@Override
	public String toString() {
		return "F55IJC7C [JCWJOBS=" + JCWJOBS + "]";
	}	
	
	
	

}
