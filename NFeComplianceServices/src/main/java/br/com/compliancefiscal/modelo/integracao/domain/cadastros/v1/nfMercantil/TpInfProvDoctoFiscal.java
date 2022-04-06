/**
 * TpInfProvDoctoFiscal.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil;

public class TpInfProvDoctoFiscal  implements java.io.Serializable {
    private java.lang.String codOcorAjIcms;

    private org.apache.axis.types.NonNegativeInteger nroItem;

    private java.lang.String descrComplAj;

    private java.math.BigDecimal vlBaseCalcIcms;

    private java.math.BigDecimal aliqIcms;

    private java.math.BigDecimal vlIcms;

    private java.math.BigDecimal vlOutros;

    public TpInfProvDoctoFiscal() {
    }

    public TpInfProvDoctoFiscal(
           java.lang.String codOcorAjIcms,
           org.apache.axis.types.NonNegativeInteger nroItem,
           java.lang.String descrComplAj,
           java.math.BigDecimal vlBaseCalcIcms,
           java.math.BigDecimal aliqIcms,
           java.math.BigDecimal vlIcms,
           java.math.BigDecimal vlOutros) {
           this.codOcorAjIcms = codOcorAjIcms;
           this.nroItem = nroItem;
           this.descrComplAj = descrComplAj;
           this.vlBaseCalcIcms = vlBaseCalcIcms;
           this.aliqIcms = aliqIcms;
           this.vlIcms = vlIcms;
           this.vlOutros = vlOutros;
    }


    /**
     * Gets the codOcorAjIcms value for this TpInfProvDoctoFiscal.
     * 
     * @return codOcorAjIcms
     */
    public java.lang.String getCodOcorAjIcms() {
        return codOcorAjIcms;
    }


    /**
     * Sets the codOcorAjIcms value for this TpInfProvDoctoFiscal.
     * 
     * @param codOcorAjIcms
     */
    public void setCodOcorAjIcms(java.lang.String codOcorAjIcms) {
        this.codOcorAjIcms = codOcorAjIcms;
    }


    /**
     * Gets the nroItem value for this TpInfProvDoctoFiscal.
     * 
     * @return nroItem
     */
    public org.apache.axis.types.NonNegativeInteger getNroItem() {
        return nroItem;
    }


    /**
     * Sets the nroItem value for this TpInfProvDoctoFiscal.
     * 
     * @param nroItem
     */
    public void setNroItem(org.apache.axis.types.NonNegativeInteger nroItem) {
        this.nroItem = nroItem;
    }


    /**
     * Gets the descrComplAj value for this TpInfProvDoctoFiscal.
     * 
     * @return descrComplAj
     */
    public java.lang.String getDescrComplAj() {
        return descrComplAj;
    }


    /**
     * Sets the descrComplAj value for this TpInfProvDoctoFiscal.
     * 
     * @param descrComplAj
     */
    public void setDescrComplAj(java.lang.String descrComplAj) {
        this.descrComplAj = descrComplAj;
    }


    /**
     * Gets the vlBaseCalcIcms value for this TpInfProvDoctoFiscal.
     * 
     * @return vlBaseCalcIcms
     */
    public java.math.BigDecimal getVlBaseCalcIcms() {
        return vlBaseCalcIcms;
    }


    /**
     * Sets the vlBaseCalcIcms value for this TpInfProvDoctoFiscal.
     * 
     * @param vlBaseCalcIcms
     */
    public void setVlBaseCalcIcms(java.math.BigDecimal vlBaseCalcIcms) {
        this.vlBaseCalcIcms = vlBaseCalcIcms;
    }


    /**
     * Gets the aliqIcms value for this TpInfProvDoctoFiscal.
     * 
     * @return aliqIcms
     */
    public java.math.BigDecimal getAliqIcms() {
        return aliqIcms;
    }


    /**
     * Sets the aliqIcms value for this TpInfProvDoctoFiscal.
     * 
     * @param aliqIcms
     */
    public void setAliqIcms(java.math.BigDecimal aliqIcms) {
        this.aliqIcms = aliqIcms;
    }


    /**
     * Gets the vlIcms value for this TpInfProvDoctoFiscal.
     * 
     * @return vlIcms
     */
    public java.math.BigDecimal getVlIcms() {
        return vlIcms;
    }


    /**
     * Sets the vlIcms value for this TpInfProvDoctoFiscal.
     * 
     * @param vlIcms
     */
    public void setVlIcms(java.math.BigDecimal vlIcms) {
        this.vlIcms = vlIcms;
    }


    /**
     * Gets the vlOutros value for this TpInfProvDoctoFiscal.
     * 
     * @return vlOutros
     */
    public java.math.BigDecimal getVlOutros() {
        return vlOutros;
    }


    /**
     * Sets the vlOutros value for this TpInfProvDoctoFiscal.
     * 
     * @param vlOutros
     */
    public void setVlOutros(java.math.BigDecimal vlOutros) {
        this.vlOutros = vlOutros;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TpInfProvDoctoFiscal)) return false;
        TpInfProvDoctoFiscal other = (TpInfProvDoctoFiscal) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codOcorAjIcms==null && other.getCodOcorAjIcms()==null) || 
             (this.codOcorAjIcms!=null &&
              this.codOcorAjIcms.equals(other.getCodOcorAjIcms()))) &&
            ((this.nroItem==null && other.getNroItem()==null) || 
             (this.nroItem!=null &&
              this.nroItem.equals(other.getNroItem()))) &&
            ((this.descrComplAj==null && other.getDescrComplAj()==null) || 
             (this.descrComplAj!=null &&
              this.descrComplAj.equals(other.getDescrComplAj()))) &&
            ((this.vlBaseCalcIcms==null && other.getVlBaseCalcIcms()==null) || 
             (this.vlBaseCalcIcms!=null &&
              this.vlBaseCalcIcms.equals(other.getVlBaseCalcIcms()))) &&
            ((this.aliqIcms==null && other.getAliqIcms()==null) || 
             (this.aliqIcms!=null &&
              this.aliqIcms.equals(other.getAliqIcms()))) &&
            ((this.vlIcms==null && other.getVlIcms()==null) || 
             (this.vlIcms!=null &&
              this.vlIcms.equals(other.getVlIcms()))) &&
            ((this.vlOutros==null && other.getVlOutros()==null) || 
             (this.vlOutros!=null &&
              this.vlOutros.equals(other.getVlOutros())));
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
        if (getCodOcorAjIcms() != null) {
            _hashCode += getCodOcorAjIcms().hashCode();
        }
        if (getNroItem() != null) {
            _hashCode += getNroItem().hashCode();
        }
        if (getDescrComplAj() != null) {
            _hashCode += getDescrComplAj().hashCode();
        }
        if (getVlBaseCalcIcms() != null) {
            _hashCode += getVlBaseCalcIcms().hashCode();
        }
        if (getAliqIcms() != null) {
            _hashCode += getAliqIcms().hashCode();
        }
        if (getVlIcms() != null) {
            _hashCode += getVlIcms().hashCode();
        }
        if (getVlOutros() != null) {
            _hashCode += getVlOutros().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TpInfProvDoctoFiscal.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "tpInfProvDoctoFiscal"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codOcorAjIcms");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "codOcorAjIcms"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nroItem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "nroItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descrComplAj");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "descrComplAj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlBaseCalcIcms");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "vlBaseCalcIcms"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aliqIcms");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "aliqIcms"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlIcms");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "vlIcms"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlOutros");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "vlOutros"));
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
