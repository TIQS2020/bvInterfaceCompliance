/**
 * TpRetornaSefaz.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.consultaGenerica;

public class TpRetornaSefaz  implements java.io.Serializable {
    private java.lang.String nroChaveNFe;

    private java.math.BigInteger nroProtocoloAut;

    private java.lang.String digiestValue;

    private java.util.Calendar dtHrAutSefaz;

    private java.math.BigInteger codRetSefaz;

    private java.lang.String descrCodRetSefaz;

    private java.lang.String motivoResp;

    public TpRetornaSefaz() {
    }

    public TpRetornaSefaz(
           java.lang.String nroChaveNFe,
           java.math.BigInteger nroProtocoloAut,
           java.lang.String digiestValue,
           java.util.Calendar dtHrAutSefaz,
           java.math.BigInteger codRetSefaz,
           java.lang.String descrCodRetSefaz,
           java.lang.String motivoResp) {
           this.nroChaveNFe = nroChaveNFe;
           this.nroProtocoloAut = nroProtocoloAut;
           this.digiestValue = digiestValue;
           this.dtHrAutSefaz = dtHrAutSefaz;
           this.codRetSefaz = codRetSefaz;
           this.descrCodRetSefaz = descrCodRetSefaz;
           this.motivoResp = motivoResp;
    }


    /**
     * Gets the nroChaveNFe value for this TpRetornaSefaz.
     * 
     * @return nroChaveNFe
     */
    public java.lang.String getNroChaveNFe() {
        return nroChaveNFe;
    }


    /**
     * Sets the nroChaveNFe value for this TpRetornaSefaz.
     * 
     * @param nroChaveNFe
     */
    public void setNroChaveNFe(java.lang.String nroChaveNFe) {
        this.nroChaveNFe = nroChaveNFe;
    }


    /**
     * Gets the nroProtocoloAut value for this TpRetornaSefaz.
     * 
     * @return nroProtocoloAut
     */
    public java.math.BigInteger getNroProtocoloAut() {
        return nroProtocoloAut;
    }


    /**
     * Sets the nroProtocoloAut value for this TpRetornaSefaz.
     * 
     * @param nroProtocoloAut
     */
    public void setNroProtocoloAut(java.math.BigInteger nroProtocoloAut) {
        this.nroProtocoloAut = nroProtocoloAut;
    }


    /**
     * Gets the digiestValue value for this TpRetornaSefaz.
     * 
     * @return digiestValue
     */
    public java.lang.String getDigiestValue() {
        return digiestValue;
    }


    /**
     * Sets the digiestValue value for this TpRetornaSefaz.
     * 
     * @param digiestValue
     */
    public void setDigiestValue(java.lang.String digiestValue) {
        this.digiestValue = digiestValue;
    }


    /**
     * Gets the dtHrAutSefaz value for this TpRetornaSefaz.
     * 
     * @return dtHrAutSefaz
     */
    public java.util.Calendar getDtHrAutSefaz() {
        return dtHrAutSefaz;
    }


    /**
     * Sets the dtHrAutSefaz value for this TpRetornaSefaz.
     * 
     * @param dtHrAutSefaz
     */
    public void setDtHrAutSefaz(java.util.Calendar dtHrAutSefaz) {
        this.dtHrAutSefaz = dtHrAutSefaz;
    }


    /**
     * Gets the codRetSefaz value for this TpRetornaSefaz.
     * 
     * @return codRetSefaz
     */
    public java.math.BigInteger getCodRetSefaz() {
        return codRetSefaz;
    }


    /**
     * Sets the codRetSefaz value for this TpRetornaSefaz.
     * 
     * @param codRetSefaz
     */
    public void setCodRetSefaz(java.math.BigInteger codRetSefaz) {
        this.codRetSefaz = codRetSefaz;
    }


    /**
     * Gets the descrCodRetSefaz value for this TpRetornaSefaz.
     * 
     * @return descrCodRetSefaz
     */
    public java.lang.String getDescrCodRetSefaz() {
        return descrCodRetSefaz;
    }


    /**
     * Sets the descrCodRetSefaz value for this TpRetornaSefaz.
     * 
     * @param descrCodRetSefaz
     */
    public void setDescrCodRetSefaz(java.lang.String descrCodRetSefaz) {
        this.descrCodRetSefaz = descrCodRetSefaz;
    }


    /**
     * Gets the motivoResp value for this TpRetornaSefaz.
     * 
     * @return motivoResp
     */
    public java.lang.String getMotivoResp() {
        return motivoResp;
    }


    /**
     * Sets the motivoResp value for this TpRetornaSefaz.
     * 
     * @param motivoResp
     */
    public void setMotivoResp(java.lang.String motivoResp) {
        this.motivoResp = motivoResp;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TpRetornaSefaz)) return false;
        TpRetornaSefaz other = (TpRetornaSefaz) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nroChaveNFe==null && other.getNroChaveNFe()==null) || 
             (this.nroChaveNFe!=null &&
              this.nroChaveNFe.equals(other.getNroChaveNFe()))) &&
            ((this.nroProtocoloAut==null && other.getNroProtocoloAut()==null) || 
             (this.nroProtocoloAut!=null &&
              this.nroProtocoloAut.equals(other.getNroProtocoloAut()))) &&
            ((this.digiestValue==null && other.getDigiestValue()==null) || 
             (this.digiestValue!=null &&
              this.digiestValue.equals(other.getDigiestValue()))) &&
            ((this.dtHrAutSefaz==null && other.getDtHrAutSefaz()==null) || 
             (this.dtHrAutSefaz!=null &&
              this.dtHrAutSefaz.equals(other.getDtHrAutSefaz()))) &&
            ((this.codRetSefaz==null && other.getCodRetSefaz()==null) || 
             (this.codRetSefaz!=null &&
              this.codRetSefaz.equals(other.getCodRetSefaz()))) &&
            ((this.descrCodRetSefaz==null && other.getDescrCodRetSefaz()==null) || 
             (this.descrCodRetSefaz!=null &&
              this.descrCodRetSefaz.equals(other.getDescrCodRetSefaz()))) &&
            ((this.motivoResp==null && other.getMotivoResp()==null) || 
             (this.motivoResp!=null &&
              this.motivoResp.equals(other.getMotivoResp())));
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
        if (getNroChaveNFe() != null) {
            _hashCode += getNroChaveNFe().hashCode();
        }
        if (getNroProtocoloAut() != null) {
            _hashCode += getNroProtocoloAut().hashCode();
        }
        if (getDigiestValue() != null) {
            _hashCode += getDigiestValue().hashCode();
        }
        if (getDtHrAutSefaz() != null) {
            _hashCode += getDtHrAutSefaz().hashCode();
        }
        if (getCodRetSefaz() != null) {
            _hashCode += getCodRetSefaz().hashCode();
        }
        if (getDescrCodRetSefaz() != null) {
            _hashCode += getDescrCodRetSefaz().hashCode();
        }
        if (getMotivoResp() != null) {
            _hashCode += getMotivoResp().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TpRetornaSefaz.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "tpRetornaSefaz"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nroChaveNFe");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "nroChaveNFe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nroProtocoloAut");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "nroProtocoloAut"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("digiestValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "digiestValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dtHrAutSefaz");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "dtHrAutSefaz"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codRetSefaz");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "codRetSefaz"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descrCodRetSefaz");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "descrCodRetSefaz"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("motivoResp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "motivoResp"));
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
