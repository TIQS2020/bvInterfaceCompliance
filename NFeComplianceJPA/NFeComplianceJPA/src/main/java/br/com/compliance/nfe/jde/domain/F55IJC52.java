package br.com.compliance.nfe.jde.domain;

import java.sql.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class F55IJC52 {

	@EmbeddedId
	private F55IJC52Id id;
	
	private String JCCO;			
	private Long JCWJOBS;
	private String JCBEGDATE;
	private String JCENDDATE;
	private String JCTAX;
	private String JCSTRT;
	private Integer JCITM;
	private Integer JCKIT;
	private Long JCQYF;
	private Long JCTQRT;	
	/*AUDITORIA*/
	private String JCUSER;
	private String JCPID;
	private String JCJOBN;
	private Date JCUPMJ;
	private Integer JCUPMT;
	
	public F55IJC52() {
		super();
	}

	public F55IJC52Id getId() {
		return id;
	}

	public void setId(F55IJC52Id id) {
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

	

	public String getJCTAX() {
		return JCTAX;
	}

	public void setJCTAX(String jCTAX) {
		JCTAX = jCTAX;
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

	public String getJCSTRT() {
		return JCSTRT;
	}

	public void setJCSTRT(String jCSTRT) {
		JCSTRT = jCSTRT;
	}

	public Integer getJCITM() {
		return JCITM;
	}

	public void setJCITM(Integer jCITM) {
		JCITM = jCITM;
	}

	public Integer getJCKIT() {
		return JCKIT;
	}

	public void setJCKIT(Integer jCKIT) {
		JCKIT = jCKIT;
	}

	public Long getJCQYF() {
		return JCQYF;
	}

	public void setJCQYF(Long jCQYF) {
		JCQYF = jCQYF;
	}

	public Long getJCTQRT() {
		return JCTQRT;
	}

	public void setJCTQRT(Long jCTQRT) {
		JCTQRT = jCTQRT;
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
