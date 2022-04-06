/**
 * PirInfRRA.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.pagamentoImpRet;

public class PirInfRRA  implements java.io.Serializable {
    private br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.pagamentoImpRet.DmInd2 dmTpProc;

    private java.util.Date dtRefPerPgto;

    private java.lang.String nroProc;

    private java.math.BigDecimal codSusp;

    private java.lang.String natRRA;

    private java.math.BigDecimal qtdeMesesRRA;

    private br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.pagamentoImpRet.PirInfRRADesp pirInfRRADesp;

    public PirInfRRA() {
    }

    public PirInfRRA(
           br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.pagamentoImpRet.DmInd2 dmTpProc,
           java.util.Date dtRefPerPgto,
           java.lang.String nroProc,
           java.math.BigDecimal codSusp,
           java.lang.String natRRA,
           java.math.BigDecimal qtdeMesesRRA,
           br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.pagamentoImpRet.PirInfRRADesp pirInfRRADesp) {
           this.dmTpProc = dmTpProc;
           this.dtRefPerPgto = dtRefPerPgto;
           this.nroProc = nroProc;
           this.codSusp = codSusp;
           this.natRRA = natRRA;
           this.qtdeMesesRRA = qtdeMesesRRA;
           this.pirInfRRADesp = pirInfRRADesp;
    }


    /**
     * Gets the dmTpProc value for this PirInfRRA.
     * 
     * @return dmTpProc
     */
    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.pagamentoImpRet.DmInd2 getDmTpProc() {
        return dmTpProc;
    }


    /**
     * Sets the dmTpProc value for this PirInfRRA.
     * 
     * @param dmTpProc
     */
    public void setDmTpProc(br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.pagamentoImpRet.DmInd2 dmTpProc) {
        this.dmTpProc = dmTpProc;
    }


    /**
     * Gets the dtRefPerPgto value for this PirInfRRA.
     * 
     * @return dtRefPerPgto
     */
    public java.util.Date getDtRefPerPgto() {
        return dtRefPerPgto;
    }


    /**
     * Sets the dtRefPerPgto value for this PirInfRRA.
     * 
     * @param dtRefPerPgto
     */
    public void setDtRefPerPgto(java.util.Date dtRefPerPgto) {
        this.dtRefPerPgto = dtRefPerPgto;
    }


    /**
     * Gets the nroProc value for this PirInfRRA.
     * 
     * @return nroProc
     */
    public java.lang.String getNroProc() {
        return nroProc;
    }


    /**
     * Sets the nroProc value for this PirInfRRA.
     * 
     * @param nroProc
     */
    public void setNroProc(java.lang.String nroProc) {
        this.nroProc = nroProc;
    }


    /**
     * Gets the codSusp value for this PirInfRRA.
     * 
     * @return codSusp
     */
    public java.math.BigDecimal getCodSusp() {
        return codSusp;
    }


    /**
     * Sets the codSusp value for this PirInfRRA.
     * 
     * @param codSusp
     */
    public void setCodSusp(java.math.BigDecimal codSusp) {
        this.codSusp = codSusp;
    }


    /**
     * Gets the natRRA value for this PirInfRRA.
     * 
     * @return natRRA
     */
    public java.lang.String getNatRRA() {
        return natRRA;
    }


    /**
     * Sets the natRRA value for this PirInfRRA.
     * 
     * @param natRRA
     */
    public void setNatRRA(java.lang.String natRRA) {
        this.natRRA = natRRA;
    }


    /**
     * Gets the qtdeMesesRRA value for this PirInfRRA.
     * 
     * @return qtdeMesesRRA
     */
    public java.math.BigDecimal getQtdeMesesRRA() {
        return qtdeMesesRRA;
    }


    /**
     * Sets the qtdeMesesRRA value for this PirInfRRA.
     * 
     * @param qtdeMesesRRA
     */
    public void setQtdeMesesRRA(java.math.BigDecimal qtdeMesesRRA) {
        this.qtdeMesesRRA = qtdeMesesRRA;
    }


    /**
     * Gets the pirInfRRADesp value for this PirInfRRA.
     * 
     * @return pirInfRRADesp
     */
    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.pagamentoImpRet.PirInfRRADesp getPirInfRRADesp() {
        return pirInfRRADesp;
    }


    /**
     * Sets the pirInfRRADesp value for this PirInfRRA.
     * 
     * @param pirInfRRADesp
     */
    public void setPirInfRRADesp(br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.pagamentoImpRet.PirInfRRADesp pirInfRRADesp) {
        this.pirInfRRADesp = pirInfRRADesp;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PirInfRRA)) return false;
        PirInfRRA other = (PirInfRRA) obj;
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
            ((this.dtRefPerPgto==null && other.getDtRefPerPgto()==null) || 
             (this.dtRefPerPgto!=null &&
              this.dtRefPerPgto.equals(other.getDtRefPerPgto()))) &&
            ((this.nroProc==null && other.getNroProc()==null) || 
             (this.nroProc!=null &&
              this.nroProc.equals(other.getNroProc()))) &&
            ((this.codSusp==null && other.getCodSusp()==null) || 
             (this.codSusp!=null &&
              this.codSusp.equals(other.getCodSusp()))) &&
            ((this.natRRA==null && other.getNatRRA()==null) || 
             (this.natRRA!=null &&
              this.natRRA.equals(other.getNatRRA()))) &&
            ((this.qtdeMesesRRA==null && other.getQtdeMesesRRA()==null) || 
             (this.qtdeMesesRRA!=null &&
              this.qtdeMesesRRA.equals(other.getQtdeMesesRRA()))) &&
            ((this.pirInfRRADesp==null && other.getPirInfRRADesp()==null) || 
             (this.pirInfRRADesp!=null &&
              this.pirInfRRADesp.equals(other.getPirInfRRADesp())));
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
        if (getDtRefPerPgto() != null) {
            _hashCode += getDtRefPerPgto().hashCode();
        }
        if (getNroProc() != null) {
            _hashCode += getNroProc().hashCode();
        }
        if (getCodSusp() != null) {
            _hashCode += getCodSusp().hashCode();
        }
        if (getNatRRA() != null) {
            _hashCode += getNatRRA().hashCode();
        }
        if (getQtdeMesesRRA() != null) {
            _hashCode += getQtdeMesesRRA().hashCode();
        }
        if (getPirInfRRADesp() != null) {
            _hashCode += getPirInfRRADesp().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PirInfRRA.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/pagamentoImpRet", "pirInfRRA"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dmTpProc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/pagamentoImpRet", "dmTpProc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/pagamentoImpRet", "dmInd2"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dtRefPerPgto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/pagamentoImpRet", "dtRefPerPgto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
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
        elemField.setFieldName("natRRA");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/pagamentoImpRet", "natRRA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qtdeMesesRRA");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/pagamentoImpRet", "qtdeMesesRRA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pirInfRRADesp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/pagamentoImpRet", "pirInfRRADesp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/pagamentoImpRet", "pirInfRRADesp"));
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
