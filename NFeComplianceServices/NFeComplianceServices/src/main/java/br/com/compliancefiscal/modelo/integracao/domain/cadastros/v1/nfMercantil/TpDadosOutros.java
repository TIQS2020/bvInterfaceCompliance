/**
 * TpDadosOutros.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil;

public class TpDadosOutros  implements java.io.Serializable {
    private java.math.BigDecimal vlBaseOutro;

    private java.math.BigDecimal vlImpOutro;

    private java.math.BigDecimal aliqOutro;

    private java.math.BigDecimal vlBaseIsenta;

    public TpDadosOutros() {
    }

    public TpDadosOutros(
           java.math.BigDecimal vlBaseOutro,
           java.math.BigDecimal vlImpOutro,
           java.math.BigDecimal aliqOutro,
           java.math.BigDecimal vlBaseIsenta) {
           this.vlBaseOutro = vlBaseOutro;
           this.vlImpOutro = vlImpOutro;
           this.aliqOutro = aliqOutro;
           this.vlBaseIsenta = vlBaseIsenta;
    }


    /**
     * Gets the vlBaseOutro value for this TpDadosOutros.
     * 
     * @return vlBaseOutro
     */
    public java.math.BigDecimal getVlBaseOutro() {
        return vlBaseOutro;
    }


    /**
     * Sets the vlBaseOutro value for this TpDadosOutros.
     * 
     * @param vlBaseOutro
     */
    public void setVlBaseOutro(java.math.BigDecimal vlBaseOutro) {
        this.vlBaseOutro = vlBaseOutro;
    }


    /**
     * Gets the vlImpOutro value for this TpDadosOutros.
     * 
     * @return vlImpOutro
     */
    public java.math.BigDecimal getVlImpOutro() {
        return vlImpOutro;
    }


    /**
     * Sets the vlImpOutro value for this TpDadosOutros.
     * 
     * @param vlImpOutro
     */
    public void setVlImpOutro(java.math.BigDecimal vlImpOutro) {
        this.vlImpOutro = vlImpOutro;
    }


    /**
     * Gets the aliqOutro value for this TpDadosOutros.
     * 
     * @return aliqOutro
     */
    public java.math.BigDecimal getAliqOutro() {
        return aliqOutro;
    }


    /**
     * Sets the aliqOutro value for this TpDadosOutros.
     * 
     * @param aliqOutro
     */
    public void setAliqOutro(java.math.BigDecimal aliqOutro) {
        this.aliqOutro = aliqOutro;
    }


    /**
     * Gets the vlBaseIsenta value for this TpDadosOutros.
     * 
     * @return vlBaseIsenta
     */
    public java.math.BigDecimal getVlBaseIsenta() {
        return vlBaseIsenta;
    }


    /**
     * Sets the vlBaseIsenta value for this TpDadosOutros.
     * 
     * @param vlBaseIsenta
     */
    public void setVlBaseIsenta(java.math.BigDecimal vlBaseIsenta) {
        this.vlBaseIsenta = vlBaseIsenta;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TpDadosOutros)) return false;
        TpDadosOutros other = (TpDadosOutros) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.vlBaseOutro==null && other.getVlBaseOutro()==null) || 
             (this.vlBaseOutro!=null &&
              this.vlBaseOutro.equals(other.getVlBaseOutro()))) &&
            ((this.vlImpOutro==null && other.getVlImpOutro()==null) || 
             (this.vlImpOutro!=null &&
              this.vlImpOutro.equals(other.getVlImpOutro()))) &&
            ((this.aliqOutro==null && other.getAliqOutro()==null) || 
             (this.aliqOutro!=null &&
              this.aliqOutro.equals(other.getAliqOutro()))) &&
            ((this.vlBaseIsenta==null && other.getVlBaseIsenta()==null) || 
             (this.vlBaseIsenta!=null &&
              this.vlBaseIsenta.equals(other.getVlBaseIsenta())));
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
        if (getVlBaseOutro() != null) {
            _hashCode += getVlBaseOutro().hashCode();
        }
        if (getVlImpOutro() != null) {
            _hashCode += getVlImpOutro().hashCode();
        }
        if (getAliqOutro() != null) {
            _hashCode += getAliqOutro().hashCode();
        }
        if (getVlBaseIsenta() != null) {
            _hashCode += getVlBaseIsenta().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TpDadosOutros.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "tpDadosOutros"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlBaseOutro");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "vlBaseOutro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlImpOutro");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "vlImpOutro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aliqOutro");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "aliqOutro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlBaseIsenta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "vlBaseIsenta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setMinOccurs(0);
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
