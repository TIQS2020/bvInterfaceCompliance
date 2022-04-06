/**
 * PirDetDed.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.pagamentoImpRet;

public class PirDetDed  implements java.io.Serializable {
    private br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.pagamentoImpRet.DmIndTpDeducao tpDeducao;

    private java.math.BigDecimal vlDeducao;

    public PirDetDed() {
    }

    public PirDetDed(
           br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.pagamentoImpRet.DmIndTpDeducao tpDeducao,
           java.math.BigDecimal vlDeducao) {
           this.tpDeducao = tpDeducao;
           this.vlDeducao = vlDeducao;
    }


    /**
     * Gets the tpDeducao value for this PirDetDed.
     * 
     * @return tpDeducao
     */
    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.pagamentoImpRet.DmIndTpDeducao getTpDeducao() {
        return tpDeducao;
    }


    /**
     * Sets the tpDeducao value for this PirDetDed.
     * 
     * @param tpDeducao
     */
    public void setTpDeducao(br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.pagamentoImpRet.DmIndTpDeducao tpDeducao) {
        this.tpDeducao = tpDeducao;
    }


    /**
     * Gets the vlDeducao value for this PirDetDed.
     * 
     * @return vlDeducao
     */
    public java.math.BigDecimal getVlDeducao() {
        return vlDeducao;
    }


    /**
     * Sets the vlDeducao value for this PirDetDed.
     * 
     * @param vlDeducao
     */
    public void setVlDeducao(java.math.BigDecimal vlDeducao) {
        this.vlDeducao = vlDeducao;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PirDetDed)) return false;
        PirDetDed other = (PirDetDed) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tpDeducao==null && other.getTpDeducao()==null) || 
             (this.tpDeducao!=null &&
              this.tpDeducao.equals(other.getTpDeducao()))) &&
            ((this.vlDeducao==null && other.getVlDeducao()==null) || 
             (this.vlDeducao!=null &&
              this.vlDeducao.equals(other.getVlDeducao())));
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
        if (getTpDeducao() != null) {
            _hashCode += getTpDeducao().hashCode();
        }
        if (getVlDeducao() != null) {
            _hashCode += getVlDeducao().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PirDetDed.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/pagamentoImpRet", "pirDetDed"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tpDeducao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/pagamentoImpRet", "tpDeducao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/pagamentoImpRet", "dmIndTpDeducao"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlDeducao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/pagamentoImpRet", "vlDeducao"));
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
