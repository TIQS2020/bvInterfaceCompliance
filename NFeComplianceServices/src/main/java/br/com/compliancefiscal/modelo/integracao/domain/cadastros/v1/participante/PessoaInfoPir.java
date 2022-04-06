/**
 * PessoaInfoPir.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.participante;

public class PessoaInfoPir  implements java.io.Serializable {
    private java.math.BigInteger dmIndNifl;

    private java.lang.String nifBenef;

    private java.lang.String codRelFontePagadReinf;

    private java.util.Calendar dtLaudoMolestia;

    public PessoaInfoPir() {
    }

    public PessoaInfoPir(
           java.math.BigInteger dmIndNifl,
           java.lang.String nifBenef,
           java.lang.String codRelFontePagadReinf,
           java.util.Calendar dtLaudoMolestia) {
           this.dmIndNifl = dmIndNifl;
           this.nifBenef = nifBenef;
           this.codRelFontePagadReinf = codRelFontePagadReinf;
           this.dtLaudoMolestia = dtLaudoMolestia;
    }


    /**
     * Gets the dmIndNifl value for this PessoaInfoPir.
     * 
     * @return dmIndNifl
     */
    public java.math.BigInteger getDmIndNifl() {
        return dmIndNifl;
    }


    /**
     * Sets the dmIndNifl value for this PessoaInfoPir.
     * 
     * @param dmIndNifl
     */
    public void setDmIndNifl(java.math.BigInteger dmIndNifl) {
        this.dmIndNifl = dmIndNifl;
    }


    /**
     * Gets the nifBenef value for this PessoaInfoPir.
     * 
     * @return nifBenef
     */
    public java.lang.String getNifBenef() {
        return nifBenef;
    }


    /**
     * Sets the nifBenef value for this PessoaInfoPir.
     * 
     * @param nifBenef
     */
    public void setNifBenef(java.lang.String nifBenef) {
        this.nifBenef = nifBenef;
    }


    /**
     * Gets the codRelFontePagadReinf value for this PessoaInfoPir.
     * 
     * @return codRelFontePagadReinf
     */
    public java.lang.String getCodRelFontePagadReinf() {
        return codRelFontePagadReinf;
    }


    /**
     * Sets the codRelFontePagadReinf value for this PessoaInfoPir.
     * 
     * @param codRelFontePagadReinf
     */
    public void setCodRelFontePagadReinf(java.lang.String codRelFontePagadReinf) {
        this.codRelFontePagadReinf = codRelFontePagadReinf;
    }


    /**
     * Gets the dtLaudoMolestia value for this PessoaInfoPir.
     * 
     * @return dtLaudoMolestia
     */
    public java.util.Calendar getDtLaudoMolestia() {
        return dtLaudoMolestia;
    }


    /**
     * Sets the dtLaudoMolestia value for this PessoaInfoPir.
     * 
     * @param dtLaudoMolestia
     */
    public void setDtLaudoMolestia(java.util.Calendar dtLaudoMolestia) {
        this.dtLaudoMolestia = dtLaudoMolestia;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PessoaInfoPir)) return false;
        PessoaInfoPir other = (PessoaInfoPir) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dmIndNifl==null && other.getDmIndNifl()==null) || 
             (this.dmIndNifl!=null &&
              this.dmIndNifl.equals(other.getDmIndNifl()))) &&
            ((this.nifBenef==null && other.getNifBenef()==null) || 
             (this.nifBenef!=null &&
              this.nifBenef.equals(other.getNifBenef()))) &&
            ((this.codRelFontePagadReinf==null && other.getCodRelFontePagadReinf()==null) || 
             (this.codRelFontePagadReinf!=null &&
              this.codRelFontePagadReinf.equals(other.getCodRelFontePagadReinf()))) &&
            ((this.dtLaudoMolestia==null && other.getDtLaudoMolestia()==null) || 
             (this.dtLaudoMolestia!=null &&
              this.dtLaudoMolestia.equals(other.getDtLaudoMolestia())));
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
        if (getDmIndNifl() != null) {
            _hashCode += getDmIndNifl().hashCode();
        }
        if (getNifBenef() != null) {
            _hashCode += getNifBenef().hashCode();
        }
        if (getCodRelFontePagadReinf() != null) {
            _hashCode += getCodRelFontePagadReinf().hashCode();
        }
        if (getDtLaudoMolestia() != null) {
            _hashCode += getDtLaudoMolestia().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PessoaInfoPir.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/participante", "pessoaInfoPir"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dmIndNifl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/participante", "dmIndNifl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nifBenef");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/participante", "nifBenef"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codRelFontePagadReinf");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/participante", "codRelFontePagadReinf"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dtLaudoMolestia");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/participante", "dtLaudoMolestia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
