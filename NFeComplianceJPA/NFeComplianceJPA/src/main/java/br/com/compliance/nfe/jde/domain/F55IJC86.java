package br.com.compliance.nfe.jde.domain;

import java.math.BigDecimal;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

/*F55JC86 - IJC - Notas Fiscais de Referência*/
@Entity
public class F55IJC86 {
	@EmbeddedId
	private F55IJC86Id id;
	
	private Integer JCBNNF;
	private String JCBSER;
	private Long JCN001;
	private String JCDCT;
	
	private Integer JCSBSQ;
	private String JCBBRCD;
	private String JCAA15;
	private String JCAA02;
	private Integer JCSFLB;
	private Integer JCABO1;
	private Integer JCKA01;
	private String JCAA05;
	private Long JCNNSF;
	private String JCAA09;
	private String JCEV02;
	private String JCKI02;
	private String JCAA03;
	private String JCAA14;
	private Integer JCUKFN1;
	private Integer JCFNUM;
	private String JCUSER;
	private String JCTORG;
	private String JCPID;
	private String JCJOBN;
	private String JCUPMJ;
	private Integer JCUPMT;
	private String JCURRF;
	private Integer JCURAB;
	private BigDecimal JCURAT;
	private String JCURDT;
	private String JCURCD;
	private String JCURC1;
	private String JCURC2;
	
	public F55IJC86(){}

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

	public Integer getJCSBSQ() {
		return JCSBSQ;
	}

	public void setJCSBSQ(Integer jCSBSQ) {
		JCSBSQ = jCSBSQ;
	}

	public String getJCBBRCD() {
		return JCBBRCD;
	}

	public void setJCBBRCD(String jCBBRCD) {
		JCBBRCD = jCBBRCD;
	}

	public String getJCAA15() {
		return JCAA15;
	}

	public void setJCAA15(String jCAA15) {
		JCAA15 = jCAA15;
	}

	public String getJCAA02() {
		return JCAA02;
	}

	public void setJCAA02(String jCAA02) {
		JCAA02 = jCAA02;
	}

	public Integer getJCSFLB() {
		return JCSFLB;
	}

	public void setJCSFLB(Integer jCSFLB) {
		JCSFLB = jCSFLB;
	}

	public Integer getJCABO1() {
		return JCABO1;
	}

	public void setJCABO1(Integer jCABO1) {
		JCABO1 = jCABO1;
	}

	public Integer getJCKA01() {
		return JCKA01;
	}

	public void setJCKA01(Integer jCKA01) {
		JCKA01 = jCKA01;
	}

	public String getJCAA05() {
		return JCAA05;
	}

	public void setJCAA05(String jCAA05) {
		JCAA05 = jCAA05;
	}

	public Long getJCNNSF() {
		return JCNNSF;
	}

	public void setJCNNSF(Long jCNNSF) {
		JCNNSF = jCNNSF;
	}

	public String getJCAA09() {
		return JCAA09;
	}

	public void setJCAA09(String jCAA09) {
		JCAA09 = jCAA09;
	}

	public String getJCEV02() {
		return JCEV02;
	}

	public void setJCEV02(String jCEV02) {
		JCEV02 = jCEV02;
	}

	public String getJCKI02() {
		return JCKI02;
	}

	public void setJCKI02(String jCKI02) {
		JCKI02 = jCKI02;
	}

	public String getJCAA03() {
		return JCAA03;
	}

	public void setJCAA03(String jCAA03) {
		JCAA03 = jCAA03;
	}

	public String getJCAA14() {
		return JCAA14;
	}

	public void setJCAA14(String jCAA14) {
		JCAA14 = jCAA14;
	}

	public Integer getJCUKFN1() {
		return JCUKFN1;
	}

	public void setJCUKFN1(Integer jCUKFN1) {
		JCUKFN1 = jCUKFN1;
	}

	public Integer getJCFNUM() {
		return JCFNUM;
	}

	public void setJCFNUM(Integer jCFNUM) {
		JCFNUM = jCFNUM;
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

	public Integer getJCURAB() {
		return JCURAB;
	}

	public void setJCURAB(Integer jCURAB) {
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

	@Override
	public String toString() {
		return "F55IJC86 [id=" + id + ", JCBNNF=" + JCBNNF + ", JCBSER=" + JCBSER + ", JCN001=" + JCN001 + ", JCDCT="
				+ JCDCT + ", JCSBSQ=" + JCSBSQ + ", JCBBRCD=" + JCBBRCD + ", JCAA15=" + JCAA15 + ", JCAA02=" + JCAA02
				+ ", JCSFLB=" + JCSFLB + ", JCABO1=" + JCABO1 + ", JCKA01=" + JCKA01 + ", JCAA05=" + JCAA05
				+ ", JCNNSF=" + JCNNSF + ", JCAA09=" + JCAA09 + ", JCEV02=" + JCEV02 + ", JCKI02=" + JCKI02
				+ ", JCAA03=" + JCAA03 + ", JCAA14=" + JCAA14 + ", JCUKFN1=" + JCUKFN1 + ", JCFNUM=" + JCFNUM
				+ ", JCUSER=" + JCUSER + ", JCTORG=" + JCTORG + ", JCPID=" + JCPID + ", JCJOBN=" + JCJOBN + ", JCUPMJ="
				+ JCUPMJ + ", JCUPMT=" + JCUPMT + ", JCURRF=" + JCURRF + ", JCURAB=" + JCURAB + ", JCURAT=" + JCURAT
				+ ", JCURDT=" + JCURDT + ", JCURCD=" + JCURCD + ", JCURC1=" + JCURC1 + ", JCURC2=" + JCURC2 + "]";
	}
	
	
	

}
