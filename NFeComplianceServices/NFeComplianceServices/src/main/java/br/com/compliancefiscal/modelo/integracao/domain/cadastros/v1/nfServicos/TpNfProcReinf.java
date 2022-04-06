/**
 * TpNfProcReinf.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServicos;

public class TpNfProcReinf  implements java.io.Serializable {
    private org.apache.axis.types.NonNegativeInteger dmTpProc;

    private java.lang.String nroProc;

    private org.apache.axis.types.NonNegativeInteger codSusp;

    private java.lang.String dmIndProcRetAdic;

    private java.math.BigDecimal valor;

    public TpNfProcReinf() {
    }

    public TpNfProcReinf(
           org.apache.axis.types.NonNegativeInteger dmTpProc,
           java.lang.String nroProc,
           org.apache.axis.types.NonNegativeInteger codSusp,
           java.lang.String dmIndProcRetAdic,
           java.math.BigDecimal valor) {
           this.dmTpProc = dmTpProc;
           this.nroProc = nroProc;
           this.codSusp = codSusp;
           this.dmIndProcRetAdic = dmIndProcRetAdic;
           this.valor = valor;
    }


    /**
     * Gets the dmTpProc value for this TpNfProcReinf.
     * 
     * @return dmTpProc
     */
    public org.apache.axis.types.NonNegativeInteger getDmTpProc() {
        return dmTpProc;
    }


    /**
     * Sets the dmTpProc value for this TpNfProcReinf.
     * 
     * @param dmTpProc
     */
    public void setDmTpProc(org.apache.axis.types.NonNegativeInteger dmTpProc) {
        this.dmTpProc = dmTpProc;
    }


    /**
     * Gets the nroProc value for this TpNfProcReinf.
     * 
     * @return nroProc
     */
    public java.lang.String getNroProc() {
        return nroProc;
    }


    /**
     * Sets the nroProc value for this TpNfProcReinf.
     * 
     * @param nroProc
     */
    public void setNroProc(java.lang.String nroProc) {
        this.nroProc = nroProc;
    }


    /**
     * Gets the codSusp value for this TpNfProcReinf.
     * 
     * @return codSusp
     */
    public org.apache.axis.types.NonNegativeInteger getCodSusp() {
        return codSusp;
    }


    /**
     * Sets the codSusp value for this TpNfProcReinf.
     * 
     * @param codSusp
     */
    public void setCodSusp(org.apache.axis.types.NonNegativeInteger codSusp) {
        this.codSusp = codSusp;
    }


    /**
     * Gets the dmIndProcRetAdic value for this TpNfProcReinf.
     * 
     * @return dmIndProcRetAdic
     */
    public java.lang.String getDmIndProcRetAdic() {
        return dmIndProcRetAdic;
    }


    /**
     * Sets the dmIndProcRetAdic value for this TpNfProcReinf.
     * 
     * @param dmIndProcRetAdic
     */
    public void setDmIndProcRetAdic(java.lang.String dmIndProcRetAdic) {
        this.dmIndProcRetAdic = dmIndProcRetAdic;
    }


    /**
     * Gets the valor value for this TpNfProcReinf.
     * 
     * @return valor
     */
    public java.math.BigDecimal getValor() {
        return valor;
    }


    /**
     * Sets the valor value for this TpNfProcReinf.
     * 
     * @param valor
     */
    public void setValor(java.math.BigDecimal valor) {
        this.valor = valor;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TpNfProcReinf)) return false;
        TpNfProcReinf other = (TpNfProcReinf) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dmTpProc==null && other.getDmTpProc()==null) || 
             (this.dmTpProc!=null &&
              this.dmTpProc.equals(other.getDmTpProc()))) &&
            ((this.nroProc==null && other.getNroProc()==null) || 
             (this.nroProc!=null &&
              this.nroProc.equals(other.getNroProc()))) &&
            ((this.codSusp==null && other.getCodSusp()==null) || 
             (this.codSusp!=null &&
              this.codSusp.equals(other.getCodSusp()))) &&
            ((this.dmIndProcRetAdic==null && other.getDmIndProcRetAdic()==null) || 
             (this.dmIndProcRetAdic!=null &&
              this.dmIndProcRetAdic.equals(other.getDmIndProcRetAdic()))) &&
            ((this.valor==null && other.getValor()==null) || 
             (this.valor!=null &&
              this.valor.equals(other.getValor())));
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
        if (getDmTpProc() != null) {
            _hashCode += getDmTpProc().hashCode();
        }
        if (getNroProc() != null) {
            _hashCode += getNroProc().hashCode();
        }
        if (getCodSusp() != null) {
            _hashCode += getCodSusp().hashCode();
        }
        if (getDmIndProcRetAdic() != null) {
            _hashCode += getDmIndProcRetAdic().hashCode();
        }
        if (getValor() != null) {
            _hashCode += getValor().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TpNfProcReinf.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServicos", "tpNfProcReinf"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dmTpProc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServicos", "dmTpProc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "tpDominio"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nroProc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServicos", "nroProc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codSusp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServicos", "codSusp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dmIndProcRetAdic");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServicos", "dmIndProcRetAdic"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServicos", "valor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
