/**
 * MultOrgAuthentication.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos;

public class MultOrgAuthentication  implements java.io.Serializable {
    private java.lang.String codigoMultOrg;

    private java.lang.String hashMultOrg;

    public MultOrgAuthentication() {
    }

    public MultOrgAuthentication(
           java.lang.String codigoMultOrg,
           java.lang.String hashMultOrg) {
           this.codigoMultOrg = codigoMultOrg;
           this.hashMultOrg = hashMultOrg;
    }


    /**
     * Gets the codigoMultOrg value for this MultOrgAuthentication.
     * 
     * @return codigoMultOrg
     */
    public java.lang.String getCodigoMultOrg() {
        return codigoMultOrg;
    }


    /**
     * Sets the codigoMultOrg value for this MultOrgAuthentication.
     * 
     * @param codigoMultOrg
     */
    public void setCodigoMultOrg(java.lang.String codigoMultOrg) {
        this.codigoMultOrg = codigoMultOrg;
    }


    /**
     * Gets the hashMultOrg value for this MultOrgAuthentication.
     * 
     * @return hashMultOrg
     */
    public java.lang.String getHashMultOrg() {
        return hashMultOrg;
    }


    /**
     * Sets the hashMultOrg value for this MultOrgAuthentication.
     * 
     * @param hashMultOrg
     */
    public void setHashMultOrg(java.lang.String hashMultOrg) {
        this.hashMultOrg = hashMultOrg;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MultOrgAuthentication)) return false;
        MultOrgAuthentication other = (MultOrgAuthentication) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codigoMultOrg==null && other.getCodigoMultOrg()==null) || 
             (this.codigoMultOrg!=null &&
              this.codigoMultOrg.equals(other.getCodigoMultOrg()))) &&
            ((this.hashMultOrg==null && other.getHashMultOrg()==null) || 
             (this.hashMultOrg!=null &&
              this.hashMultOrg.equals(other.getHashMultOrg())));
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
        if (getCodigoMultOrg() != null) {
            _hashCode += getCodigoMultOrg().hashCode();
        }
        if (getHashMultOrg() != null) {
            _hashCode += getHashMultOrg().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MultOrgAuthentication.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "multOrgAuthentication"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoMultOrg");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "codigoMultOrg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hashMultOrg");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "hashMultOrg"));
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
