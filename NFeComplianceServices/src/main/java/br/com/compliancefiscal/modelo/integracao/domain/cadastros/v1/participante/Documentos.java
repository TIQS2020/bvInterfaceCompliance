/**
 * Documentos.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.participante;

public class Documentos  implements java.io.Serializable {
    private br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.TpCpfCnpj cpfCnpj;

    private br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.participante.TpRgIE rgIE;

    private java.lang.String ieSt;

    private java.lang.String inscricaoMunicipal;

    private java.lang.String suframa;

    private java.lang.String inscricaoProdutor;

    private java.lang.String idEstrangeiro;

    public Documentos() {
    }

    public Documentos(
           br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.TpCpfCnpj cpfCnpj,
           br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.participante.TpRgIE rgIE,
           java.lang.String ieSt,
           java.lang.String inscricaoMunicipal,
           java.lang.String suframa,
           java.lang.String inscricaoProdutor,
           java.lang.String idEstrangeiro) {
           this.cpfCnpj = cpfCnpj;
           this.rgIE = rgIE;
           this.ieSt = ieSt;
           this.inscricaoMunicipal = inscricaoMunicipal;
           this.suframa = suframa;
           this.inscricaoProdutor = inscricaoProdutor;
           this.idEstrangeiro = idEstrangeiro;
    }


    /**
     * Gets the cpfCnpj value for this Documentos.
     * 
     * @return cpfCnpj
     */
    public br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.TpCpfCnpj getCpfCnpj() {
        return cpfCnpj;
    }


    /**
     * Sets the cpfCnpj value for this Documentos.
     * 
     * @param cpfCnpj
     */
    public void setCpfCnpj(br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.TpCpfCnpj cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }


    /**
     * Gets the rgIE value for this Documentos.
     * 
     * @return rgIE
     */
    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.participante.TpRgIE getRgIE() {
        return rgIE;
    }


    /**
     * Sets the rgIE value for this Documentos.
     * 
     * @param rgIE
     */
    public void setRgIE(br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.participante.TpRgIE rgIE) {
        this.rgIE = rgIE;
    }


    /**
     * Gets the ieSt value for this Documentos.
     * 
     * @return ieSt
     */
    public java.lang.String getIeSt() {
        return ieSt;
    }


    /**
     * Sets the ieSt value for this Documentos.
     * 
     * @param ieSt
     */
    public void setIeSt(java.lang.String ieSt) {
        this.ieSt = ieSt;
    }


    /**
     * Gets the inscricaoMunicipal value for this Documentos.
     * 
     * @return inscricaoMunicipal
     */
    public java.lang.String getInscricaoMunicipal() {
        return inscricaoMunicipal;
    }


    /**
     * Sets the inscricaoMunicipal value for this Documentos.
     * 
     * @param inscricaoMunicipal
     */
    public void setInscricaoMunicipal(java.lang.String inscricaoMunicipal) {
        this.inscricaoMunicipal = inscricaoMunicipal;
    }


    /**
     * Gets the suframa value for this Documentos.
     * 
     * @return suframa
     */
    public java.lang.String getSuframa() {
        return suframa;
    }


    /**
     * Sets the suframa value for this Documentos.
     * 
     * @param suframa
     */
    public void setSuframa(java.lang.String suframa) {
        this.suframa = suframa;
    }


    /**
     * Gets the inscricaoProdutor value for this Documentos.
     * 
     * @return inscricaoProdutor
     */
    public java.lang.String getInscricaoProdutor() {
        return inscricaoProdutor;
    }


    /**
     * Sets the inscricaoProdutor value for this Documentos.
     * 
     * @param inscricaoProdutor
     */
    public void setInscricaoProdutor(java.lang.String inscricaoProdutor) {
        this.inscricaoProdutor = inscricaoProdutor;
    }


    /**
     * Gets the idEstrangeiro value for this Documentos.
     * 
     * @return idEstrangeiro
     */
    public java.lang.String getIdEstrangeiro() {
        return idEstrangeiro;
    }


    /**
     * Sets the idEstrangeiro value for this Documentos.
     * 
     * @param idEstrangeiro
     */
    public void setIdEstrangeiro(java.lang.String idEstrangeiro) {
        this.idEstrangeiro = idEstrangeiro;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Documentos)) return false;
        Documentos other = (Documentos) obj;
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
            ((this.rgIE==null && other.getRgIE()==null) || 
             (this.rgIE!=null &&
              this.rgIE.equals(other.getRgIE()))) &&
            ((this.ieSt==null && other.getIeSt()==null) || 
             (this.ieSt!=null &&
              this.ieSt.equals(other.getIeSt()))) &&
            ((this.inscricaoMunicipal==null && other.getInscricaoMunicipal()==null) || 
             (this.inscricaoMunicipal!=null &&
              this.inscricaoMunicipal.equals(other.getInscricaoMunicipal()))) &&
            ((this.suframa==null && other.getSuframa()==null) || 
             (this.suframa!=null &&
              this.suframa.equals(other.getSuframa()))) &&
            ((this.inscricaoProdutor==null && other.getInscricaoProdutor()==null) || 
             (this.inscricaoProdutor!=null &&
              this.inscricaoProdutor.equals(other.getInscricaoProdutor()))) &&
            ((this.idEstrangeiro==null && other.getIdEstrangeiro()==null) || 
             (this.idEstrangeiro!=null &&
              this.idEstrangeiro.equals(other.getIdEstrangeiro())));
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
        if (getRgIE() != null) {
            _hashCode += getRgIE().hashCode();
        }
        if (getIeSt() != null) {
            _hashCode += getIeSt().hashCode();
        }
        if (getInscricaoMunicipal() != null) {
            _hashCode += getInscricaoMunicipal().hashCode();
        }
        if (getSuframa() != null) {
            _hashCode += getSuframa().hashCode();
        }
        if (getInscricaoProdutor() != null) {
            _hashCode += getInscricaoProdutor().hashCode();
        }
        if (getIdEstrangeiro() != null) {
            _hashCode += getIdEstrangeiro().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Documentos.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/participante", "documentos"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpfCnpj");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/participante", "cpfCnpj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "tpCpfCnpj"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rgIE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/participante", "rgIE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/participante", "tpRgIE"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ieSt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/participante", "ieSt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inscricaoMunicipal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/participante", "inscricaoMunicipal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("suframa");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/participante", "suframa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inscricaoProdutor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/participante", "inscricaoProdutor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idEstrangeiro");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/participante", "idEstrangeiro"));
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
