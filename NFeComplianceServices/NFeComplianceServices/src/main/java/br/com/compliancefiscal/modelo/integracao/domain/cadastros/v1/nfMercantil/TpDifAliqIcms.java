/**
 * TpDifAliqIcms.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil;

public class TpDifAliqIcms  implements java.io.Serializable {
    private java.math.BigDecimal aliqOrigem;

    private java.math.BigDecimal aliqInterEstadual;

    private java.math.BigDecimal vlBaseIcms;

    private java.math.BigDecimal vlDifAliq;

    public TpDifAliqIcms() {
    }

    public TpDifAliqIcms(
           java.math.BigDecimal aliqOrigem,
           java.math.BigDecimal aliqInterEstadual,
           java.math.BigDecimal vlBaseIcms,
           java.math.BigDecimal vlDifAliq) {
           this.aliqOrigem = aliqOrigem;
           this.aliqInterEstadual = aliqInterEstadual;
           this.vlBaseIcms = vlBaseIcms;
           this.vlDifAliq = vlDifAliq;
    }


    /**
     * Gets the aliqOrigem value for this TpDifAliqIcms.
     * 
     * @return aliqOrigem
     */
    public java.math.BigDecimal getAliqOrigem() {
        return aliqOrigem;
    }


    /**
     * Sets the aliqOrigem value for this TpDifAliqIcms.
     * 
     * @param aliqOrigem
     */
    public void setAliqOrigem(java.math.BigDecimal aliqOrigem) {
        this.aliqOrigem = aliqOrigem;
    }


    /**
     * Gets the aliqInterEstadual value for this TpDifAliqIcms.
     * 
     * @return aliqInterEstadual
     */
    public java.math.BigDecimal getAliqInterEstadual() {
        return aliqInterEstadual;
    }


    /**
     * Sets the aliqInterEstadual value for this TpDifAliqIcms.
     * 
     * @param aliqInterEstadual
     */
    public void setAliqInterEstadual(java.math.BigDecimal aliqInterEstadual) {
        this.aliqInterEstadual = aliqInterEstadual;
    }


    /**
     * Gets the vlBaseIcms value for this TpDifAliqIcms.
     * 
     * @return vlBaseIcms
     */
    public java.math.BigDecimal getVlBaseIcms() {
        return vlBaseIcms;
    }


    /**
     * Sets the vlBaseIcms value for this TpDifAliqIcms.
     * 
     * @param vlBaseIcms
     */
    public void setVlBaseIcms(java.math.BigDecimal vlBaseIcms) {
        this.vlBaseIcms = vlBaseIcms;
    }


    /**
     * Gets the vlDifAliq value for this TpDifAliqIcms.
     * 
     * @return vlDifAliq
     */
    public java.math.BigDecimal getVlDifAliq() {
        return vlDifAliq;
    }


    /**
     * Sets the vlDifAliq value for this TpDifAliqIcms.
     * 
     * @param vlDifAliq
     */
    public void setVlDifAliq(java.math.BigDecimal vlDifAliq) {
        this.vlDifAliq = vlDifAliq;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TpDifAliqIcms)) return false;
        TpDifAliqIcms other = (TpDifAliqIcms) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.aliqOrigem==null && other.getAliqOrigem()==null) || 
             (this.aliqOrigem!=null &&
              this.aliqOrigem.equals(other.getAliqOrigem()))) &&
            ((this.aliqInterEstadual==null && other.getAliqInterEstadual()==null) || 
             (this.aliqInterEstadual!=null &&
              this.aliqInterEstadual.equals(other.getAliqInterEstadual()))) &&
            ((this.vlBaseIcms==null && other.getVlBaseIcms()==null) || 
             (this.vlBaseIcms!=null &&
              this.vlBaseIcms.equals(other.getVlBaseIcms()))) &&
            ((this.vlDifAliq==null && other.getVlDifAliq()==null) || 
             (this.vlDifAliq!=null &&
              this.vlDifAliq.equals(other.getVlDifAliq())));
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
        if (getAliqOrigem() != null) {
            _hashCode += getAliqOrigem().hashCode();
        }
        if (getAliqInterEstadual() != null) {
            _hashCode += getAliqInterEstadual().hashCode();
        }
        if (getVlBaseIcms() != null) {
            _hashCode += getVlBaseIcms().hashCode();
        }
        if (getVlDifAliq() != null) {
            _hashCode += getVlDifAliq().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TpDifAliqIcms.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "tpDifAliqIcms"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aliqOrigem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "aliqOrigem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aliqInterEstadual");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "aliqInterEstadual"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlBaseIcms");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "vlBaseIcms"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlDifAliq");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "vlDifAliq"));
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
