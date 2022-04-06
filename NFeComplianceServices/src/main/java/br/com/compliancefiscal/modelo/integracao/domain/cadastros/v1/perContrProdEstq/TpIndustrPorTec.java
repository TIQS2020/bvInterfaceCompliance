/**
 * TpIndustrPorTec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.perContrProdEstq;

public class TpIndustrPorTec  implements java.io.Serializable {
    private java.util.Date dtProd;

    private java.lang.String codItem;

    private java.math.BigDecimal qtd;

    private br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.perContrProdEstq.TpIndustrEmTec[] industrEmTec; // VW_CSF_INDUSTR_EM_TERC - F55IJC56

    public TpIndustrPorTec() {
    }

    public TpIndustrPorTec(
           java.util.Date dtProd,
           java.lang.String codItem,
           java.math.BigDecimal qtd,
           br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.perContrProdEstq.TpIndustrEmTec[] industrEmTec) {
           this.dtProd = dtProd;
           this.codItem = codItem;
           this.qtd = qtd;
           this.industrEmTec = industrEmTec;
    }


    /**
     * Gets the dtProd value for this TpIndustrPorTec.
     * 
     * @return dtProd
     */
    public java.util.Date getDtProd() {
        return dtProd;
    }


    /**
     * Sets the dtProd value for this TpIndustrPorTec.
     * 
     * @param dtProd
     */
    public void setDtProd(java.util.Date dtProd) {
        this.dtProd = dtProd;
    }


    /**
     * Gets the codItem value for this TpIndustrPorTec.
     * 
     * @return codItem
     */
    public java.lang.String getCodItem() {
        return codItem;
    }


    /**
     * Sets the codItem value for this TpIndustrPorTec.
     * 
     * @param codItem
     */
    public void setCodItem(java.lang.String codItem) {
        this.codItem = codItem;
    }


    /**
     * Gets the qtd value for this TpIndustrPorTec.
     * 
     * @return qtd
     */
    public java.math.BigDecimal getQtd() {
        return qtd;
    }


    /**
     * Sets the qtd value for this TpIndustrPorTec.
     * 
     * @param qtd
     */
    public void setQtd(java.math.BigDecimal qtd) {
        this.qtd = qtd;
    }


    /**
     * Gets the industrEmTec value for this TpIndustrPorTec.
     * 
     * @return industrEmTec
     */
    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.perContrProdEstq.TpIndustrEmTec[] getIndustrEmTec() {
        return industrEmTec;
    }


    /**
     * Sets the industrEmTec value for this TpIndustrPorTec.
     * 
     * @param industrEmTec
     */
    public void setIndustrEmTec(br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.perContrProdEstq.TpIndustrEmTec[] industrEmTec) {
        this.industrEmTec = industrEmTec;
    }

    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.perContrProdEstq.TpIndustrEmTec getIndustrEmTec(int i) {
        return this.industrEmTec[i];
    }

    public void setIndustrEmTec(int i, br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.perContrProdEstq.TpIndustrEmTec _value) {
        this.industrEmTec[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TpIndustrPorTec)) return false;
        TpIndustrPorTec other = (TpIndustrPorTec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dtProd==null && other.getDtProd()==null) || 
             (this.dtProd!=null &&
              this.dtProd.equals(other.getDtProd()))) &&
            ((this.codItem==null && other.getCodItem()==null) || 
             (this.codItem!=null &&
              this.codItem.equals(other.getCodItem()))) &&
            ((this.qtd==null && other.getQtd()==null) || 
             (this.qtd!=null &&
              this.qtd.equals(other.getQtd()))) &&
            ((this.industrEmTec==null && other.getIndustrEmTec()==null) || 
             (this.industrEmTec!=null &&
              java.util.Arrays.equals(this.industrEmTec, other.getIndustrEmTec())));
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
        if (getDtProd() != null) {
            _hashCode += getDtProd().hashCode();
        }
        if (getCodItem() != null) {
            _hashCode += getCodItem().hashCode();
        }
        if (getQtd() != null) {
            _hashCode += getQtd().hashCode();
        }
        if (getIndustrEmTec() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIndustrEmTec());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIndustrEmTec(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TpIndustrPorTec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/perContrProdEstq", "tpIndustrPorTec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dtProd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/perContrProdEstq", "dtProd"));
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
        elemField.setFieldName("qtd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/perContrProdEstq", "qtd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalThreePrec"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("industrEmTec");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/perContrProdEstq", "industrEmTec"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/perContrProdEstq", "tpIndustrEmTec"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
