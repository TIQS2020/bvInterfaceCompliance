/**
 * TipoParametro.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.participante;

public class TipoParametro  implements java.io.Serializable {
    private br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.participante.TpSimplesNacional simplesNacional;

    private br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.participante.TpRegimeEspecialTributacao regimeEspecialTributacao;

    private br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.participante.TpIncentivadorCultural incentivadorCultural;

    private br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.participante.TpProdutorRural produtorRural;

    private br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.participante.TpContribuinteIcms contribuinteIcms;

    private org.apache.axis.types.NonNegativeInteger calculaIcmsSt;

    private java.math.BigInteger motivoDesoneracaoIcms;

    private java.math.BigInteger indicadorInsEst;

    private java.math.BigInteger regTrib;

    private org.apache.axis.types.NonNegativeInteger indicadorTipoAtiv;

    public TipoParametro() {
    }

    public TipoParametro(
           br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.participante.TpSimplesNacional simplesNacional,
           br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.participante.TpRegimeEspecialTributacao regimeEspecialTributacao,
           br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.participante.TpIncentivadorCultural incentivadorCultural,
           br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.participante.TpProdutorRural produtorRural,
           br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.participante.TpContribuinteIcms contribuinteIcms,
           org.apache.axis.types.NonNegativeInteger calculaIcmsSt,
           java.math.BigInteger motivoDesoneracaoIcms,
           java.math.BigInteger indicadorInsEst,
           java.math.BigInteger regTrib,
           org.apache.axis.types.NonNegativeInteger indicadorTipoAtiv) {
           this.simplesNacional = simplesNacional;
           this.regimeEspecialTributacao = regimeEspecialTributacao;
           this.incentivadorCultural = incentivadorCultural;
           this.produtorRural = produtorRural;
           this.contribuinteIcms = contribuinteIcms;
           this.calculaIcmsSt = calculaIcmsSt;
           this.motivoDesoneracaoIcms = motivoDesoneracaoIcms;
           this.indicadorInsEst = indicadorInsEst;
           this.regTrib = regTrib;
           this.indicadorTipoAtiv = indicadorTipoAtiv;
    }


    /**
     * Gets the simplesNacional value for this TipoParametro.
     * 
     * @return simplesNacional
     */
    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.participante.TpSimplesNacional getSimplesNacional() {
        return simplesNacional;
    }


    /**
     * Sets the simplesNacional value for this TipoParametro.
     * 
     * @param simplesNacional
     */
    public void setSimplesNacional(br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.participante.TpSimplesNacional simplesNacional) {
        this.simplesNacional = simplesNacional;
    }


    /**
     * Gets the regimeEspecialTributacao value for this TipoParametro.
     * 
     * @return regimeEspecialTributacao
     */
    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.participante.TpRegimeEspecialTributacao getRegimeEspecialTributacao() {
        return regimeEspecialTributacao;
    }


    /**
     * Sets the regimeEspecialTributacao value for this TipoParametro.
     * 
     * @param regimeEspecialTributacao
     */
    public void setRegimeEspecialTributacao(br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.participante.TpRegimeEspecialTributacao regimeEspecialTributacao) {
        this.regimeEspecialTributacao = regimeEspecialTributacao;
    }


    /**
     * Gets the incentivadorCultural value for this TipoParametro.
     * 
     * @return incentivadorCultural
     */
    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.participante.TpIncentivadorCultural getIncentivadorCultural() {
        return incentivadorCultural;
    }


    /**
     * Sets the incentivadorCultural value for this TipoParametro.
     * 
     * @param incentivadorCultural
     */
    public void setIncentivadorCultural(br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.participante.TpIncentivadorCultural incentivadorCultural) {
        this.incentivadorCultural = incentivadorCultural;
    }


    /**
     * Gets the produtorRural value for this TipoParametro.
     * 
     * @return produtorRural
     */
    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.participante.TpProdutorRural getProdutorRural() {
        return produtorRural;
    }


    /**
     * Sets the produtorRural value for this TipoParametro.
     * 
     * @param produtorRural
     */
    public void setProdutorRural(br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.participante.TpProdutorRural produtorRural) {
        this.produtorRural = produtorRural;
    }


    /**
     * Gets the contribuinteIcms value for this TipoParametro.
     * 
     * @return contribuinteIcms
     */
    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.participante.TpContribuinteIcms getContribuinteIcms() {
        return contribuinteIcms;
    }


    /**
     * Sets the contribuinteIcms value for this TipoParametro.
     * 
     * @param contribuinteIcms
     */
    public void setContribuinteIcms(br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.participante.TpContribuinteIcms contribuinteIcms) {
        this.contribuinteIcms = contribuinteIcms;
    }


    /**
     * Gets the calculaIcmsSt value for this TipoParametro.
     * 
     * @return calculaIcmsSt
     */
    public org.apache.axis.types.NonNegativeInteger getCalculaIcmsSt() {
        return calculaIcmsSt;
    }


    /**
     * Sets the calculaIcmsSt value for this TipoParametro.
     * 
     * @param calculaIcmsSt
     */
    public void setCalculaIcmsSt(org.apache.axis.types.NonNegativeInteger calculaIcmsSt) {
        this.calculaIcmsSt = calculaIcmsSt;
    }


    /**
     * Gets the motivoDesoneracaoIcms value for this TipoParametro.
     * 
     * @return motivoDesoneracaoIcms
     */
    public java.math.BigInteger getMotivoDesoneracaoIcms() {
        return motivoDesoneracaoIcms;
    }


    /**
     * Sets the motivoDesoneracaoIcms value for this TipoParametro.
     * 
     * @param motivoDesoneracaoIcms
     */
    public void setMotivoDesoneracaoIcms(java.math.BigInteger motivoDesoneracaoIcms) {
        this.motivoDesoneracaoIcms = motivoDesoneracaoIcms;
    }


    /**
     * Gets the indicadorInsEst value for this TipoParametro.
     * 
     * @return indicadorInsEst
     */
    public java.math.BigInteger getIndicadorInsEst() {
        return indicadorInsEst;
    }


    /**
     * Sets the indicadorInsEst value for this TipoParametro.
     * 
     * @param indicadorInsEst
     */
    public void setIndicadorInsEst(java.math.BigInteger indicadorInsEst) {
        this.indicadorInsEst = indicadorInsEst;
    }


    /**
     * Gets the regTrib value for this TipoParametro.
     * 
     * @return regTrib
     */
    public java.math.BigInteger getRegTrib() {
        return regTrib;
    }


    /**
     * Sets the regTrib value for this TipoParametro.
     * 
     * @param regTrib
     */
    public void setRegTrib(java.math.BigInteger regTrib) {
        this.regTrib = regTrib;
    }


    /**
     * Gets the indicadorTipoAtiv value for this TipoParametro.
     * 
     * @return indicadorTipoAtiv
     */
    public org.apache.axis.types.NonNegativeInteger getIndicadorTipoAtiv() {
        return indicadorTipoAtiv;
    }


    /**
     * Sets the indicadorTipoAtiv value for this TipoParametro.
     * 
     * @param indicadorTipoAtiv
     */
    public void setIndicadorTipoAtiv(org.apache.axis.types.NonNegativeInteger indicadorTipoAtiv) {
        this.indicadorTipoAtiv = indicadorTipoAtiv;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TipoParametro)) return false;
        TipoParametro other = (TipoParametro) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.simplesNacional==null && other.getSimplesNacional()==null) || 
             (this.simplesNacional!=null &&
              this.simplesNacional.equals(other.getSimplesNacional()))) &&
            ((this.regimeEspecialTributacao==null && other.getRegimeEspecialTributacao()==null) || 
             (this.regimeEspecialTributacao!=null &&
              this.regimeEspecialTributacao.equals(other.getRegimeEspecialTributacao()))) &&
            ((this.incentivadorCultural==null && other.getIncentivadorCultural()==null) || 
             (this.incentivadorCultural!=null &&
              this.incentivadorCultural.equals(other.getIncentivadorCultural()))) &&
            ((this.produtorRural==null && other.getProdutorRural()==null) || 
             (this.produtorRural!=null &&
              this.produtorRural.equals(other.getProdutorRural()))) &&
            ((this.contribuinteIcms==null && other.getContribuinteIcms()==null) || 
             (this.contribuinteIcms!=null &&
              this.contribuinteIcms.equals(other.getContribuinteIcms()))) &&
            ((this.calculaIcmsSt==null && other.getCalculaIcmsSt()==null) || 
             (this.calculaIcmsSt!=null &&
              this.calculaIcmsSt.equals(other.getCalculaIcmsSt()))) &&
            ((this.motivoDesoneracaoIcms==null && other.getMotivoDesoneracaoIcms()==null) || 
             (this.motivoDesoneracaoIcms!=null &&
              this.motivoDesoneracaoIcms.equals(other.getMotivoDesoneracaoIcms()))) &&
            ((this.indicadorInsEst==null && other.getIndicadorInsEst()==null) || 
             (this.indicadorInsEst!=null &&
              this.indicadorInsEst.equals(other.getIndicadorInsEst()))) &&
            ((this.regTrib==null && other.getRegTrib()==null) || 
             (this.regTrib!=null &&
              this.regTrib.equals(other.getRegTrib()))) &&
            ((this.indicadorTipoAtiv==null && other.getIndicadorTipoAtiv()==null) || 
             (this.indicadorTipoAtiv!=null &&
              this.indicadorTipoAtiv.equals(other.getIndicadorTipoAtiv())));
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
        if (getSimplesNacional() != null) {
            _hashCode += getSimplesNacional().hashCode();
        }
        if (getRegimeEspecialTributacao() != null) {
            _hashCode += getRegimeEspecialTributacao().hashCode();
        }
        if (getIncentivadorCultural() != null) {
            _hashCode += getIncentivadorCultural().hashCode();
        }
        if (getProdutorRural() != null) {
            _hashCode += getProdutorRural().hashCode();
        }
        if (getContribuinteIcms() != null) {
            _hashCode += getContribuinteIcms().hashCode();
        }
        if (getCalculaIcmsSt() != null) {
            _hashCode += getCalculaIcmsSt().hashCode();
        }
        if (getMotivoDesoneracaoIcms() != null) {
            _hashCode += getMotivoDesoneracaoIcms().hashCode();
        }
        if (getIndicadorInsEst() != null) {
            _hashCode += getIndicadorInsEst().hashCode();
        }
        if (getRegTrib() != null) {
            _hashCode += getRegTrib().hashCode();
        }
        if (getIndicadorTipoAtiv() != null) {
            _hashCode += getIndicadorTipoAtiv().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TipoParametro.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/participante", "tipoParametro"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("simplesNacional");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/participante", "simplesNacional"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/participante", "tpSimplesNacional"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regimeEspecialTributacao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/participante", "regimeEspecialTributacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/participante", "tpRegimeEspecialTributacao"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("incentivadorCultural");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/participante", "incentivadorCultural"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/participante", "tpIncentivadorCultural"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("produtorRural");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/participante", "produtorRural"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/participante", "tpProdutorRural"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contribuinteIcms");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/participante", "contribuinteIcms"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/participante", "tpContribuinteIcms"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("calculaIcmsSt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/participante", "calculaIcmsSt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "tpDominio"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("motivoDesoneracaoIcms");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/participante", "motivoDesoneracaoIcms"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indicadorInsEst");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/participante", "indicadorInsEst"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regTrib");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/participante", "regTrib"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indicadorTipoAtiv");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/participante", "indicadorTipoAtiv"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "tpDominio"));
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
