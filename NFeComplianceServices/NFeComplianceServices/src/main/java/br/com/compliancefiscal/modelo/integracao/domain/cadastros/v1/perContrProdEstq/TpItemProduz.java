/**
 * TpItemProduz.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.perContrProdEstq;

public class TpItemProduz  implements java.io.Serializable {
    private java.util.Date dtIniOp;

    private java.util.Date dtFinOp;

    private java.lang.String codDocOp;

    private java.lang.String codItem;

    private java.math.BigDecimal qtdEnc;

    private br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.perContrProdEstq.TpInsumoCons[] insumoCons; // VW_CSF_INSUMO_CONS - F55IJC54

    public TpItemProduz() {
    }

    public TpItemProduz(
           java.util.Date dtIniOp,
           java.util.Date dtFinOp,
           java.lang.String codDocOp,
           java.lang.String codItem,
           java.math.BigDecimal qtdEnc,
           br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.perContrProdEstq.TpInsumoCons[] insumoCons) {
           this.dtIniOp = dtIniOp;
           this.dtFinOp = dtFinOp;
           this.codDocOp = codDocOp;
           this.codItem = codItem;
           this.qtdEnc = qtdEnc;
           this.insumoCons = insumoCons;
    }


    /**
     * Gets the dtIniOp value for this TpItemProduz.
     * 
     * @return dtIniOp
     */
    public java.util.Date getDtIniOp() {
        return dtIniOp;
    }


    /**
     * Sets the dtIniOp value for this TpItemProduz.
     * 
     * @param dtIniOp
     */
    public void setDtIniOp(java.util.Date dtIniOp) {
        this.dtIniOp = dtIniOp;
    }


    /**
     * Gets the dtFinOp value for this TpItemProduz.
     * 
     * @return dtFinOp
     */
    public java.util.Date getDtFinOp() {
        return dtFinOp;
    }


    /**
     * Sets the dtFinOp value for this TpItemProduz.
     * 
     * @param dtFinOp
     */
    public void setDtFinOp(java.util.Date dtFinOp) {
        this.dtFinOp = dtFinOp;
    }


    /**
     * Gets the codDocOp value for this TpItemProduz.
     * 
     * @return codDocOp
     */
    public java.lang.String getCodDocOp() {
        return codDocOp;
    }


    /**
     * Sets the codDocOp value for this TpItemProduz.
     * 
     * @param codDocOp
     */
    public void setCodDocOp(java.lang.String codDocOp) {
        this.codDocOp = codDocOp;
    }


    /**
     * Gets the codItem value for this TpItemProduz.
     * 
     * @return codItem
     */
    public java.lang.String getCodItem() {
        return codItem;
    }


    /**
     * Sets the codItem value for this TpItemProduz.
     * 
     * @param codItem
     */
    public void setCodItem(java.lang.String codItem) {
        this.codItem = codItem;
    }


    /**
     * Gets the qtdEnc value for this TpItemProduz.
     * 
     * @return qtdEnc
     */
    public java.math.BigDecimal getQtdEnc() {
        return qtdEnc;
    }


    /**
     * Sets the qtdEnc value for this TpItemProduz.
     * 
     * @param qtdEnc
     */
    public void setQtdEnc(java.math.BigDecimal qtdEnc) {
        this.qtdEnc = qtdEnc;
    }


    /**
     * Gets the insumoCons value for this TpItemProduz.
     * 
     * @return insumoCons
     */
    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.perContrProdEstq.TpInsumoCons[] getInsumoCons() {
        return insumoCons;
    }


    /**
     * Sets the insumoCons value for this TpItemProduz.
     * 
     * @param insumoCons
     */
    public void setInsumoCons(br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.perContrProdEstq.TpInsumoCons[] insumoCons) {
        this.insumoCons = insumoCons;
    }

    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.perContrProdEstq.TpInsumoCons getInsumoCons(int i) {
        return this.insumoCons[i];
    }

    public void setInsumoCons(int i, br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.perContrProdEstq.TpInsumoCons _value) {
        this.insumoCons[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TpItemProduz)) return false;
        TpItemProduz other = (TpItemProduz) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dtIniOp==null && other.getDtIniOp()==null) || 
             (this.dtIniOp!=null &&
              this.dtIniOp.equals(other.getDtIniOp()))) &&
            ((this.dtFinOp==null && other.getDtFinOp()==null) || 
             (this.dtFinOp!=null &&
              this.dtFinOp.equals(other.getDtFinOp()))) &&
            ((this.codDocOp==null && other.getCodDocOp()==null) || 
             (this.codDocOp!=null &&
              this.codDocOp.equals(other.getCodDocOp()))) &&
            ((this.codItem==null && other.getCodItem()==null) || 
             (this.codItem!=null &&
              this.codItem.equals(other.getCodItem()))) &&
            ((this.qtdEnc==null && other.getQtdEnc()==null) || 
             (this.qtdEnc!=null &&
              this.qtdEnc.equals(other.getQtdEnc()))) &&
            ((this.insumoCons==null && other.getInsumoCons()==null) || 
             (this.insumoCons!=null &&
              java.util.Arrays.equals(this.insumoCons, other.getInsumoCons())));
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
        if (getDtIniOp() != null) {
            _hashCode += getDtIniOp().hashCode();
        }
        if (getDtFinOp() != null) {
            _hashCode += getDtFinOp().hashCode();
        }
        if (getCodDocOp() != null) {
            _hashCode += getCodDocOp().hashCode();
        }
        if (getCodItem() != null) {
            _hashCode += getCodItem().hashCode();
        }
        if (getQtdEnc() != null) {
            _hashCode += getQtdEnc().hashCode();
        }
        if (getInsumoCons() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInsumoCons());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInsumoCons(), i);
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
        new org.apache.axis.description.TypeDesc(TpItemProduz.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/perContrProdEstq", "tpItemProduz"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dtIniOp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/perContrProdEstq", "dtIniOp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dtFinOp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/perContrProdEstq", "dtFinOp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codDocOp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/perContrProdEstq", "codDocOp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codItem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/perContrProdEstq", "codItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qtdEnc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/perContrProdEstq", "qtdEnc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalThreePrec"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insumoCons");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/perContrProdEstq", "insumoCons"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/perContrProdEstq", "tpInsumoCons"));
        elemField.setMinOccurs(0);
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
