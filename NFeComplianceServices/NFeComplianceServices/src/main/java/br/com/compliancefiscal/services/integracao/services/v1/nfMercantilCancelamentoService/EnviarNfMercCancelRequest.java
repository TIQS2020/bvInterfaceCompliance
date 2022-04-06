/**
 * EnviarNfMercCancelRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.compliancefiscal.services.integracao.services.v1.nfMercantilCancelamentoService;

public class EnviarNfMercCancelRequest  implements java.io.Serializable {
    private br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfCancMercantil.NfCancMercantil[] nfCancs;

    private br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.MultOrgAuthentication multOrgAuthentication;

    public EnviarNfMercCancelRequest() {
    }

    public EnviarNfMercCancelRequest(
           br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfCancMercantil.NfCancMercantil[] nfCancs,
           br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.MultOrgAuthentication multOrgAuthentication) {
           this.nfCancs = nfCancs;
           this.multOrgAuthentication = multOrgAuthentication;
    }


    /**
     * Gets the nfCancs value for this EnviarNfMercCancelRequest.
     * 
     * @return nfCancs
     */
    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfCancMercantil.NfCancMercantil[] getNfCancs() {
        return nfCancs;
    }


    /**
     * Sets the nfCancs value for this EnviarNfMercCancelRequest.
     * 
     * @param nfCancs
     */
    public void setNfCancs(br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfCancMercantil.NfCancMercantil[] nfCancs) {
        this.nfCancs = nfCancs;
    }

    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfCancMercantil.NfCancMercantil getNfCancs(int i) {
        return this.nfCancs[i];
    }

    public void setNfCancs(int i, br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfCancMercantil.NfCancMercantil _value) {
        this.nfCancs[i] = _value;
    }


    /**
     * Gets the multOrgAuthentication value for this EnviarNfMercCancelRequest.
     * 
     * @return multOrgAuthentication
     */
    public br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.MultOrgAuthentication getMultOrgAuthentication() {
        return multOrgAuthentication;
    }


    /**
     * Sets the multOrgAuthentication value for this EnviarNfMercCancelRequest.
     * 
     * @param multOrgAuthentication
     */
    public void setMultOrgAuthentication(br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.MultOrgAuthentication multOrgAuthentication) {
        this.multOrgAuthentication = multOrgAuthentication;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EnviarNfMercCancelRequest)) return false;
        EnviarNfMercCancelRequest other = (EnviarNfMercCancelRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nfCancs==null && other.getNfCancs()==null) || 
             (this.nfCancs!=null &&
              java.util.Arrays.equals(this.nfCancs, other.getNfCancs()))) &&
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
        if (getNfCancs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNfCancs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNfCancs(), i);
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
        new org.apache.axis.description.TypeDesc(EnviarNfMercCancelRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.compliancefiscal.com.br/integracao/services/v1/nfMercantilCancelamentoService", ">enviarNfMercCancelRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nfCancs");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nfCancs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfCancMercantil", "nfCancMercantil"));
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
