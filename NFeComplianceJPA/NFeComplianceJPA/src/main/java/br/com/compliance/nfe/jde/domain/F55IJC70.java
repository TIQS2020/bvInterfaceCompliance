package br.com.compliance.nfe.jde.domain;

import java.math.BigDecimal;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class F55IJC70 {

	@EmbeddedId
	private F55IJC70Id id;

	private Integer JCBNNF;
	private String JCBSER;
	private Integer JCN001;
	private String JCDCT;
	private Integer JCWJOBS;
	//private String JCA2ST;
	private Integer JCBNF0;
	private String JCBSR0;
	private Integer JCN002;
	private String JCBNFS;
	private String JCOCTO;
	private String JCMCU;
	private String JCCO;
	private String JCFCO;
	private Integer JCSHAN;
	private Integer JCAN8;
	private String JCBCGT;
	private String JCBCPT;
	private String JCSHST;
	private String JCSHZP;
	private String JCVR01;
	private Integer JCAN8V;
	private String JCBCGF;
	private String JCBCPF;
	private String JCADDS;
	private BigDecimal JCBFRT;
	private BigDecimal JCBSEG;
	private BigDecimal JCBDFN;
	private BigDecimal JCBDES;
	private Integer JCBVTM;
	private BigDecimal JCGDVL;
	private BigDecimal JCBVTN;
	private BigDecimal JCBICM;
	private BigDecimal JCBBCL;
	private BigDecimal JCBVIS;
	private BigDecimal JCBBIS;
	private Integer JCBREP;
	private Integer JCBDIZ;
	private Integer JCBVII;
	private Integer JCBVOI;
	private BigDecimal JCBIPI;
	private Integer JCBBTP;
	private Integer JCBVOP;
	private Integer JCBVIP;
	private Integer JCBISS;
	private Integer JCBBCS;
	private Integer JCBIRT;
	private Integer JCBBCR;
	private BigDecimal JCBIIT;
	private Integer JCBBCI;
	private Integer JCIRRI;
	private String JCISSU;
	private BigDecimal JCSHPJ;
	private BigDecimal JCADDJ;
	private BigDecimal JCCNDJ;
	private Integer JCDETM;
	private String JCBINM;
	private Integer JCLNID;
	private Integer JCANCR;
	private String JCBCGC;
	private String JCCRTY;
	private String JCFRTH;
	private String JCLICP;
	private String JCSTCD;
	private BigDecimal JCTOQN;
	private String JCEQUP;
	private String JCR2;
	private String JCREF;
	private BigDecimal JCITWT;
	private BigDecimal JCTOWT;
	private String JCBD01;
	private Integer JCAA1;
	private String JCBD02;
	private Integer JCAA2;
	private String JCBD03;
	private String JCBD04;
	private Integer JCBVLF;
	private String JCUSER;
	private String JCPID;
	private String JCJOBN;
	private String JCUPMJ;
	private Integer JCTDAY;
	private Integer JCBBIR;
	private Integer JCBIPR;
	private String JCCRCD;
	private Integer JCFTR;
	private String JCF1T;
	private BigDecimal JCUSB1;
	private String JCURRF;
	private Integer JCURAB;
	private Integer JCURAT;
	private BigDecimal JCURDT;
	private String JCURCD;
	private Integer JCBSFH;
	private String JCURC1;
	private String JCURC2;
	private Integer JCDEJ;
	private String JCAA10;
	private String JCWTXT;
	private Integer JCUK01;
	private String JCID1;
	private String JCA201;
	private String JCAA02;
	private String JCEV01;
	private String JCEV02;
	private String JCEV03;
	private String JCEV04;
	private String JCEV05;
	private String JCEV06;
	private String JCEV07;
	private String JCEV08;
	private String JCEV09;
	private String JCEV10;
	private String JCEV11;
	private String JCEV12;
	private String JCEV13;
	private String JCEV14;
	private String JCEV15;
	private BigDecimal JCAN01;
	private BigDecimal JCAN02;
	private String JCAA07;
	private Long JCUK02;
	private Integer JCBRNFDE;
	private BigDecimal JCCAND;
	private String JCDTA1;
	private String JCA203;
	private String JCA204;
	
	/*MODIFICAÇÃO LINDEM 14/07*/	
	private String JCB76AKEY;
	
	/*modificação duarte modelo fiscal*/
	private String JCB76MOTY;
	
	/*Modificação para novo campo de série de NF Eletrônica (3 char)*/
	private String JCB76SNF;
	
	/*Modificação para novo campo de número de NF Eletrônica (3 char)*/
	private Integer JCBRPB;
	
	/*TODO: ADEQUAÇÃO BLOCOS TABELA DE CONTROLE 7-2-2018*/
	private String JCBEGDATE;
	private String JCENDDATE;	 
	
	public F55IJC70() {
		super();
	}

	public F55IJC70Id getId() {
		return id;
	}

	public void setId(F55IJC70Id id) {
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

	public Integer getJCWJOBS() {
		return JCWJOBS;
	}

	public void setJCWJOBS(Integer jCWJOBS) {
		JCWJOBS = jCWJOBS;
	}

	/*
	public String getJCA2ST() {
		return JCA2ST;
	}

	public void setJCA2ST(String jCA2ST) {
		JCA2ST = jCA2ST;
	}
	*/
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

	public String getJCMCU() {
		return JCMCU;
	}

	public void setJCMCU(String jCMCU) {
		JCMCU = jCMCU;
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

	public String getJCVR01() {
		return JCVR01;
	}

	public void setJCVR01(String jCVR01) {
		JCVR01 = jCVR01;
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

	public BigDecimal getJCBDES() {
		return JCBDES;
	}

	public void setJCBDES(BigDecimal jCBDES) {
		JCBDES = jCBDES;
	}

	public Integer getJCBVTM() {
		return JCBVTM;
	}

	public void setJCBVTM(Integer jCBVTM) {
		JCBVTM = jCBVTM;
	}

	public BigDecimal getJCGDVL() {
		return JCGDVL;
	}

	public void setJCGDVL(BigDecimal jCGDVL) {
		JCGDVL = jCGDVL;
	}

	public BigDecimal getJCBVTN() {
		return JCBVTN;
	}

	public void setJCBVTN(BigDecimal jCBVTN) {
		JCBVTN = jCBVTN;
	}

	public BigDecimal getJCBICM() {
		return JCBICM;
	}

	public void setJCBICM(BigDecimal jCBICM) {
		JCBICM = jCBICM;
	}

	public BigDecimal getJCBBCL() {
		return JCBBCL;
	}

	public void setJCBBCL(BigDecimal jCBBCL) {
		JCBBCL = jCBBCL;
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

	public Integer getJCBREP() {
		return JCBREP;
	}

	public void setJCBREP(Integer jCBREP) {
		JCBREP = jCBREP;
	}

	public Integer getJCBDIZ() {
		return JCBDIZ;
	}

	public void setJCBDIZ(Integer jCBDIZ) {
		JCBDIZ = jCBDIZ;
	}

	public Integer getJCBVII() {
		return JCBVII;
	}

	public void setJCBVII(Integer jCBVII) {
		JCBVII = jCBVII;
	}

	public Integer getJCBVOI() {
		return JCBVOI;
	}

	public void setJCBVOI(Integer jCBVOI) {
		JCBVOI = jCBVOI;
	}

	public BigDecimal getJCBIPI() {
		return JCBIPI;
	}

	public void setJCBIPI(BigDecimal jCBIPI) {
		JCBIPI = jCBIPI;
	}

	public Integer getJCBBTP() {
		return JCBBTP;
	}

	public void setJCBBTP(Integer jCBBTP) {
		JCBBTP = jCBBTP;
	}

	public Integer getJCBVOP() {
		return JCBVOP;
	}

	public void setJCBVOP(Integer jCBVOP) {
		JCBVOP = jCBVOP;
	}

	public Integer getJCBVIP() {
		return JCBVIP;
	}

	public void setJCBVIP(Integer jCBVIP) {
		JCBVIP = jCBVIP;
	}

	public Integer getJCBISS() {
		return JCBISS;
	}

	public void setJCBISS(Integer jCBISS) {
		JCBISS = jCBISS;
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

	public Integer getJCBBCR() {
		return JCBBCR;
	}

	public void setJCBBCR(Integer jCBBCR) {
		JCBBCR = jCBBCR;
	}

	public BigDecimal getJCBIIT() {
		return JCBIIT;
	}

	public void setJCBIIT(BigDecimal jCBIIT) {
		JCBIIT = jCBIIT;
	}

	public Integer getJCBBCI() {
		return JCBBCI;
	}

	public void setJCBBCI(Integer jCBBCI) {
		JCBBCI = jCBBCI;
	}

	public Integer getJCIRRI() {
		return JCIRRI;
	}

	public void setJCIRRI(Integer jCIRRI) {
		JCIRRI = jCIRRI;
	}

	public String getJCISSU() {
		return JCISSU;
	}

	public void setJCISSU(String jCISSU) {
		JCISSU = jCISSU;
	}

	public BigDecimal getJCSHPJ() {
		return JCSHPJ;
	}

	public void setJCSHPJ(BigDecimal jCSHPJ) {
		JCSHPJ = jCSHPJ;
	}

	public BigDecimal getJCADDJ() {
		return JCADDJ;
	}

	public void setJCADDJ(BigDecimal jCADDJ) {
		JCADDJ = jCADDJ;
	}

	public BigDecimal getJCCNDJ() {
		return JCCNDJ;
	}

	public void setJCCNDJ(BigDecimal jCCNDJ) {
		JCCNDJ = jCCNDJ;
	}

	public Integer getJCDETM() {
		return JCDETM;
	}

	public void setJCDETM(Integer jCDETM) {
		JCDETM = jCDETM;
	}

	public String getJCBINM() {
		return JCBINM;
	}

	public void setJCBINM(String jCBINM) {
		JCBINM = jCBINM;
	}

	public Integer getJCLNID() {
		return JCLNID;
	}

	public void setJCLNID(Integer jCLNID) {
		JCLNID = jCLNID;
	}

	public Integer getJCANCR() {
		return JCANCR;
	}

	public void setJCANCR(Integer jCANCR) {
		JCANCR = jCANCR;
	}

	public String getJCBCGC() {
		return JCBCGC;
	}

	public void setJCBCGC(String jCBCGC) {
		JCBCGC = jCBCGC;
	}

	public String getJCCRTY() {
		return JCCRTY;
	}

	public void setJCCRTY(String jCCRTY) {
		JCCRTY = jCCRTY;
	}

	public String getJCFRTH() {
		return JCFRTH;
	}

	public void setJCFRTH(String jCFRTH) {
		JCFRTH = jCFRTH;
	}

	public String getJCLICP() {
		return JCLICP;
	}

	public void setJCLICP(String jCLICP) {
		JCLICP = jCLICP;
	}

	public String getJCSTCD() {
		return JCSTCD;
	}

	public void setJCSTCD(String jCSTCD) {
		JCSTCD = jCSTCD;
	}

	public BigDecimal getJCTOQN() {
		return JCTOQN;
	}

	public void setJCTOQN(BigDecimal jCTOQN) {
		JCTOQN = jCTOQN;
	}

	public String getJCEQUP() {
		return JCEQUP;
	}

	public void setJCEQUP(String jCEQUP) {
		JCEQUP = jCEQUP;
	}

	public String getJCR2() {
		return JCR2;
	}

	public void setJCR2(String jCR2) {
		JCR2 = jCR2;
	}

	public String getJCREF() {
		return JCREF;
	}

	public void setJCREF(String jCREF) {
		JCREF = jCREF;
	}

	public BigDecimal getJCITWT() {
		return JCITWT;
	}

	public void setJCITWT(BigDecimal jCITWT) {
		JCITWT = jCITWT;
	}

	public BigDecimal getJCTOWT() {
		return JCTOWT;
	}

	public void setJCTOWT(BigDecimal jCTOWT) {
		JCTOWT = jCTOWT;
	}

	public String getJCBD01() {
		return JCBD01;
	}

	public void setJCBD01(String jCBD01) {
		JCBD01 = jCBD01;
	}

	public Integer getJCAA1() {
		return JCAA1;
	}

	public void setJCAA1(Integer jCAA1) {
		JCAA1 = jCAA1;
	}

	public String getJCBD02() {
		return JCBD02;
	}

	public void setJCBD02(String jCBD02) {
		JCBD02 = jCBD02;
	}

	public Integer getJCAA2() {
		return JCAA2;
	}

	public void setJCAA2(Integer jCAA2) {
		JCAA2 = jCAA2;
	}

	public String getJCBD03() {
		return JCBD03;
	}

	public void setJCBD03(String jCBD03) {
		JCBD03 = jCBD03;
	}

	public String getJCBD04() {
		return JCBD04;
	}

	public void setJCBD04(String jCBD04) {
		JCBD04 = jCBD04;
	}

	public Integer getJCBVLF() {
		return JCBVLF;
	}

	public void setJCBVLF(Integer jCBVLF) {
		JCBVLF = jCBVLF;
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

	public Integer getJCBBIR() {
		return JCBBIR;
	}

	public void setJCBBIR(Integer jCBBIR) {
		JCBBIR = jCBBIR;
	}

	public Integer getJCBIPR() {
		return JCBIPR;
	}

	public void setJCBIPR(Integer jCBIPR) {
		JCBIPR = jCBIPR;
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

	public BigDecimal getJCUSB1() {
		return JCUSB1;
	}

	public void setJCUSB1(BigDecimal jCUSB1) {
		JCUSB1 = jCUSB1;
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

	public Integer getJCBSFH() {
		return JCBSFH;
	}

	public void setJCBSFH(Integer jCBSFH) {
		JCBSFH = jCBSFH;
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

	public String getJCAA10() {
		return JCAA10;
	}

	public void setJCAA10(String jCAA10) {
		JCAA10 = jCAA10;
	}

	public String getJCWTXT() {
		return JCWTXT;
	}

	public void setJCWTXT(String jCWTXT) {
		JCWTXT = jCWTXT;
	}

	public Integer getJCUK01() {
		return JCUK01;
	}

	public void setJCUK01(Integer jCUK01) {
		JCUK01 = jCUK01;
	}

	public String getJCID1() {
		return JCID1;
	}

	public void setJCID1(String jCID1) {
		JCID1 = jCID1;
	}

	public String getJCA201() {
		return JCA201;
	}

	public void setJCA201(String jCA201) {
		JCA201 = jCA201;
	}

	public String getJCAA02() {
		return JCAA02;
	}

	public void setJCAA02(String jCAA02) {
		JCAA02 = jCAA02;
	}

	public String getJCEV01() {
		return JCEV01;
	}

	public void setJCEV01(String jCEV01) {
		JCEV01 = jCEV01;
	}

	public String getJCEV02() {
		return JCEV02;
	}

	public void setJCEV02(String jCEV02) {
		JCEV02 = jCEV02;
	}

	public String getJCEV03() {
		return JCEV03;
	}

	public void setJCEV03(String jCEV03) {
		JCEV03 = jCEV03;
	}

	public String getJCEV04() {
		return JCEV04;
	}

	public void setJCEV04(String jCEV04) {
		JCEV04 = jCEV04;
	}

	public String getJCEV05() {
		return JCEV05;
	}

	public void setJCEV05(String jCEV05) {
		JCEV05 = jCEV05;
	}

	public String getJCEV06() {
		return JCEV06;
	}

	public void setJCEV06(String jCEV06) {
		JCEV06 = jCEV06;
	}

	public String getJCEV07() {
		return JCEV07;
	}

	public void setJCEV07(String jCEV07) {
		JCEV07 = jCEV07;
	}

	public String getJCEV08() {
		return JCEV08;
	}

	public void setJCEV08(String jCEV08) {
		JCEV08 = jCEV08;
	}

	public String getJCEV09() {
		return JCEV09;
	}

	public void setJCEV09(String jCEV09) {
		JCEV09 = jCEV09;
	}

	public String getJCEV10() {
		return JCEV10;
	}

	public void setJCEV10(String jCEV10) {
		JCEV10 = jCEV10;
	}

	public String getJCEV11() {
		return JCEV11;
	}

	public void setJCEV11(String jCEV11) {
		JCEV11 = jCEV11;
	}

	public String getJCEV12() {
		return JCEV12;
	}

	public void setJCEV12(String jCEV12) {
		JCEV12 = jCEV12;
	}

	public String getJCEV13() {
		return JCEV13;
	}

	public void setJCEV13(String jCEV13) {
		JCEV13 = jCEV13;
	}

	public String getJCEV14() {
		return JCEV14;
	}

	public void setJCEV14(String jCEV14) {
		JCEV14 = jCEV14;
	}

	public String getJCEV15() {
		return JCEV15;
	}

	public void setJCEV15(String jCEV15) {
		JCEV15 = jCEV15;
	}

	public BigDecimal getJCAN01() {
		return JCAN01;
	}

	public void setJCAN01(BigDecimal jCAN01) {
		JCAN01 = jCAN01;
	}

	public BigDecimal getJCAN02() {
		return JCAN02;
	}

	public void setJCAN02(BigDecimal jCAN02) {
		JCAN02 = jCAN02;
	}

	public String getJCAA07() {
		return JCAA07;
	}

	public void setJCAA07(String jCAA07) {
		JCAA07 = jCAA07;
	}

	public Long getJCUK02() {
		return JCUK02;
	}

	public void setJCUK02(Long jCUK02) {
		JCUK02 = jCUK02;
	}

	public BigDecimal getJCCAND() {
		return JCCAND;
	}

	public void setJCCAND(BigDecimal jCCAND) {
		JCCAND = jCCAND;
	}

	public String getJCDTA1() {
		return JCDTA1;
	}

	public void setJCDTA1(String jCDTA1) {
		JCDTA1 = jCDTA1;
	}

	public String getJCA203() {
		return JCA203;
	}

	public void setJCA203(String jCA203) {
		JCA203 = jCA203;
	}

	public String getJCA204() {
		return JCA204;
	}

	public void setJCA204(String jCA204) {
		JCA204 = jCA204;
	}

	public Integer getJCN001() {
		return JCN001;
	}

	public void setJCN001(Integer jCN001) {
		JCN001 = jCN001;
	}

	public Integer getJCDEJ() {
		return JCDEJ;
	}

	public void setJCDEJ(Integer jCDEJ) {
		JCDEJ = jCDEJ;
	}

	public Integer getJCBRNFDE() {
		return JCBRNFDE;
	}

	public void setJCBRNFDE(Integer jCBRNFDE) {
		JCBRNFDE = jCBRNFDE;
	}

	public String getJCB76AKEY() {
		return JCB76AKEY;
	}

	public void setJCB76AKEY(String jCB76AKEY) {
		JCB76AKEY = jCB76AKEY;
	}

	public String getJCB76MOTY() {
		return JCB76MOTY;
	}

	public void setJCB76MOTY(String jCB76MOTY) {
		JCB76MOTY = jCB76MOTY;
	}

	public String getJCB76SNF() {
		return JCB76SNF;
	}

	public void setJCB76SNF(String jCB76SNF) {
		JCB76SNF = jCB76SNF;
	}

	public Integer getJCBRPB() {
		return JCBRPB;
	}

	public void setJCBRPB(Integer jCBRPB) {
		JCBRPB = jCBRPB;
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
	
	@Override
	public String toString() {
		return "[NOTA = " + JCBNNF + "]";
	}
	

}
