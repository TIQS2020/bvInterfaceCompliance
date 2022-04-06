/**
 * CadastrarBlocoKRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.compliancefiscal.services.integracao.services.v1.blocoKService;

public class CadastrarBlocoKRequest  implements java.io.Serializable {
    private br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.perContrProdEstq.PerContrProdEstq[] blocosK;

    private br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.MultOrgAuthentication multOrgAuthentication;

    public CadastrarBlocoKRequest() {
    }

    public CadastrarBlocoKRequest(
           br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.perContrProdEstq.PerContrProdEstq[] blocosK,
           br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.MultOrgAuthentication multOrgAuthentication) {
           this.blocosK = blocosK;
           this.multOrgAuthentication = multOrgAuthentication;
    }


    /**
     * Gets the blocosK value for this CadastrarBlocoKRequest.
     * 
     * @return blocosK
     */
    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.perContrProdEstq.PerContrProdEstq[] getBlocosK() {
        return blocosK;
    }


    /**
     * Sets the blocosK value for this CadastrarBlocoKRequest.
     * 
     * @param blocosK
     */
    public void setBlocosK(br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.perContrProdEstq.PerContrProdEstq[] blocosK) {
        this.blocosK = blocosK;
    }

    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.perContrProdEstq.PerContrProdEstq getBlocosK(int i) {
        return this.blocosK[i];
    }

    public void setBlocosK(int i, br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.perContrProdEstq.PerContrProdEstq _value) {
        this.blocosK[i] = _value;
    }


    /**
     * Gets the multOrgAuthentication value for this CadastrarBlocoKRequest.
     * 
     * @return multOrgAuthentication
     */
    public br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.MultOrgAuthentication getMultOrgAuthentication() {
        return multOrgAuthentication;
    }


    /**
     * Sets the multOrgAuthentication value for this CadastrarBlocoKRequest.
     * 
     * @param multOrgAuthentication
     */
    public void setMultOrgAuthentication(br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.MultOrgAuthentication multOrgAuthentication) {
        this.multOrgAuthentication = multOrgAuthentication;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CadastrarBlocoKRequest)) return false;
        CadastrarBlocoKRequest other = (CadastrarBlocoKRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.blocosK==null && other.getBlocosK()==null) || 
             (this.blocosK!=null &&
              java.util.Arrays.equals(this.blocosK, other.getBlocosK()))) &&
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
        if (getBlocosK() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBlocosK());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBlocosK(), i);
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
        new org.apache.axis.description.TypeDesc(CadastrarBlocoKRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.compliancefiscal.com.br/integracao/services/v1/blocoKService", ">cadastrarBlocoKRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blocosK");
        elemField.setXmlName(new javax.xml.namespace.QName("", "blocosK"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/perContrProdEstq", "perContrProdEstq"));
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
