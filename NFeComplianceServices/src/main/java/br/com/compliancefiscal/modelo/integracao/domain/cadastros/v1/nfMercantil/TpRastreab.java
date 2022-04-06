/**
 * TpRastreab.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil;

public class TpRastreab  implements java.io.Serializable {
    private java.lang.String nroLote;

    private java.math.BigDecimal qtdeLote;

    private java.util.Date dtFabr;

    private java.util.Date dtValid;

    private java.lang.String codAgreg;

    public TpRastreab() {
    }

    public TpRastreab(
           java.lang.String nroLote,
           java.math.BigDecimal qtdeLote,
           java.util.Date dtFabr,
           java.util.Date dtValid,
           java.lang.String codAgreg) {
           this.nroLote = nroLote;
           this.qtdeLote = qtdeLote;
           this.dtFabr = dtFabr;
           this.dtValid = dtValid;
           this.codAgreg = codAgreg;
    }


    /**
     * Gets the nroLote value for this TpRastreab.
     * 
     * @return nroLote
     */
    public java.lang.String getNroLote() {
        return nroLote;
    }


    /**
     * Sets the nroLote value for this TpRastreab.
     * 
     * @param nroLote
     */
    public void setNroLote(java.lang.String nroLote) {
        this.nroLote = nroLote;
    }


    /**
     * Gets the qtdeLote value for this TpRastreab.
     * 
     * @return qtdeLote
     */
    public java.math.BigDecimal getQtdeLote() {
        return qtdeLote;
    }


    /**
     * Sets the qtdeLote value for this TpRastreab.
     * 
     * @param qtdeLote
     */
    public void setQtdeLote(java.math.BigDecimal qtdeLote) {
        this.qtdeLote = qtdeLote;
    }


    /**
     * Gets the dtFabr value for this TpRastreab.
     * 
     * @return dtFabr
     */
    public java.util.Date getDtFabr() {
        return dtFabr;
    }


    /**
     * Sets the dtFabr value for this TpRastreab.
     * 
     * @param dtFabr
     */
    public void setDtFabr(java.util.Date dtFabr) {
        this.dtFabr = dtFabr;
    }


    /**
     * Gets the dtValid value for this TpRastreab.
     * 
     * @return dtValid
     */
    public java.util.Date getDtValid() {
        return dtValid;
    }


    /**
     * Sets the dtValid value for this TpRastreab.
     * 
     * @param dtValid
     */
    public void setDtValid(java.util.Date dtValid) {
        this.dtValid = dtValid;
    }


    /**
     * Gets the codAgreg value for this TpRastreab.
     * 
     * @return codAgreg
     */
    public java.lang.String getCodAgreg() {
        return codAgreg;
    }


    /**
     * Sets the codAgreg value for this TpRastreab.
     * 
     * @param codAgreg
     */
    public void setCodAgreg(java.lang.String codAgreg) {
        this.codAgreg = codAgreg;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TpRastreab)) return false;
        TpRastreab other = (TpRastreab) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nroLote==null && other.getNroLote()==null) || 
             (this.nroLote!=null &&
              this.nroLote.equals(other.getNroLote()))) &&
            ((this.qtdeLote==null && other.getQtdeLote()==null) || 
             (this.qtdeLote!=null &&
              this.qtdeLote.equals(other.getQtdeLote()))) &&
            ((this.dtFabr==null && other.getDtFabr()==null) || 
             (this.dtFabr!=null &&
              this.dtFabr.equals(other.getDtFabr()))) &&
            ((this.dtValid==null && other.getDtValid()==null) || 
             (this.dtValid!=null &&
              this.dtValid.equals(other.getDtValid()))) &&
            ((this.codAgreg==null && other.getCodAgreg()==null) || 
             (this.codAgreg!=null &&
              this.codAgreg.equals(other.getCodAgreg())));
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
        if (getNroLote() != null) {
            _hashCode += getNroLote().hashCode();
        }
        if (getQtdeLote() != null) {
            _hashCode += getQtdeLote().hashCode();
        }
        if (getDtFabr() != null) {
            _hashCode += getDtFabr().hashCode();
        }
        if (getDtValid() != null) {
            _hashCode += getDtValid().hashCode();
        }
        if (getCodAgreg() != null) {
            _hashCode += getCodAgreg().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TpRastreab.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "tpRastreab"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nroLote");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "nroLote"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qtdeLote");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "qtdeLote"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalThreePrec"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dtFabr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "dtFabr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dtValid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "dtValid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codAgreg");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "codAgreg"));
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
