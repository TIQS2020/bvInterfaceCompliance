package br.com.compliance.nfe.jde.domain;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class F55IJC53 {
	
	@EmbeddedId
	private F55IJC53Id id;
	
	private String JCCO;
	private Integer JCITM;
	private String JCBEGDATE;
	private String JCENDDATE;
	private String JCTAX;
	private String JCSTRT;
	private String JCSTRX;
	private Integer JCDOCO;
	private String JCUOM1;
	private Long JCTQRT;
	private Long JCWJOBS;
	
	/*AUDITORIA*/
	private String JCUSER;
	private String JCPID;
	private String JCJOBN;
	private String JCUPMJ;
	private Integer JCUPMT;
	public F55IJC53() {
		super();
	}
	public F55IJC53Id getId() {
		return id;
	}
	public void setId(F55IJC53Id id) {
		this.id = id;
	}
	public String getJCCO() {
		return JCCO;
	}
	public void setJCCO(String jCCO) {
		JCCO = jCCO;
	}
	public Integer getJCITM() {
		return JCITM;
	}
	public void setJCITM(Integer jCITM) {
		JCITM = jCITM;
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
	public String getJCSTRT() {
		return JCSTRT;
	}
	public void setJCSTRT(String jCSTRT) {
		JCSTRT = jCSTRT;
	}
	public String getJCSTRX() {
		return JCSTRX;
	}
	public void setJCSTRX(String jCSTRX) {
		JCSTRX = jCSTRX;
	}
	public Integer getJCDOCO() {
		return JCDOCO;
	}
	public void setJCDOCO(Integer jCDOCO) {
		JCDOCO = jCDOCO;
	}
	public String getJCUOM1() {
		return JCUOM1;
	}
	public void setJCUOM1(String jCUOM1) {
		JCUOM1 = jCUOM1;
	}
	public Long getJCTQRT() {
		return JCTQRT;
	}
	public void setJCTQRT(Long jCTQRT) {
		JCTQRT = jCTQRT;
	}
	public Long getJCWJOBS() {
		return JCWJOBS;
	}
	public void setJCWJOBS(Long jCWJOBS) {
		JCWJOBS = jCWJOBS;
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
	public String getJCUPMJ() {
		return JCUPMJ;
	}
	public void setJCUPMJ(String jCUPMJ) {
		JCUPMJ = jCUPMJ;
	}
	public Integer getJCUPMT() {
		return JCUPMT;
	}
	public void setJCUPMT(Integer jCUPMT) {
		JCUPMT = jCUPMT;
	}
	
	
	
}
