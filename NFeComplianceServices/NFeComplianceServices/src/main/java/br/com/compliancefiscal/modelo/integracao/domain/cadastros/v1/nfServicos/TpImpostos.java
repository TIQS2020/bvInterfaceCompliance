/**
 * TpImpostos.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServicos;

public class TpImpostos  implements java.io.Serializable {
    private org.apache.axis.types.NonNegativeInteger codImposto;

    private org.apache.axis.types.NonNegativeInteger tipo;

    private java.lang.String codSt;

    private java.math.BigDecimal vlBaseCalc;

    private java.math.BigDecimal aliquota;

    private java.math.BigDecimal vlImpTrib;

    private java.math.BigDecimal vlDeducao;

    private org.apache.axis.types.NonNegativeInteger naturezaReceitaPisCofins;

    private java.lang.String tipoRetencaoImposto;

    private java.lang.String codReceita;

    private br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServicos.TpAposentEspecial aposentEspecial;

    public TpImpostos() {
    }

    public TpImpostos(
           org.apache.axis.types.NonNegativeInteger codImposto,
           org.apache.axis.types.NonNegativeInteger tipo,
           java.lang.String codSt,
           java.math.BigDecimal vlBaseCalc,
           java.math.BigDecimal aliquota,
           java.math.BigDecimal vlImpTrib,
           java.math.BigDecimal vlDeducao,
           org.apache.axis.types.NonNegativeInteger naturezaReceitaPisCofins,
           java.lang.String tipoRetencaoImposto,
           java.lang.String codReceita,
           br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServicos.TpAposentEspecial aposentEspecial) {
           this.codImposto = codImposto;
           this.tipo = tipo;
           this.codSt = codSt;
           this.vlBaseCalc = vlBaseCalc;
           this.aliquota = aliquota;
           this.vlImpTrib = vlImpTrib;
           this.vlDeducao = vlDeducao;
           this.naturezaReceitaPisCofins = naturezaReceitaPisCofins;
           this.tipoRetencaoImposto = tipoRetencaoImposto;
           this.codReceita = codReceita;
           this.aposentEspecial = aposentEspecial;
    }


    /**
     * Gets the codImposto value for this TpImpostos.
     * 
     * @return codImposto
     */
    public org.apache.axis.types.NonNegativeInteger getCodImposto() {
        return codImposto;
    }


    /**
     * Sets the codImposto value for this TpImpostos.
     * 
     * @param codImposto
     */
    public void setCodImposto(org.apache.axis.types.NonNegativeInteger codImposto) {
        this.codImposto = codImposto;
    }


    /**
     * Gets the tipo value for this TpImpostos.
     * 
     * @return tipo
     */
    public org.apache.axis.types.NonNegativeInteger getTipo() {
        return tipo;
    }


    /**
     * Sets the tipo value for this TpImpostos.
     * 
     * @param tipo
     */
    public void setTipo(org.apache.axis.types.NonNegativeInteger tipo) {
        this.tipo = tipo;
    }


    /**
     * Gets the codSt value for this TpImpostos.
     * 
     * @return codSt
     */
    public java.lang.String getCodSt() {
        return codSt;
    }


    /**
     * Sets the codSt value for this TpImpostos.
     * 
     * @param codSt
     */
    public void setCodSt(java.lang.String codSt) {
        this.codSt = codSt;
    }


    /**
     * Gets the vlBaseCalc value for this TpImpostos.
     * 
     * @return vlBaseCalc
     */
    public java.math.BigDecimal getVlBaseCalc() {
        return vlBaseCalc;
    }


    /**
     * Sets the vlBaseCalc value for this TpImpostos.
     * 
     * @param vlBaseCalc
     */
    public void setVlBaseCalc(java.math.BigDecimal vlBaseCalc) {
        this.vlBaseCalc = vlBaseCalc;
    }


    /**
     * Gets the aliquota value for this TpImpostos.
     * 
     * @return aliquota
     */
    public java.math.BigDecimal getAliquota() {
        return aliquota;
    }


    /**
     * Sets the aliquota value for this TpImpostos.
     * 
     * @param aliquota
     */
    public void setAliquota(java.math.BigDecimal aliquota) {
        this.aliquota = aliquota;
    }


    /**
     * Gets the vlImpTrib value for this TpImpostos.
     * 
     * @return vlImpTrib
     */
    public java.math.BigDecimal getVlImpTrib() {
        return vlImpTrib;
    }


    /**
     * Sets the vlImpTrib value for this TpImpostos.
     * 
     * @param vlImpTrib
     */
    public void setVlImpTrib(java.math.BigDecimal vlImpTrib) {
        this.vlImpTrib = vlImpTrib;
    }


    /**
     * Gets the vlDeducao value for this TpImpostos.
     * 
     * @return vlDeducao
     */
    public java.math.BigDecimal getVlDeducao() {
        return vlDeducao;
    }


    /**
     * Sets the vlDeducao value for this TpImpostos.
     * 
     * @param vlDeducao
     */
    public void setVlDeducao(java.math.BigDecimal vlDeducao) {
        this.vlDeducao = vlDeducao;
    }


    /**
     * Gets the naturezaReceitaPisCofins value for this TpImpostos.
     * 
     * @return naturezaReceitaPisCofins
     */
    public org.apache.axis.types.NonNegativeInteger getNaturezaReceitaPisCofins() {
        return naturezaReceitaPisCofins;
    }


    /**
     * Sets the naturezaReceitaPisCofins value for this TpImpostos.
     * 
     * @param naturezaReceitaPisCofins
     */
    public void setNaturezaReceitaPisCofins(org.apache.axis.types.NonNegativeInteger naturezaReceitaPisCofins) {
        this.naturezaReceitaPisCofins = naturezaReceitaPisCofins;
    }


    /**
     * Gets the tipoRetencaoImposto value for this TpImpostos.
     * 
     * @return tipoRetencaoImposto
     */
    public java.lang.String getTipoRetencaoImposto() {
        return tipoRetencaoImposto;
    }


    /**
     * Sets the tipoRetencaoImposto value for this TpImpostos.
     * 
     * @param tipoRetencaoImposto
     */
    public void setTipoRetencaoImposto(java.lang.String tipoRetencaoImposto) {
        this.tipoRetencaoImposto = tipoRetencaoImposto;
    }


    /**
     * Gets the codReceita value for this TpImpostos.
     * 
     * @return codReceita
     */
    public java.lang.String getCodReceita() {
        return codReceita;
    }


    /**
     * Sets the codReceita value for this TpImpostos.
     * 
     * @param codReceita
     */
    public void setCodReceita(java.lang.String codReceita) {
        this.codReceita = codReceita;
    }


    /**
     * Gets the aposentEspecial value for this TpImpostos.
     * 
     * @return aposentEspecial
     */
    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServicos.TpAposentEspecial getAposentEspecial() {
        return aposentEspecial;
    }


    /**
     * Sets the aposentEspecial value for this TpImpostos.
     * 
     * @param aposentEspecial
     */
    public void setAposentEspecial(br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServicos.TpAposentEspecial aposentEspecial) {
        this.aposentEspecial = aposentEspecial;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TpImpostos)) return false;
        TpImpostos other = (TpImpostos) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codImposto==null && other.getCodImposto()==null) || 
             (this.codImposto!=null &&
              this.codImposto.equals(other.getCodImposto()))) &&
            ((this.tipo==null && other.getTipo()==null) || 
             (this.tipo!=null &&
              this.tipo.equals(other.getTipo()))) &&
            ((this.codSt==null && other.getCodSt()==null) || 
             (this.codSt!=null &&
              this.codSt.equals(other.getCodSt()))) &&
            ((this.vlBaseCalc==null && other.getVlBaseCalc()==null) || 
             (this.vlBaseCalc!=null &&
              this.vlBaseCalc.equals(other.getVlBaseCalc()))) &&
            ((this.aliquota==null && other.getAliquota()==null) || 
             (this.aliquota!=null &&
              this.aliquota.equals(other.getAliquota()))) &&
            ((this.vlImpTrib==null && other.getVlImpTrib()==null) || 
             (this.vlImpTrib!=null &&
              this.vlImpTrib.equals(other.getVlImpTrib()))) &&
            ((this.vlDeducao==null && other.getVlDeducao()==null) || 
             (this.vlDeducao!=null &&
              this.vlDeducao.equals(other.getVlDeducao()))) &&
            ((this.naturezaReceitaPisCofins==null && other.getNaturezaReceitaPisCofins()==null) || 
             (this.naturezaReceitaPisCofins!=null &&
              this.naturezaReceitaPisCofins.equals(other.getNaturezaReceitaPisCofins()))) &&
            ((this.tipoRetencaoImposto==null && other.getTipoRetencaoImposto()==null) || 
             (this.tipoRetencaoImposto!=null &&
              this.tipoRetencaoImposto.equals(other.getTipoRetencaoImposto()))) &&
            ((this.codReceita==null && other.getCodReceita()==null) || 
             (this.codReceita!=null &&
              this.codReceita.equals(other.getCodReceita()))) &&
            ((this.aposentEspecial==null && other.getAposentEspecial()==null) || 
             (this.aposentEspecial!=null &&
              this.aposentEspecial.equals(other.getAposentEspecial())));
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
        if (getCodImposto() != null) {
            _hashCode += getCodImposto().hashCode();
        }
        if (getTipo() != null) {
            _hashCode += getTipo().hashCode();
        }
        if (getCodSt() != null) {
            _hashCode += getCodSt().hashCode();
        }
        if (getVlBaseCalc() != null) {
            _hashCode += getVlBaseCalc().hashCode();
        }
        if (getAliquota() != null) {
            _hashCode += getAliquota().hashCode();
        }
        if (getVlImpTrib() != null) {
            _hashCode += getVlImpTrib().hashCode();
        }
        if (getVlDeducao() != null) {
            _hashCode += getVlDeducao().hashCode();
        }
        if (getNaturezaReceitaPisCofins() != null) {
            _hashCode += getNaturezaReceitaPisCofins().hashCode();
        }
        if (getTipoRetencaoImposto() != null) {
            _hashCode += getTipoRetencaoImposto().hashCode();
        }
        if (getCodReceita() != null) {
            _hashCode += getCodReceita().hashCode();
        }
        if (getAposentEspecial() != null) {
            _hashCode += getAposentEspecial().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TpImpostos.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServicos", "tpImpostos"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codImposto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServicos", "codImposto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServicos", "tipo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "tpDominio"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codSt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServicos", "codSt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlBaseCalc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServicos", "vlBaseCalc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aliquota");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServicos", "aliquota"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlImpTrib");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServicos", "vlImpTrib"));
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
        elemField.setFieldName("naturezaReceitaPisCofins");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServicos", "naturezaReceitaPisCofins"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoRetencaoImposto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServicos", "tipoRetencaoImposto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codReceita");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServicos", "codReceita"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aposentEspecial");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServicos", "aposentEspecial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServicos", "tpAposentEspecial"));
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
