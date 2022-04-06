/**
 * TpDuplicatas.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServicos;

public class TpDuplicatas  implements java.io.Serializable {
    private java.lang.String nroParcela;

    private java.util.Date dtVencto;

    private java.math.BigDecimal vlDuplicata;

    public TpDuplicatas() {
    }

    public TpDuplicatas(
           java.lang.String nroParcela,
           java.util.Date dtVencto,
           java.math.BigDecimal vlDuplicata) {
           this.nroParcela = nroParcela;
           this.dtVencto = dtVencto;
           this.vlDuplicata = vlDuplicata;
    }


    /**
     * Gets the nroParcela value for this TpDuplicatas.
     * 
     * @return nroParcela
     */
    public java.lang.String getNroParcela() {
        return nroParcela;
    }


    /**
     * Sets the nroParcela value for this TpDuplicatas.
     * 
     * @param nroParcela
     */
    public void setNroParcela(java.lang.String nroParcela) {
        this.nroParcela = nroParcela;
    }


    /**
     * Gets the dtVencto value for this TpDuplicatas.
     * 
     * @return dtVencto
     */
    public java.util.Date getDtVencto() {
        return dtVencto;
    }


    /**
     * Sets the dtVencto value for this TpDuplicatas.
     * 
     * @param dtVencto
     */
    public void setDtVencto(java.util.Date dtVencto) {
        this.dtVencto = dtVencto;
    }


    /**
     * Gets the vlDuplicata value for this TpDuplicatas.
     * 
     * @return vlDuplicata
     */
    public java.math.BigDecimal getVlDuplicata() {
        return vlDuplicata;
    }


    /**
     * Sets the vlDuplicata value for this TpDuplicatas.
     * 
     * @param vlDuplicata
     */
    public void setVlDuplicata(java.math.BigDecimal vlDuplicata) {
        this.vlDuplicata = vlDuplicata;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TpDuplicatas)) return false;
        TpDuplicatas other = (TpDuplicatas) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nroParcela==null && other.getNroParcela()==null) || 
             (this.nroParcela!=null &&
              this.nroParcela.equals(other.getNroParcela()))) &&
            ((this.dtVencto==null && other.getDtVencto()==null) || 
             (this.dtVencto!=null &&
              this.dtVencto.equals(other.getDtVencto()))) &&
            ((this.vlDuplicata==null && other.getVlDuplicata()==null) || 
             (this.vlDuplicata!=null &&
              this.vlDuplicata.equals(other.getVlDuplicata())));
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
        if (getNroParcela() != null) {
            _hashCode += getNroParcela().hashCode();
        }
        if (getDtVencto() != null) {
            _hashCode += getDtVencto().hashCode();
        }
        if (getVlDuplicata() != null) {
            _hashCode += getVlDuplicata().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TpDuplicatas.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServicos", "tpDuplicatas"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nroParcela");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServicos", "nroParcela"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dtVencto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServicos", "dtVencto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlDuplicata");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServicos", "vlDuplicata"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
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
