/**
 * TpComplNf.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil;

public class TpComplNf  implements java.io.Serializable {
    private java.lang.String usuario;

    private java.math.BigInteger viasDanfeCustom;

    private java.math.BigInteger subSerie;

    private java.lang.String sistOrig;

    private java.lang.String unidOrg;

    private org.apache.axis.types.NonNegativeInteger idNfErp;

    private java.lang.String codInforCompl;

    private java.lang.String codigoPlanoConta;

    private java.lang.String codConsumoEnergiaEletr;

    private org.apache.axis.types.NonNegativeInteger dmTpLigacao;

    private java.lang.String dmCodGrupoTensao;

    private org.apache.axis.types.NonNegativeInteger dmTpAssinante;

    private org.apache.axis.types.NonNegativeInteger nroOrdEmb;

    private org.apache.axis.types.NonNegativeInteger seqNroOrdEmb;

    public TpComplNf() {
    }

    public TpComplNf(
           java.lang.String usuario,
           java.math.BigInteger viasDanfeCustom,
           java.math.BigInteger subSerie,
           java.lang.String sistOrig,
           java.lang.String unidOrg,
           org.apache.axis.types.NonNegativeInteger idNfErp,
           java.lang.String codInforCompl,
           java.lang.String codigoPlanoConta,
           java.lang.String codConsumoEnergiaEletr,
           org.apache.axis.types.NonNegativeInteger dmTpLigacao,
           java.lang.String dmCodGrupoTensao,
           org.apache.axis.types.NonNegativeInteger dmTpAssinante,
           org.apache.axis.types.NonNegativeInteger nroOrdEmb,
           org.apache.axis.types.NonNegativeInteger seqNroOrdEmb) {
           this.usuario = usuario;
           this.viasDanfeCustom = viasDanfeCustom;
           this.subSerie = subSerie;
           this.sistOrig = sistOrig;
           this.unidOrg = unidOrg;
           this.idNfErp = idNfErp;
           this.codInforCompl = codInforCompl;
           this.codigoPlanoConta = codigoPlanoConta;
           this.codConsumoEnergiaEletr = codConsumoEnergiaEletr;
           this.dmTpLigacao = dmTpLigacao;
           this.dmCodGrupoTensao = dmCodGrupoTensao;
           this.dmTpAssinante = dmTpAssinante;
           this.nroOrdEmb = nroOrdEmb;
           this.seqNroOrdEmb = seqNroOrdEmb;
    }


    /**
     * Gets the usuario value for this TpComplNf.
     * 
     * @return usuario
     */
    public java.lang.String getUsuario() {
        return usuario;
    }


    /**
     * Sets the usuario value for this TpComplNf.
     * 
     * @param usuario
     */
    public void setUsuario(java.lang.String usuario) {
        this.usuario = usuario;
    }


    /**
     * Gets the viasDanfeCustom value for this TpComplNf.
     * 
     * @return viasDanfeCustom
     */
    public java.math.BigInteger getViasDanfeCustom() {
        return viasDanfeCustom;
    }


    /**
     * Sets the viasDanfeCustom value for this TpComplNf.
     * 
     * @param viasDanfeCustom
     */
    public void setViasDanfeCustom(java.math.BigInteger viasDanfeCustom) {
        this.viasDanfeCustom = viasDanfeCustom;
    }


    /**
     * Gets the subSerie value for this TpComplNf.
     * 
     * @return subSerie
     */
    public java.math.BigInteger getSubSerie() {
        return subSerie;
    }


    /**
     * Sets the subSerie value for this TpComplNf.
     * 
     * @param subSerie
     */
    public void setSubSerie(java.math.BigInteger subSerie) {
        this.subSerie = subSerie;
    }


    /**
     * Gets the sistOrig value for this TpComplNf.
     * 
     * @return sistOrig
     */
    public java.lang.String getSistOrig() {
        return sistOrig;
    }


    /**
     * Sets the sistOrig value for this TpComplNf.
     * 
     * @param sistOrig
     */
    public void setSistOrig(java.lang.String sistOrig) {
        this.sistOrig = sistOrig;
    }


    /**
     * Gets the unidOrg value for this TpComplNf.
     * 
     * @return unidOrg
     */
    public java.lang.String getUnidOrg() {
        return unidOrg;
    }


    /**
     * Sets the unidOrg value for this TpComplNf.
     * 
     * @param unidOrg
     */
    public void setUnidOrg(java.lang.String unidOrg) {
        this.unidOrg = unidOrg;
    }


    /**
     * Gets the idNfErp value for this TpComplNf.
     * 
     * @return idNfErp
     */
    public org.apache.axis.types.NonNegativeInteger getIdNfErp() {
        return idNfErp;
    }


    /**
     * Sets the idNfErp value for this TpComplNf.
     * 
     * @param idNfErp
     */
    public void setIdNfErp(org.apache.axis.types.NonNegativeInteger idNfErp) {
        this.idNfErp = idNfErp;
    }


    /**
     * Gets the codInforCompl value for this TpComplNf.
     * 
     * @return codInforCompl
     */
    public java.lang.String getCodInforCompl() {
        return codInforCompl;
    }


    /**
     * Sets the codInforCompl value for this TpComplNf.
     * 
     * @param codInforCompl
     */
    public void setCodInforCompl(java.lang.String codInforCompl) {
        this.codInforCompl = codInforCompl;
    }


    /**
     * Gets the codigoPlanoConta value for this TpComplNf.
     * 
     * @return codigoPlanoConta
     */
    public java.lang.String getCodigoPlanoConta() {
        return codigoPlanoConta;
    }


    /**
     * Sets the codigoPlanoConta value for this TpComplNf.
     * 
     * @param codigoPlanoConta
     */
    public void setCodigoPlanoConta(java.lang.String codigoPlanoConta) {
        this.codigoPlanoConta = codigoPlanoConta;
    }


    /**
     * Gets the codConsumoEnergiaEletr value for this TpComplNf.
     * 
     * @return codConsumoEnergiaEletr
     */
    public java.lang.String getCodConsumoEnergiaEletr() {
        return codConsumoEnergiaEletr;
    }


    /**
     * Sets the codConsumoEnergiaEletr value for this TpComplNf.
     * 
     * @param codConsumoEnergiaEletr
     */
    public void setCodConsumoEnergiaEletr(java.lang.String codConsumoEnergiaEletr) {
        this.codConsumoEnergiaEletr = codConsumoEnergiaEletr;
    }


    /**
     * Gets the dmTpLigacao value for this TpComplNf.
     * 
     * @return dmTpLigacao
     */
    public org.apache.axis.types.NonNegativeInteger getDmTpLigacao() {
        return dmTpLigacao;
    }


    /**
     * Sets the dmTpLigacao value for this TpComplNf.
     * 
     * @param dmTpLigacao
     */
    public void setDmTpLigacao(org.apache.axis.types.NonNegativeInteger dmTpLigacao) {
        this.dmTpLigacao = dmTpLigacao;
    }


    /**
     * Gets the dmCodGrupoTensao value for this TpComplNf.
     * 
     * @return dmCodGrupoTensao
     */
    public java.lang.String getDmCodGrupoTensao() {
        return dmCodGrupoTensao;
    }


    /**
     * Sets the dmCodGrupoTensao value for this TpComplNf.
     * 
     * @param dmCodGrupoTensao
     */
    public void setDmCodGrupoTensao(java.lang.String dmCodGrupoTensao) {
        this.dmCodGrupoTensao = dmCodGrupoTensao;
    }


    /**
     * Gets the dmTpAssinante value for this TpComplNf.
     * 
     * @return dmTpAssinante
     */
    public org.apache.axis.types.NonNegativeInteger getDmTpAssinante() {
        return dmTpAssinante;
    }


    /**
     * Sets the dmTpAssinante value for this TpComplNf.
     * 
     * @param dmTpAssinante
     */
    public void setDmTpAssinante(org.apache.axis.types.NonNegativeInteger dmTpAssinante) {
        this.dmTpAssinante = dmTpAssinante;
    }


    /**
     * Gets the nroOrdEmb value for this TpComplNf.
     * 
     * @return nroOrdEmb
     */
    public org.apache.axis.types.NonNegativeInteger getNroOrdEmb() {
        return nroOrdEmb;
    }


    /**
     * Sets the nroOrdEmb value for this TpComplNf.
     * 
     * @param nroOrdEmb
     */
    public void setNroOrdEmb(org.apache.axis.types.NonNegativeInteger nroOrdEmb) {
        this.nroOrdEmb = nroOrdEmb;
    }


    /**
     * Gets the seqNroOrdEmb value for this TpComplNf.
     * 
     * @return seqNroOrdEmb
     */
    public org.apache.axis.types.NonNegativeInteger getSeqNroOrdEmb() {
        return seqNroOrdEmb;
    }


    /**
     * Sets the seqNroOrdEmb value for this TpComplNf.
     * 
     * @param seqNroOrdEmb
     */
    public void setSeqNroOrdEmb(org.apache.axis.types.NonNegativeInteger seqNroOrdEmb) {
        this.seqNroOrdEmb = seqNroOrdEmb;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TpComplNf)) return false;
        TpComplNf other = (TpComplNf) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.usuario==null && other.getUsuario()==null) || 
             (this.usuario!=null &&
              this.usuario.equals(other.getUsuario()))) &&
            ((this.viasDanfeCustom==null && other.getViasDanfeCustom()==null) || 
             (this.viasDanfeCustom!=null &&
              this.viasDanfeCustom.equals(other.getViasDanfeCustom()))) &&
            ((this.subSerie==null && other.getSubSerie()==null) || 
             (this.subSerie!=null &&
              this.subSerie.equals(other.getSubSerie()))) &&
            ((this.sistOrig==null && other.getSistOrig()==null) || 
             (this.sistOrig!=null &&
              this.sistOrig.equals(other.getSistOrig()))) &&
            ((this.unidOrg==null && other.getUnidOrg()==null) || 
             (this.unidOrg!=null &&
              this.unidOrg.equals(other.getUnidOrg()))) &&
            ((this.idNfErp==null && other.getIdNfErp()==null) || 
             (this.idNfErp!=null &&
              this.idNfErp.equals(other.getIdNfErp()))) &&
            ((this.codInforCompl==null && other.getCodInforCompl()==null) || 
             (this.codInforCompl!=null &&
              this.codInforCompl.equals(other.getCodInforCompl()))) &&
            ((this.codigoPlanoConta==null && other.getCodigoPlanoConta()==null) || 
             (this.codigoPlanoConta!=null &&
              this.codigoPlanoConta.equals(other.getCodigoPlanoConta()))) &&
            ((this.codConsumoEnergiaEletr==null && other.getCodConsumoEnergiaEletr()==null) || 
             (this.codConsumoEnergiaEletr!=null &&
              this.codConsumoEnergiaEletr.equals(other.getCodConsumoEnergiaEletr()))) &&
            ((this.dmTpLigacao==null && other.getDmTpLigacao()==null) || 
             (this.dmTpLigacao!=null &&
              this.dmTpLigacao.equals(other.getDmTpLigacao()))) &&
            ((this.dmCodGrupoTensao==null && other.getDmCodGrupoTensao()==null) || 
             (this.dmCodGrupoTensao!=null &&
              this.dmCodGrupoTensao.equals(other.getDmCodGrupoTensao()))) &&
            ((this.dmTpAssinante==null && other.getDmTpAssinante()==null) || 
             (this.dmTpAssinante!=null &&
              this.dmTpAssinante.equals(other.getDmTpAssinante()))) &&
            ((this.nroOrdEmb==null && other.getNroOrdEmb()==null) || 
             (this.nroOrdEmb!=null &&
              this.nroOrdEmb.equals(other.getNroOrdEmb()))) &&
            ((this.seqNroOrdEmb==null && other.getSeqNroOrdEmb()==null) || 
             (this.seqNroOrdEmb!=null &&
              this.seqNroOrdEmb.equals(other.getSeqNroOrdEmb())));
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
        if (getUsuario() != null) {
            _hashCode += getUsuario().hashCode();
        }
        if (getViasDanfeCustom() != null) {
            _hashCode += getViasDanfeCustom().hashCode();
        }
        if (getSubSerie() != null) {
            _hashCode += getSubSerie().hashCode();
        }
        if (getSistOrig() != null) {
            _hashCode += getSistOrig().hashCode();
        }
        if (getUnidOrg() != null) {
            _hashCode += getUnidOrg().hashCode();
        }
        if (getIdNfErp() != null) {
            _hashCode += getIdNfErp().hashCode();
        }
        if (getCodInforCompl() != null) {
            _hashCode += getCodInforCompl().hashCode();
        }
        if (getCodigoPlanoConta() != null) {
            _hashCode += getCodigoPlanoConta().hashCode();
        }
        if (getCodConsumoEnergiaEletr() != null) {
            _hashCode += getCodConsumoEnergiaEletr().hashCode();
        }
        if (getDmTpLigacao() != null) {
            _hashCode += getDmTpLigacao().hashCode();
        }
        if (getDmCodGrupoTensao() != null) {
            _hashCode += getDmCodGrupoTensao().hashCode();
        }
        if (getDmTpAssinante() != null) {
            _hashCode += getDmTpAssinante().hashCode();
        }
        if (getNroOrdEmb() != null) {
            _hashCode += getNroOrdEmb().hashCode();
        }
        if (getSeqNroOrdEmb() != null) {
            _hashCode += getSeqNroOrdEmb().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TpComplNf.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "tpComplNf"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usuario");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "usuario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("viasDanfeCustom");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "viasDanfeCustom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subSerie");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "subSerie"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sistOrig");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "sistOrig"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unidOrg");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "unidOrg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idNfErp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "idNfErp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codInforCompl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "codInforCompl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoPlanoConta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "codigoPlanoConta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "tpStringSize255"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codConsumoEnergiaEletr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "codConsumoEnergiaEletr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dmTpLigacao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "dmTpLigacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "tpDominio"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dmCodGrupoTensao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "dmCodGrupoTensao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "tpStringSizeTwoComplementos"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dmTpAssinante");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "dmTpAssinante"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "tpDominio"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nroOrdEmb");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "nroOrdEmb"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seqNroOrdEmb");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "seqNroOrdEmb"));
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
