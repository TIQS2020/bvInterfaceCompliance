/**
 * TpRegImpostoPis.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServCont;

public class TpRegImpostoPis  implements java.io.Serializable {
    private java.lang.String codStPis;

    private java.math.BigDecimal vlItem;

    private java.lang.String codBaseCalcCredPc;

    private java.math.BigDecimal vlBcPis;

    private java.math.BigDecimal aliquotaPis;

    private java.math.BigDecimal vlPis;

    private java.lang.String codCta;

    private org.apache.axis.types.NonNegativeInteger naturezaReceitaPis;

    public TpRegImpostoPis() {
    }

    public TpRegImpostoPis(
           java.lang.String codStPis,
           java.math.BigDecimal vlItem,
           java.lang.String codBaseCalcCredPc,
           java.math.BigDecimal vlBcPis,
           java.math.BigDecimal aliquotaPis,
           java.math.BigDecimal vlPis,
           java.lang.String codCta,
           org.apache.axis.types.NonNegativeInteger naturezaReceitaPis) {
           this.codStPis = codStPis;
           this.vlItem = vlItem;
           this.codBaseCalcCredPc = codBaseCalcCredPc;
           this.vlBcPis = vlBcPis;
           this.aliquotaPis = aliquotaPis;
           this.vlPis = vlPis;
           this.codCta = codCta;
           this.naturezaReceitaPis = naturezaReceitaPis;
    }


    /**
     * Gets the codStPis value for this TpRegImpostoPis.
     * 
     * @return codStPis
     */
    public java.lang.String getCodStPis() {
        return codStPis;
    }


    /**
     * Sets the codStPis value for this TpRegImpostoPis.
     * 
     * @param codStPis
     */
    public void setCodStPis(java.lang.String codStPis) {
        this.codStPis = codStPis;
    }


    /**
     * Gets the vlItem value for this TpRegImpostoPis.
     * 
     * @return vlItem
     */
    public java.math.BigDecimal getVlItem() {
        return vlItem;
    }


    /**
     * Sets the vlItem value for this TpRegImpostoPis.
     * 
     * @param vlItem
     */
    public void setVlItem(java.math.BigDecimal vlItem) {
        this.vlItem = vlItem;
    }


    /**
     * Gets the codBaseCalcCredPc value for this TpRegImpostoPis.
     * 
     * @return codBaseCalcCredPc
     */
    public java.lang.String getCodBaseCalcCredPc() {
        return codBaseCalcCredPc;
    }


    /**
     * Sets the codBaseCalcCredPc value for this TpRegImpostoPis.
     * 
     * @param codBaseCalcCredPc
     */
    public void setCodBaseCalcCredPc(java.lang.String codBaseCalcCredPc) {
        this.codBaseCalcCredPc = codBaseCalcCredPc;
    }


    /**
     * Gets the vlBcPis value for this TpRegImpostoPis.
     * 
     * @return vlBcPis
     */
    public java.math.BigDecimal getVlBcPis() {
        return vlBcPis;
    }


    /**
     * Sets the vlBcPis value for this TpRegImpostoPis.
     * 
     * @param vlBcPis
     */
    public void setVlBcPis(java.math.BigDecimal vlBcPis) {
        this.vlBcPis = vlBcPis;
    }


    /**
     * Gets the aliquotaPis value for this TpRegImpostoPis.
     * 
     * @return aliquotaPis
     */
    public java.math.BigDecimal getAliquotaPis() {
        return aliquotaPis;
    }


    /**
     * Sets the aliquotaPis value for this TpRegImpostoPis.
     * 
     * @param aliquotaPis
     */
    public void setAliquotaPis(java.math.BigDecimal aliquotaPis) {
        this.aliquotaPis = aliquotaPis;
    }


    /**
     * Gets the vlPis value for this TpRegImpostoPis.
     * 
     * @return vlPis
     */
    public java.math.BigDecimal getVlPis() {
        return vlPis;
    }


    /**
     * Sets the vlPis value for this TpRegImpostoPis.
     * 
     * @param vlPis
     */
    public void setVlPis(java.math.BigDecimal vlPis) {
        this.vlPis = vlPis;
    }


    /**
     * Gets the codCta value for this TpRegImpostoPis.
     * 
     * @return codCta
     */
    public java.lang.String getCodCta() {
        return codCta;
    }


    /**
     * Sets the codCta value for this TpRegImpostoPis.
     * 
     * @param codCta
     */
    public void setCodCta(java.lang.String codCta) {
        this.codCta = codCta;
    }


    /**
     * Gets the naturezaReceitaPis value for this TpRegImpostoPis.
     * 
     * @return naturezaReceitaPis
     */
    public org.apache.axis.types.NonNegativeInteger getNaturezaReceitaPis() {
        return naturezaReceitaPis;
    }


    /**
     * Sets the naturezaReceitaPis value for this TpRegImpostoPis.
     * 
     * @param naturezaReceitaPis
     */
    public void setNaturezaReceitaPis(org.apache.axis.types.NonNegativeInteger naturezaReceitaPis) {
        this.naturezaReceitaPis = naturezaReceitaPis;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TpRegImpostoPis)) return false;
        TpRegImpostoPis other = (TpRegImpostoPis) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codStPis==null && other.getCodStPis()==null) || 
             (this.codStPis!=null &&
              this.codStPis.equals(other.getCodStPis()))) &&
            ((this.vlItem==null && other.getVlItem()==null) || 
             (this.vlItem!=null &&
              this.vlItem.equals(other.getVlItem()))) &&
            ((this.codBaseCalcCredPc==null && other.getCodBaseCalcCredPc()==null) || 
             (this.codBaseCalcCredPc!=null &&
              this.codBaseCalcCredPc.equals(other.getCodBaseCalcCredPc()))) &&
            ((this.vlBcPis==null && other.getVlBcPis()==null) || 
             (this.vlBcPis!=null &&
              this.vlBcPis.equals(other.getVlBcPis()))) &&
            ((this.aliquotaPis==null && other.getAliquotaPis()==null) || 
             (this.aliquotaPis!=null &&
              this.aliquotaPis.equals(other.getAliquotaPis()))) &&
            ((this.vlPis==null && other.getVlPis()==null) || 
             (this.vlPis!=null &&
              this.vlPis.equals(other.getVlPis()))) &&
            ((this.codCta==null && other.getCodCta()==null) || 
             (this.codCta!=null &&
              this.codCta.equals(other.getCodCta()))) &&
            ((this.naturezaReceitaPis==null && other.getNaturezaReceitaPis()==null) || 
             (this.naturezaReceitaPis!=null &&
              this.naturezaReceitaPis.equals(other.getNaturezaReceitaPis())));
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
        if (getCodStPis() != null) {
            _hashCode += getCodStPis().hashCode();
        }
        if (getVlItem() != null) {
            _hashCode += getVlItem().hashCode();
        }
        if (getCodBaseCalcCredPc() != null) {
            _hashCode += getCodBaseCalcCredPc().hashCode();
        }
        if (getVlBcPis() != null) {
            _hashCode += getVlBcPis().hashCode();
        }
        if (getAliquotaPis() != null) {
            _hashCode += getAliquotaPis().hashCode();
        }
        if (getVlPis() != null) {
            _hashCode += getVlPis().hashCode();
        }
        if (getCodCta() != null) {
            _hashCode += getCodCta().hashCode();
        }
        if (getNaturezaReceitaPis() != null) {
            _hashCode += getNaturezaReceitaPis().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TpRegImpostoPis.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServCont", "tpRegImpostoPis"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codStPis");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServCont", "codStPis"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlItem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServCont", "vlItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codBaseCalcCredPc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServCont", "codBaseCalcCredPc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlBcPis");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServCont", "vlBcPis"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aliquotaPis");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServCont", "aliquotaPis"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalFourPrec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlPis");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServCont", "vlPis"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
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
        elemField.setFieldName("naturezaReceitaPis");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServCont", "naturezaReceitaPis"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
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
