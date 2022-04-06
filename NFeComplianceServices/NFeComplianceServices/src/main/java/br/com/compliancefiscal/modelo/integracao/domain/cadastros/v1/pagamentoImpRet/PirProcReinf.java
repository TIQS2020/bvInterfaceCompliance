/**
 * PirProcReinf.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.pagamentoImpRet;

public class PirProcReinf  implements java.io.Serializable {
    private br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.pagamentoImpRet.DmInd2 dmTpProc;

    private java.lang.String nroProc;

    private java.math.BigDecimal codSusp;

    private br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.pagamentoImpRet.DmInd2 dmIndOrigRec;

    private br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.pagamentoImpRet.PirProcReinfOrigRec pirProcReinfOrigRec;

    private br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.pagamentoImpRet.PirProcReinfDesp pirProcReinfDesp;

    public PirProcReinf() {
    }

    public PirProcReinf(
           br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.pagamentoImpRet.DmInd2 dmTpProc,
           java.lang.String nroProc,
           java.math.BigDecimal codSusp,
           br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.pagamentoImpRet.DmInd2 dmIndOrigRec,
           br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.pagamentoImpRet.PirProcReinfOrigRec pirProcReinfOrigRec,
           br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.pagamentoImpRet.PirProcReinfDesp pirProcReinfDesp) {
           this.dmTpProc = dmTpProc;
           this.nroProc = nroProc;
           this.codSusp = codSusp;
           this.dmIndOrigRec = dmIndOrigRec;
           this.pirProcReinfOrigRec = pirProcReinfOrigRec;
           this.pirProcReinfDesp = pirProcReinfDesp;
    }


    /**
     * Gets the dmTpProc value for this PirProcReinf.
     * 
     * @return dmTpProc
     */
    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.pagamentoImpRet.DmInd2 getDmTpProc() {
        return dmTpProc;
    }


    /**
     * Sets the dmTpProc value for this PirProcReinf.
     * 
     * @param dmTpProc
     */
    public void setDmTpProc(br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.pagamentoImpRet.DmInd2 dmTpProc) {
        this.dmTpProc = dmTpProc;
    }


    /**
     * Gets the nroProc value for this PirProcReinf.
     * 
     * @return nroProc
     */
    public java.lang.String getNroProc() {
        return nroProc;
    }


    /**
     * Sets the nroProc value for this PirProcReinf.
     * 
     * @param nroProc
     */
    public void setNroProc(java.lang.String nroProc) {
        this.nroProc = nroProc;
    }


    /**
     * Gets the codSusp value for this PirProcReinf.
     * 
     * @return codSusp
     */
    public java.math.BigDecimal getCodSusp() {
        return codSusp;
    }


    /**
     * Sets the codSusp value for this PirProcReinf.
     * 
     * @param codSusp
     */
    public void setCodSusp(java.math.BigDecimal codSusp) {
        this.codSusp = codSusp;
    }


    /**
     * Gets the dmIndOrigRec value for this PirProcReinf.
     * 
     * @return dmIndOrigRec
     */
    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.pagamentoImpRet.DmInd2 getDmIndOrigRec() {
        return dmIndOrigRec;
    }


    /**
     * Sets the dmIndOrigRec value for this PirProcReinf.
     * 
     * @param dmIndOrigRec
     */
    public void setDmIndOrigRec(br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.pagamentoImpRet.DmInd2 dmIndOrigRec) {
        this.dmIndOrigRec = dmIndOrigRec;
    }


    /**
     * Gets the pirProcReinfOrigRec value for this PirProcReinf.
     * 
     * @return pirProcReinfOrigRec
     */
    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.pagamentoImpRet.PirProcReinfOrigRec getPirProcReinfOrigRec() {
        return pirProcReinfOrigRec;
    }


    /**
     * Sets the pirProcReinfOrigRec value for this PirProcReinf.
     * 
     * @param pirProcReinfOrigRec
     */
    public void setPirProcReinfOrigRec(br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.pagamentoImpRet.PirProcReinfOrigRec pirProcReinfOrigRec) {
        this.pirProcReinfOrigRec = pirProcReinfOrigRec;
    }


    /**
     * Gets the pirProcReinfDesp value for this PirProcReinf.
     * 
     * @return pirProcReinfDesp
     */
    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.pagamentoImpRet.PirProcReinfDesp getPirProcReinfDesp() {
        return pirProcReinfDesp;
    }


    /**
     * Sets the pirProcReinfDesp value for this PirProcReinf.
     * 
     * @param pirProcReinfDesp
     */
    public void setPirProcReinfDesp(br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.pagamentoImpRet.PirProcReinfDesp pirProcReinfDesp) {
        this.pirProcReinfDesp = pirProcReinfDesp;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PirProcReinf)) return false;
        PirProcReinf other = (PirProcReinf) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dmTpProc==null && other.getDmTpProc()==null) || 
             (this.dmTpProc!=null &&
              this.dmTpProc.equals(other.getDmTpProc()))) &&
            ((this.nroProc==null && other.getNroProc()==null) || 
             (this.nroProc!=null &&
              this.nroProc.equals(other.getNroProc()))) &&
            ((this.codSusp==null && other.getCodSusp()==null) || 
             (this.codSusp!=null &&
              this.codSusp.equals(other.getCodSusp()))) &&
            ((this.dmIndOrigRec==null && other.getDmIndOrigRec()==null) || 
             (this.dmIndOrigRec!=null &&
              this.dmIndOrigRec.equals(other.getDmIndOrigRec()))) &&
            ((this.pirProcReinfOrigRec==null && other.getPirProcReinfOrigRec()==null) || 
             (this.pirProcReinfOrigRec!=null &&
              this.pirProcReinfOrigRec.equals(other.getPirProcReinfOrigRec()))) &&
            ((this.pirProcReinfDesp==null && other.getPirProcReinfDesp()==null) || 
             (this.pirProcReinfDesp!=null &&
              this.pirProcReinfDesp.equals(other.getPirProcReinfDesp())));
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
        if (getDmTpProc() != null) {
            _hashCode += getDmTpProc().hashCode();
        }
        if (getNroProc() != null) {
            _hashCode += getNroProc().hashCode();
        }
        if (getCodSusp() != null) {
            _hashCode += getCodSusp().hashCode();
        }
        if (getDmIndOrigRec() != null) {
            _hashCode += getDmIndOrigRec().hashCode();
        }
        if (getPirProcReinfOrigRec() != null) {
            _hashCode += getPirProcReinfOrigRec().hashCode();
        }
        if (getPirProcReinfDesp() != null) {
            _hashCode += getPirProcReinfDesp().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PirProcReinf.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/pagamentoImpRet", "pirProcReinf"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dmTpProc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/pagamentoImpRet", "dmTpProc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/pagamentoImpRet", "dmInd2"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nroProc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/pagamentoImpRet", "nroProc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codSusp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/pagamentoImpRet", "codSusp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dmIndOrigRec");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/pagamentoImpRet", "dmIndOrigRec"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/pagamentoImpRet", "dmInd2"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pirProcReinfOrigRec");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/pagamentoImpRet", "pirProcReinfOrigRec"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/pagamentoImpRet", "pirProcReinfOrigRec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pirProcReinfDesp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/pagamentoImpRet", "pirProcReinfDesp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/pagamentoImpRet", "pirProcReinfDesp"));
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
