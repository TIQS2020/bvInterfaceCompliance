/**
 * TpInsumos.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.item;

public class TpInsumos  implements java.io.Serializable {
    private java.lang.String codigoItemCompl;

    private java.math.BigDecimal quantidadeCompl;

    private java.math.BigDecimal perda;

    public TpInsumos() {
    }

    public TpInsumos(
           java.lang.String codigoItemCompl,
           java.math.BigDecimal quantidadeCompl,
           java.math.BigDecimal perda) {
           this.codigoItemCompl = codigoItemCompl;
           this.quantidadeCompl = quantidadeCompl;
           this.perda = perda;
    }


    /**
     * Gets the codigoItemCompl value for this TpInsumos.
     * 
     * @return codigoItemCompl
     */
    public java.lang.String getCodigoItemCompl() {
        return codigoItemCompl;
    }


    /**
     * Sets the codigoItemCompl value for this TpInsumos.
     * 
     * @param codigoItemCompl
     */
    public void setCodigoItemCompl(java.lang.String codigoItemCompl) {
        this.codigoItemCompl = codigoItemCompl;
    }


    /**
     * Gets the quantidadeCompl value for this TpInsumos.
     * 
     * @return quantidadeCompl
     */
    public java.math.BigDecimal getQuantidadeCompl() {
        return quantidadeCompl;
    }


    /**
     * Sets the quantidadeCompl value for this TpInsumos.
     * 
     * @param quantidadeCompl
     */
    public void setQuantidadeCompl(java.math.BigDecimal quantidadeCompl) {
        this.quantidadeCompl = quantidadeCompl;
    }


    /**
     * Gets the perda value for this TpInsumos.
     * 
     * @return perda
     */
    public java.math.BigDecimal getPerda() {
        return perda;
    }


    /**
     * Sets the perda value for this TpInsumos.
     * 
     * @param perda
     */
    public void setPerda(java.math.BigDecimal perda) {
        this.perda = perda;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TpInsumos)) return false;
        TpInsumos other = (TpInsumos) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codigoItemCompl==null && other.getCodigoItemCompl()==null) || 
             (this.codigoItemCompl!=null &&
              this.codigoItemCompl.equals(other.getCodigoItemCompl()))) &&
            ((this.quantidadeCompl==null && other.getQuantidadeCompl()==null) || 
             (this.quantidadeCompl!=null &&
              this.quantidadeCompl.equals(other.getQuantidadeCompl()))) &&
            ((this.perda==null && other.getPerda()==null) || 
             (this.perda!=null &&
              this.perda.equals(other.getPerda())));
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
        if (getCodigoItemCompl() != null) {
            _hashCode += getCodigoItemCompl().hashCode();
        }
        if (getQuantidadeCompl() != null) {
            _hashCode += getQuantidadeCompl().hashCode();
        }
        if (getPerda() != null) {
            _hashCode += getPerda().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TpInsumos.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/item", "tpInsumos"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoItemCompl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/item", "codigoItemCompl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantidadeCompl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/item", "quantidadeCompl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("perda");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/item", "perda"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
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
