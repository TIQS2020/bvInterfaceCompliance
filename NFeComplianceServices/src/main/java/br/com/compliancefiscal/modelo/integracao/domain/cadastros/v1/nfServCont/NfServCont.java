/**
 * NfServCont.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServCont;

public class NfServCont  implements java.io.Serializable {
    private br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.TpCpfCnpj cpfCnpj;

    private org.apache.axis.types.NonNegativeInteger dmIndEmit;

    private org.apache.axis.types.NonNegativeInteger dmIndOper;

    private java.lang.String codPart;

    private java.lang.String codigoModeloFiscal;

    private java.lang.String serie;

    private org.apache.axis.types.NonNegativeInteger subSerie;

    private org.apache.axis.types.NonNegativeInteger nroNf;

    private java.math.BigInteger dmStProc;

    private org.apache.axis.types.NonNegativeInteger dmLegado;

    private java.lang.String sitDocto;

    private java.util.Date dtEmiss;

    private java.util.Date dtSaiEnt;

    private java.lang.String codInforCompl;

    private java.lang.String codCta;

    private java.lang.String codigoNaturezaOperacao;

    private java.math.BigInteger dmTpAssinante;

    private br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServCont.TpValores valores;

    private br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServCont.TpRegImpostoIcms[] regImpostoIcms;

    private br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServCont.TpRegImpostoPis[] regImpostoPis;

    private br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServCont.TpRegImpostoCofins[] regImpostoCofins;

    private br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServCont.TpProcRef[] procRef;

    private br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServCont.TpInforFiscal inforFiscalSc;

    public NfServCont() {
    }

    public NfServCont(
           br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.TpCpfCnpj cpfCnpj,
           org.apache.axis.types.NonNegativeInteger dmIndEmit,
           org.apache.axis.types.NonNegativeInteger dmIndOper,
           java.lang.String codPart,
           java.lang.String codigoModeloFiscal,
           java.lang.String serie,
           org.apache.axis.types.NonNegativeInteger subSerie,
           org.apache.axis.types.NonNegativeInteger nroNf,
           java.math.BigInteger dmStProc,
           org.apache.axis.types.NonNegativeInteger dmLegado,
           java.lang.String sitDocto,
           java.util.Date dtEmiss,
           java.util.Date dtSaiEnt,
           java.lang.String codInforCompl,
           java.lang.String codCta,
           java.lang.String codigoNaturezaOperacao,
           java.math.BigInteger dmTpAssinante,
           br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServCont.TpValores valores,
           br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServCont.TpRegImpostoIcms[] regImpostoIcms,
           br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServCont.TpRegImpostoPis[] regImpostoPis,
           br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServCont.TpRegImpostoCofins[] regImpostoCofins,
           br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServCont.TpProcRef[] procRef,
           br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServCont.TpInforFiscal inforFiscalSc) {
           this.cpfCnpj = cpfCnpj;
           this.dmIndEmit = dmIndEmit;
           this.dmIndOper = dmIndOper;
           this.codPart = codPart;
           this.codigoModeloFiscal = codigoModeloFiscal;
           this.serie = serie;
           this.subSerie = subSerie;
           this.nroNf = nroNf;
           this.dmStProc = dmStProc;
           this.dmLegado = dmLegado;
           this.sitDocto = sitDocto;
           this.dtEmiss = dtEmiss;
           this.dtSaiEnt = dtSaiEnt;
           this.codInforCompl = codInforCompl;
           this.codCta = codCta;
           this.codigoNaturezaOperacao = codigoNaturezaOperacao;
           this.dmTpAssinante = dmTpAssinante;
           this.valores = valores;
           this.regImpostoIcms = regImpostoIcms;
           this.regImpostoPis = regImpostoPis;
           this.regImpostoCofins = regImpostoCofins;
           this.procRef = procRef;
           this.inforFiscalSc = inforFiscalSc;
    }


    /**
     * Gets the cpfCnpj value for this NfServCont.
     * 
     * @return cpfCnpj
     */
    public br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.TpCpfCnpj getCpfCnpj() {
        return cpfCnpj;
    }


    /**
     * Sets the cpfCnpj value for this NfServCont.
     * 
     * @param cpfCnpj
     */
    public void setCpfCnpj(br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.TpCpfCnpj cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }


    /**
     * Gets the dmIndEmit value for this NfServCont.
     * 
     * @return dmIndEmit
     */
    public org.apache.axis.types.NonNegativeInteger getDmIndEmit() {
        return dmIndEmit;
    }


    /**
     * Sets the dmIndEmit value for this NfServCont.
     * 
     * @param dmIndEmit
     */
    public void setDmIndEmit(org.apache.axis.types.NonNegativeInteger dmIndEmit) {
        this.dmIndEmit = dmIndEmit;
    }


    /**
     * Gets the dmIndOper value for this NfServCont.
     * 
     * @return dmIndOper
     */
    public org.apache.axis.types.NonNegativeInteger getDmIndOper() {
        return dmIndOper;
    }


    /**
     * Sets the dmIndOper value for this NfServCont.
     * 
     * @param dmIndOper
     */
    public void setDmIndOper(org.apache.axis.types.NonNegativeInteger dmIndOper) {
        this.dmIndOper = dmIndOper;
    }


    /**
     * Gets the codPart value for this NfServCont.
     * 
     * @return codPart
     */
    public java.lang.String getCodPart() {
        return codPart;
    }


    /**
     * Sets the codPart value for this NfServCont.
     * 
     * @param codPart
     */
    public void setCodPart(java.lang.String codPart) {
        this.codPart = codPart;
    }


    /**
     * Gets the codigoModeloFiscal value for this NfServCont.
     * 
     * @return codigoModeloFiscal
     */
    public java.lang.String getCodigoModeloFiscal() {
        return codigoModeloFiscal;
    }


    /**
     * Sets the codigoModeloFiscal value for this NfServCont.
     * 
     * @param codigoModeloFiscal
     */
    public void setCodigoModeloFiscal(java.lang.String codigoModeloFiscal) {
        this.codigoModeloFiscal = codigoModeloFiscal;
    }


    /**
     * Gets the serie value for this NfServCont.
     * 
     * @return serie
     */
    public java.lang.String getSerie() {
        return serie;
    }


    /**
     * Sets the serie value for this NfServCont.
     * 
     * @param serie
     */
    public void setSerie(java.lang.String serie) {
        this.serie = serie;
    }


    /**
     * Gets the subSerie value for this NfServCont.
     * 
     * @return subSerie
     */
    public org.apache.axis.types.NonNegativeInteger getSubSerie() {
        return subSerie;
    }


    /**
     * Sets the subSerie value for this NfServCont.
     * 
     * @param subSerie
     */
    public void setSubSerie(org.apache.axis.types.NonNegativeInteger subSerie) {
        this.subSerie = subSerie;
    }


    /**
     * Gets the nroNf value for this NfServCont.
     * 
     * @return nroNf
     */
    public org.apache.axis.types.NonNegativeInteger getNroNf() {
        return nroNf;
    }


    /**
     * Sets the nroNf value for this NfServCont.
     * 
     * @param nroNf
     */
    public void setNroNf(org.apache.axis.types.NonNegativeInteger nroNf) {
        this.nroNf = nroNf;
    }


    /**
     * Gets the dmStProc value for this NfServCont.
     * 
     * @return dmStProc
     */
    public java.math.BigInteger getDmStProc() {
        return dmStProc;
    }


    /**
     * Sets the dmStProc value for this NfServCont.
     * 
     * @param dmStProc
     */
    public void setDmStProc(java.math.BigInteger dmStProc) {
        this.dmStProc = dmStProc;
    }


    /**
     * Gets the dmLegado value for this NfServCont.
     * 
     * @return dmLegado
     */
    public org.apache.axis.types.NonNegativeInteger getDmLegado() {
        return dmLegado;
    }


    /**
     * Sets the dmLegado value for this NfServCont.
     * 
     * @param dmLegado
     */
    public void setDmLegado(org.apache.axis.types.NonNegativeInteger dmLegado) {
        this.dmLegado = dmLegado;
    }


    /**
     * Gets the sitDocto value for this NfServCont.
     * 
     * @return sitDocto
     */
    public java.lang.String getSitDocto() {
        return sitDocto;
    }


    /**
     * Sets the sitDocto value for this NfServCont.
     * 
     * @param sitDocto
     */
    public void setSitDocto(java.lang.String sitDocto) {
        this.sitDocto = sitDocto;
    }


    /**
     * Gets the dtEmiss value for this NfServCont.
     * 
     * @return dtEmiss
     */
    public java.util.Date getDtEmiss() {
        return dtEmiss;
    }


    /**
     * Sets the dtEmiss value for this NfServCont.
     * 
     * @param dtEmiss
     */
    public void setDtEmiss(java.util.Date dtEmiss) {
        this.dtEmiss = dtEmiss;
    }


    /**
     * Gets the dtSaiEnt value for this NfServCont.
     * 
     * @return dtSaiEnt
     */
    public java.util.Date getDtSaiEnt() {
        return dtSaiEnt;
    }


    /**
     * Sets the dtSaiEnt value for this NfServCont.
     * 
     * @param dtSaiEnt
     */
    public void setDtSaiEnt(java.util.Date dtSaiEnt) {
        this.dtSaiEnt = dtSaiEnt;
    }


    /**
     * Gets the codInforCompl value for this NfServCont.
     * 
     * @return codInforCompl
     */
    public java.lang.String getCodInforCompl() {
        return codInforCompl;
    }


    /**
     * Sets the codInforCompl value for this NfServCont.
     * 
     * @param codInforCompl
     */
    public void setCodInforCompl(java.lang.String codInforCompl) {
        this.codInforCompl = codInforCompl;
    }


    /**
     * Gets the codCta value for this NfServCont.
     * 
     * @return codCta
     */
    public java.lang.String getCodCta() {
        return codCta;
    }


    /**
     * Sets the codCta value for this NfServCont.
     * 
     * @param codCta
     */
    public void setCodCta(java.lang.String codCta) {
        this.codCta = codCta;
    }


    /**
     * Gets the codigoNaturezaOperacao value for this NfServCont.
     * 
     * @return codigoNaturezaOperacao
     */
    public java.lang.String getCodigoNaturezaOperacao() {
        return codigoNaturezaOperacao;
    }


    /**
     * Sets the codigoNaturezaOperacao value for this NfServCont.
     * 
     * @param codigoNaturezaOperacao
     */
    public void setCodigoNaturezaOperacao(java.lang.String codigoNaturezaOperacao) {
        this.codigoNaturezaOperacao = codigoNaturezaOperacao;
    }


    /**
     * Gets the dmTpAssinante value for this NfServCont.
     * 
     * @return dmTpAssinante
     */
    public java.math.BigInteger getDmTpAssinante() {
        return dmTpAssinante;
    }


    /**
     * Sets the dmTpAssinante value for this NfServCont.
     * 
     * @param dmTpAssinante
     */
    public void setDmTpAssinante(java.math.BigInteger dmTpAssinante) {
        this.dmTpAssinante = dmTpAssinante;
    }


    /**
     * Gets the valores value for this NfServCont.
     * 
     * @return valores
     */
    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServCont.TpValores getValores() {
        return valores;
    }


    /**
     * Sets the valores value for this NfServCont.
     * 
     * @param valores
     */
    public void setValores(br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServCont.TpValores valores) {
        this.valores = valores;
    }


    /**
     * Gets the regImpostoIcms value for this NfServCont.
     * 
     * @return regImpostoIcms
     */
    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServCont.TpRegImpostoIcms[] getRegImpostoIcms() {
        return regImpostoIcms;
    }


    /**
     * Sets the regImpostoIcms value for this NfServCont.
     * 
     * @param regImpostoIcms
     */
    public void setRegImpostoIcms(br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServCont.TpRegImpostoIcms[] regImpostoIcms) {
        this.regImpostoIcms = regImpostoIcms;
    }

    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServCont.TpRegImpostoIcms getRegImpostoIcms(int i) {
        return this.regImpostoIcms[i];
    }

    public void setRegImpostoIcms(int i, br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServCont.TpRegImpostoIcms _value) {
        this.regImpostoIcms[i] = _value;
    }


    /**
     * Gets the regImpostoPis value for this NfServCont.
     * 
     * @return regImpostoPis
     */
    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServCont.TpRegImpostoPis[] getRegImpostoPis() {
        return regImpostoPis;
    }


    /**
     * Sets the regImpostoPis value for this NfServCont.
     * 
     * @param regImpostoPis
     */
    public void setRegImpostoPis(br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServCont.TpRegImpostoPis[] regImpostoPis) {
        this.regImpostoPis = regImpostoPis;
    }

    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServCont.TpRegImpostoPis getRegImpostoPis(int i) {
        return this.regImpostoPis[i];
    }

    public void setRegImpostoPis(int i, br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServCont.TpRegImpostoPis _value) {
        this.regImpostoPis[i] = _value;
    }


    /**
     * Gets the regImpostoCofins value for this NfServCont.
     * 
     * @return regImpostoCofins
     */
    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServCont.TpRegImpostoCofins[] getRegImpostoCofins() {
        return regImpostoCofins;
    }


    /**
     * Sets the regImpostoCofins value for this NfServCont.
     * 
     * @param regImpostoCofins
     */
    public void setRegImpostoCofins(br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServCont.TpRegImpostoCofins[] regImpostoCofins) {
        this.regImpostoCofins = regImpostoCofins;
    }

    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServCont.TpRegImpostoCofins getRegImpostoCofins(int i) {
        return this.regImpostoCofins[i];
    }

    public void setRegImpostoCofins(int i, br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServCont.TpRegImpostoCofins _value) {
        this.regImpostoCofins[i] = _value;
    }


    /**
     * Gets the procRef value for this NfServCont.
     * 
     * @return procRef
     */
    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServCont.TpProcRef[] getProcRef() {
        return procRef;
    }


    /**
     * Sets the procRef value for this NfServCont.
     * 
     * @param procRef
     */
    public void setProcRef(br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServCont.TpProcRef[] procRef) {
        this.procRef = procRef;
    }

    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServCont.TpProcRef getProcRef(int i) {
        return this.procRef[i];
    }

    public void setProcRef(int i, br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServCont.TpProcRef _value) {
        this.procRef[i] = _value;
    }


    /**
     * Gets the inforFiscalSc value for this NfServCont.
     * 
     * @return inforFiscalSc
     */
    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServCont.TpInforFiscal getInforFiscalSc() {
        return inforFiscalSc;
    }


    /**
     * Sets the inforFiscalSc value for this NfServCont.
     * 
     * @param inforFiscalSc
     */
    public void setInforFiscalSc(br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServCont.TpInforFiscal inforFiscalSc) {
        this.inforFiscalSc = inforFiscalSc;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NfServCont)) return false;
        NfServCont other = (NfServCont) obj;
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
            ((this.subSerie==null && other.getSubSerie()==null) || 
             (this.subSerie!=null &&
              this.subSerie.equals(other.getSubSerie()))) &&
            ((this.nroNf==null && other.getNroNf()==null) || 
             (this.nroNf!=null &&
              this.nroNf.equals(other.getNroNf()))) &&
            ((this.dmStProc==null && other.getDmStProc()==null) || 
             (this.dmStProc!=null &&
              this.dmStProc.equals(other.getDmStProc()))) &&
            ((this.dmLegado==null && other.getDmLegado()==null) || 
             (this.dmLegado!=null &&
              this.dmLegado.equals(other.getDmLegado()))) &&
            ((this.sitDocto==null && other.getSitDocto()==null) || 
             (this.sitDocto!=null &&
              this.sitDocto.equals(other.getSitDocto()))) &&
            ((this.dtEmiss==null && other.getDtEmiss()==null) || 
             (this.dtEmiss!=null &&
              this.dtEmiss.equals(other.getDtEmiss()))) &&
            ((this.dtSaiEnt==null && other.getDtSaiEnt()==null) || 
             (this.dtSaiEnt!=null &&
              this.dtSaiEnt.equals(other.getDtSaiEnt()))) &&
            ((this.codInforCompl==null && other.getCodInforCompl()==null) || 
             (this.codInforCompl!=null &&
              this.codInforCompl.equals(other.getCodInforCompl()))) &&
            ((this.codCta==null && other.getCodCta()==null) || 
             (this.codCta!=null &&
              this.codCta.equals(other.getCodCta()))) &&
            ((this.codigoNaturezaOperacao==null && other.getCodigoNaturezaOperacao()==null) || 
             (this.codigoNaturezaOperacao!=null &&
              this.codigoNaturezaOperacao.equals(other.getCodigoNaturezaOperacao()))) &&
            ((this.dmTpAssinante==null && other.getDmTpAssinante()==null) || 
             (this.dmTpAssinante!=null &&
              this.dmTpAssinante.equals(other.getDmTpAssinante()))) &&
            ((this.valores==null && other.getValores()==null) || 
             (this.valores!=null &&
              this.valores.equals(other.getValores()))) &&
            ((this.regImpostoIcms==null && other.getRegImpostoIcms()==null) || 
             (this.regImpostoIcms!=null &&
              java.util.Arrays.equals(this.regImpostoIcms, other.getRegImpostoIcms()))) &&
            ((this.regImpostoPis==null && other.getRegImpostoPis()==null) || 
             (this.regImpostoPis!=null &&
              java.util.Arrays.equals(this.regImpostoPis, other.getRegImpostoPis()))) &&
            ((this.regImpostoCofins==null && other.getRegImpostoCofins()==null) || 
             (this.regImpostoCofins!=null &&
              java.util.Arrays.equals(this.regImpostoCofins, other.getRegImpostoCofins()))) &&
            ((this.procRef==null && other.getProcRef()==null) || 
             (this.procRef!=null &&
              java.util.Arrays.equals(this.procRef, other.getProcRef()))) &&
            ((this.inforFiscalSc==null && other.getInforFiscalSc()==null) || 
             (this.inforFiscalSc!=null &&
              this.inforFiscalSc.equals(other.getInforFiscalSc())));
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
        if (getSubSerie() != null) {
            _hashCode += getSubSerie().hashCode();
        }
        if (getNroNf() != null) {
            _hashCode += getNroNf().hashCode();
        }
        if (getDmStProc() != null) {
            _hashCode += getDmStProc().hashCode();
        }
        if (getDmLegado() != null) {
            _hashCode += getDmLegado().hashCode();
        }
        if (getSitDocto() != null) {
            _hashCode += getSitDocto().hashCode();
        }
        if (getDtEmiss() != null) {
            _hashCode += getDtEmiss().hashCode();
        }
        if (getDtSaiEnt() != null) {
            _hashCode += getDtSaiEnt().hashCode();
        }
        if (getCodInforCompl() != null) {
            _hashCode += getCodInforCompl().hashCode();
        }
        if (getCodCta() != null) {
            _hashCode += getCodCta().hashCode();
        }
        if (getCodigoNaturezaOperacao() != null) {
            _hashCode += getCodigoNaturezaOperacao().hashCode();
        }
        if (getDmTpAssinante() != null) {
            _hashCode += getDmTpAssinante().hashCode();
        }
        if (getValores() != null) {
            _hashCode += getValores().hashCode();
        }
        if (getRegImpostoIcms() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRegImpostoIcms());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRegImpostoIcms(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRegImpostoPis() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRegImpostoPis());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRegImpostoPis(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRegImpostoCofins() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRegImpostoCofins());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRegImpostoCofins(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProcRef() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProcRef());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProcRef(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getInforFiscalSc() != null) {
            _hashCode += getInforFiscalSc().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NfServCont.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServCont", "nfServCont"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpfCnpj");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServCont", "cpfCnpj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "tpCpfCnpj"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dmIndEmit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServCont", "dmIndEmit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "tpDominio"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dmIndOper");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServCont", "dmIndOper"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "tpDominio"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codPart");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServCont", "codPart"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoModeloFiscal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServCont", "CodigoModeloFiscal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "tpStringSizeTwoComplementos"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serie");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServCont", "serie"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subSerie");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServCont", "subSerie"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nroNf");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServCont", "nroNf"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dmStProc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServCont", "dmStProc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dmLegado");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServCont", "dmLegado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "tpDominio"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sitDocto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServCont", "sitDocto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dtEmiss");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServCont", "dtEmiss"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dtSaiEnt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServCont", "dtSaiEnt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codInforCompl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServCont", "codInforCompl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codCta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServCont", "codCta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "tpStringSize255"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoNaturezaOperacao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServCont", "codigoNaturezaOperacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dmTpAssinante");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServCont", "dmTpAssinante"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valores");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServCont", "valores"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServCont", "tpValores"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regImpostoIcms");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServCont", "regImpostoIcms"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServCont", "tpRegImpostoIcms"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regImpostoPis");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServCont", "regImpostoPis"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServCont", "tpRegImpostoPis"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regImpostoCofins");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServCont", "regImpostoCofins"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServCont", "tpRegImpostoCofins"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("procRef");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServCont", "procRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServCont", "tpProcRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inforFiscalSc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServCont", "inforFiscalSc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServCont", "tpInforFiscal"));
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
