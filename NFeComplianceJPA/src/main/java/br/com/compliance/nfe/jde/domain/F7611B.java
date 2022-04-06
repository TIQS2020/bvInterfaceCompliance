package br.com.compliance.nfe.jde.domain;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity	
public class F7611B {
	
	@EmbeddedId
	private F7611BId id;
	
	private Integer FDBNNF;
	private String FDBSER;
	private Integer FDN001;
	private String FDDCT;
	private Long FDUKID;
	
	private String FDNXTR;
	private String FDLTTR;
	private Long FDDOCO;
	private Long FDLNID;
	private String FDPDCT;
	private String FDKCOO;
	private String FDLNTY;
	
	private String FDUSER;
	private String FDPID;
	private String FDJOBN;
	private Long FDUPMJ;
	private Long FDTDAY; 
	
	public F7611B(){}
	

	public F7611B(F7611BId id, Integer fDBNNF, String fDBSER, Integer fDN001, String fDDCT, Long fDUKID, String fDNXTR,
			String fDLTTR, Long fDDOCO, Long fDLNID, String fDPDCT, String fDKCOO, String fDLNTY, String fDUSER,
			String fDPID, String fDJOBN, Long fDUPMJ, Long fDTDAY) {
		super();
		this.id = id;
		FDBNNF = fDBNNF;
		FDBSER = fDBSER;
		FDN001 = fDN001;
		FDDCT = fDDCT;
		FDUKID = fDUKID;
		FDNXTR = fDNXTR;
		FDLTTR = fDLTTR;
		FDDOCO = fDDOCO;
		FDLNID = fDLNID;
		FDPDCT = fDPDCT;
		FDKCOO = fDKCOO;
		FDLNTY = fDLNTY;
		FDUSER = fDUSER;
		FDPID = fDPID;
		FDJOBN = fDJOBN;
		FDUPMJ = fDUPMJ;
		FDTDAY = fDTDAY;
	}

	

	public F7611BId getId() {
		return id;
	}


	public void setId(F7611BId id) {
		this.id = id;
	}


	public Integer getFDBNNF() {
		return FDBNNF;
	}


	public void setFDBNNF(Integer fDBNNF) {
		FDBNNF = fDBNNF;
	}


	public String getFDBSER() {
		return FDBSER;
	}


	public void setFDBSER(String fDBSER) {
		FDBSER = fDBSER;
	}


	public Integer getFDN001() {
		return FDN001;
	}


	public void setFDN001(Integer fDN001) {
		FDN001 = fDN001;
	}


	public String getFDDCT() {
		return FDDCT;
	}


	public void setFDDCT(String fDDCT) {
		FDDCT = fDDCT;
	}


	public Long getFDUKID() {
		return FDUKID;
	}


	public void setFDUKID(Long fDUKID) {
		FDUKID = fDUKID;
	}


	public String getFDNXTR() {
		return FDNXTR;
	}


	public void setFDNXTR(String fDNXTR) {
		FDNXTR = fDNXTR;
	}


	public String getFDLTTR() {
		return FDLTTR;
	}


	public void setFDLTTR(String fDLTTR) {
		FDLTTR = fDLTTR;
	}


	public Long getFDDOCO() {
		return FDDOCO;
	}


	public void setFDDOCO(Long fDDOCO) {
		FDDOCO = fDDOCO;
	}


	public Long getFDLNID() {
		return FDLNID;
	}


	public void setFDLNID(Long fDLNID) {
		FDLNID = fDLNID;
	}


	public String getFDPDCT() {
		return FDPDCT;
	}


	public void setFDPDCT(String fDPDCT) {
		FDPDCT = fDPDCT;
	}


	public String getFDKCOO() {
		return FDKCOO;
	}


	public void setFDKCOO(String fDKCOO) {
		FDKCOO = fDKCOO;
	}


	public String getFDLNTY() {
		return FDLNTY;
	}


	public void setFDLNTY(String fDLNTY) {
		FDLNTY = fDLNTY;
	}


	public String getFDUSER() {
		return FDUSER;
	}


	public void setFDUSER(String fDUSER) {
		FDUSER = fDUSER;
	}


	public String getFDPID() {
		return FDPID;
	}


	public void setFDPID(String fDPID) {
		FDPID = fDPID;
	}


	public String getFDJOBN() {
		return FDJOBN;
	}


	public void setFDJOBN(String fDJOBN) {
		FDJOBN = fDJOBN;
	}


	public Long getFDUPMJ() {
		return FDUPMJ;
	}


	public void setFDUPMJ(Long fDUPMJ) {
		FDUPMJ = fDUPMJ;
	}


	public Long getFDTDAY() {
		return FDTDAY;
	}


	public void setFDTDAY(Long fDTDAY) {
		FDTDAY = fDTDAY;
	}


	@Override
	public String toString() {
		return "F7611B [FDBNNF=" + FDBNNF + ", FDBSER=" + FDBSER + ", FDN001=" + FDN001 + ", FDDCT=" + FDDCT
				+ ", FDUKID=" + FDUKID + ", FDNXTR=" + FDNXTR + ", FDLTTR=" + FDLTTR + ", FDDOCO=" + FDDOCO
				+ ", FDLNID=" + FDLNID + ", FDPDCT=" + FDPDCT + ", FDKCOO=" + FDKCOO + ", FDUSER=" + FDUSER + ", FDPID="
				+ FDPID + ", FDJOBN=" + FDJOBN + ", FDUPMJ=" + FDUPMJ + ", FDTDAY=" + FDTDAY + "]";
	}	
	
	

}
