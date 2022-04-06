/**
 * TpDadosArma.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil;

public class TpDadosArma  implements java.io.Serializable {
    private org.apache.axis.types.NonNegativeInteger dmIndArm;

    private java.math.BigInteger nroSerie;

    private java.math.BigInteger nroCano;

    private java.lang.String descrCompl;

    public TpDadosArma() {
    }

    public TpDadosArma(
           org.apache.axis.types.NonNegativeInteger dmIndArm,
           java.math.BigInteger nroSerie,
           java.math.BigInteger nroCano,
           java.lang.String descrCompl) {
           this.dmIndArm = dmIndArm;
           this.nroSerie = nroSerie;
           this.nroCano = nroCano;
           this.descrCompl = descrCompl;
    }


    /**
     * Gets the dmIndArm value for this TpDadosArma.
     * 
     * @return dmIndArm
     */
    public org.apache.axis.types.NonNegativeInteger getDmIndArm() {
        return dmIndArm;
    }


    /**
     * Sets the dmIndArm value for this TpDadosArma.
     * 
     * @param dmIndArm
     */
    public void setDmIndArm(org.apache.axis.types.NonNegativeInteger dmIndArm) {
        this.dmIndArm = dmIndArm;
    }


    /**
     * Gets the nroSerie value for this TpDadosArma.
     * 
     * @return nroSerie
     */
    public java.math.BigInteger getNroSerie() {
        return nroSerie;
    }


    /**
     * Sets the nroSerie value for this TpDadosArma.
     * 
     * @param nroSerie
     */
    public void setNroSerie(java.math.BigInteger nroSerie) {
        this.nroSerie = nroSerie;
    }


    /**
     * Gets the nroCano value for this TpDadosArma.
     * 
     * @return nroCano
     */
    public java.math.BigInteger getNroCano() {
        return nroCano;
    }


    /**
     * Sets the nroCano value for this TpDadosArma.
     * 
     * @param nroCano
     */
    public void setNroCano(java.math.BigInteger nroCano) {
        this.nroCano = nroCano;
    }


    /**
     * Gets the descrCompl value for this TpDadosArma.
     * 
     * @return descrCompl
     */
    public java.lang.String getDescrCompl() {
        return descrCompl;
    }


    /**
     * Sets the descrCompl value for this TpDadosArma.
     * 
     * @param descrCompl
     */
    public void setDescrCompl(java.lang.String descrCompl) {
        this.descrCompl = descrCompl;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TpDadosArma)) return false;
        TpDadosArma other = (TpDadosArma) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dmIndArm==null && other.getDmIndArm()==null) || 
             (this.dmIndArm!=null &&
              this.dmIndArm.equals(other.getDmIndArm()))) &&
            ((this.nroSerie==null && other.getNroSerie()==null) || 
             (this.nroSerie!=null &&
              this.nroSerie.equals(other.getNroSerie()))) &&
            ((this.nroCano==null && other.getNroCano()==null) || 
             (this.nroCano!=null &&
              this.nroCano.equals(other.getNroCano()))) &&
            ((this.descrCompl==null && other.getDescrCompl()==null) || 
             (this.descrCompl!=null &&
              this.descrCompl.equals(other.getDescrCompl())));
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
        if (getDmIndArm() != null) {
            _hashCode += getDmIndArm().hashCode();
        }
        if (getNroSerie() != null) {
            _hashCode += getNroSerie().hashCode();
        }
        if (getNroCano() != null) {
            _hashCode += getNroCano().hashCode();
        }
        if (getDescrCompl() != null) {
            _hashCode += getDescrCompl().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TpDadosArma.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "tpDadosArma"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dmIndArm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "dmIndArm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "tpDominio"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nroSerie");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "nroSerie"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nroCano");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "nroCano"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descrCompl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "descrCompl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
