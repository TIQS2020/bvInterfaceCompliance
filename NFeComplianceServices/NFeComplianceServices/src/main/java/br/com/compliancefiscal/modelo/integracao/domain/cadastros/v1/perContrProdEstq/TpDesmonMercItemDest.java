/**
 * TpDesmonMercItemDest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.perContrProdEstq;

public class TpDesmonMercItemDest  implements java.io.Serializable {
    private java.lang.String codItemDest;

    private java.math.BigDecimal qtdDes;

    public TpDesmonMercItemDest() {
    }

    public TpDesmonMercItemDest(
           java.lang.String codItemDest,
           java.math.BigDecimal qtdDes) {
           this.codItemDest = codItemDest;
           this.qtdDes = qtdDes;
    }


    /**
     * Gets the codItemDest value for this TpDesmonMercItemDest.
     * 
     * @return codItemDest
     */
    public java.lang.String getCodItemDest() {
        return codItemDest;
    }


    /**
     * Sets the codItemDest value for this TpDesmonMercItemDest.
     * 
     * @param codItemDest
     */
    public void setCodItemDest(java.lang.String codItemDest) {
        this.codItemDest = codItemDest;
    }


    /**
     * Gets the qtdDes value for this TpDesmonMercItemDest.
     * 
     * @return qtdDes
     */
    public java.math.BigDecimal getQtdDes() {
        return qtdDes;
    }


    /**
     * Sets the qtdDes value for this TpDesmonMercItemDest.
     * 
     * @param qtdDes
     */
    public void setQtdDes(java.math.BigDecimal qtdDes) {
        this.qtdDes = qtdDes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TpDesmonMercItemDest)) return false;
        TpDesmonMercItemDest other = (TpDesmonMercItemDest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codItemDest==null && other.getCodItemDest()==null) || 
             (this.codItemDest!=null &&
              this.codItemDest.equals(other.getCodItemDest()))) &&
            ((this.qtdDes==null && other.getQtdDes()==null) || 
             (this.qtdDes!=null &&
              this.qtdDes.equals(other.getQtdDes())));
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
        if (getCodItemDest() != null) {
            _hashCode += getCodItemDest().hashCode();
        }
        if (getQtdDes() != null) {
            _hashCode += getQtdDes().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TpDesmonMercItemDest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/perContrProdEstq", "tpDesmonMercItemDest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codItemDest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/perContrProdEstq", "codItemDest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qtdDes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/perContrProdEstq", "qtdDes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalThreePrec"));
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
