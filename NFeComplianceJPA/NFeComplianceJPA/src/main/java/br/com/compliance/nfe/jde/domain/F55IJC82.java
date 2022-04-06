package br.com.compliance.nfe.jde.domain;

import java.math.BigDecimal;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

/*F55JC82 - IJC - NFe Mensagem*/
@Entity
public class F55IJC82 {
	
	@EmbeddedId
	private F55IJC82Id id;
	
	private Integer JCBNNF;
	private String JCBSER;
	private Long JCN001;
	private String JCDCT;
	
	private Integer JCSEQ;
	private Integer JCLIN;
	private String JCAPTA;
	private String JCTORG;
	private String JCUSER;
	private String JCPID;
	private String JCJOBN;
	private String JCUPMJ;
	private Integer JCTDAY;
	private String JCURRF;
	private Long JCURAB;
	private BigDecimal JCURAT;
	private String JCURDT;
	private String JCURCD;
	private String JCURC1;
	private String JCURC2;
	private String JCUKID;
	
	public F55IJC82(){}

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

	public Long getJCN001() {
		return JCN001;
	}

	public void setJCN001(Long jCN001) {
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

	public String getJCUPMJ() {
		return JCUPMJ;
	}

	public void setJCUPMJ(String jCUPMJ) {
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

	public Long getJCURAB() {
		return JCURAB;
	}

	public void setJCURAB(Long jCURAB) {
		JCURAB = jCURAB;
	}

	public BigDecimal getJCURAT() {
		return JCURAT;
	}

	public void setJCURAT(BigDecimal jCURAT) {
		JCURAT = jCURAT;
	}

	public String getJCURDT() {
		return JCURDT;
	}

	public void setJCURDT(String jCURDT) {
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

	public String getJCUKID() {
		return JCUKID;
	}

	public void setJCUKID(String jCUKID) {
		JCUKID = jCUKID;
	}
	
	
	
	

}
