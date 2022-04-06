/**
 * CadastrarParticipanteResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.compliancefiscal.services.integracao.services.v1.participanteService;

public class CadastrarParticipanteResponse  implements java.io.Serializable {
    private br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.LoteIntWSResponse loteWsResponse;

    public CadastrarParticipanteResponse() {
    }

    public CadastrarParticipanteResponse(
           br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.LoteIntWSResponse loteWsResponse) {
           this.loteWsResponse = loteWsResponse;
    }


    /**
     * Gets the loteWsResponse value for this CadastrarParticipanteResponse.
     * 
     * @return loteWsResponse
     */
    public br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.LoteIntWSResponse getLoteWsResponse() {
        return loteWsResponse;
    }


    /**
     * Sets the loteWsResponse value for this CadastrarParticipanteResponse.
     * 
     * @param loteWsResponse
     */
    public void setLoteWsResponse(br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.LoteIntWSResponse loteWsResponse) {
        this.loteWsResponse = loteWsResponse;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CadastrarParticipanteResponse)) return false;
        CadastrarParticipanteResponse other = (CadastrarParticipanteResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.loteWsResponse==null && other.getLoteWsResponse()==null) || 
             (this.loteWsResponse!=null &&
              this.loteWsResponse.equals(other.getLoteWsResponse())));
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
        if (getLoteWsResponse() != null) {
            _hashCode += getLoteWsResponse().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CadastrarParticipanteResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.compliancefiscal.com.br/integracao/services/v1/participanteService", ">cadastrarParticipanteResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loteWsResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("", "loteWsResponse"));
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
