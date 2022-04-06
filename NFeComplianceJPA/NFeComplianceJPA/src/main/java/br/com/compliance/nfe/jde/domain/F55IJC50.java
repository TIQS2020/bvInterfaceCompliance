package br.com.compliance.nfe.jde.domain;

import java.sql.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class F55IJC50 {
	
	@EmbeddedId
	private F55IJC50Id id;
	
	private String JCCO;			
	private Long JCWJOBS;
	private Date JCBEGDATE;
	private Date JCENDDATE;
	private String JCTAX;
	private Integer JCKIT;
	private String JCUOM1;
	private Integer JCITM;
	private Long JCUKID;
	private String JCUM;
	private Long JCQNTY;
	private Long JCSOQS;
	private Date JCEFFF;
	private Date JCEFFT;
	/*AUDITORIA*/
	private String JCUSER;
	private String JCPID;
	private String JCJOBN;
	private Date JCUPMJ;
	private Integer JCUPMT;
	
	public F55IJC50() {
		super();
	}

	public F55IJC50Id getId() {
		return id;
	}

	public void setId(F55IJC50Id id) {
		this.id = id;
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

	public Date getJCBEGDATE() {
		return JCBEGDATE;
	}

	public void setJCBEGDATE(Date jCBEGDATE) {
		JCBEGDATE = jCBEGDATE;
	}

	public Date getJCENDDATE() {
		return JCENDDATE;
	}

	public void setJCENDDATE(Date jCENDDATE) {
		JCENDDATE = jCENDDATE;
	}

	public String getJCTAX() {
		return JCTAX;
	}

	public void setJCTAX(String jCTAX) {
		JCTAX = jCTAX;
	}

	public Integer getJCKIT() {
		return JCKIT;
	}

	public void setJCKIT(Integer jCKIT) {
		JCKIT = jCKIT;
	}

	public String getJCUOM1() {
		return JCUOM1;
	}

	public void setJCUOM1(String jCUOM1) {
		JCUOM1 = jCUOM1;
	}

	public Integer getJCITM() {
		return JCITM;
	}

	public void setJCITM(Integer jCITM) {
		JCITM = jCITM;
	}

	public Long getJCUKID() {
		return JCUKID;
	}

	public void setJCUKID(Long jCUKID) {
		JCUKID = jCUKID;
	}

	public String getJCUM() {
		return JCUM;
	}

	public void setJCUM(String jCUM) {
		JCUM = jCUM;
	}

	public Long getJCQNTY() {
		return JCQNTY;
	}

	public void setJCQNTY(Long jCQNTY) {
		JCQNTY = jCQNTY;
	}

	public Long getJCSOQS() {
		return JCSOQS;
	}

	public void setJCSOQS(Long jCSOQS) {
		JCSOQS = jCSOQS;
	}

	public Date getJCEFFF() {
		return JCEFFF;
	}

	public void setJCEFFF(Date jCEFFF) {
		JCEFFF = jCEFFF;
	}

	public Date getJCEFFT() {
		return JCEFFT;
	}

	public void setJCEFFT(Date jCEFFT) {
		JCEFFT = jCEFFT;
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
	
	

}
