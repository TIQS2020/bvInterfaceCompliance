package br.com.compliance.nfe.jde.domain;

import java.math.BigDecimal;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

/*F55JC80 - IJC - NFe Header*/
@Entity
public class F55IJC80 {

	/* Classe chave */
	@EmbeddedId
	private F55IJC80Id id;

	/* campos chave */
	private Integer JCBNNF;
	private String JCBSER;
	private Integer JCN001;
	private String JCDCT;
	/* chave */
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
	private Integer JCBSFH;
	private Integer JCAN8V;
	private String JCBCGF;
	private String JCBCPF;
	private String JCADDS;
	private BigDecimal JCBFRT;
	private BigDecimal JCBSEG;
	private BigDecimal JCBDFN;
	private BigDecimal JCBDES;
	private BigDecimal JCBVTM;
	private BigDecimal JCGDVL;
	private BigDecimal JCBVTN;
	private BigDecimal JCBICM;
	private BigDecimal JCBBCL;
	private BigDecimal JCBVIS;
	private BigDecimal JCBBIS;
	private BigDecimal JCBREP;
	private BigDecimal JCBDIZ;
	private BigDecimal JCBVII;
	private BigDecimal JCBVOI;
	private BigDecimal JCBIPI;
	private BigDecimal JCBBTP;
	private BigDecimal JCBVOP;
	private BigDecimal JCBVIP;
	private BigDecimal JCBISS;
	private BigDecimal JCBBCS;
	private BigDecimal JCBIRT;
	private BigDecimal JCBBCR;
	private BigDecimal JCBIIT;
	private BigDecimal JCBBCI;
	private BigDecimal JCIRRI;
	private String JCISSU;
	private String JCSHPJ;
	private String JCADDJ;
	private String JCCNDJ;
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
	private BigDecimal JCAA1;
	private String JCBD02;
	private BigDecimal JCAA2;
	private String JCBD03;
	private String JCBD04;
	private BigDecimal JCBVLF;
	private String JCUSER;
	private String JCPID;
	private String JCJOBN;
	private String JCUPMJ;
	private Long JCTDAY;
	private BigDecimal JCBBIR;
	private BigDecimal JCBIPR;
	private String JCCRCD;
	private BigDecimal JCFTR;
	private String JCF1T;
	private String JCUSB1;
	private String JCURRF;
	private Long JCURAB;
	private BigDecimal JCURAT;
	private String JCURDT;
	private String JCURCD;
	private String JCURC1;
	private String JCURC2;

	/* novos campos 16-12-15 */
	private Integer JCDEJ;
	private String JCEV08;
	private String JCEV09;

	/* novos campos 03/02/16 */
	private String JCAA10;
	private String JCWTXT;
	private String JCEV01;
	private String JCEV03;
	private Integer JCUK01;
	private String JCAA02;
	private String JCEV04;
	private String JCEV05;
	private String JCEV06;
	private String JCEV02;
	private String JCEV07;
	private String JCID1;
	private String JCA201;
	private BigDecimal JCAN01;
	private BigDecimal JCAN02;
	private String JCEV11;
	private String JCEV12;
	private String JCAA07;

	private String JCEV14;
	private String JCEV15;
	private String JCEV16;
	private String JCEV17;
	private Long JCUK02;
	private Integer JCBRNFDE;

	private Integer JCCAND; // data cancelamento
	private String JCDTA1; // justificativa

	private String JCA203;

	/* NFE 4.0 */
	private BigDecimal JCAG2;

	/* NT 2019.1 */
	private BigDecimal JCAAMT1;

	private String JCADSD;
	private String JCCDCID;
	private String JCA202;	
	private String JCLEG;
	private String JCBISC;
	private String JCERN;
	private String JCATRD;
	
	/*modificacao 16-03-20*/
	private String JCB76ERN;
	
	/*Caampo de mensagem de lote rejeitado*/
	private String JCAPTA;

	public String getJCA201() {
		return JCA201;
	}

	public void setJCA201(String jCA201) {
		JCA201 = jCA201;
	}

	public F55IJC80() {
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

	public BigDecimal getJCBVTM() {
		return JCBVTM;
	}

	public void setJCBVTM(BigDecimal jCBVTM) {
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

	public BigDecimal getJCBVII() {
		return JCBVII;
	}

	public void setJCBVII(BigDecimal jCBVII) {
		JCBVII = jCBVII;
	}

	public BigDecimal getJCBVOI() {
		return JCBVOI;
	}

	public void setJCBVOI(BigDecimal jCBVOI) {
		JCBVOI = jCBVOI;
	}

	public BigDecimal getJCBIPI() {
		return JCBIPI;
	}

	public void setJCBIPI(BigDecimal jCBIPI) {
		JCBIPI = jCBIPI;
	}

	public BigDecimal getJCBBTP() {
		return JCBBTP;
	}

	public void setJCBBTP(BigDecimal jCBBTP) {
		JCBBTP = jCBBTP;
	}

	public BigDecimal getJCBVOP() {
		return JCBVOP;
	}

	public void setJCBVOP(BigDecimal jCBVOP) {
		JCBVOP = jCBVOP;
	}

	public BigDecimal getJCBVIP() {
		return JCBVIP;
	}

	public void setJCBVIP(BigDecimal jCBVIP) {
		JCBVIP = jCBVIP;
	}

	public BigDecimal getJCBISS() {
		return JCBISS;
	}

	public void setJCBISS(BigDecimal jCBISS) {
		JCBISS = jCBISS;
	}

	public BigDecimal getJCBBCS() {
		return JCBBCS;
	}

	public void setJCBBCS(BigDecimal jCBBCS) {
		JCBBCS = jCBBCS;
	}

	public BigDecimal getJCBIRT() {
		return JCBIRT;
	}

	public void setJCBIRT(BigDecimal jCBIRT) {
		JCBIRT = jCBIRT;
	}

	public BigDecimal getJCBBCR() {
		return JCBBCR;
	}

	public void setJCBBCR(BigDecimal jCBBCR) {
		JCBBCR = jCBBCR;
	}

	public BigDecimal getJCBIIT() {
		return JCBIIT;
	}

	public void setJCBIIT(BigDecimal jCBIIT) {
		JCBIIT = jCBIIT;
	}

	public BigDecimal getJCBBCI() {
		return JCBBCI;
	}

	public void setJCBBCI(BigDecimal jCBBCI) {
		JCBBCI = jCBBCI;
	}

	public BigDecimal getJCIRRI() {
		return JCIRRI;
	}

	public void setJCIRRI(BigDecimal jCIRRI) {
		JCIRRI = jCIRRI;
	}

	public String getJCISSU() {
		return JCISSU;
	}

	public void setJCISSU(String jCISSU) {
		JCISSU = jCISSU;
	}

	public String getJCSHPJ() {
		return JCSHPJ;
	}

	public void setJCSHPJ(String jCSHPJ) {
		JCSHPJ = jCSHPJ;
	}

	public String getJCADDJ() {
		return JCADDJ;
	}

	public void setJCADDJ(String jCADDJ) {
		JCADDJ = jCADDJ;
	}

	public String getJCCNDJ() {
		return JCCNDJ;
	}

	public void setJCCNDJ(String jCCNDJ) {
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

	public BigDecimal getJCAA1() {
		return JCAA1;
	}

	public void setJCAA1(BigDecimal jCAA1) {
		JCAA1 = jCAA1;
	}

	public String getJCBD02() {
		return JCBD02;
	}

	public void setJCBD02(String jCBD02) {
		JCBD02 = jCBD02;
	}

	public BigDecimal getJCAA2() {
		return JCAA2;
	}

	public void setJCAA2(BigDecimal jCAA2) {
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

	public BigDecimal getJCBVLF() {
		return JCBVLF;
	}

	public void setJCBVLF(BigDecimal jCBVLF) {
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

	public Long getJCTDAY() {
		return JCTDAY;
	}

	public void setJCTDAY(Long jCTDAY) {
		JCTDAY = jCTDAY;
	}

	public BigDecimal getJCBBIR() {
		return JCBBIR;
	}

	public void setJCBBIR(BigDecimal jCBBIR) {
		JCBBIR = jCBBIR;
	}

	public BigDecimal getJCBIPR() {
		return JCBIPR;
	}

	public void setJCBIPR(BigDecimal jCBIPR) {
		JCBIPR = jCBIPR;
	}

	public String getJCCRCD() {
		return JCCRCD;
	}

	public void setJCCRCD(String jCCRCD) {
		JCCRCD = jCCRCD;
	}

	public BigDecimal getJCFTR() {
		return JCFTR;
	}

	public void setJCFTR(BigDecimal jCFTR) {
		JCFTR = jCFTR;
	}

	public String getJCF1T() {
		return JCF1T;
	}

	public void setJCF1T(String jCF1T) {
		JCF1T = jCF1T;
	}

	public String getJCUSB1() {
		return JCUSB1;
	}

	public void setJCUSB1(String jCUSB1) {
		JCUSB1 = jCUSB1;
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

	public Integer getJCDEJ() {
		return JCDEJ;
	}

	public void setJCDEJ(Integer jCDEJ) {
		JCDEJ = jCDEJ;
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

	public String getJCEV01() {
		return JCEV01;
	}

	public void setJCEV01(String jCEV01) {
		JCEV01 = jCEV01;
	}

	public String getJCEV03() {
		return JCEV03;
	}

	public void setJCEV03(String jCEV03) {
		JCEV03 = jCEV03;
	}

	public Integer getJCUK01() {
		return JCUK01;
	}

	public void setJCUK01(Integer jCUK01) {
		JCUK01 = jCUK01;
	}

	public String getJCAA02() {
		return JCAA02;
	}

	public void setJCAA02(String jCAA02) {
		JCAA02 = jCAA02;
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

	public String getJCEV02() {
		return JCEV02;
	}

	public void setJCEV02(String jCEV02) {
		JCEV02 = jCEV02;
	}

	public String getJCEV07() {
		return JCEV07;
	}

	public void setJCEV07(String jCEV07) {
		JCEV07 = jCEV07;
	}

	public String getJCID1() {
		return JCID1;
	}

	public void setJCID1(String jCID1) {
		JCID1 = jCID1;
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

	public String getJCAA07() {
		return JCAA07;
	}

	public void setJCAA07(String jCAA07) {
		JCAA07 = jCAA07;
	}

	public String getJCEV15() {
		return JCEV15;
	}

	public void setJCEV15(String jCEV15) {
		JCEV15 = jCEV15;
	}

	public String getJCEV16() {
		return JCEV16;
	}

	public void setJCEV16(String jCEV16) {
		JCEV16 = jCEV16;
	}
	
	public String getJCEV17() {
		return JCEV17;
	}

	public void setJCEV17(String jCEV17) {
		JCEV17 = jCEV17;
	}

	public Long getJCUK02() {
		return JCUK02;
	}

	public void setJCUK02(Long jCUK02) {
		JCUK02 = jCUK02;
	}

	public Integer getJCBRNFDE() {
		return JCBRNFDE;
	}

	public void setJCBRNFDE(Integer jCBRNFDE) {
		JCBRNFDE = jCBRNFDE;
	}

	public String getJCEV14() {
		return JCEV14;
	}

	public void setJCEV14(String jCEV14) {
		JCEV14 = jCEV14;
	}

	public Integer getJCCAND() {
		return JCCAND;
	}

	public void setJCCAND(Integer jCCAND) {
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

	public BigDecimal getJCAG2() {
		return JCAG2;
	}

	public void setJCAG2(BigDecimal jCAG2) {
		JCAG2 = jCAG2;
	}

	public BigDecimal getJCAAMT1() {
		return JCAAMT1;
	}

	public void setJCAAMT1(BigDecimal jCAAMT1) {
		JCAAMT1 = jCAAMT1;
	}

	public String getJCADSD() {
		return JCADSD;
	}

	public void setJCADSD(String jCADSD) {
		JCADSD = jCADSD;
	}

	public String getJCCDCID() {
		return JCCDCID;
	}

	public void setJCCDCID(String jCCDCID) {
		JCCDCID = jCCDCID;
	}

	public String getJCA202() {
		return JCA202;
	}

	public void setJCA202(String jCA202) {
		JCA202 = jCA202;
	}
	
	public String getJCLEG() {
		return JCLEG;
	}

	public void setJCLEG(String jCLEG) {
		JCLEG = jCLEG;
	}

	public String getJCBISC() {
		return JCBISC;
	}

	public void setJCBISC(String jCBISC) {
		JCBISC = jCBISC;
	}

	public String getJCERN() {
		return JCERN;
	}

	public void setJCERN(String jCERN) {
		JCERN = jCERN;
	}

	

	public String getJCATRD() {
		return JCATRD;
	}

	public void setJCATRD(String jCATRD) {
		JCATRD = jCATRD;
	}	
	
	public String getJCB76ERN() {
		return JCB76ERN;
	}

	public void setJCB76ERN(String jCB76ERN) {
		JCB76ERN = jCB76ERN;
	}

	@Override
	public String toString() {
		return "[NOTA = " + JCBNNF + "]";
	}

	public String getJCAPTA() {
		return JCAPTA;
	}

	public void setJCAPTA(String jCAPTA) {
		JCAPTA = jCAPTA;
	}
	
	
}
