package br.com.compliance.nfe.jde.domain;

import java.math.BigDecimal;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class F55IJC60 {
	
	@EmbeddedId
	private F55IJC60Id id;
	
	private Long JCWJOBS;
	private String JCTAX;
	private String JCLITM;
	private Long JCISSU;
	private String JCUOM;
	private Long JCTQCT;
	//private BigDecimal JCTAOH;
	private BigDecimal JCTACT;
	private Long JCEV01;
	private Long JCAN8;
	//private String JCLDSC1;
	private String JCANI;
	private Long JCADDJ;
	private String JCAA02;
		
	/*modificações 29-03-18*/
	private Long JCBEGDATE;
	private Long JCENDDATE;
	private String JCEV15;
	private BigDecimal JCUNCS;
	
	/*AUDITORIA*/
	private String JCUSER;
	private String JCPID;
	private String JCJOBN;
	private Long JCUPMJ;
	private Integer JCTDAY;
	
	public F55IJC60() {
		super();
		// TODO Auto-generated constructor stub
	}	
	
	public F55IJC60Id getId() {
		return id;
	}
	
	public void setId(F55IJC60Id id) {
		this.id = id;
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
	public String getJCUOM() {
		return JCUOM;
	}
	public void setJCUOM(String jCUOM) {
		JCUOM = jCUOM;
	}
	public Long getJCTQCT() {
		return JCTQCT;
	}
	public void setJCTQCT(Long jCTQCT) {
		JCTQCT = jCTQCT;
	}
	/*
	public BigDecimal getJCTAOH() {
		return JCTAOH;
	}
	public void setJCTAOH(BigDecimal jCTAOH) {
		JCTAOH = jCTAOH;
	}
	*/
	public BigDecimal getJCTACT() {
		return JCTACT;
	}
	public void setJCTACT(BigDecimal jCTACT) {
		JCTACT = jCTACT;
	}
	public Long getJCEV01() {
		return JCEV01;
	}
	public void setJCEV01(Long jCEV01) {
		JCEV01 = jCEV01;
	}
	public Long getJCAN8() {
		return JCAN8;
	}
	public void setJCAN8(Long jCAN8) {
		JCAN8 = jCAN8;
	}
	/*
	public String getJCLDSC1() {
		return JCLDSC1;
	}
	public void setJCLDSC1(String jCLDSC1) {
		JCLDSC1 = jCLDSC1;
	}
	*/
	public String getJCANI() {
		return JCANI;
	}
	public void setJCANI(String jCANI) {
		JCANI = jCANI;
	}
	public Long getJCADDJ() {
		return JCADDJ;
	}
	public void setJCADDJ(Long jCADDJ) {
		JCADDJ = jCADDJ;
	}
	public String getJCAA02() {
		return JCAA02;
	}
	public void setJCAA02(String jCAA02) {
		JCAA02 = jCAA02;
	}
	public String getJCUSER() {
		return JCUSER;
	}
	public void setJCUSER(String jCUSER) {
		JCUSER = jCUSER;
	}
	public String getJCPID() {
		return JCPID;
	}
	public void setJCPID(String jCPID) {
		JCPID = jCPID;
	}
	public String getJCJOBN() {
		return JCJOBN;
	}
	public void setJCJOBN(String jCJOBN) {
		JCJOBN = jCJOBN;
	}
	public Long getJCUPMJ() {
		return JCUPMJ;
	}
	public void setJCUPMJ(Long jCUPMJ) {
		JCUPMJ = jCUPMJ;
	}
	public Integer getJCTDAY() {
		return JCTDAY;
	}
	public void setJCTDAY(Integer jCTDAY) {
		JCTDAY = jCTDAY;
	}

	public Long getJCWJOBS() {
		return JCWJOBS;
	}

	public void setJCWJOBS(Long jCWJOBS) {
		JCWJOBS = jCWJOBS;
	}

	public Long getJCBEGDATE() {
		return JCBEGDATE;
	}

	public void setJCBEGDATE(Long jCBEGDATE) {
		JCBEGDATE = jCBEGDATE;
	}

	public Long getJCENDDATE() {
		return JCENDDATE;
	}

	public void setJCENDDATE(Long jCENDDATE) {
		JCENDDATE = jCENDDATE;
	}

	public String getJCEV15() {
		return JCEV15;
	}

	public void setJCEV15(String jCEV15) {
		JCEV15 = jCEV15;
	}

	public BigDecimal getJCUNCS() {
		return JCUNCS;
	}

	public void setJCUNCS(BigDecimal jCUNCS) {
		JCUNCS = jCUNCS;
	}
	
	
	

}
