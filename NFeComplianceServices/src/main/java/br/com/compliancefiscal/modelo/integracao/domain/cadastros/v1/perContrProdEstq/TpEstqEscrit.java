/**
 * TpEstqEscrit.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.perContrProdEstq;

public class TpEstqEscrit  implements java.io.Serializable {
    private java.util.Date dtEst;

    private java.lang.String codItem;

    private java.lang.String indEst;

    private java.lang.String codPart;

    private java.math.BigDecimal qtd;

    public TpEstqEscrit() {
    }

    public TpEstqEscrit(
           java.util.Date dtEst,
           java.lang.String codItem,
           java.lang.String indEst,
           java.lang.String codPart,
           java.math.BigDecimal qtd) {
           this.dtEst = dtEst;
           this.codItem = codItem;
           this.indEst = indEst;
           this.codPart = codPart;
           this.qtd = qtd;
    }


    /**
     * Gets the dtEst value for this TpEstqEscrit.
     * 
     * @return dtEst
     */
    public java.util.Date getDtEst() {
        return dtEst;
    }


    /**
     * Sets the dtEst value for this TpEstqEscrit.
     * 
     * @param dtEst
     */
    public void setDtEst(java.util.Date dtEst) {
        this.dtEst = dtEst;
    }


    /**
     * Gets the codItem value for this TpEstqEscrit.
     * 
     * @return codItem
     */
    public java.lang.String getCodItem() {
        return codItem;
    }


    /**
     * Sets the codItem value for this TpEstqEscrit.
     * 
     * @param codItem
     */
    public void setCodItem(java.lang.String codItem) {
        this.codItem = codItem;
    }


    /**
     * Gets the indEst value for this TpEstqEscrit.
     * 
     * @return indEst
     */
    public java.lang.String getIndEst() {
        return indEst;
    }


    /**
     * Sets the indEst value for this TpEstqEscrit.
     * 
     * @param indEst
     */
    public void setIndEst(java.lang.String indEst) {
        this.indEst = indEst;
    }


    /**
     * Gets the codPart value for this TpEstqEscrit.
     * 
     * @return codPart
     */
    public java.lang.String getCodPart() {
        return codPart;
    }


    /**
     * Sets the codPart value for this TpEstqEscrit.
     * 
     * @param codPart
     */
    public void setCodPart(java.lang.String codPart) {
        this.codPart = codPart;
    }


    /**
     * Gets the qtd value for this TpEstqEscrit.
     * 
     * @return qtd
     */
    public java.math.BigDecimal getQtd() {
        return qtd;
    }


    /**
     * Sets the qtd value for this TpEstqEscrit.
     * 
     * @param qtd
     */
    public void setQtd(java.math.BigDecimal qtd) {
        this.qtd = qtd;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TpEstqEscrit)) return false;
        TpEstqEscrit other = (TpEstqEscrit) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dtEst==null && other.getDtEst()==null) || 
             (this.dtEst!=null &&
              this.dtEst.equals(other.getDtEst()))) &&
            ((this.codItem==null && other.getCodItem()==null) || 
             (this.codItem!=null &&
              this.codItem.equals(other.getCodItem()))) &&
            ((this.indEst==null && other.getIndEst()==null) || 
             (this.indEst!=null &&
              this.indEst.equals(other.getIndEst()))) &&
            ((this.codPart==null && other.getCodPart()==null) || 
             (this.codPart!=null &&
              this.codPart.equals(other.getCodPart()))) &&
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
        if (getDtEst() != null) {
            _hashCode += getDtEst().hashCode();
        }
        if (getCodItem() != null) {
            _hashCode += getCodItem().hashCode();
        }
        if (getIndEst() != null) {
            _hashCode += getIndEst().hashCode();
        }
        if (getCodPart() != null) {
            _hashCode += getCodPart().hashCode();
        }
        if (getQtd() != null) {
            _hashCode += getQtd().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TpEstqEscrit.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/perContrProdEstq", "tpEstqEscrit"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dtEst");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/perContrProdEstq", "dtEst"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codItem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/perContrProdEstq", "codItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indEst");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/perContrProdEstq", "indEst"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/perContrProdEstq", "tpStringOne"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codPart");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/perContrProdEstq", "codPart"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
