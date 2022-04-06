/**
 * TpParticipante.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServicos;

public class TpParticipante  implements java.io.Serializable {
    private java.lang.String nome;

    private br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServicos.TpEndereco endereco;

    private br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServicos.TpContato contato;

    private br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServicos.TpDocumentos documentos;

    public TpParticipante() {
    }

    public TpParticipante(
           java.lang.String nome,
           br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServicos.TpEndereco endereco,
           br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServicos.TpContato contato,
           br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServicos.TpDocumentos documentos) {
           this.nome = nome;
           this.endereco = endereco;
           this.contato = contato;
           this.documentos = documentos;
    }


    /**
     * Gets the nome value for this TpParticipante.
     * 
     * @return nome
     */
    public java.lang.String getNome() {
        return nome;
    }


    /**
     * Sets the nome value for this TpParticipante.
     * 
     * @param nome
     */
    public void setNome(java.lang.String nome) {
        this.nome = nome;
    }


    /**
     * Gets the endereco value for this TpParticipante.
     * 
     * @return endereco
     */
    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServicos.TpEndereco getEndereco() {
        return endereco;
    }


    /**
     * Sets the endereco value for this TpParticipante.
     * 
     * @param endereco
     */
    public void setEndereco(br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServicos.TpEndereco endereco) {
        this.endereco = endereco;
    }


    /**
     * Gets the contato value for this TpParticipante.
     * 
     * @return contato
     */
    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServicos.TpContato getContato() {
        return contato;
    }


    /**
     * Sets the contato value for this TpParticipante.
     * 
     * @param contato
     */
    public void setContato(br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServicos.TpContato contato) {
        this.contato = contato;
    }


    /**
     * Gets the documentos value for this TpParticipante.
     * 
     * @return documentos
     */
    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServicos.TpDocumentos getDocumentos() {
        return documentos;
    }


    /**
     * Sets the documentos value for this TpParticipante.
     * 
     * @param documentos
     */
    public void setDocumentos(br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServicos.TpDocumentos documentos) {
        this.documentos = documentos;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TpParticipante)) return false;
        TpParticipante other = (TpParticipante) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nome==null && other.getNome()==null) || 
             (this.nome!=null &&
              this.nome.equals(other.getNome()))) &&
            ((this.endereco==null && other.getEndereco()==null) || 
             (this.endereco!=null &&
              this.endereco.equals(other.getEndereco()))) &&
            ((this.contato==null && other.getContato()==null) || 
             (this.contato!=null &&
              this.contato.equals(other.getContato()))) &&
            ((this.documentos==null && other.getDocumentos()==null) || 
             (this.documentos!=null &&
              this.documentos.equals(other.getDocumentos())));
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
        if (getNome() != null) {
            _hashCode += getNome().hashCode();
        }
        if (getEndereco() != null) {
            _hashCode += getEndereco().hashCode();
        }
        if (getContato() != null) {
            _hashCode += getContato().hashCode();
        }
        if (getDocumentos() != null) {
            _hashCode += getDocumentos().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TpParticipante.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServicos", "tpParticipante"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nome");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServicos", "nome"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endereco");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServicos", "endereco"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServicos", "tpEndereco"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contato");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServicos", "contato"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServicos", "tpContato"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentos");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServicos", "documentos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServicos", "tpDocumentos"));
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
