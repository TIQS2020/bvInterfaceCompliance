/**
 * TpAposentEspecial.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServicos;

public class TpAposentEspecial  implements java.io.Serializable {
    private java.math.BigDecimal vlAdicional;

    private java.math.BigDecimal percentual;

    public TpAposentEspecial() {
    }

    public TpAposentEspecial(
           java.math.BigDecimal vlAdicional,
           java.math.BigDecimal percentual) {
           this.vlAdicional = vlAdicional;
           this.percentual = percentual;
    }


    /**
     * Gets the vlAdicional value for this TpAposentEspecial.
     * 
     * @return vlAdicional
     */
    public java.math.BigDecimal getVlAdicional() {
        return vlAdicional;
    }


    /**
     * Sets the vlAdicional value for this TpAposentEspecial.
     * 
     * @param vlAdicional
     */
    public void setVlAdicional(java.math.BigDecimal vlAdicional) {
        this.vlAdicional = vlAdicional;
    }


    /**
     * Gets the percentual value for this TpAposentEspecial.
     * 
     * @return percentual
     */
    public java.math.BigDecimal getPercentual() {
        return percentual;
    }


    /**
     * Sets the percentual value for this TpAposentEspecial.
     * 
     * @param percentual
     */
    public void setPercentual(java.math.BigDecimal percentual) {
        this.percentual = percentual;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TpAposentEspecial)) return false;
        TpAposentEspecial other = (TpAposentEspecial) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.vlAdicional==null && other.getVlAdicional()==null) || 
             (this.vlAdicional!=null &&
              this.vlAdicional.equals(other.getVlAdicional()))) &&
            ((this.percentual==null && other.getPercentual()==null) || 
             (this.percentual!=null &&
              this.percentual.equals(other.getPercentual())));
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
        if (getVlAdicional() != null) {
            _hashCode += getVlAdicional().hashCode();
        }
        if (getPercentual() != null) {
            _hashCode += getPercentual().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TpAposentEspecial.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServicos", "tpAposentEspecial"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlAdicional");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServicos", "vlAdicional"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("percentual");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServicos", "percentual"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
