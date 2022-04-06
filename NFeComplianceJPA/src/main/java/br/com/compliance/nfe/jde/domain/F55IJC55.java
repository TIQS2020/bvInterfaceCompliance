package br.com.compliance.nfe.jde.domain;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
@Entity
public class F55IJC55 {
	@EmbeddedId
	private F55IJC55Id id;
	
	private String JCCO;
	private Long JCWJOBS;
	private String JCBEGDATE;
	private String JCENDDATE;
	private Integer JCITM;
	
	private String JCTAX;
	private String JCSTRT;
	private Long JCTRQT;
	private String JCUOM1;
	
	/*AUDITORIA*/
	private String JCUSER;
	private String JCPID;
	private String JCJOBN;
	private String JCUPMJ;
	private Integer JCUPMT;
	public F55IJC55() {
		super();
		// TODO Auto-generated constructor stub
	}
	public F55IJC55Id getId() {
		return id;
	}
	public void setId(F55IJC55Id id) {
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
	public Integer getJCITM() {
		return JCITM;
	}
	public void setJCITM(Integer jCITM) {
		JCITM = jCITM;
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
	public Long getJCTRQT() {
		return JCTRQT;
	}
	public void setJCTRQT(Long jCTRQT) {
		JCTRQT = jCTRQT;
	}
	public String getJCUOM1() {
		return JCUOM1;
	}
	public void setJCUOM1(String jCUOM1) {
		JCUOM1 = jCUOM1;
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
