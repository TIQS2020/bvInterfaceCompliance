/**
 * TpFormaPgto.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil;

public class TpFormaPgto  implements java.io.Serializable {
    private java.math.BigInteger dmTpPag;

    private java.math.BigDecimal vlPgto;

    private java.lang.String cnpj;

    private java.lang.String dmTpBand;

    private java.lang.String nroAut;

    private java.math.BigInteger dmTpIntegra;

    private java.math.BigDecimal vlTroco;

    public TpFormaPgto() {
    }

    public TpFormaPgto(
           java.math.BigInteger dmTpPag,
           java.math.BigDecimal vlPgto,
           java.lang.String cnpj,
           java.lang.String dmTpBand,
           java.lang.String nroAut,
           java.math.BigInteger dmTpIntegra,
           java.math.BigDecimal vlTroco) {
           this.dmTpPag = dmTpPag;
           this.vlPgto = vlPgto;
           this.cnpj = cnpj;
           this.dmTpBand = dmTpBand;
           this.nroAut = nroAut;
           this.dmTpIntegra = dmTpIntegra;
           this.vlTroco = vlTroco;
    }


    /**
     * Gets the dmTpPag value for this TpFormaPgto.
     * 
     * @return dmTpPag
     */
    public java.math.BigInteger getDmTpPag() {
        return dmTpPag;
    }


    /**
     * Sets the dmTpPag value for this TpFormaPgto.
     * 
     * @param dmTpPag
     */
    public void setDmTpPag(java.math.BigInteger dmTpPag) {
        this.dmTpPag = dmTpPag;
    }


    /**
     * Gets the vlPgto value for this TpFormaPgto.
     * 
     * @return vlPgto
     */
    public java.math.BigDecimal getVlPgto() {
        return vlPgto;
    }


    /**
     * Sets the vlPgto value for this TpFormaPgto.
     * 
     * @param vlPgto
     */
    public void setVlPgto(java.math.BigDecimal vlPgto) {
        this.vlPgto = vlPgto;
    }


    /**
     * Gets the cnpj value for this TpFormaPgto.
     * 
     * @return cnpj
     */
    public java.lang.String getCnpj() {
        return cnpj;
    }


    /**
     * Sets the cnpj value for this TpFormaPgto.
     * 
     * @param cnpj
     */
    public void setCnpj(java.lang.String cnpj) {
        this.cnpj = cnpj;
    }


    /**
     * Gets the dmTpBand value for this TpFormaPgto.
     * 
     * @return dmTpBand
     */
    public java.lang.String getDmTpBand() {
        return dmTpBand;
    }


    /**
     * Sets the dmTpBand value for this TpFormaPgto.
     * 
     * @param dmTpBand
     */
    public void setDmTpBand(java.lang.String dmTpBand) {
        this.dmTpBand = dmTpBand;
    }


    /**
     * Gets the nroAut value for this TpFormaPgto.
     * 
     * @return nroAut
     */
    public java.lang.String getNroAut() {
        return nroAut;
    }


    /**
     * Sets the nroAut value for this TpFormaPgto.
     * 
     * @param nroAut
     */
    public void setNroAut(java.lang.String nroAut) {
        this.nroAut = nroAut;
    }


    /**
     * Gets the dmTpIntegra value for this TpFormaPgto.
     * 
     * @return dmTpIntegra
     */
    public java.math.BigInteger getDmTpIntegra() {
        return dmTpIntegra;
    }


    /**
     * Sets the dmTpIntegra value for this TpFormaPgto.
     * 
     * @param dmTpIntegra
     */
    public void setDmTpIntegra(java.math.BigInteger dmTpIntegra) {
        this.dmTpIntegra = dmTpIntegra;
    }


    /**
     * Gets the vlTroco value for this TpFormaPgto.
     * 
     * @return vlTroco
     */
    public java.math.BigDecimal getVlTroco() {
        return vlTroco;
    }


    /**
     * Sets the vlTroco value for this TpFormaPgto.
     * 
     * @param vlTroco
     */
    public void setVlTroco(java.math.BigDecimal vlTroco) {
        this.vlTroco = vlTroco;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TpFormaPgto)) return false;
        TpFormaPgto other = (TpFormaPgto) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dmTpPag==null && other.getDmTpPag()==null) || 
             (this.dmTpPag!=null &&
              this.dmTpPag.equals(other.getDmTpPag()))) &&
            ((this.vlPgto==null && other.getVlPgto()==null) || 
             (this.vlPgto!=null &&
              this.vlPgto.equals(other.getVlPgto()))) &&
            ((this.cnpj==null && other.getCnpj()==null) || 
             (this.cnpj!=null &&
              this.cnpj.equals(other.getCnpj()))) &&
            ((this.dmTpBand==null && other.getDmTpBand()==null) || 
             (this.dmTpBand!=null &&
              this.dmTpBand.equals(other.getDmTpBand()))) &&
            ((this.nroAut==null && other.getNroAut()==null) || 
             (this.nroAut!=null &&
              this.nroAut.equals(other.getNroAut()))) &&
            ((this.dmTpIntegra==null && other.getDmTpIntegra()==null) || 
             (this.dmTpIntegra!=null &&
              this.dmTpIntegra.equals(other.getDmTpIntegra()))) &&
            ((this.vlTroco==null && other.getVlTroco()==null) || 
             (this.vlTroco!=null &&
              this.vlTroco.equals(other.getVlTroco())));
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
        if (getDmTpPag() != null) {
            _hashCode += getDmTpPag().hashCode();
        }
        if (getVlPgto() != null) {
            _hashCode += getVlPgto().hashCode();
        }
        if (getCnpj() != null) {
            _hashCode += getCnpj().hashCode();
        }
        if (getDmTpBand() != null) {
            _hashCode += getDmTpBand().hashCode();
        }
        if (getNroAut() != null) {
            _hashCode += getNroAut().hashCode();
        }
        if (getDmTpIntegra() != null) {
            _hashCode += getDmTpIntegra().hashCode();
        }
        if (getVlTroco() != null) {
            _hashCode += getVlTroco().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TpFormaPgto.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "tpFormaPgto"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dmTpPag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "dmTpPag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlPgto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "vlPgto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cnpj");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "cnpj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dmTpBand");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "dmTpBand"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "tpStringSizeTwoComplementos"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nroAut");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "nroAut"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dmTpIntegra");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "dmTpIntegra"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlTroco");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "vlTroco"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
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
