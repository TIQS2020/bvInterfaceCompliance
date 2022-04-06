/**
 * Participante.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.participante;

public class Participante  implements java.io.Serializable {
    private java.lang.String codPart;

    private java.math.BigInteger dmTipoPessoa;

    private java.lang.String nome;

    private java.lang.String fantasia;

    private br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.participante.Endereco endereco;

    private br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.participante.Contato contato;

    private br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.participante.Documentos documentos;

    private br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.participante.TipoParametro tiposParametros;

    private br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.participante.PessoaInfoPir pessoaInfoPir;

    public Participante() {
    }

    public Participante(
           java.lang.String codPart,
           java.math.BigInteger dmTipoPessoa,
           java.lang.String nome,
           java.lang.String fantasia,
           br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.participante.Endereco endereco,
           br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.participante.Contato contato,
           br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.participante.Documentos documentos,
           br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.participante.TipoParametro tiposParametros,
           br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.participante.PessoaInfoPir pessoaInfoPir) {
           this.codPart = codPart;
           this.dmTipoPessoa = dmTipoPessoa;
           this.nome = nome;
           this.fantasia = fantasia;
           this.endereco = endereco;
           this.contato = contato;
           this.documentos = documentos;
           this.tiposParametros = tiposParametros;
           this.pessoaInfoPir = pessoaInfoPir;
    }


    /**
     * Gets the codPart value for this Participante.
     * 
     * @return codPart
     */
    public java.lang.String getCodPart() {
        return codPart;
    }


    /**
     * Sets the codPart value for this Participante.
     * 
     * @param codPart
     */
    public void setCodPart(java.lang.String codPart) {
        this.codPart = codPart;
    }


    /**
     * Gets the dmTipoPessoa value for this Participante.
     * 
     * @return dmTipoPessoa
     */
    public java.math.BigInteger getDmTipoPessoa() {
        return dmTipoPessoa;
    }


    /**
     * Sets the dmTipoPessoa value for this Participante.
     * 
     * @param dmTipoPessoa
     */
    public void setDmTipoPessoa(java.math.BigInteger dmTipoPessoa) {
        this.dmTipoPessoa = dmTipoPessoa;
    }


    /**
     * Gets the nome value for this Participante.
     * 
     * @return nome
     */
    public java.lang.String getNome() {
        return nome;
    }


    /**
     * Sets the nome value for this Participante.
     * 
     * @param nome
     */
    public void setNome(java.lang.String nome) {
        this.nome = nome;
    }


    /**
     * Gets the fantasia value for this Participante.
     * 
     * @return fantasia
     */
    public java.lang.String getFantasia() {
        return fantasia;
    }


    /**
     * Sets the fantasia value for this Participante.
     * 
     * @param fantasia
     */
    public void setFantasia(java.lang.String fantasia) {
        this.fantasia = fantasia;
    }


    /**
     * Gets the endereco value for this Participante.
     * 
     * @return endereco
     */
    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.participante.Endereco getEndereco() {
        return endereco;
    }


    /**
     * Sets the endereco value for this Participante.
     * 
     * @param endereco
     */
    public void setEndereco(br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.participante.Endereco endereco) {
        this.endereco = endereco;
    }


    /**
     * Gets the contato value for this Participante.
     * 
     * @return contato
     */
    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.participante.Contato getContato() {
        return contato;
    }


    /**
     * Sets the contato value for this Participante.
     * 
     * @param contato
     */
    public void setContato(br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.participante.Contato contato) {
        this.contato = contato;
    }


    /**
     * Gets the documentos value for this Participante.
     * 
     * @return documentos
     */
    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.participante.Documentos getDocumentos() {
        return documentos;
    }


    /**
     * Sets the documentos value for this Participante.
     * 
     * @param documentos
     */
    public void setDocumentos(br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.participante.Documentos documentos) {
        this.documentos = documentos;
    }


    /**
     * Gets the tiposParametros value for this Participante.
     * 
     * @return tiposParametros
     */
    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.participante.TipoParametro getTiposParametros() {
        return tiposParametros;
    }


    /**
     * Sets the tiposParametros value for this Participante.
     * 
     * @param tiposParametros
     */
    public void setTiposParametros(br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.participante.TipoParametro tiposParametros) {
        this.tiposParametros = tiposParametros;
    }


    /**
     * Gets the pessoaInfoPir value for this Participante.
     * 
     * @return pessoaInfoPir
     */
    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.participante.PessoaInfoPir getPessoaInfoPir() {
        return pessoaInfoPir;
    }


    /**
     * Sets the pessoaInfoPir value for this Participante.
     * 
     * @param pessoaInfoPir
     */
    public void setPessoaInfoPir(br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.participante.PessoaInfoPir pessoaInfoPir) {
        this.pessoaInfoPir = pessoaInfoPir;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Participante)) return false;
        Participante other = (Participante) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codPart==null && other.getCodPart()==null) || 
             (this.codPart!=null &&
              this.codPart.equals(other.getCodPart()))) &&
            ((this.dmTipoPessoa==null && other.getDmTipoPessoa()==null) || 
             (this.dmTipoPessoa!=null &&
              this.dmTipoPessoa.equals(other.getDmTipoPessoa()))) &&
            ((this.nome==null && other.getNome()==null) || 
             (this.nome!=null &&
              this.nome.equals(other.getNome()))) &&
            ((this.fantasia==null && other.getFantasia()==null) || 
             (this.fantasia!=null &&
              this.fantasia.equals(other.getFantasia()))) &&
            ((this.endereco==null && other.getEndereco()==null) || 
             (this.endereco!=null &&
              this.endereco.equals(other.getEndereco()))) &&
            ((this.contato==null && other.getContato()==null) || 
             (this.contato!=null &&
              this.contato.equals(other.getContato()))) &&
            ((this.documentos==null && other.getDocumentos()==null) || 
             (this.documentos!=null &&
              this.documentos.equals(other.getDocumentos()))) &&
            ((this.tiposParametros==null && other.getTiposParametros()==null) || 
             (this.tiposParametros!=null &&
              this.tiposParametros.equals(other.getTiposParametros()))) &&
            ((this.pessoaInfoPir==null && other.getPessoaInfoPir()==null) || 
             (this.pessoaInfoPir!=null &&
              this.pessoaInfoPir.equals(other.getPessoaInfoPir())));
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
        if (getCodPart() != null) {
            _hashCode += getCodPart().hashCode();
        }
        if (getDmTipoPessoa() != null) {
            _hashCode += getDmTipoPessoa().hashCode();
        }
        if (getNome() != null) {
            _hashCode += getNome().hashCode();
        }
        if (getFantasia() != null) {
            _hashCode += getFantasia().hashCode();
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
        if (getTiposParametros() != null) {
            _hashCode += getTiposParametros().hashCode();
        }
        if (getPessoaInfoPir() != null) {
            _hashCode += getPessoaInfoPir().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Participante.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/participante", "participante"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codPart");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/participante", "codPart"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dmTipoPessoa");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/participante", "dmTipoPessoa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nome");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/participante", "nome"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fantasia");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/participante", "fantasia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endereco");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/participante", "endereco"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/participante", "endereco"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contato");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/participante", "contato"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/participante", "contato"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentos");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/participante", "documentos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/participante", "documentos"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tiposParametros");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/participante", "tiposParametros"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/participante", "tipoParametro"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pessoaInfoPir");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/participante", "pessoaInfoPir"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/participante", "pessoaInfoPir"));
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
