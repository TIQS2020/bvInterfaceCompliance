/**
 * PirDetComp.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.pagamentoImpRet;

public class PirDetComp  implements java.io.Serializable {
    private br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.pagamentoImpRet.DmInd2 dmIndPerRef;

    private java.util.Date dtRefPerPgto;

    private java.math.BigDecimal vlRendTrib;

    public PirDetComp() {
    }

    public PirDetComp(
           br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.pagamentoImpRet.DmInd2 dmIndPerRef,
           java.util.Date dtRefPerPgto,
           java.math.BigDecimal vlRendTrib) {
           this.dmIndPerRef = dmIndPerRef;
           this.dtRefPerPgto = dtRefPerPgto;
           this.vlRendTrib = vlRendTrib;
    }


    /**
     * Gets the dmIndPerRef value for this PirDetComp.
     * 
     * @return dmIndPerRef
     */
    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.pagamentoImpRet.DmInd2 getDmIndPerRef() {
        return dmIndPerRef;
    }


    /**
     * Sets the dmIndPerRef value for this PirDetComp.
     * 
     * @param dmIndPerRef
     */
    public void setDmIndPerRef(br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.pagamentoImpRet.DmInd2 dmIndPerRef) {
        this.dmIndPerRef = dmIndPerRef;
    }


    /**
     * Gets the dtRefPerPgto value for this PirDetComp.
     * 
     * @return dtRefPerPgto
     */
    public java.util.Date getDtRefPerPgto() {
        return dtRefPerPgto;
    }


    /**
     * Sets the dtRefPerPgto value for this PirDetComp.
     * 
     * @param dtRefPerPgto
     */
    public void setDtRefPerPgto(java.util.Date dtRefPerPgto) {
        this.dtRefPerPgto = dtRefPerPgto;
    }


    /**
     * Gets the vlRendTrib value for this PirDetComp.
     * 
     * @return vlRendTrib
     */
    public java.math.BigDecimal getVlRendTrib() {
        return vlRendTrib;
    }


    /**
     * Sets the vlRendTrib value for this PirDetComp.
     * 
     * @param vlRendTrib
     */
    public void setVlRendTrib(java.math.BigDecimal vlRendTrib) {
        this.vlRendTrib = vlRendTrib;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PirDetComp)) return false;
        PirDetComp other = (PirDetComp) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dmIndPerRef==null && other.getDmIndPerRef()==null) || 
             (this.dmIndPerRef!=null &&
              this.dmIndPerRef.equals(other.getDmIndPerRef()))) &&
            ((this.dtRefPerPgto==null && other.getDtRefPerPgto()==null) || 
             (this.dtRefPerPgto!=null &&
              this.dtRefPerPgto.equals(other.getDtRefPerPgto()))) &&
            ((this.vlRendTrib==null && other.getVlRendTrib()==null) || 
             (this.vlRendTrib!=null &&
              this.vlRendTrib.equals(other.getVlRendTrib())));
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
        if (getDmIndPerRef() != null) {
            _hashCode += getDmIndPerRef().hashCode();
        }
        if (getDtRefPerPgto() != null) {
            _hashCode += getDtRefPerPgto().hashCode();
        }
        if (getVlRendTrib() != null) {
            _hashCode += getVlRendTrib().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PirDetComp.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/pagamentoImpRet", "pirDetComp"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dmIndPerRef");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/pagamentoImpRet", "dmIndPerRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/pagamentoImpRet", "dmInd2"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dtRefPerPgto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/pagamentoImpRet", "dtRefPerPgto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlRendTrib");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/pagamentoImpRet", "vlRendTrib"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
