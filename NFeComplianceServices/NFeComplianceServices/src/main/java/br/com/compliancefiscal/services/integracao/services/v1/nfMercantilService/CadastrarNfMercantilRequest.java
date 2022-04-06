/**
 * CadastrarNfMercantilRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.compliancefiscal.services.integracao.services.v1.nfMercantilService;

public class CadastrarNfMercantilRequest  implements java.io.Serializable {
    private br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.NfSe[] nfMercantis;

    private br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.MultOrgAuthentication multOrgAuthentication;

    public CadastrarNfMercantilRequest() {
    }

    public CadastrarNfMercantilRequest(
           br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.NfSe[] nfMercantis,
           br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.MultOrgAuthentication multOrgAuthentication) {
           this.nfMercantis = nfMercantis;
           this.multOrgAuthentication = multOrgAuthentication;
    }


    /**
     * Gets the nfMercantis value for this CadastrarNfMercantilRequest.
     * 
     * @return nfMercantis
     */
    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.NfSe[] getNfMercantis() {
        return nfMercantis;
    }


    /**
     * Sets the nfMercantis value for this CadastrarNfMercantilRequest.
     * 
     * @param nfMercantis
     */
    public void setNfMercantis(br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.NfSe[] nfMercantis) {
        this.nfMercantis = nfMercantis;
    }

    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.NfSe getNfMercantis(int i) {
        return this.nfMercantis[i];
    }

    public void setNfMercantis(int i, br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.NfSe _value) {
        this.nfMercantis[i] = _value;
    }


    /**
     * Gets the multOrgAuthentication value for this CadastrarNfMercantilRequest.
     * 
     * @return multOrgAuthentication
     */
    public br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.MultOrgAuthentication getMultOrgAuthentication() {
        return multOrgAuthentication;
    }


    /**
     * Sets the multOrgAuthentication value for this CadastrarNfMercantilRequest.
     * 
     * @param multOrgAuthentication
     */
    public void setMultOrgAuthentication(br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.MultOrgAuthentication multOrgAuthentication) {
        this.multOrgAuthentication = multOrgAuthentication;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CadastrarNfMercantilRequest)) return false;
        CadastrarNfMercantilRequest other = (CadastrarNfMercantilRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nfMercantis==null && other.getNfMercantis()==null) || 
             (this.nfMercantis!=null &&
              java.util.Arrays.equals(this.nfMercantis, other.getNfMercantis()))) &&
            ((this.multOrgAuthentication==null && other.getMultOrgAuthentication()==null) || 
             (this.multOrgAuthentication!=null &&
              this.multOrgAuthentication.equals(other.getMultOrgAuthentication())));
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
        if (getNfMercantis() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNfMercantis());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNfMercantis(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMultOrgAuthentication() != null) {
            _hashCode += getMultOrgAuthentication().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CadastrarNfMercantilRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.compliancefiscal.com.br/integracao/services/v1/nfMercantilService", ">cadastrarNfMercantilRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nfMercantis");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nfMercantis"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "nfMercantil"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("multOrgAuthentication");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MultOrgAuthentication"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "multOrgAuthentication"));
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
