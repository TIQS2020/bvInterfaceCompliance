package br.com.compliance.nfe.jde.domain;

import java.math.BigDecimal;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

/*F55JC83 - IJC - Vencimentos da Nota Fiscal Eletrônica*/
@Entity
public class F55IJC83 {
	@EmbeddedId
	private F55IJC83Id id;
	
	private Integer JCBNNF;
	private String JCBSER;
	private Long JCN001;
	private String JCDCT;
	
	private Integer JCNSP;
	private BigDecimal JCAEXP;
	private String JCKI03;
	private String JCCHAR;
	private BigDecimal JCAA;
	private BigDecimal JCAA1;
	private String JCIMVD;
	private String JCFBDPRCD;
	private String JCUSER;
	private String JCTORG;
	private String JCPID;
	private String JCJOBN;
	private String JCUPMJ;
	private Integer JCUPMT;
	private String JCURRF;
	private Long JCURAB;
	private BigDecimal JCURAT;
	private String JCURDT;
	private String JCURCD;
	private String JCURC1;
	private String JCURC2;
	private String JCDDJ;
	private String JCCRPR;
	
	public F55IJC83(){}

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

	public Integer getJCNSP() {
		return JCNSP;
	}

	public void setJCNSP(Integer jCNSP) {
		JCNSP = jCNSP;
	}

	public BigDecimal getJCAEXP() {
		return JCAEXP;
	}

	public void setJCAEXP(BigDecimal jCAEXP) {
		JCAEXP = jCAEXP;
	}

	public String getJCKI03() {
		return JCKI03;
	}

	public void setJCKI03(String jCKI03) {
		JCKI03 = jCKI03;
	}


	public String getJCCHAR() {
		return JCCHAR;
	}

	public void setJCCHAR(String jCCHAR) {
		JCCHAR = jCCHAR;
	}

	public BigDecimal getJCAA() {
		return JCAA;
	}

	public void setJCAA(BigDecimal jCAA) {
		JCAA = jCAA;
	}

	public BigDecimal getJCAA1() {
		return JCAA1;
	}

	public void setJCAA1(BigDecimal jCAA1) {
		JCAA1 = jCAA1;
	}

	public String getJCIMVD() {
		return JCIMVD;
	}

	public void setJCIMVD(String jCIMVD) {
		JCIMVD = jCIMVD;
	}

	public String getJCFBDPRCD() {
		return JCFBDPRCD;
	}

	public void setJCFBDPRCD(String jCFBDPRCD) {
		JCFBDPRCD = jCFBDPRCD;
	}

	public String getJCUSER() {
		return JCUSER;
	}

	public void setJCUSER(String jCUSER) {
		JCUSER = jCUSER;
	}

	public String getJCTORG() {
		return JCTORG;
	}

	public void setJCTORG(String jCTORG) {
		JCTORG = jCTORG;
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

	public String getJCDDJ() {
		return JCDDJ;
	}

	public void setJCDDJ(String jCDDJ) {
		JCDDJ = jCDDJ;
	}

	public String getJCCRPR() {
		return JCCRPR;
	}

	public void setJCCRPR(String jCCRPR) {
		JCCRPR = jCCRPR;
	}
	
	

}
