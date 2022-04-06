/**
 * TpItens.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil;

public class TpItens  implements java.io.Serializable {
    private org.apache.axis.types.NonNegativeInteger nroItem;

    private java.lang.String codItem;

    private java.lang.String descrItem;

    private org.apache.axis.types.NonNegativeInteger dmIndMov;

    private java.lang.String cEan;

    private java.lang.String codNcm;

    private java.lang.String generoNcm;

    private java.lang.String codExTipi;

    private org.apache.axis.types.NonNegativeInteger cfop;

    private java.lang.String unidCom;

    private java.math.BigDecimal qtdeComerc;

    private java.math.BigDecimal vlUnitComerc;

    private java.math.BigDecimal vlItemBruto;

    private java.lang.String cEanTrib;

    private java.lang.String unidTrib;

    private java.math.BigDecimal qtdeTribs;

    private java.math.BigDecimal vlUnitTrib;

    private java.math.BigDecimal vlFrete;

    private java.math.BigDecimal vlSeguro;

    private java.math.BigDecimal vlOutro;

    private java.math.BigDecimal vlDesc;

    private java.lang.String infAdProd;

    private java.math.BigInteger dmOrigProd;

    private org.apache.axis.types.NonNegativeInteger dmModBaseCalcIcms;

    private org.apache.axis.types.NonNegativeInteger dmModBaseCalcIcmsSt;

    private org.apache.axis.types.NonNegativeInteger dmIndTot;

    private org.apache.axis.types.NonNegativeInteger dmMotDesIcms;

    private java.lang.String dmCodTribIssqn;

    private java.math.BigDecimal vlTotTribItem;

    private java.lang.String cnpjProdutor;

    private java.math.BigInteger qtdeSeloIpi;

    private java.math.BigInteger percentDevolMerc;

    private java.math.BigDecimal vlIpiDevol;

    private java.math.BigDecimal vlDespAdu;

    private java.math.BigDecimal vlIof;

    private java.lang.String clEnqIpi;

    private java.lang.String codSeloIpi;

    private java.lang.String codEnqIpi;

    private java.lang.String cidadeIbge;

    private java.math.BigInteger cdListaServ;

    private org.apache.axis.types.NonNegativeInteger dmIndApurIpi;

    private java.lang.String codCta;

    private java.lang.String classConsItemCont;

    private org.apache.axis.types.NonNegativeInteger dmIndReceita;

    private java.lang.String codPart;

    private org.apache.axis.types.NonNegativeInteger dmIndRecComEnergiaEletrica;

    private java.lang.String codigoNaturezaOperacao;

    private java.lang.String pedidoCompra;

    private java.math.BigInteger itemPedidoCompra;

    private java.lang.String nroFci;

    private java.lang.String nroRecopi;

    private br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpDifAliqIcms difAliqIcms;

    private br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpImpostos[] impostos;

    private br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpDadosComb dadosComb;

    private br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpDadosVeic dadosVeic;

    private br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpDadosMed[] dadosMed;

    private br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpDadosArma[] dadosArma;

    private br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpDecImpor[] decImpor;

    private br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpComplTransp complTransp;

    private br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpExport[] export;

    private br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpNve[] nve;

    private br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpComplServ complServ;

    private java.math.BigInteger cest;

    private java.lang.String dmIndEscRel;

    private java.lang.String cnpjFabMerc;

    private java.lang.String codOcorAjIcms;

    private br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpRastreab[] rastreab;

    public TpItens() {
    }

    public TpItens(
           org.apache.axis.types.NonNegativeInteger nroItem,
           java.lang.String codItem,
           java.lang.String descrItem,
           org.apache.axis.types.NonNegativeInteger dmIndMov,
           java.lang.String cEan,
           java.lang.String codNcm,
           java.lang.String generoNcm,
           java.lang.String codExTipi,
           org.apache.axis.types.NonNegativeInteger cfop,
           java.lang.String unidCom,
           java.math.BigDecimal qtdeComerc,
           java.math.BigDecimal vlUnitComerc,
           java.math.BigDecimal vlItemBruto,
           java.lang.String cEanTrib,
           java.lang.String unidTrib,
           java.math.BigDecimal qtdeTribs,
           java.math.BigDecimal vlUnitTrib,
           java.math.BigDecimal vlFrete,
           java.math.BigDecimal vlSeguro,
           java.math.BigDecimal vlOutro,
           java.math.BigDecimal vlDesc,
           java.lang.String infAdProd,
           java.math.BigInteger dmOrigProd,
           org.apache.axis.types.NonNegativeInteger dmModBaseCalcIcms,
           org.apache.axis.types.NonNegativeInteger dmModBaseCalcIcmsSt,
           org.apache.axis.types.NonNegativeInteger dmIndTot,
           org.apache.axis.types.NonNegativeInteger dmMotDesIcms,
           java.lang.String dmCodTribIssqn,
           java.math.BigDecimal vlTotTribItem,
           java.lang.String cnpjProdutor,
           java.math.BigInteger qtdeSeloIpi,
           java.math.BigInteger percentDevolMerc,
           java.math.BigDecimal vlIpiDevol,
           java.math.BigDecimal vlDespAdu,
           java.math.BigDecimal vlIof,
           java.lang.String clEnqIpi,
           java.lang.String codSeloIpi,
           java.lang.String codEnqIpi,
           java.lang.String cidadeIbge,
           java.math.BigInteger cdListaServ,
           org.apache.axis.types.NonNegativeInteger dmIndApurIpi,
           java.lang.String codCta,
           java.lang.String classConsItemCont,
           org.apache.axis.types.NonNegativeInteger dmIndReceita,
           java.lang.String codPart,
           org.apache.axis.types.NonNegativeInteger dmIndRecComEnergiaEletrica,
           java.lang.String codigoNaturezaOperacao,
           java.lang.String pedidoCompra,
           java.math.BigInteger itemPedidoCompra,
           java.lang.String nroFci,
           java.lang.String nroRecopi,
           br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpDifAliqIcms difAliqIcms,
           br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpImpostos[] impostos,
           br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpDadosComb dadosComb,
           br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpDadosVeic dadosVeic,
           br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpDadosMed[] dadosMed,
           br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpDadosArma[] dadosArma,
           br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpDecImpor[] decImpor,
           br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpComplTransp complTransp,
           br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpExport[] export,
           br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpNve[] nve,
           br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpComplServ complServ,
           java.math.BigInteger cest,
           java.lang.String dmIndEscRel,
           java.lang.String cnpjFabMerc,
           java.lang.String codOcorAjIcms,
           br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpRastreab[] rastreab) {
           this.nroItem = nroItem;
           this.codItem = codItem;
           this.descrItem = descrItem;
           this.dmIndMov = dmIndMov;
           this.cEan = cEan;
           this.codNcm = codNcm;
           this.generoNcm = generoNcm;
           this.codExTipi = codExTipi;
           this.cfop = cfop;
           this.unidCom = unidCom;
           this.qtdeComerc = qtdeComerc;
           this.vlUnitComerc = vlUnitComerc;
           this.vlItemBruto = vlItemBruto;
           this.cEanTrib = cEanTrib;
           this.unidTrib = unidTrib;
           this.qtdeTribs = qtdeTribs;
           this.vlUnitTrib = vlUnitTrib;
           this.vlFrete = vlFrete;
           this.vlSeguro = vlSeguro;
           this.vlOutro = vlOutro;
           this.vlDesc = vlDesc;
           this.infAdProd = infAdProd;
           this.dmOrigProd = dmOrigProd;
           this.dmModBaseCalcIcms = dmModBaseCalcIcms;
           this.dmModBaseCalcIcmsSt = dmModBaseCalcIcmsSt;
           this.dmIndTot = dmIndTot;
           this.dmMotDesIcms = dmMotDesIcms;
           this.dmCodTribIssqn = dmCodTribIssqn;
           this.vlTotTribItem = vlTotTribItem;
           this.cnpjProdutor = cnpjProdutor;
           this.qtdeSeloIpi = qtdeSeloIpi;
           this.percentDevolMerc = percentDevolMerc;
           this.vlIpiDevol = vlIpiDevol;
           this.vlDespAdu = vlDespAdu;
           this.vlIof = vlIof;
           this.clEnqIpi = clEnqIpi;
           this.codSeloIpi = codSeloIpi;
           this.codEnqIpi = codEnqIpi;
           this.cidadeIbge = cidadeIbge;
           this.cdListaServ = cdListaServ;
           this.dmIndApurIpi = dmIndApurIpi;
           this.codCta = codCta;
           this.classConsItemCont = classConsItemCont;
           this.dmIndReceita = dmIndReceita;
           this.codPart = codPart;
           this.dmIndRecComEnergiaEletrica = dmIndRecComEnergiaEletrica;
           this.codigoNaturezaOperacao = codigoNaturezaOperacao;
           this.pedidoCompra = pedidoCompra;
           this.itemPedidoCompra = itemPedidoCompra;
           this.nroFci = nroFci;
           this.nroRecopi = nroRecopi;
           this.difAliqIcms = difAliqIcms;
           this.impostos = impostos;
           this.dadosComb = dadosComb;
           this.dadosVeic = dadosVeic;
           this.dadosMed = dadosMed;
           this.dadosArma = dadosArma;
           this.decImpor = decImpor;
           this.complTransp = complTransp;
           this.export = export;
           this.nve = nve;
           this.complServ = complServ;
           this.cest = cest;
           this.dmIndEscRel = dmIndEscRel;
           this.cnpjFabMerc = cnpjFabMerc;
           this.codOcorAjIcms = codOcorAjIcms;
           this.rastreab = rastreab;
    }


    /**
     * Gets the nroItem value for this TpItens.
     * 
     * @return nroItem
     */
    public org.apache.axis.types.NonNegativeInteger getNroItem() {
        return nroItem;
    }


    /**
     * Sets the nroItem value for this TpItens.
     * 
     * @param nroItem
     */
    public void setNroItem(org.apache.axis.types.NonNegativeInteger nroItem) {
        this.nroItem = nroItem;
    }


    /**
     * Gets the codItem value for this TpItens.
     * 
     * @return codItem
     */
    public java.lang.String getCodItem() {
        return codItem;
    }


    /**
     * Sets the codItem value for this TpItens.
     * 
     * @param codItem
     */
    public void setCodItem(java.lang.String codItem) {
        this.codItem = codItem;
    }


    /**
     * Gets the descrItem value for this TpItens.
     * 
     * @return descrItem
     */
    public java.lang.String getDescrItem() {
        return descrItem;
    }


    /**
     * Sets the descrItem value for this TpItens.
     * 
     * @param descrItem
     */
    public void setDescrItem(java.lang.String descrItem) {
        this.descrItem = descrItem;
    }


    /**
     * Gets the dmIndMov value for this TpItens.
     * 
     * @return dmIndMov
     */
    public org.apache.axis.types.NonNegativeInteger getDmIndMov() {
        return dmIndMov;
    }


    /**
     * Sets the dmIndMov value for this TpItens.
     * 
     * @param dmIndMov
     */
    public void setDmIndMov(org.apache.axis.types.NonNegativeInteger dmIndMov) {
        this.dmIndMov = dmIndMov;
    }


    /**
     * Gets the cEan value for this TpItens.
     * 
     * @return cEan
     */
    public java.lang.String getCEan() {
        return cEan;
    }


    /**
     * Sets the cEan value for this TpItens.
     * 
     * @param cEan
     */
    public void setCEan(java.lang.String cEan) {
        this.cEan = cEan;
    }


    /**
     * Gets the codNcm value for this TpItens.
     * 
     * @return codNcm
     */
    public java.lang.String getCodNcm() {
        return codNcm;
    }


    /**
     * Sets the codNcm value for this TpItens.
     * 
     * @param codNcm
     */
    public void setCodNcm(java.lang.String codNcm) {
        this.codNcm = codNcm;
    }


    /**
     * Gets the generoNcm value for this TpItens.
     * 
     * @return generoNcm
     */
    public java.lang.String getGeneroNcm() {
        return generoNcm;
    }


    /**
     * Sets the generoNcm value for this TpItens.
     * 
     * @param generoNcm
     */
    public void setGeneroNcm(java.lang.String generoNcm) {
        this.generoNcm = generoNcm;
    }


    /**
     * Gets the codExTipi value for this TpItens.
     * 
     * @return codExTipi
     */
    public java.lang.String getCodExTipi() {
        return codExTipi;
    }


    /**
     * Sets the codExTipi value for this TpItens.
     * 
     * @param codExTipi
     */
    public void setCodExTipi(java.lang.String codExTipi) {
        this.codExTipi = codExTipi;
    }


    /**
     * Gets the cfop value for this TpItens.
     * 
     * @return cfop
     */
    public org.apache.axis.types.NonNegativeInteger getCfop() {
        return cfop;
    }


    /**
     * Sets the cfop value for this TpItens.
     * 
     * @param cfop
     */
    public void setCfop(org.apache.axis.types.NonNegativeInteger cfop) {
        this.cfop = cfop;
    }


    /**
     * Gets the unidCom value for this TpItens.
     * 
     * @return unidCom
     */
    public java.lang.String getUnidCom() {
        return unidCom;
    }


    /**
     * Sets the unidCom value for this TpItens.
     * 
     * @param unidCom
     */
    public void setUnidCom(java.lang.String unidCom) {
        this.unidCom = unidCom;
    }


    /**
     * Gets the qtdeComerc value for this TpItens.
     * 
     * @return qtdeComerc
     */
    public java.math.BigDecimal getQtdeComerc() {
        return qtdeComerc;
    }


    /**
     * Sets the qtdeComerc value for this TpItens.
     * 
     * @param qtdeComerc
     */
    public void setQtdeComerc(java.math.BigDecimal qtdeComerc) {
        this.qtdeComerc = qtdeComerc;
    }


    /**
     * Gets the vlUnitComerc value for this TpItens.
     * 
     * @return vlUnitComerc
     */
    public java.math.BigDecimal getVlUnitComerc() {
        return vlUnitComerc;
    }


    /**
     * Sets the vlUnitComerc value for this TpItens.
     * 
     * @param vlUnitComerc
     */
    public void setVlUnitComerc(java.math.BigDecimal vlUnitComerc) {
        this.vlUnitComerc = vlUnitComerc;
    }


    /**
     * Gets the vlItemBruto value for this TpItens.
     * 
     * @return vlItemBruto
     */
    public java.math.BigDecimal getVlItemBruto() {
        return vlItemBruto;
    }


    /**
     * Sets the vlItemBruto value for this TpItens.
     * 
     * @param vlItemBruto
     */
    public void setVlItemBruto(java.math.BigDecimal vlItemBruto) {
        this.vlItemBruto = vlItemBruto;
    }


    /**
     * Gets the cEanTrib value for this TpItens.
     * 
     * @return cEanTrib
     */
    public java.lang.String getCEanTrib() {
        return cEanTrib;
    }


    /**
     * Sets the cEanTrib value for this TpItens.
     * 
     * @param cEanTrib
     */
    public void setCEanTrib(java.lang.String cEanTrib) {
        this.cEanTrib = cEanTrib;
    }


    /**
     * Gets the unidTrib value for this TpItens.
     * 
     * @return unidTrib
     */
    public java.lang.String getUnidTrib() {
        return unidTrib;
    }


    /**
     * Sets the unidTrib value for this TpItens.
     * 
     * @param unidTrib
     */
    public void setUnidTrib(java.lang.String unidTrib) {
        this.unidTrib = unidTrib;
    }


    /**
     * Gets the qtdeTribs value for this TpItens.
     * 
     * @return qtdeTribs
     */
    public java.math.BigDecimal getQtdeTribs() {
        return qtdeTribs;
    }


    /**
     * Sets the qtdeTribs value for this TpItens.
     * 
     * @param qtdeTribs
     */
    public void setQtdeTribs(java.math.BigDecimal qtdeTribs) {
        this.qtdeTribs = qtdeTribs;
    }


    /**
     * Gets the vlUnitTrib value for this TpItens.
     * 
     * @return vlUnitTrib
     */
    public java.math.BigDecimal getVlUnitTrib() {
        return vlUnitTrib;
    }


    /**
     * Sets the vlUnitTrib value for this TpItens.
     * 
     * @param vlUnitTrib
     */
    public void setVlUnitTrib(java.math.BigDecimal vlUnitTrib) {
        this.vlUnitTrib = vlUnitTrib;
    }


    /**
     * Gets the vlFrete value for this TpItens.
     * 
     * @return vlFrete
     */
    public java.math.BigDecimal getVlFrete() {
        return vlFrete;
    }


    /**
     * Sets the vlFrete value for this TpItens.
     * 
     * @param vlFrete
     */
    public void setVlFrete(java.math.BigDecimal vlFrete) {
        this.vlFrete = vlFrete;
    }


    /**
     * Gets the vlSeguro value for this TpItens.
     * 
     * @return vlSeguro
     */
    public java.math.BigDecimal getVlSeguro() {
        return vlSeguro;
    }


    /**
     * Sets the vlSeguro value for this TpItens.
     * 
     * @param vlSeguro
     */
    public void setVlSeguro(java.math.BigDecimal vlSeguro) {
        this.vlSeguro = vlSeguro;
    }


    /**
     * Gets the vlOutro value for this TpItens.
     * 
     * @return vlOutro
     */
    public java.math.BigDecimal getVlOutro() {
        return vlOutro;
    }


    /**
     * Sets the vlOutro value for this TpItens.
     * 
     * @param vlOutro
     */
    public void setVlOutro(java.math.BigDecimal vlOutro) {
        this.vlOutro = vlOutro;
    }


    /**
     * Gets the vlDesc value for this TpItens.
     * 
     * @return vlDesc
     */
    public java.math.BigDecimal getVlDesc() {
        return vlDesc;
    }


    /**
     * Sets the vlDesc value for this TpItens.
     * 
     * @param vlDesc
     */
    public void setVlDesc(java.math.BigDecimal vlDesc) {
        this.vlDesc = vlDesc;
    }


    /**
     * Gets the infAdProd value for this TpItens.
     * 
     * @return infAdProd
     */
    public java.lang.String getInfAdProd() {
        return infAdProd;
    }


    /**
     * Sets the infAdProd value for this TpItens.
     * 
     * @param infAdProd
     */
    public void setInfAdProd(java.lang.String infAdProd) {
        this.infAdProd = infAdProd;
    }


    /**
     * Gets the dmOrigProd value for this TpItens.
     * 
     * @return dmOrigProd
     */
    public java.math.BigInteger getDmOrigProd() {
        return dmOrigProd;
    }


    /**
     * Sets the dmOrigProd value for this TpItens.
     * 
     * @param dmOrigProd
     */
    public void setDmOrigProd(java.math.BigInteger dmOrigProd) {
        this.dmOrigProd = dmOrigProd;
    }


    /**
     * Gets the dmModBaseCalcIcms value for this TpItens.
     * 
     * @return dmModBaseCalcIcms
     */
    public org.apache.axis.types.NonNegativeInteger getDmModBaseCalcIcms() {
        return dmModBaseCalcIcms;
    }


    /**
     * Sets the dmModBaseCalcIcms value for this TpItens.
     * 
     * @param dmModBaseCalcIcms
     */
    public void setDmModBaseCalcIcms(org.apache.axis.types.NonNegativeInteger dmModBaseCalcIcms) {
        this.dmModBaseCalcIcms = dmModBaseCalcIcms;
    }


    /**
     * Gets the dmModBaseCalcIcmsSt value for this TpItens.
     * 
     * @return dmModBaseCalcIcmsSt
     */
    public org.apache.axis.types.NonNegativeInteger getDmModBaseCalcIcmsSt() {
        return dmModBaseCalcIcmsSt;
    }


    /**
     * Sets the dmModBaseCalcIcmsSt value for this TpItens.
     * 
     * @param dmModBaseCalcIcmsSt
     */
    public void setDmModBaseCalcIcmsSt(org.apache.axis.types.NonNegativeInteger dmModBaseCalcIcmsSt) {
        this.dmModBaseCalcIcmsSt = dmModBaseCalcIcmsSt;
    }


    /**
     * Gets the dmIndTot value for this TpItens.
     * 
     * @return dmIndTot
     */
    public org.apache.axis.types.NonNegativeInteger getDmIndTot() {
        return dmIndTot;
    }


    /**
     * Sets the dmIndTot value for this TpItens.
     * 
     * @param dmIndTot
     */
    public void setDmIndTot(org.apache.axis.types.NonNegativeInteger dmIndTot) {
        this.dmIndTot = dmIndTot;
    }


    /**
     * Gets the dmMotDesIcms value for this TpItens.
     * 
     * @return dmMotDesIcms
     */
    public org.apache.axis.types.NonNegativeInteger getDmMotDesIcms() {
        return dmMotDesIcms;
    }


    /**
     * Sets the dmMotDesIcms value for this TpItens.
     * 
     * @param dmMotDesIcms
     */
    public void setDmMotDesIcms(org.apache.axis.types.NonNegativeInteger dmMotDesIcms) {
        this.dmMotDesIcms = dmMotDesIcms;
    }


    /**
     * Gets the dmCodTribIssqn value for this TpItens.
     * 
     * @return dmCodTribIssqn
     */
    public java.lang.String getDmCodTribIssqn() {
        return dmCodTribIssqn;
    }


    /**
     * Sets the dmCodTribIssqn value for this TpItens.
     * 
     * @param dmCodTribIssqn
     */
    public void setDmCodTribIssqn(java.lang.String dmCodTribIssqn) {
        this.dmCodTribIssqn = dmCodTribIssqn;
    }


    /**
     * Gets the vlTotTribItem value for this TpItens.
     * 
     * @return vlTotTribItem
     */
    public java.math.BigDecimal getVlTotTribItem() {
        return vlTotTribItem;
    }


    /**
     * Sets the vlTotTribItem value for this TpItens.
     * 
     * @param vlTotTribItem
     */
    public void setVlTotTribItem(java.math.BigDecimal vlTotTribItem) {
        this.vlTotTribItem = vlTotTribItem;
    }


    /**
     * Gets the cnpjProdutor value for this TpItens.
     * 
     * @return cnpjProdutor
     */
    public java.lang.String getCnpjProdutor() {
        return cnpjProdutor;
    }


    /**
     * Sets the cnpjProdutor value for this TpItens.
     * 
     * @param cnpjProdutor
     */
    public void setCnpjProdutor(java.lang.String cnpjProdutor) {
        this.cnpjProdutor = cnpjProdutor;
    }


    /**
     * Gets the qtdeSeloIpi value for this TpItens.
     * 
     * @return qtdeSeloIpi
     */
    public java.math.BigInteger getQtdeSeloIpi() {
        return qtdeSeloIpi;
    }


    /**
     * Sets the qtdeSeloIpi value for this TpItens.
     * 
     * @param qtdeSeloIpi
     */
    public void setQtdeSeloIpi(java.math.BigInteger qtdeSeloIpi) {
        this.qtdeSeloIpi = qtdeSeloIpi;
    }


    /**
     * Gets the percentDevolMerc value for this TpItens.
     * 
     * @return percentDevolMerc
     */
    public java.math.BigInteger getPercentDevolMerc() {
        return percentDevolMerc;
    }


    /**
     * Sets the percentDevolMerc value for this TpItens.
     * 
     * @param percentDevolMerc
     */
    public void setPercentDevolMerc(java.math.BigInteger percentDevolMerc) {
        this.percentDevolMerc = percentDevolMerc;
    }


    /**
     * Gets the vlIpiDevol value for this TpItens.
     * 
     * @return vlIpiDevol
     */
    public java.math.BigDecimal getVlIpiDevol() {
        return vlIpiDevol;
    }


    /**
     * Sets the vlIpiDevol value for this TpItens.
     * 
     * @param vlIpiDevol
     */
    public void setVlIpiDevol(java.math.BigDecimal vlIpiDevol) {
        this.vlIpiDevol = vlIpiDevol;
    }


    /**
     * Gets the vlDespAdu value for this TpItens.
     * 
     * @return vlDespAdu
     */
    public java.math.BigDecimal getVlDespAdu() {
        return vlDespAdu;
    }


    /**
     * Sets the vlDespAdu value for this TpItens.
     * 
     * @param vlDespAdu
     */
    public void setVlDespAdu(java.math.BigDecimal vlDespAdu) {
        this.vlDespAdu = vlDespAdu;
    }


    /**
     * Gets the vlIof value for this TpItens.
     * 
     * @return vlIof
     */
    public java.math.BigDecimal getVlIof() {
        return vlIof;
    }


    /**
     * Sets the vlIof value for this TpItens.
     * 
     * @param vlIof
     */
    public void setVlIof(java.math.BigDecimal vlIof) {
        this.vlIof = vlIof;
    }


    /**
     * Gets the clEnqIpi value for this TpItens.
     * 
     * @return clEnqIpi
     */
    public java.lang.String getClEnqIpi() {
        return clEnqIpi;
    }


    /**
     * Sets the clEnqIpi value for this TpItens.
     * 
     * @param clEnqIpi
     */
    public void setClEnqIpi(java.lang.String clEnqIpi) {
        this.clEnqIpi = clEnqIpi;
    }


    /**
     * Gets the codSeloIpi value for this TpItens.
     * 
     * @return codSeloIpi
     */
    public java.lang.String getCodSeloIpi() {
        return codSeloIpi;
    }


    /**
     * Sets the codSeloIpi value for this TpItens.
     * 
     * @param codSeloIpi
     */
    public void setCodSeloIpi(java.lang.String codSeloIpi) {
        this.codSeloIpi = codSeloIpi;
    }


    /**
     * Gets the codEnqIpi value for this TpItens.
     * 
     * @return codEnqIpi
     */
    public java.lang.String getCodEnqIpi() {
        return codEnqIpi;
    }


    /**
     * Sets the codEnqIpi value for this TpItens.
     * 
     * @param codEnqIpi
     */
    public void setCodEnqIpi(java.lang.String codEnqIpi) {
        this.codEnqIpi = codEnqIpi;
    }


    /**
     * Gets the cidadeIbge value for this TpItens.
     * 
     * @return cidadeIbge
     */
    public java.lang.String getCidadeIbge() {
        return cidadeIbge;
    }


    /**
     * Sets the cidadeIbge value for this TpItens.
     * 
     * @param cidadeIbge
     */
    public void setCidadeIbge(java.lang.String cidadeIbge) {
        this.cidadeIbge = cidadeIbge;
    }


    /**
     * Gets the cdListaServ value for this TpItens.
     * 
     * @return cdListaServ
     */
    public java.math.BigInteger getCdListaServ() {
        return cdListaServ;
    }


    /**
     * Sets the cdListaServ value for this TpItens.
     * 
     * @param cdListaServ
     */
    public void setCdListaServ(java.math.BigInteger cdListaServ) {
        this.cdListaServ = cdListaServ;
    }


    /**
     * Gets the dmIndApurIpi value for this TpItens.
     * 
     * @return dmIndApurIpi
     */
    public org.apache.axis.types.NonNegativeInteger getDmIndApurIpi() {
        return dmIndApurIpi;
    }


    /**
     * Sets the dmIndApurIpi value for this TpItens.
     * 
     * @param dmIndApurIpi
     */
    public void setDmIndApurIpi(org.apache.axis.types.NonNegativeInteger dmIndApurIpi) {
        this.dmIndApurIpi = dmIndApurIpi;
    }


    /**
     * Gets the codCta value for this TpItens.
     * 
     * @return codCta
     */
    public java.lang.String getCodCta() {
        return codCta;
    }


    /**
     * Sets the codCta value for this TpItens.
     * 
     * @param codCta
     */
    public void setCodCta(java.lang.String codCta) {
        this.codCta = codCta;
    }


    /**
     * Gets the classConsItemCont value for this TpItens.
     * 
     * @return classConsItemCont
     */
    public java.lang.String getClassConsItemCont() {
        return classConsItemCont;
    }


    /**
     * Sets the classConsItemCont value for this TpItens.
     * 
     * @param classConsItemCont
     */
    public void setClassConsItemCont(java.lang.String classConsItemCont) {
        this.classConsItemCont = classConsItemCont;
    }


    /**
     * Gets the dmIndReceita value for this TpItens.
     * 
     * @return dmIndReceita
     */
    public org.apache.axis.types.NonNegativeInteger getDmIndReceita() {
        return dmIndReceita;
    }


    /**
     * Sets the dmIndReceita value for this TpItens.
     * 
     * @param dmIndReceita
     */
    public void setDmIndReceita(org.apache.axis.types.NonNegativeInteger dmIndReceita) {
        this.dmIndReceita = dmIndReceita;
    }


    /**
     * Gets the codPart value for this TpItens.
     * 
     * @return codPart
     */
    public java.lang.String getCodPart() {
        return codPart;
    }


    /**
     * Sets the codPart value for this TpItens.
     * 
     * @param codPart
     */
    public void setCodPart(java.lang.String codPart) {
        this.codPart = codPart;
    }


    /**
     * Gets the dmIndRecComEnergiaEletrica value for this TpItens.
     * 
     * @return dmIndRecComEnergiaEletrica
     */
    public org.apache.axis.types.NonNegativeInteger getDmIndRecComEnergiaEletrica() {
        return dmIndRecComEnergiaEletrica;
    }


    /**
     * Sets the dmIndRecComEnergiaEletrica value for this TpItens.
     * 
     * @param dmIndRecComEnergiaEletrica
     */
    public void setDmIndRecComEnergiaEletrica(org.apache.axis.types.NonNegativeInteger dmIndRecComEnergiaEletrica) {
        this.dmIndRecComEnergiaEletrica = dmIndRecComEnergiaEletrica;
    }


    /**
     * Gets the codigoNaturezaOperacao value for this TpItens.
     * 
     * @return codigoNaturezaOperacao
     */
    public java.lang.String getCodigoNaturezaOperacao() {
        return codigoNaturezaOperacao;
    }


    /**
     * Sets the codigoNaturezaOperacao value for this TpItens.
     * 
     * @param codigoNaturezaOperacao
     */
    public void setCodigoNaturezaOperacao(java.lang.String codigoNaturezaOperacao) {
        this.codigoNaturezaOperacao = codigoNaturezaOperacao;
    }


    /**
     * Gets the pedidoCompra value for this TpItens.
     * 
     * @return pedidoCompra
     */
    public java.lang.String getPedidoCompra() {
        return pedidoCompra;
    }


    /**
     * Sets the pedidoCompra value for this TpItens.
     * 
     * @param pedidoCompra
     */
    public void setPedidoCompra(java.lang.String pedidoCompra) {
        this.pedidoCompra = pedidoCompra;
    }


    /**
     * Gets the itemPedidoCompra value for this TpItens.
     * 
     * @return itemPedidoCompra
     */
    public java.math.BigInteger getItemPedidoCompra() {
        return itemPedidoCompra;
    }


    /**
     * Sets the itemPedidoCompra value for this TpItens.
     * 
     * @param itemPedidoCompra
     */
    public void setItemPedidoCompra(java.math.BigInteger itemPedidoCompra) {
        this.itemPedidoCompra = itemPedidoCompra;
    }


    /**
     * Gets the nroFci value for this TpItens.
     * 
     * @return nroFci
     */
    public java.lang.String getNroFci() {
        return nroFci;
    }


    /**
     * Sets the nroFci value for this TpItens.
     * 
     * @param nroFci
     */
    public void setNroFci(java.lang.String nroFci) {
        this.nroFci = nroFci;
    }


    /**
     * Gets the nroRecopi value for this TpItens.
     * 
     * @return nroRecopi
     */
    public java.lang.String getNroRecopi() {
        return nroRecopi;
    }


    /**
     * Sets the nroRecopi value for this TpItens.
     * 
     * @param nroRecopi
     */
    public void setNroRecopi(java.lang.String nroRecopi) {
        this.nroRecopi = nroRecopi;
    }


    /**
     * Gets the difAliqIcms value for this TpItens.
     * 
     * @return difAliqIcms
     */
    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpDifAliqIcms getDifAliqIcms() {
        return difAliqIcms;
    }


    /**
     * Sets the difAliqIcms value for this TpItens.
     * 
     * @param difAliqIcms
     */
    public void setDifAliqIcms(br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpDifAliqIcms difAliqIcms) {
        this.difAliqIcms = difAliqIcms;
    }


    /**
     * Gets the impostos value for this TpItens.
     * 
     * @return impostos
     */
    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpImpostos[] getImpostos() {
        return impostos;
    }


    /**
     * Sets the impostos value for this TpItens.
     * 
     * @param impostos
     */
    public void setImpostos(br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpImpostos[] impostos) {
        this.impostos = impostos;
    }

    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpImpostos getImpostos(int i) {
        return this.impostos[i];
    }

    public void setImpostos(int i, br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpImpostos _value) {
        this.impostos[i] = _value;
    }


    /**
     * Gets the dadosComb value for this TpItens.
     * 
     * @return dadosComb
     */
    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpDadosComb getDadosComb() {
        return dadosComb;
    }


    /**
     * Sets the dadosComb value for this TpItens.
     * 
     * @param dadosComb
     */
    public void setDadosComb(br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpDadosComb dadosComb) {
        this.dadosComb = dadosComb;
    }


    /**
     * Gets the dadosVeic value for this TpItens.
     * 
     * @return dadosVeic
     */
    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpDadosVeic getDadosVeic() {
        return dadosVeic;
    }


    /**
     * Sets the dadosVeic value for this TpItens.
     * 
     * @param dadosVeic
     */
    public void setDadosVeic(br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpDadosVeic dadosVeic) {
        this.dadosVeic = dadosVeic;
    }


    /**
     * Gets the dadosMed value for this TpItens.
     * 
     * @return dadosMed
     */
    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpDadosMed[] getDadosMed() {
        return dadosMed;
    }


    /**
     * Sets the dadosMed value for this TpItens.
     * 
     * @param dadosMed
     */
    public void setDadosMed(br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpDadosMed[] dadosMed) {
        this.dadosMed = dadosMed;
    }

    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpDadosMed getDadosMed(int i) {
        return this.dadosMed[i];
    }

    public void setDadosMed(int i, br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpDadosMed _value) {
        this.dadosMed[i] = _value;
    }


    /**
     * Gets the dadosArma value for this TpItens.
     * 
     * @return dadosArma
     */
    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpDadosArma[] getDadosArma() {
        return dadosArma;
    }


    /**
     * Sets the dadosArma value for this TpItens.
     * 
     * @param dadosArma
     */
    public void setDadosArma(br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpDadosArma[] dadosArma) {
        this.dadosArma = dadosArma;
    }

    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpDadosArma getDadosArma(int i) {
        return this.dadosArma[i];
    }

    public void setDadosArma(int i, br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpDadosArma _value) {
        this.dadosArma[i] = _value;
    }


    /**
     * Gets the decImpor value for this TpItens.
     * 
     * @return decImpor
     */
    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpDecImpor[] getDecImpor() {
        return decImpor;
    }


    /**
     * Sets the decImpor value for this TpItens.
     * 
     * @param decImpor
     */
    public void setDecImpor(br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpDecImpor[] decImpor) {
        this.decImpor = decImpor;
    }

    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpDecImpor getDecImpor(int i) {
        return this.decImpor[i];
    }

    public void setDecImpor(int i, br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpDecImpor _value) {
        this.decImpor[i] = _value;
    }


    /**
     * Gets the complTransp value for this TpItens.
     * 
     * @return complTransp
     */
    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpComplTransp getComplTransp() {
        return complTransp;
    }


    /**
     * Sets the complTransp value for this TpItens.
     * 
     * @param complTransp
     */
    public void setComplTransp(br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpComplTransp complTransp) {
        this.complTransp = complTransp;
    }


    /**
     * Gets the export value for this TpItens.
     * 
     * @return export
     */
    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpExport[] getExport() {
        return export;
    }


    /**
     * Sets the export value for this TpItens.
     * 
     * @param export
     */
    public void setExport(br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpExport[] export) {
        this.export = export;
    }

    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpExport getExport(int i) {
        return this.export[i];
    }

    public void setExport(int i, br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpExport _value) {
        this.export[i] = _value;
    }


    /**
     * Gets the nve value for this TpItens.
     * 
     * @return nve
     */
    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpNve[] getNve() {
        return nve;
    }


    /**
     * Sets the nve value for this TpItens.
     * 
     * @param nve
     */
    public void setNve(br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpNve[] nve) {
        this.nve = nve;
    }

    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpNve getNve(int i) {
        return this.nve[i];
    }

    public void setNve(int i, br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpNve _value) {
        this.nve[i] = _value;
    }


    /**
     * Gets the complServ value for this TpItens.
     * 
     * @return complServ
     */
    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpComplServ getComplServ() {
        return complServ;
    }


    /**
     * Sets the complServ value for this TpItens.
     * 
     * @param complServ
     */
    public void setComplServ(br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpComplServ complServ) {
        this.complServ = complServ;
    }


    /**
     * Gets the cest value for this TpItens.
     * 
     * @return cest
     */
    public java.math.BigInteger getCest() {
        return cest;
    }


    /**
     * Sets the cest value for this TpItens.
     * 
     * @param cest
     */
    public void setCest(java.math.BigInteger cest) {
        this.cest = cest;
    }


    /**
     * Gets the dmIndEscRel value for this TpItens.
     * 
     * @return dmIndEscRel
     */
    public java.lang.String getDmIndEscRel() {
        return dmIndEscRel;
    }


    /**
     * Sets the dmIndEscRel value for this TpItens.
     * 
     * @param dmIndEscRel
     */
    public void setDmIndEscRel(java.lang.String dmIndEscRel) {
        this.dmIndEscRel = dmIndEscRel;
    }


    /**
     * Gets the cnpjFabMerc value for this TpItens.
     * 
     * @return cnpjFabMerc
     */
    public java.lang.String getCnpjFabMerc() {
        return cnpjFabMerc;
    }


    /**
     * Sets the cnpjFabMerc value for this TpItens.
     * 
     * @param cnpjFabMerc
     */
    public void setCnpjFabMerc(java.lang.String cnpjFabMerc) {
        this.cnpjFabMerc = cnpjFabMerc;
    }


    /**
     * Gets the codOcorAjIcms value for this TpItens.
     * 
     * @return codOcorAjIcms
     */
    public java.lang.String getCodOcorAjIcms() {
        return codOcorAjIcms;
    }


    /**
     * Sets the codOcorAjIcms value for this TpItens.
     * 
     * @param codOcorAjIcms
     */
    public void setCodOcorAjIcms(java.lang.String codOcorAjIcms) {
        this.codOcorAjIcms = codOcorAjIcms;
    }


    /**
     * Gets the rastreab value for this TpItens.
     * 
     * @return rastreab
     */
    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpRastreab[] getRastreab() {
        return rastreab;
    }


    /**
     * Sets the rastreab value for this TpItens.
     * 
     * @param rastreab
     */
    public void setRastreab(br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpRastreab[] rastreab) {
        this.rastreab = rastreab;
    }

    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpRastreab getRastreab(int i) {
        return this.rastreab[i];
    }

    public void setRastreab(int i, br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpRastreab _value) {
        this.rastreab[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TpItens)) return false;
        TpItens other = (TpItens) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nroItem==null && other.getNroItem()==null) || 
             (this.nroItem!=null &&
              this.nroItem.equals(other.getNroItem()))) &&
            ((this.codItem==null && other.getCodItem()==null) || 
             (this.codItem!=null &&
              this.codItem.equals(other.getCodItem()))) &&
            ((this.descrItem==null && other.getDescrItem()==null) || 
             (this.descrItem!=null &&
              this.descrItem.equals(other.getDescrItem()))) &&
            ((this.dmIndMov==null && other.getDmIndMov()==null) || 
             (this.dmIndMov!=null &&
              this.dmIndMov.equals(other.getDmIndMov()))) &&
            ((this.cEan==null && other.getCEan()==null) || 
             (this.cEan!=null &&
              this.cEan.equals(other.getCEan()))) &&
            ((this.codNcm==null && other.getCodNcm()==null) || 
             (this.codNcm!=null &&
              this.codNcm.equals(other.getCodNcm()))) &&
            ((this.generoNcm==null && other.getGeneroNcm()==null) || 
             (this.generoNcm!=null &&
              this.generoNcm.equals(other.getGeneroNcm()))) &&
            ((this.codExTipi==null && other.getCodExTipi()==null) || 
             (this.codExTipi!=null &&
              this.codExTipi.equals(other.getCodExTipi()))) &&
            ((this.cfop==null && other.getCfop()==null) || 
             (this.cfop!=null &&
              this.cfop.equals(other.getCfop()))) &&
            ((this.unidCom==null && other.getUnidCom()==null) || 
             (this.unidCom!=null &&
              this.unidCom.equals(other.getUnidCom()))) &&
            ((this.qtdeComerc==null && other.getQtdeComerc()==null) || 
             (this.qtdeComerc!=null &&
              this.qtdeComerc.equals(other.getQtdeComerc()))) &&
            ((this.vlUnitComerc==null && other.getVlUnitComerc()==null) || 
             (this.vlUnitComerc!=null &&
              this.vlUnitComerc.equals(other.getVlUnitComerc()))) &&
            ((this.vlItemBruto==null && other.getVlItemBruto()==null) || 
             (this.vlItemBruto!=null &&
              this.vlItemBruto.equals(other.getVlItemBruto()))) &&
            ((this.cEanTrib==null && other.getCEanTrib()==null) || 
             (this.cEanTrib!=null &&
              this.cEanTrib.equals(other.getCEanTrib()))) &&
            ((this.unidTrib==null && other.getUnidTrib()==null) || 
             (this.unidTrib!=null &&
              this.unidTrib.equals(other.getUnidTrib()))) &&
            ((this.qtdeTribs==null && other.getQtdeTribs()==null) || 
             (this.qtdeTribs!=null &&
              this.qtdeTribs.equals(other.getQtdeTribs()))) &&
            ((this.vlUnitTrib==null && other.getVlUnitTrib()==null) || 
             (this.vlUnitTrib!=null &&
              this.vlUnitTrib.equals(other.getVlUnitTrib()))) &&
            ((this.vlFrete==null && other.getVlFrete()==null) || 
             (this.vlFrete!=null &&
              this.vlFrete.equals(other.getVlFrete()))) &&
            ((this.vlSeguro==null && other.getVlSeguro()==null) || 
             (this.vlSeguro!=null &&
              this.vlSeguro.equals(other.getVlSeguro()))) &&
            ((this.vlOutro==null && other.getVlOutro()==null) || 
             (this.vlOutro!=null &&
              this.vlOutro.equals(other.getVlOutro()))) &&
            ((this.vlDesc==null && other.getVlDesc()==null) || 
             (this.vlDesc!=null &&
              this.vlDesc.equals(other.getVlDesc()))) &&
            ((this.infAdProd==null && other.getInfAdProd()==null) || 
             (this.infAdProd!=null &&
              this.infAdProd.equals(other.getInfAdProd()))) &&
            ((this.dmOrigProd==null && other.getDmOrigProd()==null) || 
             (this.dmOrigProd!=null &&
              this.dmOrigProd.equals(other.getDmOrigProd()))) &&
            ((this.dmModBaseCalcIcms==null && other.getDmModBaseCalcIcms()==null) || 
             (this.dmModBaseCalcIcms!=null &&
              this.dmModBaseCalcIcms.equals(other.getDmModBaseCalcIcms()))) &&
            ((this.dmModBaseCalcIcmsSt==null && other.getDmModBaseCalcIcmsSt()==null) || 
             (this.dmModBaseCalcIcmsSt!=null &&
              this.dmModBaseCalcIcmsSt.equals(other.getDmModBaseCalcIcmsSt()))) &&
            ((this.dmIndTot==null && other.getDmIndTot()==null) || 
             (this.dmIndTot!=null &&
              this.dmIndTot.equals(other.getDmIndTot()))) &&
            ((this.dmMotDesIcms==null && other.getDmMotDesIcms()==null) || 
             (this.dmMotDesIcms!=null &&
              this.dmMotDesIcms.equals(other.getDmMotDesIcms()))) &&
            ((this.dmCodTribIssqn==null && other.getDmCodTribIssqn()==null) || 
             (this.dmCodTribIssqn!=null &&
              this.dmCodTribIssqn.equals(other.getDmCodTribIssqn()))) &&
            ((this.vlTotTribItem==null && other.getVlTotTribItem()==null) || 
             (this.vlTotTribItem!=null &&
              this.vlTotTribItem.equals(other.getVlTotTribItem()))) &&
            ((this.cnpjProdutor==null && other.getCnpjProdutor()==null) || 
             (this.cnpjProdutor!=null &&
              this.cnpjProdutor.equals(other.getCnpjProdutor()))) &&
            ((this.qtdeSeloIpi==null && other.getQtdeSeloIpi()==null) || 
             (this.qtdeSeloIpi!=null &&
              this.qtdeSeloIpi.equals(other.getQtdeSeloIpi()))) &&
            ((this.percentDevolMerc==null && other.getPercentDevolMerc()==null) || 
             (this.percentDevolMerc!=null &&
              this.percentDevolMerc.equals(other.getPercentDevolMerc()))) &&
            ((this.vlIpiDevol==null && other.getVlIpiDevol()==null) || 
             (this.vlIpiDevol!=null &&
              this.vlIpiDevol.equals(other.getVlIpiDevol()))) &&
            ((this.vlDespAdu==null && other.getVlDespAdu()==null) || 
             (this.vlDespAdu!=null &&
              this.vlDespAdu.equals(other.getVlDespAdu()))) &&
            ((this.vlIof==null && other.getVlIof()==null) || 
             (this.vlIof!=null &&
              this.vlIof.equals(other.getVlIof()))) &&
            ((this.clEnqIpi==null && other.getClEnqIpi()==null) || 
             (this.clEnqIpi!=null &&
              this.clEnqIpi.equals(other.getClEnqIpi()))) &&
            ((this.codSeloIpi==null && other.getCodSeloIpi()==null) || 
             (this.codSeloIpi!=null &&
              this.codSeloIpi.equals(other.getCodSeloIpi()))) &&
            ((this.codEnqIpi==null && other.getCodEnqIpi()==null) || 
             (this.codEnqIpi!=null &&
              this.codEnqIpi.equals(other.getCodEnqIpi()))) &&
            ((this.cidadeIbge==null && other.getCidadeIbge()==null) || 
             (this.cidadeIbge!=null &&
              this.cidadeIbge.equals(other.getCidadeIbge()))) &&
            ((this.cdListaServ==null && other.getCdListaServ()==null) || 
             (this.cdListaServ!=null &&
              this.cdListaServ.equals(other.getCdListaServ()))) &&
            ((this.dmIndApurIpi==null && other.getDmIndApurIpi()==null) || 
             (this.dmIndApurIpi!=null &&
              this.dmIndApurIpi.equals(other.getDmIndApurIpi()))) &&
            ((this.codCta==null && other.getCodCta()==null) || 
             (this.codCta!=null &&
              this.codCta.equals(other.getCodCta()))) &&
            ((this.classConsItemCont==null && other.getClassConsItemCont()==null) || 
             (this.classConsItemCont!=null &&
              this.classConsItemCont.equals(other.getClassConsItemCont()))) &&
            ((this.dmIndReceita==null && other.getDmIndReceita()==null) || 
             (this.dmIndReceita!=null &&
              this.dmIndReceita.equals(other.getDmIndReceita()))) &&
            ((this.codPart==null && other.getCodPart()==null) || 
             (this.codPart!=null &&
              this.codPart.equals(other.getCodPart()))) &&
            ((this.dmIndRecComEnergiaEletrica==null && other.getDmIndRecComEnergiaEletrica()==null) || 
             (this.dmIndRecComEnergiaEletrica!=null &&
              this.dmIndRecComEnergiaEletrica.equals(other.getDmIndRecComEnergiaEletrica()))) &&
            ((this.codigoNaturezaOperacao==null && other.getCodigoNaturezaOperacao()==null) || 
             (this.codigoNaturezaOperacao!=null &&
              this.codigoNaturezaOperacao.equals(other.getCodigoNaturezaOperacao()))) &&
            ((this.pedidoCompra==null && other.getPedidoCompra()==null) || 
             (this.pedidoCompra!=null &&
              this.pedidoCompra.equals(other.getPedidoCompra()))) &&
            ((this.itemPedidoCompra==null && other.getItemPedidoCompra()==null) || 
             (this.itemPedidoCompra!=null &&
              this.itemPedidoCompra.equals(other.getItemPedidoCompra()))) &&
            ((this.nroFci==null && other.getNroFci()==null) || 
             (this.nroFci!=null &&
              this.nroFci.equals(other.getNroFci()))) &&
            ((this.nroRecopi==null && other.getNroRecopi()==null) || 
             (this.nroRecopi!=null &&
              this.nroRecopi.equals(other.getNroRecopi()))) &&
            ((this.difAliqIcms==null && other.getDifAliqIcms()==null) || 
             (this.difAliqIcms!=null &&
              this.difAliqIcms.equals(other.getDifAliqIcms()))) &&
            ((this.impostos==null && other.getImpostos()==null) || 
             (this.impostos!=null &&
              java.util.Arrays.equals(this.impostos, other.getImpostos()))) &&
            ((this.dadosComb==null && other.getDadosComb()==null) || 
             (this.dadosComb!=null &&
              this.dadosComb.equals(other.getDadosComb()))) &&
            ((this.dadosVeic==null && other.getDadosVeic()==null) || 
             (this.dadosVeic!=null &&
              this.dadosVeic.equals(other.getDadosVeic()))) &&
            ((this.dadosMed==null && other.getDadosMed()==null) || 
             (this.dadosMed!=null &&
              java.util.Arrays.equals(this.dadosMed, other.getDadosMed()))) &&
            ((this.dadosArma==null && other.getDadosArma()==null) || 
             (this.dadosArma!=null &&
              java.util.Arrays.equals(this.dadosArma, other.getDadosArma()))) &&
            ((this.decImpor==null && other.getDecImpor()==null) || 
             (this.decImpor!=null &&
              java.util.Arrays.equals(this.decImpor, other.getDecImpor()))) &&
            ((this.complTransp==null && other.getComplTransp()==null) || 
             (this.complTransp!=null &&
              this.complTransp.equals(other.getComplTransp()))) &&
            ((this.export==null && other.getExport()==null) || 
             (this.export!=null &&
              java.util.Arrays.equals(this.export, other.getExport()))) &&
            ((this.nve==null && other.getNve()==null) || 
             (this.nve!=null &&
              java.util.Arrays.equals(this.nve, other.getNve()))) &&
            ((this.complServ==null && other.getComplServ()==null) || 
             (this.complServ!=null &&
              this.complServ.equals(other.getComplServ()))) &&
            ((this.cest==null && other.getCest()==null) || 
             (this.cest!=null &&
              this.cest.equals(other.getCest()))) &&
            ((this.dmIndEscRel==null && other.getDmIndEscRel()==null) || 
             (this.dmIndEscRel!=null &&
              this.dmIndEscRel.equals(other.getDmIndEscRel()))) &&
            ((this.cnpjFabMerc==null && other.getCnpjFabMerc()==null) || 
             (this.cnpjFabMerc!=null &&
              this.cnpjFabMerc.equals(other.getCnpjFabMerc()))) &&
            ((this.codOcorAjIcms==null && other.getCodOcorAjIcms()==null) || 
             (this.codOcorAjIcms!=null &&
              this.codOcorAjIcms.equals(other.getCodOcorAjIcms()))) &&
            ((this.rastreab==null && other.getRastreab()==null) || 
             (this.rastreab!=null &&
              java.util.Arrays.equals(this.rastreab, other.getRastreab())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getNroItem() != null) {
            _hashCode += getNroItem().hashCode();
        }
        if (getCodItem() != null) {
            _hashCode += getCodItem().hashCode();
        }
        if (getDescrItem() != null) {
            _hashCode += getDescrItem().hashCode();
        }
        if (getDmIndMov() != null) {
            _hashCode += getDmIndMov().hashCode();
        }
        if (getCEan() != null) {
            _hashCode += getCEan().hashCode();
        }
        if (getCodNcm() != null) {
            _hashCode += getCodNcm().hashCode();
        }
        if (getGeneroNcm() != null) {
            _hashCode += getGeneroNcm().hashCode();
        }
        if (getCodExTipi() != null) {
            _hashCode += getCodExTipi().hashCode();
        }
        if (getCfop() != null) {
            _hashCode += getCfop().hashCode();
        }
        if (getUnidCom() != null) {
            _hashCode += getUnidCom().hashCode();
        }
        if (getQtdeComerc() != null) {
            _hashCode += getQtdeComerc().hashCode();
        }
        if (getVlUnitComerc() != null) {
            _hashCode += getVlUnitComerc().hashCode();
        }
        if (getVlItemBruto() != null) {
            _hashCode += getVlItemBruto().hashCode();
        }
        if (getCEanTrib() != null) {
            _hashCode += getCEanTrib().hashCode();
        }
        if (getUnidTrib() != null) {
            _hashCode += getUnidTrib().hashCode();
        }
        if (getQtdeTribs() != null) {
            _hashCode += getQtdeTribs().hashCode();
        }
        if (getVlUnitTrib() != null) {
            _hashCode += getVlUnitTrib().hashCode();
        }
        if (getVlFrete() != null) {
            _hashCode += getVlFrete().hashCode();
        }
        if (getVlSeguro() != null) {
            _hashCode += getVlSeguro().hashCode();
        }
        if (getVlOutro() != null) {
            _hashCode += getVlOutro().hashCode();
        }
        if (getVlDesc() != null) {
            _hashCode += getVlDesc().hashCode();
        }
        if (getInfAdProd() != null) {
            _hashCode += getInfAdProd().hashCode();
        }
        if (getDmOrigProd() != null) {
            _hashCode += getDmOrigProd().hashCode();
        }
        if (getDmModBaseCalcIcms() != null) {
            _hashCode += getDmModBaseCalcIcms().hashCode();
        }
        if (getDmModBaseCalcIcmsSt() != null) {
            _hashCode += getDmModBaseCalcIcmsSt().hashCode();
        }
        if (getDmIndTot() != null) {
            _hashCode += getDmIndTot().hashCode();
        }
        if (getDmMotDesIcms() != null) {
            _hashCode += getDmMotDesIcms().hashCode();
        }
        if (getDmCodTribIssqn() != null) {
            _hashCode += getDmCodTribIssqn().hashCode();
        }
        if (getVlTotTribItem() != null) {
            _hashCode += getVlTotTribItem().hashCode();
        }
        if (getCnpjProdutor() != null) {
            _hashCode += getCnpjProdutor().hashCode();
        }
        if (getQtdeSeloIpi() != null) {
            _hashCode += getQtdeSeloIpi().hashCode();
        }
        if (getPercentDevolMerc() != null) {
            _hashCode += getPercentDevolMerc().hashCode();
        }
        if (getVlIpiDevol() != null) {
            _hashCode += getVlIpiDevol().hashCode();
        }
        if (getVlDespAdu() != null) {
            _hashCode += getVlDespAdu().hashCode();
        }
        if (getVlIof() != null) {
            _hashCode += getVlIof().hashCode();
        }
        if (getClEnqIpi() != null) {
            _hashCode += getClEnqIpi().hashCode();
        }
        if (getCodSeloIpi() != null) {
            _hashCode += getCodSeloIpi().hashCode();
        }
        if (getCodEnqIpi() != null) {
            _hashCode += getCodEnqIpi().hashCode();
        }
        if (getCidadeIbge() != null) {
            _hashCode += getCidadeIbge().hashCode();
        }
        if (getCdListaServ() != null) {
            _hashCode += getCdListaServ().hashCode();
        }
        if (getDmIndApurIpi() != null) {
            _hashCode += getDmIndApurIpi().hashCode();
        }
        if (getCodCta() != null) {
            _hashCode += getCodCta().hashCode();
        }
        if (getClassConsItemCont() != null) {
            _hashCode += getClassConsItemCont().hashCode();
        }
        if (getDmIndReceita() != null) {
            _hashCode += getDmIndReceita().hashCode();
        }
        if (getCodPart() != null) {
            _hashCode += getCodPart().hashCode();
        }
        if (getDmIndRecComEnergiaEletrica() != null) {
            _hashCode += getDmIndRecComEnergiaEletrica().hashCode();
        }
        if (getCodigoNaturezaOperacao() != null) {
            _hashCode += getCodigoNaturezaOperacao().hashCode();
        }
        if (getPedidoCompra() != null) {
            _hashCode += getPedidoCompra().hashCode();
        }
        if (getItemPedidoCompra() != null) {
            _hashCode += getItemPedidoCompra().hashCode();
        }
        if (getNroFci() != null) {
            _hashCode += getNroFci().hashCode();
        }
        if (getNroRecopi() != null) {
            _hashCode += getNroRecopi().hashCode();
        }
        if (getDifAliqIcms() != null) {
            _hashCode += getDifAliqIcms().hashCode();
        }
        if (getImpostos() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getImpostos());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getImpostos(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDadosComb() != null) {
            _hashCode += getDadosComb().hashCode();
        }
        if (getDadosVeic() != null) {
            _hashCode += getDadosVeic().hashCode();
        }
        if (getDadosMed() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDadosMed());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDadosMed(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDadosArma() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDadosArma());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDadosArma(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDecImpor() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDecImpor());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDecImpor(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getComplTransp() != null) {
            _hashCode += getComplTransp().hashCode();
        }
        if (getExport() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExport());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExport(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNve() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNve());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNve(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getComplServ() != null) {
            _hashCode += getComplServ().hashCode();
        }
        if (getCest() != null) {
            _hashCode += getCest().hashCode();
        }
        if (getDmIndEscRel() != null) {
            _hashCode += getDmIndEscRel().hashCode();
        }
        if (getCnpjFabMerc() != null) {
            _hashCode += getCnpjFabMerc().hashCode();
        }
        if (getCodOcorAjIcms() != null) {
            _hashCode += getCodOcorAjIcms().hashCode();
        }
        if (getRastreab() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRastreab());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRastreab(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TpItens.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "tpItens"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nroItem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "nroItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codItem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "codItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descrItem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "descrItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dmIndMov");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "dmIndMov"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "tpDominio"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CEan");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "cEan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codNcm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "codNcm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("generoNcm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "generoNcm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codExTipi");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "codExTipi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cfop");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "cfop"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unidCom");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "unidCom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qtdeComerc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "qtdeComerc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalFourPrec"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlUnitComerc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "vlUnitComerc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTenPrec"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlItemBruto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "vlItemBruto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CEanTrib");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "cEanTrib"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unidTrib");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "unidTrib"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qtdeTribs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "qtdeTribs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalFourPrec"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlUnitTrib");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "vlUnitTrib"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTenPrec"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlFrete");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "vlFrete"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlSeguro");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "vlSeguro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlOutro");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "vlOutro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "vlDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("infAdProd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "infAdProd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dmOrigProd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "dmOrigProd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dmModBaseCalcIcms");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "dmModBaseCalcIcms"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "tpDominio"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dmModBaseCalcIcmsSt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "dmModBaseCalcIcmsSt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "tpDominio"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dmIndTot");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "dmIndTot"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "tpDominio"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dmMotDesIcms");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "dmMotDesIcms"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "tpDominio"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dmCodTribIssqn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "dmCodTribIssqn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "tpStringSizeTwoComplementos"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlTotTribItem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "vlTotTribItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cnpjProdutor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "cnpjProdutor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qtdeSeloIpi");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "qtdeSeloIpi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("percentDevolMerc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "percentDevolMerc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlIpiDevol");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "vlIpiDevol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlDespAdu");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "vlDespAdu"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlIof");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "vlIof"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clEnqIpi");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "clEnqIpi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codSeloIpi");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "codSeloIpi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codEnqIpi");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "codEnqIpi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cidadeIbge");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "cidadeIbge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cdListaServ");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "cdListaServ"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dmIndApurIpi");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "dmIndApurIpi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "tpDominio"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codCta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "codCta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "tpStringSize255"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("classConsItemCont");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "classConsItemCont"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dmIndReceita");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "dmIndReceita"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "tpDominio"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codPart");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "codPart"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dmIndRecComEnergiaEletrica");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "dmIndRecComEnergiaEletrica"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "tpDominio"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoNaturezaOperacao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "codigoNaturezaOperacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pedidoCompra");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "pedidoCompra"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemPedidoCompra");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "itemPedidoCompra"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nroFci");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "nroFci"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nroRecopi");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "nroRecopi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("difAliqIcms");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "difAliqIcms"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "tpDifAliqIcms"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("impostos");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "impostos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "tpImpostos"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dadosComb");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "dadosComb"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "tpDadosComb"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dadosVeic");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "dadosVeic"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "tpDadosVeic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dadosMed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "dadosMed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "tpDadosMed"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dadosArma");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "dadosArma"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "tpDadosArma"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("decImpor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "decImpor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "tpDecImpor"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("complTransp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "complTransp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "tpComplTransp"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("export");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "export"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "tpExport"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nve");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "nve"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "tpNve"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("complServ");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "complServ"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "tpComplServ"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "cest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dmIndEscRel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "dmIndEscRel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cnpjFabMerc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "cnpjFabMerc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codOcorAjIcms");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "codOcorAjIcms"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rastreab");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "rastreab"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "tpRastreab"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
