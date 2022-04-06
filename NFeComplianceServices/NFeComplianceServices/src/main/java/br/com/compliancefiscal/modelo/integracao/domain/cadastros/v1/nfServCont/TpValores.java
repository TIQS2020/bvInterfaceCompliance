/**
 * TpValores.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServCont;

public class TpValores  implements java.io.Serializable {
    private java.math.BigDecimal vlDoc;

    private java.math.BigDecimal vlDesc;

    private java.math.BigDecimal vlServ;

    private java.math.BigDecimal vlServNt;

    private java.math.BigDecimal vlTerc;

    private java.math.BigDecimal vlBcIcms;

    private java.math.BigDecimal vlIcms;

    private java.math.BigDecimal vlPis;

    private java.math.BigDecimal vlCofins;

    private java.math.BigDecimal vlDa;

    public TpValores() {
    }

    public TpValores(
           java.math.BigDecimal vlDoc,
           java.math.BigDecimal vlDesc,
           java.math.BigDecimal vlServ,
           java.math.BigDecimal vlServNt,
           java.math.BigDecimal vlTerc,
           java.math.BigDecimal vlBcIcms,
           java.math.BigDecimal vlIcms,
           java.math.BigDecimal vlPis,
           java.math.BigDecimal vlCofins,
           java.math.BigDecimal vlDa) {
           this.vlDoc = vlDoc;
           this.vlDesc = vlDesc;
           this.vlServ = vlServ;
           this.vlServNt = vlServNt;
           this.vlTerc = vlTerc;
           this.vlBcIcms = vlBcIcms;
           this.vlIcms = vlIcms;
           this.vlPis = vlPis;
           this.vlCofins = vlCofins;
           this.vlDa = vlDa;
    }


    /**
     * Gets the vlDoc value for this TpValores.
     * 
     * @return vlDoc
     */
    public java.math.BigDecimal getVlDoc() {
        return vlDoc;
    }


    /**
     * Sets the vlDoc value for this TpValores.
     * 
     * @param vlDoc
     */
    public void setVlDoc(java.math.BigDecimal vlDoc) {
        this.vlDoc = vlDoc;
    }


    /**
     * Gets the vlDesc value for this TpValores.
     * 
     * @return vlDesc
     */
    public java.math.BigDecimal getVlDesc() {
        return vlDesc;
    }


    /**
     * Sets the vlDesc value for this TpValores.
     * 
     * @param vlDesc
     */
    public void setVlDesc(java.math.BigDecimal vlDesc) {
        this.vlDesc = vlDesc;
    }


    /**
     * Gets the vlServ value for this TpValores.
     * 
     * @return vlServ
     */
    public java.math.BigDecimal getVlServ() {
        return vlServ;
    }


    /**
     * Sets the vlServ value for this TpValores.
     * 
     * @param vlServ
     */
    public void setVlServ(java.math.BigDecimal vlServ) {
        this.vlServ = vlServ;
    }


    /**
     * Gets the vlServNt value for this TpValores.
     * 
     * @return vlServNt
     */
    public java.math.BigDecimal getVlServNt() {
        return vlServNt;
    }


    /**
     * Sets the vlServNt value for this TpValores.
     * 
     * @param vlServNt
     */
    public void setVlServNt(java.math.BigDecimal vlServNt) {
        this.vlServNt = vlServNt;
    }


    /**
     * Gets the vlTerc value for this TpValores.
     * 
     * @return vlTerc
     */
    public java.math.BigDecimal getVlTerc() {
        return vlTerc;
    }


    /**
     * Sets the vlTerc value for this TpValores.
     * 
     * @param vlTerc
     */
    public void setVlTerc(java.math.BigDecimal vlTerc) {
        this.vlTerc = vlTerc;
    }


    /**
     * Gets the vlBcIcms value for this TpValores.
     * 
     * @return vlBcIcms
     */
    public java.math.BigDecimal getVlBcIcms() {
        return vlBcIcms;
    }


    /**
     * Sets the vlBcIcms value for this TpValores.
     * 
     * @param vlBcIcms
     */
    public void setVlBcIcms(java.math.BigDecimal vlBcIcms) {
        this.vlBcIcms = vlBcIcms;
    }


    /**
     * Gets the vlIcms value for this TpValores.
     * 
     * @return vlIcms
     */
    public java.math.BigDecimal getVlIcms() {
        return vlIcms;
    }


    /**
     * Sets the vlIcms value for this TpValores.
     * 
     * @param vlIcms
     */
    public void setVlIcms(java.math.BigDecimal vlIcms) {
        this.vlIcms = vlIcms;
    }


    /**
     * Gets the vlPis value for this TpValores.
     * 
     * @return vlPis
     */
    public java.math.BigDecimal getVlPis() {
        return vlPis;
    }


    /**
     * Sets the vlPis value for this TpValores.
     * 
     * @param vlPis
     */
    public void setVlPis(java.math.BigDecimal vlPis) {
        this.vlPis = vlPis;
    }


    /**
     * Gets the vlCofins value for this TpValores.
     * 
     * @return vlCofins
     */
    public java.math.BigDecimal getVlCofins() {
        return vlCofins;
    }


    /**
     * Sets the vlCofins value for this TpValores.
     * 
     * @param vlCofins
     */
    public void setVlCofins(java.math.BigDecimal vlCofins) {
        this.vlCofins = vlCofins;
    }


    /**
     * Gets the vlDa value for this TpValores.
     * 
     * @return vlDa
     */
    public java.math.BigDecimal getVlDa() {
        return vlDa;
    }


    /**
     * Sets the vlDa value for this TpValores.
     * 
     * @param vlDa
     */
    public void setVlDa(java.math.BigDecimal vlDa) {
        this.vlDa = vlDa;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TpValores)) return false;
        TpValores other = (TpValores) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.vlDoc==null && other.getVlDoc()==null) || 
             (this.vlDoc!=null &&
              this.vlDoc.equals(other.getVlDoc()))) &&
            ((this.vlDesc==null && other.getVlDesc()==null) || 
             (this.vlDesc!=null &&
              this.vlDesc.equals(other.getVlDesc()))) &&
            ((this.vlServ==null && other.getVlServ()==null) || 
             (this.vlServ!=null &&
              this.vlServ.equals(other.getVlServ()))) &&
            ((this.vlServNt==null && other.getVlServNt()==null) || 
             (this.vlServNt!=null &&
              this.vlServNt.equals(other.getVlServNt()))) &&
            ((this.vlTerc==null && other.getVlTerc()==null) || 
             (this.vlTerc!=null &&
              this.vlTerc.equals(other.getVlTerc()))) &&
            ((this.vlBcIcms==null && other.getVlBcIcms()==null) || 
             (this.vlBcIcms!=null &&
              this.vlBcIcms.equals(other.getVlBcIcms()))) &&
            ((this.vlIcms==null && other.getVlIcms()==null) || 
             (this.vlIcms!=null &&
              this.vlIcms.equals(other.getVlIcms()))) &&
            ((this.vlPis==null && other.getVlPis()==null) || 
             (this.vlPis!=null &&
              this.vlPis.equals(other.getVlPis()))) &&
            ((this.vlCofins==null && other.getVlCofins()==null) || 
             (this.vlCofins!=null &&
              this.vlCofins.equals(other.getVlCofins()))) &&
            ((this.vlDa==null && other.getVlDa()==null) || 
             (this.vlDa!=null &&
              this.vlDa.equals(other.getVlDa())));
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
        if (getVlDoc() != null) {
            _hashCode += getVlDoc().hashCode();
        }
        if (getVlDesc() != null) {
            _hashCode += getVlDesc().hashCode();
        }
        if (getVlServ() != null) {
            _hashCode += getVlServ().hashCode();
        }
        if (getVlServNt() != null) {
            _hashCode += getVlServNt().hashCode();
        }
        if (getVlTerc() != null) {
            _hashCode += getVlTerc().hashCode();
        }
        if (getVlBcIcms() != null) {
            _hashCode += getVlBcIcms().hashCode();
        }
        if (getVlIcms() != null) {
            _hashCode += getVlIcms().hashCode();
        }
        if (getVlPis() != null) {
            _hashCode += getVlPis().hashCode();
        }
        if (getVlCofins() != null) {
            _hashCode += getVlCofins().hashCode();
        }
        if (getVlDa() != null) {
            _hashCode += getVlDa().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TpValores.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServCont", "tpValores"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlDoc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServCont", "vlDoc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServCont", "vlDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlServ");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServCont", "vlServ"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlServNt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServCont", "vlServNt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlTerc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServCont", "vlTerc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlBcIcms");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServCont", "vlBcIcms"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlIcms");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServCont", "vlIcms"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlPis");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServCont", "vlPis"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlCofins");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServCont", "vlCofins"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlDa");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServCont", "vlDa"));
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
