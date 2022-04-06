/**
 * TpCupomFiscalRef.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil;

public class TpCupomFiscalRef  implements java.io.Serializable {
    private java.lang.String codMod;

    private java.lang.String ecfFab;

    private java.math.BigInteger ecfCx;

    private java.math.BigInteger numDocto;

    private java.util.Date dtDocto;

    public TpCupomFiscalRef() {
    }

    public TpCupomFiscalRef(
           java.lang.String codMod,
           java.lang.String ecfFab,
           java.math.BigInteger ecfCx,
           java.math.BigInteger numDocto,
           java.util.Date dtDocto) {
           this.codMod = codMod;
           this.ecfFab = ecfFab;
           this.ecfCx = ecfCx;
           this.numDocto = numDocto;
           this.dtDocto = dtDocto;
    }


    /**
     * Gets the codMod value for this TpCupomFiscalRef.
     * 
     * @return codMod
     */
    public java.lang.String getCodMod() {
        return codMod;
    }


    /**
     * Sets the codMod value for this TpCupomFiscalRef.
     * 
     * @param codMod
     */
    public void setCodMod(java.lang.String codMod) {
        this.codMod = codMod;
    }


    /**
     * Gets the ecfFab value for this TpCupomFiscalRef.
     * 
     * @return ecfFab
     */
    public java.lang.String getEcfFab() {
        return ecfFab;
    }


    /**
     * Sets the ecfFab value for this TpCupomFiscalRef.
     * 
     * @param ecfFab
     */
    public void setEcfFab(java.lang.String ecfFab) {
        this.ecfFab = ecfFab;
    }


    /**
     * Gets the ecfCx value for this TpCupomFiscalRef.
     * 
     * @return ecfCx
     */
    public java.math.BigInteger getEcfCx() {
        return ecfCx;
    }


    /**
     * Sets the ecfCx value for this TpCupomFiscalRef.
     * 
     * @param ecfCx
     */
    public void setEcfCx(java.math.BigInteger ecfCx) {
        this.ecfCx = ecfCx;
    }


    /**
     * Gets the numDocto value for this TpCupomFiscalRef.
     * 
     * @return numDocto
     */
    public java.math.BigInteger getNumDocto() {
        return numDocto;
    }


    /**
     * Sets the numDocto value for this TpCupomFiscalRef.
     * 
     * @param numDocto
     */
    public void setNumDocto(java.math.BigInteger numDocto) {
        this.numDocto = numDocto;
    }


    /**
     * Gets the dtDocto value for this TpCupomFiscalRef.
     * 
     * @return dtDocto
     */
    public java.util.Date getDtDocto() {
        return dtDocto;
    }


    /**
     * Sets the dtDocto value for this TpCupomFiscalRef.
     * 
     * @param dtDocto
     */
    public void setDtDocto(java.util.Date dtDocto) {
        this.dtDocto = dtDocto;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TpCupomFiscalRef)) return false;
        TpCupomFiscalRef other = (TpCupomFiscalRef) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codMod==null && other.getCodMod()==null) || 
             (this.codMod!=null &&
              this.codMod.equals(other.getCodMod()))) &&
            ((this.ecfFab==null && other.getEcfFab()==null) || 
             (this.ecfFab!=null &&
              this.ecfFab.equals(other.getEcfFab()))) &&
            ((this.ecfCx==null && other.getEcfCx()==null) || 
             (this.ecfCx!=null &&
              this.ecfCx.equals(other.getEcfCx()))) &&
            ((this.numDocto==null && other.getNumDocto()==null) || 
             (this.numDocto!=null &&
              this.numDocto.equals(other.getNumDocto()))) &&
            ((this.dtDocto==null && other.getDtDocto()==null) || 
             (this.dtDocto!=null &&
              this.dtDocto.equals(other.getDtDocto())));
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
        if (getCodMod() != null) {
            _hashCode += getCodMod().hashCode();
        }
        if (getEcfFab() != null) {
            _hashCode += getEcfFab().hashCode();
        }
        if (getEcfCx() != null) {
            _hashCode += getEcfCx().hashCode();
        }
        if (getNumDocto() != null) {
            _hashCode += getNumDocto().hashCode();
        }
        if (getDtDocto() != null) {
            _hashCode += getDtDocto().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TpCupomFiscalRef.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "tpCupomFiscalRef"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codMod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "codMod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ecfFab");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "ecfFab"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ecfCx");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "ecfCx"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numDocto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "numDocto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dtDocto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "dtDocto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
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
