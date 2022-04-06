/**
 * TpDadosMed.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil;

public class TpDadosMed  implements java.io.Serializable {
    private org.apache.axis.types.NonNegativeInteger dmTpProd;

    private org.apache.axis.types.NonNegativeInteger dmIndMed;

    private java.lang.String nroLote;

    private java.math.BigDecimal qtdLote;

    private java.util.Date dtFabr;

    private java.util.Date dtValid;

    private java.math.BigDecimal vlTabMax;

    private java.lang.String codAnvisa;

    public TpDadosMed() {
    }

    public TpDadosMed(
           org.apache.axis.types.NonNegativeInteger dmTpProd,
           org.apache.axis.types.NonNegativeInteger dmIndMed,
           java.lang.String nroLote,
           java.math.BigDecimal qtdLote,
           java.util.Date dtFabr,
           java.util.Date dtValid,
           java.math.BigDecimal vlTabMax,
           java.lang.String codAnvisa) {
           this.dmTpProd = dmTpProd;
           this.dmIndMed = dmIndMed;
           this.nroLote = nroLote;
           this.qtdLote = qtdLote;
           this.dtFabr = dtFabr;
           this.dtValid = dtValid;
           this.vlTabMax = vlTabMax;
           this.codAnvisa = codAnvisa;
    }


    /**
     * Gets the dmTpProd value for this TpDadosMed.
     * 
     * @return dmTpProd
     */
    public org.apache.axis.types.NonNegativeInteger getDmTpProd() {
        return dmTpProd;
    }


    /**
     * Sets the dmTpProd value for this TpDadosMed.
     * 
     * @param dmTpProd
     */
    public void setDmTpProd(org.apache.axis.types.NonNegativeInteger dmTpProd) {
        this.dmTpProd = dmTpProd;
    }


    /**
     * Gets the dmIndMed value for this TpDadosMed.
     * 
     * @return dmIndMed
     */
    public org.apache.axis.types.NonNegativeInteger getDmIndMed() {
        return dmIndMed;
    }


    /**
     * Sets the dmIndMed value for this TpDadosMed.
     * 
     * @param dmIndMed
     */
    public void setDmIndMed(org.apache.axis.types.NonNegativeInteger dmIndMed) {
        this.dmIndMed = dmIndMed;
    }


    /**
     * Gets the nroLote value for this TpDadosMed.
     * 
     * @return nroLote
     */
    public java.lang.String getNroLote() {
        return nroLote;
    }


    /**
     * Sets the nroLote value for this TpDadosMed.
     * 
     * @param nroLote
     */
    public void setNroLote(java.lang.String nroLote) {
        this.nroLote = nroLote;
    }


    /**
     * Gets the qtdLote value for this TpDadosMed.
     * 
     * @return qtdLote
     */
    public java.math.BigDecimal getQtdLote() {
        return qtdLote;
    }


    /**
     * Sets the qtdLote value for this TpDadosMed.
     * 
     * @param qtdLote
     */
    public void setQtdLote(java.math.BigDecimal qtdLote) {
        this.qtdLote = qtdLote;
    }


    /**
     * Gets the dtFabr value for this TpDadosMed.
     * 
     * @return dtFabr
     */
    public java.util.Date getDtFabr() {
        return dtFabr;
    }


    /**
     * Sets the dtFabr value for this TpDadosMed.
     * 
     * @param dtFabr
     */
    public void setDtFabr(java.util.Date dtFabr) {
        this.dtFabr = dtFabr;
    }


    /**
     * Gets the dtValid value for this TpDadosMed.
     * 
     * @return dtValid
     */
    public java.util.Date getDtValid() {
        return dtValid;
    }


    /**
     * Sets the dtValid value for this TpDadosMed.
     * 
     * @param dtValid
     */
    public void setDtValid(java.util.Date dtValid) {
        this.dtValid = dtValid;
    }


    /**
     * Gets the vlTabMax value for this TpDadosMed.
     * 
     * @return vlTabMax
     */
    public java.math.BigDecimal getVlTabMax() {
        return vlTabMax;
    }


    /**
     * Sets the vlTabMax value for this TpDadosMed.
     * 
     * @param vlTabMax
     */
    public void setVlTabMax(java.math.BigDecimal vlTabMax) {
        this.vlTabMax = vlTabMax;
    }


    /**
     * Gets the codAnvisa value for this TpDadosMed.
     * 
     * @return codAnvisa
     */
    public java.lang.String getCodAnvisa() {
        return codAnvisa;
    }


    /**
     * Sets the codAnvisa value for this TpDadosMed.
     * 
     * @param codAnvisa
     */
    public void setCodAnvisa(java.lang.String codAnvisa) {
        this.codAnvisa = codAnvisa;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TpDadosMed)) return false;
        TpDadosMed other = (TpDadosMed) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dmTpProd==null && other.getDmTpProd()==null) || 
             (this.dmTpProd!=null &&
              this.dmTpProd.equals(other.getDmTpProd()))) &&
            ((this.dmIndMed==null && other.getDmIndMed()==null) || 
             (this.dmIndMed!=null &&
              this.dmIndMed.equals(other.getDmIndMed()))) &&
            ((this.nroLote==null && other.getNroLote()==null) || 
             (this.nroLote!=null &&
              this.nroLote.equals(other.getNroLote()))) &&
            ((this.qtdLote==null && other.getQtdLote()==null) || 
             (this.qtdLote!=null &&
              this.qtdLote.equals(other.getQtdLote()))) &&
            ((this.dtFabr==null && other.getDtFabr()==null) || 
             (this.dtFabr!=null &&
              this.dtFabr.equals(other.getDtFabr()))) &&
            ((this.dtValid==null && other.getDtValid()==null) || 
             (this.dtValid!=null &&
              this.dtValid.equals(other.getDtValid()))) &&
            ((this.vlTabMax==null && other.getVlTabMax()==null) || 
             (this.vlTabMax!=null &&
              this.vlTabMax.equals(other.getVlTabMax()))) &&
            ((this.codAnvisa==null && other.getCodAnvisa()==null) || 
             (this.codAnvisa!=null &&
              this.codAnvisa.equals(other.getCodAnvisa())));
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
        if (getDmTpProd() != null) {
            _hashCode += getDmTpProd().hashCode();
        }
        if (getDmIndMed() != null) {
            _hashCode += getDmIndMed().hashCode();
        }
        if (getNroLote() != null) {
            _hashCode += getNroLote().hashCode();
        }
        if (getQtdLote() != null) {
            _hashCode += getQtdLote().hashCode();
        }
        if (getDtFabr() != null) {
            _hashCode += getDtFabr().hashCode();
        }
        if (getDtValid() != null) {
            _hashCode += getDtValid().hashCode();
        }
        if (getVlTabMax() != null) {
            _hashCode += getVlTabMax().hashCode();
        }
        if (getCodAnvisa() != null) {
            _hashCode += getCodAnvisa().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TpDadosMed.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "tpDadosMed"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dmTpProd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "dmTpProd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "tpDominio"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dmIndMed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "dmIndMed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "tpDominio"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nroLote");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "nroLote"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qtdLote");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "qtdLote"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalThreePrec"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dtFabr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "dtFabr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dtValid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "dtValid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlTabMax");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "vlTabMax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codAnvisa");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "codAnvisa"));
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
