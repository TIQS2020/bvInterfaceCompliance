/**
 * EnviarNfMercCancelResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.compliancefiscal.services.integracao.services.v1.nfMercantilCancelamentoService;

public class EnviarNfMercCancelResponse  implements java.io.Serializable {
    private br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.LoteIntWSResponse loteWSResponse;

    public EnviarNfMercCancelResponse() {
    }

    public EnviarNfMercCancelResponse(
           br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.LoteIntWSResponse loteWSResponse) {
           this.loteWSResponse = loteWSResponse;
    }
 
    /**
     * Gets the loteWSResponse value for this EnviarNfMercCancelResponse.
     * 
     * @return loteWSResponse
     */
    public br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.LoteIntWSResponse getLoteWSResponse() {
        return loteWSResponse;
    }


    /**
     * Sets the loteWSResponse value for this EnviarNfMercCancelResponse.
     * 
     * @param loteWSResponse
     */
    public void setLoteWSResponse(br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.LoteIntWSResponse loteWSResponse) {
        this.loteWSResponse = loteWSResponse;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EnviarNfMercCancelResponse)) return false;
        EnviarNfMercCancelResponse other = (EnviarNfMercCancelResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.loteWSResponse==null && other.getLoteWSResponse()==null) || 
             (this.loteWSResponse!=null &&
              this.loteWSResponse.equals(other.getLoteWSResponse())));
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
        if (getLoteWSResponse() != null) {
            _hashCode += getLoteWSResponse().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EnviarNfMercCancelResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.compliancefiscal.com.br/integracao/services/v1/nfMercantilCancelamentoService", ">enviarNfMercCancelResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loteWSResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("", "loteWSResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "loteIntWSResponse"));
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
