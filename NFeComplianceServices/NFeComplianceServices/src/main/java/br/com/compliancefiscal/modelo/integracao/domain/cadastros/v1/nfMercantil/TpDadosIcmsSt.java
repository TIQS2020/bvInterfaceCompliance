/**
 * TpDadosIcmsSt.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil;

public class TpDadosIcmsSt  implements java.io.Serializable {
    private java.lang.String ufSt;

    private java.math.BigDecimal vlBaseStRet;

    private java.math.BigDecimal vlIcmsStRet;

    private java.math.BigDecimal vlBaseStDest;

    private java.math.BigDecimal vlIcmsStDest;

    public TpDadosIcmsSt() {
    }

    public TpDadosIcmsSt(
           java.lang.String ufSt,
           java.math.BigDecimal vlBaseStRet,
           java.math.BigDecimal vlIcmsStRet,
           java.math.BigDecimal vlBaseStDest,
           java.math.BigDecimal vlIcmsStDest) {
           this.ufSt = ufSt;
           this.vlBaseStRet = vlBaseStRet;
           this.vlIcmsStRet = vlIcmsStRet;
           this.vlBaseStDest = vlBaseStDest;
           this.vlIcmsStDest = vlIcmsStDest;
    }


    /**
     * Gets the ufSt value for this TpDadosIcmsSt.
     * 
     * @return ufSt
     */
    public java.lang.String getUfSt() {
        return ufSt;
    }


    /**
     * Sets the ufSt value for this TpDadosIcmsSt.
     * 
     * @param ufSt
     */
    public void setUfSt(java.lang.String ufSt) {
        this.ufSt = ufSt;
    }


    /**
     * Gets the vlBaseStRet value for this TpDadosIcmsSt.
     * 
     * @return vlBaseStRet
     */
    public java.math.BigDecimal getVlBaseStRet() {
        return vlBaseStRet;
    }


    /**
     * Sets the vlBaseStRet value for this TpDadosIcmsSt.
     * 
     * @param vlBaseStRet
     */
    public void setVlBaseStRet(java.math.BigDecimal vlBaseStRet) {
        this.vlBaseStRet = vlBaseStRet;
    }


    /**
     * Gets the vlIcmsStRet value for this TpDadosIcmsSt.
     * 
     * @return vlIcmsStRet
     */
    public java.math.BigDecimal getVlIcmsStRet() {
        return vlIcmsStRet;
    }


    /**
     * Sets the vlIcmsStRet value for this TpDadosIcmsSt.
     * 
     * @param vlIcmsStRet
     */
    public void setVlIcmsStRet(java.math.BigDecimal vlIcmsStRet) {
        this.vlIcmsStRet = vlIcmsStRet;
    }


    /**
     * Gets the vlBaseStDest value for this TpDadosIcmsSt.
     * 
     * @return vlBaseStDest
     */
    public java.math.BigDecimal getVlBaseStDest() {
        return vlBaseStDest;
    }


    /**
     * Sets the vlBaseStDest value for this TpDadosIcmsSt.
     * 
     * @param vlBaseStDest
     */
    public void setVlBaseStDest(java.math.BigDecimal vlBaseStDest) {
        this.vlBaseStDest = vlBaseStDest;
    }


    /**
     * Gets the vlIcmsStDest value for this TpDadosIcmsSt.
     * 
     * @return vlIcmsStDest
     */
    public java.math.BigDecimal getVlIcmsStDest() {
        return vlIcmsStDest;
    }


    /**
     * Sets the vlIcmsStDest value for this TpDadosIcmsSt.
     * 
     * @param vlIcmsStDest
     */
    public void setVlIcmsStDest(java.math.BigDecimal vlIcmsStDest) {
        this.vlIcmsStDest = vlIcmsStDest;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TpDadosIcmsSt)) return false;
        TpDadosIcmsSt other = (TpDadosIcmsSt) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ufSt==null && other.getUfSt()==null) || 
             (this.ufSt!=null &&
              this.ufSt.equals(other.getUfSt()))) &&
            ((this.vlBaseStRet==null && other.getVlBaseStRet()==null) || 
             (this.vlBaseStRet!=null &&
              this.vlBaseStRet.equals(other.getVlBaseStRet()))) &&
            ((this.vlIcmsStRet==null && other.getVlIcmsStRet()==null) || 
             (this.vlIcmsStRet!=null &&
              this.vlIcmsStRet.equals(other.getVlIcmsStRet()))) &&
            ((this.vlBaseStDest==null && other.getVlBaseStDest()==null) || 
             (this.vlBaseStDest!=null &&
              this.vlBaseStDest.equals(other.getVlBaseStDest()))) &&
            ((this.vlIcmsStDest==null && other.getVlIcmsStDest()==null) || 
             (this.vlIcmsStDest!=null &&
              this.vlIcmsStDest.equals(other.getVlIcmsStDest())));
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
        if (getUfSt() != null) {
            _hashCode += getUfSt().hashCode();
        }
        if (getVlBaseStRet() != null) {
            _hashCode += getVlBaseStRet().hashCode();
        }
        if (getVlIcmsStRet() != null) {
            _hashCode += getVlIcmsStRet().hashCode();
        }
        if (getVlBaseStDest() != null) {
            _hashCode += getVlBaseStDest().hashCode();
        }
        if (getVlIcmsStDest() != null) {
            _hashCode += getVlIcmsStDest().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TpDadosIcmsSt.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "tpDadosIcmsSt"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ufSt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "ufSt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlBaseStRet");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "vlBaseStRet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlIcmsStRet");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "vlIcmsStRet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlBaseStDest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "vlBaseStDest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlIcmsStDest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "vlIcmsStDest"));
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
