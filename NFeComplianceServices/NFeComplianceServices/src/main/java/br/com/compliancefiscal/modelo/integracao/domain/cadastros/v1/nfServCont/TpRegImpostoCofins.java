/**
 * TpRegImpostoCofins.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServCont;

public class TpRegImpostoCofins  implements java.io.Serializable {
    private java.lang.String codStCofins;

    private java.math.BigDecimal vlItem;

    private java.lang.String codBaseCalcCredPc;

    private java.math.BigDecimal vlBcCofins;

    private java.math.BigDecimal aliquotaCofins;

    private java.math.BigDecimal vlCofins;

    private java.lang.String codCta;

    private org.apache.axis.types.NonNegativeInteger naturezaReceitaCofins;

    public TpRegImpostoCofins() {
    }

    public TpRegImpostoCofins(
           java.lang.String codStCofins,
           java.math.BigDecimal vlItem,
           java.lang.String codBaseCalcCredPc,
           java.math.BigDecimal vlBcCofins,
           java.math.BigDecimal aliquotaCofins,
           java.math.BigDecimal vlCofins,
           java.lang.String codCta,
           org.apache.axis.types.NonNegativeInteger naturezaReceitaCofins) {
           this.codStCofins = codStCofins;
           this.vlItem = vlItem;
           this.codBaseCalcCredPc = codBaseCalcCredPc;
           this.vlBcCofins = vlBcCofins;
           this.aliquotaCofins = aliquotaCofins;
           this.vlCofins = vlCofins;
           this.codCta = codCta;
           this.naturezaReceitaCofins = naturezaReceitaCofins;
    }


    /**
     * Gets the codStCofins value for this TpRegImpostoCofins.
     * 
     * @return codStCofins
     */
    public java.lang.String getCodStCofins() {
        return codStCofins;
    }


    /**
     * Sets the codStCofins value for this TpRegImpostoCofins.
     * 
     * @param codStCofins
     */
    public void setCodStCofins(java.lang.String codStCofins) {
        this.codStCofins = codStCofins;
    }


    /**
     * Gets the vlItem value for this TpRegImpostoCofins.
     * 
     * @return vlItem
     */
    public java.math.BigDecimal getVlItem() {
        return vlItem;
    }


    /**
     * Sets the vlItem value for this TpRegImpostoCofins.
     * 
     * @param vlItem
     */
    public void setVlItem(java.math.BigDecimal vlItem) {
        this.vlItem = vlItem;
    }


    /**
     * Gets the codBaseCalcCredPc value for this TpRegImpostoCofins.
     * 
     * @return codBaseCalcCredPc
     */
    public java.lang.String getCodBaseCalcCredPc() {
        return codBaseCalcCredPc;
    }


    /**
     * Sets the codBaseCalcCredPc value for this TpRegImpostoCofins.
     * 
     * @param codBaseCalcCredPc
     */
    public void setCodBaseCalcCredPc(java.lang.String codBaseCalcCredPc) {
        this.codBaseCalcCredPc = codBaseCalcCredPc;
    }


    /**
     * Gets the vlBcCofins value for this TpRegImpostoCofins.
     * 
     * @return vlBcCofins
     */
    public java.math.BigDecimal getVlBcCofins() {
        return vlBcCofins;
    }


    /**
     * Sets the vlBcCofins value for this TpRegImpostoCofins.
     * 
     * @param vlBcCofins
     */
    public void setVlBcCofins(java.math.BigDecimal vlBcCofins) {
        this.vlBcCofins = vlBcCofins;
    }


    /**
     * Gets the aliquotaCofins value for this TpRegImpostoCofins.
     * 
     * @return aliquotaCofins
     */
    public java.math.BigDecimal getAliquotaCofins() {
        return aliquotaCofins;
    }


    /**
     * Sets the aliquotaCofins value for this TpRegImpostoCofins.
     * 
     * @param aliquotaCofins
     */
    public void setAliquotaCofins(java.math.BigDecimal aliquotaCofins) {
        this.aliquotaCofins = aliquotaCofins;
    }


    /**
     * Gets the vlCofins value for this TpRegImpostoCofins.
     * 
     * @return vlCofins
     */
    public java.math.BigDecimal getVlCofins() {
        return vlCofins;
    }


    /**
     * Sets the vlCofins value for this TpRegImpostoCofins.
     * 
     * @param vlCofins
     */
    public void setVlCofins(java.math.BigDecimal vlCofins) {
        this.vlCofins = vlCofins;
    }


    /**
     * Gets the codCta value for this TpRegImpostoCofins.
     * 
     * @return codCta
     */
    public java.lang.String getCodCta() {
        return codCta;
    }


    /**
     * Sets the codCta value for this TpRegImpostoCofins.
     * 
     * @param codCta
     */
    public void setCodCta(java.lang.String codCta) {
        this.codCta = codCta;
    }


    /**
     * Gets the naturezaReceitaCofins value for this TpRegImpostoCofins.
     * 
     * @return naturezaReceitaCofins
     */
    public org.apache.axis.types.NonNegativeInteger getNaturezaReceitaCofins() {
        return naturezaReceitaCofins;
    }


    /**
     * Sets the naturezaReceitaCofins value for this TpRegImpostoCofins.
     * 
     * @param naturezaReceitaCofins
     */
    public void setNaturezaReceitaCofins(org.apache.axis.types.NonNegativeInteger naturezaReceitaCofins) {
        this.naturezaReceitaCofins = naturezaReceitaCofins;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TpRegImpostoCofins)) return false;
        TpRegImpostoCofins other = (TpRegImpostoCofins) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codStCofins==null && other.getCodStCofins()==null) || 
             (this.codStCofins!=null &&
              this.codStCofins.equals(other.getCodStCofins()))) &&
            ((this.vlItem==null && other.getVlItem()==null) || 
             (this.vlItem!=null &&
              this.vlItem.equals(other.getVlItem()))) &&
            ((this.codBaseCalcCredPc==null && other.getCodBaseCalcCredPc()==null) || 
             (this.codBaseCalcCredPc!=null &&
              this.codBaseCalcCredPc.equals(other.getCodBaseCalcCredPc()))) &&
            ((this.vlBcCofins==null && other.getVlBcCofins()==null) || 
             (this.vlBcCofins!=null &&
              this.vlBcCofins.equals(other.getVlBcCofins()))) &&
            ((this.aliquotaCofins==null && other.getAliquotaCofins()==null) || 
             (this.aliquotaCofins!=null &&
              this.aliquotaCofins.equals(other.getAliquotaCofins()))) &&
            ((this.vlCofins==null && other.getVlCofins()==null) || 
             (this.vlCofins!=null &&
              this.vlCofins.equals(other.getVlCofins()))) &&
            ((this.codCta==null && other.getCodCta()==null) || 
             (this.codCta!=null &&
              this.codCta.equals(other.getCodCta()))) &&
            ((this.naturezaReceitaCofins==null && other.getNaturezaReceitaCofins()==null) || 
             (this.naturezaReceitaCofins!=null &&
              this.naturezaReceitaCofins.equals(other.getNaturezaReceitaCofins())));
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
        if (getCodStCofins() != null) {
            _hashCode += getCodStCofins().hashCode();
        }
        if (getVlItem() != null) {
            _hashCode += getVlItem().hashCode();
        }
        if (getCodBaseCalcCredPc() != null) {
            _hashCode += getCodBaseCalcCredPc().hashCode();
        }
        if (getVlBcCofins() != null) {
            _hashCode += getVlBcCofins().hashCode();
        }
        if (getAliquotaCofins() != null) {
            _hashCode += getAliquotaCofins().hashCode();
        }
        if (getVlCofins() != null) {
            _hashCode += getVlCofins().hashCode();
        }
        if (getCodCta() != null) {
            _hashCode += getCodCta().hashCode();
        }
        if (getNaturezaReceitaCofins() != null) {
            _hashCode += getNaturezaReceitaCofins().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TpRegImpostoCofins.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServCont", "tpRegImpostoCofins"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codStCofins");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServCont", "codStCofins"));
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
        elemField.setFieldName("vlBcCofins");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServCont", "vlBcCofins"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aliquotaCofins");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServCont", "aliquotaCofins"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalFourPrec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlCofins");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServCont", "vlCofins"));
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
        elemField.setFieldName("naturezaReceitaCofins");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServCont", "naturezaReceitaCofins"));
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
