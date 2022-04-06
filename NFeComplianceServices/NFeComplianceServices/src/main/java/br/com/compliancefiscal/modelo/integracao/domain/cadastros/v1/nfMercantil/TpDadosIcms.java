/**
 * TpDadosIcms.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil;

public class TpDadosIcms  implements java.io.Serializable {
    private java.math.BigDecimal vlIcmsDeson;

    private java.math.BigDecimal vlIcmsOper;

    private java.math.BigDecimal percDiferAliq;

    private java.math.BigDecimal vlIcmsDiferAliq;

    public TpDadosIcms() {
    }

    public TpDadosIcms(
           java.math.BigDecimal vlIcmsDeson,
           java.math.BigDecimal vlIcmsOper,
           java.math.BigDecimal percDiferAliq,
           java.math.BigDecimal vlIcmsDiferAliq) {
           this.vlIcmsDeson = vlIcmsDeson;
           this.vlIcmsOper = vlIcmsOper;
           this.percDiferAliq = percDiferAliq;
           this.vlIcmsDiferAliq = vlIcmsDiferAliq;
    }


    /**
     * Gets the vlIcmsDeson value for this TpDadosIcms.
     * 
     * @return vlIcmsDeson
     */
    public java.math.BigDecimal getVlIcmsDeson() {
        return vlIcmsDeson;
    }


    /**
     * Sets the vlIcmsDeson value for this TpDadosIcms.
     * 
     * @param vlIcmsDeson
     */
    public void setVlIcmsDeson(java.math.BigDecimal vlIcmsDeson) {
        this.vlIcmsDeson = vlIcmsDeson;
    }


    /**
     * Gets the vlIcmsOper value for this TpDadosIcms.
     * 
     * @return vlIcmsOper
     */
    public java.math.BigDecimal getVlIcmsOper() {
        return vlIcmsOper;
    }


    /**
     * Sets the vlIcmsOper value for this TpDadosIcms.
     * 
     * @param vlIcmsOper
     */
    public void setVlIcmsOper(java.math.BigDecimal vlIcmsOper) {
        this.vlIcmsOper = vlIcmsOper;
    }


    /**
     * Gets the percDiferAliq value for this TpDadosIcms.
     * 
     * @return percDiferAliq
     */
    public java.math.BigDecimal getPercDiferAliq() {
        return percDiferAliq;
    }


    /**
     * Sets the percDiferAliq value for this TpDadosIcms.
     * 
     * @param percDiferAliq
     */
    public void setPercDiferAliq(java.math.BigDecimal percDiferAliq) {
        this.percDiferAliq = percDiferAliq;
    }


    /**
     * Gets the vlIcmsDiferAliq value for this TpDadosIcms.
     * 
     * @return vlIcmsDiferAliq
     */
    public java.math.BigDecimal getVlIcmsDiferAliq() {
        return vlIcmsDiferAliq;
    }


    /**
     * Sets the vlIcmsDiferAliq value for this TpDadosIcms.
     * 
     * @param vlIcmsDiferAliq
     */
    public void setVlIcmsDiferAliq(java.math.BigDecimal vlIcmsDiferAliq) {
        this.vlIcmsDiferAliq = vlIcmsDiferAliq;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TpDadosIcms)) return false;
        TpDadosIcms other = (TpDadosIcms) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.vlIcmsDeson==null && other.getVlIcmsDeson()==null) || 
             (this.vlIcmsDeson!=null &&
              this.vlIcmsDeson.equals(other.getVlIcmsDeson()))) &&
            ((this.vlIcmsOper==null && other.getVlIcmsOper()==null) || 
             (this.vlIcmsOper!=null &&
              this.vlIcmsOper.equals(other.getVlIcmsOper()))) &&
            ((this.percDiferAliq==null && other.getPercDiferAliq()==null) || 
             (this.percDiferAliq!=null &&
              this.percDiferAliq.equals(other.getPercDiferAliq()))) &&
            ((this.vlIcmsDiferAliq==null && other.getVlIcmsDiferAliq()==null) || 
             (this.vlIcmsDiferAliq!=null &&
              this.vlIcmsDiferAliq.equals(other.getVlIcmsDiferAliq())));
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
        if (getVlIcmsDeson() != null) {
            _hashCode += getVlIcmsDeson().hashCode();
        }
        if (getVlIcmsOper() != null) {
            _hashCode += getVlIcmsOper().hashCode();
        }
        if (getPercDiferAliq() != null) {
            _hashCode += getPercDiferAliq().hashCode();
        }
        if (getVlIcmsDiferAliq() != null) {
            _hashCode += getVlIcmsDiferAliq().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TpDadosIcms.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "tpDadosIcms"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlIcmsDeson");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "vlIcmsDeson"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlIcmsOper");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "vlIcmsOper"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("percDiferAliq");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "percDiferAliq"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalFourPrec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlIcmsDiferAliq");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "vlIcmsDiferAliq"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
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
