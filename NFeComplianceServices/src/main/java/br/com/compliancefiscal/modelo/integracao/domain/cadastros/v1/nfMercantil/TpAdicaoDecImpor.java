/**
 * TpAdicaoDecImpor.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil;

public class TpAdicaoDecImpor  implements java.io.Serializable {
    private org.apache.axis.types.NonNegativeInteger nroAdicao;

    private org.apache.axis.types.NonNegativeInteger nroSeqAdic;

    private java.lang.String codPartFabricante;

    private java.math.BigDecimal vlDescDi;

    private java.lang.String numAcdraw;

    public TpAdicaoDecImpor() {
    }

    public TpAdicaoDecImpor(
           org.apache.axis.types.NonNegativeInteger nroAdicao,
           org.apache.axis.types.NonNegativeInteger nroSeqAdic,
           java.lang.String codPartFabricante,
           java.math.BigDecimal vlDescDi,
           java.lang.String numAcdraw) {
           this.nroAdicao = nroAdicao;
           this.nroSeqAdic = nroSeqAdic;
           this.codPartFabricante = codPartFabricante;
           this.vlDescDi = vlDescDi;
           this.numAcdraw = numAcdraw;
    }


    /**
     * Gets the nroAdicao value for this TpAdicaoDecImpor.
     * 
     * @return nroAdicao
     */
    public org.apache.axis.types.NonNegativeInteger getNroAdicao() {
        return nroAdicao;
    }


    /**
     * Sets the nroAdicao value for this TpAdicaoDecImpor.
     * 
     * @param nroAdicao
     */
    public void setNroAdicao(org.apache.axis.types.NonNegativeInteger nroAdicao) {
        this.nroAdicao = nroAdicao;
    }


    /**
     * Gets the nroSeqAdic value for this TpAdicaoDecImpor.
     * 
     * @return nroSeqAdic
     */
    public org.apache.axis.types.NonNegativeInteger getNroSeqAdic() {
        return nroSeqAdic;
    }


    /**
     * Sets the nroSeqAdic value for this TpAdicaoDecImpor.
     * 
     * @param nroSeqAdic
     */
    public void setNroSeqAdic(org.apache.axis.types.NonNegativeInteger nroSeqAdic) {
        this.nroSeqAdic = nroSeqAdic;
    }


    /**
     * Gets the codPartFabricante value for this TpAdicaoDecImpor.
     * 
     * @return codPartFabricante
     */
    public java.lang.String getCodPartFabricante() {
        return codPartFabricante;
    }


    /**
     * Sets the codPartFabricante value for this TpAdicaoDecImpor.
     * 
     * @param codPartFabricante
     */
    public void setCodPartFabricante(java.lang.String codPartFabricante) {
        this.codPartFabricante = codPartFabricante;
    }


    /**
     * Gets the vlDescDi value for this TpAdicaoDecImpor.
     * 
     * @return vlDescDi
     */
    public java.math.BigDecimal getVlDescDi() {
        return vlDescDi;
    }


    /**
     * Sets the vlDescDi value for this TpAdicaoDecImpor.
     * 
     * @param vlDescDi
     */
    public void setVlDescDi(java.math.BigDecimal vlDescDi) {
        this.vlDescDi = vlDescDi;
    }


    /**
     * Gets the numAcdraw value for this TpAdicaoDecImpor.
     * 
     * @return numAcdraw
     */
    public java.lang.String getNumAcdraw() {
        return numAcdraw;
    }


    /**
     * Sets the numAcdraw value for this TpAdicaoDecImpor.
     * 
     * @param numAcdraw
     */
    public void setNumAcdraw(java.lang.String numAcdraw) {
        this.numAcdraw = numAcdraw;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TpAdicaoDecImpor)) return false;
        TpAdicaoDecImpor other = (TpAdicaoDecImpor) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nroAdicao==null && other.getNroAdicao()==null) || 
             (this.nroAdicao!=null &&
              this.nroAdicao.equals(other.getNroAdicao()))) &&
            ((this.nroSeqAdic==null && other.getNroSeqAdic()==null) || 
             (this.nroSeqAdic!=null &&
              this.nroSeqAdic.equals(other.getNroSeqAdic()))) &&
            ((this.codPartFabricante==null && other.getCodPartFabricante()==null) || 
             (this.codPartFabricante!=null &&
              this.codPartFabricante.equals(other.getCodPartFabricante()))) &&
            ((this.vlDescDi==null && other.getVlDescDi()==null) || 
             (this.vlDescDi!=null &&
              this.vlDescDi.equals(other.getVlDescDi()))) &&
            ((this.numAcdraw==null && other.getNumAcdraw()==null) || 
             (this.numAcdraw!=null &&
              this.numAcdraw.equals(other.getNumAcdraw())));
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
        if (getNroAdicao() != null) {
            _hashCode += getNroAdicao().hashCode();
        }
        if (getNroSeqAdic() != null) {
            _hashCode += getNroSeqAdic().hashCode();
        }
        if (getCodPartFabricante() != null) {
            _hashCode += getCodPartFabricante().hashCode();
        }
        if (getVlDescDi() != null) {
            _hashCode += getVlDescDi().hashCode();
        }
        if (getNumAcdraw() != null) {
            _hashCode += getNumAcdraw().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TpAdicaoDecImpor.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "tpAdicaoDecImpor"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nroAdicao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "nroAdicao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nroSeqAdic");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "nroSeqAdic"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codPartFabricante");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "codPartFabricante"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlDescDi");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "vlDescDi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numAcdraw");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "numAcdraw"));
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
