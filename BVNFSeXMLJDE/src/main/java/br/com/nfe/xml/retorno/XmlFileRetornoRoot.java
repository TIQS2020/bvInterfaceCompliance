package br.com.nfe.xml.retorno;

import br.com.nfe.xml.retorno.vo.Situacao;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "NFRetorno", namespace = "BrazilComplianceFeedback")
@XmlType(propOrder = {"JCBNNF", "JCBSER", "JCN001", "JCDCT", "JCB76EREF", "JCB76ELND",
        "JCB76ELNT", "JCB76ELN", "JCB76EST", "JCB76ESTC", "JCEV15", "situacao", "nroLoteIntegra"})
public class XmlFileRetornoRoot {

    private Integer JCBNNF;
    private String JCBSER;
    private Integer JCN001;
    private String JCDCT;
    private String JCB76EREF = "";
    private String JCB76ELND = "";
    private String JCB76ELNT = "";
    private String JCB76ELN = "";
    private String JCB76EST ="";
    private String JCB76ESTC = "";
    private String JCEV15;
    private Situacao situacao;
    private String nroLoteIntegra;

    public XmlFileRetornoRoot() {
        super();
    }

    public XmlFileRetornoRoot(Integer JCBNNF, String JCBSER, Integer JCN001, String JCDCT) {
        this.JCBNNF = JCBNNF;
        this.JCBSER = JCBSER;
        this.JCN001 = JCN001;
        this.JCDCT = JCDCT;
    }

    public XmlFileRetornoRoot(Integer JCBNNF, String JCBSER, Integer JCN001, String JCDCT, String JCB76EREF, String JCB76ELND, String JCB76ELNT, String JCB76ELN, String JCB76EST, String JCB76ESTC, String JCEV15, Situacao situacao, String nroLoteIntegra) {
        this.JCBNNF = JCBNNF;
        this.JCBSER = JCBSER;
        this.JCN001 = JCN001;
        this.JCDCT = JCDCT;
        this.JCB76EREF = JCB76EREF;
        this.JCB76ELND = JCB76ELND;
        this.JCB76ELNT = JCB76ELNT;
        this.JCB76ELN = JCB76ELN;
        this.JCB76EST = JCB76EST;
        this.JCB76ESTC = JCB76ESTC;
        this.JCEV15 = JCEV15;
        this.situacao = situacao;
        this.nroLoteIntegra = nroLoteIntegra;
    }

    @XmlElement(name = "JCBNNF")
    public Integer getJCBNNF() {
        return JCBNNF;
    }

    public void setJCBNNF(Integer JCBNNF) {
        this.JCBNNF = JCBNNF;
    }

    @XmlElement(name = "JCBSER")
    public String getJCBSER() {
        return JCBSER;
    }

    public void setJCBSER(String JCBSER) {
        this.JCBSER = JCBSER;
    }

    @XmlElement(name = "JCN001")
    public Integer getJCN001() {
        return JCN001;
    }

    public void setJCN001(Integer JCN001) {
        this.JCN001 = JCN001;
    }

    @XmlElement(name = "JCDCT")
    public String getJCDCT() {
        return JCDCT;
    }

    public void setJCDCT(String JCDCT) {
        this.JCDCT = JCDCT;
    }

    @XmlElement(name = "B76EREF")
    public String getJCB76EREF() {
        return JCB76EREF;
    }

    public void setJCB76EREF(String JCB76EREF) {
        this.JCB76EREF = JCB76EREF;
    }

    @XmlElement(name = "B76ELND")
    public String getJCB76ELND() {
        return JCB76ELND;
    }

    public void setJCB76ELND(String JCB76ELND) {
        this.JCB76ELND = JCB76ELND;
    }

    @XmlElement(name = "B76ELNT")
    public String getJCB76ELNT() {
        return JCB76ELNT;
    }

    public void setJCB76ELNT(String JCB76ELNT) {
        this.JCB76ELNT = JCB76ELNT;
    }

    @XmlElement(name = "B76ELN")
    public String getJCB76ELN() {
        return JCB76ELN;
    }

    public void setJCB76ELN(String JCB76ELN) {
        this.JCB76ELN = JCB76ELN;
    }

    @XmlElement(name = "B76EST")
    public String getJCB76EST() {
        return JCB76EST;
    }

    public void setJCB76EST(String JCB76EST) {
        this.JCB76EST = JCB76EST;
    }

    @XmlElement(name = "B76ESTC")
    public String getJCB76ESTC() {
        return JCB76ESTC;
    }

    public void setJCB76ESTC(String JCB76ESTC) {
        this.JCB76ESTC = JCB76ESTC;
    }

    @XmlElement(name = "EV15")
    public String getJCEV15() {
        return JCEV15;
    }

    public void setJCEV15(String JCEV15) {
        this.JCEV15 = JCEV15;
    }

    @XmlElement(name = "SITUACAO")
    public Situacao getSituacao() {
        return situacao;
    }

    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
    }

    @XmlElement(name = "NrLoteIntegra")
    public String getNroLoteIntegra() {
        return nroLoteIntegra;
    }

    public void setNroLoteIntegra(String nroLoteIntegra) {
        this.nroLoteIntegra = nroLoteIntegra;
    }
}
