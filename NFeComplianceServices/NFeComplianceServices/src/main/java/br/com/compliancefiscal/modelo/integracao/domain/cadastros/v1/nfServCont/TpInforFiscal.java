/**
 * TpInforFiscal.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServCont;

public class TpInforFiscal  implements java.io.Serializable {
    private java.lang.String codObsLanctoFiscal;

    private java.lang.String txtCompl;

    private br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServCont.TpInfProvDoctoFiscal[] infProvDoctoFiscalSc;

    public TpInforFiscal() {
    }

    public TpInforFiscal(
           java.lang.String codObsLanctoFiscal,
           java.lang.String txtCompl,
           br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServCont.TpInfProvDoctoFiscal[] infProvDoctoFiscalSc) {
           this.codObsLanctoFiscal = codObsLanctoFiscal;
           this.txtCompl = txtCompl;
           this.infProvDoctoFiscalSc = infProvDoctoFiscalSc;
    }


    /**
     * Gets the codObsLanctoFiscal value for this TpInforFiscal.
     * 
     * @return codObsLanctoFiscal
     */
    public java.lang.String getCodObsLanctoFiscal() {
        return codObsLanctoFiscal;
    }


    /**
     * Sets the codObsLanctoFiscal value for this TpInforFiscal.
     * 
     * @param codObsLanctoFiscal
     */
    public void setCodObsLanctoFiscal(java.lang.String codObsLanctoFiscal) {
        this.codObsLanctoFiscal = codObsLanctoFiscal;
    }


    /**
     * Gets the txtCompl value for this TpInforFiscal.
     * 
     * @return txtCompl
     */
    public java.lang.String getTxtCompl() {
        return txtCompl;
    }


    /**
     * Sets the txtCompl value for this TpInforFiscal.
     * 
     * @param txtCompl
     */
    public void setTxtCompl(java.lang.String txtCompl) {
        this.txtCompl = txtCompl;
    }


    /**
     * Gets the infProvDoctoFiscalSc value for this TpInforFiscal.
     * 
     * @return infProvDoctoFiscalSc
     */
    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServCont.TpInfProvDoctoFiscal[] getInfProvDoctoFiscalSc() {
        return infProvDoctoFiscalSc;
    }


    /**
     * Sets the infProvDoctoFiscalSc value for this TpInforFiscal.
     * 
     * @param infProvDoctoFiscalSc
     */
    public void setInfProvDoctoFiscalSc(br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServCont.TpInfProvDoctoFiscal[] infProvDoctoFiscalSc) {
        this.infProvDoctoFiscalSc = infProvDoctoFiscalSc;
    }

    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServCont.TpInfProvDoctoFiscal getInfProvDoctoFiscalSc(int i) {
        return this.infProvDoctoFiscalSc[i];
    }

    public void setInfProvDoctoFiscalSc(int i, br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServCont.TpInfProvDoctoFiscal _value) {
        this.infProvDoctoFiscalSc[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TpInforFiscal)) return false;
        TpInforFiscal other = (TpInforFiscal) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codObsLanctoFiscal==null && other.getCodObsLanctoFiscal()==null) || 
             (this.codObsLanctoFiscal!=null &&
              this.codObsLanctoFiscal.equals(other.getCodObsLanctoFiscal()))) &&
            ((this.txtCompl==null && other.getTxtCompl()==null) || 
             (this.txtCompl!=null &&
              this.txtCompl.equals(other.getTxtCompl()))) &&
            ((this.infProvDoctoFiscalSc==null && other.getInfProvDoctoFiscalSc()==null) || 
             (this.infProvDoctoFiscalSc!=null &&
              java.util.Arrays.equals(this.infProvDoctoFiscalSc, other.getInfProvDoctoFiscalSc())));
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
        if (getCodObsLanctoFiscal() != null) {
            _hashCode += getCodObsLanctoFiscal().hashCode();
        }
        if (getTxtCompl() != null) {
            _hashCode += getTxtCompl().hashCode();
        }
        if (getInfProvDoctoFiscalSc() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInfProvDoctoFiscalSc());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInfProvDoctoFiscalSc(), i);
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
        new org.apache.axis.description.TypeDesc(TpInforFiscal.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServCont", "tpInforFiscal"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codObsLanctoFiscal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServCont", "codObsLanctoFiscal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("txtCompl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServCont", "txtCompl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("infProvDoctoFiscalSc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServCont", "infProvDoctoFiscalSc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServCont", "tpInfProvDoctoFiscal"));
        elemField.setMinOccurs(0);
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
