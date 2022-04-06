/**
 * ConsultarLoteResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.compliancefiscal.services.integracao.services.v1.consultaGenericaService;

public class ConsultarLoteResponse  implements java.io.Serializable {
    private br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.consultaGenerica.ConsultaGenerica consultaGenerica;

    public ConsultarLoteResponse() {
    }

    public ConsultarLoteResponse(
           br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.consultaGenerica.ConsultaGenerica consultaGenerica) {
           this.consultaGenerica = consultaGenerica;
    }


    /**
     * Gets the consultaGenerica value for this ConsultarLoteResponse.
     * 
     * @return consultaGenerica
     */
    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.consultaGenerica.ConsultaGenerica getConsultaGenerica() {
        return consultaGenerica;
    }


    /**
     * Sets the consultaGenerica value for this ConsultarLoteResponse.
     * 
     * @param consultaGenerica
     */
    public void setConsultaGenerica(br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.consultaGenerica.ConsultaGenerica consultaGenerica) {
        this.consultaGenerica = consultaGenerica;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConsultarLoteResponse)) return false;
        ConsultarLoteResponse other = (ConsultarLoteResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.consultaGenerica==null && other.getConsultaGenerica()==null) || 
             (this.consultaGenerica!=null &&
              this.consultaGenerica.equals(other.getConsultaGenerica())));
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
        if (getConsultaGenerica() != null) {
            _hashCode += getConsultaGenerica().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConsultarLoteResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.compliancefiscal.com.br/integracao/services/v1/consultaGenericaService", ">consultarLoteResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consultaGenerica");
        elemField.setXmlName(new javax.xml.namespace.QName("", "consultaGenerica"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "consultaGenerica"));
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
