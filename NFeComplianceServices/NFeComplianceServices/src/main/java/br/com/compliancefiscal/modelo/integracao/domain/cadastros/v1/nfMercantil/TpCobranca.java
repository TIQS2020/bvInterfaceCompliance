/**
 * TpCobranca.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil;

public class TpCobranca  implements java.io.Serializable {
    private java.lang.String nroFatura;

    private org.apache.axis.types.NonNegativeInteger dmIndEmit;

    private java.lang.String dmIndTit;

    private java.math.BigDecimal vlOriginal;

    private java.math.BigDecimal vlDesconto;

    private java.math.BigDecimal vlLiquido;

    private java.lang.String descrTit;

    private br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpDuplicatas[] duplicatas;

    public TpCobranca() {
    }

    public TpCobranca(
           java.lang.String nroFatura,
           org.apache.axis.types.NonNegativeInteger dmIndEmit,
           java.lang.String dmIndTit,
           java.math.BigDecimal vlOriginal,
           java.math.BigDecimal vlDesconto,
           java.math.BigDecimal vlLiquido,
           java.lang.String descrTit,
           br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpDuplicatas[] duplicatas) {
           this.nroFatura = nroFatura;
           this.dmIndEmit = dmIndEmit;
           this.dmIndTit = dmIndTit;
           this.vlOriginal = vlOriginal;
           this.vlDesconto = vlDesconto;
           this.vlLiquido = vlLiquido;
           this.descrTit = descrTit;
           this.duplicatas = duplicatas;
    }


    /**
     * Gets the nroFatura value for this TpCobranca.
     * 
     * @return nroFatura
     */
    public java.lang.String getNroFatura() {
        return nroFatura;
    }


    /**
     * Sets the nroFatura value for this TpCobranca.
     * 
     * @param nroFatura
     */
    public void setNroFatura(java.lang.String nroFatura) {
        this.nroFatura = nroFatura;
    }


    /**
     * Gets the dmIndEmit value for this TpCobranca.
     * 
     * @return dmIndEmit
     */
    public org.apache.axis.types.NonNegativeInteger getDmIndEmit() {
        return dmIndEmit;
    }


    /**
     * Sets the dmIndEmit value for this TpCobranca.
     * 
     * @param dmIndEmit
     */
    public void setDmIndEmit(org.apache.axis.types.NonNegativeInteger dmIndEmit) {
        this.dmIndEmit = dmIndEmit;
    }


    /**
     * Gets the dmIndTit value for this TpCobranca.
     * 
     * @return dmIndTit
     */
    public java.lang.String getDmIndTit() {
        return dmIndTit;
    }


    /**
     * Sets the dmIndTit value for this TpCobranca.
     * 
     * @param dmIndTit
     */
    public void setDmIndTit(java.lang.String dmIndTit) {
        this.dmIndTit = dmIndTit;
    }


    /**
     * Gets the vlOriginal value for this TpCobranca.
     * 
     * @return vlOriginal
     */
    public java.math.BigDecimal getVlOriginal() {
        return vlOriginal;
    }


    /**
     * Sets the vlOriginal value for this TpCobranca.
     * 
     * @param vlOriginal
     */
    public void setVlOriginal(java.math.BigDecimal vlOriginal) {
        this.vlOriginal = vlOriginal;
    }


    /**
     * Gets the vlDesconto value for this TpCobranca.
     * 
     * @return vlDesconto
     */
    public java.math.BigDecimal getVlDesconto() {
        return vlDesconto;
    }


    /**
     * Sets the vlDesconto value for this TpCobranca.
     * 
     * @param vlDesconto
     */
    public void setVlDesconto(java.math.BigDecimal vlDesconto) {
        this.vlDesconto = vlDesconto;
    }


    /**
     * Gets the vlLiquido value for this TpCobranca.
     * 
     * @return vlLiquido
     */
    public java.math.BigDecimal getVlLiquido() {
        return vlLiquido;
    }


    /**
     * Sets the vlLiquido value for this TpCobranca.
     * 
     * @param vlLiquido
     */
    public void setVlLiquido(java.math.BigDecimal vlLiquido) {
        this.vlLiquido = vlLiquido;
    }


    /**
     * Gets the descrTit value for this TpCobranca.
     * 
     * @return descrTit
     */
    public java.lang.String getDescrTit() {
        return descrTit;
    }


    /**
     * Sets the descrTit value for this TpCobranca.
     * 
     * @param descrTit
     */
    public void setDescrTit(java.lang.String descrTit) {
        this.descrTit = descrTit;
    }


    /**
     * Gets the duplicatas value for this TpCobranca.
     * 
     * @return duplicatas
     */
    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpDuplicatas[] getDuplicatas() {
        return duplicatas;
    }


    /**
     * Sets the duplicatas value for this TpCobranca.
     * 
     * @param duplicatas
     */
    public void setDuplicatas(br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpDuplicatas[] duplicatas) {
        this.duplicatas = duplicatas;
    }

    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpDuplicatas getDuplicatas(int i) {
        return this.duplicatas[i];
    }

    public void setDuplicatas(int i, br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpDuplicatas _value) {
        this.duplicatas[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TpCobranca)) return false;
        TpCobranca other = (TpCobranca) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nroFatura==null && other.getNroFatura()==null) || 
             (this.nroFatura!=null &&
              this.nroFatura.equals(other.getNroFatura()))) &&
            ((this.dmIndEmit==null && other.getDmIndEmit()==null) || 
             (this.dmIndEmit!=null &&
              this.dmIndEmit.equals(other.getDmIndEmit()))) &&
            ((this.dmIndTit==null && other.getDmIndTit()==null) || 
             (this.dmIndTit!=null &&
              this.dmIndTit.equals(other.getDmIndTit()))) &&
            ((this.vlOriginal==null && other.getVlOriginal()==null) || 
             (this.vlOriginal!=null &&
              this.vlOriginal.equals(other.getVlOriginal()))) &&
            ((this.vlDesconto==null && other.getVlDesconto()==null) || 
             (this.vlDesconto!=null &&
              this.vlDesconto.equals(other.getVlDesconto()))) &&
            ((this.vlLiquido==null && other.getVlLiquido()==null) || 
             (this.vlLiquido!=null &&
              this.vlLiquido.equals(other.getVlLiquido()))) &&
            ((this.descrTit==null && other.getDescrTit()==null) || 
             (this.descrTit!=null &&
              this.descrTit.equals(other.getDescrTit()))) &&
            ((this.duplicatas==null && other.getDuplicatas()==null) || 
             (this.duplicatas!=null &&
              java.util.Arrays.equals(this.duplicatas, other.getDuplicatas())));
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
        if (getNroFatura() != null) {
            _hashCode += getNroFatura().hashCode();
        }
        if (getDmIndEmit() != null) {
            _hashCode += getDmIndEmit().hashCode();
        }
        if (getDmIndTit() != null) {
            _hashCode += getDmIndTit().hashCode();
        }
        if (getVlOriginal() != null) {
            _hashCode += getVlOriginal().hashCode();
        }
        if (getVlDesconto() != null) {
            _hashCode += getVlDesconto().hashCode();
        }
        if (getVlLiquido() != null) {
            _hashCode += getVlLiquido().hashCode();
        }
        if (getDescrTit() != null) {
            _hashCode += getDescrTit().hashCode();
        }
        if (getDuplicatas() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDuplicatas());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDuplicatas(), i);
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
        new org.apache.axis.description.TypeDesc(TpCobranca.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "tpCobranca"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nroFatura");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "nroFatura"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dmIndEmit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "dmIndEmit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "tpDominio"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dmIndTit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "dmIndTit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "tpStringSizeTwoComplementos"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlOriginal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "vlOriginal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlDesconto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "vlDesconto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlLiquido");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "vlLiquido"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descrTit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "descrTit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("duplicatas");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "duplicatas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "tpDuplicatas"));
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
