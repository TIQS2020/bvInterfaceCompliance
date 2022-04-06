/**
 * TpValores.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServicos;

public class TpValores  implements java.io.Serializable {
    private java.math.BigDecimal vlServico;

    private java.math.BigDecimal vlDescIncondicionado;

    private java.math.BigDecimal vlDescCondicionado;

    private java.math.BigDecimal vlDeducao;

    private java.math.BigDecimal vlOutraRetencao;

    public TpValores() {
    }

    public TpValores(
           java.math.BigDecimal vlServico,
           java.math.BigDecimal vlDescIncondicionado,
           java.math.BigDecimal vlDescCondicionado,
           java.math.BigDecimal vlDeducao,
           java.math.BigDecimal vlOutraRetencao) {
           this.vlServico = vlServico;
           this.vlDescIncondicionado = vlDescIncondicionado;
           this.vlDescCondicionado = vlDescCondicionado;
           this.vlDeducao = vlDeducao;
           this.vlOutraRetencao = vlOutraRetencao;
    }


    /**
     * Gets the vlServico value for this TpValores.
     * 
     * @return vlServico
     */
    public java.math.BigDecimal getVlServico() {
        return vlServico;
    }


    /**
     * Sets the vlServico value for this TpValores.
     * 
     * @param vlServico
     */
    public void setVlServico(java.math.BigDecimal vlServico) {
        this.vlServico = vlServico;
    }


    /**
     * Gets the vlDescIncondicionado value for this TpValores.
     * 
     * @return vlDescIncondicionado
     */
    public java.math.BigDecimal getVlDescIncondicionado() {
        return vlDescIncondicionado;
    }


    /**
     * Sets the vlDescIncondicionado value for this TpValores.
     * 
     * @param vlDescIncondicionado
     */
    public void setVlDescIncondicionado(java.math.BigDecimal vlDescIncondicionado) {
        this.vlDescIncondicionado = vlDescIncondicionado;
    }


    /**
     * Gets the vlDescCondicionado value for this TpValores.
     * 
     * @return vlDescCondicionado
     */
    public java.math.BigDecimal getVlDescCondicionado() {
        return vlDescCondicionado;
    }


    /**
     * Sets the vlDescCondicionado value for this TpValores.
     * 
     * @param vlDescCondicionado
     */
    public void setVlDescCondicionado(java.math.BigDecimal vlDescCondicionado) {
        this.vlDescCondicionado = vlDescCondicionado;
    }


    /**
     * Gets the vlDeducao value for this TpValores.
     * 
     * @return vlDeducao
     */
    public java.math.BigDecimal getVlDeducao() {
        return vlDeducao;
    }


    /**
     * Sets the vlDeducao value for this TpValores.
     * 
     * @param vlDeducao
     */
    public void setVlDeducao(java.math.BigDecimal vlDeducao) {
        this.vlDeducao = vlDeducao;
    }


    /**
     * Gets the vlOutraRetencao value for this TpValores.
     * 
     * @return vlOutraRetencao
     */
    public java.math.BigDecimal getVlOutraRetencao() {
        return vlOutraRetencao;
    }


    /**
     * Sets the vlOutraRetencao value for this TpValores.
     * 
     * @param vlOutraRetencao
     */
    public void setVlOutraRetencao(java.math.BigDecimal vlOutraRetencao) {
        this.vlOutraRetencao = vlOutraRetencao;
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
            ((this.vlServico==null && other.getVlServico()==null) || 
             (this.vlServico!=null &&
              this.vlServico.equals(other.getVlServico()))) &&
            ((this.vlDescIncondicionado==null && other.getVlDescIncondicionado()==null) || 
             (this.vlDescIncondicionado!=null &&
              this.vlDescIncondicionado.equals(other.getVlDescIncondicionado()))) &&
            ((this.vlDescCondicionado==null && other.getVlDescCondicionado()==null) || 
             (this.vlDescCondicionado!=null &&
              this.vlDescCondicionado.equals(other.getVlDescCondicionado()))) &&
            ((this.vlDeducao==null && other.getVlDeducao()==null) || 
             (this.vlDeducao!=null &&
              this.vlDeducao.equals(other.getVlDeducao()))) &&
            ((this.vlOutraRetencao==null && other.getVlOutraRetencao()==null) || 
             (this.vlOutraRetencao!=null &&
              this.vlOutraRetencao.equals(other.getVlOutraRetencao())));
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
        if (getVlServico() != null) {
            _hashCode += getVlServico().hashCode();
        }
        if (getVlDescIncondicionado() != null) {
            _hashCode += getVlDescIncondicionado().hashCode();
        }
        if (getVlDescCondicionado() != null) {
            _hashCode += getVlDescCondicionado().hashCode();
        }
        if (getVlDeducao() != null) {
            _hashCode += getVlDeducao().hashCode();
        }
        if (getVlOutraRetencao() != null) {
            _hashCode += getVlOutraRetencao().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TpValores.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServicos", "tpValores"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlServico");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServicos", "vlServico"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlDescIncondicionado");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServicos", "vlDescIncondicionado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlDescCondicionado");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServicos", "vlDescCondicionado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlDeducao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServicos", "vlDeducao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlOutraRetencao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServicos", "vlOutraRetencao"));
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
