/**
 * CadastrarInfoComplDocResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.compliancefiscal.services.integracao.services.v1.infoComplDocService;

public class CadastrarInfoComplDocResponse  implements java.io.Serializable {
    private br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.LoteIntWSResponse loteIntWsResponse;

    public CadastrarInfoComplDocResponse() {
    }

    public CadastrarInfoComplDocResponse(
           br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.LoteIntWSResponse loteIntWsResponse) {
           this.loteIntWsResponse = loteIntWsResponse;
    }


    /**
     * Gets the loteIntWsResponse value for this CadastrarInfoComplDocResponse.
     * 
     * @return loteIntWsResponse
     */
    public br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.LoteIntWSResponse getLoteIntWsResponse() {
        return loteIntWsResponse;
    }


    /**
     * Sets the loteIntWsResponse value for this CadastrarInfoComplDocResponse.
     * 
     * @param loteIntWsResponse
     */
    public void setLoteIntWsResponse(br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.LoteIntWSResponse loteIntWsResponse) {
        this.loteIntWsResponse = loteIntWsResponse;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CadastrarInfoComplDocResponse)) return false;
        CadastrarInfoComplDocResponse other = (CadastrarInfoComplDocResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.loteIntWsResponse==null && other.getLoteIntWsResponse()==null) || 
             (this.loteIntWsResponse!=null &&
              this.loteIntWsResponse.equals(other.getLoteIntWsResponse())));
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
        if (getLoteIntWsResponse() != null) {
            _hashCode += getLoteIntWsResponse().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CadastrarInfoComplDocResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.compliancefiscal.com.br/integracao/services/v1/infoComplDocService", ">cadastrarInfoComplDocResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loteIntWsResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("", "loteIntWsResponse"));
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
