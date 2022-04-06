/**
 * TpFatura.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServicos;

public class TpFatura  implements java.io.Serializable {
    private java.lang.String nroFatura;

    private br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServicos.TpDuplicatas[] duplicatas;

    public TpFatura() {
    }

    public TpFatura(
           java.lang.String nroFatura,
           br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServicos.TpDuplicatas[] duplicatas) {
           this.nroFatura = nroFatura;
           this.duplicatas = duplicatas;
    }


    /**
     * Gets the nroFatura value for this TpFatura.
     * 
     * @return nroFatura
     */
    public java.lang.String getNroFatura() {
        return nroFatura;
    }


    /**
     * Sets the nroFatura value for this TpFatura.
     * 
     * @param nroFatura
     */
    public void setNroFatura(java.lang.String nroFatura) {
        this.nroFatura = nroFatura;
    }


    /**
     * Gets the duplicatas value for this TpFatura.
     * 
     * @return duplicatas
     */
    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServicos.TpDuplicatas[] getDuplicatas() {
        return duplicatas;
    }


    /**
     * Sets the duplicatas value for this TpFatura.
     * 
     * @param duplicatas
     */
    public void setDuplicatas(br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServicos.TpDuplicatas[] duplicatas) {
        this.duplicatas = duplicatas;
    }

    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServicos.TpDuplicatas getDuplicatas(int i) {
        return this.duplicatas[i];
    }

    public void setDuplicatas(int i, br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServicos.TpDuplicatas _value) {
        this.duplicatas[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TpFatura)) return false;
        TpFatura other = (TpFatura) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nroFatura==null && other.getNroFatura()==null) || 
             (this.nroFatura!=null &&
              this.nroFatura.equals(other.getNroFatura()))) &&
            ((this.duplicatas==null && other.getDuplicatas()==null) || 
             (this.duplicatas!=null &&
              java.util.Arrays.equals(this.duplicatas, other.getDuplicatas())));
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
        if (getNroFatura() != null) {
            _hashCode += getNroFatura().hashCode();
        }
        if (getDuplicatas() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDuplicatas());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDuplicatas(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TpFatura.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServicos", "tpFatura"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nroFatura");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServicos", "nroFatura"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("duplicatas");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServicos", "duplicatas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServicos", "tpDuplicatas"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
