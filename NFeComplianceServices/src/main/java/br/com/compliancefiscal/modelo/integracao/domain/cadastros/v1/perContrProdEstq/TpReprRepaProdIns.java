/**
 * TpReprRepaProdIns.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.perContrProdEstq;

public class TpReprRepaProdIns  implements java.io.Serializable {
    private java.lang.String codOpOs;

    private java.lang.String codItemRep;

    private java.util.Date dtSaida;

    private java.math.BigDecimal qtdSaida;

    private java.util.Date dtRet;

    private java.math.BigDecimal qtdRet;

    private br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.perContrProdEstq.TpReprRepaMercConsRet[] reprRepaMercConsRet;

    public TpReprRepaProdIns() {
    }

    public TpReprRepaProdIns(
           java.lang.String codOpOs,
           java.lang.String codItemRep,
           java.util.Date dtSaida,
           java.math.BigDecimal qtdSaida,
           java.util.Date dtRet,
           java.math.BigDecimal qtdRet,
           br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.perContrProdEstq.TpReprRepaMercConsRet[] reprRepaMercConsRet) {
           this.codOpOs = codOpOs;
           this.codItemRep = codItemRep;
           this.dtSaida = dtSaida;
           this.qtdSaida = qtdSaida;
           this.dtRet = dtRet;
           this.qtdRet = qtdRet;
           this.reprRepaMercConsRet = reprRepaMercConsRet;
    }


    /**
     * Gets the codOpOs value for this TpReprRepaProdIns.
     * 
     * @return codOpOs
     */
    public java.lang.String getCodOpOs() {
        return codOpOs;
    }


    /**
     * Sets the codOpOs value for this TpReprRepaProdIns.
     * 
     * @param codOpOs
     */
    public void setCodOpOs(java.lang.String codOpOs) {
        this.codOpOs = codOpOs;
    }


    /**
     * Gets the codItemRep value for this TpReprRepaProdIns.
     * 
     * @return codItemRep
     */
    public java.lang.String getCodItemRep() {
        return codItemRep;
    }


    /**
     * Sets the codItemRep value for this TpReprRepaProdIns.
     * 
     * @param codItemRep
     */
    public void setCodItemRep(java.lang.String codItemRep) {
        this.codItemRep = codItemRep;
    }


    /**
     * Gets the dtSaida value for this TpReprRepaProdIns.
     * 
     * @return dtSaida
     */
    public java.util.Date getDtSaida() {
        return dtSaida;
    }


    /**
     * Sets the dtSaida value for this TpReprRepaProdIns.
     * 
     * @param dtSaida
     */
    public void setDtSaida(java.util.Date dtSaida) {
        this.dtSaida = dtSaida;
    }


    /**
     * Gets the qtdSaida value for this TpReprRepaProdIns.
     * 
     * @return qtdSaida
     */
    public java.math.BigDecimal getQtdSaida() {
        return qtdSaida;
    }


    /**
     * Sets the qtdSaida value for this TpReprRepaProdIns.
     * 
     * @param qtdSaida
     */
    public void setQtdSaida(java.math.BigDecimal qtdSaida) {
        this.qtdSaida = qtdSaida;
    }


    /**
     * Gets the dtRet value for this TpReprRepaProdIns.
     * 
     * @return dtRet
     */
    public java.util.Date getDtRet() {
        return dtRet;
    }


    /**
     * Sets the dtRet value for this TpReprRepaProdIns.
     * 
     * @param dtRet
     */
    public void setDtRet(java.util.Date dtRet) {
        this.dtRet = dtRet;
    }


    /**
     * Gets the qtdRet value for this TpReprRepaProdIns.
     * 
     * @return qtdRet
     */
    public java.math.BigDecimal getQtdRet() {
        return qtdRet;
    }


    /**
     * Sets the qtdRet value for this TpReprRepaProdIns.
     * 
     * @param qtdRet
     */
    public void setQtdRet(java.math.BigDecimal qtdRet) {
        this.qtdRet = qtdRet;
    }


    /**
     * Gets the reprRepaMercConsRet value for this TpReprRepaProdIns.
     * 
     * @return reprRepaMercConsRet
     */
    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.perContrProdEstq.TpReprRepaMercConsRet[] getReprRepaMercConsRet() {
        return reprRepaMercConsRet;
    }


    /**
     * Sets the reprRepaMercConsRet value for this TpReprRepaProdIns.
     * 
     * @param reprRepaMercConsRet
     */
    public void setReprRepaMercConsRet(br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.perContrProdEstq.TpReprRepaMercConsRet[] reprRepaMercConsRet) {
        this.reprRepaMercConsRet = reprRepaMercConsRet;
    }

    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.perContrProdEstq.TpReprRepaMercConsRet getReprRepaMercConsRet(int i) {
        return this.reprRepaMercConsRet[i];
    }

    public void setReprRepaMercConsRet(int i, br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.perContrProdEstq.TpReprRepaMercConsRet _value) {
        this.reprRepaMercConsRet[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TpReprRepaProdIns)) return false;
        TpReprRepaProdIns other = (TpReprRepaProdIns) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codOpOs==null && other.getCodOpOs()==null) || 
             (this.codOpOs!=null &&
              this.codOpOs.equals(other.getCodOpOs()))) &&
            ((this.codItemRep==null && other.getCodItemRep()==null) || 
             (this.codItemRep!=null &&
              this.codItemRep.equals(other.getCodItemRep()))) &&
            ((this.dtSaida==null && other.getDtSaida()==null) || 
             (this.dtSaida!=null &&
              this.dtSaida.equals(other.getDtSaida()))) &&
            ((this.qtdSaida==null && other.getQtdSaida()==null) || 
             (this.qtdSaida!=null &&
              this.qtdSaida.equals(other.getQtdSaida()))) &&
            ((this.dtRet==null && other.getDtRet()==null) || 
             (this.dtRet!=null &&
              this.dtRet.equals(other.getDtRet()))) &&
            ((this.qtdRet==null && other.getQtdRet()==null) || 
             (this.qtdRet!=null &&
              this.qtdRet.equals(other.getQtdRet()))) &&
            ((this.reprRepaMercConsRet==null && other.getReprRepaMercConsRet()==null) || 
             (this.reprRepaMercConsRet!=null &&
              java.util.Arrays.equals(this.reprRepaMercConsRet, other.getReprRepaMercConsRet())));
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
        if (getCodOpOs() != null) {
            _hashCode += getCodOpOs().hashCode();
        }
        if (getCodItemRep() != null) {
            _hashCode += getCodItemRep().hashCode();
        }
        if (getDtSaida() != null) {
            _hashCode += getDtSaida().hashCode();
        }
        if (getQtdSaida() != null) {
            _hashCode += getQtdSaida().hashCode();
        }
        if (getDtRet() != null) {
            _hashCode += getDtRet().hashCode();
        }
        if (getQtdRet() != null) {
            _hashCode += getQtdRet().hashCode();
        }
        if (getReprRepaMercConsRet() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReprRepaMercConsRet());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReprRepaMercConsRet(), i);
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
        new org.apache.axis.description.TypeDesc(TpReprRepaProdIns.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/perContrProdEstq", "tpReprRepaProdIns"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codOpOs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/perContrProdEstq", "codOpOs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codItemRep");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/perContrProdEstq", "codItemRep"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dtSaida");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/perContrProdEstq", "dtSaida"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qtdSaida");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/perContrProdEstq", "qtdSaida"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalThreePrec"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dtRet");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/perContrProdEstq", "dtRet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qtdRet");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/perContrProdEstq", "qtdRet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalThreePrec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reprRepaMercConsRet");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/perContrProdEstq", "reprRepaMercConsRet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/perContrProdEstq", "tpReprRepaMercConsRet"));
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
