/**
 * ChaveLogica.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.consultaGenerica;

public class ChaveLogica  implements java.io.Serializable {
    private java.lang.String codigoHistoricoPadrao;

    private java.util.Date dataInicioValidade;

    private java.util.Date dataFinalValidade;

    private org.apache.axis.types.NonNegativeInteger codigoCfopOrigem;

    private java.lang.String siglaUFDestinatario;

    private java.lang.String codigoInformacao;

    private br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.TpCpfCnpj cpfCnpj;

    private java.lang.String codigoCentroCusto;

    private java.lang.String codigoPlanoConta;

    private java.lang.String descricao;

    private java.lang.String codParticipante;

    private java.lang.String cpfCnpjEmit;

    private org.apache.axis.types.NonNegativeInteger dmIndEmit;

    private org.apache.axis.types.NonNegativeInteger dmIndOper;

    private java.lang.String codPart;

    private java.lang.String codigoModeloFiscal;

    private java.lang.String codMod;

    private java.lang.String serie;

    private java.lang.String codigoItem;

    private java.lang.String siglaUnid;

    private java.lang.String codigoNaturezaOperacao;

    private java.lang.String codCta;

    private java.lang.String codIndBem;

    private java.lang.String codGrupoPat;

    private java.lang.String codStIcmsSt;

    private java.lang.String codigoObservacao;

    private java.util.Date dtInventario;

    private java.lang.String codCCusto;

    private java.lang.String subSerie;

    private org.apache.axis.types.NonNegativeInteger numCt;

    private org.apache.axis.types.NonNegativeInteger nroNf;

    private java.util.Date dtIni;

    private java.util.Date dtFin;

    private java.lang.String numLcto;

    private org.apache.axis.types.NonNegativeInteger anoRef;

    private java.lang.String codRetImp;

    private org.apache.axis.types.NonNegativeInteger dmOrigem;

    private java.util.Date dtVcto;

    private java.util.Date dtPgto;

    private java.lang.String nroDoc;

    private java.util.Date dtRet;

    private java.math.BigInteger identRec;

    private java.util.Date dtDoc;

    private java.util.Date dtProd;

    private java.lang.String dmCodProd;

    private java.lang.String login;

    private java.math.BigInteger ano;

    private java.math.BigInteger mes;

    private java.lang.String codAjApur;

    private java.math.BigInteger idIntegr;

    private java.lang.String codRegTrab;

    private java.lang.String codLtc;

    private java.math.BigInteger nroIni;

    private java.math.BigInteger nroFim;

    private java.math.BigInteger dmIndFl;

    private java.util.Date dtComp;

    private java.lang.String codRubrica;

    private java.util.Date dtCont;

    private java.lang.String nroOp;

    private java.math.BigInteger situacao;

    private java.lang.String descrSituacao;

    private java.lang.String dmMesRef;

    private java.lang.String dmIndAtiv;

    private java.lang.String cstPis;

    private java.math.BigDecimal aliqPis;

    private java.lang.String cstCofins;

    private java.math.BigDecimal aliqCofins;

    private java.lang.String infoCompl;

    private java.math.BigInteger seqLocacao;

    private java.lang.String numContrato;

    private java.lang.String codPartLocador;

    private java.lang.String codPartLocatario;

    private java.lang.String codPartComprador;

    private java.lang.String codPartVendedor;

    private java.lang.String codAgl;

    private java.math.BigDecimal dmIndDoc;

    private java.math.BigDecimal nroDe;

    private java.util.Date dtDe;

    private java.lang.String baseCalcCredPc;

    private java.math.BigInteger mesRef;

    private java.math.BigInteger dmTipoOper;

    private java.lang.String link;

    private java.lang.String codVerifNfs;

    private java.math.BigInteger nroAutNfs;

    //private java.util.Date dtAutNfs;
    
    private java.lang.String dtAutNfs;

    private java.lang.String codNcmOrig;

    private java.lang.String cnpjOrig;

    private java.lang.String codItemOrig;

    private java.lang.String codItemDest;

    private java.lang.String codCfopOrig;

    private java.lang.String codStIpiOrig;

    private java.lang.String codStIcmsOrig;

    private java.lang.Integer dmRaizCnpjOrig;

    private java.util.Date dtRef;

    private java.math.BigInteger dmStProc;

    private java.lang.String cdTipoCredPc;

    private java.util.Date dtEvento;

    public ChaveLogica() {
    }

    public ChaveLogica(
           java.lang.String codigoHistoricoPadrao,
           java.util.Date dataInicioValidade,
           java.util.Date dataFinalValidade,
           org.apache.axis.types.NonNegativeInteger codigoCfopOrigem,
           java.lang.String siglaUFDestinatario,
           java.lang.String codigoInformacao,
           br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.TpCpfCnpj cpfCnpj,
           java.lang.String codigoCentroCusto,
           java.lang.String codigoPlanoConta,
           java.lang.String descricao,
           java.lang.String codParticipante,
           java.lang.String cpfCnpjEmit,
           org.apache.axis.types.NonNegativeInteger dmIndEmit,
           org.apache.axis.types.NonNegativeInteger dmIndOper,
           java.lang.String codPart,
           java.lang.String codigoModeloFiscal,
           java.lang.String codMod,
           java.lang.String serie,
           java.lang.String codigoItem,
           java.lang.String siglaUnid,
           java.lang.String codigoNaturezaOperacao,
           java.lang.String codCta,
           java.lang.String codIndBem,
           java.lang.String codGrupoPat,
           java.lang.String codStIcmsSt,
           java.lang.String codigoObservacao,
           java.util.Date dtInventario,
           java.lang.String codCCusto,
           java.lang.String subSerie,
           org.apache.axis.types.NonNegativeInteger numCt,
           org.apache.axis.types.NonNegativeInteger nroNf,
           java.util.Date dtIni,
           java.util.Date dtFin,
           java.lang.String numLcto,
           org.apache.axis.types.NonNegativeInteger anoRef,
           java.lang.String codRetImp,
           org.apache.axis.types.NonNegativeInteger dmOrigem,
           java.util.Date dtVcto,
           java.util.Date dtPgto,
           java.lang.String nroDoc,
           java.util.Date dtRet,
           java.math.BigInteger identRec,
           java.util.Date dtDoc,
           java.util.Date dtProd,
           java.lang.String dmCodProd,
           java.lang.String login,
           java.math.BigInteger ano,
           java.math.BigInteger mes,
           java.lang.String codAjApur,
           java.math.BigInteger idIntegr,
           java.lang.String codRegTrab,
           java.lang.String codLtc,
           java.math.BigInteger nroIni,
           java.math.BigInteger nroFim,
           java.math.BigInteger dmIndFl,
           java.util.Date dtComp,
           java.lang.String codRubrica,
           java.util.Date dtCont,
           java.lang.String nroOp,
           java.math.BigInteger situacao,
           java.lang.String descrSituacao,
           java.lang.String dmMesRef,
           java.lang.String dmIndAtiv,
           java.lang.String cstPis,
           java.math.BigDecimal aliqPis,
           java.lang.String cstCofins,
           java.math.BigDecimal aliqCofins,
           java.lang.String infoCompl,
           java.math.BigInteger seqLocacao,
           java.lang.String numContrato,
           java.lang.String codPartLocador,
           java.lang.String codPartLocatario,
           java.lang.String codPartComprador,
           java.lang.String codPartVendedor,
           java.lang.String codAgl,
           java.math.BigDecimal dmIndDoc,
           java.math.BigDecimal nroDe,
           java.util.Date dtDe,
           java.lang.String baseCalcCredPc,
           java.math.BigInteger mesRef,
           java.math.BigInteger dmTipoOper,
           java.lang.String link,
           java.lang.String codVerifNfs,
           java.math.BigInteger nroAutNfs,
           java.lang.String dtAutNfs,
           java.lang.String codNcmOrig,
           java.lang.String cnpjOrig,
           java.lang.String codItemOrig,
           java.lang.String codItemDest,
           java.lang.String codCfopOrig,
           java.lang.String codStIpiOrig,
           java.lang.String codStIcmsOrig,
           java.lang.Integer dmRaizCnpjOrig,
           java.util.Date dtRef,
           java.math.BigInteger dmStProc,
           java.lang.String cdTipoCredPc,
           java.util.Date dtEvento) {
           this.codigoHistoricoPadrao = codigoHistoricoPadrao;
           this.dataInicioValidade = dataInicioValidade;
           this.dataFinalValidade = dataFinalValidade;
           this.codigoCfopOrigem = codigoCfopOrigem;
           this.siglaUFDestinatario = siglaUFDestinatario;
           this.codigoInformacao = codigoInformacao;
           this.cpfCnpj = cpfCnpj;
           this.codigoCentroCusto = codigoCentroCusto;
           this.codigoPlanoConta = codigoPlanoConta;
           this.descricao = descricao;
           this.codParticipante = codParticipante;
           this.cpfCnpjEmit = cpfCnpjEmit;
           this.dmIndEmit = dmIndEmit;
           this.dmIndOper = dmIndOper;
           this.codPart = codPart;
           this.codigoModeloFiscal = codigoModeloFiscal;
           this.codMod = codMod;
           this.serie = serie;
           this.codigoItem = codigoItem;
           this.siglaUnid = siglaUnid;
           this.codigoNaturezaOperacao = codigoNaturezaOperacao;
           this.codCta = codCta;
           this.codIndBem = codIndBem;
           this.codGrupoPat = codGrupoPat;
           this.codStIcmsSt = codStIcmsSt;
           this.codigoObservacao = codigoObservacao;
           this.dtInventario = dtInventario;
           this.codCCusto = codCCusto;
           this.subSerie = subSerie;
           this.numCt = numCt;
           this.nroNf = nroNf;
           this.dtIni = dtIni;
           this.dtFin = dtFin;
           this.numLcto = numLcto;
           this.anoRef = anoRef;
           this.codRetImp = codRetImp;
           this.dmOrigem = dmOrigem;
           this.dtVcto = dtVcto;
           this.dtPgto = dtPgto;
           this.nroDoc = nroDoc;
           this.dtRet = dtRet;
           this.identRec = identRec;
           this.dtDoc = dtDoc;
           this.dtProd = dtProd;
           this.dmCodProd = dmCodProd;
           this.login = login;
           this.ano = ano;
           this.mes = mes;
           this.codAjApur = codAjApur;
           this.idIntegr = idIntegr;
           this.codRegTrab = codRegTrab;
           this.codLtc = codLtc;
           this.nroIni = nroIni;
           this.nroFim = nroFim;
           this.dmIndFl = dmIndFl;
           this.dtComp = dtComp;
           this.codRubrica = codRubrica;
           this.dtCont = dtCont;
           this.nroOp = nroOp;
           this.situacao = situacao;
           this.descrSituacao = descrSituacao;
           this.dmMesRef = dmMesRef;
           this.dmIndAtiv = dmIndAtiv;
           this.cstPis = cstPis;
           this.aliqPis = aliqPis;
           this.cstCofins = cstCofins;
           this.aliqCofins = aliqCofins;
           this.infoCompl = infoCompl;
           this.seqLocacao = seqLocacao;
           this.numContrato = numContrato;
           this.codPartLocador = codPartLocador;
           this.codPartLocatario = codPartLocatario;
           this.codPartComprador = codPartComprador;
           this.codPartVendedor = codPartVendedor;
           this.codAgl = codAgl;
           this.dmIndDoc = dmIndDoc;
           this.nroDe = nroDe;
           this.dtDe = dtDe;
           this.baseCalcCredPc = baseCalcCredPc;
           this.mesRef = mesRef;
           this.dmTipoOper = dmTipoOper;
           this.link = link;
           this.codVerifNfs = codVerifNfs;
           this.nroAutNfs = nroAutNfs;
           this.dtAutNfs = dtAutNfs;
           this.codNcmOrig = codNcmOrig;
           this.cnpjOrig = cnpjOrig;
           this.codItemOrig = codItemOrig;
           this.codItemDest = codItemDest;
           this.codCfopOrig = codCfopOrig;
           this.codStIpiOrig = codStIpiOrig;
           this.codStIcmsOrig = codStIcmsOrig;
           this.dmRaizCnpjOrig = dmRaizCnpjOrig;
           this.dtRef = dtRef;
           this.dmStProc = dmStProc;
           this.cdTipoCredPc = cdTipoCredPc;
           this.dtEvento = dtEvento;
    }


    /**
     * Gets the codigoHistoricoPadrao value for this ChaveLogica.
     * 
     * @return codigoHistoricoPadrao
     */
    public java.lang.String getCodigoHistoricoPadrao() {
        return codigoHistoricoPadrao;
    }


    /**
     * Sets the codigoHistoricoPadrao value for this ChaveLogica.
     * 
     * @param codigoHistoricoPadrao
     */
    public void setCodigoHistoricoPadrao(java.lang.String codigoHistoricoPadrao) {
        this.codigoHistoricoPadrao = codigoHistoricoPadrao;
    }


    /**
     * Gets the dataInicioValidade value for this ChaveLogica.
     * 
     * @return dataInicioValidade
     */
    public java.util.Date getDataInicioValidade() {
        return dataInicioValidade;
    }


    /**
     * Sets the dataInicioValidade value for this ChaveLogica.
     * 
     * @param dataInicioValidade
     */
    public void setDataInicioValidade(java.util.Date dataInicioValidade) {
        this.dataInicioValidade = dataInicioValidade;
    }


    /**
     * Gets the dataFinalValidade value for this ChaveLogica.
     * 
     * @return dataFinalValidade
     */
    public java.util.Date getDataFinalValidade() {
        return dataFinalValidade;
    }


    /**
     * Sets the dataFinalValidade value for this ChaveLogica.
     * 
     * @param dataFinalValidade
     */
    public void setDataFinalValidade(java.util.Date dataFinalValidade) {
        this.dataFinalValidade = dataFinalValidade;
    }


    /**
     * Gets the codigoCfopOrigem value for this ChaveLogica.
     * 
     * @return codigoCfopOrigem
     */
    public org.apache.axis.types.NonNegativeInteger getCodigoCfopOrigem() {
        return codigoCfopOrigem;
    }


    /**
     * Sets the codigoCfopOrigem value for this ChaveLogica.
     * 
     * @param codigoCfopOrigem
     */
    public void setCodigoCfopOrigem(org.apache.axis.types.NonNegativeInteger codigoCfopOrigem) {
        this.codigoCfopOrigem = codigoCfopOrigem;
    }


    /**
     * Gets the siglaUFDestinatario value for this ChaveLogica.
     * 
     * @return siglaUFDestinatario
     */
    public java.lang.String getSiglaUFDestinatario() {
        return siglaUFDestinatario;
    }


    /**
     * Sets the siglaUFDestinatario value for this ChaveLogica.
     * 
     * @param siglaUFDestinatario
     */
    public void setSiglaUFDestinatario(java.lang.String siglaUFDestinatario) {
        this.siglaUFDestinatario = siglaUFDestinatario;
    }


    /**
     * Gets the codigoInformacao value for this ChaveLogica.
     * 
     * @return codigoInformacao
     */
    public java.lang.String getCodigoInformacao() {
        return codigoInformacao;
    }


    /**
     * Sets the codigoInformacao value for this ChaveLogica.
     * 
     * @param codigoInformacao
     */
    public void setCodigoInformacao(java.lang.String codigoInformacao) {
        this.codigoInformacao = codigoInformacao;
    }


    /**
     * Gets the cpfCnpj value for this ChaveLogica.
     * 
     * @return cpfCnpj
     */
    public br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.TpCpfCnpj getCpfCnpj() {
        return cpfCnpj;
    }


    /**
     * Sets the cpfCnpj value for this ChaveLogica.
     * 
     * @param cpfCnpj
     */
    public void setCpfCnpj(br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.TpCpfCnpj cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }


    /**
     * Gets the codigoCentroCusto value for this ChaveLogica.
     * 
     * @return codigoCentroCusto
     */
    public java.lang.String getCodigoCentroCusto() {
        return codigoCentroCusto;
    }


    /**
     * Sets the codigoCentroCusto value for this ChaveLogica.
     * 
     * @param codigoCentroCusto
     */
    public void setCodigoCentroCusto(java.lang.String codigoCentroCusto) {
        this.codigoCentroCusto = codigoCentroCusto;
    }


    /**
     * Gets the codigoPlanoConta value for this ChaveLogica.
     * 
     * @return codigoPlanoConta
     */
    public java.lang.String getCodigoPlanoConta() {
        return codigoPlanoConta;
    }


    /**
     * Sets the codigoPlanoConta value for this ChaveLogica.
     * 
     * @param codigoPlanoConta
     */
    public void setCodigoPlanoConta(java.lang.String codigoPlanoConta) {
        this.codigoPlanoConta = codigoPlanoConta;
    }


    /**
     * Gets the descricao value for this ChaveLogica.
     * 
     * @return descricao
     */
    public java.lang.String getDescricao() {
        return descricao;
    }


    /**
     * Sets the descricao value for this ChaveLogica.
     * 
     * @param descricao
     */
    public void setDescricao(java.lang.String descricao) {
        this.descricao = descricao;
    }


    /**
     * Gets the codParticipante value for this ChaveLogica.
     * 
     * @return codParticipante
     */
    public java.lang.String getCodParticipante() {
        return codParticipante;
    }


    /**
     * Sets the codParticipante value for this ChaveLogica.
     * 
     * @param codParticipante
     */
    public void setCodParticipante(java.lang.String codParticipante) {
        this.codParticipante = codParticipante;
    }


    /**
     * Gets the cpfCnpjEmit value for this ChaveLogica.
     * 
     * @return cpfCnpjEmit
     */
    public java.lang.String getCpfCnpjEmit() {
        return cpfCnpjEmit;
    }


    /**
     * Sets the cpfCnpjEmit value for this ChaveLogica.
     * 
     * @param cpfCnpjEmit
     */
    public void setCpfCnpjEmit(java.lang.String cpfCnpjEmit) {
        this.cpfCnpjEmit = cpfCnpjEmit;
    }


    /**
     * Gets the dmIndEmit value for this ChaveLogica.
     * 
     * @return dmIndEmit
     */
    public org.apache.axis.types.NonNegativeInteger getDmIndEmit() {
        return dmIndEmit;
    }


    /**
     * Sets the dmIndEmit value for this ChaveLogica.
     * 
     * @param dmIndEmit
     */
    public void setDmIndEmit(org.apache.axis.types.NonNegativeInteger dmIndEmit) {
        this.dmIndEmit = dmIndEmit;
    }


    /**
     * Gets the dmIndOper value for this ChaveLogica.
     * 
     * @return dmIndOper
     */
    public org.apache.axis.types.NonNegativeInteger getDmIndOper() {
        return dmIndOper;
    }


    /**
     * Sets the dmIndOper value for this ChaveLogica.
     * 
     * @param dmIndOper
     */
    public void setDmIndOper(org.apache.axis.types.NonNegativeInteger dmIndOper) {
        this.dmIndOper = dmIndOper;
    }


    /**
     * Gets the codPart value for this ChaveLogica.
     * 
     * @return codPart
     */
    public java.lang.String getCodPart() {
        return codPart;
    }


    /**
     * Sets the codPart value for this ChaveLogica.
     * 
     * @param codPart
     */
    public void setCodPart(java.lang.String codPart) {
        this.codPart = codPart;
    }


    /**
     * Gets the codigoModeloFiscal value for this ChaveLogica.
     * 
     * @return codigoModeloFiscal
     */
    public java.lang.String getCodigoModeloFiscal() {
        return codigoModeloFiscal;
    }


    /**
     * Sets the codigoModeloFiscal value for this ChaveLogica.
     * 
     * @param codigoModeloFiscal
     */
    public void setCodigoModeloFiscal(java.lang.String codigoModeloFiscal) {
        this.codigoModeloFiscal = codigoModeloFiscal;
    }


    /**
     * Gets the codMod value for this ChaveLogica.
     * 
     * @return codMod
     */
    public java.lang.String getCodMod() {
        return codMod;
    }


    /**
     * Sets the codMod value for this ChaveLogica.
     * 
     * @param codMod
     */
    public void setCodMod(java.lang.String codMod) {
        this.codMod = codMod;
    }


    /**
     * Gets the serie value for this ChaveLogica.
     * 
     * @return serie
     */
    public java.lang.String getSerie() {
        return serie;
    }


    /**
     * Sets the serie value for this ChaveLogica.
     * 
     * @param serie
     */
    public void setSerie(java.lang.String serie) {
        this.serie = serie;
    }


    /**
     * Gets the codigoItem value for this ChaveLogica.
     * 
     * @return codigoItem
     */
    public java.lang.String getCodigoItem() {
        return codigoItem;
    }


    /**
     * Sets the codigoItem value for this ChaveLogica.
     * 
     * @param codigoItem
     */
    public void setCodigoItem(java.lang.String codigoItem) {
        this.codigoItem = codigoItem;
    }


    /**
     * Gets the siglaUnid value for this ChaveLogica.
     * 
     * @return siglaUnid
     */
    public java.lang.String getSiglaUnid() {
        return siglaUnid;
    }


    /**
     * Sets the siglaUnid value for this ChaveLogica.
     * 
     * @param siglaUnid
     */
    public void setSiglaUnid(java.lang.String siglaUnid) {
        this.siglaUnid = siglaUnid;
    }


    /**
     * Gets the codigoNaturezaOperacao value for this ChaveLogica.
     * 
     * @return codigoNaturezaOperacao
     */
    public java.lang.String getCodigoNaturezaOperacao() {
        return codigoNaturezaOperacao;
    }


    /**
     * Sets the codigoNaturezaOperacao value for this ChaveLogica.
     * 
     * @param codigoNaturezaOperacao
     */
    public void setCodigoNaturezaOperacao(java.lang.String codigoNaturezaOperacao) {
        this.codigoNaturezaOperacao = codigoNaturezaOperacao;
    }


    /**
     * Gets the codCta value for this ChaveLogica.
     * 
     * @return codCta
     */
    public java.lang.String getCodCta() {
        return codCta;
    }


    /**
     * Sets the codCta value for this ChaveLogica.
     * 
     * @param codCta
     */
    public void setCodCta(java.lang.String codCta) {
        this.codCta = codCta;
    }


    /**
     * Gets the codIndBem value for this ChaveLogica.
     * 
     * @return codIndBem
     */
    public java.lang.String getCodIndBem() {
        return codIndBem;
    }


    /**
     * Sets the codIndBem value for this ChaveLogica.
     * 
     * @param codIndBem
     */
    public void setCodIndBem(java.lang.String codIndBem) {
        this.codIndBem = codIndBem;
    }


    /**
     * Gets the codGrupoPat value for this ChaveLogica.
     * 
     * @return codGrupoPat
     */
    public java.lang.String getCodGrupoPat() {
        return codGrupoPat;
    }


    /**
     * Sets the codGrupoPat value for this ChaveLogica.
     * 
     * @param codGrupoPat
     */
    public void setCodGrupoPat(java.lang.String codGrupoPat) {
        this.codGrupoPat = codGrupoPat;
    }


    /**
     * Gets the codStIcmsSt value for this ChaveLogica.
     * 
     * @return codStIcmsSt
     */
    public java.lang.String getCodStIcmsSt() {
        return codStIcmsSt;
    }


    /**
     * Sets the codStIcmsSt value for this ChaveLogica.
     * 
     * @param codStIcmsSt
     */
    public void setCodStIcmsSt(java.lang.String codStIcmsSt) {
        this.codStIcmsSt = codStIcmsSt;
    }


    /**
     * Gets the codigoObservacao value for this ChaveLogica.
     * 
     * @return codigoObservacao
     */
    public java.lang.String getCodigoObservacao() {
        return codigoObservacao;
    }


    /**
     * Sets the codigoObservacao value for this ChaveLogica.
     * 
     * @param codigoObservacao
     */
    public void setCodigoObservacao(java.lang.String codigoObservacao) {
        this.codigoObservacao = codigoObservacao;
    }


    /**
     * Gets the dtInventario value for this ChaveLogica.
     * 
     * @return dtInventario
     */
    public java.util.Date getDtInventario() {
        return dtInventario;
    }


    /**
     * Sets the dtInventario value for this ChaveLogica.
     * 
     * @param dtInventario
     */
    public void setDtInventario(java.util.Date dtInventario) {
        this.dtInventario = dtInventario;
    }


    /**
     * Gets the codCCusto value for this ChaveLogica.
     * 
     * @return codCCusto
     */
    public java.lang.String getCodCCusto() {
        return codCCusto;
    }


    /**
     * Sets the codCCusto value for this ChaveLogica.
     * 
     * @param codCCusto
     */
    public void setCodCCusto(java.lang.String codCCusto) {
        this.codCCusto = codCCusto;
    }


    /**
     * Gets the subSerie value for this ChaveLogica.
     * 
     * @return subSerie
     */
    public java.lang.String getSubSerie() {
        return subSerie;
    }


    /**
     * Sets the subSerie value for this ChaveLogica.
     * 
     * @param subSerie
     */
    public void setSubSerie(java.lang.String subSerie) {
        this.subSerie = subSerie;
    }


    /**
     * Gets the numCt value for this ChaveLogica.
     * 
     * @return numCt
     */
    public org.apache.axis.types.NonNegativeInteger getNumCt() {
        return numCt;
    }


    /**
     * Sets the numCt value for this ChaveLogica.
     * 
     * @param numCt
     */
    public void setNumCt(org.apache.axis.types.NonNegativeInteger numCt) {
        this.numCt = numCt;
    }


    /**
     * Gets the nroNf value for this ChaveLogica.
     * 
     * @return nroNf
     */
    public org.apache.axis.types.NonNegativeInteger getNroNf() {
        return nroNf;
    }


    /**
     * Sets the nroNf value for this ChaveLogica.
     * 
     * @param nroNf
     */
    public void setNroNf(org.apache.axis.types.NonNegativeInteger nroNf) {
        this.nroNf = nroNf;
    }


    /**
     * Gets the dtIni value for this ChaveLogica.
     * 
     * @return dtIni
     */
    public java.util.Date getDtIni() {
        return dtIni;
    }


    /**
     * Sets the dtIni value for this ChaveLogica.
     * 
     * @param dtIni
     */
    public void setDtIni(java.util.Date dtIni) {
        this.dtIni = dtIni;
    }


    /**
     * Gets the dtFin value for this ChaveLogica.
     * 
     * @return dtFin
     */
    public java.util.Date getDtFin() {
        return dtFin;
    }


    /**
     * Sets the dtFin value for this ChaveLogica.
     * 
     * @param dtFin
     */
    public void setDtFin(java.util.Date dtFin) {
        this.dtFin = dtFin;
    }


    /**
     * Gets the numLcto value for this ChaveLogica.
     * 
     * @return numLcto
     */
    public java.lang.String getNumLcto() {
        return numLcto;
    }


    /**
     * Sets the numLcto value for this ChaveLogica.
     * 
     * @param numLcto
     */
    public void setNumLcto(java.lang.String numLcto) {
        this.numLcto = numLcto;
    }


    /**
     * Gets the anoRef value for this ChaveLogica.
     * 
     * @return anoRef
     */
    public org.apache.axis.types.NonNegativeInteger getAnoRef() {
        return anoRef;
    }


    /**
     * Sets the anoRef value for this ChaveLogica.
     * 
     * @param anoRef
     */
    public void setAnoRef(org.apache.axis.types.NonNegativeInteger anoRef) {
        this.anoRef = anoRef;
    }


    /**
     * Gets the codRetImp value for this ChaveLogica.
     * 
     * @return codRetImp
     */
    public java.lang.String getCodRetImp() {
        return codRetImp;
    }


    /**
     * Sets the codRetImp value for this ChaveLogica.
     * 
     * @param codRetImp
     */
    public void setCodRetImp(java.lang.String codRetImp) {
        this.codRetImp = codRetImp;
    }


    /**
     * Gets the dmOrigem value for this ChaveLogica.
     * 
     * @return dmOrigem
     */
    public org.apache.axis.types.NonNegativeInteger getDmOrigem() {
        return dmOrigem;
    }


    /**
     * Sets the dmOrigem value for this ChaveLogica.
     * 
     * @param dmOrigem
     */
    public void setDmOrigem(org.apache.axis.types.NonNegativeInteger dmOrigem) {
        this.dmOrigem = dmOrigem;
    }


    /**
     * Gets the dtVcto value for this ChaveLogica.
     * 
     * @return dtVcto
     */
    public java.util.Date getDtVcto() {
        return dtVcto;
    }


    /**
     * Sets the dtVcto value for this ChaveLogica.
     * 
     * @param dtVcto
     */
    public void setDtVcto(java.util.Date dtVcto) {
        this.dtVcto = dtVcto;
    }


    /**
     * Gets the dtPgto value for this ChaveLogica.
     * 
     * @return dtPgto
     */
    public java.util.Date getDtPgto() {
        return dtPgto;
    }


    /**
     * Sets the dtPgto value for this ChaveLogica.
     * 
     * @param dtPgto
     */
    public void setDtPgto(java.util.Date dtPgto) {
        this.dtPgto = dtPgto;
    }


    /**
     * Gets the nroDoc value for this ChaveLogica.
     * 
     * @return nroDoc
     */
    public java.lang.String getNroDoc() {
        return nroDoc;
    }


    /**
     * Sets the nroDoc value for this ChaveLogica.
     * 
     * @param nroDoc
     */
    public void setNroDoc(java.lang.String nroDoc) {
        this.nroDoc = nroDoc;
    }


    /**
     * Gets the dtRet value for this ChaveLogica.
     * 
     * @return dtRet
     */
    public java.util.Date getDtRet() {
        return dtRet;
    }


    /**
     * Sets the dtRet value for this ChaveLogica.
     * 
     * @param dtRet
     */
    public void setDtRet(java.util.Date dtRet) {
        this.dtRet = dtRet;
    }


    /**
     * Gets the identRec value for this ChaveLogica.
     * 
     * @return identRec
     */
    public java.math.BigInteger getIdentRec() {
        return identRec;
    }


    /**
     * Sets the identRec value for this ChaveLogica.
     * 
     * @param identRec
     */
    public void setIdentRec(java.math.BigInteger identRec) {
        this.identRec = identRec;
    }


    /**
     * Gets the dtDoc value for this ChaveLogica.
     * 
     * @return dtDoc
     */
    public java.util.Date getDtDoc() {
        return dtDoc;
    }


    /**
     * Sets the dtDoc value for this ChaveLogica.
     * 
     * @param dtDoc
     */
    public void setDtDoc(java.util.Date dtDoc) {
        this.dtDoc = dtDoc;
    }


    /**
     * Gets the dtProd value for this ChaveLogica.
     * 
     * @return dtProd
     */
    public java.util.Date getDtProd() {
        return dtProd;
    }


    /**
     * Sets the dtProd value for this ChaveLogica.
     * 
     * @param dtProd
     */
    public void setDtProd(java.util.Date dtProd) {
        this.dtProd = dtProd;
    }


    /**
     * Gets the dmCodProd value for this ChaveLogica.
     * 
     * @return dmCodProd
     */
    public java.lang.String getDmCodProd() {
        return dmCodProd;
    }


    /**
     * Sets the dmCodProd value for this ChaveLogica.
     * 
     * @param dmCodProd
     */
    public void setDmCodProd(java.lang.String dmCodProd) {
        this.dmCodProd = dmCodProd;
    }


    /**
     * Gets the login value for this ChaveLogica.
     * 
     * @return login
     */
    public java.lang.String getLogin() {
        return login;
    }


    /**
     * Sets the login value for this ChaveLogica.
     * 
     * @param login
     */
    public void setLogin(java.lang.String login) {
        this.login = login;
    }


    /**
     * Gets the ano value for this ChaveLogica.
     * 
     * @return ano
     */
    public java.math.BigInteger getAno() {
        return ano;
    }


    /**
     * Sets the ano value for this ChaveLogica.
     * 
     * @param ano
     */
    public void setAno(java.math.BigInteger ano) {
        this.ano = ano;
    }


    /**
     * Gets the mes value for this ChaveLogica.
     * 
     * @return mes
     */
    public java.math.BigInteger getMes() {
        return mes;
    }


    /**
     * Sets the mes value for this ChaveLogica.
     * 
     * @param mes
     */
    public void setMes(java.math.BigInteger mes) {
        this.mes = mes;
    }


    /**
     * Gets the codAjApur value for this ChaveLogica.
     * 
     * @return codAjApur
     */
    public java.lang.String getCodAjApur() {
        return codAjApur;
    }


    /**
     * Sets the codAjApur value for this ChaveLogica.
     * 
     * @param codAjApur
     */
    public void setCodAjApur(java.lang.String codAjApur) {
        this.codAjApur = codAjApur;
    }


    /**
     * Gets the idIntegr value for this ChaveLogica.
     * 
     * @return idIntegr
     */
    public java.math.BigInteger getIdIntegr() {
        return idIntegr;
    }


    /**
     * Sets the idIntegr value for this ChaveLogica.
     * 
     * @param idIntegr
     */
    public void setIdIntegr(java.math.BigInteger idIntegr) {
        this.idIntegr = idIntegr;
    }


    /**
     * Gets the codRegTrab value for this ChaveLogica.
     * 
     * @return codRegTrab
     */
    public java.lang.String getCodRegTrab() {
        return codRegTrab;
    }


    /**
     * Sets the codRegTrab value for this ChaveLogica.
     * 
     * @param codRegTrab
     */
    public void setCodRegTrab(java.lang.String codRegTrab) {
        this.codRegTrab = codRegTrab;
    }


    /**
     * Gets the codLtc value for this ChaveLogica.
     * 
     * @return codLtc
     */
    public java.lang.String getCodLtc() {
        return codLtc;
    }


    /**
     * Sets the codLtc value for this ChaveLogica.
     * 
     * @param codLtc
     */
    public void setCodLtc(java.lang.String codLtc) {
        this.codLtc = codLtc;
    }


    /**
     * Gets the nroIni value for this ChaveLogica.
     * 
     * @return nroIni
     */
    public java.math.BigInteger getNroIni() {
        return nroIni;
    }


    /**
     * Sets the nroIni value for this ChaveLogica.
     * 
     * @param nroIni
     */
    public void setNroIni(java.math.BigInteger nroIni) {
        this.nroIni = nroIni;
    }


    /**
     * Gets the nroFim value for this ChaveLogica.
     * 
     * @return nroFim
     */
    public java.math.BigInteger getNroFim() {
        return nroFim;
    }


    /**
     * Sets the nroFim value for this ChaveLogica.
     * 
     * @param nroFim
     */
    public void setNroFim(java.math.BigInteger nroFim) {
        this.nroFim = nroFim;
    }


    /**
     * Gets the dmIndFl value for this ChaveLogica.
     * 
     * @return dmIndFl
     */
    public java.math.BigInteger getDmIndFl() {
        return dmIndFl;
    }


    /**
     * Sets the dmIndFl value for this ChaveLogica.
     * 
     * @param dmIndFl
     */
    public void setDmIndFl(java.math.BigInteger dmIndFl) {
        this.dmIndFl = dmIndFl;
    }


    /**
     * Gets the dtComp value for this ChaveLogica.
     * 
     * @return dtComp
     */
    public java.util.Date getDtComp() {
        return dtComp;
    }


    /**
     * Sets the dtComp value for this ChaveLogica.
     * 
     * @param dtComp
     */
    public void setDtComp(java.util.Date dtComp) {
        this.dtComp = dtComp;
    }


    /**
     * Gets the codRubrica value for this ChaveLogica.
     * 
     * @return codRubrica
     */
    public java.lang.String getCodRubrica() {
        return codRubrica;
    }


    /**
     * Sets the codRubrica value for this ChaveLogica.
     * 
     * @param codRubrica
     */
    public void setCodRubrica(java.lang.String codRubrica) {
        this.codRubrica = codRubrica;
    }


    /**
     * Gets the dtCont value for this ChaveLogica.
     * 
     * @return dtCont
     */
    public java.util.Date getDtCont() {
        return dtCont;
    }


    /**
     * Sets the dtCont value for this ChaveLogica.
     * 
     * @param dtCont
     */
    public void setDtCont(java.util.Date dtCont) {
        this.dtCont = dtCont;
    }


    /**
     * Gets the nroOp value for this ChaveLogica.
     * 
     * @return nroOp
     */
    public java.lang.String getNroOp() {
        return nroOp;
    }


    /**
     * Sets the nroOp value for this ChaveLogica.
     * 
     * @param nroOp
     */
    public void setNroOp(java.lang.String nroOp) {
        this.nroOp = nroOp;
    }


    /**
     * Gets the situacao value for this ChaveLogica.
     * 
     * @return situacao
     */
    public java.math.BigInteger getSituacao() {
        return situacao;
    }


    /**
     * Sets the situacao value for this ChaveLogica.
     * 
     * @param situacao
     */
    public void setSituacao(java.math.BigInteger situacao) {
        this.situacao = situacao;
    }


    /**
     * Gets the descrSituacao value for this ChaveLogica.
     * 
     * @return descrSituacao
     */
    public java.lang.String getDescrSituacao() {
        return descrSituacao;
    }


    /**
     * Sets the descrSituacao value for this ChaveLogica.
     * 
     * @param descrSituacao
     */
    public void setDescrSituacao(java.lang.String descrSituacao) {
        this.descrSituacao = descrSituacao;
    }


    /**
     * Gets the dmMesRef value for this ChaveLogica.
     * 
     * @return dmMesRef
     */
    public java.lang.String getDmMesRef() {
        return dmMesRef;
    }


    /**
     * Sets the dmMesRef value for this ChaveLogica.
     * 
     * @param dmMesRef
     */
    public void setDmMesRef(java.lang.String dmMesRef) {
        this.dmMesRef = dmMesRef;
    }


    /**
     * Gets the dmIndAtiv value for this ChaveLogica.
     * 
     * @return dmIndAtiv
     */
    public java.lang.String getDmIndAtiv() {
        return dmIndAtiv;
    }


    /**
     * Sets the dmIndAtiv value for this ChaveLogica.
     * 
     * @param dmIndAtiv
     */
    public void setDmIndAtiv(java.lang.String dmIndAtiv) {
        this.dmIndAtiv = dmIndAtiv;
    }


    /**
     * Gets the cstPis value for this ChaveLogica.
     * 
     * @return cstPis
     */
    public java.lang.String getCstPis() {
        return cstPis;
    }


    /**
     * Sets the cstPis value for this ChaveLogica.
     * 
     * @param cstPis
     */
    public void setCstPis(java.lang.String cstPis) {
        this.cstPis = cstPis;
    }


    /**
     * Gets the aliqPis value for this ChaveLogica.
     * 
     * @return aliqPis
     */
    public java.math.BigDecimal getAliqPis() {
        return aliqPis;
    }


    /**
     * Sets the aliqPis value for this ChaveLogica.
     * 
     * @param aliqPis
     */
    public void setAliqPis(java.math.BigDecimal aliqPis) {
        this.aliqPis = aliqPis;
    }


    /**
     * Gets the cstCofins value for this ChaveLogica.
     * 
     * @return cstCofins
     */
    public java.lang.String getCstCofins() {
        return cstCofins;
    }


    /**
     * Sets the cstCofins value for this ChaveLogica.
     * 
     * @param cstCofins
     */
    public void setCstCofins(java.lang.String cstCofins) {
        this.cstCofins = cstCofins;
    }


    /**
     * Gets the aliqCofins value for this ChaveLogica.
     * 
     * @return aliqCofins
     */
    public java.math.BigDecimal getAliqCofins() {
        return aliqCofins;
    }


    /**
     * Sets the aliqCofins value for this ChaveLogica.
     * 
     * @param aliqCofins
     */
    public void setAliqCofins(java.math.BigDecimal aliqCofins) {
        this.aliqCofins = aliqCofins;
    }


    /**
     * Gets the infoCompl value for this ChaveLogica.
     * 
     * @return infoCompl
     */
    public java.lang.String getInfoCompl() {
        return infoCompl;
    }


    /**
     * Sets the infoCompl value for this ChaveLogica.
     * 
     * @param infoCompl
     */
    public void setInfoCompl(java.lang.String infoCompl) {
        this.infoCompl = infoCompl;
    }


    /**
     * Gets the seqLocacao value for this ChaveLogica.
     * 
     * @return seqLocacao
     */
    public java.math.BigInteger getSeqLocacao() {
        return seqLocacao;
    }


    /**
     * Sets the seqLocacao value for this ChaveLogica.
     * 
     * @param seqLocacao
     */
    public void setSeqLocacao(java.math.BigInteger seqLocacao) {
        this.seqLocacao = seqLocacao;
    }


    /**
     * Gets the numContrato value for this ChaveLogica.
     * 
     * @return numContrato
     */
    public java.lang.String getNumContrato() {
        return numContrato;
    }


    /**
     * Sets the numContrato value for this ChaveLogica.
     * 
     * @param numContrato
     */
    public void setNumContrato(java.lang.String numContrato) {
        this.numContrato = numContrato;
    }


    /**
     * Gets the codPartLocador value for this ChaveLogica.
     * 
     * @return codPartLocador
     */
    public java.lang.String getCodPartLocador() {
        return codPartLocador;
    }


    /**
     * Sets the codPartLocador value for this ChaveLogica.
     * 
     * @param codPartLocador
     */
    public void setCodPartLocador(java.lang.String codPartLocador) {
        this.codPartLocador = codPartLocador;
    }


    /**
     * Gets the codPartLocatario value for this ChaveLogica.
     * 
     * @return codPartLocatario
     */
    public java.lang.String getCodPartLocatario() {
        return codPartLocatario;
    }


    /**
     * Sets the codPartLocatario value for this ChaveLogica.
     * 
     * @param codPartLocatario
     */
    public void setCodPartLocatario(java.lang.String codPartLocatario) {
        this.codPartLocatario = codPartLocatario;
    }


    /**
     * Gets the codPartComprador value for this ChaveLogica.
     * 
     * @return codPartComprador
     */
    public java.lang.String getCodPartComprador() {
        return codPartComprador;
    }


    /**
     * Sets the codPartComprador value for this ChaveLogica.
     * 
     * @param codPartComprador
     */
    public void setCodPartComprador(java.lang.String codPartComprador) {
        this.codPartComprador = codPartComprador;
    }


    /**
     * Gets the codPartVendedor value for this ChaveLogica.
     * 
     * @return codPartVendedor
     */
    public java.lang.String getCodPartVendedor() {
        return codPartVendedor;
    }


    /**
     * Sets the codPartVendedor value for this ChaveLogica.
     * 
     * @param codPartVendedor
     */
    public void setCodPartVendedor(java.lang.String codPartVendedor) {
        this.codPartVendedor = codPartVendedor;
    }


    /**
     * Gets the codAgl value for this ChaveLogica.
     * 
     * @return codAgl
     */
    public java.lang.String getCodAgl() {
        return codAgl;
    }


    /**
     * Sets the codAgl value for this ChaveLogica.
     * 
     * @param codAgl
     */
    public void setCodAgl(java.lang.String codAgl) {
        this.codAgl = codAgl;
    }


    /**
     * Gets the dmIndDoc value for this ChaveLogica.
     * 
     * @return dmIndDoc
     */
    public java.math.BigDecimal getDmIndDoc() {
        return dmIndDoc;
    }


    /**
     * Sets the dmIndDoc value for this ChaveLogica.
     * 
     * @param dmIndDoc
     */
    public void setDmIndDoc(java.math.BigDecimal dmIndDoc) {
        this.dmIndDoc = dmIndDoc;
    }


    /**
     * Gets the nroDe value for this ChaveLogica.
     * 
     * @return nroDe
     */
    public java.math.BigDecimal getNroDe() {
        return nroDe;
    }


    /**
     * Sets the nroDe value for this ChaveLogica.
     * 
     * @param nroDe
     */
    public void setNroDe(java.math.BigDecimal nroDe) {
        this.nroDe = nroDe;
    }


    /**
     * Gets the dtDe value for this ChaveLogica.
     * 
     * @return dtDe
     */
    public java.util.Date getDtDe() {
        return dtDe;
    }


    /**
     * Sets the dtDe value for this ChaveLogica.
     * 
     * @param dtDe
     */
    public void setDtDe(java.util.Date dtDe) {
        this.dtDe = dtDe;
    }


    /**
     * Gets the baseCalcCredPc value for this ChaveLogica.
     * 
     * @return baseCalcCredPc
     */
    public java.lang.String getBaseCalcCredPc() {
        return baseCalcCredPc;
    }


    /**
     * Sets the baseCalcCredPc value for this ChaveLogica.
     * 
     * @param baseCalcCredPc
     */
    public void setBaseCalcCredPc(java.lang.String baseCalcCredPc) {
        this.baseCalcCredPc = baseCalcCredPc;
    }


    /**
     * Gets the mesRef value for this ChaveLogica.
     * 
     * @return mesRef
     */
    public java.math.BigInteger getMesRef() {
        return mesRef;
    }


    /**
     * Sets the mesRef value for this ChaveLogica.
     * 
     * @param mesRef
     */
    public void setMesRef(java.math.BigInteger mesRef) {
        this.mesRef = mesRef;
    }


    /**
     * Gets the dmTipoOper value for this ChaveLogica.
     * 
     * @return dmTipoOper
     */
    public java.math.BigInteger getDmTipoOper() {
        return dmTipoOper;
    }


    /**
     * Sets the dmTipoOper value for this ChaveLogica.
     * 
     * @param dmTipoOper
     */
    public void setDmTipoOper(java.math.BigInteger dmTipoOper) {
        this.dmTipoOper = dmTipoOper;
    }


    /**
     * Gets the link value for this ChaveLogica.
     * 
     * @return link
     */
    public java.lang.String getLink() {
        return link;
    }


    /**
     * Sets the link value for this ChaveLogica.
     * 
     * @param link
     */
    public void setLink(java.lang.String link) {
        this.link = link;
    }


    /**
     * Gets the codVerifNfs value for this ChaveLogica.
     * 
     * @return codVerifNfs
     */
    public java.lang.String getCodVerifNfs() {
        return codVerifNfs;
    }


    /**
     * Sets the codVerifNfs value for this ChaveLogica.
     * 
     * @param codVerifNfs
     */
    public void setCodVerifNfs(java.lang.String codVerifNfs) {
        this.codVerifNfs = codVerifNfs;
    }


    /**
     * Gets the nroAutNfs value for this ChaveLogica.
     * 
     * @return nroAutNfs
     */
    public java.math.BigInteger getNroAutNfs() {
        return nroAutNfs;
    }


    /**
     * Sets the nroAutNfs value for this ChaveLogica.
     * 
     * @param nroAutNfs
     */
    public void setNroAutNfs(java.math.BigInteger nroAutNfs) {
        this.nroAutNfs = nroAutNfs;
    }   


    public java.lang.String getDtAutNfs() {
		return dtAutNfs;
	}

	public void setDtAutNfs(java.lang.String dtAutNfs) {
		this.dtAutNfs = dtAutNfs;
	}

	/**
     * Gets the codNcmOrig value for this ChaveLogica.
     * 
     * @return codNcmOrig
     */
    public java.lang.String getCodNcmOrig() {
        return codNcmOrig;
    }


    /**
     * Sets the codNcmOrig value for this ChaveLogica.
     * 
     * @param codNcmOrig
     */
    public void setCodNcmOrig(java.lang.String codNcmOrig) {
        this.codNcmOrig = codNcmOrig;
    }


    /**
     * Gets the cnpjOrig value for this ChaveLogica.
     * 
     * @return cnpjOrig
     */
    public java.lang.String getCnpjOrig() {
        return cnpjOrig;
    }


    /**
     * Sets the cnpjOrig value for this ChaveLogica.
     * 
     * @param cnpjOrig
     */
    public void setCnpjOrig(java.lang.String cnpjOrig) {
        this.cnpjOrig = cnpjOrig;
    }


    /**
     * Gets the codItemOrig value for this ChaveLogica.
     * 
     * @return codItemOrig
     */
    public java.lang.String getCodItemOrig() {
        return codItemOrig;
    }


    /**
     * Sets the codItemOrig value for this ChaveLogica.
     * 
     * @param codItemOrig
     */
    public void setCodItemOrig(java.lang.String codItemOrig) {
        this.codItemOrig = codItemOrig;
    }


    /**
     * Gets the codItemDest value for this ChaveLogica.
     * 
     * @return codItemDest
     */
    public java.lang.String getCodItemDest() {
        return codItemDest;
    }


    /**
     * Sets the codItemDest value for this ChaveLogica.
     * 
     * @param codItemDest
     */
    public void setCodItemDest(java.lang.String codItemDest) {
        this.codItemDest = codItemDest;
    }


    /**
     * Gets the codCfopOrig value for this ChaveLogica.
     * 
     * @return codCfopOrig
     */
    public java.lang.String getCodCfopOrig() {
        return codCfopOrig;
    }


    /**
     * Sets the codCfopOrig value for this ChaveLogica.
     * 
     * @param codCfopOrig
     */
    public void setCodCfopOrig(java.lang.String codCfopOrig) {
        this.codCfopOrig = codCfopOrig;
    }


    /**
     * Gets the codStIpiOrig value for this ChaveLogica.
     * 
     * @return codStIpiOrig
     */
    public java.lang.String getCodStIpiOrig() {
        return codStIpiOrig;
    }


    /**
     * Sets the codStIpiOrig value for this ChaveLogica.
     * 
     * @param codStIpiOrig
     */
    public void setCodStIpiOrig(java.lang.String codStIpiOrig) {
        this.codStIpiOrig = codStIpiOrig;
    }


    /**
     * Gets the codStIcmsOrig value for this ChaveLogica.
     * 
     * @return codStIcmsOrig
     */
    public java.lang.String getCodStIcmsOrig() {
        return codStIcmsOrig;
    }


    /**
     * Sets the codStIcmsOrig value for this ChaveLogica.
     * 
     * @param codStIcmsOrig
     */
    public void setCodStIcmsOrig(java.lang.String codStIcmsOrig) {
        this.codStIcmsOrig = codStIcmsOrig;
    }


    /**
     * Gets the dmRaizCnpjOrig value for this ChaveLogica.
     * 
     * @return dmRaizCnpjOrig
     */
    public java.lang.Integer getDmRaizCnpjOrig() {
        return dmRaizCnpjOrig;
    }


    /**
     * Sets the dmRaizCnpjOrig value for this ChaveLogica.
     * 
     * @param dmRaizCnpjOrig
     */
    public void setDmRaizCnpjOrig(java.lang.Integer dmRaizCnpjOrig) {
        this.dmRaizCnpjOrig = dmRaizCnpjOrig;
    }


    /**
     * Gets the dtRef value for this ChaveLogica.
     * 
     * @return dtRef
     */
    public java.util.Date getDtRef() {
        return dtRef;
    }


    /**
     * Sets the dtRef value for this ChaveLogica.
     * 
     * @param dtRef
     */
    public void setDtRef(java.util.Date dtRef) {
        this.dtRef = dtRef;
    }


    /**
     * Gets the dmStProc value for this ChaveLogica.
     * 
     * @return dmStProc
     */
    public java.math.BigInteger getDmStProc() {
        return dmStProc;
    }


    /**
     * Sets the dmStProc value for this ChaveLogica.
     * 
     * @param dmStProc
     */
    public void setDmStProc(java.math.BigInteger dmStProc) {
        this.dmStProc = dmStProc;
    }


    /**
     * Gets the cdTipoCredPc value for this ChaveLogica.
     * 
     * @return cdTipoCredPc
     */
    public java.lang.String getCdTipoCredPc() {
        return cdTipoCredPc;
    }


    /**
     * Sets the cdTipoCredPc value for this ChaveLogica.
     * 
     * @param cdTipoCredPc
     */
    public void setCdTipoCredPc(java.lang.String cdTipoCredPc) {
        this.cdTipoCredPc = cdTipoCredPc;
    }


    /**
     * Gets the dtEvento value for this ChaveLogica.
     * 
     * @return dtEvento
     */
    public java.util.Date getDtEvento() {
        return dtEvento;
    }


    /**
     * Sets the dtEvento value for this ChaveLogica.
     * 
     * @param dtEvento
     */
    public void setDtEvento(java.util.Date dtEvento) {
        this.dtEvento = dtEvento;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChaveLogica)) return false;
        ChaveLogica other = (ChaveLogica) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codigoHistoricoPadrao==null && other.getCodigoHistoricoPadrao()==null) || 
             (this.codigoHistoricoPadrao!=null &&
              this.codigoHistoricoPadrao.equals(other.getCodigoHistoricoPadrao()))) &&
            ((this.dataInicioValidade==null && other.getDataInicioValidade()==null) || 
             (this.dataInicioValidade!=null &&
              this.dataInicioValidade.equals(other.getDataInicioValidade()))) &&
            ((this.dataFinalValidade==null && other.getDataFinalValidade()==null) || 
             (this.dataFinalValidade!=null &&
              this.dataFinalValidade.equals(other.getDataFinalValidade()))) &&
            ((this.codigoCfopOrigem==null && other.getCodigoCfopOrigem()==null) || 
             (this.codigoCfopOrigem!=null &&
              this.codigoCfopOrigem.equals(other.getCodigoCfopOrigem()))) &&
            ((this.siglaUFDestinatario==null && other.getSiglaUFDestinatario()==null) || 
             (this.siglaUFDestinatario!=null &&
              this.siglaUFDestinatario.equals(other.getSiglaUFDestinatario()))) &&
            ((this.codigoInformacao==null && other.getCodigoInformacao()==null) || 
             (this.codigoInformacao!=null &&
              this.codigoInformacao.equals(other.getCodigoInformacao()))) &&
            ((this.cpfCnpj==null && other.getCpfCnpj()==null) || 
             (this.cpfCnpj!=null &&
              this.cpfCnpj.equals(other.getCpfCnpj()))) &&
            ((this.codigoCentroCusto==null && other.getCodigoCentroCusto()==null) || 
             (this.codigoCentroCusto!=null &&
              this.codigoCentroCusto.equals(other.getCodigoCentroCusto()))) &&
            ((this.codigoPlanoConta==null && other.getCodigoPlanoConta()==null) || 
             (this.codigoPlanoConta!=null &&
              this.codigoPlanoConta.equals(other.getCodigoPlanoConta()))) &&
            ((this.descricao==null && other.getDescricao()==null) || 
             (this.descricao!=null &&
              this.descricao.equals(other.getDescricao()))) &&
            ((this.codParticipante==null && other.getCodParticipante()==null) || 
             (this.codParticipante!=null &&
              this.codParticipante.equals(other.getCodParticipante()))) &&
            ((this.cpfCnpjEmit==null && other.getCpfCnpjEmit()==null) || 
             (this.cpfCnpjEmit!=null &&
              this.cpfCnpjEmit.equals(other.getCpfCnpjEmit()))) &&
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
            ((this.codMod==null && other.getCodMod()==null) || 
             (this.codMod!=null &&
              this.codMod.equals(other.getCodMod()))) &&
            ((this.serie==null && other.getSerie()==null) || 
             (this.serie!=null &&
              this.serie.equals(other.getSerie()))) &&
            ((this.codigoItem==null && other.getCodigoItem()==null) || 
             (this.codigoItem!=null &&
              this.codigoItem.equals(other.getCodigoItem()))) &&
            ((this.siglaUnid==null && other.getSiglaUnid()==null) || 
             (this.siglaUnid!=null &&
              this.siglaUnid.equals(other.getSiglaUnid()))) &&
            ((this.codigoNaturezaOperacao==null && other.getCodigoNaturezaOperacao()==null) || 
             (this.codigoNaturezaOperacao!=null &&
              this.codigoNaturezaOperacao.equals(other.getCodigoNaturezaOperacao()))) &&
            ((this.codCta==null && other.getCodCta()==null) || 
             (this.codCta!=null &&
              this.codCta.equals(other.getCodCta()))) &&
            ((this.codIndBem==null && other.getCodIndBem()==null) || 
             (this.codIndBem!=null &&
              this.codIndBem.equals(other.getCodIndBem()))) &&
            ((this.codGrupoPat==null && other.getCodGrupoPat()==null) || 
             (this.codGrupoPat!=null &&
              this.codGrupoPat.equals(other.getCodGrupoPat()))) &&
            ((this.codStIcmsSt==null && other.getCodStIcmsSt()==null) || 
             (this.codStIcmsSt!=null &&
              this.codStIcmsSt.equals(other.getCodStIcmsSt()))) &&
            ((this.codigoObservacao==null && other.getCodigoObservacao()==null) || 
             (this.codigoObservacao!=null &&
              this.codigoObservacao.equals(other.getCodigoObservacao()))) &&
            ((this.dtInventario==null && other.getDtInventario()==null) || 
             (this.dtInventario!=null &&
              this.dtInventario.equals(other.getDtInventario()))) &&
            ((this.codCCusto==null && other.getCodCCusto()==null) || 
             (this.codCCusto!=null &&
              this.codCCusto.equals(other.getCodCCusto()))) &&
            ((this.subSerie==null && other.getSubSerie()==null) || 
             (this.subSerie!=null &&
              this.subSerie.equals(other.getSubSerie()))) &&
            ((this.numCt==null && other.getNumCt()==null) || 
             (this.numCt!=null &&
              this.numCt.equals(other.getNumCt()))) &&
            ((this.nroNf==null && other.getNroNf()==null) || 
             (this.nroNf!=null &&
              this.nroNf.equals(other.getNroNf()))) &&
            ((this.dtIni==null && other.getDtIni()==null) || 
             (this.dtIni!=null &&
              this.dtIni.equals(other.getDtIni()))) &&
            ((this.dtFin==null && other.getDtFin()==null) || 
             (this.dtFin!=null &&
              this.dtFin.equals(other.getDtFin()))) &&
            ((this.numLcto==null && other.getNumLcto()==null) || 
             (this.numLcto!=null &&
              this.numLcto.equals(other.getNumLcto()))) &&
            ((this.anoRef==null && other.getAnoRef()==null) || 
             (this.anoRef!=null &&
              this.anoRef.equals(other.getAnoRef()))) &&
            ((this.codRetImp==null && other.getCodRetImp()==null) || 
             (this.codRetImp!=null &&
              this.codRetImp.equals(other.getCodRetImp()))) &&
            ((this.dmOrigem==null && other.getDmOrigem()==null) || 
             (this.dmOrigem!=null &&
              this.dmOrigem.equals(other.getDmOrigem()))) &&
            ((this.dtVcto==null && other.getDtVcto()==null) || 
             (this.dtVcto!=null &&
              this.dtVcto.equals(other.getDtVcto()))) &&
            ((this.dtPgto==null && other.getDtPgto()==null) || 
             (this.dtPgto!=null &&
              this.dtPgto.equals(other.getDtPgto()))) &&
            ((this.nroDoc==null && other.getNroDoc()==null) || 
             (this.nroDoc!=null &&
              this.nroDoc.equals(other.getNroDoc()))) &&
            ((this.dtRet==null && other.getDtRet()==null) || 
             (this.dtRet!=null &&
              this.dtRet.equals(other.getDtRet()))) &&
            ((this.identRec==null && other.getIdentRec()==null) || 
             (this.identRec!=null &&
              this.identRec.equals(other.getIdentRec()))) &&
            ((this.dtDoc==null && other.getDtDoc()==null) || 
             (this.dtDoc!=null &&
              this.dtDoc.equals(other.getDtDoc()))) &&
            ((this.dtProd==null && other.getDtProd()==null) || 
             (this.dtProd!=null &&
              this.dtProd.equals(other.getDtProd()))) &&
            ((this.dmCodProd==null && other.getDmCodProd()==null) || 
             (this.dmCodProd!=null &&
              this.dmCodProd.equals(other.getDmCodProd()))) &&
            ((this.login==null && other.getLogin()==null) || 
             (this.login!=null &&
              this.login.equals(other.getLogin()))) &&
            ((this.ano==null && other.getAno()==null) || 
             (this.ano!=null &&
              this.ano.equals(other.getAno()))) &&
            ((this.mes==null && other.getMes()==null) || 
             (this.mes!=null &&
              this.mes.equals(other.getMes()))) &&
            ((this.codAjApur==null && other.getCodAjApur()==null) || 
             (this.codAjApur!=null &&
              this.codAjApur.equals(other.getCodAjApur()))) &&
            ((this.idIntegr==null && other.getIdIntegr()==null) || 
             (this.idIntegr!=null &&
              this.idIntegr.equals(other.getIdIntegr()))) &&
            ((this.codRegTrab==null && other.getCodRegTrab()==null) || 
             (this.codRegTrab!=null &&
              this.codRegTrab.equals(other.getCodRegTrab()))) &&
            ((this.codLtc==null && other.getCodLtc()==null) || 
             (this.codLtc!=null &&
              this.codLtc.equals(other.getCodLtc()))) &&
            ((this.nroIni==null && other.getNroIni()==null) || 
             (this.nroIni!=null &&
              this.nroIni.equals(other.getNroIni()))) &&
            ((this.nroFim==null && other.getNroFim()==null) || 
             (this.nroFim!=null &&
              this.nroFim.equals(other.getNroFim()))) &&
            ((this.dmIndFl==null && other.getDmIndFl()==null) || 
             (this.dmIndFl!=null &&
              this.dmIndFl.equals(other.getDmIndFl()))) &&
            ((this.dtComp==null && other.getDtComp()==null) || 
             (this.dtComp!=null &&
              this.dtComp.equals(other.getDtComp()))) &&
            ((this.codRubrica==null && other.getCodRubrica()==null) || 
             (this.codRubrica!=null &&
              this.codRubrica.equals(other.getCodRubrica()))) &&
            ((this.dtCont==null && other.getDtCont()==null) || 
             (this.dtCont!=null &&
              this.dtCont.equals(other.getDtCont()))) &&
            ((this.nroOp==null && other.getNroOp()==null) || 
             (this.nroOp!=null &&
              this.nroOp.equals(other.getNroOp()))) &&
            ((this.situacao==null && other.getSituacao()==null) || 
             (this.situacao!=null &&
              this.situacao.equals(other.getSituacao()))) &&
            ((this.descrSituacao==null && other.getDescrSituacao()==null) || 
             (this.descrSituacao!=null &&
              this.descrSituacao.equals(other.getDescrSituacao()))) &&
            ((this.dmMesRef==null && other.getDmMesRef()==null) || 
             (this.dmMesRef!=null &&
              this.dmMesRef.equals(other.getDmMesRef()))) &&
            ((this.dmIndAtiv==null && other.getDmIndAtiv()==null) || 
             (this.dmIndAtiv!=null &&
              this.dmIndAtiv.equals(other.getDmIndAtiv()))) &&
            ((this.cstPis==null && other.getCstPis()==null) || 
             (this.cstPis!=null &&
              this.cstPis.equals(other.getCstPis()))) &&
            ((this.aliqPis==null && other.getAliqPis()==null) || 
             (this.aliqPis!=null &&
              this.aliqPis.equals(other.getAliqPis()))) &&
            ((this.cstCofins==null && other.getCstCofins()==null) || 
             (this.cstCofins!=null &&
              this.cstCofins.equals(other.getCstCofins()))) &&
            ((this.aliqCofins==null && other.getAliqCofins()==null) || 
             (this.aliqCofins!=null &&
              this.aliqCofins.equals(other.getAliqCofins()))) &&
            ((this.infoCompl==null && other.getInfoCompl()==null) || 
             (this.infoCompl!=null &&
              this.infoCompl.equals(other.getInfoCompl()))) &&
            ((this.seqLocacao==null && other.getSeqLocacao()==null) || 
             (this.seqLocacao!=null &&
              this.seqLocacao.equals(other.getSeqLocacao()))) &&
            ((this.numContrato==null && other.getNumContrato()==null) || 
             (this.numContrato!=null &&
              this.numContrato.equals(other.getNumContrato()))) &&
            ((this.codPartLocador==null && other.getCodPartLocador()==null) || 
             (this.codPartLocador!=null &&
              this.codPartLocador.equals(other.getCodPartLocador()))) &&
            ((this.codPartLocatario==null && other.getCodPartLocatario()==null) || 
             (this.codPartLocatario!=null &&
              this.codPartLocatario.equals(other.getCodPartLocatario()))) &&
            ((this.codPartComprador==null && other.getCodPartComprador()==null) || 
             (this.codPartComprador!=null &&
              this.codPartComprador.equals(other.getCodPartComprador()))) &&
            ((this.codPartVendedor==null && other.getCodPartVendedor()==null) || 
             (this.codPartVendedor!=null &&
              this.codPartVendedor.equals(other.getCodPartVendedor()))) &&
            ((this.codAgl==null && other.getCodAgl()==null) || 
             (this.codAgl!=null &&
              this.codAgl.equals(other.getCodAgl()))) &&
            ((this.dmIndDoc==null && other.getDmIndDoc()==null) || 
             (this.dmIndDoc!=null &&
              this.dmIndDoc.equals(other.getDmIndDoc()))) &&
            ((this.nroDe==null && other.getNroDe()==null) || 
             (this.nroDe!=null &&
              this.nroDe.equals(other.getNroDe()))) &&
            ((this.dtDe==null && other.getDtDe()==null) || 
             (this.dtDe!=null &&
              this.dtDe.equals(other.getDtDe()))) &&
            ((this.baseCalcCredPc==null && other.getBaseCalcCredPc()==null) || 
             (this.baseCalcCredPc!=null &&
              this.baseCalcCredPc.equals(other.getBaseCalcCredPc()))) &&
            ((this.mesRef==null && other.getMesRef()==null) || 
             (this.mesRef!=null &&
              this.mesRef.equals(other.getMesRef()))) &&
            ((this.dmTipoOper==null && other.getDmTipoOper()==null) || 
             (this.dmTipoOper!=null &&
              this.dmTipoOper.equals(other.getDmTipoOper()))) &&
            ((this.link==null && other.getLink()==null) || 
             (this.link!=null &&
              this.link.equals(other.getLink()))) &&
            ((this.codVerifNfs==null && other.getCodVerifNfs()==null) || 
             (this.codVerifNfs!=null &&
              this.codVerifNfs.equals(other.getCodVerifNfs()))) &&
            ((this.nroAutNfs==null && other.getNroAutNfs()==null) || 
             (this.nroAutNfs!=null &&
              this.nroAutNfs.equals(other.getNroAutNfs()))) &&
            ((this.dtAutNfs==null && other.getDtAutNfs()==null) || 
             (this.dtAutNfs!=null &&
              this.dtAutNfs.equals(other.getDtAutNfs()))) &&
            ((this.codNcmOrig==null && other.getCodNcmOrig()==null) || 
             (this.codNcmOrig!=null &&
              this.codNcmOrig.equals(other.getCodNcmOrig()))) &&
            ((this.cnpjOrig==null && other.getCnpjOrig()==null) || 
             (this.cnpjOrig!=null &&
              this.cnpjOrig.equals(other.getCnpjOrig()))) &&
            ((this.codItemOrig==null && other.getCodItemOrig()==null) || 
             (this.codItemOrig!=null &&
              this.codItemOrig.equals(other.getCodItemOrig()))) &&
            ((this.codItemDest==null && other.getCodItemDest()==null) || 
             (this.codItemDest!=null &&
              this.codItemDest.equals(other.getCodItemDest()))) &&
            ((this.codCfopOrig==null && other.getCodCfopOrig()==null) || 
             (this.codCfopOrig!=null &&
              this.codCfopOrig.equals(other.getCodCfopOrig()))) &&
            ((this.codStIpiOrig==null && other.getCodStIpiOrig()==null) || 
             (this.codStIpiOrig!=null &&
              this.codStIpiOrig.equals(other.getCodStIpiOrig()))) &&
            ((this.codStIcmsOrig==null && other.getCodStIcmsOrig()==null) || 
             (this.codStIcmsOrig!=null &&
              this.codStIcmsOrig.equals(other.getCodStIcmsOrig()))) &&
            ((this.dmRaizCnpjOrig==null && other.getDmRaizCnpjOrig()==null) || 
             (this.dmRaizCnpjOrig!=null &&
              this.dmRaizCnpjOrig.equals(other.getDmRaizCnpjOrig()))) &&
            ((this.dtRef==null && other.getDtRef()==null) || 
             (this.dtRef!=null &&
              this.dtRef.equals(other.getDtRef()))) &&
            ((this.dmStProc==null && other.getDmStProc()==null) || 
             (this.dmStProc!=null &&
              this.dmStProc.equals(other.getDmStProc()))) &&
            ((this.cdTipoCredPc==null && other.getCdTipoCredPc()==null) || 
             (this.cdTipoCredPc!=null &&
              this.cdTipoCredPc.equals(other.getCdTipoCredPc()))) &&
            ((this.dtEvento==null && other.getDtEvento()==null) || 
             (this.dtEvento!=null &&
              this.dtEvento.equals(other.getDtEvento())));
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
        if (getCodigoHistoricoPadrao() != null) {
            _hashCode += getCodigoHistoricoPadrao().hashCode();
        }
        if (getDataInicioValidade() != null) {
            _hashCode += getDataInicioValidade().hashCode();
        }
        if (getDataFinalValidade() != null) {
            _hashCode += getDataFinalValidade().hashCode();
        }
        if (getCodigoCfopOrigem() != null) {
            _hashCode += getCodigoCfopOrigem().hashCode();
        }
        if (getSiglaUFDestinatario() != null) {
            _hashCode += getSiglaUFDestinatario().hashCode();
        }
        if (getCodigoInformacao() != null) {
            _hashCode += getCodigoInformacao().hashCode();
        }
        if (getCpfCnpj() != null) {
            _hashCode += getCpfCnpj().hashCode();
        }
        if (getCodigoCentroCusto() != null) {
            _hashCode += getCodigoCentroCusto().hashCode();
        }
        if (getCodigoPlanoConta() != null) {
            _hashCode += getCodigoPlanoConta().hashCode();
        }
        if (getDescricao() != null) {
            _hashCode += getDescricao().hashCode();
        }
        if (getCodParticipante() != null) {
            _hashCode += getCodParticipante().hashCode();
        }
        if (getCpfCnpjEmit() != null) {
            _hashCode += getCpfCnpjEmit().hashCode();
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
        if (getCodMod() != null) {
            _hashCode += getCodMod().hashCode();
        }
        if (getSerie() != null) {
            _hashCode += getSerie().hashCode();
        }
        if (getCodigoItem() != null) {
            _hashCode += getCodigoItem().hashCode();
        }
        if (getSiglaUnid() != null) {
            _hashCode += getSiglaUnid().hashCode();
        }
        if (getCodigoNaturezaOperacao() != null) {
            _hashCode += getCodigoNaturezaOperacao().hashCode();
        }
        if (getCodCta() != null) {
            _hashCode += getCodCta().hashCode();
        }
        if (getCodIndBem() != null) {
            _hashCode += getCodIndBem().hashCode();
        }
        if (getCodGrupoPat() != null) {
            _hashCode += getCodGrupoPat().hashCode();
        }
        if (getCodStIcmsSt() != null) {
            _hashCode += getCodStIcmsSt().hashCode();
        }
        if (getCodigoObservacao() != null) {
            _hashCode += getCodigoObservacao().hashCode();
        }
        if (getDtInventario() != null) {
            _hashCode += getDtInventario().hashCode();
        }
        if (getCodCCusto() != null) {
            _hashCode += getCodCCusto().hashCode();
        }
        if (getSubSerie() != null) {
            _hashCode += getSubSerie().hashCode();
        }
        if (getNumCt() != null) {
            _hashCode += getNumCt().hashCode();
        }
        if (getNroNf() != null) {
            _hashCode += getNroNf().hashCode();
        }
        if (getDtIni() != null) {
            _hashCode += getDtIni().hashCode();
        }
        if (getDtFin() != null) {
            _hashCode += getDtFin().hashCode();
        }
        if (getNumLcto() != null) {
            _hashCode += getNumLcto().hashCode();
        }
        if (getAnoRef() != null) {
            _hashCode += getAnoRef().hashCode();
        }
        if (getCodRetImp() != null) {
            _hashCode += getCodRetImp().hashCode();
        }
        if (getDmOrigem() != null) {
            _hashCode += getDmOrigem().hashCode();
        }
        if (getDtVcto() != null) {
            _hashCode += getDtVcto().hashCode();
        }
        if (getDtPgto() != null) {
            _hashCode += getDtPgto().hashCode();
        }
        if (getNroDoc() != null) {
            _hashCode += getNroDoc().hashCode();
        }
        if (getDtRet() != null) {
            _hashCode += getDtRet().hashCode();
        }
        if (getIdentRec() != null) {
            _hashCode += getIdentRec().hashCode();
        }
        if (getDtDoc() != null) {
            _hashCode += getDtDoc().hashCode();
        }
        if (getDtProd() != null) {
            _hashCode += getDtProd().hashCode();
        }
        if (getDmCodProd() != null) {
            _hashCode += getDmCodProd().hashCode();
        }
        if (getLogin() != null) {
            _hashCode += getLogin().hashCode();
        }
        if (getAno() != null) {
            _hashCode += getAno().hashCode();
        }
        if (getMes() != null) {
            _hashCode += getMes().hashCode();
        }
        if (getCodAjApur() != null) {
            _hashCode += getCodAjApur().hashCode();
        }
        if (getIdIntegr() != null) {
            _hashCode += getIdIntegr().hashCode();
        }
        if (getCodRegTrab() != null) {
            _hashCode += getCodRegTrab().hashCode();
        }
        if (getCodLtc() != null) {
            _hashCode += getCodLtc().hashCode();
        }
        if (getNroIni() != null) {
            _hashCode += getNroIni().hashCode();
        }
        if (getNroFim() != null) {
            _hashCode += getNroFim().hashCode();
        }
        if (getDmIndFl() != null) {
            _hashCode += getDmIndFl().hashCode();
        }
        if (getDtComp() != null) {
            _hashCode += getDtComp().hashCode();
        }
        if (getCodRubrica() != null) {
            _hashCode += getCodRubrica().hashCode();
        }
        if (getDtCont() != null) {
            _hashCode += getDtCont().hashCode();
        }
        if (getNroOp() != null) {
            _hashCode += getNroOp().hashCode();
        }
        if (getSituacao() != null) {
            _hashCode += getSituacao().hashCode();
        }
        if (getDescrSituacao() != null) {
            _hashCode += getDescrSituacao().hashCode();
        }
        if (getDmMesRef() != null) {
            _hashCode += getDmMesRef().hashCode();
        }
        if (getDmIndAtiv() != null) {
            _hashCode += getDmIndAtiv().hashCode();
        }
        if (getCstPis() != null) {
            _hashCode += getCstPis().hashCode();
        }
        if (getAliqPis() != null) {
            _hashCode += getAliqPis().hashCode();
        }
        if (getCstCofins() != null) {
            _hashCode += getCstCofins().hashCode();
        }
        if (getAliqCofins() != null) {
            _hashCode += getAliqCofins().hashCode();
        }
        if (getInfoCompl() != null) {
            _hashCode += getInfoCompl().hashCode();
        }
        if (getSeqLocacao() != null) {
            _hashCode += getSeqLocacao().hashCode();
        }
        if (getNumContrato() != null) {
            _hashCode += getNumContrato().hashCode();
        }
        if (getCodPartLocador() != null) {
            _hashCode += getCodPartLocador().hashCode();
        }
        if (getCodPartLocatario() != null) {
            _hashCode += getCodPartLocatario().hashCode();
        }
        if (getCodPartComprador() != null) {
            _hashCode += getCodPartComprador().hashCode();
        }
        if (getCodPartVendedor() != null) {
            _hashCode += getCodPartVendedor().hashCode();
        }
        if (getCodAgl() != null) {
            _hashCode += getCodAgl().hashCode();
        }
        if (getDmIndDoc() != null) {
            _hashCode += getDmIndDoc().hashCode();
        }
        if (getNroDe() != null) {
            _hashCode += getNroDe().hashCode();
        }
        if (getDtDe() != null) {
            _hashCode += getDtDe().hashCode();
        }
        if (getBaseCalcCredPc() != null) {
            _hashCode += getBaseCalcCredPc().hashCode();
        }
        if (getMesRef() != null) {
            _hashCode += getMesRef().hashCode();
        }
        if (getDmTipoOper() != null) {
            _hashCode += getDmTipoOper().hashCode();
        }
        if (getLink() != null) {
            _hashCode += getLink().hashCode();
        }
        if (getCodVerifNfs() != null) {
            _hashCode += getCodVerifNfs().hashCode();
        }
        if (getNroAutNfs() != null) {
            _hashCode += getNroAutNfs().hashCode();
        }
        if (getDtAutNfs() != null) {
            _hashCode += getDtAutNfs().hashCode();
        }
        if (getCodNcmOrig() != null) {
            _hashCode += getCodNcmOrig().hashCode();
        }
        if (getCnpjOrig() != null) {
            _hashCode += getCnpjOrig().hashCode();
        }
        if (getCodItemOrig() != null) {
            _hashCode += getCodItemOrig().hashCode();
        }
        if (getCodItemDest() != null) {
            _hashCode += getCodItemDest().hashCode();
        }
        if (getCodCfopOrig() != null) {
            _hashCode += getCodCfopOrig().hashCode();
        }
        if (getCodStIpiOrig() != null) {
            _hashCode += getCodStIpiOrig().hashCode();
        }
        if (getCodStIcmsOrig() != null) {
            _hashCode += getCodStIcmsOrig().hashCode();
        }
        if (getDmRaizCnpjOrig() != null) {
            _hashCode += getDmRaizCnpjOrig().hashCode();
        }
        if (getDtRef() != null) {
            _hashCode += getDtRef().hashCode();
        }
        if (getDmStProc() != null) {
            _hashCode += getDmStProc().hashCode();
        }
        if (getCdTipoCredPc() != null) {
            _hashCode += getCdTipoCredPc().hashCode();
        }
        if (getDtEvento() != null) {
            _hashCode += getDtEvento().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChaveLogica.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "chaveLogica"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoHistoricoPadrao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "codigoHistoricoPadrao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataInicioValidade");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "dataInicioValidade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataFinalValidade");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "dataFinalValidade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoCfopOrigem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "codigoCfopOrigem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("siglaUFDestinatario");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "siglaUFDestinatario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoInformacao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "codigoInformacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpfCnpj");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "cpfCnpj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "tpCpfCnpj"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoCentroCusto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "codigoCentroCusto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoPlanoConta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "codigoPlanoConta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "tpStringSize255"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descricao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "descricao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codParticipante");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "codParticipante"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpfCnpjEmit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "cpfCnpjEmit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dmIndEmit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "dmIndEmit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dmIndOper");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "dmIndOper"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codPart");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "codPart"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoModeloFiscal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "CodigoModeloFiscal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codMod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "codMod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serie");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "serie"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoItem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "codigoItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("siglaUnid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "siglaUnid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoNaturezaOperacao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "codigoNaturezaOperacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codCta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "codCta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "tpStringSize255"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codIndBem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "codIndBem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codGrupoPat");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "codGrupoPat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codStIcmsSt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "codStIcmsSt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoObservacao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "codigoObservacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dtInventario");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "dtInventario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codCCusto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "codCCusto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subSerie");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "subSerie"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numCt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "numCt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nroNf");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "nroNf"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dtIni");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "dtIni"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dtFin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "dtFin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numLcto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "numLcto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("anoRef");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "anoRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codRetImp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "codRetImp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dmOrigem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "dmOrigem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dtVcto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "dtVcto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dtPgto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "dtPgto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nroDoc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "nroDoc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dtRet");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "dtRet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identRec");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "identRec"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dtDoc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "dtDoc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dtProd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "dtProd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dmCodProd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "dmCodProd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("login");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "login"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ano");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "ano"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "mes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codAjApur");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "codAjApur"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idIntegr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "idIntegr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codRegTrab");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "codRegTrab"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codLtc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "codLtc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nroIni");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "nroIni"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nroFim");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "nroFim"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dmIndFl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "dmIndFl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dtComp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "dtComp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codRubrica");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "codRubrica"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dtCont");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "dtCont"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nroOp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "nroOp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("situacao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "situacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descrSituacao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "descrSituacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dmMesRef");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "dmMesRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dmIndAtiv");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "dmIndAtiv"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cstPis");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "cstPis"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aliqPis");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "aliqPis"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cstCofins");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "cstCofins"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aliqCofins");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "aliqCofins"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("infoCompl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "infoCompl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqLocacao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "seqLocacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numContrato");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "numContrato"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codPartLocador");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "codPartLocador"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codPartLocatario");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "codPartLocatario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codPartComprador");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "codPartComprador"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codPartVendedor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "codPartVendedor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codAgl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "codAgl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dmIndDoc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "dmIndDoc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nroDe");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "nroDe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dtDe");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "dtDe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("baseCalcCredPc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "baseCalcCredPc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mesRef");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "mesRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dmTipoOper");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "dmTipoOper"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("link");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "link"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codVerifNfs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "codVerifNfs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nroAutNfs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "nroAutNfs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dtAutNfs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "dtAutNfs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codNcmOrig");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "codNcmOrig"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cnpjOrig");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "cnpjOrig"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codItemOrig");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "codItemOrig"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codItemDest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "codItemDest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codCfopOrig");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "codCfopOrig"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codStIpiOrig");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "codStIpiOrig"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codStIcmsOrig");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "codStIcmsOrig"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dmRaizCnpjOrig");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "dmRaizCnpjOrig"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dtRef");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "dtRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dmStProc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "dmStProc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cdTipoCredPc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "cdTipoCredPc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dtEvento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "dtEvento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
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
