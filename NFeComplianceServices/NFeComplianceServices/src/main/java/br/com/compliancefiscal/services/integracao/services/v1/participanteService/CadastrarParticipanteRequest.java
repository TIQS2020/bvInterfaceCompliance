/**
 * CadastrarParticipanteRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.compliancefiscal.services.integracao.services.v1.participanteService;

public class CadastrarParticipanteRequest  implements java.io.Serializable {
    private br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.participante.Participante[] participantes;

    private br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.MultOrgAuthentication multOrgAuthentication;

    public CadastrarParticipanteRequest() {
    }

    public CadastrarParticipanteRequest(
           br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.participante.Participante[] participantes,
           br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.MultOrgAuthentication multOrgAuthentication) {
           this.participantes = participantes;
           this.multOrgAuthentication = multOrgAuthentication;
    }


    /**
     * Gets the participantes value for this CadastrarParticipanteRequest.
     * 
     * @return participantes
     */
    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.participante.Participante[] getParticipantes() {
        return participantes;
    }


    /**
     * Sets the participantes value for this CadastrarParticipanteRequest.
     * 
     * @param participantes
     */
    public void setParticipantes(br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.participante.Participante[] participantes) {
        this.participantes = participantes;
    }

    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.participante.Participante getParticipantes(int i) {
        return this.participantes[i];
    }

    public void setParticipantes(int i, br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.participante.Participante _value) {
        this.participantes[i] = _value;
    }


    /**
     * Gets the multOrgAuthentication value for this CadastrarParticipanteRequest.
     * 
     * @return multOrgAuthentication
     */
    public br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.MultOrgAuthentication getMultOrgAuthentication() {
        return multOrgAuthentication;
    }


    /**
     * Sets the multOrgAuthentication value for this CadastrarParticipanteRequest.
     * 
     * @param multOrgAuthentication
     */
    public void setMultOrgAuthentication(br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.MultOrgAuthentication multOrgAuthentication) {
        this.multOrgAuthentication = multOrgAuthentication;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CadastrarParticipanteRequest)) return false;
        CadastrarParticipanteRequest other = (CadastrarParticipanteRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.participantes==null && other.getParticipantes()==null) || 
             (this.participantes!=null &&
              java.util.Arrays.equals(this.participantes, other.getParticipantes()))) &&
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
        if (getParticipantes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getParticipantes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getParticipantes(), i);
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
        new org.apache.axis.description.TypeDesc(CadastrarParticipanteRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.compliancefiscal.com.br/integracao/services/v1/participanteService", ">cadastrarParticipanteRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("participantes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "participantes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/participante", "participante"));
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
