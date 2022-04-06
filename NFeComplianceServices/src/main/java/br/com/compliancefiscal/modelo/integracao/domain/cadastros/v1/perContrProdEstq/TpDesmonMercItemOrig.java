/**
 * TpDesmonMercItemOrig.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.perContrProdEstq;

public class TpDesmonMercItemOrig  implements java.io.Serializable {
    private java.util.Date dtIniOs;

    private java.util.Date dtFinOs;

    private java.lang.String codDocOs;

    private java.lang.String codItemOri;

    private java.math.BigDecimal qtdOri;

    private br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.perContrProdEstq.TpDesmonMercItemDest[] desmonMercItemDest;

    public TpDesmonMercItemOrig() {
    }

    public TpDesmonMercItemOrig(
           java.util.Date dtIniOs,
           java.util.Date dtFinOs,
           java.lang.String codDocOs,
           java.lang.String codItemOri,
           java.math.BigDecimal qtdOri,
           br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.perContrProdEstq.TpDesmonMercItemDest[] desmonMercItemDest) {
           this.dtIniOs = dtIniOs;
           this.dtFinOs = dtFinOs;
           this.codDocOs = codDocOs;
           this.codItemOri = codItemOri;
           this.qtdOri = qtdOri;
           this.desmonMercItemDest = desmonMercItemDest;
    }


    /**
     * Gets the dtIniOs value for this TpDesmonMercItemOrig.
     * 
     * @return dtIniOs
     */
    public java.util.Date getDtIniOs() {
        return dtIniOs;
    }


    /**
     * Sets the dtIniOs value for this TpDesmonMercItemOrig.
     * 
     * @param dtIniOs
     */
    public void setDtIniOs(java.util.Date dtIniOs) {
        this.dtIniOs = dtIniOs;
    }


    /**
     * Gets the dtFinOs value for this TpDesmonMercItemOrig.
     * 
     * @return dtFinOs
     */
    public java.util.Date getDtFinOs() {
        return dtFinOs;
    }


    /**
     * Sets the dtFinOs value for this TpDesmonMercItemOrig.
     * 
     * @param dtFinOs
     */
    public void setDtFinOs(java.util.Date dtFinOs) {
        this.dtFinOs = dtFinOs;
    }


    /**
     * Gets the codDocOs value for this TpDesmonMercItemOrig.
     * 
     * @return codDocOs
     */
    public java.lang.String getCodDocOs() {
        return codDocOs;
    }


    /**
     * Sets the codDocOs value for this TpDesmonMercItemOrig.
     * 
     * @param codDocOs
     */
    public void setCodDocOs(java.lang.String codDocOs) {
        this.codDocOs = codDocOs;
    }


    /**
     * Gets the codItemOri value for this TpDesmonMercItemOrig.
     * 
     * @return codItemOri
     */
    public java.lang.String getCodItemOri() {
        return codItemOri;
    }


    /**
     * Sets the codItemOri value for this TpDesmonMercItemOrig.
     * 
     * @param codItemOri
     */
    public void setCodItemOri(java.lang.String codItemOri) {
        this.codItemOri = codItemOri;
    }


    /**
     * Gets the qtdOri value for this TpDesmonMercItemOrig.
     * 
     * @return qtdOri
     */
    public java.math.BigDecimal getQtdOri() {
        return qtdOri;
    }


    /**
     * Sets the qtdOri value for this TpDesmonMercItemOrig.
     * 
     * @param qtdOri
     */
    public void setQtdOri(java.math.BigDecimal qtdOri) {
        this.qtdOri = qtdOri;
    }


    /**
     * Gets the desmonMercItemDest value for this TpDesmonMercItemOrig.
     * 
     * @return desmonMercItemDest
     */
    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.perContrProdEstq.TpDesmonMercItemDest[] getDesmonMercItemDest() {
        return desmonMercItemDest;
    }


    /**
     * Sets the desmonMercItemDest value for this TpDesmonMercItemOrig.
     * 
     * @param desmonMercItemDest
     */
    public void setDesmonMercItemDest(br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.perContrProdEstq.TpDesmonMercItemDest[] desmonMercItemDest) {
        this.desmonMercItemDest = desmonMercItemDest;
    }

    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.perContrProdEstq.TpDesmonMercItemDest getDesmonMercItemDest(int i) {
        return this.desmonMercItemDest[i];
    }

    public void setDesmonMercItemDest(int i, br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.perContrProdEstq.TpDesmonMercItemDest _value) {
        this.desmonMercItemDest[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TpDesmonMercItemOrig)) return false;
        TpDesmonMercItemOrig other = (TpDesmonMercItemOrig) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dtIniOs==null && other.getDtIniOs()==null) || 
             (this.dtIniOs!=null &&
              this.dtIniOs.equals(other.getDtIniOs()))) &&
            ((this.dtFinOs==null && other.getDtFinOs()==null) || 
             (this.dtFinOs!=null &&
              this.dtFinOs.equals(other.getDtFinOs()))) &&
            ((this.codDocOs==null && other.getCodDocOs()==null) || 
             (this.codDocOs!=null &&
              this.codDocOs.equals(other.getCodDocOs()))) &&
            ((this.codItemOri==null && other.getCodItemOri()==null) || 
             (this.codItemOri!=null &&
              this.codItemOri.equals(other.getCodItemOri()))) &&
            ((this.qtdOri==null && other.getQtdOri()==null) || 
             (this.qtdOri!=null &&
              this.qtdOri.equals(other.getQtdOri()))) &&
            ((this.desmonMercItemDest==null && other.getDesmonMercItemDest()==null) || 
             (this.desmonMercItemDest!=null &&
              java.util.Arrays.equals(this.desmonMercItemDest, other.getDesmonMercItemDest())));
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
        if (getDtIniOs() != null) {
            _hashCode += getDtIniOs().hashCode();
        }
        if (getDtFinOs() != null) {
            _hashCode += getDtFinOs().hashCode();
        }
        if (getCodDocOs() != null) {
            _hashCode += getCodDocOs().hashCode();
        }
        if (getCodItemOri() != null) {
            _hashCode += getCodItemOri().hashCode();
        }
        if (getQtdOri() != null) {
            _hashCode += getQtdOri().hashCode();
        }
        if (getDesmonMercItemDest() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDesmonMercItemDest());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDesmonMercItemDest(), i);
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
        new org.apache.axis.description.TypeDesc(TpDesmonMercItemOrig.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/perContrProdEstq", "tpDesmonMercItemOrig"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dtIniOs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/perContrProdEstq", "dtIniOs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dtFinOs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/perContrProdEstq", "dtFinOs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codDocOs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/perContrProdEstq", "codDocOs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codItemOri");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/perContrProdEstq", "codItemOri"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qtdOri");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/perContrProdEstq", "qtdOri"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalThreePrec"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("desmonMercItemDest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/perContrProdEstq", "desmonMercItemDest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/perContrProdEstq", "tpDesmonMercItemDest"));
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
