/**
 * TpComplServ.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil;

public class TpComplServ  implements java.io.Serializable {
    private java.lang.String codBaseCalcCredPc;

    private org.apache.axis.types.NonNegativeInteger dmIndOrigCred;

    private java.util.Date dtPgtoPis;

    private java.util.Date dtPgtoCofins;

    private org.apache.axis.types.NonNegativeInteger dmLocalExecServ;

    private org.apache.axis.types.NonNegativeInteger dmTribMunPrest;

    private java.lang.String cidadeIbge;

    private java.lang.String codCentroCusto;

    private java.lang.String codTribMunicipio;

    private java.math.BigDecimal vlDescIncondicionado;

    private java.math.BigDecimal vlDescCondicionado;

    private java.math.BigDecimal vlDeducao;

    private java.math.BigDecimal vlOutraRetencao;

    private org.apache.axis.types.NonNegativeInteger dmIndIncentivo;

    private java.lang.String cnae;

    private java.math.BigInteger codSiscomexPais;

    private java.lang.String nroProc;

    public TpComplServ() {
    }

    public TpComplServ(
           java.lang.String codBaseCalcCredPc,
           org.apache.axis.types.NonNegativeInteger dmIndOrigCred,
           java.util.Date dtPgtoPis,
           java.util.Date dtPgtoCofins,
           org.apache.axis.types.NonNegativeInteger dmLocalExecServ,
           org.apache.axis.types.NonNegativeInteger dmTribMunPrest,
           java.lang.String cidadeIbge,
           java.lang.String codCentroCusto,
           java.lang.String codTribMunicipio,
           java.math.BigDecimal vlDescIncondicionado,
           java.math.BigDecimal vlDescCondicionado,
           java.math.BigDecimal vlDeducao,
           java.math.BigDecimal vlOutraRetencao,
           org.apache.axis.types.NonNegativeInteger dmIndIncentivo,
           java.lang.String cnae,
           java.math.BigInteger codSiscomexPais,
           java.lang.String nroProc) {
           this.codBaseCalcCredPc = codBaseCalcCredPc;
           this.dmIndOrigCred = dmIndOrigCred;
           this.dtPgtoPis = dtPgtoPis;
           this.dtPgtoCofins = dtPgtoCofins;
           this.dmLocalExecServ = dmLocalExecServ;
           this.dmTribMunPrest = dmTribMunPrest;
           this.cidadeIbge = cidadeIbge;
           this.codCentroCusto = codCentroCusto;
           this.codTribMunicipio = codTribMunicipio;
           this.vlDescIncondicionado = vlDescIncondicionado;
           this.vlDescCondicionado = vlDescCondicionado;
           this.vlDeducao = vlDeducao;
           this.vlOutraRetencao = vlOutraRetencao;
           this.dmIndIncentivo = dmIndIncentivo;
           this.cnae = cnae;
           this.codSiscomexPais = codSiscomexPais;
           this.nroProc = nroProc;
    }


    /**
     * Gets the codBaseCalcCredPc value for this TpComplServ.
     * 
     * @return codBaseCalcCredPc
     */
    public java.lang.String getCodBaseCalcCredPc() {
        return codBaseCalcCredPc;
    }


    /**
     * Sets the codBaseCalcCredPc value for this TpComplServ.
     * 
     * @param codBaseCalcCredPc
     */
    public void setCodBaseCalcCredPc(java.lang.String codBaseCalcCredPc) {
        this.codBaseCalcCredPc = codBaseCalcCredPc;
    }


    /**
     * Gets the dmIndOrigCred value for this TpComplServ.
     * 
     * @return dmIndOrigCred
     */
    public org.apache.axis.types.NonNegativeInteger getDmIndOrigCred() {
        return dmIndOrigCred;
    }


    /**
     * Sets the dmIndOrigCred value for this TpComplServ.
     * 
     * @param dmIndOrigCred
     */
    public void setDmIndOrigCred(org.apache.axis.types.NonNegativeInteger dmIndOrigCred) {
        this.dmIndOrigCred = dmIndOrigCred;
    }


    /**
     * Gets the dtPgtoPis value for this TpComplServ.
     * 
     * @return dtPgtoPis
     */
    public java.util.Date getDtPgtoPis() {
        return dtPgtoPis;
    }


    /**
     * Sets the dtPgtoPis value for this TpComplServ.
     * 
     * @param dtPgtoPis
     */
    public void setDtPgtoPis(java.util.Date dtPgtoPis) {
        this.dtPgtoPis = dtPgtoPis;
    }


    /**
     * Gets the dtPgtoCofins value for this TpComplServ.
     * 
     * @return dtPgtoCofins
     */
    public java.util.Date getDtPgtoCofins() {
        return dtPgtoCofins;
    }


    /**
     * Sets the dtPgtoCofins value for this TpComplServ.
     * 
     * @param dtPgtoCofins
     */
    public void setDtPgtoCofins(java.util.Date dtPgtoCofins) {
        this.dtPgtoCofins = dtPgtoCofins;
    }


    /**
     * Gets the dmLocalExecServ value for this TpComplServ.
     * 
     * @return dmLocalExecServ
     */
    public org.apache.axis.types.NonNegativeInteger getDmLocalExecServ() {
        return dmLocalExecServ;
    }


    /**
     * Sets the dmLocalExecServ value for this TpComplServ.
     * 
     * @param dmLocalExecServ
     */
    public void setDmLocalExecServ(org.apache.axis.types.NonNegativeInteger dmLocalExecServ) {
        this.dmLocalExecServ = dmLocalExecServ;
    }


    /**
     * Gets the dmTribMunPrest value for this TpComplServ.
     * 
     * @return dmTribMunPrest
     */
    public org.apache.axis.types.NonNegativeInteger getDmTribMunPrest() {
        return dmTribMunPrest;
    }


    /**
     * Sets the dmTribMunPrest value for this TpComplServ.
     * 
     * @param dmTribMunPrest
     */
    public void setDmTribMunPrest(org.apache.axis.types.NonNegativeInteger dmTribMunPrest) {
        this.dmTribMunPrest = dmTribMunPrest;
    }


    /**
     * Gets the cidadeIbge value for this TpComplServ.
     * 
     * @return cidadeIbge
     */
    public java.lang.String getCidadeIbge() {
        return cidadeIbge;
    }


    /**
     * Sets the cidadeIbge value for this TpComplServ.
     * 
     * @param cidadeIbge
     */
    public void setCidadeIbge(java.lang.String cidadeIbge) {
        this.cidadeIbge = cidadeIbge;
    }


    /**
     * Gets the codCentroCusto value for this TpComplServ.
     * 
     * @return codCentroCusto
     */
    public java.lang.String getCodCentroCusto() {
        return codCentroCusto;
    }


    /**
     * Sets the codCentroCusto value for this TpComplServ.
     * 
     * @param codCentroCusto
     */
    public void setCodCentroCusto(java.lang.String codCentroCusto) {
        this.codCentroCusto = codCentroCusto;
    }


    /**
     * Gets the codTribMunicipio value for this TpComplServ.
     * 
     * @return codTribMunicipio
     */
    public java.lang.String getCodTribMunicipio() {
        return codTribMunicipio;
    }


    /**
     * Sets the codTribMunicipio value for this TpComplServ.
     * 
     * @param codTribMunicipio
     */
    public void setCodTribMunicipio(java.lang.String codTribMunicipio) {
        this.codTribMunicipio = codTribMunicipio;
    }


    /**
     * Gets the vlDescIncondicionado value for this TpComplServ.
     * 
     * @return vlDescIncondicionado
     */
    public java.math.BigDecimal getVlDescIncondicionado() {
        return vlDescIncondicionado;
    }


    /**
     * Sets the vlDescIncondicionado value for this TpComplServ.
     * 
     * @param vlDescIncondicionado
     */
    public void setVlDescIncondicionado(java.math.BigDecimal vlDescIncondicionado) {
        this.vlDescIncondicionado = vlDescIncondicionado;
    }


    /**
     * Gets the vlDescCondicionado value for this TpComplServ.
     * 
     * @return vlDescCondicionado
     */
    public java.math.BigDecimal getVlDescCondicionado() {
        return vlDescCondicionado;
    }


    /**
     * Sets the vlDescCondicionado value for this TpComplServ.
     * 
     * @param vlDescCondicionado
     */
    public void setVlDescCondicionado(java.math.BigDecimal vlDescCondicionado) {
        this.vlDescCondicionado = vlDescCondicionado;
    }


    /**
     * Gets the vlDeducao value for this TpComplServ.
     * 
     * @return vlDeducao
     */
    public java.math.BigDecimal getVlDeducao() {
        return vlDeducao;
    }


    /**
     * Sets the vlDeducao value for this TpComplServ.
     * 
     * @param vlDeducao
     */
    public void setVlDeducao(java.math.BigDecimal vlDeducao) {
        this.vlDeducao = vlDeducao;
    }


    /**
     * Gets the vlOutraRetencao value for this TpComplServ.
     * 
     * @return vlOutraRetencao
     */
    public java.math.BigDecimal getVlOutraRetencao() {
        return vlOutraRetencao;
    }


    /**
     * Sets the vlOutraRetencao value for this TpComplServ.
     * 
     * @param vlOutraRetencao
     */
    public void setVlOutraRetencao(java.math.BigDecimal vlOutraRetencao) {
        this.vlOutraRetencao = vlOutraRetencao;
    }


    /**
     * Gets the dmIndIncentivo value for this TpComplServ.
     * 
     * @return dmIndIncentivo
     */
    public org.apache.axis.types.NonNegativeInteger getDmIndIncentivo() {
        return dmIndIncentivo;
    }


    /**
     * Sets the dmIndIncentivo value for this TpComplServ.
     * 
     * @param dmIndIncentivo
     */
    public void setDmIndIncentivo(org.apache.axis.types.NonNegativeInteger dmIndIncentivo) {
        this.dmIndIncentivo = dmIndIncentivo;
    }


    /**
     * Gets the cnae value for this TpComplServ.
     * 
     * @return cnae
     */
    public java.lang.String getCnae() {
        return cnae;
    }


    /**
     * Sets the cnae value for this TpComplServ.
     * 
     * @param cnae
     */
    public void setCnae(java.lang.String cnae) {
        this.cnae = cnae;
    }


    /**
     * Gets the codSiscomexPais value for this TpComplServ.
     * 
     * @return codSiscomexPais
     */
    public java.math.BigInteger getCodSiscomexPais() {
        return codSiscomexPais;
    }


    /**
     * Sets the codSiscomexPais value for this TpComplServ.
     * 
     * @param codSiscomexPais
     */
    public void setCodSiscomexPais(java.math.BigInteger codSiscomexPais) {
        this.codSiscomexPais = codSiscomexPais;
    }


    /**
     * Gets the nroProc value for this TpComplServ.
     * 
     * @return nroProc
     */
    public java.lang.String getNroProc() {
        return nroProc;
    }


    /**
     * Sets the nroProc value for this TpComplServ.
     * 
     * @param nroProc
     */
    public void setNroProc(java.lang.String nroProc) {
        this.nroProc = nroProc;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TpComplServ)) return false;
        TpComplServ other = (TpComplServ) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codBaseCalcCredPc==null && other.getCodBaseCalcCredPc()==null) || 
             (this.codBaseCalcCredPc!=null &&
              this.codBaseCalcCredPc.equals(other.getCodBaseCalcCredPc()))) &&
            ((this.dmIndOrigCred==null && other.getDmIndOrigCred()==null) || 
             (this.dmIndOrigCred!=null &&
              this.dmIndOrigCred.equals(other.getDmIndOrigCred()))) &&
            ((this.dtPgtoPis==null && other.getDtPgtoPis()==null) || 
             (this.dtPgtoPis!=null &&
              this.dtPgtoPis.equals(other.getDtPgtoPis()))) &&
            ((this.dtPgtoCofins==null && other.getDtPgtoCofins()==null) || 
             (this.dtPgtoCofins!=null &&
              this.dtPgtoCofins.equals(other.getDtPgtoCofins()))) &&
            ((this.dmLocalExecServ==null && other.getDmLocalExecServ()==null) || 
             (this.dmLocalExecServ!=null &&
              this.dmLocalExecServ.equals(other.getDmLocalExecServ()))) &&
            ((this.dmTribMunPrest==null && other.getDmTribMunPrest()==null) || 
             (this.dmTribMunPrest!=null &&
              this.dmTribMunPrest.equals(other.getDmTribMunPrest()))) &&
            ((this.cidadeIbge==null && other.getCidadeIbge()==null) || 
             (this.cidadeIbge!=null &&
              this.cidadeIbge.equals(other.getCidadeIbge()))) &&
            ((this.codCentroCusto==null && other.getCodCentroCusto()==null) || 
             (this.codCentroCusto!=null &&
              this.codCentroCusto.equals(other.getCodCentroCusto()))) &&
            ((this.codTribMunicipio==null && other.getCodTribMunicipio()==null) || 
             (this.codTribMunicipio!=null &&
              this.codTribMunicipio.equals(other.getCodTribMunicipio()))) &&
            ((this.vlDescIncondicionado==null && other.getVlDescIncondicionado()==null) || 
             (this.vlDescIncondicionado!=null &&
              this.vlDescIncondicionado.equals(other.getVlDescIncondicionado()))) &&
            ((this.vlDescCondicionado==null && other.getVlDescCondicionado()==null) || 
             (this.vlDescCondicionado!=null &&
              this.vlDescCondicionado.equals(other.getVlDescCondicionado()))) &&
            ((this.vlDeducao==null && other.getVlDeducao()==null) || 
             (this.vlDeducao!=null &&
              this.vlDeducao.equals(other.getVlDeducao()))) &&
            ((this.vlOutraRetencao==null && other.getVlOutraRetencao()==null) || 
             (this.vlOutraRetencao!=null &&
              this.vlOutraRetencao.equals(other.getVlOutraRetencao()))) &&
            ((this.dmIndIncentivo==null && other.getDmIndIncentivo()==null) || 
             (this.dmIndIncentivo!=null &&
              this.dmIndIncentivo.equals(other.getDmIndIncentivo()))) &&
            ((this.cnae==null && other.getCnae()==null) || 
             (this.cnae!=null &&
              this.cnae.equals(other.getCnae()))) &&
            ((this.codSiscomexPais==null && other.getCodSiscomexPais()==null) || 
             (this.codSiscomexPais!=null &&
              this.codSiscomexPais.equals(other.getCodSiscomexPais()))) &&
            ((this.nroProc==null && other.getNroProc()==null) || 
             (this.nroProc!=null &&
              this.nroProc.equals(other.getNroProc())));
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
        if (getCodBaseCalcCredPc() != null) {
            _hashCode += getCodBaseCalcCredPc().hashCode();
        }
        if (getDmIndOrigCred() != null) {
            _hashCode += getDmIndOrigCred().hashCode();
        }
        if (getDtPgtoPis() != null) {
            _hashCode += getDtPgtoPis().hashCode();
        }
        if (getDtPgtoCofins() != null) {
            _hashCode += getDtPgtoCofins().hashCode();
        }
        if (getDmLocalExecServ() != null) {
            _hashCode += getDmLocalExecServ().hashCode();
        }
        if (getDmTribMunPrest() != null) {
            _hashCode += getDmTribMunPrest().hashCode();
        }
        if (getCidadeIbge() != null) {
            _hashCode += getCidadeIbge().hashCode();
        }
        if (getCodCentroCusto() != null) {
            _hashCode += getCodCentroCusto().hashCode();
        }
        if (getCodTribMunicipio() != null) {
            _hashCode += getCodTribMunicipio().hashCode();
        }
        if (getVlDescIncondicionado() != null) {
            _hashCode += getVlDescIncondicionado().hashCode();
        }
        if (getVlDescCondicionado() != null) {
            _hashCode += getVlDescCondicionado().hashCode();
        }
        if (getVlDeducao() != null) {
            _hashCode += getVlDeducao().hashCode();
        }
        if (getVlOutraRetencao() != null) {
            _hashCode += getVlOutraRetencao().hashCode();
        }
        if (getDmIndIncentivo() != null) {
            _hashCode += getDmIndIncentivo().hashCode();
        }
        if (getCnae() != null) {
            _hashCode += getCnae().hashCode();
        }
        if (getCodSiscomexPais() != null) {
            _hashCode += getCodSiscomexPais().hashCode();
        }
        if (getNroProc() != null) {
            _hashCode += getNroProc().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TpComplServ.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "tpComplServ"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codBaseCalcCredPc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "codBaseCalcCredPc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dmIndOrigCred");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "dmIndOrigCred"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "tpDominio"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dtPgtoPis");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "dtPgtoPis"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dtPgtoCofins");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "dtPgtoCofins"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dmLocalExecServ");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "dmLocalExecServ"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "tpDominio"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dmTribMunPrest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "dmTribMunPrest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "tpDominio"));
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
        elemField.setFieldName("codCentroCusto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "codCentroCusto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codTribMunicipio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "codTribMunicipio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlDescIncondicionado");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "vlDescIncondicionado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlDescCondicionado");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "vlDescCondicionado"));
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
        elemField.setFieldName("vlOutraRetencao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "vlOutraRetencao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dmIndIncentivo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "dmIndIncentivo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "tpDominio"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cnae");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "cnae"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codSiscomexPais");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "codSiscomexPais"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nroProc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "nroProc"));
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
