/**
 * TpReprRepaMercConsRet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.perContrProdEstq;

public class TpReprRepaMercConsRet  implements java.io.Serializable {
    private java.lang.String codItemRet;

    private java.math.BigDecimal qtdCons;

    private java.math.BigDecimal qtdRet;

    public TpReprRepaMercConsRet() {
    }

    public TpReprRepaMercConsRet(
           java.lang.String codItemRet,
           java.math.BigDecimal qtdCons,
           java.math.BigDecimal qtdRet) {
           this.codItemRet = codItemRet;
           this.qtdCons = qtdCons;
           this.qtdRet = qtdRet;
    }


    /**
     * Gets the codItemRet value for this TpReprRepaMercConsRet.
     * 
     * @return codItemRet
     */
    public java.lang.String getCodItemRet() {
        return codItemRet;
    }


    /**
     * Sets the codItemRet value for this TpReprRepaMercConsRet.
     * 
     * @param codItemRet
     */
    public void setCodItemRet(java.lang.String codItemRet) {
        this.codItemRet = codItemRet;
    }


    /**
     * Gets the qtdCons value for this TpReprRepaMercConsRet.
     * 
     * @return qtdCons
     */
    public java.math.BigDecimal getQtdCons() {
        return qtdCons;
    }


    /**
     * Sets the qtdCons value for this TpReprRepaMercConsRet.
     * 
     * @param qtdCons
     */
    public void setQtdCons(java.math.BigDecimal qtdCons) {
        this.qtdCons = qtdCons;
    }


    /**
     * Gets the qtdRet value for this TpReprRepaMercConsRet.
     * 
     * @return qtdRet
     */
    public java.math.BigDecimal getQtdRet() {
        return qtdRet;
    }


    /**
     * Sets the qtdRet value for this TpReprRepaMercConsRet.
     * 
     * @param qtdRet
     */
    public void setQtdRet(java.math.BigDecimal qtdRet) {
        this.qtdRet = qtdRet;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TpReprRepaMercConsRet)) return false;
        TpReprRepaMercConsRet other = (TpReprRepaMercConsRet) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codItemRet==null && other.getCodItemRet()==null) || 
             (this.codItemRet!=null &&
              this.codItemRet.equals(other.getCodItemRet()))) &&
            ((this.qtdCons==null && other.getQtdCons()==null) || 
             (this.qtdCons!=null &&
              this.qtdCons.equals(other.getQtdCons()))) &&
            ((this.qtdRet==null && other.getQtdRet()==null) || 
             (this.qtdRet!=null &&
              this.qtdRet.equals(other.getQtdRet())));
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
        if (getCodItemRet() != null) {
            _hashCode += getCodItemRet().hashCode();
        }
        if (getQtdCons() != null) {
            _hashCode += getQtdCons().hashCode();
        }
        if (getQtdRet() != null) {
            _hashCode += getQtdRet().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TpReprRepaMercConsRet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/perContrProdEstq", "tpReprRepaMercConsRet"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codItemRet");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/perContrProdEstq", "codItemRet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qtdCons");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/perContrProdEstq", "qtdCons"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalThreePrec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qtdRet");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/perContrProdEstq", "qtdRet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalThreePrec"));
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
