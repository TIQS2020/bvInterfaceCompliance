/**
 * InutilizarNfMercantilRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.compliancefiscal.services.integracao.services.v1.nfMercantilInutilizacaoService;

public class InutilizarNfMercantilRequest  implements java.io.Serializable {
    private br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfInutMercantil.NfInutMercantil[] inutsNfs;

    private br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.MultOrgAuthentication multOrgAuthentication;

    public InutilizarNfMercantilRequest() {
    }

    public InutilizarNfMercantilRequest(
           br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfInutMercantil.NfInutMercantil[] inutsNfs,
           br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.MultOrgAuthentication multOrgAuthentication) {
           this.inutsNfs = inutsNfs;
           this.multOrgAuthentication = multOrgAuthentication;
    }


    /**
     * Gets the inutsNfs value for this InutilizarNfMercantilRequest.
     * 
     * @return inutsNfs
     */
    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfInutMercantil.NfInutMercantil[] getInutsNfs() {
        return inutsNfs;
    }


    /**
     * Sets the inutsNfs value for this InutilizarNfMercantilRequest.
     * 
     * @param inutsNfs
     */
    public void setInutsNfs(br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfInutMercantil.NfInutMercantil[] inutsNfs) {
        this.inutsNfs = inutsNfs;
    }

    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfInutMercantil.NfInutMercantil getInutsNfs(int i) {
        return this.inutsNfs[i];
    }

    public void setInutsNfs(int i, br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfInutMercantil.NfInutMercantil _value) {
        this.inutsNfs[i] = _value;
    }


    /**
     * Gets the multOrgAuthentication value for this InutilizarNfMercantilRequest.
     * 
     * @return multOrgAuthentication
     */
    public br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.MultOrgAuthentication getMultOrgAuthentication() {
        return multOrgAuthentication;
    }


    /**
     * Sets the multOrgAuthentication value for this InutilizarNfMercantilRequest.
     * 
     * @param multOrgAuthentication
     */
    public void setMultOrgAuthentication(br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.MultOrgAuthentication multOrgAuthentication) {
        this.multOrgAuthentication = multOrgAuthentication;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InutilizarNfMercantilRequest)) return false;
        InutilizarNfMercantilRequest other = (InutilizarNfMercantilRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.inutsNfs==null && other.getInutsNfs()==null) || 
             (this.inutsNfs!=null &&
              java.util.Arrays.equals(this.inutsNfs, other.getInutsNfs()))) &&
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
        if (getInutsNfs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInutsNfs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInutsNfs(), i);
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
        new org.apache.axis.description.TypeDesc(InutilizarNfMercantilRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.compliancefiscal.com.br/integracao/services/v1/nfMercantilInutilizacaoService", ">inutilizarNfMercantilRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inutsNfs");
        elemField.setXmlName(new javax.xml.namespace.QName("", "inutsNfs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfInutMercantil", "nfInutMercantil"));
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
