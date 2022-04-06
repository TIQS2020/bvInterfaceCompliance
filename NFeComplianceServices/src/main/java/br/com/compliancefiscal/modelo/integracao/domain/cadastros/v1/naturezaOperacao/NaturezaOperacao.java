/**
 * NaturezaOperacao.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.naturezaOperacao;

public class NaturezaOperacao  implements java.io.Serializable {
    private java.lang.String codigoNaturezaOperacao;

    private java.lang.String descricaoNaturezaOperacao;

    public NaturezaOperacao() {
    }

    public NaturezaOperacao(
           java.lang.String codigoNaturezaOperacao,
           java.lang.String descricaoNaturezaOperacao) {
           this.codigoNaturezaOperacao = codigoNaturezaOperacao;
           this.descricaoNaturezaOperacao = descricaoNaturezaOperacao;
    }


    /**
     * Gets the codigoNaturezaOperacao value for this NaturezaOperacao.
     * 
     * @return codigoNaturezaOperacao
     */
    public java.lang.String getCodigoNaturezaOperacao() {
        return codigoNaturezaOperacao;
    }


    /**
     * Sets the codigoNaturezaOperacao value for this NaturezaOperacao.
     * 
     * @param codigoNaturezaOperacao
     */
    public void setCodigoNaturezaOperacao(java.lang.String codigoNaturezaOperacao) {
        this.codigoNaturezaOperacao = codigoNaturezaOperacao;
    }


    /**
     * Gets the descricaoNaturezaOperacao value for this NaturezaOperacao.
     * 
     * @return descricaoNaturezaOperacao
     */
    public java.lang.String getDescricaoNaturezaOperacao() {
        return descricaoNaturezaOperacao;
    }


    /**
     * Sets the descricaoNaturezaOperacao value for this NaturezaOperacao.
     * 
     * @param descricaoNaturezaOperacao
     */
    public void setDescricaoNaturezaOperacao(java.lang.String descricaoNaturezaOperacao) {
        this.descricaoNaturezaOperacao = descricaoNaturezaOperacao;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NaturezaOperacao)) return false;
        NaturezaOperacao other = (NaturezaOperacao) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codigoNaturezaOperacao==null && other.getCodigoNaturezaOperacao()==null) || 
             (this.codigoNaturezaOperacao!=null &&
              this.codigoNaturezaOperacao.equals(other.getCodigoNaturezaOperacao()))) &&
            ((this.descricaoNaturezaOperacao==null && other.getDescricaoNaturezaOperacao()==null) || 
             (this.descricaoNaturezaOperacao!=null &&
              this.descricaoNaturezaOperacao.equals(other.getDescricaoNaturezaOperacao())));
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
        if (getCodigoNaturezaOperacao() != null) {
            _hashCode += getCodigoNaturezaOperacao().hashCode();
        }
        if (getDescricaoNaturezaOperacao() != null) {
            _hashCode += getDescricaoNaturezaOperacao().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NaturezaOperacao.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/naturezaOperacao", "naturezaOperacao"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoNaturezaOperacao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/naturezaOperacao", "codigoNaturezaOperacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descricaoNaturezaOperacao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/naturezaOperacao", "descricaoNaturezaOperacao"));
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
