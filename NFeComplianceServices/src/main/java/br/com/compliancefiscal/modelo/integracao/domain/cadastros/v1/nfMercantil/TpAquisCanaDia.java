/**
 * TpAquisCanaDia.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil;

public class TpAquisCanaDia  implements java.io.Serializable {
    private java.math.BigInteger dia;

    private java.math.BigDecimal qtde;

    public TpAquisCanaDia() {
    }

    public TpAquisCanaDia(
           java.math.BigInteger dia,
           java.math.BigDecimal qtde) {
           this.dia = dia;
           this.qtde = qtde;
    }


    /**
     * Gets the dia value for this TpAquisCanaDia.
     * 
     * @return dia
     */
    public java.math.BigInteger getDia() {
        return dia;
    }


    /**
     * Sets the dia value for this TpAquisCanaDia.
     * 
     * @param dia
     */
    public void setDia(java.math.BigInteger dia) {
        this.dia = dia;
    }


    /**
     * Gets the qtde value for this TpAquisCanaDia.
     * 
     * @return qtde
     */
    public java.math.BigDecimal getQtde() {
        return qtde;
    }


    /**
     * Sets the qtde value for this TpAquisCanaDia.
     * 
     * @param qtde
     */
    public void setQtde(java.math.BigDecimal qtde) {
        this.qtde = qtde;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TpAquisCanaDia)) return false;
        TpAquisCanaDia other = (TpAquisCanaDia) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dia==null && other.getDia()==null) || 
             (this.dia!=null &&
              this.dia.equals(other.getDia()))) &&
            ((this.qtde==null && other.getQtde()==null) || 
             (this.qtde!=null &&
              this.qtde.equals(other.getQtde())));
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
        if (getDia() != null) {
            _hashCode += getDia().hashCode();
        }
        if (getQtde() != null) {
            _hashCode += getQtde().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TpAquisCanaDia.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "tpAquisCanaDia"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dia");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "dia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qtde");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "qtde"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTenPrec"));
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
