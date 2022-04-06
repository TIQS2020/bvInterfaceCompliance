/**
 * PirCompJud.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.pagamentoImpRet;

public class PirCompJud  implements java.io.Serializable {
    private java.math.BigDecimal vlCompAnoCalend;

    private java.math.BigDecimal vlCompAnoAnt;

    public PirCompJud() {
    }

    public PirCompJud(
           java.math.BigDecimal vlCompAnoCalend,
           java.math.BigDecimal vlCompAnoAnt) {
           this.vlCompAnoCalend = vlCompAnoCalend;
           this.vlCompAnoAnt = vlCompAnoAnt;
    }


    /**
     * Gets the vlCompAnoCalend value for this PirCompJud.
     * 
     * @return vlCompAnoCalend
     */
    public java.math.BigDecimal getVlCompAnoCalend() {
        return vlCompAnoCalend;
    }


    /**
     * Sets the vlCompAnoCalend value for this PirCompJud.
     * 
     * @param vlCompAnoCalend
     */
    public void setVlCompAnoCalend(java.math.BigDecimal vlCompAnoCalend) {
        this.vlCompAnoCalend = vlCompAnoCalend;
    }


    /**
     * Gets the vlCompAnoAnt value for this PirCompJud.
     * 
     * @return vlCompAnoAnt
     */
    public java.math.BigDecimal getVlCompAnoAnt() {
        return vlCompAnoAnt;
    }


    /**
     * Sets the vlCompAnoAnt value for this PirCompJud.
     * 
     * @param vlCompAnoAnt
     */
    public void setVlCompAnoAnt(java.math.BigDecimal vlCompAnoAnt) {
        this.vlCompAnoAnt = vlCompAnoAnt;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PirCompJud)) return false;
        PirCompJud other = (PirCompJud) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.vlCompAnoCalend==null && other.getVlCompAnoCalend()==null) || 
             (this.vlCompAnoCalend!=null &&
              this.vlCompAnoCalend.equals(other.getVlCompAnoCalend()))) &&
            ((this.vlCompAnoAnt==null && other.getVlCompAnoAnt()==null) || 
             (this.vlCompAnoAnt!=null &&
              this.vlCompAnoAnt.equals(other.getVlCompAnoAnt())));
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
        if (getVlCompAnoCalend() != null) {
            _hashCode += getVlCompAnoCalend().hashCode();
        }
        if (getVlCompAnoAnt() != null) {
            _hashCode += getVlCompAnoAnt().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PirCompJud.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/pagamentoImpRet", "pirCompJud"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlCompAnoCalend");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/pagamentoImpRet", "vlCompAnoCalend"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlCompAnoAnt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/pagamentoImpRet", "vlCompAnoAnt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
