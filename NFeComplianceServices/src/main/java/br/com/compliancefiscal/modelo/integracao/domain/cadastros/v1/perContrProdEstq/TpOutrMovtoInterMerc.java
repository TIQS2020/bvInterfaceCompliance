/**
 * TpOutrMovtoInterMerc.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.perContrProdEstq;

public class TpOutrMovtoInterMerc  implements java.io.Serializable {
    private java.util.Date dtMov;

    private java.lang.String codItemOrig;

    private java.lang.String codItemDest;

    private java.math.BigDecimal qtd;

    public TpOutrMovtoInterMerc() {
    }

    public TpOutrMovtoInterMerc(
           java.util.Date dtMov,
           java.lang.String codItemOrig,
           java.lang.String codItemDest,
           java.math.BigDecimal qtd) {
           this.dtMov = dtMov;
           this.codItemOrig = codItemOrig;
           this.codItemDest = codItemDest;
           this.qtd = qtd;
    }


    /**
     * Gets the dtMov value for this TpOutrMovtoInterMerc.
     * 
     * @return dtMov
     */
    public java.util.Date getDtMov() {
        return dtMov;
    }


    /**
     * Sets the dtMov value for this TpOutrMovtoInterMerc.
     * 
     * @param dtMov
     */
    public void setDtMov(java.util.Date dtMov) {
        this.dtMov = dtMov;
    }


    /**
     * Gets the codItemOrig value for this TpOutrMovtoInterMerc.
     * 
     * @return codItemOrig
     */
    public java.lang.String getCodItemOrig() {
        return codItemOrig;
    }


    /**
     * Sets the codItemOrig value for this TpOutrMovtoInterMerc.
     * 
     * @param codItemOrig
     */
    public void setCodItemOrig(java.lang.String codItemOrig) {
        this.codItemOrig = codItemOrig;
    }


    /**
     * Gets the codItemDest value for this TpOutrMovtoInterMerc.
     * 
     * @return codItemDest
     */
    public java.lang.String getCodItemDest() {
        return codItemDest;
    }


    /**
     * Sets the codItemDest value for this TpOutrMovtoInterMerc.
     * 
     * @param codItemDest
     */
    public void setCodItemDest(java.lang.String codItemDest) {
        this.codItemDest = codItemDest;
    }


    /**
     * Gets the qtd value for this TpOutrMovtoInterMerc.
     * 
     * @return qtd
     */
    public java.math.BigDecimal getQtd() {
        return qtd;
    }


    /**
     * Sets the qtd value for this TpOutrMovtoInterMerc.
     * 
     * @param qtd
     */
    public void setQtd(java.math.BigDecimal qtd) {
        this.qtd = qtd;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TpOutrMovtoInterMerc)) return false;
        TpOutrMovtoInterMerc other = (TpOutrMovtoInterMerc) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dtMov==null && other.getDtMov()==null) || 
             (this.dtMov!=null &&
              this.dtMov.equals(other.getDtMov()))) &&
            ((this.codItemOrig==null && other.getCodItemOrig()==null) || 
             (this.codItemOrig!=null &&
              this.codItemOrig.equals(other.getCodItemOrig()))) &&
            ((this.codItemDest==null && other.getCodItemDest()==null) || 
             (this.codItemDest!=null &&
              this.codItemDest.equals(other.getCodItemDest()))) &&
            ((this.qtd==null && other.getQtd()==null) || 
             (this.qtd!=null &&
              this.qtd.equals(other.getQtd())));
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
        if (getDtMov() != null) {
            _hashCode += getDtMov().hashCode();
        }
        if (getCodItemOrig() != null) {
            _hashCode += getCodItemOrig().hashCode();
        }
        if (getCodItemDest() != null) {
            _hashCode += getCodItemDest().hashCode();
        }
        if (getQtd() != null) {
            _hashCode += getQtd().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TpOutrMovtoInterMerc.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/perContrProdEstq", "tpOutrMovtoInterMerc"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dtMov");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/perContrProdEstq", "dtMov"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codItemOrig");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/perContrProdEstq", "codItemOrig"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codItemDest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/perContrProdEstq", "codItemDest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qtd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/perContrProdEstq", "qtd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalThreePrec"));
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
