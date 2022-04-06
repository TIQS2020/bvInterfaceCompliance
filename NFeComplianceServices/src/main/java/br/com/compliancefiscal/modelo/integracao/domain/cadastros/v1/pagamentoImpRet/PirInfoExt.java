/**
 * PirInfoExt.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.pagamentoImpRet;

public class PirInfoExt  implements java.io.Serializable {
    private java.math.BigDecimal codTpRendBenefExt;

    private java.lang.String codFormTribBenfExt;

    public PirInfoExt() {
    }

    public PirInfoExt(
           java.math.BigDecimal codTpRendBenefExt,
           java.lang.String codFormTribBenfExt) {
           this.codTpRendBenefExt = codTpRendBenefExt;
           this.codFormTribBenfExt = codFormTribBenfExt;
    }


    /**
     * Gets the codTpRendBenefExt value for this PirInfoExt.
     * 
     * @return codTpRendBenefExt
     */
    public java.math.BigDecimal getCodTpRendBenefExt() {
        return codTpRendBenefExt;
    }


    /**
     * Sets the codTpRendBenefExt value for this PirInfoExt.
     * 
     * @param codTpRendBenefExt
     */
    public void setCodTpRendBenefExt(java.math.BigDecimal codTpRendBenefExt) {
        this.codTpRendBenefExt = codTpRendBenefExt;
    }


    /**
     * Gets the codFormTribBenfExt value for this PirInfoExt.
     * 
     * @return codFormTribBenfExt
     */
    public java.lang.String getCodFormTribBenfExt() {
        return codFormTribBenfExt;
    }


    /**
     * Sets the codFormTribBenfExt value for this PirInfoExt.
     * 
     * @param codFormTribBenfExt
     */
    public void setCodFormTribBenfExt(java.lang.String codFormTribBenfExt) {
        this.codFormTribBenfExt = codFormTribBenfExt;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PirInfoExt)) return false;
        PirInfoExt other = (PirInfoExt) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codTpRendBenefExt==null && other.getCodTpRendBenefExt()==null) || 
             (this.codTpRendBenefExt!=null &&
              this.codTpRendBenefExt.equals(other.getCodTpRendBenefExt()))) &&
            ((this.codFormTribBenfExt==null && other.getCodFormTribBenfExt()==null) || 
             (this.codFormTribBenfExt!=null &&
              this.codFormTribBenfExt.equals(other.getCodFormTribBenfExt())));
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
        if (getCodTpRendBenefExt() != null) {
            _hashCode += getCodTpRendBenefExt().hashCode();
        }
        if (getCodFormTribBenfExt() != null) {
            _hashCode += getCodFormTribBenfExt().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PirInfoExt.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/pagamentoImpRet", "pirInfoExt"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codTpRendBenefExt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/pagamentoImpRet", "codTpRendBenefExt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codFormTribBenfExt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/pagamentoImpRet", "codFormTribBenfExt"));
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
