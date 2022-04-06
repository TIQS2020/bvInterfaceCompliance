package br.com.compliance.nfe.jde.domain;

import java.math.BigDecimal;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

/*F55JC88 - IJC - Complemento de Item de Exportação da NF-e*/
@Entity
public class F55IJC88 {
	@EmbeddedId
	private F55IJC88Id id;
	
	private Integer JCBNNF;
	private String JCBSER;
	private Long JCN001;
	private String JCDCT;
	
	private Integer JCSBSQ;
	private Integer JCBRN1;
	private String JCAA11;
	private String JCAA12;
	private String JCBBRCD;
	private BigDecimal JCAEXP;
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
	
	public F55IJC88(){}

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

	public Integer getJCBRN1() {
		return JCBRN1;
	}

	public void setJCBRN1(Integer jCBRN1) {
		JCBRN1 = jCBRN1;
	}

	public String getJCAA11() {
		return JCAA11;
	}

	public void setJCAA11(String jCAA11) {
		JCAA11 = jCAA11;
	}

	public String getJCAA12() {
		return JCAA12;
	}

	public void setJCAA12(String jCAA12) {
		JCAA12 = jCAA12;
	}

	public String getJCBBRCD() {
		return JCBBRCD;
	}

	public void setJCBBRCD(String jCBBRCD) {
		JCBBRCD = jCBBRCD;
	}

	public BigDecimal getJCAEXP() {
		return JCAEXP;
	}

	public void setJCAEXP(BigDecimal jCAEXP) {
		JCAEXP = jCAEXP;
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
	
	
	
	

}
