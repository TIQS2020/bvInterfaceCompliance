/**
 * TpDetConstrCivil.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServicos;

public class TpDetConstrCivil  implements java.io.Serializable {
    private java.lang.String codObra;

    private java.lang.String nroArt;

    private java.lang.String nroCno;

    private org.apache.axis.types.NonNegativeInteger dmIndObra;

    public TpDetConstrCivil() {
    }

    public TpDetConstrCivil(
           java.lang.String codObra,
           java.lang.String nroArt,
           java.lang.String nroCno,
           org.apache.axis.types.NonNegativeInteger dmIndObra) {
           this.codObra = codObra;
           this.nroArt = nroArt;
           this.nroCno = nroCno;
           this.dmIndObra = dmIndObra;
    }


    /**
     * Gets the codObra value for this TpDetConstrCivil.
     * 
     * @return codObra
     */
    public java.lang.String getCodObra() {
        return codObra;
    }


    /**
     * Sets the codObra value for this TpDetConstrCivil.
     * 
     * @param codObra
     */
    public void setCodObra(java.lang.String codObra) {
        this.codObra = codObra;
    }


    /**
     * Gets the nroArt value for this TpDetConstrCivil.
     * 
     * @return nroArt
     */
    public java.lang.String getNroArt() {
        return nroArt;
    }


    /**
     * Sets the nroArt value for this TpDetConstrCivil.
     * 
     * @param nroArt
     */
    public void setNroArt(java.lang.String nroArt) {
        this.nroArt = nroArt;
    }


    /**
     * Gets the nroCno value for this TpDetConstrCivil.
     * 
     * @return nroCno
     */
    public java.lang.String getNroCno() {
        return nroCno;
    }


    /**
     * Sets the nroCno value for this TpDetConstrCivil.
     * 
     * @param nroCno
     */
    public void setNroCno(java.lang.String nroCno) {
        this.nroCno = nroCno;
    }


    /**
     * Gets the dmIndObra value for this TpDetConstrCivil.
     * 
     * @return dmIndObra
     */
    public org.apache.axis.types.NonNegativeInteger getDmIndObra() {
        return dmIndObra;
    }


    /**
     * Sets the dmIndObra value for this TpDetConstrCivil.
     * 
     * @param dmIndObra
     */
    public void setDmIndObra(org.apache.axis.types.NonNegativeInteger dmIndObra) {
        this.dmIndObra = dmIndObra;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TpDetConstrCivil)) return false;
        TpDetConstrCivil other = (TpDetConstrCivil) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codObra==null && other.getCodObra()==null) || 
             (this.codObra!=null &&
              this.codObra.equals(other.getCodObra()))) &&
            ((this.nroArt==null && other.getNroArt()==null) || 
             (this.nroArt!=null &&
              this.nroArt.equals(other.getNroArt()))) &&
            ((this.nroCno==null && other.getNroCno()==null) || 
             (this.nroCno!=null &&
              this.nroCno.equals(other.getNroCno()))) &&
            ((this.dmIndObra==null && other.getDmIndObra()==null) || 
             (this.dmIndObra!=null &&
              this.dmIndObra.equals(other.getDmIndObra())));
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
        if (getCodObra() != null) {
            _hashCode += getCodObra().hashCode();
        }
        if (getNroArt() != null) {
            _hashCode += getNroArt().hashCode();
        }
        if (getNroCno() != null) {
            _hashCode += getNroCno().hashCode();
        }
        if (getDmIndObra() != null) {
            _hashCode += getDmIndObra().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TpDetConstrCivil.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServicos", "tpDetConstrCivil"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codObra");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServicos", "codObra"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nroArt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServicos", "nroArt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nroCno");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServicos", "nroCno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dmIndObra");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServicos", "dmIndObra"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "tpDominio"));
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
