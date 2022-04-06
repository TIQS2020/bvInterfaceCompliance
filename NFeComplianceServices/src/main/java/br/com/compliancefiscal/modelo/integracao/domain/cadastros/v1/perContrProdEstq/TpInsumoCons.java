/**
 * TpInsumoCons.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.perContrProdEstq;

public class TpInsumoCons  implements java.io.Serializable {
    private java.util.Date dtSaida;

    private java.lang.String codItem;

    private java.lang.String codItemInsumo;

    private java.lang.String codItemInsumoSubst;

    private java.math.BigDecimal qtd;

    public TpInsumoCons() {
    }

    public TpInsumoCons(
           java.util.Date dtSaida,
           java.lang.String codItem,
           java.lang.String codItemInsumo,
           java.lang.String codItemInsumoSubst,
           java.math.BigDecimal qtd) {
           this.dtSaida = dtSaida;
           this.codItem = codItem;
           this.codItemInsumo = codItemInsumo;
           this.codItemInsumoSubst = codItemInsumoSubst;
           this.qtd = qtd;
    }


    /**
     * Gets the dtSaida value for this TpInsumoCons.
     * 
     * @return dtSaida
     */
    public java.util.Date getDtSaida() {
        return dtSaida;
    }


    /**
     * Sets the dtSaida value for this TpInsumoCons.
     * 
     * @param dtSaida
     */
    public void setDtSaida(java.util.Date dtSaida) {
        this.dtSaida = dtSaida;
    }


    /**
     * Gets the codItem value for this TpInsumoCons.
     * 
     * @return codItem
     */
    public java.lang.String getCodItem() {
        return codItem;
    }


    /**
     * Sets the codItem value for this TpInsumoCons.
     * 
     * @param codItem
     */
    public void setCodItem(java.lang.String codItem) {
        this.codItem = codItem;
    }


    /**
     * Gets the codItemInsumo value for this TpInsumoCons.
     * 
     * @return codItemInsumo
     */
    public java.lang.String getCodItemInsumo() {
        return codItemInsumo;
    }


    /**
     * Sets the codItemInsumo value for this TpInsumoCons.
     * 
     * @param codItemInsumo
     */
    public void setCodItemInsumo(java.lang.String codItemInsumo) {
        this.codItemInsumo = codItemInsumo;
    }


    /**
     * Gets the codItemInsumoSubst value for this TpInsumoCons.
     * 
     * @return codItemInsumoSubst
     */
    public java.lang.String getCodItemInsumoSubst() {
        return codItemInsumoSubst;
    }


    /**
     * Sets the codItemInsumoSubst value for this TpInsumoCons.
     * 
     * @param codItemInsumoSubst
     */
    public void setCodItemInsumoSubst(java.lang.String codItemInsumoSubst) {
        this.codItemInsumoSubst = codItemInsumoSubst;
    }


    /**
     * Gets the qtd value for this TpInsumoCons.
     * 
     * @return qtd
     */
    public java.math.BigDecimal getQtd() {
        return qtd;
    }


    /**
     * Sets the qtd value for this TpInsumoCons.
     * 
     * @param qtd
     */
    public void setQtd(java.math.BigDecimal qtd) {
        this.qtd = qtd;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TpInsumoCons)) return false;
        TpInsumoCons other = (TpInsumoCons) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dtSaida==null && other.getDtSaida()==null) || 
             (this.dtSaida!=null &&
              this.dtSaida.equals(other.getDtSaida()))) &&
            ((this.codItem==null && other.getCodItem()==null) || 
             (this.codItem!=null &&
              this.codItem.equals(other.getCodItem()))) &&
            ((this.codItemInsumo==null && other.getCodItemInsumo()==null) || 
             (this.codItemInsumo!=null &&
              this.codItemInsumo.equals(other.getCodItemInsumo()))) &&
            ((this.codItemInsumoSubst==null && other.getCodItemInsumoSubst()==null) || 
             (this.codItemInsumoSubst!=null &&
              this.codItemInsumoSubst.equals(other.getCodItemInsumoSubst()))) &&
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
        if (getDtSaida() != null) {
            _hashCode += getDtSaida().hashCode();
        }
        if (getCodItem() != null) {
            _hashCode += getCodItem().hashCode();
        }
        if (getCodItemInsumo() != null) {
            _hashCode += getCodItemInsumo().hashCode();
        }
        if (getCodItemInsumoSubst() != null) {
            _hashCode += getCodItemInsumoSubst().hashCode();
        }
        if (getQtd() != null) {
            _hashCode += getQtd().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TpInsumoCons.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/perContrProdEstq", "tpInsumoCons"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dtSaida");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/perContrProdEstq", "dtSaida"));
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
        elemField.setFieldName("codItemInsumo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/perContrProdEstq", "codItemInsumo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codItemInsumoSubst");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/perContrProdEstq", "codItemInsumoSubst"));
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
