/**
 * TpCorrApontRetIns.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.perContrProdEstq;

public class TpCorrApontRetIns  implements java.io.Serializable {
    private java.lang.String codItemRet;

    private java.math.BigDecimal qtdCorPos;

    private java.math.BigDecimal qtdCorNeg;

    private java.lang.String codItemInsSubst;

    public TpCorrApontRetIns() {
    }

    public TpCorrApontRetIns(
           java.lang.String codItemRet,
           java.math.BigDecimal qtdCorPos,
           java.math.BigDecimal qtdCorNeg,
           java.lang.String codItemInsSubst) {
           this.codItemRet = codItemRet;
           this.qtdCorPos = qtdCorPos;
           this.qtdCorNeg = qtdCorNeg;
           this.codItemInsSubst = codItemInsSubst;
    }


    /**
     * Gets the codItemRet value for this TpCorrApontRetIns.
     * 
     * @return codItemRet
     */
    public java.lang.String getCodItemRet() {
        return codItemRet;
    }


    /**
     * Sets the codItemRet value for this TpCorrApontRetIns.
     * 
     * @param codItemRet
     */
    public void setCodItemRet(java.lang.String codItemRet) {
        this.codItemRet = codItemRet;
    }


    /**
     * Gets the qtdCorPos value for this TpCorrApontRetIns.
     * 
     * @return qtdCorPos
     */
    public java.math.BigDecimal getQtdCorPos() {
        return qtdCorPos;
    }


    /**
     * Sets the qtdCorPos value for this TpCorrApontRetIns.
     * 
     * @param qtdCorPos
     */
    public void setQtdCorPos(java.math.BigDecimal qtdCorPos) {
        this.qtdCorPos = qtdCorPos;
    }


    /**
     * Gets the qtdCorNeg value for this TpCorrApontRetIns.
     * 
     * @return qtdCorNeg
     */
    public java.math.BigDecimal getQtdCorNeg() {
        return qtdCorNeg;
    }


    /**
     * Sets the qtdCorNeg value for this TpCorrApontRetIns.
     * 
     * @param qtdCorNeg
     */
    public void setQtdCorNeg(java.math.BigDecimal qtdCorNeg) {
        this.qtdCorNeg = qtdCorNeg;
    }


    /**
     * Gets the codItemInsSubst value for this TpCorrApontRetIns.
     * 
     * @return codItemInsSubst
     */
    public java.lang.String getCodItemInsSubst() {
        return codItemInsSubst;
    }


    /**
     * Sets the codItemInsSubst value for this TpCorrApontRetIns.
     * 
     * @param codItemInsSubst
     */
    public void setCodItemInsSubst(java.lang.String codItemInsSubst) {
        this.codItemInsSubst = codItemInsSubst;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TpCorrApontRetIns)) return false;
        TpCorrApontRetIns other = (TpCorrApontRetIns) obj;
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
            ((this.qtdCorPos==null && other.getQtdCorPos()==null) || 
             (this.qtdCorPos!=null &&
              this.qtdCorPos.equals(other.getQtdCorPos()))) &&
            ((this.qtdCorNeg==null && other.getQtdCorNeg()==null) || 
             (this.qtdCorNeg!=null &&
              this.qtdCorNeg.equals(other.getQtdCorNeg()))) &&
            ((this.codItemInsSubst==null && other.getCodItemInsSubst()==null) || 
             (this.codItemInsSubst!=null &&
              this.codItemInsSubst.equals(other.getCodItemInsSubst())));
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
        if (getQtdCorPos() != null) {
            _hashCode += getQtdCorPos().hashCode();
        }
        if (getQtdCorNeg() != null) {
            _hashCode += getQtdCorNeg().hashCode();
        }
        if (getCodItemInsSubst() != null) {
            _hashCode += getCodItemInsSubst().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TpCorrApontRetIns.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/perContrProdEstq", "tpCorrApontRetIns"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codItemRet");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/perContrProdEstq", "codItemRet"));
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
        elemField.setFieldName("codItemInsSubst");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/perContrProdEstq", "codItemInsSubst"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
