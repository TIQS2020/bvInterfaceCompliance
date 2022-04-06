package br.com.compliance.nfe.jde.domain;

import java.math.BigDecimal;
import java.math.BigInteger;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class F55IJC71 {

	@EmbeddedId
	private F55IJC71Id id;

	private Integer JCBNNF;
	private String JCBSER;
	private Integer JCN001;
	private String JCDCT;
	private Integer JCUKID;
	private String JCSOS1;
	private Integer JCBNF0;
	private String JCBSR0;
	private Integer JCN002;
	private String JCBNFS;
	private String JCOCTO;
	private String JCMATC;
	private Integer JCDOCO;
	private String JCPDCT;
	private String JCKCOO;
	private String JCSFXO;
	private Integer JCLNID;
	private Integer JCNLIN;
	private Integer JCDOC;
	private String JCDCTO;
	private String JCCO;
	private String JCFCO;
	private Integer JCITM;
	private String JCLITM;
	private String JCAITM;
	private String JCCITM;
	private String JCMCU;
	private String JCLOCN;
	private String JCLOTN;
	private String JCDSC1;
	private String JCDSC2;
	private String JCLNTY;
	private String JCUOM;
	private BigDecimal JCUORG;
	private String JCUOM3;
	private String JCUOM4;
	private BigDecimal JCUPRC;
	private BigDecimal JCAEXP;
	private BigDecimal JCBDES;
	private String JCGLC;
	private Integer JCSHAN;
	private Integer JCAN8;
	private String JCBCGT;
	private String JCBCPT;
	private String JCSHST;
	private String JCSHZP;
	private Integer JCBSFH;
	private Integer JCAN8V;
	private String JCBCGF;
	private String JCBCPF;
	private String JCADDS;
	private Integer JCBNOP;
	private String JCBSOP;
	private String JCBDIP;
	private String JCBCLF;
	private String JCBCTF;
	private String JCBIST;
	private String JCBORI;
	private String JCBCFC;
	private String JCBSTT;
	private BigDecimal JCBFRT;
	private BigDecimal JCBSEG;
	private BigDecimal JCBDFN;
	private BigDecimal JCBICM;
	private BigDecimal JCTXR1;
	private BigDecimal JCBBCL;
	private BigDecimal JCBBIR;
	private BigDecimal JCBVIS;
	private BigDecimal JCBBIS;
	private BigDecimal JCBREP;
	private BigDecimal JCBDIZ;
	private BigDecimal JCBICP;
	private String JCBFII;
	private Integer JCBIPR;
	private BigDecimal JCBIPI;
	private BigDecimal JCTXR2;
	private BigDecimal JCBBTP;
	private String JCBFIP;
	private Integer JCBISS;
	private Integer JCTXR3;
	private Integer JCBBCS;
	private Integer JCBIRT;
	private Integer JCTXR4;
	private Integer JCBBCR;
	private Integer JCBIIT;
	private Integer JCTXR5;
	private Integer JCBBCI;
	private String JCANI;
	private String JCAID;
	private String JCOMCU;
	private String JCOBJ;
	private String JCSUB;
	private String JCSBLT;
	private String JCSBL;
	private String JCBINM;
	private BigInteger JCISSU;
	private Integer JCBNIV;
	private Integer JCPGNO;
	private String JCNXTR;
	private String JCLTTR;
	private String JCUSER;
	private String JCPID;
	private String JCJOBN;
	private BigInteger JCUPMJ;
	private Integer JCTDAY;
	private String JCCRCD;
	private Integer JCFTR;
	private String JCF1T;
	private Integer JCF2A;
	private String JCF2T;
	private BigInteger JCUSB1;
	private String JCFLD3;
	private String JCFLD4;
	private String JCURRF;
	private Integer JCURAB;
	private Integer JCURAT;
	private BigInteger JCURDT;
	private String JCURCD;
	private String JCURC1;
	private String JCURC2;
	private String JCBRNOP;
	private BigDecimal JCAN01;
	private BigDecimal JCVT01;
	private BigDecimal JCAN02;
	private BigDecimal JCVT02;
	private BigDecimal JCAN03;
	private String JCAA05;
	
	/*modificacao 30-08-17*/
	private String JCDL01;
	
	/*MODIFICACAO 24-04-18*/
	
	private String JCB76TSPIS;
	private String JCB76TSCOF;
	
	/*MODIFICAÇÃO 21-05-18*/
	private Integer JCWJOBS; 
	private String JCAA10;
	
	/*modificação 07-06-18*/
	private BigDecimal JCAN06;
	
	/*MODIFICACAO 11-06-18*/
	private BigDecimal JCVT06;
	private BigDecimal JCAN07;
	
	/*modificacoes 16-03-20 IGUALANDO A TABELA 81*/
//	private String JCEV24;
//	private String JCEV23;
//	private String JCEV22;
//	private String JCEV21;
//	private String JCEV20;
	//private String JCEV25;
	private BigDecimal JCAN04;
	private BigDecimal JCAN05;	
	private BigDecimal JCVT04;	
	
	/*invencoes do gilvan na quarentena*/
	private BigDecimal JCAN10;
	private BigDecimal JCAN12;
	private BigDecimal JCAN08;
	private BigDecimal JCAN11;
	private BigDecimal JCAN13;
	private BigDecimal JCAN09;
	private BigDecimal JCVT10;
	private BigDecimal JCVT12;
	private BigDecimal JCVT08;	
	
	
	public F55IJC71() {
		super();
	}

	public F55IJC71Id getId() {
		return id;
	}

	public void setId(F55IJC71Id id) {
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

	public Integer getJCUKID() {
		return JCUKID;
	}

	public void setJCUKID(Integer jCUKID) {
		JCUKID = jCUKID;
	}

	public String getJCSOS1() {
		return JCSOS1;
	}

	public void setJCSOS1(String jCSOS1) {
		JCSOS1 = jCSOS1;
	}

	public Integer getJCBNF0() {
		return JCBNF0;
	}

	public void setJCBNF0(Integer jCBNF0) {
		JCBNF0 = jCBNF0;
	}

	public String getJCBSR0() {
		return JCBSR0;
	}

	public void setJCBSR0(String jCBSR0) {
		JCBSR0 = jCBSR0;
	}

	public Integer getJCN002() {
		return JCN002;
	}

	public void setJCN002(Integer jCN002) {
		JCN002 = jCN002;
	}

	public String getJCBNFS() {
		return JCBNFS;
	}

	public void setJCBNFS(String jCBNFS) {
		JCBNFS = jCBNFS;
	}

	public String getJCOCTO() {
		return JCOCTO;
	}

	public void setJCOCTO(String jCOCTO) {
		JCOCTO = jCOCTO;
	}

	public String getJCMATC() {
		return JCMATC;
	}

	public void setJCMATC(String jCMATC) {
		JCMATC = jCMATC;
	}

	public Integer getJCDOCO() {
		return JCDOCO;
	}

	public void setJCDOCO(Integer jCDOCO) {
		JCDOCO = jCDOCO;
	}

	public String getJCPDCT() {
		return JCPDCT;
	}

	public void setJCPDCT(String jCPDCT) {
		JCPDCT = jCPDCT;
	}

	public String getJCKCOO() {
		return JCKCOO;
	}

	public void setJCKCOO(String jCKCOO) {
		JCKCOO = jCKCOO;
	}

	public String getJCSFXO() {
		return JCSFXO;
	}

	public void setJCSFXO(String jCSFXO) {
		JCSFXO = jCSFXO;
	}

	public Integer getJCLNID() {
		return JCLNID;
	}

	public void setJCLNID(Integer jCLNID) {
		JCLNID = jCLNID;
	}

	public Integer getJCNLIN() {
		return JCNLIN;
	}

	public void setJCNLIN(Integer jCNLIN) {
		JCNLIN = jCNLIN;
	}

	public Integer getJCDOC() {
		return JCDOC;
	}

	public void setJCDOC(Integer jCDOC) {
		JCDOC = jCDOC;
	}

	public String getJCDCTO() {
		return JCDCTO;
	}

	public void setJCDCTO(String jCDCTO) {
		JCDCTO = jCDCTO;
	}

	public String getJCCO() {
		return JCCO;
	}

	public void setJCCO(String jCCO) {
		JCCO = jCCO;
	}

	public String getJCFCO() {
		return JCFCO;
	}

	public void setJCFCO(String jCFCO) {
		JCFCO = jCFCO;
	}

	public Integer getJCITM() {
		return JCITM;
	}

	public void setJCITM(Integer jCITM) {
		JCITM = jCITM;
	}

	public String getJCLITM() {
		return JCLITM;
	}

	public void setJCLITM(String jCLITM) {
		JCLITM = jCLITM;
	}

	public String getJCAITM() {
		return JCAITM;
	}

	public void setJCAITM(String jCAITM) {
		JCAITM = jCAITM;
	}

	public String getJCCITM() {
		return JCCITM;
	}

	public void setJCCITM(String jCCITM) {
		JCCITM = jCCITM;
	}

	public String getJCMCU() {
		return JCMCU;
	}

	public void setJCMCU(String jCMCU) {
		JCMCU = jCMCU;
	}

	public String getJCLOCN() {
		return JCLOCN;
	}

	public void setJCLOCN(String jCLOCN) {
		JCLOCN = jCLOCN;
	}

	public String getJCLOTN() {
		return JCLOTN;
	}

	public void setJCLOTN(String jCLOTN) {
		JCLOTN = jCLOTN;
	}

	public String getJCDSC1() {
		return JCDSC1;
	}

	public void setJCDSC1(String jCDSC1) {
		JCDSC1 = jCDSC1;
	}

	public String getJCDSC2() {
		return JCDSC2;
	}

	public void setJCDSC2(String jCDSC2) {
		JCDSC2 = jCDSC2;
	}

	public String getJCLNTY() {
		return JCLNTY;
	}

	public void setJCLNTY(String jCLNTY) {
		JCLNTY = jCLNTY;
	}

	public String getJCUOM() {
		return JCUOM;
	}

	public void setJCUOM(String jCUOM) {
		JCUOM = jCUOM;
	}

	public BigDecimal getJCUORG() {
		return JCUORG;
	}

	public void setJCUORG(BigDecimal jCUORG) {
		JCUORG = jCUORG;
	}

	public String getJCUOM3() {
		return JCUOM3;
	}

	public void setJCUOM3(String jCUOM3) {
		JCUOM3 = jCUOM3;
	}

	public String getJCUOM4() {
		return JCUOM4;
	}

	public void setJCUOM4(String jCUOM4) {
		JCUOM4 = jCUOM4;
	}

	public BigDecimal getJCUPRC() {
		return JCUPRC;
	}

	public void setJCUPRC(BigDecimal jCUPRC) {
		JCUPRC = jCUPRC;
	}

	public BigDecimal getJCAEXP() {
		return JCAEXP;
	}

	public void setJCAEXP(BigDecimal jCAEXP) {
		JCAEXP = jCAEXP;
	}

	public BigDecimal getJCBDES() {
		return JCBDES;
	}

	public void setJCBDES(BigDecimal jCBDES) {
		JCBDES = jCBDES;
	}

	public String getJCGLC() {
		return JCGLC;
	}

	public void setJCGLC(String jCGLC) {
		JCGLC = jCGLC;
	}

	public Integer getJCSHAN() {
		return JCSHAN;
	}

	public void setJCSHAN(Integer jCSHAN) {
		JCSHAN = jCSHAN;
	}

	public Integer getJCAN8() {
		return JCAN8;
	}

	public void setJCAN8(Integer jCAN8) {
		JCAN8 = jCAN8;
	}

	public String getJCBCGT() {
		return JCBCGT;
	}

	public void setJCBCGT(String jCBCGT) {
		JCBCGT = jCBCGT;
	}

	public String getJCBCPT() {
		return JCBCPT;
	}

	public void setJCBCPT(String jCBCPT) {
		JCBCPT = jCBCPT;
	}

	public String getJCSHST() {
		return JCSHST;
	}

	public void setJCSHST(String jCSHST) {
		JCSHST = jCSHST;
	}

	public String getJCSHZP() {
		return JCSHZP;
	}

	public void setJCSHZP(String jCSHZP) {
		JCSHZP = jCSHZP;
	}

	public Integer getJCBSFH() {
		return JCBSFH;
	}

	public void setJCBSFH(Integer jCBSFH) {
		JCBSFH = jCBSFH;
	}

	public Integer getJCAN8V() {
		return JCAN8V;
	}

	public void setJCAN8V(Integer jCAN8V) {
		JCAN8V = jCAN8V;
	}

	public String getJCBCGF() {
		return JCBCGF;
	}

	public void setJCBCGF(String jCBCGF) {
		JCBCGF = jCBCGF;
	}

	public String getJCBCPF() {
		return JCBCPF;
	}

	public void setJCBCPF(String jCBCPF) {
		JCBCPF = jCBCPF;
	}

	public String getJCADDS() {
		return JCADDS;
	}

	public void setJCADDS(String jCADDS) {
		JCADDS = jCADDS;
	}

	public Integer getJCBNOP() {
		return JCBNOP;
	}

	public void setJCBNOP(Integer jCBNOP) {
		JCBNOP = jCBNOP;
	}

	public String getJCBSOP() {
		return JCBSOP;
	}

	public void setJCBSOP(String jCBSOP) {
		JCBSOP = jCBSOP;
	}

	public String getJCBDIP() {
		return JCBDIP;
	}

	public void setJCBDIP(String jCBDIP) {
		JCBDIP = jCBDIP;
	}

	public String getJCBCLF() {
		return JCBCLF;
	}

	public void setJCBCLF(String jCBCLF) {
		JCBCLF = jCBCLF;
	}

	public String getJCBCTF() {
		return JCBCTF;
	}

	public void setJCBCTF(String jCBCTF) {
		JCBCTF = jCBCTF;
	}

	public String getJCBIST() {
		return JCBIST;
	}

	public void setJCBIST(String jCBIST) {
		JCBIST = jCBIST;
	}

	public String getJCBORI() {
		return JCBORI;
	}

	public void setJCBORI(String jCBORI) {
		JCBORI = jCBORI;
	}

	public String getJCBCFC() {
		return JCBCFC;
	}

	public void setJCBCFC(String jCBCFC) {
		JCBCFC = jCBCFC;
	}

	public String getJCBSTT() {
		return JCBSTT;
	}

	public void setJCBSTT(String jCBSTT) {
		JCBSTT = jCBSTT;
	}

	public BigDecimal getJCBFRT() {
		return JCBFRT;
	}

	public void setJCBFRT(BigDecimal jCBFRT) {
		JCBFRT = jCBFRT;
	}

	public BigDecimal getJCBSEG() {
		return JCBSEG;
	}

	public void setJCBSEG(BigDecimal jCBSEG) {
		JCBSEG = jCBSEG;
	}

	public BigDecimal getJCBDFN() {
		return JCBDFN;
	}

	public void setJCBDFN(BigDecimal jCBDFN) {
		JCBDFN = jCBDFN;
	}

	public BigDecimal getJCBICM() {
		return JCBICM;
	}

	public void setJCBICM(BigDecimal jCBICM) {
		JCBICM = jCBICM;
	}

	public BigDecimal getJCTXR1() {
		return JCTXR1;
	}

	public void setJCTXR1(BigDecimal jCTXR1) {
		JCTXR1 = jCTXR1;
	}

	public BigDecimal getJCBBCL() {
		return JCBBCL;
	}

	public void setJCBBCL(BigDecimal jCBBCL) {
		JCBBCL = jCBBCL;
	}

	public BigDecimal getJCBBIR() {
		return JCBBIR;
	}

	public void setJCBBIR(BigDecimal jCBBIR) {
		JCBBIR = jCBBIR;
	}

	public BigDecimal getJCBVIS() {
		return JCBVIS;
	}

	public void setJCBVIS(BigDecimal jCBVIS) {
		JCBVIS = jCBVIS;
	}

	public BigDecimal getJCBBIS() {
		return JCBBIS;
	}

	public void setJCBBIS(BigDecimal jCBBIS) {
		JCBBIS = jCBBIS;
	}

	public BigDecimal getJCBREP() {
		return JCBREP;
	}

	public void setJCBREP(BigDecimal jCBREP) {
		JCBREP = jCBREP;
	}

	public BigDecimal getJCBDIZ() {
		return JCBDIZ;
	}

	public void setJCBDIZ(BigDecimal jCBDIZ) {
		JCBDIZ = jCBDIZ;
	}

	public BigDecimal getJCBICP() {
		return JCBICP;
	}

	public void setJCBICP(BigDecimal jCBICP) {
		JCBICP = jCBICP;
	}

	public String getJCBFII() {
		return JCBFII;
	}

	public void setJCBFII(String jCBFII) {
		JCBFII = jCBFII;
	}

	public Integer getJCBIPR() {
		return JCBIPR;
	}

	public void setJCBIPR(Integer jCBIPR) {
		JCBIPR = jCBIPR;
	}

	public BigDecimal getJCBIPI() {
		return JCBIPI;
	}

	public void setJCBIPI(BigDecimal jCBIPI) {
		JCBIPI = jCBIPI;
	}

	public BigDecimal getJCTXR2() {
		return JCTXR2;
	}

	public void setJCTXR2(BigDecimal jCTXR2) {
		JCTXR2 = jCTXR2;
	}

	public BigDecimal getJCBBTP() {
		return JCBBTP;
	}

	public void setJCBBTP(BigDecimal jCBBTP) {
		JCBBTP = jCBBTP;
	}

	public String getJCBFIP() {
		return JCBFIP;
	}

	public void setJCBFIP(String jCBFIP) {
		JCBFIP = jCBFIP;
	}

	public Integer getJCBISS() {
		return JCBISS;
	}

	public void setJCBISS(Integer jCBISS) {
		JCBISS = jCBISS;
	}

	public Integer getJCTXR3() {
		return JCTXR3;
	}

	public void setJCTXR3(Integer jCTXR3) {
		JCTXR3 = jCTXR3;
	}

	public Integer getJCBBCS() {
		return JCBBCS;
	}

	public void setJCBBCS(Integer jCBBCS) {
		JCBBCS = jCBBCS;
	}

	public Integer getJCBIRT() {
		return JCBIRT;
	}

	public void setJCBIRT(Integer jCBIRT) {
		JCBIRT = jCBIRT;
	}

	public Integer getJCTXR4() {
		return JCTXR4;
	}

	public void setJCTXR4(Integer jCTXR4) {
		JCTXR4 = jCTXR4;
	}

	public Integer getJCBBCR() {
		return JCBBCR;
	}

	public void setJCBBCR(Integer jCBBCR) {
		JCBBCR = jCBBCR;
	}

	public Integer getJCBIIT() {
		return JCBIIT;
	}

	public void setJCBIIT(Integer jCBIIT) {
		JCBIIT = jCBIIT;
	}

	public Integer getJCTXR5() {
		return JCTXR5;
	}

	public void setJCTXR5(Integer jCTXR5) {
		JCTXR5 = jCTXR5;
	}

	public Integer getJCBBCI() {
		return JCBBCI;
	}

	public void setJCBBCI(Integer jCBBCI) {
		JCBBCI = jCBBCI;
	}

	public String getJCANI() {
		return JCANI;
	}

	public void setJCANI(String jCANI) {
		JCANI = jCANI;
	}

	public String getJCAID() {
		return JCAID;
	}

	public void setJCAID(String jCAID) {
		JCAID = jCAID;
	}

	public String getJCOMCU() {
		return JCOMCU;
	}

	public void setJCOMCU(String jCOMCU) {
		JCOMCU = jCOMCU;
	}

	public String getJCOBJ() {
		return JCOBJ;
	}

	public void setJCOBJ(String jCOBJ) {
		JCOBJ = jCOBJ;
	}

	public String getJCSUB() {
		return JCSUB;
	}

	public void setJCSUB(String jCSUB) {
		JCSUB = jCSUB;
	}

	public String getJCSBLT() {
		return JCSBLT;
	}

	public void setJCSBLT(String jCSBLT) {
		JCSBLT = jCSBLT;
	}

	public String getJCSBL() {
		return JCSBL;
	}

	public void setJCSBL(String jCSBL) {
		JCSBL = jCSBL;
	}

	public String getJCBINM() {
		return JCBINM;
	}

	public void setJCBINM(String jCBINM) {
		JCBINM = jCBINM;
	}

	public BigInteger getJCISSU() {
		return JCISSU;
	}

	public void setJCISSU(BigInteger jCISSU) {
		JCISSU = jCISSU;
	}

	public Integer getJCBNIV() {
		return JCBNIV;
	}

	public void setJCBNIV(Integer jCBNIV) {
		JCBNIV = jCBNIV;
	}

	public Integer getJCPGNO() {
		return JCPGNO;
	}

	public void setJCPGNO(Integer jCPGNO) {
		JCPGNO = jCPGNO;
	}

	public String getJCNXTR() {
		return JCNXTR;
	}

	public void setJCNXTR(String jCNXTR) {
		JCNXTR = jCNXTR;
	}

	public String getJCLTTR() {
		return JCLTTR;
	}

	public void setJCLTTR(String jCLTTR) {
		JCLTTR = jCLTTR;
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

	public BigInteger getJCUPMJ() {
		return JCUPMJ;
	}

	public void setJCUPMJ(BigInteger jCUPMJ) {
		JCUPMJ = jCUPMJ;
	}

	public Integer getJCTDAY() {
		return JCTDAY;
	}

	public void setJCTDAY(Integer jCTDAY) {
		JCTDAY = jCTDAY;
	}

	public String getJCCRCD() {
		return JCCRCD;
	}

	public void setJCCRCD(String jCCRCD) {
		JCCRCD = jCCRCD;
	}

	public Integer getJCFTR() {
		return JCFTR;
	}

	public void setJCFTR(Integer jCFTR) {
		JCFTR = jCFTR;
	}

	public String getJCF1T() {
		return JCF1T;
	}

	public void setJCF1T(String jCF1T) {
		JCF1T = jCF1T;
	}

	public Integer getJCF2A() {
		return JCF2A;
	}

	public void setJCF2A(Integer jCF2A) {
		JCF2A = jCF2A;
	}

	public String getJCF2T() {
		return JCF2T;
	}

	public void setJCF2T(String jCF2T) {
		JCF2T = jCF2T;
	}

	public BigInteger getJCUSB1() {
		return JCUSB1;
	}

	public void setJCUSB1(BigInteger jCUSB1) {
		JCUSB1 = jCUSB1;
	}

	public String getJCFLD3() {
		return JCFLD3;
	}

	public void setJCFLD3(String jCFLD3) {
		JCFLD3 = jCFLD3;
	}

	public String getJCFLD4() {
		return JCFLD4;
	}

	public void setJCFLD4(String jCFLD4) {
		JCFLD4 = jCFLD4;
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

	public BigInteger getJCURDT() {
		return JCURDT;
	}

	public void setJCURDT(BigInteger jCURDT) {
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

	public String getJCBRNOP() {
		return JCBRNOP;
	}

	public void setJCBRNOP(String jCBRNOP) {
		JCBRNOP = jCBRNOP;
	}

	public BigDecimal getJCAN01() {
		return JCAN01;
	}

	public void setJCAN01(BigDecimal jCAN01) {
		JCAN01 = jCAN01;
	}

	public BigDecimal getJCVT01() {
		return JCVT01;
	}

	public void setJCVT01(BigDecimal jCVT01) {
		JCVT01 = jCVT01;
	}

	public BigDecimal getJCAN02() {
		return JCAN02;
	}

	public void setJCAN02(BigDecimal jCAN02) {
		JCAN02 = jCAN02;
	}

	public BigDecimal getJCVT02() {
		return JCVT02;
	}

	public void setJCVT02(BigDecimal jCVT02) {
		JCVT02 = jCVT02;
	}

	public BigDecimal getJCAN03() {
		return JCAN03;
	}

	public void setJCAN03(BigDecimal jCAN03) {
		JCAN03 = jCAN03;
	}

	public String getJCAA05() {
		return JCAA05;
	}

	public void setJCAA05(String jCAA05) {
		JCAA05 = jCAA05;
	}

	public String getJCDL01() {
		return JCDL01;
	}

	public void setJCDL01(String jCDL01) {
		JCDL01 = jCDL01;
	}
	
	public String getJCB76TSPIS() {
		return JCB76TSPIS;
	}

	public void setJCB76TSPIS(String jCB76TSPIS) {
		JCB76TSPIS = jCB76TSPIS;
	}

	public String getJCB76TSCOF() {
		return JCB76TSCOF;
	}

	public void setJCB76TSCOF(String jCB76TSCOF) {
		JCB76TSCOF = jCB76TSCOF;
	}

	public Integer getJCWJOBS() {
		return JCWJOBS;
	}

	public void setJCWJOBS(Integer jCWJOBS) {
		JCWJOBS = jCWJOBS;
	}

	public String getJCAA10() {
		return JCAA10;
	}

	public void setJCAA10(String jCAA10) {
		JCAA10 = jCAA10;
	}

	public BigDecimal getJCAN06() {
		return JCAN06;
	}

	public void setJCAN06(BigDecimal jCAN06) {
		JCAN06 = jCAN06;
	}

	public BigDecimal getJCVT06() {
		return JCVT06;
	}

	public void setJCVT06(BigDecimal jCVT06) {
		JCVT06 = jCVT06;
	}

	public BigDecimal getJCAN07() {
		return JCAN07;
	}

	public void setJCAN07(BigDecimal jCAN07) {
		JCAN07 = jCAN07;
	}

	public BigDecimal getJCAN10() {
		return JCAN10;
	}

	public void setJCAN10(BigDecimal jCAN10) {
		JCAN10 = jCAN10;
	}

	public BigDecimal getJCAN12() {
		return JCAN12;
	}

	public void setJCAN12(BigDecimal jCAN12) {
		JCAN12 = jCAN12;
	}

	public BigDecimal getJCAN08() {
		return JCAN08;
	}

	public void setJCAN08(BigDecimal jCAN08) {
		JCAN08 = jCAN08;
	}

	public BigDecimal getJCAN11() {
		return JCAN11;
	}

	public void setJCAN11(BigDecimal jCAN11) {
		JCAN11 = jCAN11;
	}

	public BigDecimal getJCAN13() {
		return JCAN13;
	}

	public void setJCAN13(BigDecimal jCAN13) {
		JCAN13 = jCAN13;
	}

	public BigDecimal getJCAN09() {
		return JCAN09;
	}

	public void setJCAN09(BigDecimal jCAN09) {
		JCAN09 = jCAN09;
	}

	public BigDecimal getJCVT10() {
		return JCVT10;
	}

	public void setJCVT10(BigDecimal jCVT10) {
		JCVT10 = jCVT10;
	}

	public BigDecimal getJCVT12() {
		return JCVT12;
	}

	public void setJCVT12(BigDecimal jCVT12) {
		JCVT12 = jCVT12;
	}

	public BigDecimal getJCVT08() {
		return JCVT08;
	}

	public void setJCVT08(BigDecimal jCVT08) {
		JCVT08 = jCVT08;
	}

//	public String getJCEV24() {
//		return JCEV24;
//	}
//
//	public void setJCEV24(String jCEV24) {
//		JCEV24 = jCEV24;
//	}
//
//	public String getJCEV23() {
//		return JCEV23;
//	}
//
//	public void setJCEV23(String jCEV23) {
//		JCEV23 = jCEV23;
//	}
//
//	public String getJCEV22() {
//		return JCEV22;
//	}
//
//	public void setJCEV22(String jCEV22) {
//		JCEV22 = jCEV22;
//	}
//
//	public String getJCEV21() {
//		return JCEV21;
//	}
//
//	public void setJCEV21(String jCEV21) {
//		JCEV21 = jCEV21;
//	}
//
//	public String getJCEV20() {
//		return JCEV20;
//	}
//
//	public void setJCEV20(String jCEV20) {
//		JCEV20 = jCEV20;
//	}

	/*
	public String getJCEV25() {
		return JCEV25;
	}

	public void setJCEV25(String jCEV25) {
		JCEV25 = jCEV25;
	}
	*/
	
	public BigDecimal getJCAN04() {
		return JCAN04;
	}

	public void setJCAN04(BigDecimal jCAN04) {
		JCAN04 = jCAN04;
	}

	public BigDecimal getJCAN05() {
		return JCAN05;
	}

	public void setJCAN05(BigDecimal jCAN05) {
		JCAN05 = jCAN05;
	}

	public BigDecimal getJCVT04() {
		return JCVT04;
	}

	public void setJCVT04(BigDecimal jCVT04) {
		JCVT04 = jCVT04;
	}

	
	
	
	
	

}
