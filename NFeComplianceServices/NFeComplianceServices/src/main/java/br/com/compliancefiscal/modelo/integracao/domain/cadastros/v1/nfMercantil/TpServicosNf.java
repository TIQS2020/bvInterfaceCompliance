/**
 * TpServicosNf.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil;

public class TpServicosNf  implements java.io.Serializable {
    private org.apache.axis.types.NonNegativeInteger dmNatOper;

    private org.apache.axis.types.NonNegativeInteger dmRegTribServ;

    private java.util.Date dtExeServ;

    public TpServicosNf() {
    }

    public TpServicosNf(
           org.apache.axis.types.NonNegativeInteger dmNatOper,
           org.apache.axis.types.NonNegativeInteger dmRegTribServ,
           java.util.Date dtExeServ) {
           this.dmNatOper = dmNatOper;
           this.dmRegTribServ = dmRegTribServ;
           this.dtExeServ = dtExeServ;
    }


    /**
     * Gets the dmNatOper value for this TpServicosNf.
     * 
     * @return dmNatOper
     */
    public org.apache.axis.types.NonNegativeInteger getDmNatOper() {
        return dmNatOper;
    }


    /**
     * Sets the dmNatOper value for this TpServicosNf.
     * 
     * @param dmNatOper
     */
    public void setDmNatOper(org.apache.axis.types.NonNegativeInteger dmNatOper) {
        this.dmNatOper = dmNatOper;
    }


    /**
     * Gets the dmRegTribServ value for this TpServicosNf.
     * 
     * @return dmRegTribServ
     */
    public org.apache.axis.types.NonNegativeInteger getDmRegTribServ() {
        return dmRegTribServ;
    }


    /**
     * Sets the dmRegTribServ value for this TpServicosNf.
     * 
     * @param dmRegTribServ
     */
    public void setDmRegTribServ(org.apache.axis.types.NonNegativeInteger dmRegTribServ) {
        this.dmRegTribServ = dmRegTribServ;
    }


    /**
     * Gets the dtExeServ value for this TpServicosNf.
     * 
     * @return dtExeServ
     */
    public java.util.Date getDtExeServ() {
        return dtExeServ;
    }


    /**
     * Sets the dtExeServ value for this TpServicosNf.
     * 
     * @param dtExeServ
     */
    public void setDtExeServ(java.util.Date dtExeServ) {
        this.dtExeServ = dtExeServ;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TpServicosNf)) return false;
        TpServicosNf other = (TpServicosNf) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dmNatOper==null && other.getDmNatOper()==null) || 
             (this.dmNatOper!=null &&
              this.dmNatOper.equals(other.getDmNatOper()))) &&
            ((this.dmRegTribServ==null && other.getDmRegTribServ()==null) || 
             (this.dmRegTribServ!=null &&
              this.dmRegTribServ.equals(other.getDmRegTribServ()))) &&
            ((this.dtExeServ==null && other.getDtExeServ()==null) || 
             (this.dtExeServ!=null &&
              this.dtExeServ.equals(other.getDtExeServ())));
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
        if (getDmNatOper() != null) {
            _hashCode += getDmNatOper().hashCode();
        }
        if (getDmRegTribServ() != null) {
            _hashCode += getDmRegTribServ().hashCode();
        }
        if (getDtExeServ() != null) {
            _hashCode += getDtExeServ().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TpServicosNf.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "tpServicosNf"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dmNatOper");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "dmNatOper"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "tpDominio"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dmRegTribServ");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "dmRegTribServ"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "tpDominio"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dtExeServ");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "dtExeServ"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
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
