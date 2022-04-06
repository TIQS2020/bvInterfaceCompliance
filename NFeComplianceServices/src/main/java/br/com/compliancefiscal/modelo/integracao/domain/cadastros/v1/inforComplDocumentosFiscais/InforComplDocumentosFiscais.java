/**
 * InforComplDocumentosFiscais.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.inforComplDocumentosFiscais;

public class InforComplDocumentosFiscais  implements java.io.Serializable {
    private java.lang.String codigoInformacao;

    private java.lang.String textoInformacaoComplementar;

    public InforComplDocumentosFiscais() {
    }

    public InforComplDocumentosFiscais(
           java.lang.String codigoInformacao,
           java.lang.String textoInformacaoComplementar) {
           this.codigoInformacao = codigoInformacao;
           this.textoInformacaoComplementar = textoInformacaoComplementar;
    }


    /**
     * Gets the codigoInformacao value for this InforComplDocumentosFiscais.
     * 
     * @return codigoInformacao
     */
    public java.lang.String getCodigoInformacao() {
        return codigoInformacao;
    }


    /**
     * Sets the codigoInformacao value for this InforComplDocumentosFiscais.
     * 
     * @param codigoInformacao
     */
    public void setCodigoInformacao(java.lang.String codigoInformacao) {
        this.codigoInformacao = codigoInformacao;
    }


    /**
     * Gets the textoInformacaoComplementar value for this InforComplDocumentosFiscais.
     * 
     * @return textoInformacaoComplementar
     */
    public java.lang.String getTextoInformacaoComplementar() {
        return textoInformacaoComplementar;
    }


    /**
     * Sets the textoInformacaoComplementar value for this InforComplDocumentosFiscais.
     * 
     * @param textoInformacaoComplementar
     */
    public void setTextoInformacaoComplementar(java.lang.String textoInformacaoComplementar) {
        this.textoInformacaoComplementar = textoInformacaoComplementar;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InforComplDocumentosFiscais)) return false;
        InforComplDocumentosFiscais other = (InforComplDocumentosFiscais) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codigoInformacao==null && other.getCodigoInformacao()==null) || 
             (this.codigoInformacao!=null &&
              this.codigoInformacao.equals(other.getCodigoInformacao()))) &&
            ((this.textoInformacaoComplementar==null && other.getTextoInformacaoComplementar()==null) || 
             (this.textoInformacaoComplementar!=null &&
              this.textoInformacaoComplementar.equals(other.getTextoInformacaoComplementar())));
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
        if (getCodigoInformacao() != null) {
            _hashCode += getCodigoInformacao().hashCode();
        }
        if (getTextoInformacaoComplementar() != null) {
            _hashCode += getTextoInformacaoComplementar().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InforComplDocumentosFiscais.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/inforComplDocumentosFiscais", "inforComplDocumentosFiscais"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoInformacao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/inforComplDocumentosFiscais", "codigoInformacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("textoInformacaoComplementar");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/inforComplDocumentosFiscais", "textoInformacaoComplementar"));
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
