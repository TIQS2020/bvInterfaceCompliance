/**
 * TpNfRegAnalDifal.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServCont;

public class TpNfRegAnalDifal  implements java.io.Serializable {
    private java.math.BigDecimal aliqIe;

    private java.math.BigDecimal aliqOrig;

    private java.math.BigInteger dmTipo;

    private java.math.BigDecimal vlBcIcms;

    private java.math.BigDecimal vlDifAliq;

    public TpNfRegAnalDifal() {
    }

    public TpNfRegAnalDifal(
           java.math.BigDecimal aliqIe,
           java.math.BigDecimal aliqOrig,
           java.math.BigInteger dmTipo,
           java.math.BigDecimal vlBcIcms,
           java.math.BigDecimal vlDifAliq) {
           this.aliqIe = aliqIe;
           this.aliqOrig = aliqOrig;
           this.dmTipo = dmTipo;
           this.vlBcIcms = vlBcIcms;
           this.vlDifAliq = vlDifAliq;
    }


    /**
     * Gets the aliqIe value for this TpNfRegAnalDifal.
     * 
     * @return aliqIe
     */
    public java.math.BigDecimal getAliqIe() {
        return aliqIe;
    }


    /**
     * Sets the aliqIe value for this TpNfRegAnalDifal.
     * 
     * @param aliqIe
     */
    public void setAliqIe(java.math.BigDecimal aliqIe) {
        this.aliqIe = aliqIe;
    }


    /**
     * Gets the aliqOrig value for this TpNfRegAnalDifal.
     * 
     * @return aliqOrig
     */
    public java.math.BigDecimal getAliqOrig() {
        return aliqOrig;
    }


    /**
     * Sets the aliqOrig value for this TpNfRegAnalDifal.
     * 
     * @param aliqOrig
     */
    public void setAliqOrig(java.math.BigDecimal aliqOrig) {
        this.aliqOrig = aliqOrig;
    }


    /**
     * Gets the dmTipo value for this TpNfRegAnalDifal.
     * 
     * @return dmTipo
     */
    public java.math.BigInteger getDmTipo() {
        return dmTipo;
    }


    /**
     * Sets the dmTipo value for this TpNfRegAnalDifal.
     * 
     * @param dmTipo
     */
    public void setDmTipo(java.math.BigInteger dmTipo) {
        this.dmTipo = dmTipo;
    }


    /**
     * Gets the vlBcIcms value for this TpNfRegAnalDifal.
     * 
     * @return vlBcIcms
     */
    public java.math.BigDecimal getVlBcIcms() {
        return vlBcIcms;
    }


    /**
     * Sets the vlBcIcms value for this TpNfRegAnalDifal.
     * 
     * @param vlBcIcms
     */
    public void setVlBcIcms(java.math.BigDecimal vlBcIcms) {
        this.vlBcIcms = vlBcIcms;
    }


    /**
     * Gets the vlDifAliq value for this TpNfRegAnalDifal.
     * 
     * @return vlDifAliq
     */
    public java.math.BigDecimal getVlDifAliq() {
        return vlDifAliq;
    }


    /**
     * Sets the vlDifAliq value for this TpNfRegAnalDifal.
     * 
     * @param vlDifAliq
     */
    public void setVlDifAliq(java.math.BigDecimal vlDifAliq) {
        this.vlDifAliq = vlDifAliq;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TpNfRegAnalDifal)) return false;
        TpNfRegAnalDifal other = (TpNfRegAnalDifal) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.aliqIe==null && other.getAliqIe()==null) || 
             (this.aliqIe!=null &&
              this.aliqIe.equals(other.getAliqIe()))) &&
            ((this.aliqOrig==null && other.getAliqOrig()==null) || 
             (this.aliqOrig!=null &&
              this.aliqOrig.equals(other.getAliqOrig()))) &&
            ((this.dmTipo==null && other.getDmTipo()==null) || 
             (this.dmTipo!=null &&
              this.dmTipo.equals(other.getDmTipo()))) &&
            ((this.vlBcIcms==null && other.getVlBcIcms()==null) || 
             (this.vlBcIcms!=null &&
              this.vlBcIcms.equals(other.getVlBcIcms()))) &&
            ((this.vlDifAliq==null && other.getVlDifAliq()==null) || 
             (this.vlDifAliq!=null &&
              this.vlDifAliq.equals(other.getVlDifAliq())));
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
        if (getAliqIe() != null) {
            _hashCode += getAliqIe().hashCode();
        }
        if (getAliqOrig() != null) {
            _hashCode += getAliqOrig().hashCode();
        }
        if (getDmTipo() != null) {
            _hashCode += getDmTipo().hashCode();
        }
        if (getVlBcIcms() != null) {
            _hashCode += getVlBcIcms().hashCode();
        }
        if (getVlDifAliq() != null) {
            _hashCode += getVlDifAliq().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TpNfRegAnalDifal.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServCont", "tpNfRegAnalDifal"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aliqIe");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServCont", "aliqIe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aliqOrig");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServCont", "aliqOrig"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dmTipo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServCont", "dmTipo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlBcIcms");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServCont", "vlBcIcms"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlDifAliq");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServCont", "vlDifAliq"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalFourPrec"));
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
