package br.com.compliance.nfe.jde.domain;

import java.sql.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
@Entity
public class F55IJC51 {
	
	@EmbeddedId
	private F55IJC51Id id;
	
	private String JCCO;			
	private Long JCWJOBS;
	private String JCBEGDATE;
	private String JCENDDATE;
	private String JCTAX;
	private String JCD01;
	private Integer JCITM;
	private String JCUOM1;
	private String JCPPFG;
	private Integer JCAN8;
	private Long JCQAVAL;
	private String JCEV15;
	
	/*AUDITORIA*/
	private String JCUSER;
	private String JCPID;
	private String JCJOBN;
	private Date JCUPMJ;
	private Integer JCUPMT;
	
	public F55IJC51() {
		super();
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

	public String getJCTAX() {
		return JCTAX;
	}

	public void setJCTAX(String jCTAX) {
		JCTAX = jCTAX;
	}	

	public String getJCD01() {
		return JCD01;
	}

	public void setJCD01(String jCD01) {
		JCD01 = jCD01;
	}

	public Integer getJCITM() {
		return JCITM;
	}

	public void setJCITM(Integer jCITM) {
		JCITM = jCITM;
	}

	public String getJCUOM1() {
		return JCUOM1;
	}

	public void setJCUOM1(String jCUOM1) {
		JCUOM1 = jCUOM1;
	}

	public String getJCPPFG() {
		return JCPPFG;
	}

	public void setJCPPFG(String jCPPFG) {
		JCPPFG = jCPPFG;
	}

	public Integer getJCAN8() {
		return JCAN8;
	}

	public void setJCAN8(Integer jCAN8) {
		JCAN8 = jCAN8;
	}

	public Long getJCQAVAL() {
		return JCQAVAL;
	}

	public void setJCQAVAL(Long jCQAVAL) {
		JCQAVAL = jCQAVAL;
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

	public Date getJCUPMJ() {
		return JCUPMJ;
	}

	public void setJCUPMJ(Date jCUPMJ) {
		JCUPMJ = jCUPMJ;
	}

	public Integer getJCUPMT() {
		return JCUPMT;
	}

	public void setJCUPMT(Integer jCUPMT) {
		JCUPMT = jCUPMT;
	}

	public String getJCEV15() {
		return JCEV15;
	}

	public void setJCEV15(String jCEV15) {
		JCEV15 = jCEV15;
	}

	public F55IJC51Id getId() {
		return id;
	}

	public void setId(F55IJC51Id id) {
		this.id = id;
	}
	
	
	

}
