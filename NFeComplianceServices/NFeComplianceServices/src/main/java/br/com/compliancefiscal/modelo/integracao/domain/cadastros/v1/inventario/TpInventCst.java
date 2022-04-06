/**
 * TpInventCst.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.inventario;

public class TpInventCst  implements java.io.Serializable {
    private java.lang.String codStIcms;

    private java.math.BigDecimal vlBcIcms;

    private java.math.BigDecimal vlIcms;

    public TpInventCst() {
    }

    public TpInventCst(
           java.lang.String codStIcms,
           java.math.BigDecimal vlBcIcms,
           java.math.BigDecimal vlIcms) {
           this.codStIcms = codStIcms;
           this.vlBcIcms = vlBcIcms;
           this.vlIcms = vlIcms;
    }


    /**
     * Gets the codStIcms value for this TpInventCst.
     * 
     * @return codStIcms
     */
    public java.lang.String getCodStIcms() {
        return codStIcms;
    }


    /**
     * Sets the codStIcms value for this TpInventCst.
     * 
     * @param codStIcms
     */
    public void setCodStIcms(java.lang.String codStIcms) {
        this.codStIcms = codStIcms;
    }


    /**
     * Gets the vlBcIcms value for this TpInventCst.
     * 
     * @return vlBcIcms
     */
    public java.math.BigDecimal getVlBcIcms() {
        return vlBcIcms;
    }


    /**
     * Sets the vlBcIcms value for this TpInventCst.
     * 
     * @param vlBcIcms
     */
    public void setVlBcIcms(java.math.BigDecimal vlBcIcms) {
        this.vlBcIcms = vlBcIcms;
    }


    /**
     * Gets the vlIcms value for this TpInventCst.
     * 
     * @return vlIcms
     */
    public java.math.BigDecimal getVlIcms() {
        return vlIcms;
    }


    /**
     * Sets the vlIcms value for this TpInventCst.
     * 
     * @param vlIcms
     */
    public void setVlIcms(java.math.BigDecimal vlIcms) {
        this.vlIcms = vlIcms;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TpInventCst)) return false;
        TpInventCst other = (TpInventCst) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codStIcms==null && other.getCodStIcms()==null) || 
             (this.codStIcms!=null &&
              this.codStIcms.equals(other.getCodStIcms()))) &&
            ((this.vlBcIcms==null && other.getVlBcIcms()==null) || 
             (this.vlBcIcms!=null &&
              this.vlBcIcms.equals(other.getVlBcIcms()))) &&
            ((this.vlIcms==null && other.getVlIcms()==null) || 
             (this.vlIcms!=null &&
              this.vlIcms.equals(other.getVlIcms())));
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
        if (getCodStIcms() != null) {
            _hashCode += getCodStIcms().hashCode();
        }
        if (getVlBcIcms() != null) {
            _hashCode += getVlBcIcms().hashCode();
        }
        if (getVlIcms() != null) {
            _hashCode += getVlIcms().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TpInventCst.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/inventario", "tpInventCst"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codStIcms");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/inventario", "codStIcms"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlBcIcms");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/inventario", "vlBcIcms"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlIcms");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/inventario", "vlIcms"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
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
