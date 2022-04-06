package br.com.compliance.nfe.jde.domain;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity	
public class F40203 {
	
	@EmbeddedId
	private F40203Id f40203Id;
	
	private String FSDCTO;
	private String FSTRTY;
	private String FSSTDS;
	private String FSLNTY;
	private String FSLNDS;
	private String FSLND2;
	private String FSNXTR;
	private String FSA1TR;
	private String FSA2TR;
	private String FSA3TR;
	private String FSA4TR;
	private String FSA5TR;
	private String FSFID ;
	private Long FSORNN;
	private String FSWRTH;
	
	
	
	public F40203() {
		super();
	}
	public F40203(F40203Id f40203Id, String fSDCTO, String fSTRTY, String fSSTDS, String fSLNTY, String fSLNDS,
			String fSLND2, String fSNXTR, String fSA1TR, String fSA2TR, String fSA3TR, String fSA4TR, String fSA5TR,
			String fSFID, Long fSORNN, String fSWRTH) {
		super();
		this.f40203Id = f40203Id;
		FSDCTO = fSDCTO;
		FSTRTY = fSTRTY;
		FSSTDS = fSSTDS;
		FSLNTY = fSLNTY;
		FSLNDS = fSLNDS;
		FSLND2 = fSLND2;
		FSNXTR = fSNXTR;
		FSA1TR = fSA1TR;
		FSA2TR = fSA2TR;
		FSA3TR = fSA3TR;
		FSA4TR = fSA4TR;
		FSA5TR = fSA5TR;
		FSFID = fSFID;
		FSORNN = fSORNN;
		FSWRTH = fSWRTH;
	}
	public F40203Id getF40203Id() {
		return f40203Id;
	}
	public void setF40203Id(F40203Id f40203Id) {
		this.f40203Id = f40203Id;
	}
	public String getFSDCTO() {
		return FSDCTO;
	}
	public void setFSDCTO(String fSDCTO) {
		FSDCTO = fSDCTO;
	}
	public String getFSTRTY() {
		return FSTRTY;
	}
	public void setFSTRTY(String fSTRTY) {
		FSTRTY = fSTRTY;
	}
	public String getFSSTDS() {
		return FSSTDS;
	}
	public void setFSSTDS(String fSSTDS) {
		FSSTDS = fSSTDS;
	}
	public String getFSLNTY() {
		return FSLNTY;
	}
	public void setFSLNTY(String fSLNTY) {
		FSLNTY = fSLNTY;
	}
	public String getFSLNDS() {
		return FSLNDS;
	}
	public void setFSLNDS(String fSLNDS) {
		FSLNDS = fSLNDS;
	}
	public String getFSLND2() {
		return FSLND2;
	}
	public void setFSLND2(String fSLND2) {
		FSLND2 = fSLND2;
	}
	public String getFSNXTR() {
		return FSNXTR;
	}
	public void setFSNXTR(String fSNXTR) {
		FSNXTR = fSNXTR;
	}
	public String getFSA1TR() {
		return FSA1TR;
	}
	public void setFSA1TR(String fSA1TR) {
		FSA1TR = fSA1TR;
	}
	public String getFSA2TR() {
		return FSA2TR;
	}
	public void setFSA2TR(String fSA2TR) {
		FSA2TR = fSA2TR;
	}
	public String getFSA3TR() {
		return FSA3TR;
	}
	public void setFSA3TR(String fSA3TR) {
		FSA3TR = fSA3TR;
	}
	public String getFSA4TR() {
		return FSA4TR;
	}
	public void setFSA4TR(String fSA4TR) {
		FSA4TR = fSA4TR;
	}
	public String getFSA5TR() {
		return FSA5TR;
	}
	public void setFSA5TR(String fSA5TR) {
		FSA5TR = fSA5TR;
	}
	public String getFSFID() {
		return FSFID;
	}
	public void setFSFID(String fSFID) {
		FSFID = fSFID;
	}
	public Long getFSORNN() {
		return FSORNN;
	}
	public void setFSORNN(Long fSORNN) {
		FSORNN = fSORNN;
	}
	public String getFSWRTH() {
		return FSWRTH;
	}
	public void setFSWRTH(String fSWRTH) {
		FSWRTH = fSWRTH;
	}
	@Override
	public String toString() {
		return "F40203 [f40203Id=" + f40203Id + ", FSDCTO=" + FSDCTO + ", FSTRTY=" + FSTRTY + ", FSSTDS=" + FSSTDS
				+ ", FSLNTY=" + FSLNTY + ", FSLNDS=" + FSLNDS + ", FSLND2=" + FSLND2 + ", FSNXTR=" + FSNXTR
				+ ", FSA1TR=" + FSA1TR + ", FSA2TR=" + FSA2TR + ", FSA3TR=" + FSA3TR + ", FSA4TR=" + FSA4TR
				+ ", FSA5TR=" + FSA5TR + ", FSFID=" + FSFID + ", FSORNN=" + FSORNN + ", FSWRTH=" + FSWRTH + "]";
	}
	
	

}
