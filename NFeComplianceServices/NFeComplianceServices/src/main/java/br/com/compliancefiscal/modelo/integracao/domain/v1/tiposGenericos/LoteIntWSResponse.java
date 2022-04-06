/**
 * LoteIntWSResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos;

public class LoteIntWSResponse  implements java.io.Serializable {
    private org.apache.axis.types.NonNegativeInteger numeroProtocoloLote;

    private java.util.Calendar dataHoraRecebimentoLote;

    public LoteIntWSResponse() {
    }

    public LoteIntWSResponse(
           org.apache.axis.types.NonNegativeInteger numeroProtocoloLote,
           java.util.Calendar dataHoraRecebimentoLote) {
           this.numeroProtocoloLote = numeroProtocoloLote;
           this.dataHoraRecebimentoLote = dataHoraRecebimentoLote;
    }


    /**
     * Gets the numeroProtocoloLote value for this LoteIntWSResponse.
     * 
     * @return numeroProtocoloLote
     */
    public org.apache.axis.types.NonNegativeInteger getNumeroProtocoloLote() {
        return numeroProtocoloLote;
    }


    /**
     * Sets the numeroProtocoloLote value for this LoteIntWSResponse.
     * 
     * @param numeroProtocoloLote
     */
    public void setNumeroProtocoloLote(org.apache.axis.types.NonNegativeInteger numeroProtocoloLote) {
        this.numeroProtocoloLote = numeroProtocoloLote;
    }


    /**
     * Gets the dataHoraRecebimentoLote value for this LoteIntWSResponse.
     * 
     * @return dataHoraRecebimentoLote
     */
    public java.util.Calendar getDataHoraRecebimentoLote() {
        return dataHoraRecebimentoLote;
    }


    /**
     * Sets the dataHoraRecebimentoLote value for this LoteIntWSResponse.
     * 
     * @param dataHoraRecebimentoLote
     */
    public void setDataHoraRecebimentoLote(java.util.Calendar dataHoraRecebimentoLote) {
        this.dataHoraRecebimentoLote = dataHoraRecebimentoLote;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LoteIntWSResponse)) return false;
        LoteIntWSResponse other = (LoteIntWSResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.numeroProtocoloLote==null && other.getNumeroProtocoloLote()==null) || 
             (this.numeroProtocoloLote!=null &&
              this.numeroProtocoloLote.equals(other.getNumeroProtocoloLote()))) &&
            ((this.dataHoraRecebimentoLote==null && other.getDataHoraRecebimentoLote()==null) || 
             (this.dataHoraRecebimentoLote!=null &&
              this.dataHoraRecebimentoLote.equals(other.getDataHoraRecebimentoLote())));
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
        if (getNumeroProtocoloLote() != null) {
            _hashCode += getNumeroProtocoloLote().hashCode();
        }
        if (getDataHoraRecebimentoLote() != null) {
            _hashCode += getDataHoraRecebimentoLote().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LoteIntWSResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "loteIntWSResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroProtocoloLote");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "numeroProtocoloLote"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataHoraRecebimentoLote");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "dataHoraRecebimentoLote"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
