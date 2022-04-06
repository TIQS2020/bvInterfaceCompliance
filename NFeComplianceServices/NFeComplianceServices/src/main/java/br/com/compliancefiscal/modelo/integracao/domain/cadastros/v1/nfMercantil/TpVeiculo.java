/**
 * TpVeiculo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil;

public class TpVeiculo  implements java.io.Serializable {
    private org.apache.axis.types.NonNegativeInteger dmTipo;

    private java.lang.String placa;

    private java.lang.String uf;

    private java.lang.String rntc;

    private java.lang.String vagao;

    private java.lang.String balsa;

    public TpVeiculo() {
    }

    public TpVeiculo(
           org.apache.axis.types.NonNegativeInteger dmTipo,
           java.lang.String placa,
           java.lang.String uf,
           java.lang.String rntc,
           java.lang.String vagao,
           java.lang.String balsa) {
           this.dmTipo = dmTipo;
           this.placa = placa;
           this.uf = uf;
           this.rntc = rntc;
           this.vagao = vagao;
           this.balsa = balsa;
    }


    /**
     * Gets the dmTipo value for this TpVeiculo.
     * 
     * @return dmTipo
     */
    public org.apache.axis.types.NonNegativeInteger getDmTipo() {
        return dmTipo;
    }


    /**
     * Sets the dmTipo value for this TpVeiculo.
     * 
     * @param dmTipo
     */
    public void setDmTipo(org.apache.axis.types.NonNegativeInteger dmTipo) {
        this.dmTipo = dmTipo;
    }


    /**
     * Gets the placa value for this TpVeiculo.
     * 
     * @return placa
     */
    public java.lang.String getPlaca() {
        return placa;
    }


    /**
     * Sets the placa value for this TpVeiculo.
     * 
     * @param placa
     */
    public void setPlaca(java.lang.String placa) {
        this.placa = placa;
    }


    /**
     * Gets the uf value for this TpVeiculo.
     * 
     * @return uf
     */
    public java.lang.String getUf() {
        return uf;
    }


    /**
     * Sets the uf value for this TpVeiculo.
     * 
     * @param uf
     */
    public void setUf(java.lang.String uf) {
        this.uf = uf;
    }


    /**
     * Gets the rntc value for this TpVeiculo.
     * 
     * @return rntc
     */
    public java.lang.String getRntc() {
        return rntc;
    }


    /**
     * Sets the rntc value for this TpVeiculo.
     * 
     * @param rntc
     */
    public void setRntc(java.lang.String rntc) {
        this.rntc = rntc;
    }


    /**
     * Gets the vagao value for this TpVeiculo.
     * 
     * @return vagao
     */
    public java.lang.String getVagao() {
        return vagao;
    }


    /**
     * Sets the vagao value for this TpVeiculo.
     * 
     * @param vagao
     */
    public void setVagao(java.lang.String vagao) {
        this.vagao = vagao;
    }


    /**
     * Gets the balsa value for this TpVeiculo.
     * 
     * @return balsa
     */
    public java.lang.String getBalsa() {
        return balsa;
    }


    /**
     * Sets the balsa value for this TpVeiculo.
     * 
     * @param balsa
     */
    public void setBalsa(java.lang.String balsa) {
        this.balsa = balsa;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TpVeiculo)) return false;
        TpVeiculo other = (TpVeiculo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dmTipo==null && other.getDmTipo()==null) || 
             (this.dmTipo!=null &&
              this.dmTipo.equals(other.getDmTipo()))) &&
            ((this.placa==null && other.getPlaca()==null) || 
             (this.placa!=null &&
              this.placa.equals(other.getPlaca()))) &&
            ((this.uf==null && other.getUf()==null) || 
             (this.uf!=null &&
              this.uf.equals(other.getUf()))) &&
            ((this.rntc==null && other.getRntc()==null) || 
             (this.rntc!=null &&
              this.rntc.equals(other.getRntc()))) &&
            ((this.vagao==null && other.getVagao()==null) || 
             (this.vagao!=null &&
              this.vagao.equals(other.getVagao()))) &&
            ((this.balsa==null && other.getBalsa()==null) || 
             (this.balsa!=null &&
              this.balsa.equals(other.getBalsa())));
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
        if (getDmTipo() != null) {
            _hashCode += getDmTipo().hashCode();
        }
        if (getPlaca() != null) {
            _hashCode += getPlaca().hashCode();
        }
        if (getUf() != null) {
            _hashCode += getUf().hashCode();
        }
        if (getRntc() != null) {
            _hashCode += getRntc().hashCode();
        }
        if (getVagao() != null) {
            _hashCode += getVagao().hashCode();
        }
        if (getBalsa() != null) {
            _hashCode += getBalsa().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TpVeiculo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "tpVeiculo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dmTipo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "dmTipo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "tpDominio"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("placa");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "placa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uf");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "uf"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rntc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "rntc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vagao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "vagao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balsa");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "balsa"));
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
