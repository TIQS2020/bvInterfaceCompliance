/**
 * CadastrarInventarioRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.compliancefiscal.services.integracao.services.v1.inventarioService;

public class CadastrarInventarioRequest  implements java.io.Serializable {
    private br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.inventario.Inventario[] inventarios;

    private br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.MultOrgAuthentication multOrgAuthentication;

    public CadastrarInventarioRequest() {
    }

    public CadastrarInventarioRequest(
           br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.inventario.Inventario[] inventarios,
           br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.MultOrgAuthentication multOrgAuthentication) {
           this.inventarios = inventarios;
           this.multOrgAuthentication = multOrgAuthentication;
    }


    /**
     * Gets the inventarios value for this CadastrarInventarioRequest.
     * 
     * @return inventarios
     */
    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.inventario.Inventario[] getInventarios() {
        return inventarios;
    }


    /**
     * Sets the inventarios value for this CadastrarInventarioRequest.
     * 
     * @param inventarios
     */
    public void setInventarios(br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.inventario.Inventario[] inventarios) {
        this.inventarios = inventarios;
    }

    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.inventario.Inventario getInventarios(int i) {
        return this.inventarios[i];
    }

    public void setInventarios(int i, br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.inventario.Inventario _value) {
        this.inventarios[i] = _value;
    }


    /**
     * Gets the multOrgAuthentication value for this CadastrarInventarioRequest.
     * 
     * @return multOrgAuthentication
     */
    public br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.MultOrgAuthentication getMultOrgAuthentication() {
        return multOrgAuthentication;
    }


    /**
     * Sets the multOrgAuthentication value for this CadastrarInventarioRequest.
     * 
     * @param multOrgAuthentication
     */
    public void setMultOrgAuthentication(br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.MultOrgAuthentication multOrgAuthentication) {
        this.multOrgAuthentication = multOrgAuthentication;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CadastrarInventarioRequest)) return false;
        CadastrarInventarioRequest other = (CadastrarInventarioRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.inventarios==null && other.getInventarios()==null) || 
             (this.inventarios!=null &&
              java.util.Arrays.equals(this.inventarios, other.getInventarios()))) &&
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
        if (getInventarios() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInventarios());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInventarios(), i);
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
        new org.apache.axis.description.TypeDesc(CadastrarInventarioRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://services.compliancefiscal.com.br/integracao/services/v1/inventarioService", ">cadastrarInventarioRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inventarios");
        elemField.setXmlName(new javax.xml.namespace.QName("", "inventarios"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/inventario", "inventario"));
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
