package br.com.nfe.xml.cancelamento;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "NFCancel")
public class XmlFileCancelamentoRoot {

	private Integer JCBNNF;
	private String JCBSER;
	private Integer JCN001;
	private String JCDCT;
	private String JCBCGF;
	private String JCEV02;
	private String JCEV07;
	private Integer JCAN8;
	private Long JCMODFISC;
	private Integer JCCAND; // data cancelamento
	private String JCDTA1; // justificativa

	public XmlFileCancelamentoRoot() {
		super();
		// TODO Auto-generated constructor stub
	}

	public XmlFileCancelamentoRoot(Integer jCBNNF, String jCBSER, Integer jCN001, String jCDCT, String jCBCGF,
			String jCEV02, String jCEV07, Integer jCAN8, Long jCMODFISC, Integer jCCAND, String jCDTA1) {
		super();
		JCBNNF = jCBNNF;
		JCBSER = jCBSER;
		JCN001 = jCN001;
		JCDCT = jCDCT;
		JCBCGF = jCBCGF;
		JCEV02 = jCEV02;
		JCEV07 = jCEV07;
		JCAN8 = jCAN8;
		JCMODFISC = jCMODFISC;
		JCCAND = jCCAND;
		JCDTA1 = jCDTA1;
	}

	
	@XmlElement(name = "JCBNNF")
	public Integer getJCBNNF() {
		return JCBNNF;
	}

	public void setJCBNNF(Integer jCBNNF) {
		JCBNNF = jCBNNF;
	}

	@XmlElement(name = "JCBSER")
	public String getJCBSER() {
		return JCBSER;
	}

	public void setJCBSER(String jCBSER) {
		JCBSER = jCBSER;
	}

	@XmlElement(name = "JCN001")
	public Integer getJCN001() {
		return JCN001;
	}

	public void setJCN001(Integer jCN001) {
		JCN001 = jCN001;
	}

	@XmlElement(name = "JCDCT")
	public String getJCDCT() {
		return JCDCT;
	}

	public void setJCDCT(String jCDCT) {
		JCDCT = jCDCT;
	}

	@XmlElement(name = "JCBCGF")
	public String getJCBCGF() {
		return JCBCGF;
	}

	public void setJCBCGF(String jCBCGF) {
		JCBCGF = jCBCGF;
	}

	@XmlElement(name = "JCEV02")	
	public String getJCEV02() {
		return JCEV02;
	}

	public void setJCEV02(String jCEV02) {
		JCEV02 = jCEV02;
	}

	@XmlElement(name = "JCEV07")
	public String getJCEV07() {
		return JCEV07;
	}

	public void setJCEV07(String jCEV07) {
		JCEV07 = jCEV07;
	}

	@XmlElement(name = "JCAN8")
	public Integer getJCAN8() {
		return JCAN8;
	}

	public void setJCAN8(Integer jCAN8) {
		JCAN8 = jCAN8;
	}

	@XmlElement(name = "JCMODFISC")
	public Long getJCMODFISC() {
		return JCMODFISC;
	}

	public void setJCMODFISC(Long jCMODFISC) {
		JCMODFISC = jCMODFISC;
	}

	@XmlElement(name = "JCCAND")
	public Integer getJCCAND() {
		return JCCAND;
	}

	public void setJCCAND(Integer jCCAND) {
		JCCAND = jCCAND;
	}

	@XmlElement(name = "JCDTA1")
	public String getJCDTA1() {
		return JCDTA1;
	}

	public void setJCDTA1(String jCDTA1) {
		JCDTA1 = jCDTA1;
	}

}
