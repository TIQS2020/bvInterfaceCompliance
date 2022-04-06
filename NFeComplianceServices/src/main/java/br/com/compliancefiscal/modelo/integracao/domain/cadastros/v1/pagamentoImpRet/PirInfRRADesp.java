/**
 * PirInfRRADesp.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.pagamentoImpRet;

public class PirInfRRADesp  implements java.io.Serializable {
    private java.math.BigDecimal vlDespCustas;

    private java.math.BigDecimal vlDespAdvogados;

    private br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.pagamentoImpRet.PirInfRRADespAdv[] pirInfRRADespAdv;

    public PirInfRRADesp() {
    }

    public PirInfRRADesp(
           java.math.BigDecimal vlDespCustas,
           java.math.BigDecimal vlDespAdvogados,
           br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.pagamentoImpRet.PirInfRRADespAdv[] pirInfRRADespAdv) {
           this.vlDespCustas = vlDespCustas;
           this.vlDespAdvogados = vlDespAdvogados;
           this.pirInfRRADespAdv = pirInfRRADespAdv;
    }


    /**
     * Gets the vlDespCustas value for this PirInfRRADesp.
     * 
     * @return vlDespCustas
     */
    public java.math.BigDecimal getVlDespCustas() {
        return vlDespCustas;
    }


    /**
     * Sets the vlDespCustas value for this PirInfRRADesp.
     * 
     * @param vlDespCustas
     */
    public void setVlDespCustas(java.math.BigDecimal vlDespCustas) {
        this.vlDespCustas = vlDespCustas;
    }


    /**
     * Gets the vlDespAdvogados value for this PirInfRRADesp.
     * 
     * @return vlDespAdvogados
     */
    public java.math.BigDecimal getVlDespAdvogados() {
        return vlDespAdvogados;
    }


    /**
     * Sets the vlDespAdvogados value for this PirInfRRADesp.
     * 
     * @param vlDespAdvogados
     */
    public void setVlDespAdvogados(java.math.BigDecimal vlDespAdvogados) {
        this.vlDespAdvogados = vlDespAdvogados;
    }


    /**
     * Gets the pirInfRRADespAdv value for this PirInfRRADesp.
     * 
     * @return pirInfRRADespAdv
     */
    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.pagamentoImpRet.PirInfRRADespAdv[] getPirInfRRADespAdv() {
        return pirInfRRADespAdv;
    }


    /**
     * Sets the pirInfRRADespAdv value for this PirInfRRADesp.
     * 
     * @param pirInfRRADespAdv
     */
    public void setPirInfRRADespAdv(br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.pagamentoImpRet.PirInfRRADespAdv[] pirInfRRADespAdv) {
        this.pirInfRRADespAdv = pirInfRRADespAdv;
    }

    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.pagamentoImpRet.PirInfRRADespAdv getPirInfRRADespAdv(int i) {
        return this.pirInfRRADespAdv[i];
    }

    public void setPirInfRRADespAdv(int i, br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.pagamentoImpRet.PirInfRRADespAdv _value) {
        this.pirInfRRADespAdv[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PirInfRRADesp)) return false;
        PirInfRRADesp other = (PirInfRRADesp) obj;
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
            ((this.vlDespAdvogados==null && other.getVlDespAdvogados()==null) || 
             (this.vlDespAdvogados!=null &&
              this.vlDespAdvogados.equals(other.getVlDespAdvogados()))) &&
            ((this.pirInfRRADespAdv==null && other.getPirInfRRADespAdv()==null) || 
             (this.pirInfRRADespAdv!=null &&
              java.util.Arrays.equals(this.pirInfRRADespAdv, other.getPirInfRRADespAdv())));
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
        if (getVlDespAdvogados() != null) {
            _hashCode += getVlDespAdvogados().hashCode();
        }
        if (getPirInfRRADespAdv() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPirInfRRADespAdv());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPirInfRRADespAdv(), i);
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
        new org.apache.axis.description.TypeDesc(PirInfRRADesp.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/pagamentoImpRet", "pirInfRRADesp"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlDespCustas");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/pagamentoImpRet", "vlDespCustas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlDespAdvogados");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/pagamentoImpRet", "vlDespAdvogados"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pirInfRRADespAdv");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/pagamentoImpRet", "pirInfRRADespAdv"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/pagamentoImpRet", "pirInfRRADespAdv"));
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
