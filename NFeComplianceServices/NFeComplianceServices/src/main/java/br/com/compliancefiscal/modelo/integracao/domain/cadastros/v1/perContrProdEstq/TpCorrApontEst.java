/**
 * TpCorrApontEst.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.perContrProdEstq;

public class TpCorrApontEst  implements java.io.Serializable {
    private java.util.Date dtEst;

    private java.lang.String codItem;

    private java.math.BigDecimal qtdCorPos;

    private java.math.BigDecimal qtdCorNeg;

    private java.lang.String dmIndEst;

    private java.lang.String codPart;

    private java.util.Date dtRefer;

    public TpCorrApontEst() {
    }

    public TpCorrApontEst(
           java.util.Date dtEst,
           java.lang.String codItem,
           java.math.BigDecimal qtdCorPos,
           java.math.BigDecimal qtdCorNeg,
           java.lang.String dmIndEst,
           java.lang.String codPart,
           java.util.Date dtRefer) {
           this.dtEst = dtEst;
           this.codItem = codItem;
           this.qtdCorPos = qtdCorPos;
           this.qtdCorNeg = qtdCorNeg;
           this.dmIndEst = dmIndEst;
           this.codPart = codPart;
           this.dtRefer = dtRefer;
    }


    /**
     * Gets the dtEst value for this TpCorrApontEst.
     * 
     * @return dtEst
     */
    public java.util.Date getDtEst() {
        return dtEst;
    }


    /**
     * Sets the dtEst value for this TpCorrApontEst.
     * 
     * @param dtEst
     */
    public void setDtEst(java.util.Date dtEst) {
        this.dtEst = dtEst;
    }


    /**
     * Gets the codItem value for this TpCorrApontEst.
     * 
     * @return codItem
     */
    public java.lang.String getCodItem() {
        return codItem;
    }


    /**
     * Sets the codItem value for this TpCorrApontEst.
     * 
     * @param codItem
     */
    public void setCodItem(java.lang.String codItem) {
        this.codItem = codItem;
    }


    /**
     * Gets the qtdCorPos value for this TpCorrApontEst.
     * 
     * @return qtdCorPos
     */
    public java.math.BigDecimal getQtdCorPos() {
        return qtdCorPos;
    }


    /**
     * Sets the qtdCorPos value for this TpCorrApontEst.
     * 
     * @param qtdCorPos
     */
    public void setQtdCorPos(java.math.BigDecimal qtdCorPos) {
        this.qtdCorPos = qtdCorPos;
    }


    /**
     * Gets the qtdCorNeg value for this TpCorrApontEst.
     * 
     * @return qtdCorNeg
     */
    public java.math.BigDecimal getQtdCorNeg() {
        return qtdCorNeg;
    }


    /**
     * Sets the qtdCorNeg value for this TpCorrApontEst.
     * 
     * @param qtdCorNeg
     */
    public void setQtdCorNeg(java.math.BigDecimal qtdCorNeg) {
        this.qtdCorNeg = qtdCorNeg;
    }


    /**
     * Gets the dmIndEst value for this TpCorrApontEst.
     * 
     * @return dmIndEst
     */
    public java.lang.String getDmIndEst() {
        return dmIndEst;
    }


    /**
     * Sets the dmIndEst value for this TpCorrApontEst.
     * 
     * @param dmIndEst
     */
    public void setDmIndEst(java.lang.String dmIndEst) {
        this.dmIndEst = dmIndEst;
    }


    /**
     * Gets the codPart value for this TpCorrApontEst.
     * 
     * @return codPart
     */
    public java.lang.String getCodPart() {
        return codPart;
    }


    /**
     * Sets the codPart value for this TpCorrApontEst.
     * 
     * @param codPart
     */
    public void setCodPart(java.lang.String codPart) {
        this.codPart = codPart;
    }


    /**
     * Gets the dtRefer value for this TpCorrApontEst.
     * 
     * @return dtRefer
     */
    public java.util.Date getDtRefer() {
        return dtRefer;
    }


    /**
     * Sets the dtRefer value for this TpCorrApontEst.
     * 
     * @param dtRefer
     */
    public void setDtRefer(java.util.Date dtRefer) {
        this.dtRefer = dtRefer;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TpCorrApontEst)) return false;
        TpCorrApontEst other = (TpCorrApontEst) obj;
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
            ((this.qtdCorPos==null && other.getQtdCorPos()==null) || 
             (this.qtdCorPos!=null &&
              this.qtdCorPos.equals(other.getQtdCorPos()))) &&
            ((this.qtdCorNeg==null && other.getQtdCorNeg()==null) || 
             (this.qtdCorNeg!=null &&
              this.qtdCorNeg.equals(other.getQtdCorNeg()))) &&
            ((this.dmIndEst==null && other.getDmIndEst()==null) || 
             (this.dmIndEst!=null &&
              this.dmIndEst.equals(other.getDmIndEst()))) &&
            ((this.codPart==null && other.getCodPart()==null) || 
             (this.codPart!=null &&
              this.codPart.equals(other.getCodPart()))) &&
            ((this.dtRefer==null && other.getDtRefer()==null) || 
             (this.dtRefer!=null &&
              this.dtRefer.equals(other.getDtRefer())));
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
        if (getQtdCorPos() != null) {
            _hashCode += getQtdCorPos().hashCode();
        }
        if (getQtdCorNeg() != null) {
            _hashCode += getQtdCorNeg().hashCode();
        }
        if (getDmIndEst() != null) {
            _hashCode += getDmIndEst().hashCode();
        }
        if (getCodPart() != null) {
            _hashCode += getCodPart().hashCode();
        }
        if (getDtRefer() != null) {
            _hashCode += getDtRefer().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TpCorrApontEst.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/perContrProdEstq", "tpCorrApontEst"));
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
        elemField.setFieldName("qtdCorPos");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/perContrProdEstq", "qtdCorPos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalThreePrec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qtdCorNeg");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/perContrProdEstq", "qtdCorNeg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalThreePrec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dmIndEst");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/perContrProdEstq", "dmIndEst"));
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
        elemField.setFieldName("dtRefer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/perContrProdEstq", "dtRefer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
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
