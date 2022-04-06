/**
 * ConsultaGenerica.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.consultaGenerica;

public class ConsultaGenerica  implements java.io.Serializable {
    private org.apache.axis.types.NonNegativeInteger nroLote;

    private org.apache.axis.types.NonNegativeInteger situacaoLote;

    private java.lang.String descrSitLote;

    private java.lang.String objIntegr;

    private java.lang.String tipoObjIntegr;

    private br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.consultaGenerica.ErroLote erroLote;

    private br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.consultaGenerica.Dados[] dados;

    public ConsultaGenerica() {
    }

    public ConsultaGenerica(
           org.apache.axis.types.NonNegativeInteger nroLote,
           org.apache.axis.types.NonNegativeInteger situacaoLote,
           java.lang.String descrSitLote,
           java.lang.String objIntegr,
           java.lang.String tipoObjIntegr,
           br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.consultaGenerica.ErroLote erroLote,
           br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.consultaGenerica.Dados[] dados) {
           this.nroLote = nroLote;
           this.situacaoLote = situacaoLote;
           this.descrSitLote = descrSitLote;
           this.objIntegr = objIntegr;
           this.tipoObjIntegr = tipoObjIntegr;
           this.erroLote = erroLote;
           this.dados = dados;
    }


    /**
     * Gets the nroLote value for this ConsultaGenerica.
     * 
     * @return nroLote
     */
    public org.apache.axis.types.NonNegativeInteger getNroLote() {
        return nroLote;
    }


    /**
     * Sets the nroLote value for this ConsultaGenerica.
     * 
     * @param nroLote
     */
    public void setNroLote(org.apache.axis.types.NonNegativeInteger nroLote) {
        this.nroLote = nroLote;
    }


    /**
     * Gets the situacaoLote value for this ConsultaGenerica.
     * 
     * @return situacaoLote
     */
    public org.apache.axis.types.NonNegativeInteger getSituacaoLote() {
        return situacaoLote;
    }


    /**
     * Sets the situacaoLote value for this ConsultaGenerica.
     * 
     * @param situacaoLote
     */
    public void setSituacaoLote(org.apache.axis.types.NonNegativeInteger situacaoLote) {
        this.situacaoLote = situacaoLote;
    }


    /**
     * Gets the descrSitLote value for this ConsultaGenerica.
     * 
     * @return descrSitLote
     */
    public java.lang.String getDescrSitLote() {
        return descrSitLote;
    }


    /**
     * Sets the descrSitLote value for this ConsultaGenerica.
     * 
     * @param descrSitLote
     */
    public void setDescrSitLote(java.lang.String descrSitLote) {
        this.descrSitLote = descrSitLote;
    }


    /**
     * Gets the objIntegr value for this ConsultaGenerica.
     * 
     * @return objIntegr
     */
    public java.lang.String getObjIntegr() {
        return objIntegr;
    }


    /**
     * Sets the objIntegr value for this ConsultaGenerica.
     * 
     * @param objIntegr
     */
    public void setObjIntegr(java.lang.String objIntegr) {
        this.objIntegr = objIntegr;
    }


    /**
     * Gets the tipoObjIntegr value for this ConsultaGenerica.
     * 
     * @return tipoObjIntegr
     */
    public java.lang.String getTipoObjIntegr() {
        return tipoObjIntegr;
    }


    /**
     * Sets the tipoObjIntegr value for this ConsultaGenerica.
     * 
     * @param tipoObjIntegr
     */
    public void setTipoObjIntegr(java.lang.String tipoObjIntegr) {
        this.tipoObjIntegr = tipoObjIntegr;
    }


    /**
     * Gets the erroLote value for this ConsultaGenerica.
     * 
     * @return erroLote
     */
    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.consultaGenerica.ErroLote getErroLote() {
        return erroLote;
    }


    /**
     * Sets the erroLote value for this ConsultaGenerica.
     * 
     * @param erroLote
     */
    public void setErroLote(br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.consultaGenerica.ErroLote erroLote) {
        this.erroLote = erroLote;
    }


    /**
     * Gets the dados value for this ConsultaGenerica.
     * 
     * @return dados
     */
    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.consultaGenerica.Dados[] getDados() {
        return dados;
    }


    /**
     * Sets the dados value for this ConsultaGenerica.
     * 
     * @param dados
     */
    public void setDados(br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.consultaGenerica.Dados[] dados) {
        this.dados = dados;
    }

    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.consultaGenerica.Dados getDados(int i) {
        return this.dados[i];
    }

    public void setDados(int i, br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.consultaGenerica.Dados _value) {
        this.dados[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConsultaGenerica)) return false;
        ConsultaGenerica other = (ConsultaGenerica) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nroLote==null && other.getNroLote()==null) || 
             (this.nroLote!=null &&
              this.nroLote.equals(other.getNroLote()))) &&
            ((this.situacaoLote==null && other.getSituacaoLote()==null) || 
             (this.situacaoLote!=null &&
              this.situacaoLote.equals(other.getSituacaoLote()))) &&
            ((this.descrSitLote==null && other.getDescrSitLote()==null) || 
             (this.descrSitLote!=null &&
              this.descrSitLote.equals(other.getDescrSitLote()))) &&
            ((this.objIntegr==null && other.getObjIntegr()==null) || 
             (this.objIntegr!=null &&
              this.objIntegr.equals(other.getObjIntegr()))) &&
            ((this.tipoObjIntegr==null && other.getTipoObjIntegr()==null) || 
             (this.tipoObjIntegr!=null &&
              this.tipoObjIntegr.equals(other.getTipoObjIntegr()))) &&
            ((this.erroLote==null && other.getErroLote()==null) || 
             (this.erroLote!=null &&
              this.erroLote.equals(other.getErroLote()))) &&
            ((this.dados==null && other.getDados()==null) || 
             (this.dados!=null &&
              java.util.Arrays.equals(this.dados, other.getDados())));
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
        if (getNroLote() != null) {
            _hashCode += getNroLote().hashCode();
        }
        if (getSituacaoLote() != null) {
            _hashCode += getSituacaoLote().hashCode();
        }
        if (getDescrSitLote() != null) {
            _hashCode += getDescrSitLote().hashCode();
        }
        if (getObjIntegr() != null) {
            _hashCode += getObjIntegr().hashCode();
        }
        if (getTipoObjIntegr() != null) {
            _hashCode += getTipoObjIntegr().hashCode();
        }
        if (getErroLote() != null) {
            _hashCode += getErroLote().hashCode();
        }
        if (getDados() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDados());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDados(), i);
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
        new org.apache.axis.description.TypeDesc(ConsultaGenerica.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "consultaGenerica"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nroLote");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "nroLote"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("situacaoLote");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "situacaoLote"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descrSitLote");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "descrSitLote"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objIntegr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "objIntegr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoObjIntegr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "tipoObjIntegr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("erroLote");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "erroLote"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "erroLote"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dados");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "dados"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "dados"));
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
