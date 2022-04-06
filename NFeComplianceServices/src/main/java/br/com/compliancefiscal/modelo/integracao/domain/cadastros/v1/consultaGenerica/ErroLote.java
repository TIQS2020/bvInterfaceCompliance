/**
 * ErroLote.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.consultaGenerica;

public class ErroLote  implements java.io.Serializable {
    private java.lang.String[] listaErroLote;

    public ErroLote() {
    }

    public ErroLote(
           java.lang.String[] listaErroLote) {
           this.listaErroLote = listaErroLote;
    }


    /**
     * Gets the listaErroLote value for this ErroLote.
     * 
     * @return listaErroLote
     */
    public java.lang.String[] getListaErroLote() {
        return listaErroLote;
    }


    /**
     * Sets the listaErroLote value for this ErroLote.
     * 
     * @param listaErroLote
     */
    public void setListaErroLote(java.lang.String[] listaErroLote) {
        this.listaErroLote = listaErroLote;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ErroLote)) return false;
        ErroLote other = (ErroLote) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.listaErroLote==null && other.getListaErroLote()==null) || 
             (this.listaErroLote!=null &&
              java.util.Arrays.equals(this.listaErroLote, other.getListaErroLote())));
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
        if (getListaErroLote() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListaErroLote());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListaErroLote(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ErroLote.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "erroLote"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listaErroLote");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "listaErroLote"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "tpStringSize4000"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "descricao"));
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
