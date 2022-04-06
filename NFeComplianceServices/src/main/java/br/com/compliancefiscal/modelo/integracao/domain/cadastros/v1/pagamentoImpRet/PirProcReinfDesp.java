/**
 * PirProcReinfDesp.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.pagamentoImpRet;

public class PirProcReinfDesp  implements java.io.Serializable {
    private java.math.BigDecimal vlDespCustas;

    private java.math.BigDecimal vlDespAdvog;

    private br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.pagamentoImpRet.PirProcReinfDespAdv[] pirProcReinfDespAdv;

    public PirProcReinfDesp() {
    }

    public PirProcReinfDesp(
           java.math.BigDecimal vlDespCustas,
           java.math.BigDecimal vlDespAdvog,
           br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.pagamentoImpRet.PirProcReinfDespAdv[] pirProcReinfDespAdv) {
           this.vlDespCustas = vlDespCustas;
           this.vlDespAdvog = vlDespAdvog;
           this.pirProcReinfDespAdv = pirProcReinfDespAdv;
    }


    /**
     * Gets the vlDespCustas value for this PirProcReinfDesp.
     * 
     * @return vlDespCustas
     */
    public java.math.BigDecimal getVlDespCustas() {
        return vlDespCustas;
    }


    /**
     * Sets the vlDespCustas value for this PirProcReinfDesp.
     * 
     * @param vlDespCustas
     */
    public void setVlDespCustas(java.math.BigDecimal vlDespCustas) {
        this.vlDespCustas = vlDespCustas;
    }


    /**
     * Gets the vlDespAdvog value for this PirProcReinfDesp.
     * 
     * @return vlDespAdvog
     */
    public java.math.BigDecimal getVlDespAdvog() {
        return vlDespAdvog;
    }


    /**
     * Sets the vlDespAdvog value for this PirProcReinfDesp.
     * 
     * @param vlDespAdvog
     */
    public void setVlDespAdvog(java.math.BigDecimal vlDespAdvog) {
        this.vlDespAdvog = vlDespAdvog;
    }


    /**
     * Gets the pirProcReinfDespAdv value for this PirProcReinfDesp.
     * 
     * @return pirProcReinfDespAdv
     */
    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.pagamentoImpRet.PirProcReinfDespAdv[] getPirProcReinfDespAdv() {
        return pirProcReinfDespAdv;
    }


    /**
     * Sets the pirProcReinfDespAdv value for this PirProcReinfDesp.
     * 
     * @param pirProcReinfDespAdv
     */
    public void setPirProcReinfDespAdv(br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.pagamentoImpRet.PirProcReinfDespAdv[] pirProcReinfDespAdv) {
        this.pirProcReinfDespAdv = pirProcReinfDespAdv;
    }

    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.pagamentoImpRet.PirProcReinfDespAdv getPirProcReinfDespAdv(int i) {
        return this.pirProcReinfDespAdv[i];
    }

    public void setPirProcReinfDespAdv(int i, br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.pagamentoImpRet.PirProcReinfDespAdv _value) {
        this.pirProcReinfDespAdv[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PirProcReinfDesp)) return false;
        PirProcReinfDesp other = (PirProcReinfDesp) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.vlDespCustas==null && other.getVlDespCustas()==null) || 
             (this.vlDespCustas!=null &&
              this.vlDespCustas.equals(other.getVlDespCustas()))) &&
            ((this.vlDespAdvog==null && other.getVlDespAdvog()==null) || 
             (this.vlDespAdvog!=null &&
              this.vlDespAdvog.equals(other.getVlDespAdvog()))) &&
            ((this.pirProcReinfDespAdv==null && other.getPirProcReinfDespAdv()==null) || 
             (this.pirProcReinfDespAdv!=null &&
              java.util.Arrays.equals(this.pirProcReinfDespAdv, other.getPirProcReinfDespAdv())));
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
        if (getVlDespCustas() != null) {
            _hashCode += getVlDespCustas().hashCode();
        }
        if (getVlDespAdvog() != null) {
            _hashCode += getVlDespAdvog().hashCode();
        }
        if (getPirProcReinfDespAdv() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPirProcReinfDespAdv());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPirProcReinfDespAdv(), i);
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
        new org.apache.axis.description.TypeDesc(PirProcReinfDesp.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/pagamentoImpRet", "pirProcReinfDesp"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlDespCustas");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/pagamentoImpRet", "vlDespCustas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlDespAdvog");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/pagamentoImpRet", "vlDespAdvog"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pirProcReinfDespAdv");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/pagamentoImpRet", "pirProcReinfDespAdv"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/pagamentoImpRet", "pirProcReinfDespAdv"));
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
