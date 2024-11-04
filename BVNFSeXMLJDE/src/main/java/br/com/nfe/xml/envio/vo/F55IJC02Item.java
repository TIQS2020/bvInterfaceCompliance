package br.com.nfe.xml.envio.vo;

import javax.xml.bind.annotation.XmlElement;

public class F55IJC02Item {

    private String JCB76ELN;
    private String JCB76ELND;
    private String JCB76EREF;
    private String JCB76ELNT;
    private String JCCDCID;
    private String JCA202;
    private String JCUSER;
    private String JCUPMJ;
    private String JCUPMT;
    private String JCJOBN;
    private String JCPID;




    public F55IJC02Item() {
        super();
        // TODO Auto-generated constructor stub
    }

    @XmlElement(name = "JCB76ELN")
    public String getJCB76ELN() {
        return JCB76ELN;
    }
    public void setJCB76ELN(String jCB76ELN) {
        JCB76ELN = jCB76ELN;
    }

    @XmlElement(name = "JCB76ELND")
    public String getJCB76ELND() {
        return JCB76ELND;
    }
    public void setJCB76ELND(String jCB76ELND) {
        JCB76ELND = jCB76ELND;
    }

    @XmlElement(name = "JCB76EREF")
    public String getJCB76EREF() {
        return JCB76EREF;
    }
    public void setJCB76EREF(String jCB76EREF) {
        JCB76EREF = jCB76EREF;
    }

    @XmlElement(name = "JCCDCID")
    public String getJCCDCID() {
        return JCCDCID;
    }

    public void setJCCDCID(String JCCDCID) {
        this.JCCDCID = JCCDCID;
    }
}
