/**
 * Dados.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.consultaGenerica;

public class Dados  implements java.io.Serializable {
    private br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.consultaGenerica.ChaveLogica chaveLogica;

    private java.lang.String motRet;

    private org.apache.axis.types.NonNegativeInteger situacao;

    private java.lang.String descrSituacao;

    private java.lang.String[] listaErroCad;

    private br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.consultaGenerica.RetInfConsCad[] listaRetInfConsCad;

    private br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.consultaGenerica.TpRetornaSefaz retornoSefaz;

    private org.apache.axis.types.NonNegativeInteger idNfErp;

    public Dados() {
    }

    public Dados(
           br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.consultaGenerica.ChaveLogica chaveLogica,
           java.lang.String motRet,
           org.apache.axis.types.NonNegativeInteger situacao,
           java.lang.String descrSituacao,
           java.lang.String[] listaErroCad,
           br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.consultaGenerica.RetInfConsCad[] listaRetInfConsCad,
           br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.consultaGenerica.TpRetornaSefaz retornoSefaz,
           org.apache.axis.types.NonNegativeInteger idNfErp) {
           this.chaveLogica = chaveLogica;
           this.motRet = motRet;
           this.situacao = situacao;
           this.descrSituacao = descrSituacao;
           this.listaErroCad = listaErroCad;
           this.listaRetInfConsCad = listaRetInfConsCad;
           this.retornoSefaz = retornoSefaz;
           this.idNfErp = idNfErp;
    }


    /**
     * Gets the chaveLogica value for this Dados.
     * 
     * @return chaveLogica
     */
    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.consultaGenerica.ChaveLogica getChaveLogica() {
        return chaveLogica;
    }


    /**
     * Sets the chaveLogica value for this Dados.
     * 
     * @param chaveLogica
     */
    public void setChaveLogica(br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.consultaGenerica.ChaveLogica chaveLogica) {
        this.chaveLogica = chaveLogica;
    }


    /**
     * Gets the motRet value for this Dados.
     * 
     * @return motRet
     */
    public java.lang.String getMotRet() {
        return motRet;
    }


    /**
     * Sets the motRet value for this Dados.
     * 
     * @param motRet
     */
    public void setMotRet(java.lang.String motRet) {
        this.motRet = motRet;
    }


    /**
     * Gets the situacao value for this Dados.
     * 
     * @return situacao
     */
    public org.apache.axis.types.NonNegativeInteger getSituacao() {
        return situacao;
    }


    /**
     * Sets the situacao value for this Dados.
     * 
     * @param situacao
     */
    public void setSituacao(org.apache.axis.types.NonNegativeInteger situacao) {
        this.situacao = situacao;
    }


    /**
     * Gets the descrSituacao value for this Dados.
     * 
     * @return descrSituacao
     */
    public java.lang.String getDescrSituacao() {
        return descrSituacao;
    }


    /**
     * Sets the descrSituacao value for this Dados.
     * 
     * @param descrSituacao
     */
    public void setDescrSituacao(java.lang.String descrSituacao) {
        this.descrSituacao = descrSituacao;
    }


    /**
     * Gets the listaErroCad value for this Dados.
     * 
     * @return listaErroCad
     */
    public java.lang.String[] getListaErroCad() {
        return listaErroCad;
    }


    /**
     * Sets the listaErroCad value for this Dados.
     * 
     * @param listaErroCad
     */
    public void setListaErroCad(java.lang.String[] listaErroCad) {
        this.listaErroCad = listaErroCad;
    }


    /**
     * Gets the listaRetInfConsCad value for this Dados.
     * 
     * @return listaRetInfConsCad
     */
    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.consultaGenerica.RetInfConsCad[] getListaRetInfConsCad() {
        return listaRetInfConsCad;
    }


    /**
     * Sets the listaRetInfConsCad value for this Dados.
     * 
     * @param listaRetInfConsCad
     */
    public void setListaRetInfConsCad(br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.consultaGenerica.RetInfConsCad[] listaRetInfConsCad) {
        this.listaRetInfConsCad = listaRetInfConsCad;
    }


    /**
     * Gets the retornoSefaz value for this Dados.
     * 
     * @return retornoSefaz
     */
    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.consultaGenerica.TpRetornaSefaz getRetornoSefaz() {
        return retornoSefaz;
    }


    /**
     * Sets the retornoSefaz value for this Dados.
     * 
     * @param retornoSefaz
     */
    public void setRetornoSefaz(br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.consultaGenerica.TpRetornaSefaz retornoSefaz) {
        this.retornoSefaz = retornoSefaz;
    }


    /**
     * Gets the idNfErp value for this Dados.
     * 
     * @return idNfErp
     */
    public org.apache.axis.types.NonNegativeInteger getIdNfErp() {
        return idNfErp;
    }


    /**
     * Sets the idNfErp value for this Dados.
     * 
     * @param idNfErp
     */
    public void setIdNfErp(org.apache.axis.types.NonNegativeInteger idNfErp) {
        this.idNfErp = idNfErp;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Dados)) return false;
        Dados other = (Dados) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.chaveLogica==null && other.getChaveLogica()==null) || 
             (this.chaveLogica!=null &&
              this.chaveLogica.equals(other.getChaveLogica()))) &&
            ((this.motRet==null && other.getMotRet()==null) || 
             (this.motRet!=null &&
              this.motRet.equals(other.getMotRet()))) &&
            ((this.situacao==null && other.getSituacao()==null) || 
             (this.situacao!=null &&
              this.situacao.equals(other.getSituacao()))) &&
            ((this.descrSituacao==null && other.getDescrSituacao()==null) || 
             (this.descrSituacao!=null &&
              this.descrSituacao.equals(other.getDescrSituacao()))) &&
            ((this.listaErroCad==null && other.getListaErroCad()==null) || 
             (this.listaErroCad!=null &&
              java.util.Arrays.equals(this.listaErroCad, other.getListaErroCad()))) &&
            ((this.listaRetInfConsCad==null && other.getListaRetInfConsCad()==null) || 
             (this.listaRetInfConsCad!=null &&
              java.util.Arrays.equals(this.listaRetInfConsCad, other.getListaRetInfConsCad()))) &&
            ((this.retornoSefaz==null && other.getRetornoSefaz()==null) || 
             (this.retornoSefaz!=null &&
              this.retornoSefaz.equals(other.getRetornoSefaz()))) &&
            ((this.idNfErp==null && other.getIdNfErp()==null) || 
             (this.idNfErp!=null &&
              this.idNfErp.equals(other.getIdNfErp())));
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
        if (getChaveLogica() != null) {
            _hashCode += getChaveLogica().hashCode();
        }
        if (getMotRet() != null) {
            _hashCode += getMotRet().hashCode();
        }
        if (getSituacao() != null) {
            _hashCode += getSituacao().hashCode();
        }
        if (getDescrSituacao() != null) {
            _hashCode += getDescrSituacao().hashCode();
        }
        if (getListaErroCad() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListaErroCad());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListaErroCad(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getListaRetInfConsCad() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListaRetInfConsCad());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListaRetInfConsCad(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRetornoSefaz() != null) {
            _hashCode += getRetornoSefaz().hashCode();
        }
        if (getIdNfErp() != null) {
            _hashCode += getIdNfErp().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Dados.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "dados"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chaveLogica");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "chaveLogica"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "chaveLogica"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("motRet");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "motRet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("situacao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "situacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descrSituacao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "descrSituacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listaErroCad");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "listaErroCad"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "tpStringSize4000"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "descricao"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listaRetInfConsCad");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "listaRetInfConsCad"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "retInfConsCad"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "retInfConsCad"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retornoSefaz");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "retornoSefaz"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "tpRetornaSefaz"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idNfErp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "idNfErp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
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
