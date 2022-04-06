/**
 * CadastrarInfoComplDocRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.compliancefiscal.services.integracao.services.v1.infoComplDocService;

public class CadastrarInfoComplDocRequest  implements java.io.Serializable {
    private br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.inforComplDocumentosFiscais.InforComplDocumentosFiscais[] infosCompl;

    private br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.MultOrgAuthentication multOrgAuthentication;

    public CadastrarInfoComplDocRequest() {
    }

    public CadastrarInfoComplDocRequest(
           br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.inforComplDocumentosFiscais.InforComplDocumentosFiscais[] infosCompl,
           br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.MultOrgAuthentication multOrgAuthentication) {
           this.infosCompl = infosCompl;
           this.multOrgAuthentication = multOrgAuthentication;
    }


    /**
     * Gets the infosCompl value for this CadastrarInfoComplDocRequest.
     * 
     * @return infosCompl
     */
    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.inforComplDocumentosFiscais.InforComplDocumentosFiscais[] getInfosCompl() {
        return infosCompl;
    }


    /**
     * Sets the infosCompl value for this CadastrarInfoComplDocRequest.
     * 
     * @param infosCompl
     */
    public void setInfosCompl(br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.inforComplDocumentosFiscais.InforComplDocumentosFiscais[] infosCompl) {
        this.infosCompl = infosCompl;
    }

    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.inforComplDocumentosFiscais.InforComplDocumentosFiscais getInfosCompl(int i) {
        return this.infosCompl[i];
    }

    public void setInfosCompl(int i, br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.inforComplDocumentosFiscais.InforComplDocumentosFiscais _value) {
        this.infosCompl[i] = _value;
    }


    /**
     * Gets the multOrgAuthentication value for this CadastrarInfoComplDocRequest.
     * 
     * @return multOrgAuthentication
     */
    public br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.MultOrgAuthentication getMultOrgAuthentication() {
        return multOrgAuthentication;
    }


    /**
     * Sets the multOrgAuthentication value for this CadastrarInfoComplDocRequest.
     * 
     * @param multOrgAuthentication
     */
    public void setMultOrgAuthentication(br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.MultOrgAuthentication multOrgAuthentication) {
        this.multOrgAuthentication = multOrgAuthentication;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CadastrarInfoComplDocRequest)) return false;
        CadastrarInfoComplDocRequest other = (CadastrarInfoComplDocRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.infosCompl==null && other.getInfosCompl()==null) || 
             (this.infosCompl!=null &&
              java.util.Arrays.equals(this.infosCompl, other.getInfosCompl()))) &&
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
        if (getInfosCompl() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInfosCompl());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInfosCompl(), i);
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
        new org.apache.axis.description.TypeDesc(CadastrarInfoComplDocRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.compliancefiscal.com.br/integracao/services/v1/infoComplDocService", ">cadastrarInfoComplDocRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("infosCompl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "infosCompl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/inforComplDocumentosFiscais", "inforComplDocumentosFiscais"));
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
