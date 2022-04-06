package br.com.compliance.nfe.jde.domain;

import java.math.BigDecimal;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class F55IJC72 {
	
	@EmbeddedId
	private F55IJC72Id id;

	private Integer JCBNNF;
	private String JCBSER;
	private String JCDCT;
	private Integer JCN001;
	private Integer JCUKID;
	private Integer JCSEQ;
	private Integer JCLIN;
	private String JCAPTA;
	private String JCTORG;
	private String JCUSER;
	private String JCPID;
	private String JCJOBN;
	private BigDecimal JCUPMJ;
	private Integer JCTDAY;
	private String JCURRF;
	private Integer JCURAB;
	private Integer JCURAT;
	private BigDecimal JCURDT;
	private String JCURCD;
	private String JCURC1;
	private String JCURC2;
	
	/*MODIFICAÇÃO 21-05-18*/
	private Integer JCWJOBS;
	
	public F55IJC72() {
		super();
		// TODO Auto-generated constructor stub
	}

	public F55IJC72Id getId() {
		return id;
	}

	public void setId(F55IJC72Id id) {
		this.id = id;
	}

	public Integer getJCBNNF() {
		return JCBNNF;
	}

	public void setJCBNNF(Integer jCBNNF) {
		JCBNNF = jCBNNF;
	}

	public String getJCBSER() {
		return JCBSER;
	}

	public void setJCBSER(String jCBSER) {
		JCBSER = jCBSER;
	}

	public String getJCDCT() {
		return JCDCT;
	}

	public void setJCDCT(String jCDCT) {
		JCDCT = jCDCT;
	}

	public Integer getJCN001() {
		return JCN001;
	}

	public void setJCN001(Integer jCN001) {
		JCN001 = jCN001;
	}

	public Integer getJCUKID() {
		return JCUKID;
	}

	public void setJCUKID(Integer jCUKID) {
		JCUKID = jCUKID;
	}

	public Integer getJCSEQ() {
		return JCSEQ;
	}

	public void setJCSEQ(Integer jCSEQ) {
		JCSEQ = jCSEQ;
	}

	public Integer getJCLIN() {
		return JCLIN;
	}

	public void setJCLIN(Integer jCLIN) {
		JCLIN = jCLIN;
	}

	public String getJCAPTA() {
		return JCAPTA;
	}

	public void setJCAPTA(String jCAPTA) {
		JCAPTA = jCAPTA;
	}

	public String getJCTORG() {
		return JCTORG;
	}

	public void setJCTORG(String jCTORG) {
		JCTORG = jCTORG;
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

	public Integer getJCTDAY() {
		return JCTDAY;
	}

	public void setJCTDAY(Integer jCTDAY) {
		JCTDAY = jCTDAY;
	}

	public String getJCURRF() {
		return JCURRF;
	}

	public void setJCURRF(String jCURRF) {
		JCURRF = jCURRF;
	}

	public Integer getJCURAB() {
		return JCURAB;
	}

	public void setJCURAB(Integer jCURAB) {
		JCURAB = jCURAB;
	}

	public Integer getJCURAT() {
		return JCURAT;
	}

	public void setJCURAT(Integer jCURAT) {
		JCURAT = jCURAT;
	}

	public BigDecimal getJCURDT() {
		return JCURDT;
	}

	public void setJCURDT(BigDecimal jCURDT) {
		JCURDT = jCURDT;
	}

	public String getJCURCD() {
		return JCURCD;
	}

	public void setJCURCD(String jCURCD) {
		JCURCD = jCURCD;
	}

	public String getJCURC1() {
		return JCURC1;
	}

	public void setJCURC1(String jCURC1) {
		JCURC1 = jCURC1;
	}

	public String getJCURC2() {
		return JCURC2;
	}

	public void setJCURC2(String jCURC2) {
		JCURC2 = jCURC2;
	}

	public Integer getJCWJOBS() {
		return JCWJOBS;
	}

	public void setJCWJOBS(Integer jCWJOBS) {
		JCWJOBS = jCWJOBS;
	}
	
	

}
