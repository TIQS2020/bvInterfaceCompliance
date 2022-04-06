/**
 * EmissaoPropNfMercantilRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.compliancefiscal.services.integracao.services.v1.nfMercantilEmissaoPropService;

public class EmissaoPropNfMercantilRequest  implements java.io.Serializable {
    private br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.NfSe[] emissaoNfMercantis;

    private br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.MultOrgAuthentication multOrgAuthentication;

    public EmissaoPropNfMercantilRequest() {
    }

    public EmissaoPropNfMercantilRequest(
           br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.NfSe[] emissaoNfMercantis,
           br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.MultOrgAuthentication multOrgAuthentication) {
           this.emissaoNfMercantis = emissaoNfMercantis;
           this.multOrgAuthentication = multOrgAuthentication;
    }


    /**
     * Gets the emissaoNfMercantis value for this EmissaoPropNfMercantilRequest.
     * 
     * @return emissaoNfMercantis
     */
    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.NfSe[] getEmissaoNfMercantis() {
        return emissaoNfMercantis;
    }


    /**
     * Sets the emissaoNfMercantis value for this EmissaoPropNfMercantilRequest.
     * 
     * @param emissaoNfMercantis
     */
    public void setEmissaoNfMercantis(br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.NfSe[] emissaoNfMercantis) {
        this.emissaoNfMercantis = emissaoNfMercantis;
    }

    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.NfSe getEmissaoNfMercantis(int i) {
        return this.emissaoNfMercantis[i];
    }

    public void setEmissaoNfMercantis(int i, br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.NfSe _value) {
        this.emissaoNfMercantis[i] = _value;
    }


    /**
     * Gets the multOrgAuthentication value for this EmissaoPropNfMercantilRequest.
     * 
     * @return multOrgAuthentication
     */
    public br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.MultOrgAuthentication getMultOrgAuthentication() {
        return multOrgAuthentication;
    }


    /**
     * Sets the multOrgAuthentication value for this EmissaoPropNfMercantilRequest.
     * 
     * @param multOrgAuthentication
     */
    public void setMultOrgAuthentication(br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.MultOrgAuthentication multOrgAuthentication) {
        this.multOrgAuthentication = multOrgAuthentication;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EmissaoPropNfMercantilRequest)) return false;
        EmissaoPropNfMercantilRequest other = (EmissaoPropNfMercantilRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.emissaoNfMercantis==null && other.getEmissaoNfMercantis()==null) || 
             (this.emissaoNfMercantis!=null &&
              java.util.Arrays.equals(this.emissaoNfMercantis, other.getEmissaoNfMercantis()))) &&
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
        if (getEmissaoNfMercantis() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEmissaoNfMercantis());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEmissaoNfMercantis(), i);
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
        new org.apache.axis.description.TypeDesc(EmissaoPropNfMercantilRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.compliancefiscal.com.br/integracao/services/v1/nfMercantilEmissaoPropService", ">emissaoPropNfMercantilRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emissaoNfMercantis");
        elemField.setXmlName(new javax.xml.namespace.QName("", "emissaoNfMercantis"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "nfMercantil"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("multOrgAuthentication");
        elemField.setXmlName(new javax.xml.namespace.QName("", "multOrgAuthentication"));
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
