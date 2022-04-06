/**
 * NfServicos.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServicos;

public class NfServicos  implements java.io.Serializable {
    private br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.TpCpfCnpj cpfCnpj;

    private org.apache.axis.types.NonNegativeInteger dmIndEmit;

    private org.apache.axis.types.NonNegativeInteger dmIndOper;

    private java.lang.String codPart;

    private java.lang.String codigoModeloFiscal;

    private java.lang.String serie;

    private org.apache.axis.types.NonNegativeInteger nroNf;

    private java.math.BigInteger subSerie;

    private java.util.Date dtEmiss;

    private java.util.Date dtExeServ;

    private java.util.Date dtSaiEnt;

    private java.lang.String sitDocto;

    private java.lang.String chaveNfse;

    private org.apache.axis.types.NonNegativeInteger dmIndPag;

    private org.apache.axis.types.NonNegativeInteger dmNatOper;

    private org.apache.axis.types.NonNegativeInteger dmTipoRps;

    private org.apache.axis.types.NonNegativeInteger dmStatusRps;

    private org.apache.axis.types.NonNegativeInteger nroRpsSubst;

    private java.lang.String serieRpsSubst;

    private java.math.BigInteger dmStProc;

    private java.lang.String sistOrig;

    private java.lang.String unidOrg;

    private org.apache.axis.types.NonNegativeInteger dmLegado;

    private br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServicos.TpItens[] itens;

    private br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServicos.TpInforAdic[] inforAdic;

    private br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServicos.TpParticipante participante;

    private br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServicos.TpInterServ interServ;

    private br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServicos.TpDetConstrCivil detConstrCivil;

    private br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServicos.TpFatura fatura;

    private java.lang.String cdCidadeModFiscal;

    private org.apache.axis.types.NonNegativeInteger idNfErp;

    private br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServicos.TpNfProcReinf[] nfProcReinf;

    private java.lang.String nroAutNfs;

    private java.util.Date dtAutNfs;

    private java.lang.String codNatOper;

    public NfServicos() {
    }

    public NfServicos(
           br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.TpCpfCnpj cpfCnpj,
           org.apache.axis.types.NonNegativeInteger dmIndEmit,
           org.apache.axis.types.NonNegativeInteger dmIndOper,
           java.lang.String codPart,
           java.lang.String codigoModeloFiscal,
           java.lang.String serie,
           org.apache.axis.types.NonNegativeInteger nroNf,
           java.math.BigInteger subSerie,
           java.util.Date dtEmiss,
           java.util.Date dtExeServ,
           java.util.Date dtSaiEnt,
           java.lang.String sitDocto,
           java.lang.String chaveNfse,
           org.apache.axis.types.NonNegativeInteger dmIndPag,
           org.apache.axis.types.NonNegativeInteger dmNatOper,
           org.apache.axis.types.NonNegativeInteger dmTipoRps,
           org.apache.axis.types.NonNegativeInteger dmStatusRps,
           org.apache.axis.types.NonNegativeInteger nroRpsSubst,
           java.lang.String serieRpsSubst,
           java.math.BigInteger dmStProc,
           java.lang.String sistOrig,
           java.lang.String unidOrg,
           org.apache.axis.types.NonNegativeInteger dmLegado,
           br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServicos.TpItens[] itens,
           br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServicos.TpInforAdic[] inforAdic,
           br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServicos.TpParticipante participante,
           br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServicos.TpInterServ interServ,
           br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServicos.TpDetConstrCivil detConstrCivil,
           br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServicos.TpFatura fatura,
           java.lang.String cdCidadeModFiscal,
           org.apache.axis.types.NonNegativeInteger idNfErp,
           br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServicos.TpNfProcReinf[] nfProcReinf,
           java.lang.String nroAutNfs,
           java.util.Date dtAutNfs,
           java.lang.String codNatOper) {
           this.cpfCnpj = cpfCnpj;
           this.dmIndEmit = dmIndEmit;
           this.dmIndOper = dmIndOper;
           this.codPart = codPart;
           this.codigoModeloFiscal = codigoModeloFiscal;
           this.serie = serie;
           this.nroNf = nroNf;
           this.subSerie = subSerie;
           this.dtEmiss = dtEmiss;
           this.dtExeServ = dtExeServ;
           this.dtSaiEnt = dtSaiEnt;
           this.sitDocto = sitDocto;
           this.chaveNfse = chaveNfse;
           this.dmIndPag = dmIndPag;
           this.dmNatOper = dmNatOper;
           this.dmTipoRps = dmTipoRps;
           this.dmStatusRps = dmStatusRps;
           this.nroRpsSubst = nroRpsSubst;
           this.serieRpsSubst = serieRpsSubst;
           this.dmStProc = dmStProc;
           this.sistOrig = sistOrig;
           this.unidOrg = unidOrg;
           this.dmLegado = dmLegado;
           this.itens = itens;
           this.inforAdic = inforAdic;
           this.participante = participante;
           this.interServ = interServ;
           this.detConstrCivil = detConstrCivil;
           this.fatura = fatura;
           this.cdCidadeModFiscal = cdCidadeModFiscal;
           this.idNfErp = idNfErp;
           this.nfProcReinf = nfProcReinf;
           this.nroAutNfs = nroAutNfs;
           this.dtAutNfs = dtAutNfs;
           this.codNatOper = codNatOper;
    }


    /**
     * Gets the cpfCnpj value for this NfServicos.
     * 
     * @return cpfCnpj
     */
    public br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.TpCpfCnpj getCpfCnpj() {
        return cpfCnpj;
    }


    /**
     * Sets the cpfCnpj value for this NfServicos.
     * 
     * @param cpfCnpj
     */
    public void setCpfCnpj(br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.TpCpfCnpj cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }


    /**
     * Gets the dmIndEmit value for this NfServicos.
     * 
     * @return dmIndEmit
     */
    public org.apache.axis.types.NonNegativeInteger getDmIndEmit() {
        return dmIndEmit;
    }


    /**
     * Sets the dmIndEmit value for this NfServicos.
     * 
     * @param dmIndEmit
     */
    public void setDmIndEmit(org.apache.axis.types.NonNegativeInteger dmIndEmit) {
        this.dmIndEmit = dmIndEmit;
    }


    /**
     * Gets the dmIndOper value for this NfServicos.
     * 
     * @return dmIndOper
     */
    public org.apache.axis.types.NonNegativeInteger getDmIndOper() {
        return dmIndOper;
    }


    /**
     * Sets the dmIndOper value for this NfServicos.
     * 
     * @param dmIndOper
     */
    public void setDmIndOper(org.apache.axis.types.NonNegativeInteger dmIndOper) {
        this.dmIndOper = dmIndOper;
    }


    /**
     * Gets the codPart value for this NfServicos.
     * 
     * @return codPart
     */
    public java.lang.String getCodPart() {
        return codPart;
    }


    /**
     * Sets the codPart value for this NfServicos.
     * 
     * @param codPart
     */
    public void setCodPart(java.lang.String codPart) {
        this.codPart = codPart;
    }


    /**
     * Gets the codigoModeloFiscal value for this NfServicos.
     * 
     * @return codigoModeloFiscal
     */
    public java.lang.String getCodigoModeloFiscal() {
        return codigoModeloFiscal;
    }


    /**
     * Sets the codigoModeloFiscal value for this NfServicos.
     * 
     * @param codigoModeloFiscal
     */
    public void setCodigoModeloFiscal(java.lang.String codigoModeloFiscal) {
        this.codigoModeloFiscal = codigoModeloFiscal;
    }


    /**
     * Gets the serie value for this NfServicos.
     * 
     * @return serie
     */
    public java.lang.String getSerie() {
        return serie;
    }


    /**
     * Sets the serie value for this NfServicos.
     * 
     * @param serie
     */
    public void setSerie(java.lang.String serie) {
        this.serie = serie;
    }


    /**
     * Gets the nroNf value for this NfServicos.
     * 
     * @return nroNf
     */
    public org.apache.axis.types.NonNegativeInteger getNroNf() {
        return nroNf;
    }


    /**
     * Sets the nroNf value for this NfServicos.
     * 
     * @param nroNf
     */
    public void setNroNf(org.apache.axis.types.NonNegativeInteger nroNf) {
        this.nroNf = nroNf;
    }


    /**
     * Gets the subSerie value for this NfServicos.
     * 
     * @return subSerie
     */
    public java.math.BigInteger getSubSerie() {
        return subSerie;
    }


    /**
     * Sets the subSerie value for this NfServicos.
     * 
     * @param subSerie
     */
    public void setSubSerie(java.math.BigInteger subSerie) {
        this.subSerie = subSerie;
    }


    /**
     * Gets the dtEmiss value for this NfServicos.
     * 
     * @return dtEmiss
     */
    public java.util.Date getDtEmiss() {
        return dtEmiss;
    }


    /**
     * Sets the dtEmiss value for this NfServicos.
     * 
     * @param dtEmiss
     */
    public void setDtEmiss(java.util.Date dtEmiss) {
        this.dtEmiss = dtEmiss;
    }


    /**
     * Gets the dtExeServ value for this NfServicos.
     * 
     * @return dtExeServ
     */
    public java.util.Date getDtExeServ() {
        return dtExeServ;
    }


    /**
     * Sets the dtExeServ value for this NfServicos.
     * 
     * @param dtExeServ
     */
    public void setDtExeServ(java.util.Date dtExeServ) {
        this.dtExeServ = dtExeServ;
    }


    /**
     * Gets the dtSaiEnt value for this NfServicos.
     * 
     * @return dtSaiEnt
     */
    public java.util.Date getDtSaiEnt() {
        return dtSaiEnt;
    }


    /**
     * Sets the dtSaiEnt value for this NfServicos.
     * 
     * @param dtSaiEnt
     */
    public void setDtSaiEnt(java.util.Date dtSaiEnt) {
        this.dtSaiEnt = dtSaiEnt;
    }


    /**
     * Gets the sitDocto value for this NfServicos.
     * 
     * @return sitDocto
     */
    public java.lang.String getSitDocto() {
        return sitDocto;
    }


    /**
     * Sets the sitDocto value for this NfServicos.
     * 
     * @param sitDocto
     */
    public void setSitDocto(java.lang.String sitDocto) {
        this.sitDocto = sitDocto;
    }


    /**
     * Gets the chaveNfse value for this NfServicos.
     * 
     * @return chaveNfse
     */
    public java.lang.String getChaveNfse() {
        return chaveNfse;
    }


    /**
     * Sets the chaveNfse value for this NfServicos.
     * 
     * @param chaveNfse
     */
    public void setChaveNfse(java.lang.String chaveNfse) {
        this.chaveNfse = chaveNfse;
    }


    /**
     * Gets the dmIndPag value for this NfServicos.
     * 
     * @return dmIndPag
     */
    public org.apache.axis.types.NonNegativeInteger getDmIndPag() {
        return dmIndPag;
    }


    /**
     * Sets the dmIndPag value for this NfServicos.
     * 
     * @param dmIndPag
     */
    public void setDmIndPag(org.apache.axis.types.NonNegativeInteger dmIndPag) {
        this.dmIndPag = dmIndPag;
    }


    /**
     * Gets the dmNatOper value for this NfServicos.
     * 
     * @return dmNatOper
     */
    public org.apache.axis.types.NonNegativeInteger getDmNatOper() {
        return dmNatOper;
    }


    /**
     * Sets the dmNatOper value for this NfServicos.
     * 
     * @param dmNatOper
     */
    public void setDmNatOper(org.apache.axis.types.NonNegativeInteger dmNatOper) {
        this.dmNatOper = dmNatOper;
    }


    /**
     * Gets the dmTipoRps value for this NfServicos.
     * 
     * @return dmTipoRps
     */
    public org.apache.axis.types.NonNegativeInteger getDmTipoRps() {
        return dmTipoRps;
    }


    /**
     * Sets the dmTipoRps value for this NfServicos.
     * 
     * @param dmTipoRps
     */
    public void setDmTipoRps(org.apache.axis.types.NonNegativeInteger dmTipoRps) {
        this.dmTipoRps = dmTipoRps;
    }


    /**
     * Gets the dmStatusRps value for this NfServicos.
     * 
     * @return dmStatusRps
     */
    public org.apache.axis.types.NonNegativeInteger getDmStatusRps() {
        return dmStatusRps;
    }


    /**
     * Sets the dmStatusRps value for this NfServicos.
     * 
     * @param dmStatusRps
     */
    public void setDmStatusRps(org.apache.axis.types.NonNegativeInteger dmStatusRps) {
        this.dmStatusRps = dmStatusRps;
    }


    /**
     * Gets the nroRpsSubst value for this NfServicos.
     * 
     * @return nroRpsSubst
     */
    public org.apache.axis.types.NonNegativeInteger getNroRpsSubst() {
        return nroRpsSubst;
    }


    /**
     * Sets the nroRpsSubst value for this NfServicos.
     * 
     * @param nroRpsSubst
     */
    public void setNroRpsSubst(org.apache.axis.types.NonNegativeInteger nroRpsSubst) {
        this.nroRpsSubst = nroRpsSubst;
    }


    /**
     * Gets the serieRpsSubst value for this NfServicos.
     * 
     * @return serieRpsSubst
     */
    public java.lang.String getSerieRpsSubst() {
        return serieRpsSubst;
    }


    /**
     * Sets the serieRpsSubst value for this NfServicos.
     * 
     * @param serieRpsSubst
     */
    public void setSerieRpsSubst(java.lang.String serieRpsSubst) {
        this.serieRpsSubst = serieRpsSubst;
    }


    /**
     * Gets the dmStProc value for this NfServicos.
     * 
     * @return dmStProc
     */
    public java.math.BigInteger getDmStProc() {
        return dmStProc;
    }


    /**
     * Sets the dmStProc value for this NfServicos.
     * 
     * @param dmStProc
     */
    public void setDmStProc(java.math.BigInteger dmStProc) {
        this.dmStProc = dmStProc;
    }


    /**
     * Gets the sistOrig value for this NfServicos.
     * 
     * @return sistOrig
     */
    public java.lang.String getSistOrig() {
        return sistOrig;
    }


    /**
     * Sets the sistOrig value for this NfServicos.
     * 
     * @param sistOrig
     */
    public void setSistOrig(java.lang.String sistOrig) {
        this.sistOrig = sistOrig;
    }


    /**
     * Gets the unidOrg value for this NfServicos.
     * 
     * @return unidOrg
     */
    public java.lang.String getUnidOrg() {
        return unidOrg;
    }


    /**
     * Sets the unidOrg value for this NfServicos.
     * 
     * @param unidOrg
     */
    public void setUnidOrg(java.lang.String unidOrg) {
        this.unidOrg = unidOrg;
    }


    /**
     * Gets the dmLegado value for this NfServicos.
     * 
     * @return dmLegado
     */
    public org.apache.axis.types.NonNegativeInteger getDmLegado() {
        return dmLegado;
    }


    /**
     * Sets the dmLegado value for this NfServicos.
     * 
     * @param dmLegado
     */
    public void setDmLegado(org.apache.axis.types.NonNegativeInteger dmLegado) {
        this.dmLegado = dmLegado;
    }


    /**
     * Gets the itens value for this NfServicos.
     * 
     * @return itens
     */
    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServicos.TpItens[] getItens() {
        return itens;
    }


    /**
     * Sets the itens value for this NfServicos.
     * 
     * @param itens
     */
    public void setItens(br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServicos.TpItens[] itens) {
        this.itens = itens;
    }

    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServicos.TpItens getItens(int i) {
        return this.itens[i];
    }

    public void setItens(int i, br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServicos.TpItens _value) {
        this.itens[i] = _value;
    }


    /**
     * Gets the inforAdic value for this NfServicos.
     * 
     * @return inforAdic
     */
    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServicos.TpInforAdic[] getInforAdic() {
        return inforAdic;
    }


    /**
     * Sets the inforAdic value for this NfServicos.
     * 
     * @param inforAdic
     */
    public void setInforAdic(br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServicos.TpInforAdic[] inforAdic) {
        this.inforAdic = inforAdic;
    }

    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServicos.TpInforAdic getInforAdic(int i) {
        return this.inforAdic[i];
    }

    public void setInforAdic(int i, br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServicos.TpInforAdic _value) {
        this.inforAdic[i] = _value;
    }


    /**
     * Gets the participante value for this NfServicos.
     * 
     * @return participante
     */
    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServicos.TpParticipante getParticipante() {
        return participante;
    }


    /**
     * Sets the participante value for this NfServicos.
     * 
     * @param participante
     */
    public void setParticipante(br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServicos.TpParticipante participante) {
        this.participante = participante;
    }


    /**
     * Gets the interServ value for this NfServicos.
     * 
     * @return interServ
     */
    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServicos.TpInterServ getInterServ() {
        return interServ;
    }


    /**
     * Sets the interServ value for this NfServicos.
     * 
     * @param interServ
     */
    public void setInterServ(br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServicos.TpInterServ interServ) {
        this.interServ = interServ;
    }


    /**
     * Gets the detConstrCivil value for this NfServicos.
     * 
     * @return detConstrCivil
     */
    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServicos.TpDetConstrCivil getDetConstrCivil() {
        return detConstrCivil;
    }


    /**
     * Sets the detConstrCivil value for this NfServicos.
     * 
     * @param detConstrCivil
     */
    public void setDetConstrCivil(br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServicos.TpDetConstrCivil detConstrCivil) {
        this.detConstrCivil = detConstrCivil;
    }


    /**
     * Gets the fatura value for this NfServicos.
     * 
     * @return fatura
     */
    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServicos.TpFatura getFatura() {
        return fatura;
    }


    /**
     * Sets the fatura value for this NfServicos.
     * 
     * @param fatura
     */
    public void setFatura(br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServicos.TpFatura fatura) {
        this.fatura = fatura;
    }


    /**
     * Gets the cdCidadeModFiscal value for this NfServicos.
     * 
     * @return cdCidadeModFiscal
     */
    public java.lang.String getCdCidadeModFiscal() {
        return cdCidadeModFiscal;
    }


    /**
     * Sets the cdCidadeModFiscal value for this NfServicos.
     * 
     * @param cdCidadeModFiscal
     */
    public void setCdCidadeModFiscal(java.lang.String cdCidadeModFiscal) {
        this.cdCidadeModFiscal = cdCidadeModFiscal;
    }


    /**
     * Gets the idNfErp value for this NfServicos.
     * 
     * @return idNfErp
     */
    public org.apache.axis.types.NonNegativeInteger getIdNfErp() {
        return idNfErp;
    }


    /**
     * Sets the idNfErp value for this NfServicos.
     * 
     * @param idNfErp
     */
    public void setIdNfErp(org.apache.axis.types.NonNegativeInteger idNfErp) {
        this.idNfErp = idNfErp;
    }


    /**
     * Gets the nfProcReinf value for this NfServicos.
     * 
     * @return nfProcReinf
     */
    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServicos.TpNfProcReinf[] getNfProcReinf() {
        return nfProcReinf;
    }


    /**
     * Sets the nfProcReinf value for this NfServicos.
     * 
     * @param nfProcReinf
     */
    public void setNfProcReinf(br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServicos.TpNfProcReinf[] nfProcReinf) {
        this.nfProcReinf = nfProcReinf;
    }

    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServicos.TpNfProcReinf getNfProcReinf(int i) {
        return this.nfProcReinf[i];
    }

    public void setNfProcReinf(int i, br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServicos.TpNfProcReinf _value) {
        this.nfProcReinf[i] = _value;
    }


    /**
     * Gets the nroAutNfs value for this NfServicos.
     * 
     * @return nroAutNfs
     */
    public java.lang.String getNroAutNfs() {
        return nroAutNfs;
    }


    /**
     * Sets the nroAutNfs value for this NfServicos.
     * 
     * @param nroAutNfs
     */
    public void setNroAutNfs(java.lang.String nroAutNfs) {
        this.nroAutNfs = nroAutNfs;
    }


    /**
     * Gets the dtAutNfs value for this NfServicos.
     * 
     * @return dtAutNfs
     */
    public java.util.Date getDtAutNfs() {
        return dtAutNfs;
    }


    /**
     * Sets the dtAutNfs value for this NfServicos.
     * 
     * @param dtAutNfs
     */
    public void setDtAutNfs(java.util.Date dtAutNfs) {
        this.dtAutNfs = dtAutNfs;
    }


    /**
     * Gets the codNatOper value for this NfServicos.
     * 
     * @return codNatOper
     */
    public java.lang.String getCodNatOper() {
        return codNatOper;
    }


    /**
     * Sets the codNatOper value for this NfServicos.
     * 
     * @param codNatOper
     */
    public void setCodNatOper(java.lang.String codNatOper) {
        this.codNatOper = codNatOper;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NfServicos)) return false;
        NfServicos other = (NfServicos) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cpfCnpj==null && other.getCpfCnpj()==null) || 
             (this.cpfCnpj!=null &&
              this.cpfCnpj.equals(other.getCpfCnpj()))) &&
            ((this.dmIndEmit==null && other.getDmIndEmit()==null) || 
             (this.dmIndEmit!=null &&
              this.dmIndEmit.equals(other.getDmIndEmit()))) &&
            ((this.dmIndOper==null && other.getDmIndOper()==null) || 
             (this.dmIndOper!=null &&
              this.dmIndOper.equals(other.getDmIndOper()))) &&
            ((this.codPart==null && other.getCodPart()==null) || 
             (this.codPart!=null &&
              this.codPart.equals(other.getCodPart()))) &&
            ((this.codigoModeloFiscal==null && other.getCodigoModeloFiscal()==null) || 
             (this.codigoModeloFiscal!=null &&
              this.codigoModeloFiscal.equals(other.getCodigoModeloFiscal()))) &&
            ((this.serie==null && other.getSerie()==null) || 
             (this.serie!=null &&
              this.serie.equals(other.getSerie()))) &&
            ((this.nroNf==null && other.getNroNf()==null) || 
             (this.nroNf!=null &&
              this.nroNf.equals(other.getNroNf()))) &&
            ((this.subSerie==null && other.getSubSerie()==null) || 
             (this.subSerie!=null &&
              this.subSerie.equals(other.getSubSerie()))) &&
            ((this.dtEmiss==null && other.getDtEmiss()==null) || 
             (this.dtEmiss!=null &&
              this.dtEmiss.equals(other.getDtEmiss()))) &&
            ((this.dtExeServ==null && other.getDtExeServ()==null) || 
             (this.dtExeServ!=null &&
              this.dtExeServ.equals(other.getDtExeServ()))) &&
            ((this.dtSaiEnt==null && other.getDtSaiEnt()==null) || 
             (this.dtSaiEnt!=null &&
              this.dtSaiEnt.equals(other.getDtSaiEnt()))) &&
            ((this.sitDocto==null && other.getSitDocto()==null) || 
             (this.sitDocto!=null &&
              this.sitDocto.equals(other.getSitDocto()))) &&
            ((this.chaveNfse==null && other.getChaveNfse()==null) || 
             (this.chaveNfse!=null &&
              this.chaveNfse.equals(other.getChaveNfse()))) &&
            ((this.dmIndPag==null && other.getDmIndPag()==null) || 
             (this.dmIndPag!=null &&
              this.dmIndPag.equals(other.getDmIndPag()))) &&
            ((this.dmNatOper==null && other.getDmNatOper()==null) || 
             (this.dmNatOper!=null &&
              this.dmNatOper.equals(other.getDmNatOper()))) &&
            ((this.dmTipoRps==null && other.getDmTipoRps()==null) || 
             (this.dmTipoRps!=null &&
              this.dmTipoRps.equals(other.getDmTipoRps()))) &&
            ((this.dmStatusRps==null && other.getDmStatusRps()==null) || 
             (this.dmStatusRps!=null &&
              this.dmStatusRps.equals(other.getDmStatusRps()))) &&
            ((this.nroRpsSubst==null && other.getNroRpsSubst()==null) || 
             (this.nroRpsSubst!=null &&
              this.nroRpsSubst.equals(other.getNroRpsSubst()))) &&
            ((this.serieRpsSubst==null && other.getSerieRpsSubst()==null) || 
             (this.serieRpsSubst!=null &&
              this.serieRpsSubst.equals(other.getSerieRpsSubst()))) &&
            ((this.dmStProc==null && other.getDmStProc()==null) || 
             (this.dmStProc!=null &&
              this.dmStProc.equals(other.getDmStProc()))) &&
            ((this.sistOrig==null && other.getSistOrig()==null) || 
             (this.sistOrig!=null &&
              this.sistOrig.equals(other.getSistOrig()))) &&
            ((this.unidOrg==null && other.getUnidOrg()==null) || 
             (this.unidOrg!=null &&
              this.unidOrg.equals(other.getUnidOrg()))) &&
            ((this.dmLegado==null && other.getDmLegado()==null) || 
             (this.dmLegado!=null &&
              this.dmLegado.equals(other.getDmLegado()))) &&
            ((this.itens==null && other.getItens()==null) || 
             (this.itens!=null &&
              java.util.Arrays.equals(this.itens, other.getItens()))) &&
            ((this.inforAdic==null && other.getInforAdic()==null) || 
             (this.inforAdic!=null &&
              java.util.Arrays.equals(this.inforAdic, other.getInforAdic()))) &&
            ((this.participante==null && other.getParticipante()==null) || 
             (this.participante!=null &&
              this.participante.equals(other.getParticipante()))) &&
            ((this.interServ==null && other.getInterServ()==null) || 
             (this.interServ!=null &&
              this.interServ.equals(other.getInterServ()))) &&
            ((this.detConstrCivil==null && other.getDetConstrCivil()==null) || 
             (this.detConstrCivil!=null &&
              this.detConstrCivil.equals(other.getDetConstrCivil()))) &&
            ((this.fatura==null && other.getFatura()==null) || 
             (this.fatura!=null &&
              this.fatura.equals(other.getFatura()))) &&
            ((this.cdCidadeModFiscal==null && other.getCdCidadeModFiscal()==null) || 
             (this.cdCidadeModFiscal!=null &&
              this.cdCidadeModFiscal.equals(other.getCdCidadeModFiscal()))) &&
            ((this.idNfErp==null && other.getIdNfErp()==null) || 
             (this.idNfErp!=null &&
              this.idNfErp.equals(other.getIdNfErp()))) &&
            ((this.nfProcReinf==null && other.getNfProcReinf()==null) || 
             (this.nfProcReinf!=null &&
              java.util.Arrays.equals(this.nfProcReinf, other.getNfProcReinf()))) &&
            ((this.nroAutNfs==null && other.getNroAutNfs()==null) || 
             (this.nroAutNfs!=null &&
              this.nroAutNfs.equals(other.getNroAutNfs()))) &&
            ((this.dtAutNfs==null && other.getDtAutNfs()==null) || 
             (this.dtAutNfs!=null &&
              this.dtAutNfs.equals(other.getDtAutNfs()))) &&
            ((this.codNatOper==null && other.getCodNatOper()==null) || 
             (this.codNatOper!=null &&
              this.codNatOper.equals(other.getCodNatOper())));
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
        if (getCpfCnpj() != null) {
            _hashCode += getCpfCnpj().hashCode();
        }
        if (getDmIndEmit() != null) {
            _hashCode += getDmIndEmit().hashCode();
        }
        if (getDmIndOper() != null) {
            _hashCode += getDmIndOper().hashCode();
        }
        if (getCodPart() != null) {
            _hashCode += getCodPart().hashCode();
        }
        if (getCodigoModeloFiscal() != null) {
            _hashCode += getCodigoModeloFiscal().hashCode();
        }
        if (getSerie() != null) {
            _hashCode += getSerie().hashCode();
        }
        if (getNroNf() != null) {
            _hashCode += getNroNf().hashCode();
        }
        if (getSubSerie() != null) {
            _hashCode += getSubSerie().hashCode();
        }
        if (getDtEmiss() != null) {
            _hashCode += getDtEmiss().hashCode();
        }
        if (getDtExeServ() != null) {
            _hashCode += getDtExeServ().hashCode();
        }
        if (getDtSaiEnt() != null) {
            _hashCode += getDtSaiEnt().hashCode();
        }
        if (getSitDocto() != null) {
            _hashCode += getSitDocto().hashCode();
        }
        if (getChaveNfse() != null) {
            _hashCode += getChaveNfse().hashCode();
        }
        if (getDmIndPag() != null) {
            _hashCode += getDmIndPag().hashCode();
        }
        if (getDmNatOper() != null) {
            _hashCode += getDmNatOper().hashCode();
        }
        if (getDmTipoRps() != null) {
            _hashCode += getDmTipoRps().hashCode();
        }
        if (getDmStatusRps() != null) {
            _hashCode += getDmStatusRps().hashCode();
        }
        if (getNroRpsSubst() != null) {
            _hashCode += getNroRpsSubst().hashCode();
        }
        if (getSerieRpsSubst() != null) {
            _hashCode += getSerieRpsSubst().hashCode();
        }
        if (getDmStProc() != null) {
            _hashCode += getDmStProc().hashCode();
        }
        if (getSistOrig() != null) {
            _hashCode += getSistOrig().hashCode();
        }
        if (getUnidOrg() != null) {
            _hashCode += getUnidOrg().hashCode();
        }
        if (getDmLegado() != null) {
            _hashCode += getDmLegado().hashCode();
        }
        if (getItens() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItens());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItens(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getInforAdic() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInforAdic());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInforAdic(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getParticipante() != null) {
            _hashCode += getParticipante().hashCode();
        }
        if (getInterServ() != null) {
            _hashCode += getInterServ().hashCode();
        }
        if (getDetConstrCivil() != null) {
            _hashCode += getDetConstrCivil().hashCode();
        }
        if (getFatura() != null) {
            _hashCode += getFatura().hashCode();
        }
        if (getCdCidadeModFiscal() != null) {
            _hashCode += getCdCidadeModFiscal().hashCode();
        }
        if (getIdNfErp() != null) {
            _hashCode += getIdNfErp().hashCode();
        }
        if (getNfProcReinf() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNfProcReinf());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNfProcReinf(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNroAutNfs() != null) {
            _hashCode += getNroAutNfs().hashCode();
        }
        if (getDtAutNfs() != null) {
            _hashCode += getDtAutNfs().hashCode();
        }
        if (getCodNatOper() != null) {
            _hashCode += getCodNatOper().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NfServicos.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServicos", "nfServicos"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpfCnpj");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServicos", "cpfCnpj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "tpCpfCnpj"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dmIndEmit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServicos", "dmIndEmit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "tpDominio"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dmIndOper");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServicos", "dmIndOper"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "tpDominio"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codPart");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServicos", "codPart"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoModeloFiscal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServicos", "CodigoModeloFiscal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serie");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServicos", "serie"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nroNf");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServicos", "nroNf"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subSerie");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServicos", "subSerie"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dtEmiss");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServicos", "dtEmiss"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dtExeServ");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServicos", "dtExeServ"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dtSaiEnt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServicos", "dtSaiEnt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sitDocto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServicos", "sitDocto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chaveNfse");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServicos", "chaveNfse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dmIndPag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServicos", "dmIndPag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "tpDominio"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dmNatOper");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServicos", "dmNatOper"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "tpDominio"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dmTipoRps");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServicos", "dmTipoRps"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "tpDominio"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dmStatusRps");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServicos", "dmStatusRps"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "tpDominio"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nroRpsSubst");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServicos", "nroRpsSubst"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serieRpsSubst");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServicos", "serieRpsSubst"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dmStProc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServicos", "dmStProc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sistOrig");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServicos", "sistOrig"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unidOrg");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServicos", "unidOrg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dmLegado");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServicos", "dmLegado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "tpDominio"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itens");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServicos", "itens"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServicos", "tpItens"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inforAdic");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServicos", "inforAdic"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServicos", "tpInforAdic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("participante");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServicos", "participante"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServicos", "tpParticipante"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interServ");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServicos", "interServ"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServicos", "tpInterServ"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("detConstrCivil");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServicos", "detConstrCivil"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServicos", "tpDetConstrCivil"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fatura");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServicos", "fatura"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServicos", "tpFatura"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cdCidadeModFiscal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServicos", "cdCidadeModFiscal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idNfErp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServicos", "idNfErp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nfProcReinf");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServicos", "nfProcReinf"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServicos", "tpNfProcReinf"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nroAutNfs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServicos", "nroAutNfs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dtAutNfs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServicos", "dtAutNfs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codNatOper");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServicos", "codNatOper"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
