/**
 * NfMercantil.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil;

public class NfSe  implements java.io.Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.TpCpfCnpj cpfCnpj;

    private org.apache.axis.types.NonNegativeInteger dmIndEmit;

    private org.apache.axis.types.NonNegativeInteger dmIndOper;

    private java.lang.String codPart;

    private java.lang.String codigoModeloFiscal;

    private java.lang.String serie;

    private org.apache.axis.types.NonNegativeInteger nroNf;

    private java.lang.String sitDocto;

    private java.lang.String codNatOper;

    private java.lang.String descrNatOper;

    private org.apache.axis.types.NonNegativeInteger dmIndPag;

    private java.util.Date dtSaiEnt;

    private java.lang.String horaSaiEnt;

    private java.util.Date dtEmiss;

    private java.lang.String ufEmbarq;

    private java.lang.String localEmbarq;

    private java.lang.String localDespacho;

    private java.lang.String nfEmpenho;

    private java.lang.String pedidoCompra;

    private java.lang.String contratoCompra;

    private java.math.BigInteger dmStProc;

    private org.apache.axis.types.NonNegativeInteger dmFinNFe;

    private java.lang.String cidadeIbgeEmit;

    private java.lang.String ufIbgeEmit;

    private java.lang.String nroChaveCteRef;

    private java.lang.String nroChaveNfe;

    private org.apache.axis.types.NonNegativeInteger dmIdDest;

    private org.apache.axis.types.NonNegativeInteger dmIndFinal;

    private org.apache.axis.types.NonNegativeInteger dmIndPres;

    private org.apache.axis.types.NonNegativeInteger dmLegado;

    private org.apache.axis.types.NonNegativeInteger dmIndAtivPart;

    private java.math.BigInteger dmMotDesIcmsPart;

    private org.apache.axis.types.NonNegativeInteger dmCalcIcmsStPart;

    private br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpComplNf complNf;

    private br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpServicosNf servicosNf;

    private br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpEmitente emitente;

    private br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpDestinatario destinatario;

    private br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpTotaisNf totaisNf;

    private br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpNFRef[] nfRef;

    private br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpCupomFiscalRef cupomFiscalRef;

    private br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpCfeRef cfeRef;

    private br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpInforAdic[] inforAdic;

    private br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpCobranca cobranca;

    private br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpLocal[] local;

    private br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpTransp transp;

    private br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpItens[] itens;

    private br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpAquisCana aquisCana;

    private br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpRomaneio[] romaneio;

    private br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpInforFiscal inforFiscal;

    private br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpAgendTransp agendTransp;

    private java.lang.String urlChave;

    private br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpFormaPgto[] formaPgto;

    public NfSe() {
    }

    public NfSe(
           br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.TpCpfCnpj cpfCnpj,
           org.apache.axis.types.NonNegativeInteger dmIndEmit,
           org.apache.axis.types.NonNegativeInteger dmIndOper,
           java.lang.String codPart,
           java.lang.String codigoModeloFiscal,
           java.lang.String serie,
           org.apache.axis.types.NonNegativeInteger nroNf,
           java.lang.String sitDocto,
           java.lang.String codNatOper,
           java.lang.String descrNatOper,
           org.apache.axis.types.NonNegativeInteger dmIndPag,
           java.util.Date dtSaiEnt,
           java.lang.String horaSaiEnt,
           java.util.Date dtEmiss,
           java.lang.String ufEmbarq,
           java.lang.String localEmbarq,
           java.lang.String localDespacho,
           java.lang.String nfEmpenho,
           java.lang.String pedidoCompra,
           java.lang.String contratoCompra,
           java.math.BigInteger dmStProc,
           org.apache.axis.types.NonNegativeInteger dmFinNFe,
           java.lang.String cidadeIbgeEmit,
           java.lang.String ufIbgeEmit,
           java.lang.String nroChaveCteRef,
           java.lang.String nroChaveNfe,
           org.apache.axis.types.NonNegativeInteger dmIdDest,
           org.apache.axis.types.NonNegativeInteger dmIndFinal,
           org.apache.axis.types.NonNegativeInteger dmIndPres,
           org.apache.axis.types.NonNegativeInteger dmLegado,
           org.apache.axis.types.NonNegativeInteger dmIndAtivPart,
           java.math.BigInteger dmMotDesIcmsPart,
           org.apache.axis.types.NonNegativeInteger dmCalcIcmsStPart,
           br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpComplNf complNf,
           br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpServicosNf servicosNf,
           br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpEmitente emitente,
           br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpDestinatario destinatario,
           br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpTotaisNf totaisNf,
           br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpNFRef[] nfRef,
           br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpCupomFiscalRef cupomFiscalRef,
           br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpCfeRef cfeRef,
           br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpInforAdic[] inforAdic,
           br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpCobranca cobranca,
           br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpLocal[] local,
           br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpTransp transp,
           br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpItens[] itens,
           br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpAquisCana aquisCana,
           br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpRomaneio[] romaneio,
           br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpInforFiscal inforFiscal,
           br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpAgendTransp agendTransp,
           java.lang.String urlChave,
           br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpFormaPgto[] formaPgto) {
           this.cpfCnpj = cpfCnpj;
           this.dmIndEmit = dmIndEmit;
           this.dmIndOper = dmIndOper;
           this.codPart = codPart;
           this.codigoModeloFiscal = codigoModeloFiscal;
           this.serie = serie;
           this.nroNf = nroNf;
           this.sitDocto = sitDocto;
           this.codNatOper = codNatOper;
           this.descrNatOper = descrNatOper;
           this.dmIndPag = dmIndPag;
           this.dtSaiEnt = dtSaiEnt;
           this.horaSaiEnt = horaSaiEnt;
           this.dtEmiss = dtEmiss;
           this.ufEmbarq = ufEmbarq;
           this.localEmbarq = localEmbarq;
           this.localDespacho = localDespacho;
           this.nfEmpenho = nfEmpenho;
           this.pedidoCompra = pedidoCompra;
           this.contratoCompra = contratoCompra;
           this.dmStProc = dmStProc;
           this.dmFinNFe = dmFinNFe;
           this.cidadeIbgeEmit = cidadeIbgeEmit;
           this.ufIbgeEmit = ufIbgeEmit;
           this.nroChaveCteRef = nroChaveCteRef;
           this.nroChaveNfe = nroChaveNfe;
           this.dmIdDest = dmIdDest;
           this.dmIndFinal = dmIndFinal;
           this.dmIndPres = dmIndPres;
           this.dmLegado = dmLegado;
           this.dmIndAtivPart = dmIndAtivPart;
           this.dmMotDesIcmsPart = dmMotDesIcmsPart;
           this.dmCalcIcmsStPart = dmCalcIcmsStPart;
           this.complNf = complNf;
           this.servicosNf = servicosNf;
           this.emitente = emitente;
           this.destinatario = destinatario;
           this.totaisNf = totaisNf;
           this.nfRef = nfRef;
           this.cupomFiscalRef = cupomFiscalRef;
           this.cfeRef = cfeRef;
           this.inforAdic = inforAdic;
           this.cobranca = cobranca;
           this.local = local;
           this.transp = transp;
           this.itens = itens;
           this.aquisCana = aquisCana;
           this.romaneio = romaneio;
           this.inforFiscal = inforFiscal;
           this.agendTransp = agendTransp;
           this.urlChave = urlChave;
           this.formaPgto = formaPgto;
    }


    /**
     * Gets the cpfCnpj value for this NfMercantil.
     * 
     * @return cpfCnpj
     */
    public br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.TpCpfCnpj getCpfCnpj() {
        return cpfCnpj;
    }


    /**
     * Sets the cpfCnpj value for this NfMercantil.
     * 
     * @param cpfCnpj
     */
    public void setCpfCnpj(br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.TpCpfCnpj cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }


    /**
     * Gets the dmIndEmit value for this NfMercantil.
     * 
     * @return dmIndEmit
     */
    public org.apache.axis.types.NonNegativeInteger getDmIndEmit() {
        return dmIndEmit;
    }


    /**
     * Sets the dmIndEmit value for this NfMercantil.
     * 
     * @param dmIndEmit
     */
    public void setDmIndEmit(org.apache.axis.types.NonNegativeInteger dmIndEmit) {
        this.dmIndEmit = dmIndEmit;
    }


    /**
     * Gets the dmIndOper value for this NfMercantil.
     * 
     * @return dmIndOper
     */
    public org.apache.axis.types.NonNegativeInteger getDmIndOper() {
        return dmIndOper;
    }


    /**
     * Sets the dmIndOper value for this NfMercantil.
     * 
     * @param dmIndOper
     */
    public void setDmIndOper(org.apache.axis.types.NonNegativeInteger dmIndOper) {
        this.dmIndOper = dmIndOper;
    }


    /**
     * Gets the codPart value for this NfMercantil.
     * 
     * @return codPart
     */
    public java.lang.String getCodPart() {
        return codPart;
    }


    /**
     * Sets the codPart value for this NfMercantil.
     * 
     * @param codPart
     */
    public void setCodPart(java.lang.String codPart) {
        this.codPart = codPart;
    }


    /**
     * Gets the codigoModeloFiscal value for this NfMercantil.
     * 
     * @return codigoModeloFiscal
     */
    public java.lang.String getCodigoModeloFiscal() {
        return codigoModeloFiscal;
    }


    /**
     * Sets the codigoModeloFiscal value for this NfMercantil.
     * 
     * @param codigoModeloFiscal
     */
    public void setCodigoModeloFiscal(java.lang.String codigoModeloFiscal) {
        this.codigoModeloFiscal = codigoModeloFiscal;
    }


    /**
     * Gets the serie value for this NfMercantil.
     * 
     * @return serie
     */
    public java.lang.String getSerie() {
        return serie;
    }


    /**
     * Sets the serie value for this NfMercantil.
     * 
     * @param serie
     */
    public void setSerie(java.lang.String serie) {
        this.serie = serie;
    }


    /**
     * Gets the nroNf value for this NfMercantil.
     * 
     * @return nroNf
     */
    public org.apache.axis.types.NonNegativeInteger getNroNf() {
        return nroNf;
    }


    /**
     * Sets the nroNf value for this NfMercantil.
     * 
     * @param nroNf
     */
    public void setNroNf(org.apache.axis.types.NonNegativeInteger nroNf) {
        this.nroNf = nroNf;
    }


    /**
     * Gets the sitDocto value for this NfMercantil.
     * 
     * @return sitDocto
     */
    public java.lang.String getSitDocto() {
        return sitDocto;
    }


    /**
     * Sets the sitDocto value for this NfMercantil.
     * 
     * @param sitDocto
     */
    public void setSitDocto(java.lang.String sitDocto) {
        this.sitDocto = sitDocto;
    }


    /**
     * Gets the codNatOper value for this NfMercantil.
     * 
     * @return codNatOper
     */
    public java.lang.String getCodNatOper() {
        return codNatOper;
    }


    /**
     * Sets the codNatOper value for this NfMercantil.
     * 
     * @param codNatOper
     */
    public void setCodNatOper(java.lang.String codNatOper) {
        this.codNatOper = codNatOper;
    }


    /**
     * Gets the descrNatOper value for this NfMercantil.
     * 
     * @return descrNatOper
     */
    public java.lang.String getDescrNatOper() {
        return descrNatOper;
    }


    /**
     * Sets the descrNatOper value for this NfMercantil.
     * 
     * @param descrNatOper
     */
    public void setDescrNatOper(java.lang.String descrNatOper) {
        this.descrNatOper = descrNatOper;
    }


    /**
     * Gets the dmIndPag value for this NfMercantil.
     * 
     * @return dmIndPag
     */
    public org.apache.axis.types.NonNegativeInteger getDmIndPag() {
        return dmIndPag;
    }


    /**
     * Sets the dmIndPag value for this NfMercantil.
     * 
     * @param dmIndPag
     */
    public void setDmIndPag(org.apache.axis.types.NonNegativeInteger dmIndPag) {
        this.dmIndPag = dmIndPag;
    }


    /**
     * Gets the dtSaiEnt value for this NfMercantil.
     * 
     * @return dtSaiEnt
     */
    public java.util.Date getDtSaiEnt() {
        return dtSaiEnt;
    }


    /**
     * Sets the dtSaiEnt value for this NfMercantil.
     * 
     * @param dtSaiEnt
     */
    public void setDtSaiEnt(java.util.Date dtSaiEnt) {
        this.dtSaiEnt = dtSaiEnt;
    }


    /**
     * Gets the horaSaiEnt value for this NfMercantil.
     * 
     * @return horaSaiEnt
     */
    public java.lang.String getHoraSaiEnt() {
        return horaSaiEnt;
    }


    /**
     * Sets the horaSaiEnt value for this NfMercantil.
     * 
     * @param horaSaiEnt
     */
    public void setHoraSaiEnt(java.lang.String horaSaiEnt) {
        this.horaSaiEnt = horaSaiEnt;
    }


    /**
     * Gets the dtEmiss value for this NfMercantil.
     * 
     * @return dtEmiss
     */
    public java.util.Date getDtEmiss() {
        return dtEmiss;
    }


    /**
     * Sets the dtEmiss value for this NfMercantil.
     * 
     * @param dtEmiss
     */
    public void setDtEmiss(java.util.Date dtEmiss) {
        this.dtEmiss = dtEmiss;
    }


    /**
     * Gets the ufEmbarq value for this NfMercantil.
     * 
     * @return ufEmbarq
     */
    public java.lang.String getUfEmbarq() {
        return ufEmbarq;
    }


    /**
     * Sets the ufEmbarq value for this NfMercantil.
     * 
     * @param ufEmbarq
     */
    public void setUfEmbarq(java.lang.String ufEmbarq) {
        this.ufEmbarq = ufEmbarq;
    }


    /**
     * Gets the localEmbarq value for this NfMercantil.
     * 
     * @return localEmbarq
     */
    public java.lang.String getLocalEmbarq() {
        return localEmbarq;
    }


    /**
     * Sets the localEmbarq value for this NfMercantil.
     * 
     * @param localEmbarq
     */
    public void setLocalEmbarq(java.lang.String localEmbarq) {
        this.localEmbarq = localEmbarq;
    }


    /**
     * Gets the localDespacho value for this NfMercantil.
     * 
     * @return localDespacho
     */
    public java.lang.String getLocalDespacho() {
        return localDespacho;
    }


    /**
     * Sets the localDespacho value for this NfMercantil.
     * 
     * @param localDespacho
     */
    public void setLocalDespacho(java.lang.String localDespacho) {
        this.localDespacho = localDespacho;
    }


    /**
     * Gets the nfEmpenho value for this NfMercantil.
     * 
     * @return nfEmpenho
     */
    public java.lang.String getNfEmpenho() {
        return nfEmpenho;
    }


    /**
     * Sets the nfEmpenho value for this NfMercantil.
     * 
     * @param nfEmpenho
     */
    public void setNfEmpenho(java.lang.String nfEmpenho) {
        this.nfEmpenho = nfEmpenho;
    }


    /**
     * Gets the pedidoCompra value for this NfMercantil.
     * 
     * @return pedidoCompra
     */
    public java.lang.String getPedidoCompra() {
        return pedidoCompra;
    }


    /**
     * Sets the pedidoCompra value for this NfMercantil.
     * 
     * @param pedidoCompra
     */
    public void setPedidoCompra(java.lang.String pedidoCompra) {
        this.pedidoCompra = pedidoCompra;
    }


    /**
     * Gets the contratoCompra value for this NfMercantil.
     * 
     * @return contratoCompra
     */
    public java.lang.String getContratoCompra() {
        return contratoCompra;
    }


    /**
     * Sets the contratoCompra value for this NfMercantil.
     * 
     * @param contratoCompra
     */
    public void setContratoCompra(java.lang.String contratoCompra) {
        this.contratoCompra = contratoCompra;
    }


    /**
     * Gets the dmStProc value for this NfMercantil.
     * 
     * @return dmStProc
     */
    public java.math.BigInteger getDmStProc() {
        return dmStProc;
    }


    /**
     * Sets the dmStProc value for this NfMercantil.
     * 
     * @param dmStProc
     */
    public void setDmStProc(java.math.BigInteger dmStProc) {
        this.dmStProc = dmStProc;
    }


    /**
     * Gets the dmFinNFe value for this NfMercantil.
     * 
     * @return dmFinNFe
     */
    public org.apache.axis.types.NonNegativeInteger getDmFinNFe() {
        return dmFinNFe;
    }


    /**
     * Sets the dmFinNFe value for this NfMercantil.
     * 
     * @param dmFinNFe
     */
    public void setDmFinNFe(org.apache.axis.types.NonNegativeInteger dmFinNFe) {
        this.dmFinNFe = dmFinNFe;
    }


    /**
     * Gets the cidadeIbgeEmit value for this NfMercantil.
     * 
     * @return cidadeIbgeEmit
     */
    public java.lang.String getCidadeIbgeEmit() {
        return cidadeIbgeEmit;
    }


    /**
     * Sets the cidadeIbgeEmit value for this NfMercantil.
     * 
     * @param cidadeIbgeEmit
     */
    public void setCidadeIbgeEmit(java.lang.String cidadeIbgeEmit) {
        this.cidadeIbgeEmit = cidadeIbgeEmit;
    }


    /**
     * Gets the ufIbgeEmit value for this NfMercantil.
     * 
     * @return ufIbgeEmit
     */
    public java.lang.String getUfIbgeEmit() {
        return ufIbgeEmit;
    }


    /**
     * Sets the ufIbgeEmit value for this NfMercantil.
     * 
     * @param ufIbgeEmit
     */
    public void setUfIbgeEmit(java.lang.String ufIbgeEmit) {
        this.ufIbgeEmit = ufIbgeEmit;
    }


    /**
     * Gets the nroChaveCteRef value for this NfMercantil.
     * 
     * @return nroChaveCteRef
     */
    public java.lang.String getNroChaveCteRef() {
        return nroChaveCteRef;
    }


    /**
     * Sets the nroChaveCteRef value for this NfMercantil.
     * 
     * @param nroChaveCteRef
     */
    public void setNroChaveCteRef(java.lang.String nroChaveCteRef) {
        this.nroChaveCteRef = nroChaveCteRef;
    }


    /**
     * Gets the nroChaveNfe value for this NfMercantil.
     * 
     * @return nroChaveNfe
     */
    public java.lang.String getNroChaveNfe() {
        return nroChaveNfe;
    }


    /**
     * Sets the nroChaveNfe value for this NfMercantil.
     * 
     * @param nroChaveNfe
     */
    public void setNroChaveNfe(java.lang.String nroChaveNfe) {
        this.nroChaveNfe = nroChaveNfe;
    }


    /**
     * Gets the dmIdDest value for this NfMercantil.
     * 
     * @return dmIdDest
     */
    public org.apache.axis.types.NonNegativeInteger getDmIdDest() {
        return dmIdDest;
    }


    /**
     * Sets the dmIdDest value for this NfMercantil.
     * 
     * @param dmIdDest
     */
    public void setDmIdDest(org.apache.axis.types.NonNegativeInteger dmIdDest) {
        this.dmIdDest = dmIdDest;
    }


    /**
     * Gets the dmIndFinal value for this NfMercantil.
     * 
     * @return dmIndFinal
     */
    public org.apache.axis.types.NonNegativeInteger getDmIndFinal() {
        return dmIndFinal;
    }


    /**
     * Sets the dmIndFinal value for this NfMercantil.
     * 
     * @param dmIndFinal
     */
    public void setDmIndFinal(org.apache.axis.types.NonNegativeInteger dmIndFinal) {
        this.dmIndFinal = dmIndFinal;
    }


    /**
     * Gets the dmIndPres value for this NfMercantil.
     * 
     * @return dmIndPres
     */
    public org.apache.axis.types.NonNegativeInteger getDmIndPres() {
        return dmIndPres;
    }


    /**
     * Sets the dmIndPres value for this NfMercantil.
     * 
     * @param dmIndPres
     */
    public void setDmIndPres(org.apache.axis.types.NonNegativeInteger dmIndPres) {
        this.dmIndPres = dmIndPres;
    }


    /**
     * Gets the dmLegado value for this NfMercantil.
     * 
     * @return dmLegado
     */
    public org.apache.axis.types.NonNegativeInteger getDmLegado() {
        return dmLegado;
    }


    /**
     * Sets the dmLegado value for this NfMercantil.
     * 
     * @param dmLegado
     */
    public void setDmLegado(org.apache.axis.types.NonNegativeInteger dmLegado) {
        this.dmLegado = dmLegado;
    }


    /**
     * Gets the dmIndAtivPart value for this NfMercantil.
     * 
     * @return dmIndAtivPart
     */
    public org.apache.axis.types.NonNegativeInteger getDmIndAtivPart() {
        return dmIndAtivPart;
    }


    /**
     * Sets the dmIndAtivPart value for this NfMercantil.
     * 
     * @param dmIndAtivPart
     */
    public void setDmIndAtivPart(org.apache.axis.types.NonNegativeInteger dmIndAtivPart) {
        this.dmIndAtivPart = dmIndAtivPart;
    }


    /**
     * Gets the dmMotDesIcmsPart value for this NfMercantil.
     * 
     * @return dmMotDesIcmsPart
     */
    public java.math.BigInteger getDmMotDesIcmsPart() {
        return dmMotDesIcmsPart;
    }


    /**
     * Sets the dmMotDesIcmsPart value for this NfMercantil.
     * 
     * @param dmMotDesIcmsPart
     */
    public void setDmMotDesIcmsPart(java.math.BigInteger dmMotDesIcmsPart) {
        this.dmMotDesIcmsPart = dmMotDesIcmsPart;
    }


    /**
     * Gets the dmCalcIcmsStPart value for this NfMercantil.
     * 
     * @return dmCalcIcmsStPart
     */
    public org.apache.axis.types.NonNegativeInteger getDmCalcIcmsStPart() {
        return dmCalcIcmsStPart;
    }


    /**
     * Sets the dmCalcIcmsStPart value for this NfMercantil.
     * 
     * @param dmCalcIcmsStPart
     */
    public void setDmCalcIcmsStPart(org.apache.axis.types.NonNegativeInteger dmCalcIcmsStPart) {
        this.dmCalcIcmsStPart = dmCalcIcmsStPart;
    }


    /**
     * Gets the complNf value for this NfMercantil.
     * 
     * @return complNf
     */
    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpComplNf getComplNf() {
        return complNf;
    }


    /**
     * Sets the complNf value for this NfMercantil.
     * 
     * @param complNf
     */
    public void setComplNf(br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpComplNf complNf) {
        this.complNf = complNf;
    }


    /**
     * Gets the servicosNf value for this NfMercantil.
     * 
     * @return servicosNf
     */
    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpServicosNf getServicosNf() {
        return servicosNf;
    }


    /**
     * Sets the servicosNf value for this NfMercantil.
     * 
     * @param servicosNf
     */
    public void setServicosNf(br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpServicosNf servicosNf) {
        this.servicosNf = servicosNf;
    }


    /**
     * Gets the emitente value for this NfMercantil.
     * 
     * @return emitente
     */
    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpEmitente getEmitente() {
        return emitente;
    }


    /**
     * Sets the emitente value for this NfMercantil.
     * 
     * @param emitente
     */
    public void setEmitente(br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpEmitente emitente) {
        this.emitente = emitente;
    }


    /**
     * Gets the destinatario value for this NfMercantil.
     * 
     * @return destinatario
     */
    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpDestinatario getDestinatario() {
        return destinatario;
    }


    /**
     * Sets the destinatario value for this NfMercantil.
     * 
     * @param destinatario
     */
    public void setDestinatario(br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpDestinatario destinatario) {
        this.destinatario = destinatario;
    }


    /**
     * Gets the totaisNf value for this NfMercantil.
     * 
     * @return totaisNf
     */
    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpTotaisNf getTotaisNf() {
        return totaisNf;
    }


    /**
     * Sets the totaisNf value for this NfMercantil.
     * 
     * @param totaisNf
     */
    public void setTotaisNf(br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpTotaisNf totaisNf) {
        this.totaisNf = totaisNf;
    }


    /**
     * Gets the nfRef value for this NfMercantil.
     * 
     * @return nfRef
     */
    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpNFRef[] getNfRef() {
        return nfRef;
    }


    /**
     * Sets the nfRef value for this NfMercantil.
     * 
     * @param nfRef
     */
    public void setNfRef(br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpNFRef[] nfRef) {
        this.nfRef = nfRef;
    }

    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpNFRef getNfRef(int i) {
        return this.nfRef[i];
    }

    public void setNfRef(int i, br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpNFRef _value) {
        this.nfRef[i] = _value;
    }


    /**
     * Gets the cupomFiscalRef value for this NfMercantil.
     * 
     * @return cupomFiscalRef
     */
    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpCupomFiscalRef getCupomFiscalRef() {
        return cupomFiscalRef;
    }


    /**
     * Sets the cupomFiscalRef value for this NfMercantil.
     * 
     * @param cupomFiscalRef
     */
    public void setCupomFiscalRef(br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpCupomFiscalRef cupomFiscalRef) {
        this.cupomFiscalRef = cupomFiscalRef;
    }


    /**
     * Gets the cfeRef value for this NfMercantil.
     * 
     * @return cfeRef
     */
    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpCfeRef getCfeRef() {
        return cfeRef;
    }


    /**
     * Sets the cfeRef value for this NfMercantil.
     * 
     * @param cfeRef
     */
    public void setCfeRef(br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpCfeRef cfeRef) {
        this.cfeRef = cfeRef;
    }


    /**
     * Gets the inforAdic value for this NfMercantil.
     * 
     * @return inforAdic
     */
    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpInforAdic[] getInforAdic() {
        return inforAdic;
    }


    /**
     * Sets the inforAdic value for this NfMercantil.
     * 
     * @param inforAdic
     */
    public void setInforAdic(br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpInforAdic[] inforAdic) {
        this.inforAdic = inforAdic;
    }

    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpInforAdic getInforAdic(int i) {
        return this.inforAdic[i];
    }

    public void setInforAdic(int i, br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpInforAdic _value) {
        this.inforAdic[i] = _value;
    }


    /**
     * Gets the cobranca value for this NfMercantil.
     * 
     * @return cobranca
     */
    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpCobranca getCobranca() {
        return cobranca;
    }


    /**
     * Sets the cobranca value for this NfMercantil.
     * 
     * @param cobranca
     */
    public void setCobranca(br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpCobranca cobranca) {
        this.cobranca = cobranca;
    }


    /**
     * Gets the local value for this NfMercantil.
     * 
     * @return local
     */
    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpLocal[] getLocal() {
        return local;
    }


    /**
     * Sets the local value for this NfMercantil.
     * 
     * @param local
     */
    public void setLocal(br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpLocal[] local) {
        this.local = local;
    }

    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpLocal getLocal(int i) {
        return this.local[i];
    }

    public void setLocal(int i, br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpLocal _value) {
        this.local[i] = _value;
    }


    /**
     * Gets the transp value for this NfMercantil.
     * 
     * @return transp
     */
    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpTransp getTransp() {
        return transp;
    }


    /**
     * Sets the transp value for this NfMercantil.
     * 
     * @param transp
     */
    public void setTransp(br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpTransp transp) {
        this.transp = transp;
    }


    /**
     * Gets the itens value for this NfMercantil.
     * 
     * @return itens
     */
    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpItens[] getItens() {
        return itens;
    }


    /**
     * Sets the itens value for this NfMercantil.
     * 
     * @param itens
     */
    public void setItens(br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpItens[] itens) {
        this.itens = itens;
    }

    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpItens getItens(int i) {
        return this.itens[i];
    }

    public void setItens(int i, br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpItens _value) {
        this.itens[i] = _value;
    }


    /**
     * Gets the aquisCana value for this NfMercantil.
     * 
     * @return aquisCana
     */
    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpAquisCana getAquisCana() {
        return aquisCana;
    }


    /**
     * Sets the aquisCana value for this NfMercantil.
     * 
     * @param aquisCana
     */
    public void setAquisCana(br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpAquisCana aquisCana) {
        this.aquisCana = aquisCana;
    }


    /**
     * Gets the romaneio value for this NfMercantil.
     * 
     * @return romaneio
     */
    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpRomaneio[] getRomaneio() {
        return romaneio;
    }


    /**
     * Sets the romaneio value for this NfMercantil.
     * 
     * @param romaneio
     */
    public void setRomaneio(br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpRomaneio[] romaneio) {
        this.romaneio = romaneio;
    }

    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpRomaneio getRomaneio(int i) {
        return this.romaneio[i];
    }

    public void setRomaneio(int i, br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpRomaneio _value) {
        this.romaneio[i] = _value;
    }


    /**
     * Gets the inforFiscal value for this NfMercantil.
     * 
     * @return inforFiscal
     */
    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpInforFiscal getInforFiscal() {
        return inforFiscal;
    }


    /**
     * Sets the inforFiscal value for this NfMercantil.
     * 
     * @param inforFiscal
     */
    public void setInforFiscal(br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpInforFiscal inforFiscal) {
        this.inforFiscal = inforFiscal;
    }


    /**
     * Gets the agendTransp value for this NfMercantil.
     * 
     * @return agendTransp
     */
    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpAgendTransp getAgendTransp() {
        return agendTransp;
    }


    /**
     * Sets the agendTransp value for this NfMercantil.
     * 
     * @param agendTransp
     */
    public void setAgendTransp(br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpAgendTransp agendTransp) {
        this.agendTransp = agendTransp;
    }


    /**
     * Gets the urlChave value for this NfMercantil.
     * 
     * @return urlChave
     */
    public java.lang.String getUrlChave() {
        return urlChave;
    }


    /**
     * Sets the urlChave value for this NfMercantil.
     * 
     * @param urlChave
     */
    public void setUrlChave(java.lang.String urlChave) {
        this.urlChave = urlChave;
    }


    /**
     * Gets the formaPgto value for this NfMercantil.
     * 
     * @return formaPgto
     */
    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpFormaPgto[] getFormaPgto() {
        return formaPgto;
    }


    /**
     * Sets the formaPgto value for this NfMercantil.
     * 
     * @param formaPgto
     */
    public void setFormaPgto(br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpFormaPgto[] formaPgto) {
        this.formaPgto = formaPgto;
    }

    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpFormaPgto getFormaPgto(int i) {
        return this.formaPgto[i];
    }

    public void setFormaPgto(int i, br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpFormaPgto _value) {
        this.formaPgto[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NfSe)) return false;
        NfSe other = (NfSe) obj;
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
            ((this.sitDocto==null && other.getSitDocto()==null) || 
             (this.sitDocto!=null &&
              this.sitDocto.equals(other.getSitDocto()))) &&
            ((this.codNatOper==null && other.getCodNatOper()==null) || 
             (this.codNatOper!=null &&
              this.codNatOper.equals(other.getCodNatOper()))) &&
            ((this.descrNatOper==null && other.getDescrNatOper()==null) || 
             (this.descrNatOper!=null &&
              this.descrNatOper.equals(other.getDescrNatOper()))) &&
            ((this.dmIndPag==null && other.getDmIndPag()==null) || 
             (this.dmIndPag!=null &&
              this.dmIndPag.equals(other.getDmIndPag()))) &&
            ((this.dtSaiEnt==null && other.getDtSaiEnt()==null) || 
             (this.dtSaiEnt!=null &&
              this.dtSaiEnt.equals(other.getDtSaiEnt()))) &&
            ((this.horaSaiEnt==null && other.getHoraSaiEnt()==null) || 
             (this.horaSaiEnt!=null &&
              this.horaSaiEnt.equals(other.getHoraSaiEnt()))) &&
            ((this.dtEmiss==null && other.getDtEmiss()==null) || 
             (this.dtEmiss!=null &&
              this.dtEmiss.equals(other.getDtEmiss()))) &&
            ((this.ufEmbarq==null && other.getUfEmbarq()==null) || 
             (this.ufEmbarq!=null &&
              this.ufEmbarq.equals(other.getUfEmbarq()))) &&
            ((this.localEmbarq==null && other.getLocalEmbarq()==null) || 
             (this.localEmbarq!=null &&
              this.localEmbarq.equals(other.getLocalEmbarq()))) &&
            ((this.localDespacho==null && other.getLocalDespacho()==null) || 
             (this.localDespacho!=null &&
              this.localDespacho.equals(other.getLocalDespacho()))) &&
            ((this.nfEmpenho==null && other.getNfEmpenho()==null) || 
             (this.nfEmpenho!=null &&
              this.nfEmpenho.equals(other.getNfEmpenho()))) &&
            ((this.pedidoCompra==null && other.getPedidoCompra()==null) || 
             (this.pedidoCompra!=null &&
              this.pedidoCompra.equals(other.getPedidoCompra()))) &&
            ((this.contratoCompra==null && other.getContratoCompra()==null) || 
             (this.contratoCompra!=null &&
              this.contratoCompra.equals(other.getContratoCompra()))) &&
            ((this.dmStProc==null && other.getDmStProc()==null) || 
             (this.dmStProc!=null &&
              this.dmStProc.equals(other.getDmStProc()))) &&
            ((this.dmFinNFe==null && other.getDmFinNFe()==null) || 
             (this.dmFinNFe!=null &&
              this.dmFinNFe.equals(other.getDmFinNFe()))) &&
            ((this.cidadeIbgeEmit==null && other.getCidadeIbgeEmit()==null) || 
             (this.cidadeIbgeEmit!=null &&
              this.cidadeIbgeEmit.equals(other.getCidadeIbgeEmit()))) &&
            ((this.ufIbgeEmit==null && other.getUfIbgeEmit()==null) || 
             (this.ufIbgeEmit!=null &&
              this.ufIbgeEmit.equals(other.getUfIbgeEmit()))) &&
            ((this.nroChaveCteRef==null && other.getNroChaveCteRef()==null) || 
             (this.nroChaveCteRef!=null &&
              this.nroChaveCteRef.equals(other.getNroChaveCteRef()))) &&
            ((this.nroChaveNfe==null && other.getNroChaveNfe()==null) || 
             (this.nroChaveNfe!=null &&
              this.nroChaveNfe.equals(other.getNroChaveNfe()))) &&
            ((this.dmIdDest==null && other.getDmIdDest()==null) || 
             (this.dmIdDest!=null &&
              this.dmIdDest.equals(other.getDmIdDest()))) &&
            ((this.dmIndFinal==null && other.getDmIndFinal()==null) || 
             (this.dmIndFinal!=null &&
              this.dmIndFinal.equals(other.getDmIndFinal()))) &&
            ((this.dmIndPres==null && other.getDmIndPres()==null) || 
             (this.dmIndPres!=null &&
              this.dmIndPres.equals(other.getDmIndPres()))) &&
            ((this.dmLegado==null && other.getDmLegado()==null) || 
             (this.dmLegado!=null &&
              this.dmLegado.equals(other.getDmLegado()))) &&
            ((this.dmIndAtivPart==null && other.getDmIndAtivPart()==null) || 
             (this.dmIndAtivPart!=null &&
              this.dmIndAtivPart.equals(other.getDmIndAtivPart()))) &&
            ((this.dmMotDesIcmsPart==null && other.getDmMotDesIcmsPart()==null) || 
             (this.dmMotDesIcmsPart!=null &&
              this.dmMotDesIcmsPart.equals(other.getDmMotDesIcmsPart()))) &&
            ((this.dmCalcIcmsStPart==null && other.getDmCalcIcmsStPart()==null) || 
             (this.dmCalcIcmsStPart!=null &&
              this.dmCalcIcmsStPart.equals(other.getDmCalcIcmsStPart()))) &&
            ((this.complNf==null && other.getComplNf()==null) || 
             (this.complNf!=null &&
              this.complNf.equals(other.getComplNf()))) &&
            ((this.servicosNf==null && other.getServicosNf()==null) || 
             (this.servicosNf!=null &&
              this.servicosNf.equals(other.getServicosNf()))) &&
            ((this.emitente==null && other.getEmitente()==null) || 
             (this.emitente!=null &&
              this.emitente.equals(other.getEmitente()))) &&
            ((this.destinatario==null && other.getDestinatario()==null) || 
             (this.destinatario!=null &&
              this.destinatario.equals(other.getDestinatario()))) &&
            ((this.totaisNf==null && other.getTotaisNf()==null) || 
             (this.totaisNf!=null &&
              this.totaisNf.equals(other.getTotaisNf()))) &&
            ((this.nfRef==null && other.getNfRef()==null) || 
             (this.nfRef!=null &&
              java.util.Arrays.equals(this.nfRef, other.getNfRef()))) &&
            ((this.cupomFiscalRef==null && other.getCupomFiscalRef()==null) || 
             (this.cupomFiscalRef!=null &&
              this.cupomFiscalRef.equals(other.getCupomFiscalRef()))) &&
            ((this.cfeRef==null && other.getCfeRef()==null) || 
             (this.cfeRef!=null &&
              this.cfeRef.equals(other.getCfeRef()))) &&
            ((this.inforAdic==null && other.getInforAdic()==null) || 
             (this.inforAdic!=null &&
              java.util.Arrays.equals(this.inforAdic, other.getInforAdic()))) &&
            ((this.cobranca==null && other.getCobranca()==null) || 
             (this.cobranca!=null &&
              this.cobranca.equals(other.getCobranca()))) &&
            ((this.local==null && other.getLocal()==null) || 
             (this.local!=null &&
              java.util.Arrays.equals(this.local, other.getLocal()))) &&
            ((this.transp==null && other.getTransp()==null) || 
             (this.transp!=null &&
              this.transp.equals(other.getTransp()))) &&
            ((this.itens==null && other.getItens()==null) || 
             (this.itens!=null &&
              java.util.Arrays.equals(this.itens, other.getItens()))) &&
            ((this.aquisCana==null && other.getAquisCana()==null) || 
             (this.aquisCana!=null &&
              this.aquisCana.equals(other.getAquisCana()))) &&
            ((this.romaneio==null && other.getRomaneio()==null) || 
             (this.romaneio!=null &&
              java.util.Arrays.equals(this.romaneio, other.getRomaneio()))) &&
            ((this.inforFiscal==null && other.getInforFiscal()==null) || 
             (this.inforFiscal!=null &&
              this.inforFiscal.equals(other.getInforFiscal()))) &&
            ((this.agendTransp==null && other.getAgendTransp()==null) || 
             (this.agendTransp!=null &&
              this.agendTransp.equals(other.getAgendTransp()))) &&
            ((this.urlChave==null && other.getUrlChave()==null) || 
             (this.urlChave!=null &&
              this.urlChave.equals(other.getUrlChave()))) &&
            ((this.formaPgto==null && other.getFormaPgto()==null) || 
             (this.formaPgto!=null &&
              java.util.Arrays.equals(this.formaPgto, other.getFormaPgto())));
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
        if (getSitDocto() != null) {
            _hashCode += getSitDocto().hashCode();
        }
        if (getCodNatOper() != null) {
            _hashCode += getCodNatOper().hashCode();
        }
        if (getDescrNatOper() != null) {
            _hashCode += getDescrNatOper().hashCode();
        }
        if (getDmIndPag() != null) {
            _hashCode += getDmIndPag().hashCode();
        }
        if (getDtSaiEnt() != null) {
            _hashCode += getDtSaiEnt().hashCode();
        }
        if (getHoraSaiEnt() != null) {
            _hashCode += getHoraSaiEnt().hashCode();
        }
        if (getDtEmiss() != null) {
            _hashCode += getDtEmiss().hashCode();
        }
        if (getUfEmbarq() != null) {
            _hashCode += getUfEmbarq().hashCode();
        }
        if (getLocalEmbarq() != null) {
            _hashCode += getLocalEmbarq().hashCode();
        }
        if (getLocalDespacho() != null) {
            _hashCode += getLocalDespacho().hashCode();
        }
        if (getNfEmpenho() != null) {
            _hashCode += getNfEmpenho().hashCode();
        }
        if (getPedidoCompra() != null) {
            _hashCode += getPedidoCompra().hashCode();
        }
        if (getContratoCompra() != null) {
            _hashCode += getContratoCompra().hashCode();
        }
        if (getDmStProc() != null) {
            _hashCode += getDmStProc().hashCode();
        }
        if (getDmFinNFe() != null) {
            _hashCode += getDmFinNFe().hashCode();
        }
        if (getCidadeIbgeEmit() != null) {
            _hashCode += getCidadeIbgeEmit().hashCode();
        }
        if (getUfIbgeEmit() != null) {
            _hashCode += getUfIbgeEmit().hashCode();
        }
        if (getNroChaveCteRef() != null) {
            _hashCode += getNroChaveCteRef().hashCode();
        }
        if (getNroChaveNfe() != null) {
            _hashCode += getNroChaveNfe().hashCode();
        }
        if (getDmIdDest() != null) {
            _hashCode += getDmIdDest().hashCode();
        }
        if (getDmIndFinal() != null) {
            _hashCode += getDmIndFinal().hashCode();
        }
        if (getDmIndPres() != null) {
            _hashCode += getDmIndPres().hashCode();
        }
        if (getDmLegado() != null) {
            _hashCode += getDmLegado().hashCode();
        }
        if (getDmIndAtivPart() != null) {
            _hashCode += getDmIndAtivPart().hashCode();
        }
        if (getDmMotDesIcmsPart() != null) {
            _hashCode += getDmMotDesIcmsPart().hashCode();
        }
        if (getDmCalcIcmsStPart() != null) {
            _hashCode += getDmCalcIcmsStPart().hashCode();
        }
        if (getComplNf() != null) {
            _hashCode += getComplNf().hashCode();
        }
        if (getServicosNf() != null) {
            _hashCode += getServicosNf().hashCode();
        }
        if (getEmitente() != null) {
            _hashCode += getEmitente().hashCode();
        }
        if (getDestinatario() != null) {
            _hashCode += getDestinatario().hashCode();
        }
        if (getTotaisNf() != null) {
            _hashCode += getTotaisNf().hashCode();
        }
        if (getNfRef() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNfRef());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNfRef(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCupomFiscalRef() != null) {
            _hashCode += getCupomFiscalRef().hashCode();
        }
        if (getCfeRef() != null) {
            _hashCode += getCfeRef().hashCode();
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
        if (getCobranca() != null) {
            _hashCode += getCobranca().hashCode();
        }
        if (getLocal() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocal());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocal(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTransp() != null) {
            _hashCode += getTransp().hashCode();
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
        if (getAquisCana() != null) {
            _hashCode += getAquisCana().hashCode();
        }
        if (getRomaneio() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRomaneio());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRomaneio(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getInforFiscal() != null) {
            _hashCode += getInforFiscal().hashCode();
        }
        if (getAgendTransp() != null) {
            _hashCode += getAgendTransp().hashCode();
        }
        if (getUrlChave() != null) {
            _hashCode += getUrlChave().hashCode();
        }
        if (getFormaPgto() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFormaPgto());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFormaPgto(), i);
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
        new org.apache.axis.description.TypeDesc(NfSe.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "nfMercantil"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpfCnpj");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "cpfCnpj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "tpCpfCnpj"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dmIndEmit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "dmIndEmit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "tpDominio"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dmIndOper");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "dmIndOper"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "tpDominio"));
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
        elemField.setFieldName("codigoModeloFiscal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "CodigoModeloFiscal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "tpStringSizeTwoComplementos"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serie");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "serie"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nroNf");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "nroNf"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sitDocto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "sitDocto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codNatOper");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "codNatOper"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descrNatOper");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "descrNatOper"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dmIndPag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "dmIndPag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "tpDominio"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dtSaiEnt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "dtSaiEnt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("horaSaiEnt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "horaSaiEnt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dtEmiss");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "dtEmiss"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ufEmbarq");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "ufEmbarq"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localEmbarq");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "localEmbarq"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localDespacho");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "localDespacho"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nfEmpenho");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "nfEmpenho"));
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
        elemField.setFieldName("contratoCompra");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "contratoCompra"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dmStProc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "dmStProc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dmFinNFe");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "dmFinNFe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "tpDominio"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cidadeIbgeEmit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "cidadeIbgeEmit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ufIbgeEmit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "ufIbgeEmit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nroChaveCteRef");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "nroChaveCteRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nroChaveNfe");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "nroChaveNfe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dmIdDest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "dmIdDest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "tpDominio"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dmIndFinal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "dmIndFinal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "tpDominio"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dmIndPres");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "dmIndPres"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "tpDominio"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dmLegado");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "dmLegado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "tpDominio"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dmIndAtivPart");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "dmIndAtivPart"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "tpDominio"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dmMotDesIcmsPart");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "dmMotDesIcmsPart"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dmCalcIcmsStPart");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "dmCalcIcmsStPart"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "tpDominio"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("complNf");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "complNf"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "tpComplNf"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servicosNf");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "servicosNf"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "tpServicosNf"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emitente");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "emitente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "tpEmitente"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinatario");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "destinatario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "tpDestinatario"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totaisNf");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "totaisNf"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "tpTotaisNf"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nfRef");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "nfRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "tpNFRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cupomFiscalRef");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "cupomFiscalRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "tpCupomFiscalRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cfeRef");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "cfeRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "tpCfeRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inforAdic");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "inforAdic"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "tpInforAdic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cobranca");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "cobranca"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "tpCobranca"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("local");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "local"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "tpLocal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "transp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "tpTransp"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itens");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "itens"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "tpItens"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aquisCana");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "aquisCana"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "tpAquisCana"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("romaneio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "romaneio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "tpRomaneio"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inforFiscal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "inforFiscal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "tpInforFiscal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agendTransp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "agendTransp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "tpAgendTransp"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("urlChave");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "urlChave"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("formaPgto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "formaPgto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "tpFormaPgto"));
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
