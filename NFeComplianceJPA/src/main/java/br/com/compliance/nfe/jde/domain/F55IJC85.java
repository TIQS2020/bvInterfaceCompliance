package br.com.compliance.nfe.jde.domain;

import java.math.BigDecimal;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

/*F55JC85 -IJC - Dados Relacionados à Importação*/
@Entity
public class F55IJC85 {
	@EmbeddedId
	private F55IJC85Id id;
	
	private Integer JCBNNF;
	private String JCBSER;
	private Long JCN001;
	private String JCDCT;	
	
	/*modificacao tufic 16/05/16*/
	private BigDecimal JCAA;
	private Integer JCURAB;
	private Integer JCNBR1;
	private Integer JCSBSQ;
	private String JCAA15;
	private Integer JCASG1;
	private BigDecimal JCURAT;
	private String JCURCD;
	private String JCAA11;
	private String JCBRD60;
	private String JCAA16;	
	private String JCADDS;	
	private String JCXOPR;
	private String JCAA01;
	private String JCSHST;
	private BigDecimal JCBDES;
	private String JCTRDJ;
	private String JCRSDJ;
	
	private Double JCSQNR;
	
	public F55IJC85(){}

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

	public Integer getJCURAB() {
		return JCURAB;
	}

	public void setJCURAB(Integer jCURAB) {
		JCURAB = jCURAB;
	}

	public Integer getJCNBR1() {
		return JCNBR1;
	}

	public void setJCNBR1(Integer jCNBR1) {
		JCNBR1 = jCNBR1;
	}

	public Integer getJCSBSQ() {
		return JCSBSQ;
	}

	public void setJCSBSQ(Integer jCSBSQ) {
		JCSBSQ = jCSBSQ;
	}

	public String getJCAA15() {
		return JCAA15;
	}

	public void setJCAA15(String jCAA15) {
		JCAA15 = jCAA15;
	}

	public Integer getJCASG1() {
		return JCASG1;
	}

	public void setJCASG1(Integer jCASG1) {
		JCASG1 = jCASG1;
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

	public String getJCAA11() {
		return JCAA11;
	}

	public void setJCAA11(String jCAA11) {
		JCAA11 = jCAA11;
	}

	public String getJCBRD60() {
		return JCBRD60;
	}

	public void setJCBRD60(String jCBRD60) {
		JCBRD60 = jCBRD60;
	}

	public String getJCAA16() {
		return JCAA16;
	}

	public void setJCAA16(String jCAA16) {
		JCAA16 = jCAA16;
	}	

	public String getJCADDS() {
		return JCADDS;
	}

	public void setJCADDS(String jCADDS) {
		JCADDS = jCADDS;
	}	

	public String getJCXOPR() {
		return JCXOPR;
	}

	public void setJCXOPR(String jCXOPR) {
		JCXOPR = jCXOPR;
	}

	public String getJCAA01() {
		return JCAA01;
	}

	public void setJCAA01(String jCAA01) {
		JCAA01 = jCAA01;
	}

	public String getJCSHST() {
		return JCSHST;
	}

	public void setJCSHST(String jCSHST) {
		JCSHST = jCSHST;
	}

	public BigDecimal getJCBDES() {
		return JCBDES;
	}

	public void setJCBDES(BigDecimal jCBDES) {
		JCBDES = jCBDES;
	}

	public BigDecimal getJCAA() {
		return JCAA;
	}

	public void setJCAA(BigDecimal jCAA) {
		JCAA = jCAA;
	}

	public String getJCTRDJ() {
		return JCTRDJ;
	}

	public void setJCTRDJ(String jCTRDJ) {
		JCTRDJ = jCTRDJ;
	}

	public String getJCRSDJ() {
		return JCRSDJ;
	}

	public void setJCRSDJ(String jCRSDJ) {
		JCRSDJ = jCRSDJ;
	}

	public Double getJCSQNR() {
		return JCSQNR;
	}

	public void setJCSQNR(Double jCSQNR) {
		JCSQNR = jCSQNR;
	}
	
	
}
