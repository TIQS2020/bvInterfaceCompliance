/**
 * TpCfeRef.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil;

public class TpCfeRef  implements java.io.Serializable {
    private java.lang.String codMod;

    private java.math.BigInteger nrSat;

    private java.lang.String chaveAcessoCfe;

    private java.math.BigInteger nroCfe;

    private java.util.Date dtDocto;

    public TpCfeRef() {
    }

    public TpCfeRef(
           java.lang.String codMod,
           java.math.BigInteger nrSat,
           java.lang.String chaveAcessoCfe,
           java.math.BigInteger nroCfe,
           java.util.Date dtDocto) {
           this.codMod = codMod;
           this.nrSat = nrSat;
           this.chaveAcessoCfe = chaveAcessoCfe;
           this.nroCfe = nroCfe;
           this.dtDocto = dtDocto;
    }


    /**
     * Gets the codMod value for this TpCfeRef.
     * 
     * @return codMod
     */
    public java.lang.String getCodMod() {
        return codMod;
    }


    /**
     * Sets the codMod value for this TpCfeRef.
     * 
     * @param codMod
     */
    public void setCodMod(java.lang.String codMod) {
        this.codMod = codMod;
    }


    /**
     * Gets the nrSat value for this TpCfeRef.
     * 
     * @return nrSat
     */
    public java.math.BigInteger getNrSat() {
        return nrSat;
    }


    /**
     * Sets the nrSat value for this TpCfeRef.
     * 
     * @param nrSat
     */
    public void setNrSat(java.math.BigInteger nrSat) {
        this.nrSat = nrSat;
    }


    /**
     * Gets the chaveAcessoCfe value for this TpCfeRef.
     * 
     * @return chaveAcessoCfe
     */
    public java.lang.String getChaveAcessoCfe() {
        return chaveAcessoCfe;
    }


    /**
     * Sets the chaveAcessoCfe value for this TpCfeRef.
     * 
     * @param chaveAcessoCfe
     */
    public void setChaveAcessoCfe(java.lang.String chaveAcessoCfe) {
        this.chaveAcessoCfe = chaveAcessoCfe;
    }


    /**
     * Gets the nroCfe value for this TpCfeRef.
     * 
     * @return nroCfe
     */
    public java.math.BigInteger getNroCfe() {
        return nroCfe;
    }


    /**
     * Sets the nroCfe value for this TpCfeRef.
     * 
     * @param nroCfe
     */
    public void setNroCfe(java.math.BigInteger nroCfe) {
        this.nroCfe = nroCfe;
    }


    /**
     * Gets the dtDocto value for this TpCfeRef.
     * 
     * @return dtDocto
     */
    public java.util.Date getDtDocto() {
        return dtDocto;
    }


    /**
     * Sets the dtDocto value for this TpCfeRef.
     * 
     * @param dtDocto
     */
    public void setDtDocto(java.util.Date dtDocto) {
        this.dtDocto = dtDocto;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TpCfeRef)) return false;
        TpCfeRef other = (TpCfeRef) obj;
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
            ((this.nrSat==null && other.getNrSat()==null) || 
             (this.nrSat!=null &&
              this.nrSat.equals(other.getNrSat()))) &&
            ((this.chaveAcessoCfe==null && other.getChaveAcessoCfe()==null) || 
             (this.chaveAcessoCfe!=null &&
              this.chaveAcessoCfe.equals(other.getChaveAcessoCfe()))) &&
            ((this.nroCfe==null && other.getNroCfe()==null) || 
             (this.nroCfe!=null &&
              this.nroCfe.equals(other.getNroCfe()))) &&
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
        if (getNrSat() != null) {
            _hashCode += getNrSat().hashCode();
        }
        if (getChaveAcessoCfe() != null) {
            _hashCode += getChaveAcessoCfe().hashCode();
        }
        if (getNroCfe() != null) {
            _hashCode += getNroCfe().hashCode();
        }
        if (getDtDocto() != null) {
            _hashCode += getDtDocto().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TpCfeRef.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "tpCfeRef"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codMod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "codMod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nrSat");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "nrSat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chaveAcessoCfe");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "chaveAcessoCfe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nroCfe");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "nroCfe"));
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
