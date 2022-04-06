/**
 * TpConversaoUnidade.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.item;

public class TpConversaoUnidade  implements java.io.Serializable {
    private java.math.BigDecimal fatorConversaoUnidade;

    private java.lang.String siglaConversaoUnidade;

    public TpConversaoUnidade() {
    }

    public TpConversaoUnidade(
           java.math.BigDecimal fatorConversaoUnidade,
           java.lang.String siglaConversaoUnidade) {
           this.fatorConversaoUnidade = fatorConversaoUnidade;
           this.siglaConversaoUnidade = siglaConversaoUnidade;
    }


    /**
     * Gets the fatorConversaoUnidade value for this TpConversaoUnidade.
     * 
     * @return fatorConversaoUnidade
     */
    public java.math.BigDecimal getFatorConversaoUnidade() {
        return fatorConversaoUnidade;
    }


    /**
     * Sets the fatorConversaoUnidade value for this TpConversaoUnidade.
     * 
     * @param fatorConversaoUnidade
     */
    public void setFatorConversaoUnidade(java.math.BigDecimal fatorConversaoUnidade) {
        this.fatorConversaoUnidade = fatorConversaoUnidade;
    }


    /**
     * Gets the siglaConversaoUnidade value for this TpConversaoUnidade.
     * 
     * @return siglaConversaoUnidade
     */
    public java.lang.String getSiglaConversaoUnidade() {
        return siglaConversaoUnidade;
    }


    /**
     * Sets the siglaConversaoUnidade value for this TpConversaoUnidade.
     * 
     * @param siglaConversaoUnidade
     */
    public void setSiglaConversaoUnidade(java.lang.String siglaConversaoUnidade) {
        this.siglaConversaoUnidade = siglaConversaoUnidade;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TpConversaoUnidade)) return false;
        TpConversaoUnidade other = (TpConversaoUnidade) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fatorConversaoUnidade==null && other.getFatorConversaoUnidade()==null) || 
             (this.fatorConversaoUnidade!=null &&
              this.fatorConversaoUnidade.equals(other.getFatorConversaoUnidade()))) &&
            ((this.siglaConversaoUnidade==null && other.getSiglaConversaoUnidade()==null) || 
             (this.siglaConversaoUnidade!=null &&
              this.siglaConversaoUnidade.equals(other.getSiglaConversaoUnidade())));
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
        if (getFatorConversaoUnidade() != null) {
            _hashCode += getFatorConversaoUnidade().hashCode();
        }
        if (getSiglaConversaoUnidade() != null) {
            _hashCode += getSiglaConversaoUnidade().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TpConversaoUnidade.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/item", "tpConversaoUnidade"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fatorConversaoUnidade");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/item", "fatorConversaoUnidade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("siglaConversaoUnidade");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/item", "siglaConversaoUnidade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
