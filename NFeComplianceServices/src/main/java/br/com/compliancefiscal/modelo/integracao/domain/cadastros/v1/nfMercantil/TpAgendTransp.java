/**
 * TpAgendTransp.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil;

public class TpAgendTransp  implements java.io.Serializable {
    private java.lang.String pedido;

    private java.lang.String nome;

    private java.lang.String lograd;

    private java.lang.String cidade;

    private java.lang.String cep;

    private java.lang.String nroNf;

    private java.lang.String nomeTransp;

    private br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpObsAgendTransp[] obsAgendTransp;

    public TpAgendTransp() {
    }

    public TpAgendTransp(
           java.lang.String pedido,
           java.lang.String nome,
           java.lang.String lograd,
           java.lang.String cidade,
           java.lang.String cep,
           java.lang.String nroNf,
           java.lang.String nomeTransp,
           br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpObsAgendTransp[] obsAgendTransp) {
           this.pedido = pedido;
           this.nome = nome;
           this.lograd = lograd;
           this.cidade = cidade;
           this.cep = cep;
           this.nroNf = nroNf;
           this.nomeTransp = nomeTransp;
           this.obsAgendTransp = obsAgendTransp;
    }


    /**
     * Gets the pedido value for this TpAgendTransp.
     * 
     * @return pedido
     */
    public java.lang.String getPedido() {
        return pedido;
    }


    /**
     * Sets the pedido value for this TpAgendTransp.
     * 
     * @param pedido
     */
    public void setPedido(java.lang.String pedido) {
        this.pedido = pedido;
    }


    /**
     * Gets the nome value for this TpAgendTransp.
     * 
     * @return nome
     */
    public java.lang.String getNome() {
        return nome;
    }


    /**
     * Sets the nome value for this TpAgendTransp.
     * 
     * @param nome
     */
    public void setNome(java.lang.String nome) {
        this.nome = nome;
    }


    /**
     * Gets the lograd value for this TpAgendTransp.
     * 
     * @return lograd
     */
    public java.lang.String getLograd() {
        return lograd;
    }


    /**
     * Sets the lograd value for this TpAgendTransp.
     * 
     * @param lograd
     */
    public void setLograd(java.lang.String lograd) {
        this.lograd = lograd;
    }


    /**
     * Gets the cidade value for this TpAgendTransp.
     * 
     * @return cidade
     */
    public java.lang.String getCidade() {
        return cidade;
    }


    /**
     * Sets the cidade value for this TpAgendTransp.
     * 
     * @param cidade
     */
    public void setCidade(java.lang.String cidade) {
        this.cidade = cidade;
    }


    /**
     * Gets the cep value for this TpAgendTransp.
     * 
     * @return cep
     */
    public java.lang.String getCep() {
        return cep;
    }


    /**
     * Sets the cep value for this TpAgendTransp.
     * 
     * @param cep
     */
    public void setCep(java.lang.String cep) {
        this.cep = cep;
    }


    /**
     * Gets the nroNf value for this TpAgendTransp.
     * 
     * @return nroNf
     */
    public java.lang.String getNroNf() {
        return nroNf;
    }


    /**
     * Sets the nroNf value for this TpAgendTransp.
     * 
     * @param nroNf
     */
    public void setNroNf(java.lang.String nroNf) {
        this.nroNf = nroNf;
    }


    /**
     * Gets the nomeTransp value for this TpAgendTransp.
     * 
     * @return nomeTransp
     */
    public java.lang.String getNomeTransp() {
        return nomeTransp;
    }


    /**
     * Sets the nomeTransp value for this TpAgendTransp.
     * 
     * @param nomeTransp
     */
    public void setNomeTransp(java.lang.String nomeTransp) {
        this.nomeTransp = nomeTransp;
    }


    /**
     * Gets the obsAgendTransp value for this TpAgendTransp.
     * 
     * @return obsAgendTransp
     */
    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpObsAgendTransp[] getObsAgendTransp() {
        return obsAgendTransp;
    }


    /**
     * Sets the obsAgendTransp value for this TpAgendTransp.
     * 
     * @param obsAgendTransp
     */
    public void setObsAgendTransp(br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpObsAgendTransp[] obsAgendTransp) {
        this.obsAgendTransp = obsAgendTransp;
    }

    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpObsAgendTransp getObsAgendTransp(int i) {
        return this.obsAgendTransp[i];
    }

    public void setObsAgendTransp(int i, br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpObsAgendTransp _value) {
        this.obsAgendTransp[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TpAgendTransp)) return false;
        TpAgendTransp other = (TpAgendTransp) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.pedido==null && other.getPedido()==null) || 
             (this.pedido!=null &&
              this.pedido.equals(other.getPedido()))) &&
            ((this.nome==null && other.getNome()==null) || 
             (this.nome!=null &&
              this.nome.equals(other.getNome()))) &&
            ((this.lograd==null && other.getLograd()==null) || 
             (this.lograd!=null &&
              this.lograd.equals(other.getLograd()))) &&
            ((this.cidade==null && other.getCidade()==null) || 
             (this.cidade!=null &&
              this.cidade.equals(other.getCidade()))) &&
            ((this.cep==null && other.getCep()==null) || 
             (this.cep!=null &&
              this.cep.equals(other.getCep()))) &&
            ((this.nroNf==null && other.getNroNf()==null) || 
             (this.nroNf!=null &&
              this.nroNf.equals(other.getNroNf()))) &&
            ((this.nomeTransp==null && other.getNomeTransp()==null) || 
             (this.nomeTransp!=null &&
              this.nomeTransp.equals(other.getNomeTransp()))) &&
            ((this.obsAgendTransp==null && other.getObsAgendTransp()==null) || 
             (this.obsAgendTransp!=null &&
              java.util.Arrays.equals(this.obsAgendTransp, other.getObsAgendTransp())));
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
        if (getPedido() != null) {
            _hashCode += getPedido().hashCode();
        }
        if (getNome() != null) {
            _hashCode += getNome().hashCode();
        }
        if (getLograd() != null) {
            _hashCode += getLograd().hashCode();
        }
        if (getCidade() != null) {
            _hashCode += getCidade().hashCode();
        }
        if (getCep() != null) {
            _hashCode += getCep().hashCode();
        }
        if (getNroNf() != null) {
            _hashCode += getNroNf().hashCode();
        }
        if (getNomeTransp() != null) {
            _hashCode += getNomeTransp().hashCode();
        }
        if (getObsAgendTransp() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getObsAgendTransp());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getObsAgendTransp(), i);
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
        new org.apache.axis.description.TypeDesc(TpAgendTransp.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "tpAgendTransp"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pedido");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "pedido"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nome");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "nome"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lograd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "lograd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cidade");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "cidade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cep");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "cep"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nroNf");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "nroNf"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomeTransp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "nomeTransp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("obsAgendTransp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "obsAgendTransp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "tpObsAgendTransp"));
        elemField.setMinOccurs(0);
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
