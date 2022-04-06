/**
 * PirRendIsento.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.pagamentoImpRet;

public class PirRendIsento  implements java.io.Serializable {
    private java.math.BigDecimal cdTipoIsencao;

    private java.math.BigDecimal vlIsento;

    private java.lang.String descrRend;

    public PirRendIsento() {
    }

    public PirRendIsento(
           java.math.BigDecimal cdTipoIsencao,
           java.math.BigDecimal vlIsento,
           java.lang.String descrRend) {
           this.cdTipoIsencao = cdTipoIsencao;
           this.vlIsento = vlIsento;
           this.descrRend = descrRend;
    }


    /**
     * Gets the cdTipoIsencao value for this PirRendIsento.
     * 
     * @return cdTipoIsencao
     */
    public java.math.BigDecimal getCdTipoIsencao() {
        return cdTipoIsencao;
    }


    /**
     * Sets the cdTipoIsencao value for this PirRendIsento.
     * 
     * @param cdTipoIsencao
     */
    public void setCdTipoIsencao(java.math.BigDecimal cdTipoIsencao) {
        this.cdTipoIsencao = cdTipoIsencao;
    }


    /**
     * Gets the vlIsento value for this PirRendIsento.
     * 
     * @return vlIsento
     */
    public java.math.BigDecimal getVlIsento() {
        return vlIsento;
    }


    /**
     * Sets the vlIsento value for this PirRendIsento.
     * 
     * @param vlIsento
     */
    public void setVlIsento(java.math.BigDecimal vlIsento) {
        this.vlIsento = vlIsento;
    }


    /**
     * Gets the descrRend value for this PirRendIsento.
     * 
     * @return descrRend
     */
    public java.lang.String getDescrRend() {
        return descrRend;
    }


    /**
     * Sets the descrRend value for this PirRendIsento.
     * 
     * @param descrRend
     */
    public void setDescrRend(java.lang.String descrRend) {
        this.descrRend = descrRend;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PirRendIsento)) return false;
        PirRendIsento other = (PirRendIsento) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cdTipoIsencao==null && other.getCdTipoIsencao()==null) || 
             (this.cdTipoIsencao!=null &&
              this.cdTipoIsencao.equals(other.getCdTipoIsencao()))) &&
            ((this.vlIsento==null && other.getVlIsento()==null) || 
             (this.vlIsento!=null &&
              this.vlIsento.equals(other.getVlIsento()))) &&
            ((this.descrRend==null && other.getDescrRend()==null) || 
             (this.descrRend!=null &&
              this.descrRend.equals(other.getDescrRend())));
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
        if (getCdTipoIsencao() != null) {
            _hashCode += getCdTipoIsencao().hashCode();
        }
        if (getVlIsento() != null) {
            _hashCode += getVlIsento().hashCode();
        }
        if (getDescrRend() != null) {
            _hashCode += getDescrRend().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PirRendIsento.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/pagamentoImpRet", "pirRendIsento"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cdTipoIsencao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/pagamentoImpRet", "cdTipoIsencao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlIsento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/pagamentoImpRet", "vlIsento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descrRend");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/pagamentoImpRet", "descrRend"));
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
