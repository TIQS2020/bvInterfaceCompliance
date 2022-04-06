/**
 * TpDocumentos.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServicos;

public class TpDocumentos  implements java.io.Serializable {
    private br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.TpCpfCnpj cpfCnpj;

    private java.lang.String ie;

    private java.lang.String inscricaoMunicipal;

    private java.lang.String suframa;

    public TpDocumentos() {
    }

    public TpDocumentos(
           br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.TpCpfCnpj cpfCnpj,
           java.lang.String ie,
           java.lang.String inscricaoMunicipal,
           java.lang.String suframa) {
           this.cpfCnpj = cpfCnpj;
           this.ie = ie;
           this.inscricaoMunicipal = inscricaoMunicipal;
           this.suframa = suframa;
    }


    /**
     * Gets the cpfCnpj value for this TpDocumentos.
     * 
     * @return cpfCnpj
     */
    public br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.TpCpfCnpj getCpfCnpj() {
        return cpfCnpj;
    }


    /**
     * Sets the cpfCnpj value for this TpDocumentos.
     * 
     * @param cpfCnpj
     */
    public void setCpfCnpj(br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.TpCpfCnpj cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }


    /**
     * Gets the ie value for this TpDocumentos.
     * 
     * @return ie
     */
    public java.lang.String getIe() {
        return ie;
    }


    /**
     * Sets the ie value for this TpDocumentos.
     * 
     * @param ie
     */
    public void setIe(java.lang.String ie) {
        this.ie = ie;
    }


    /**
     * Gets the inscricaoMunicipal value for this TpDocumentos.
     * 
     * @return inscricaoMunicipal
     */
    public java.lang.String getInscricaoMunicipal() {
        return inscricaoMunicipal;
    }


    /**
     * Sets the inscricaoMunicipal value for this TpDocumentos.
     * 
     * @param inscricaoMunicipal
     */
    public void setInscricaoMunicipal(java.lang.String inscricaoMunicipal) {
        this.inscricaoMunicipal = inscricaoMunicipal;
    }


    /**
     * Gets the suframa value for this TpDocumentos.
     * 
     * @return suframa
     */
    public java.lang.String getSuframa() {
        return suframa;
    }


    /**
     * Sets the suframa value for this TpDocumentos.
     * 
     * @param suframa
     */
    public void setSuframa(java.lang.String suframa) {
        this.suframa = suframa;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TpDocumentos)) return false;
        TpDocumentos other = (TpDocumentos) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cpfCnpj==null && other.getCpfCnpj()==null) || 
             (this.cpfCnpj!=null &&
              this.cpfCnpj.equals(other.getCpfCnpj()))) &&
            ((this.ie==null && other.getIe()==null) || 
             (this.ie!=null &&
              this.ie.equals(other.getIe()))) &&
            ((this.inscricaoMunicipal==null && other.getInscricaoMunicipal()==null) || 
             (this.inscricaoMunicipal!=null &&
              this.inscricaoMunicipal.equals(other.getInscricaoMunicipal()))) &&
            ((this.suframa==null && other.getSuframa()==null) || 
             (this.suframa!=null &&
              this.suframa.equals(other.getSuframa())));
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
        if (getCpfCnpj() != null) {
            _hashCode += getCpfCnpj().hashCode();
        }
        if (getIe() != null) {
            _hashCode += getIe().hashCode();
        }
        if (getInscricaoMunicipal() != null) {
            _hashCode += getInscricaoMunicipal().hashCode();
        }
        if (getSuframa() != null) {
            _hashCode += getSuframa().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TpDocumentos.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServicos", "tpDocumentos"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpfCnpj");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServicos", "cpfCnpj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "tpCpfCnpj"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ie");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServicos", "ie"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inscricaoMunicipal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServicos", "inscricaoMunicipal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("suframa");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServicos", "suframa"));
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
