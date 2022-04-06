package br.com.compliance.nfe.jde.domain;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class F76B01TE {

	@EmbeddedId
	private F76B01TEId id;

	private Integer FHBNNF;
	private String FHBSER;
	private Integer FHN001;
	private String FHDCT;

	private String FHB76ELN;
	private Double FHB76ELND;
	private Double FHB76ELNT;
	private String FHB76ERN;
	private Double FHB76ERND;
	private Double FHB76ERNT;
	private String FHB76EAN;
	private Double FHB76EAND;
	private Double FHB76EANT;
	private String FHB76EST;
	private String FHB76ESTC;
	private Double FHB76ESTD;
	private String FHB76EREF;
	private String FHB76ETPR;
	private String FHURCD;
	private Double FHURDT;
	private Double FHURAT;
	private String FHURRF;
	private String FHTORG;
	private String FHUSER;
	private String FHPID;
	private String FHJOBN;
	private Long FHUPMJ;
	private Long FHTDAY;
	
	/*MODIFICACAO 19-03-2020*/
	private String FHB76EAA;	
	
	public F76B01TE() {
		super();
	}	
	
	public F76B01TE(F76B01TEId id, Integer fHBNNF, String fHBSER, Integer fHN001, String fHDCT, String fHB76ELN,
			Double fHB76ELND, Double fHB76ELNT, String fHB76ERN, Double fHB76ERND, Double fHB76ERNT, String fHB76EAN,
			Double fHB76EAND, Double fHB76EANT, String fHB76EST, String fHB76ESTC, Double fHB76ESTD, String fHB76EREF,
			String fHB76ETPR, String fHURCD, Double fHURDT, Double fHURAT, String fHURRF, String fHTORG, String fHUSER,
			String fHPID, String fHJOBN, Long fHUPMJ, Long fHTDAY, String fHB76EAA) {
		super();
		this.id = id;
		FHBNNF = fHBNNF;
		FHBSER = fHBSER;
		FHN001 = fHN001;
		FHDCT = fHDCT;
		FHB76ELN = fHB76ELN;
		FHB76ELND = fHB76ELND;
		FHB76ELNT = fHB76ELNT;
		FHB76ERN = fHB76ERN;
		FHB76ERND = fHB76ERND;
		FHB76ERNT = fHB76ERNT;
		FHB76EAN = fHB76EAN;
		FHB76EAND = fHB76EAND;
		FHB76EANT = fHB76EANT;
		FHB76EST = fHB76EST;
		FHB76ESTC = fHB76ESTC;
		FHB76ESTD = fHB76ESTD;
		FHB76EREF = fHB76EREF;
		FHB76ETPR = fHB76ETPR;
		FHURCD = fHURCD;
		FHURDT = fHURDT;
		FHURAT = fHURAT;
		FHURRF = fHURRF;
		FHTORG = fHTORG;
		FHUSER = fHUSER;
		FHPID = fHPID;
		FHJOBN = fHJOBN;
		FHUPMJ = fHUPMJ;
		FHTDAY = fHTDAY;
		FHB76EAA = fHB76EAA;
	}



	public F76B01TEId getId() {
		return id;
	}
	public void setId(F76B01TEId id) {
		this.id = id;
	}
	public Integer getFHBNNF() {
		return FHBNNF;
	}
	public void setFHBNNF(Integer fHBNNF) {
		FHBNNF = fHBNNF;
	}
	public String getFHBSER() {
		return FHBSER;
	}
	public void setFHBSER(String fHBSER) {
		FHBSER = fHBSER;
	}
	public Integer getFHN001() {
		return FHN001;
	}
	public void setFHN001(Integer fHN001) {
		FHN001 = fHN001;
	}
	public String getFHDCT() {
		return FHDCT;
	}
	public void setFHDCT(String fHDCT) {
		FHDCT = fHDCT;
	}
	public String getFHB76ELN() {
		return FHB76ELN;
	}
	public void setFHB76ELN(String fHB76ELN) {
		FHB76ELN = fHB76ELN;
	}
	public Double getFHB76ELND() {
		return FHB76ELND;
	}
	public void setFHB76ELND(Double fHB76ELND) {
		FHB76ELND = fHB76ELND;
	}
	public Double getFHB76ELNT() {
		return FHB76ELNT;
	}
	public void setFHB76ELNT(Double fHB76ELNT) {
		FHB76ELNT = fHB76ELNT;
	}
	public String getFHB76ERN() {
		return FHB76ERN;
	}
	public void setFHB76ERN(String fHB76ERN) {
		FHB76ERN = fHB76ERN;
	}
	public Double getFHB76ERND() {
		return FHB76ERND;
	}
	public void setFHB76ERND(Double fHB76ERND) {
		FHB76ERND = fHB76ERND;
	}
	public Double getFHB76ERNT() {
		return FHB76ERNT;
	}
	public void setFHB76ERNT(Double fHB76ERNT) {
		FHB76ERNT = fHB76ERNT;
	}
	public String getFHB76EAN() {
		return FHB76EAN;
	}
	public void setFHB76EAN(String fHB76EAN) {
		FHB76EAN = fHB76EAN;
	}
	public Double getFHB76EAND() {
		return FHB76EAND;
	}
	public void setFHB76EAND(Double fHB76EAND) {
		FHB76EAND = fHB76EAND;
	}
	public Double getFHB76EANT() {
		return FHB76EANT;
	}
	public void setFHB76EANT(Double fHB76EANT) {
		FHB76EANT = fHB76EANT;
	}
	public String getFHB76EST() {
		return FHB76EST;
	}
	public void setFHB76EST(String fHB76EST) {
		FHB76EST = fHB76EST;
	}
	public String getFHB76ESTC() {
		return FHB76ESTC;
	}
	public void setFHB76ESTC(String fHB76ESTC) {
		FHB76ESTC = fHB76ESTC;
	}
	public Double getFHB76ESTD() {
		return FHB76ESTD;
	}
	public void setFHB76ESTD(Double fHB76ESTD) {
		FHB76ESTD = fHB76ESTD;
	}
	public String getFHB76EREF() {
		return FHB76EREF;
	}
	public void setFHB76EREF(String fHB76EREF) {
		FHB76EREF = fHB76EREF;
	}
	public String getFHB76ETPR() {
		return FHB76ETPR;
	}
	public void setFHB76ETPR(String fHB76ETPR) {
		FHB76ETPR = fHB76ETPR;
	}
	public String getFHURCD() {
		return FHURCD;
	}
	public void setFHURCD(String fHURCD) {
		FHURCD = fHURCD;
	}
	public Double getFHURDT() {
		return FHURDT;
	}
	public void setFHURDT(Double fHURDT) {
		FHURDT = fHURDT;
	}
	public Double getFHURAT() {
		return FHURAT;
	}
	public void setFHURAT(Double fHURAT) {
		FHURAT = fHURAT;
	}
	public String getFHURRF() {
		return FHURRF;
	}
	public void setFHURRF(String fHURRF) {
		FHURRF = fHURRF;
	}
	public String getFHTORG() {
		return FHTORG;
	}
	public void setFHTORG(String fHTORG) {
		FHTORG = fHTORG;
	}
	public String getFHUSER() {
		return FHUSER;
	}
	public void setFHUSER(String fHUSER) {
		FHUSER = fHUSER;
	}
	public String getFHPID() {
		return FHPID;
	}
	public void setFHPID(String fHPID) {
		FHPID = fHPID;
	}
	public String getFHJOBN() {
		return FHJOBN;
	}
	public void setFHJOBN(String fHJOBN) {
		FHJOBN = fHJOBN;
	}
	public Long getFHUPMJ() {
		return FHUPMJ;
	}
	public void setFHUPMJ(Long fHUPMJ) {
		FHUPMJ = fHUPMJ;
	}
	public Long getFHTDAY() {
		return FHTDAY;
	}
	public void setFHTDAY(Long fHTDAY) {
		FHTDAY = fHTDAY;
	}

	public String getFHB76EAA() {
		return FHB76EAA;
	}

	public void setFHB76EAA(String fHB76EAA) {
		FHB76EAA = fHB76EAA;
	}

	@Override
	public String toString() {
		return "F76B01TE [id=" + id + ", FHBNNF=" + FHBNNF + ", FHBSER=" + FHBSER + ", FHN001=" + FHN001 + ", FHDCT="
				+ FHDCT + ", FHB76ELN=" + FHB76ELN + ", FHB76ELND=" + FHB76ELND + ", FHB76ELNT=" + FHB76ELNT
				+ ", FHB76ERN=" + FHB76ERN + ", FHB76ERND=" + FHB76ERND + ", FHB76ERNT=" + FHB76ERNT + ", FHB76EAN="
				+ FHB76EAN + ", FHB76EAND=" + FHB76EAND + ", FHB76EANT=" + FHB76EANT + ", FHB76EST=" + FHB76EST
				+ ", FHB76ESTC=" + FHB76ESTC + ", FHB76ESTD=" + FHB76ESTD + ", FHB76EREF=" + FHB76EREF + ", FHB76ETPR="
				+ FHB76ETPR + ", FHURCD=" + FHURCD + ", FHURDT=" + FHURDT + ", FHURAT=" + FHURAT + ", FHURRF=" + FHURRF
				+ ", FHTORG=" + FHTORG + ", FHUSER=" + FHUSER + ", FHPID=" + FHPID + ", FHJOBN=" + FHJOBN + ", FHUPMJ="
				+ FHUPMJ + ", FHTDAY=" + FHTDAY + ", FHB76EAA=" + FHB76EAA + "]";
	}
	
	

}
