package br.com.compliance.nfe.jde.domain;

import java.math.BigDecimal;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class F55IJC90 {
	
	@EmbeddedId
	private F55IJC90Id id;

	private String JCBSER;
	private Integer JCBNNF;
	private Integer JCN001;
	private String JCDCT;
	private Integer JCSEQ;    
	private String JCAA02;  
	private BigDecimal JCBVTN;    
	private String JCUSER; 
	private String JCPID; 
	private String JCJOBN; 
	private BigDecimal JCUPMJ; 
	private BigDecimal JCTDAY;    
	private String JCURRF; 
	private BigDecimal JCURAB;    
	private BigDecimal JCURAT;    
	private String JCURCD;  
	private BigDecimal JCURDT;
	
	public F55IJC90Id getId() {
		return id;
	}
	public void setId(F55IJC90Id id) {
		this.id = id;
	}
	public String getJCBSER() {
		return JCBSER;
	}
	public void setJCBSER(String jCBSER) {
		JCBSER = jCBSER;
	}
	public Integer getJCBNNF() {
		return JCBNNF;
	}
	public void setJCBNNF(Integer jCBNNF) {
		JCBNNF = jCBNNF;
	}
	public Integer getJCN001() {
		return JCN001;
	}
	public void setJCN001(Integer jCN001) {
		JCN001 = jCN001;
	}
	public String getJCDCT() {
		return JCDCT;
	}
	public void setJCDCT(String jCDCT) {
		JCDCT = jCDCT;
	}
	public Integer getJCSEQ() {
		return JCSEQ;
	}
	public void setJCSEQ(Integer jCSEQ) {
		JCSEQ = jCSEQ;
	}
	public String getJCAA02() {
		return JCAA02;
	}
	public void setJCAA02(String jCAA02) {
		JCAA02 = jCAA02;
	}
	public BigDecimal getJCBVTN() {
		return JCBVTN;
	}
	public void setJCBVTN(BigDecimal jCBVTN) {
		JCBVTN = jCBVTN;
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
	public BigDecimal getJCUPMJ() {
		return JCUPMJ;
	}
	public void setJCUPMJ(BigDecimal jCUPMJ) {
		JCUPMJ = jCUPMJ;
	}
	public BigDecimal getJCTDAY() {
		return JCTDAY;
	}
	public void setJCTDAY(BigDecimal jCTDAY) {
		JCTDAY = jCTDAY;
	}
	public String getJCURRF() {
		return JCURRF;
	}
	public void setJCURRF(String jCURRF) {
		JCURRF = jCURRF;
	}
	public BigDecimal getJCURAB() {
		return JCURAB;
	}
	public void setJCURAB(BigDecimal jCURAB) {
		JCURAB = jCURAB;
	}
	public BigDecimal getJCURAT() {
		return JCURAT;
	}
	public void setJCURAT(BigDecimal jCURAT) {
		JCURAT = jCURAT;
	}
	public String getJCURCD() {
		return JCURCD;
	}
	public void setJCURCD(String jCURCD) {
		JCURCD = jCURCD;
	}
	public BigDecimal getJCURDT() {
		return JCURDT;
	}
	public void setJCURDT(BigDecimal jCURDT) {
		JCURDT = jCURDT;
	}
	
	@Override
	public String toString() {
		return "F55IJC90 [id=" + id + ", JCBSER=" + JCBSER + ", JCBNNF=" + JCBNNF + ", JCN001=" + JCN001 + ", JCDCT="
				+ JCDCT + ", JCSEQ=" + JCSEQ + ", JCAA02=" + JCAA02 + ", JCBVTN=" + JCBVTN + ", JCUSER=" + JCUSER
				+ ", JCPID=" + JCPID + ", JCJOBN=" + JCJOBN + ", JCUPMJ=" + JCUPMJ + ", JCTDAY=" + JCTDAY + ", JCURRF="
				+ JCURRF + ", JCURAB=" + JCURAB + ", JCURAT=" + JCURAT + ", JCURCD=" + JCURCD + ", JCURDT=" + JCURDT
				+ "]";
	}
	
	
	

}
