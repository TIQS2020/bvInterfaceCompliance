/**
 * TpTotaisNf.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil;

public class TpTotaisNf  implements java.io.Serializable {
    private java.math.BigDecimal vlBaseCalcIcms;

    private java.math.BigDecimal vlImpTribIcms;

    private java.math.BigDecimal vlBaseCalcIcmsSt;

    private java.math.BigDecimal vlImpTribIcmsSt;

    private java.math.BigDecimal vlTotalItem;

    private java.math.BigDecimal vlFrete;

    private java.math.BigDecimal vlSeguro;

    private java.math.BigDecimal vlDesconto;

    private java.math.BigDecimal vlImpTribII;

    private java.math.BigDecimal vlImpTribIpi;

    private java.math.BigDecimal vlImpTribPis;

    private java.math.BigDecimal vlImpTribCofins;

    private java.math.BigDecimal vlOutrasDespesas;

    private java.math.BigDecimal vlTotalNf;

    private java.math.BigDecimal vlServNaoTrib;

    private java.math.BigDecimal vlBaseCalcIss;

    private java.math.BigDecimal vlImpTribIss;

    private java.math.BigDecimal vlPisIss;

    private java.math.BigDecimal vlCofinsIss;

    private java.math.BigDecimal vlRetPis;

    private java.math.BigDecimal vlRetCofins;

    private java.math.BigDecimal vlRetCsll;

    private java.math.BigDecimal vlBaseCalcIrrf;

    private java.math.BigDecimal vlRetIrrf;

    private java.math.BigDecimal vlBaseCalcPrev;

    private java.math.BigDecimal vlRetPrev;

    private java.math.BigDecimal vlTotalServ;

    private java.math.BigDecimal vlAbatNt;

    private java.math.BigDecimal vlForn;

    private java.math.BigDecimal vlTerc;

    private java.math.BigDecimal vlServico;

    private java.math.BigDecimal vlRetIss;

    private java.math.BigDecimal vlTotTrib;

    private java.math.BigDecimal vlIcmsDeson;

    private java.math.BigDecimal vlDeducao;

    private java.math.BigDecimal vlOutraRet;

    private java.math.BigDecimal vlDescIncond;

    private java.math.BigDecimal vlDescCond;

    private java.math.BigDecimal vlIcmsUfDest;

    private java.math.BigDecimal vlIcmsUfRemet;

    private java.math.BigDecimal vlCombPobrUfDest;

    private java.math.BigDecimal vlFCP;

    private java.math.BigDecimal vlFCPST;

    private java.math.BigDecimal vlFCPSTRet;

    private java.math.BigDecimal vlIPIDevol;

    public TpTotaisNf() {
    }

    public TpTotaisNf(
           java.math.BigDecimal vlBaseCalcIcms,
           java.math.BigDecimal vlImpTribIcms,
           java.math.BigDecimal vlBaseCalcIcmsSt,
           java.math.BigDecimal vlImpTribIcmsSt,
           java.math.BigDecimal vlTotalItem,
           java.math.BigDecimal vlFrete,
           java.math.BigDecimal vlSeguro,
           java.math.BigDecimal vlDesconto,
           java.math.BigDecimal vlImpTribII,
           java.math.BigDecimal vlImpTribIpi,
           java.math.BigDecimal vlImpTribPis,
           java.math.BigDecimal vlImpTribCofins,
           java.math.BigDecimal vlOutrasDespesas,
           java.math.BigDecimal vlTotalNf,
           java.math.BigDecimal vlServNaoTrib,
           java.math.BigDecimal vlBaseCalcIss,
           java.math.BigDecimal vlImpTribIss,
           java.math.BigDecimal vlPisIss,
           java.math.BigDecimal vlCofinsIss,
           java.math.BigDecimal vlRetPis,
           java.math.BigDecimal vlRetCofins,
           java.math.BigDecimal vlRetCsll,
           java.math.BigDecimal vlBaseCalcIrrf,
           java.math.BigDecimal vlRetIrrf,
           java.math.BigDecimal vlBaseCalcPrev,
           java.math.BigDecimal vlRetPrev,
           java.math.BigDecimal vlTotalServ,
           java.math.BigDecimal vlAbatNt,
           java.math.BigDecimal vlForn,
           java.math.BigDecimal vlTerc,
           java.math.BigDecimal vlServico,
           java.math.BigDecimal vlRetIss,
           java.math.BigDecimal vlTotTrib,
           java.math.BigDecimal vlIcmsDeson,
           java.math.BigDecimal vlDeducao,
           java.math.BigDecimal vlOutraRet,
           java.math.BigDecimal vlDescIncond,
           java.math.BigDecimal vlDescCond,
           java.math.BigDecimal vlIcmsUfDest,
           java.math.BigDecimal vlIcmsUfRemet,
           java.math.BigDecimal vlCombPobrUfDest,
           java.math.BigDecimal vlFCP,
           java.math.BigDecimal vlFCPST,
           java.math.BigDecimal vlFCPSTRet,
           java.math.BigDecimal vlIPIDevol) {
           this.vlBaseCalcIcms = vlBaseCalcIcms;
           this.vlImpTribIcms = vlImpTribIcms;
           this.vlBaseCalcIcmsSt = vlBaseCalcIcmsSt;
           this.vlImpTribIcmsSt = vlImpTribIcmsSt;
           this.vlTotalItem = vlTotalItem;
           this.vlFrete = vlFrete;
           this.vlSeguro = vlSeguro;
           this.vlDesconto = vlDesconto;
           this.vlImpTribII = vlImpTribII;
           this.vlImpTribIpi = vlImpTribIpi;
           this.vlImpTribPis = vlImpTribPis;
           this.vlImpTribCofins = vlImpTribCofins;
           this.vlOutrasDespesas = vlOutrasDespesas;
           this.vlTotalNf = vlTotalNf;
           this.vlServNaoTrib = vlServNaoTrib;
           this.vlBaseCalcIss = vlBaseCalcIss;
           this.vlImpTribIss = vlImpTribIss;
           this.vlPisIss = vlPisIss;
           this.vlCofinsIss = vlCofinsIss;
           this.vlRetPis = vlRetPis;
           this.vlRetCofins = vlRetCofins;
           this.vlRetCsll = vlRetCsll;
           this.vlBaseCalcIrrf = vlBaseCalcIrrf;
           this.vlRetIrrf = vlRetIrrf;
           this.vlBaseCalcPrev = vlBaseCalcPrev;
           this.vlRetPrev = vlRetPrev;
           this.vlTotalServ = vlTotalServ;
           this.vlAbatNt = vlAbatNt;
           this.vlForn = vlForn;
           this.vlTerc = vlTerc;
           this.vlServico = vlServico;
           this.vlRetIss = vlRetIss;
           this.vlTotTrib = vlTotTrib;
           this.vlIcmsDeson = vlIcmsDeson;
           this.vlDeducao = vlDeducao;
           this.vlOutraRet = vlOutraRet;
           this.vlDescIncond = vlDescIncond;
           this.vlDescCond = vlDescCond;
           this.vlIcmsUfDest = vlIcmsUfDest;
           this.vlIcmsUfRemet = vlIcmsUfRemet;
           this.vlCombPobrUfDest = vlCombPobrUfDest;
           this.vlFCP = vlFCP;
           this.vlFCPST = vlFCPST;
           this.vlFCPSTRet = vlFCPSTRet;
           this.vlIPIDevol = vlIPIDevol;
    }


    /**
     * Gets the vlBaseCalcIcms value for this TpTotaisNf.
     * 
     * @return vlBaseCalcIcms
     */
    public java.math.BigDecimal getVlBaseCalcIcms() {
        return vlBaseCalcIcms;
    }


    /**
     * Sets the vlBaseCalcIcms value for this TpTotaisNf.
     * 
     * @param vlBaseCalcIcms
     */
    public void setVlBaseCalcIcms(java.math.BigDecimal vlBaseCalcIcms) {
        this.vlBaseCalcIcms = vlBaseCalcIcms;
    }


    /**
     * Gets the vlImpTribIcms value for this TpTotaisNf.
     * 
     * @return vlImpTribIcms
     */
    public java.math.BigDecimal getVlImpTribIcms() {
        return vlImpTribIcms;
    }


    /**
     * Sets the vlImpTribIcms value for this TpTotaisNf.
     * 
     * @param vlImpTribIcms
     */
    public void setVlImpTribIcms(java.math.BigDecimal vlImpTribIcms) {
        this.vlImpTribIcms = vlImpTribIcms;
    }


    /**
     * Gets the vlBaseCalcIcmsSt value for this TpTotaisNf.
     * 
     * @return vlBaseCalcIcmsSt
     */
    public java.math.BigDecimal getVlBaseCalcIcmsSt() {
        return vlBaseCalcIcmsSt;
    }


    /**
     * Sets the vlBaseCalcIcmsSt value for this TpTotaisNf.
     * 
     * @param vlBaseCalcIcmsSt
     */
    public void setVlBaseCalcIcmsSt(java.math.BigDecimal vlBaseCalcIcmsSt) {
        this.vlBaseCalcIcmsSt = vlBaseCalcIcmsSt;
    }


    /**
     * Gets the vlImpTribIcmsSt value for this TpTotaisNf.
     * 
     * @return vlImpTribIcmsSt
     */
    public java.math.BigDecimal getVlImpTribIcmsSt() {
        return vlImpTribIcmsSt;
    }


    /**
     * Sets the vlImpTribIcmsSt value for this TpTotaisNf.
     * 
     * @param vlImpTribIcmsSt
     */
    public void setVlImpTribIcmsSt(java.math.BigDecimal vlImpTribIcmsSt) {
        this.vlImpTribIcmsSt = vlImpTribIcmsSt;
    }


    /**
     * Gets the vlTotalItem value for this TpTotaisNf.
     * 
     * @return vlTotalItem
     */
    public java.math.BigDecimal getVlTotalItem() {
        return vlTotalItem;
    }


    /**
     * Sets the vlTotalItem value for this TpTotaisNf.
     * 
     * @param vlTotalItem
     */
    public void setVlTotalItem(java.math.BigDecimal vlTotalItem) {
        this.vlTotalItem = vlTotalItem;
    }


    /**
     * Gets the vlFrete value for this TpTotaisNf.
     * 
     * @return vlFrete
     */
    public java.math.BigDecimal getVlFrete() {
        return vlFrete;
    }


    /**
     * Sets the vlFrete value for this TpTotaisNf.
     * 
     * @param vlFrete
     */
    public void setVlFrete(java.math.BigDecimal vlFrete) {
        this.vlFrete = vlFrete;
    }


    /**
     * Gets the vlSeguro value for this TpTotaisNf.
     * 
     * @return vlSeguro
     */
    public java.math.BigDecimal getVlSeguro() {
        return vlSeguro;
    }


    /**
     * Sets the vlSeguro value for this TpTotaisNf.
     * 
     * @param vlSeguro
     */
    public void setVlSeguro(java.math.BigDecimal vlSeguro) {
        this.vlSeguro = vlSeguro;
    }


    /**
     * Gets the vlDesconto value for this TpTotaisNf.
     * 
     * @return vlDesconto
     */
    public java.math.BigDecimal getVlDesconto() {
        return vlDesconto;
    }


    /**
     * Sets the vlDesconto value for this TpTotaisNf.
     * 
     * @param vlDesconto
     */
    public void setVlDesconto(java.math.BigDecimal vlDesconto) {
        this.vlDesconto = vlDesconto;
    }


    /**
     * Gets the vlImpTribII value for this TpTotaisNf.
     * 
     * @return vlImpTribII
     */
    public java.math.BigDecimal getVlImpTribII() {
        return vlImpTribII;
    }


    /**
     * Sets the vlImpTribII value for this TpTotaisNf.
     * 
     * @param vlImpTribII
     */
    public void setVlImpTribII(java.math.BigDecimal vlImpTribII) {
        this.vlImpTribII = vlImpTribII;
    }


    /**
     * Gets the vlImpTribIpi value for this TpTotaisNf.
     * 
     * @return vlImpTribIpi
     */
    public java.math.BigDecimal getVlImpTribIpi() {
        return vlImpTribIpi;
    }


    /**
     * Sets the vlImpTribIpi value for this TpTotaisNf.
     * 
     * @param vlImpTribIpi
     */
    public void setVlImpTribIpi(java.math.BigDecimal vlImpTribIpi) {
        this.vlImpTribIpi = vlImpTribIpi;
    }


    /**
     * Gets the vlImpTribPis value for this TpTotaisNf.
     * 
     * @return vlImpTribPis
     */
    public java.math.BigDecimal getVlImpTribPis() {
        return vlImpTribPis;
    }


    /**
     * Sets the vlImpTribPis value for this TpTotaisNf.
     * 
     * @param vlImpTribPis
     */
    public void setVlImpTribPis(java.math.BigDecimal vlImpTribPis) {
        this.vlImpTribPis = vlImpTribPis;
    }


    /**
     * Gets the vlImpTribCofins value for this TpTotaisNf.
     * 
     * @return vlImpTribCofins
     */
    public java.math.BigDecimal getVlImpTribCofins() {
        return vlImpTribCofins;
    }


    /**
     * Sets the vlImpTribCofins value for this TpTotaisNf.
     * 
     * @param vlImpTribCofins
     */
    public void setVlImpTribCofins(java.math.BigDecimal vlImpTribCofins) {
        this.vlImpTribCofins = vlImpTribCofins;
    }


    /**
     * Gets the vlOutrasDespesas value for this TpTotaisNf.
     * 
     * @return vlOutrasDespesas
     */
    public java.math.BigDecimal getVlOutrasDespesas() {
        return vlOutrasDespesas;
    }


    /**
     * Sets the vlOutrasDespesas value for this TpTotaisNf.
     * 
     * @param vlOutrasDespesas
     */
    public void setVlOutrasDespesas(java.math.BigDecimal vlOutrasDespesas) {
        this.vlOutrasDespesas = vlOutrasDespesas;
    }


    /**
     * Gets the vlTotalNf value for this TpTotaisNf.
     * 
     * @return vlTotalNf
     */
    public java.math.BigDecimal getVlTotalNf() {
        return vlTotalNf;
    }


    /**
     * Sets the vlTotalNf value for this TpTotaisNf.
     * 
     * @param vlTotalNf
     */
    public void setVlTotalNf(java.math.BigDecimal vlTotalNf) {
        this.vlTotalNf = vlTotalNf;
    }


    /**
     * Gets the vlServNaoTrib value for this TpTotaisNf.
     * 
     * @return vlServNaoTrib
     */
    public java.math.BigDecimal getVlServNaoTrib() {
        return vlServNaoTrib;
    }


    /**
     * Sets the vlServNaoTrib value for this TpTotaisNf.
     * 
     * @param vlServNaoTrib
     */
    public void setVlServNaoTrib(java.math.BigDecimal vlServNaoTrib) {
        this.vlServNaoTrib = vlServNaoTrib;
    }


    /**
     * Gets the vlBaseCalcIss value for this TpTotaisNf.
     * 
     * @return vlBaseCalcIss
     */
    public java.math.BigDecimal getVlBaseCalcIss() {
        return vlBaseCalcIss;
    }


    /**
     * Sets the vlBaseCalcIss value for this TpTotaisNf.
     * 
     * @param vlBaseCalcIss
     */
    public void setVlBaseCalcIss(java.math.BigDecimal vlBaseCalcIss) {
        this.vlBaseCalcIss = vlBaseCalcIss;
    }


    /**
     * Gets the vlImpTribIss value for this TpTotaisNf.
     * 
     * @return vlImpTribIss
     */
    public java.math.BigDecimal getVlImpTribIss() {
        return vlImpTribIss;
    }


    /**
     * Sets the vlImpTribIss value for this TpTotaisNf.
     * 
     * @param vlImpTribIss
     */
    public void setVlImpTribIss(java.math.BigDecimal vlImpTribIss) {
        this.vlImpTribIss = vlImpTribIss;
    }


    /**
     * Gets the vlPisIss value for this TpTotaisNf.
     * 
     * @return vlPisIss
     */
    public java.math.BigDecimal getVlPisIss() {
        return vlPisIss;
    }


    /**
     * Sets the vlPisIss value for this TpTotaisNf.
     * 
     * @param vlPisIss
     */
    public void setVlPisIss(java.math.BigDecimal vlPisIss) {
        this.vlPisIss = vlPisIss;
    }


    /**
     * Gets the vlCofinsIss value for this TpTotaisNf.
     * 
     * @return vlCofinsIss
     */
    public java.math.BigDecimal getVlCofinsIss() {
        return vlCofinsIss;
    }


    /**
     * Sets the vlCofinsIss value for this TpTotaisNf.
     * 
     * @param vlCofinsIss
     */
    public void setVlCofinsIss(java.math.BigDecimal vlCofinsIss) {
        this.vlCofinsIss = vlCofinsIss;
    }


    /**
     * Gets the vlRetPis value for this TpTotaisNf.
     * 
     * @return vlRetPis
     */
    public java.math.BigDecimal getVlRetPis() {
        return vlRetPis;
    }


    /**
     * Sets the vlRetPis value for this TpTotaisNf.
     * 
     * @param vlRetPis
     */
    public void setVlRetPis(java.math.BigDecimal vlRetPis) {
        this.vlRetPis = vlRetPis;
    }


    /**
     * Gets the vlRetCofins value for this TpTotaisNf.
     * 
     * @return vlRetCofins
     */
    public java.math.BigDecimal getVlRetCofins() {
        return vlRetCofins;
    }


    /**
     * Sets the vlRetCofins value for this TpTotaisNf.
     * 
     * @param vlRetCofins
     */
    public void setVlRetCofins(java.math.BigDecimal vlRetCofins) {
        this.vlRetCofins = vlRetCofins;
    }


    /**
     * Gets the vlRetCsll value for this TpTotaisNf.
     * 
     * @return vlRetCsll
     */
    public java.math.BigDecimal getVlRetCsll() {
        return vlRetCsll;
    }


    /**
     * Sets the vlRetCsll value for this TpTotaisNf.
     * 
     * @param vlRetCsll
     */
    public void setVlRetCsll(java.math.BigDecimal vlRetCsll) {
        this.vlRetCsll = vlRetCsll;
    }


    /**
     * Gets the vlBaseCalcIrrf value for this TpTotaisNf.
     * 
     * @return vlBaseCalcIrrf
     */
    public java.math.BigDecimal getVlBaseCalcIrrf() {
        return vlBaseCalcIrrf;
    }


    /**
     * Sets the vlBaseCalcIrrf value for this TpTotaisNf.
     * 
     * @param vlBaseCalcIrrf
     */
    public void setVlBaseCalcIrrf(java.math.BigDecimal vlBaseCalcIrrf) {
        this.vlBaseCalcIrrf = vlBaseCalcIrrf;
    }


    /**
     * Gets the vlRetIrrf value for this TpTotaisNf.
     * 
     * @return vlRetIrrf
     */
    public java.math.BigDecimal getVlRetIrrf() {
        return vlRetIrrf;
    }


    /**
     * Sets the vlRetIrrf value for this TpTotaisNf.
     * 
     * @param vlRetIrrf
     */
    public void setVlRetIrrf(java.math.BigDecimal vlRetIrrf) {
        this.vlRetIrrf = vlRetIrrf;
    }


    /**
     * Gets the vlBaseCalcPrev value for this TpTotaisNf.
     * 
     * @return vlBaseCalcPrev
     */
    public java.math.BigDecimal getVlBaseCalcPrev() {
        return vlBaseCalcPrev;
    }


    /**
     * Sets the vlBaseCalcPrev value for this TpTotaisNf.
     * 
     * @param vlBaseCalcPrev
     */
    public void setVlBaseCalcPrev(java.math.BigDecimal vlBaseCalcPrev) {
        this.vlBaseCalcPrev = vlBaseCalcPrev;
    }


    /**
     * Gets the vlRetPrev value for this TpTotaisNf.
     * 
     * @return vlRetPrev
     */
    public java.math.BigDecimal getVlRetPrev() {
        return vlRetPrev;
    }


    /**
     * Sets the vlRetPrev value for this TpTotaisNf.
     * 
     * @param vlRetPrev
     */
    public void setVlRetPrev(java.math.BigDecimal vlRetPrev) {
        this.vlRetPrev = vlRetPrev;
    }


    /**
     * Gets the vlTotalServ value for this TpTotaisNf.
     * 
     * @return vlTotalServ
     */
    public java.math.BigDecimal getVlTotalServ() {
        return vlTotalServ;
    }


    /**
     * Sets the vlTotalServ value for this TpTotaisNf.
     * 
     * @param vlTotalServ
     */
    public void setVlTotalServ(java.math.BigDecimal vlTotalServ) {
        this.vlTotalServ = vlTotalServ;
    }


    /**
     * Gets the vlAbatNt value for this TpTotaisNf.
     * 
     * @return vlAbatNt
     */
    public java.math.BigDecimal getVlAbatNt() {
        return vlAbatNt;
    }


    /**
     * Sets the vlAbatNt value for this TpTotaisNf.
     * 
     * @param vlAbatNt
     */
    public void setVlAbatNt(java.math.BigDecimal vlAbatNt) {
        this.vlAbatNt = vlAbatNt;
    }


    /**
     * Gets the vlForn value for this TpTotaisNf.
     * 
     * @return vlForn
     */
    public java.math.BigDecimal getVlForn() {
        return vlForn;
    }


    /**
     * Sets the vlForn value for this TpTotaisNf.
     * 
     * @param vlForn
     */
    public void setVlForn(java.math.BigDecimal vlForn) {
        this.vlForn = vlForn;
    }


    /**
     * Gets the vlTerc value for this TpTotaisNf.
     * 
     * @return vlTerc
     */
    public java.math.BigDecimal getVlTerc() {
        return vlTerc;
    }


    /**
     * Sets the vlTerc value for this TpTotaisNf.
     * 
     * @param vlTerc
     */
    public void setVlTerc(java.math.BigDecimal vlTerc) {
        this.vlTerc = vlTerc;
    }


    /**
     * Gets the vlServico value for this TpTotaisNf.
     * 
     * @return vlServico
     */
    public java.math.BigDecimal getVlServico() {
        return vlServico;
    }


    /**
     * Sets the vlServico value for this TpTotaisNf.
     * 
     * @param vlServico
     */
    public void setVlServico(java.math.BigDecimal vlServico) {
        this.vlServico = vlServico;
    }


    /**
     * Gets the vlRetIss value for this TpTotaisNf.
     * 
     * @return vlRetIss
     */
    public java.math.BigDecimal getVlRetIss() {
        return vlRetIss;
    }


    /**
     * Sets the vlRetIss value for this TpTotaisNf.
     * 
     * @param vlRetIss
     */
    public void setVlRetIss(java.math.BigDecimal vlRetIss) {
        this.vlRetIss = vlRetIss;
    }


    /**
     * Gets the vlTotTrib value for this TpTotaisNf.
     * 
     * @return vlTotTrib
     */
    public java.math.BigDecimal getVlTotTrib() {
        return vlTotTrib;
    }


    /**
     * Sets the vlTotTrib value for this TpTotaisNf.
     * 
     * @param vlTotTrib
     */
    public void setVlTotTrib(java.math.BigDecimal vlTotTrib) {
        this.vlTotTrib = vlTotTrib;
    }


    /**
     * Gets the vlIcmsDeson value for this TpTotaisNf.
     * 
     * @return vlIcmsDeson
     */
    public java.math.BigDecimal getVlIcmsDeson() {
        return vlIcmsDeson;
    }


    /**
     * Sets the vlIcmsDeson value for this TpTotaisNf.
     * 
     * @param vlIcmsDeson
     */
    public void setVlIcmsDeson(java.math.BigDecimal vlIcmsDeson) {
        this.vlIcmsDeson = vlIcmsDeson;
    }


    /**
     * Gets the vlDeducao value for this TpTotaisNf.
     * 
     * @return vlDeducao
     */
    public java.math.BigDecimal getVlDeducao() {
        return vlDeducao;
    }


    /**
     * Sets the vlDeducao value for this TpTotaisNf.
     * 
     * @param vlDeducao
     */
    public void setVlDeducao(java.math.BigDecimal vlDeducao) {
        this.vlDeducao = vlDeducao;
    }


    /**
     * Gets the vlOutraRet value for this TpTotaisNf.
     * 
     * @return vlOutraRet
     */
    public java.math.BigDecimal getVlOutraRet() {
        return vlOutraRet;
    }


    /**
     * Sets the vlOutraRet value for this TpTotaisNf.
     * 
     * @param vlOutraRet
     */
    public void setVlOutraRet(java.math.BigDecimal vlOutraRet) {
        this.vlOutraRet = vlOutraRet;
    }


    /**
     * Gets the vlDescIncond value for this TpTotaisNf.
     * 
     * @return vlDescIncond
     */
    public java.math.BigDecimal getVlDescIncond() {
        return vlDescIncond;
    }


    /**
     * Sets the vlDescIncond value for this TpTotaisNf.
     * 
     * @param vlDescIncond
     */
    public void setVlDescIncond(java.math.BigDecimal vlDescIncond) {
        this.vlDescIncond = vlDescIncond;
    }


    /**
     * Gets the vlDescCond value for this TpTotaisNf.
     * 
     * @return vlDescCond
     */
    public java.math.BigDecimal getVlDescCond() {
        return vlDescCond;
    }


    /**
     * Sets the vlDescCond value for this TpTotaisNf.
     * 
     * @param vlDescCond
     */
    public void setVlDescCond(java.math.BigDecimal vlDescCond) {
        this.vlDescCond = vlDescCond;
    }


    /**
     * Gets the vlIcmsUfDest value for this TpTotaisNf.
     * 
     * @return vlIcmsUfDest
     */
    public java.math.BigDecimal getVlIcmsUfDest() {
        return vlIcmsUfDest;
    }


    /**
     * Sets the vlIcmsUfDest value for this TpTotaisNf.
     * 
     * @param vlIcmsUfDest
     */
    public void setVlIcmsUfDest(java.math.BigDecimal vlIcmsUfDest) {
        this.vlIcmsUfDest = vlIcmsUfDest;
    }


    /**
     * Gets the vlIcmsUfRemet value for this TpTotaisNf.
     * 
     * @return vlIcmsUfRemet
     */
    public java.math.BigDecimal getVlIcmsUfRemet() {
        return vlIcmsUfRemet;
    }


    /**
     * Sets the vlIcmsUfRemet value for this TpTotaisNf.
     * 
     * @param vlIcmsUfRemet
     */
    public void setVlIcmsUfRemet(java.math.BigDecimal vlIcmsUfRemet) {
        this.vlIcmsUfRemet = vlIcmsUfRemet;
    }


    /**
     * Gets the vlCombPobrUfDest value for this TpTotaisNf.
     * 
     * @return vlCombPobrUfDest
     */
    public java.math.BigDecimal getVlCombPobrUfDest() {
        return vlCombPobrUfDest;
    }


    /**
     * Sets the vlCombPobrUfDest value for this TpTotaisNf.
     * 
     * @param vlCombPobrUfDest
     */
    public void setVlCombPobrUfDest(java.math.BigDecimal vlCombPobrUfDest) {
        this.vlCombPobrUfDest = vlCombPobrUfDest;
    }


    /**
     * Gets the vlFCP value for this TpTotaisNf.
     * 
     * @return vlFCP
     */
    public java.math.BigDecimal getVlFCP() {
        return vlFCP;
    }


    /**
     * Sets the vlFCP value for this TpTotaisNf.
     * 
     * @param vlFCP
     */
    public void setVlFCP(java.math.BigDecimal vlFCP) {
        this.vlFCP = vlFCP;
    }


    /**
     * Gets the vlFCPST value for this TpTotaisNf.
     * 
     * @return vlFCPST
     */
    public java.math.BigDecimal getVlFCPST() {
        return vlFCPST;
    }


    /**
     * Sets the vlFCPST value for this TpTotaisNf.
     * 
     * @param vlFCPST
     */
    public void setVlFCPST(java.math.BigDecimal vlFCPST) {
        this.vlFCPST = vlFCPST;
    }


    /**
     * Gets the vlFCPSTRet value for this TpTotaisNf.
     * 
     * @return vlFCPSTRet
     */
    public java.math.BigDecimal getVlFCPSTRet() {
        return vlFCPSTRet;
    }


    /**
     * Sets the vlFCPSTRet value for this TpTotaisNf.
     * 
     * @param vlFCPSTRet
     */
    public void setVlFCPSTRet(java.math.BigDecimal vlFCPSTRet) {
        this.vlFCPSTRet = vlFCPSTRet;
    }


    /**
     * Gets the vlIPIDevol value for this TpTotaisNf.
     * 
     * @return vlIPIDevol
     */
    public java.math.BigDecimal getVlIPIDevol() {
        return vlIPIDevol;
    }


    /**
     * Sets the vlIPIDevol value for this TpTotaisNf.
     * 
     * @param vlIPIDevol
     */
    public void setVlIPIDevol(java.math.BigDecimal vlIPIDevol) {
        this.vlIPIDevol = vlIPIDevol;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TpTotaisNf)) return false;
        TpTotaisNf other = (TpTotaisNf) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.vlBaseCalcIcms==null && other.getVlBaseCalcIcms()==null) || 
             (this.vlBaseCalcIcms!=null &&
              this.vlBaseCalcIcms.equals(other.getVlBaseCalcIcms()))) &&
            ((this.vlImpTribIcms==null && other.getVlImpTribIcms()==null) || 
             (this.vlImpTribIcms!=null &&
              this.vlImpTribIcms.equals(other.getVlImpTribIcms()))) &&
            ((this.vlBaseCalcIcmsSt==null && other.getVlBaseCalcIcmsSt()==null) || 
             (this.vlBaseCalcIcmsSt!=null &&
              this.vlBaseCalcIcmsSt.equals(other.getVlBaseCalcIcmsSt()))) &&
            ((this.vlImpTribIcmsSt==null && other.getVlImpTribIcmsSt()==null) || 
             (this.vlImpTribIcmsSt!=null &&
              this.vlImpTribIcmsSt.equals(other.getVlImpTribIcmsSt()))) &&
            ((this.vlTotalItem==null && other.getVlTotalItem()==null) || 
             (this.vlTotalItem!=null &&
              this.vlTotalItem.equals(other.getVlTotalItem()))) &&
            ((this.vlFrete==null && other.getVlFrete()==null) || 
             (this.vlFrete!=null &&
              this.vlFrete.equals(other.getVlFrete()))) &&
            ((this.vlSeguro==null && other.getVlSeguro()==null) || 
             (this.vlSeguro!=null &&
              this.vlSeguro.equals(other.getVlSeguro()))) &&
            ((this.vlDesconto==null && other.getVlDesconto()==null) || 
             (this.vlDesconto!=null &&
              this.vlDesconto.equals(other.getVlDesconto()))) &&
            ((this.vlImpTribII==null && other.getVlImpTribII()==null) || 
             (this.vlImpTribII!=null &&
              this.vlImpTribII.equals(other.getVlImpTribII()))) &&
            ((this.vlImpTribIpi==null && other.getVlImpTribIpi()==null) || 
             (this.vlImpTribIpi!=null &&
              this.vlImpTribIpi.equals(other.getVlImpTribIpi()))) &&
            ((this.vlImpTribPis==null && other.getVlImpTribPis()==null) || 
             (this.vlImpTribPis!=null &&
              this.vlImpTribPis.equals(other.getVlImpTribPis()))) &&
            ((this.vlImpTribCofins==null && other.getVlImpTribCofins()==null) || 
             (this.vlImpTribCofins!=null &&
              this.vlImpTribCofins.equals(other.getVlImpTribCofins()))) &&
            ((this.vlOutrasDespesas==null && other.getVlOutrasDespesas()==null) || 
             (this.vlOutrasDespesas!=null &&
              this.vlOutrasDespesas.equals(other.getVlOutrasDespesas()))) &&
            ((this.vlTotalNf==null && other.getVlTotalNf()==null) || 
             (this.vlTotalNf!=null &&
              this.vlTotalNf.equals(other.getVlTotalNf()))) &&
            ((this.vlServNaoTrib==null && other.getVlServNaoTrib()==null) || 
             (this.vlServNaoTrib!=null &&
              this.vlServNaoTrib.equals(other.getVlServNaoTrib()))) &&
            ((this.vlBaseCalcIss==null && other.getVlBaseCalcIss()==null) || 
             (this.vlBaseCalcIss!=null &&
              this.vlBaseCalcIss.equals(other.getVlBaseCalcIss()))) &&
            ((this.vlImpTribIss==null && other.getVlImpTribIss()==null) || 
             (this.vlImpTribIss!=null &&
              this.vlImpTribIss.equals(other.getVlImpTribIss()))) &&
            ((this.vlPisIss==null && other.getVlPisIss()==null) || 
             (this.vlPisIss!=null &&
              this.vlPisIss.equals(other.getVlPisIss()))) &&
            ((this.vlCofinsIss==null && other.getVlCofinsIss()==null) || 
             (this.vlCofinsIss!=null &&
              this.vlCofinsIss.equals(other.getVlCofinsIss()))) &&
            ((this.vlRetPis==null && other.getVlRetPis()==null) || 
             (this.vlRetPis!=null &&
              this.vlRetPis.equals(other.getVlRetPis()))) &&
            ((this.vlRetCofins==null && other.getVlRetCofins()==null) || 
             (this.vlRetCofins!=null &&
              this.vlRetCofins.equals(other.getVlRetCofins()))) &&
            ((this.vlRetCsll==null && other.getVlRetCsll()==null) || 
             (this.vlRetCsll!=null &&
              this.vlRetCsll.equals(other.getVlRetCsll()))) &&
            ((this.vlBaseCalcIrrf==null && other.getVlBaseCalcIrrf()==null) || 
             (this.vlBaseCalcIrrf!=null &&
              this.vlBaseCalcIrrf.equals(other.getVlBaseCalcIrrf()))) &&
            ((this.vlRetIrrf==null && other.getVlRetIrrf()==null) || 
             (this.vlRetIrrf!=null &&
              this.vlRetIrrf.equals(other.getVlRetIrrf()))) &&
            ((this.vlBaseCalcPrev==null && other.getVlBaseCalcPrev()==null) || 
             (this.vlBaseCalcPrev!=null &&
              this.vlBaseCalcPrev.equals(other.getVlBaseCalcPrev()))) &&
            ((this.vlRetPrev==null && other.getVlRetPrev()==null) || 
             (this.vlRetPrev!=null &&
              this.vlRetPrev.equals(other.getVlRetPrev()))) &&
            ((this.vlTotalServ==null && other.getVlTotalServ()==null) || 
             (this.vlTotalServ!=null &&
              this.vlTotalServ.equals(other.getVlTotalServ()))) &&
            ((this.vlAbatNt==null && other.getVlAbatNt()==null) || 
             (this.vlAbatNt!=null &&
              this.vlAbatNt.equals(other.getVlAbatNt()))) &&
            ((this.vlForn==null && other.getVlForn()==null) || 
             (this.vlForn!=null &&
              this.vlForn.equals(other.getVlForn()))) &&
            ((this.vlTerc==null && other.getVlTerc()==null) || 
             (this.vlTerc!=null &&
              this.vlTerc.equals(other.getVlTerc()))) &&
            ((this.vlServico==null && other.getVlServico()==null) || 
             (this.vlServico!=null &&
              this.vlServico.equals(other.getVlServico()))) &&
            ((this.vlRetIss==null && other.getVlRetIss()==null) || 
             (this.vlRetIss!=null &&
              this.vlRetIss.equals(other.getVlRetIss()))) &&
            ((this.vlTotTrib==null && other.getVlTotTrib()==null) || 
             (this.vlTotTrib!=null &&
              this.vlTotTrib.equals(other.getVlTotTrib()))) &&
            ((this.vlIcmsDeson==null && other.getVlIcmsDeson()==null) || 
             (this.vlIcmsDeson!=null &&
              this.vlIcmsDeson.equals(other.getVlIcmsDeson()))) &&
            ((this.vlDeducao==null && other.getVlDeducao()==null) || 
             (this.vlDeducao!=null &&
              this.vlDeducao.equals(other.getVlDeducao()))) &&
            ((this.vlOutraRet==null && other.getVlOutraRet()==null) || 
             (this.vlOutraRet!=null &&
              this.vlOutraRet.equals(other.getVlOutraRet()))) &&
            ((this.vlDescIncond==null && other.getVlDescIncond()==null) || 
             (this.vlDescIncond!=null &&
              this.vlDescIncond.equals(other.getVlDescIncond()))) &&
            ((this.vlDescCond==null && other.getVlDescCond()==null) || 
             (this.vlDescCond!=null &&
              this.vlDescCond.equals(other.getVlDescCond()))) &&
            ((this.vlIcmsUfDest==null && other.getVlIcmsUfDest()==null) || 
             (this.vlIcmsUfDest!=null &&
              this.vlIcmsUfDest.equals(other.getVlIcmsUfDest()))) &&
            ((this.vlIcmsUfRemet==null && other.getVlIcmsUfRemet()==null) || 
             (this.vlIcmsUfRemet!=null &&
              this.vlIcmsUfRemet.equals(other.getVlIcmsUfRemet()))) &&
            ((this.vlCombPobrUfDest==null && other.getVlCombPobrUfDest()==null) || 
             (this.vlCombPobrUfDest!=null &&
              this.vlCombPobrUfDest.equals(other.getVlCombPobrUfDest()))) &&
            ((this.vlFCP==null && other.getVlFCP()==null) || 
             (this.vlFCP!=null &&
              this.vlFCP.equals(other.getVlFCP()))) &&
            ((this.vlFCPST==null && other.getVlFCPST()==null) || 
             (this.vlFCPST!=null &&
              this.vlFCPST.equals(other.getVlFCPST()))) &&
            ((this.vlFCPSTRet==null && other.getVlFCPSTRet()==null) || 
             (this.vlFCPSTRet!=null &&
              this.vlFCPSTRet.equals(other.getVlFCPSTRet()))) &&
            ((this.vlIPIDevol==null && other.getVlIPIDevol()==null) || 
             (this.vlIPIDevol!=null &&
              this.vlIPIDevol.equals(other.getVlIPIDevol())));
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
        if (getVlBaseCalcIcms() != null) {
            _hashCode += getVlBaseCalcIcms().hashCode();
        }
        if (getVlImpTribIcms() != null) {
            _hashCode += getVlImpTribIcms().hashCode();
        }
        if (getVlBaseCalcIcmsSt() != null) {
            _hashCode += getVlBaseCalcIcmsSt().hashCode();
        }
        if (getVlImpTribIcmsSt() != null) {
            _hashCode += getVlImpTribIcmsSt().hashCode();
        }
        if (getVlTotalItem() != null) {
            _hashCode += getVlTotalItem().hashCode();
        }
        if (getVlFrete() != null) {
            _hashCode += getVlFrete().hashCode();
        }
        if (getVlSeguro() != null) {
            _hashCode += getVlSeguro().hashCode();
        }
        if (getVlDesconto() != null) {
            _hashCode += getVlDesconto().hashCode();
        }
        if (getVlImpTribII() != null) {
            _hashCode += getVlImpTribII().hashCode();
        }
        if (getVlImpTribIpi() != null) {
            _hashCode += getVlImpTribIpi().hashCode();
        }
        if (getVlImpTribPis() != null) {
            _hashCode += getVlImpTribPis().hashCode();
        }
        if (getVlImpTribCofins() != null) {
            _hashCode += getVlImpTribCofins().hashCode();
        }
        if (getVlOutrasDespesas() != null) {
            _hashCode += getVlOutrasDespesas().hashCode();
        }
        if (getVlTotalNf() != null) {
            _hashCode += getVlTotalNf().hashCode();
        }
        if (getVlServNaoTrib() != null) {
            _hashCode += getVlServNaoTrib().hashCode();
        }
        if (getVlBaseCalcIss() != null) {
            _hashCode += getVlBaseCalcIss().hashCode();
        }
        if (getVlImpTribIss() != null) {
            _hashCode += getVlImpTribIss().hashCode();
        }
        if (getVlPisIss() != null) {
            _hashCode += getVlPisIss().hashCode();
        }
        if (getVlCofinsIss() != null) {
            _hashCode += getVlCofinsIss().hashCode();
        }
        if (getVlRetPis() != null) {
            _hashCode += getVlRetPis().hashCode();
        }
        if (getVlRetCofins() != null) {
            _hashCode += getVlRetCofins().hashCode();
        }
        if (getVlRetCsll() != null) {
            _hashCode += getVlRetCsll().hashCode();
        }
        if (getVlBaseCalcIrrf() != null) {
            _hashCode += getVlBaseCalcIrrf().hashCode();
        }
        if (getVlRetIrrf() != null) {
            _hashCode += getVlRetIrrf().hashCode();
        }
        if (getVlBaseCalcPrev() != null) {
            _hashCode += getVlBaseCalcPrev().hashCode();
        }
        if (getVlRetPrev() != null) {
            _hashCode += getVlRetPrev().hashCode();
        }
        if (getVlTotalServ() != null) {
            _hashCode += getVlTotalServ().hashCode();
        }
        if (getVlAbatNt() != null) {
            _hashCode += getVlAbatNt().hashCode();
        }
        if (getVlForn() != null) {
            _hashCode += getVlForn().hashCode();
        }
        if (getVlTerc() != null) {
            _hashCode += getVlTerc().hashCode();
        }
        if (getVlServico() != null) {
            _hashCode += getVlServico().hashCode();
        }
        if (getVlRetIss() != null) {
            _hashCode += getVlRetIss().hashCode();
        }
        if (getVlTotTrib() != null) {
            _hashCode += getVlTotTrib().hashCode();
        }
        if (getVlIcmsDeson() != null) {
            _hashCode += getVlIcmsDeson().hashCode();
        }
        if (getVlDeducao() != null) {
            _hashCode += getVlDeducao().hashCode();
        }
        if (getVlOutraRet() != null) {
            _hashCode += getVlOutraRet().hashCode();
        }
        if (getVlDescIncond() != null) {
            _hashCode += getVlDescIncond().hashCode();
        }
        if (getVlDescCond() != null) {
            _hashCode += getVlDescCond().hashCode();
        }
        if (getVlIcmsUfDest() != null) {
            _hashCode += getVlIcmsUfDest().hashCode();
        }
        if (getVlIcmsUfRemet() != null) {
            _hashCode += getVlIcmsUfRemet().hashCode();
        }
        if (getVlCombPobrUfDest() != null) {
            _hashCode += getVlCombPobrUfDest().hashCode();
        }
        if (getVlFCP() != null) {
            _hashCode += getVlFCP().hashCode();
        }
        if (getVlFCPST() != null) {
            _hashCode += getVlFCPST().hashCode();
        }
        if (getVlFCPSTRet() != null) {
            _hashCode += getVlFCPSTRet().hashCode();
        }
        if (getVlIPIDevol() != null) {
            _hashCode += getVlIPIDevol().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TpTotaisNf.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "tpTotaisNf"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlBaseCalcIcms");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "vlBaseCalcIcms"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlImpTribIcms");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "vlImpTribIcms"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlBaseCalcIcmsSt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "vlBaseCalcIcmsSt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlImpTribIcmsSt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "vlImpTribIcmsSt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlTotalItem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "vlTotalItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlFrete");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "vlFrete"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlSeguro");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "vlSeguro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlDesconto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "vlDesconto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlImpTribII");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "vlImpTribII"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlImpTribIpi");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "vlImpTribIpi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlImpTribPis");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "vlImpTribPis"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlImpTribCofins");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "vlImpTribCofins"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlOutrasDespesas");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "vlOutrasDespesas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlTotalNf");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "vlTotalNf"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlServNaoTrib");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "vlServNaoTrib"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlBaseCalcIss");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "vlBaseCalcIss"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlImpTribIss");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "vlImpTribIss"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlPisIss");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "vlPisIss"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlCofinsIss");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "vlCofinsIss"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlRetPis");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "vlRetPis"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlRetCofins");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "vlRetCofins"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlRetCsll");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "vlRetCsll"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlBaseCalcIrrf");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "vlBaseCalcIrrf"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlRetIrrf");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "vlRetIrrf"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlBaseCalcPrev");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "vlBaseCalcPrev"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlRetPrev");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "vlRetPrev"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlTotalServ");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "vlTotalServ"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlAbatNt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "vlAbatNt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlForn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "vlForn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlTerc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "vlTerc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlServico");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "vlServico"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlRetIss");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "vlRetIss"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlTotTrib");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "vlTotTrib"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlIcmsDeson");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "vlIcmsDeson"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlDeducao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "vlDeducao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlOutraRet");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "vlOutraRet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlDescIncond");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "vlDescIncond"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlDescCond");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "vlDescCond"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlIcmsUfDest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "vlIcmsUfDest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlIcmsUfRemet");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "vlIcmsUfRemet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlCombPobrUfDest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "vlCombPobrUfDest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlFCP");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "vlFCP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlFCPST");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "vlFCPST"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlFCPSTRet");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "vlFCPSTRet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlIPIDevol");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "vlIPIDevol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
