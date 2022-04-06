/**
 * TpProcRef.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServCont;

public class TpProcRef  implements java.io.Serializable {
    private java.lang.String numProc;

    private java.math.BigInteger origemProcesso;

    public TpProcRef() {
    }

    public TpProcRef(
           java.lang.String numProc,
           java.math.BigInteger origemProcesso) {
           this.numProc = numProc;
           this.origemProcesso = origemProcesso;
    }


    /**
     * Gets the numProc value for this TpProcRef.
     * 
     * @return numProc
     */
    public java.lang.String getNumProc() {
        return numProc;
    }


    /**
     * Sets the numProc value for this TpProcRef.
     * 
     * @param numProc
     */
    public void setNumProc(java.lang.String numProc) {
        this.numProc = numProc;
    }


    /**
     * Gets the origemProcesso value for this TpProcRef.
     * 
     * @return origemProcesso
     */
    public java.math.BigInteger getOrigemProcesso() {
        return origemProcesso;
    }


    /**
     * Sets the origemProcesso value for this TpProcRef.
     * 
     * @param origemProcesso
     */
    public void setOrigemProcesso(java.math.BigInteger origemProcesso) {
        this.origemProcesso = origemProcesso;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TpProcRef)) return false;
        TpProcRef other = (TpProcRef) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.numProc==null && other.getNumProc()==null) || 
             (this.numProc!=null &&
              this.numProc.equals(other.getNumProc()))) &&
            ((this.origemProcesso==null && other.getOrigemProcesso()==null) || 
             (this.origemProcesso!=null &&
              this.origemProcesso.equals(other.getOrigemProcesso())));
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
        if (getNumProc() != null) {
            _hashCode += getNumProc().hashCode();
        }
        if (getOrigemProcesso() != null) {
            _hashCode += getOrigemProcesso().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TpProcRef.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServCont", "tpProcRef"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numProc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServCont", "numProc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("origemProcesso");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServCont", "origemProcesso"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
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
