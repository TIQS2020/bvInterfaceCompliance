/**
 * TpCorrApontReg.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.perContrProdEstq;

public class TpCorrApontReg  implements java.io.Serializable {
    private java.util.Date dtIniAp;

    private java.util.Date dtFinAp;

    private java.lang.String codOpOs;

    private java.lang.String codItemCorr;

    private java.math.BigDecimal qtdCorPos;

    private java.math.BigDecimal qtdCorNeg;

    private java.lang.String dmOrigem;

    private br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.perContrProdEstq.TpCorrApontRetIns[] corrApontRetIns;

    public TpCorrApontReg() {
    }

    public TpCorrApontReg(
           java.util.Date dtIniAp,
           java.util.Date dtFinAp,
           java.lang.String codOpOs,
           java.lang.String codItemCorr,
           java.math.BigDecimal qtdCorPos,
           java.math.BigDecimal qtdCorNeg,
           java.lang.String dmOrigem,
           br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.perContrProdEstq.TpCorrApontRetIns[] corrApontRetIns) {
           this.dtIniAp = dtIniAp;
           this.dtFinAp = dtFinAp;
           this.codOpOs = codOpOs;
           this.codItemCorr = codItemCorr;
           this.qtdCorPos = qtdCorPos;
           this.qtdCorNeg = qtdCorNeg;
           this.dmOrigem = dmOrigem;
           this.corrApontRetIns = corrApontRetIns;
    }


    /**
     * Gets the dtIniAp value for this TpCorrApontReg.
     * 
     * @return dtIniAp
     */
    public java.util.Date getDtIniAp() {
        return dtIniAp;
    }


    /**
     * Sets the dtIniAp value for this TpCorrApontReg.
     * 
     * @param dtIniAp
     */
    public void setDtIniAp(java.util.Date dtIniAp) {
        this.dtIniAp = dtIniAp;
    }


    /**
     * Gets the dtFinAp value for this TpCorrApontReg.
     * 
     * @return dtFinAp
     */
    public java.util.Date getDtFinAp() {
        return dtFinAp;
    }


    /**
     * Sets the dtFinAp value for this TpCorrApontReg.
     * 
     * @param dtFinAp
     */
    public void setDtFinAp(java.util.Date dtFinAp) {
        this.dtFinAp = dtFinAp;
    }


    /**
     * Gets the codOpOs value for this TpCorrApontReg.
     * 
     * @return codOpOs
     */
    public java.lang.String getCodOpOs() {
        return codOpOs;
    }


    /**
     * Sets the codOpOs value for this TpCorrApontReg.
     * 
     * @param codOpOs
     */
    public void setCodOpOs(java.lang.String codOpOs) {
        this.codOpOs = codOpOs;
    }


    /**
     * Gets the codItemCorr value for this TpCorrApontReg.
     * 
     * @return codItemCorr
     */
    public java.lang.String getCodItemCorr() {
        return codItemCorr;
    }


    /**
     * Sets the codItemCorr value for this TpCorrApontReg.
     * 
     * @param codItemCorr
     */
    public void setCodItemCorr(java.lang.String codItemCorr) {
        this.codItemCorr = codItemCorr;
    }


    /**
     * Gets the qtdCorPos value for this TpCorrApontReg.
     * 
     * @return qtdCorPos
     */
    public java.math.BigDecimal getQtdCorPos() {
        return qtdCorPos;
    }


    /**
     * Sets the qtdCorPos value for this TpCorrApontReg.
     * 
     * @param qtdCorPos
     */
    public void setQtdCorPos(java.math.BigDecimal qtdCorPos) {
        this.qtdCorPos = qtdCorPos;
    }


    /**
     * Gets the qtdCorNeg value for this TpCorrApontReg.
     * 
     * @return qtdCorNeg
     */
    public java.math.BigDecimal getQtdCorNeg() {
        return qtdCorNeg;
    }


    /**
     * Sets the qtdCorNeg value for this TpCorrApontReg.
     * 
     * @param qtdCorNeg
     */
    public void setQtdCorNeg(java.math.BigDecimal qtdCorNeg) {
        this.qtdCorNeg = qtdCorNeg;
    }


    /**
     * Gets the dmOrigem value for this TpCorrApontReg.
     * 
     * @return dmOrigem
     */
    public java.lang.String getDmOrigem() {
        return dmOrigem;
    }


    /**
     * Sets the dmOrigem value for this TpCorrApontReg.
     * 
     * @param dmOrigem
     */
    public void setDmOrigem(java.lang.String dmOrigem) {
        this.dmOrigem = dmOrigem;
    }


    /**
     * Gets the corrApontRetIns value for this TpCorrApontReg.
     * 
     * @return corrApontRetIns
     */
    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.perContrProdEstq.TpCorrApontRetIns[] getCorrApontRetIns() {
        return corrApontRetIns;
    }


    /**
     * Sets the corrApontRetIns value for this TpCorrApontReg.
     * 
     * @param corrApontRetIns
     */
    public void setCorrApontRetIns(br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.perContrProdEstq.TpCorrApontRetIns[] corrApontRetIns) {
        this.corrApontRetIns = corrApontRetIns;
    }

    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.perContrProdEstq.TpCorrApontRetIns getCorrApontRetIns(int i) {
        return this.corrApontRetIns[i];
    }

    public void setCorrApontRetIns(int i, br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.perContrProdEstq.TpCorrApontRetIns _value) {
        this.corrApontRetIns[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TpCorrApontReg)) return false;
        TpCorrApontReg other = (TpCorrApontReg) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dtIniAp==null && other.getDtIniAp()==null) || 
             (this.dtIniAp!=null &&
              this.dtIniAp.equals(other.getDtIniAp()))) &&
            ((this.dtFinAp==null && other.getDtFinAp()==null) || 
             (this.dtFinAp!=null &&
              this.dtFinAp.equals(other.getDtFinAp()))) &&
            ((this.codOpOs==null && other.getCodOpOs()==null) || 
             (this.codOpOs!=null &&
              this.codOpOs.equals(other.getCodOpOs()))) &&
            ((this.codItemCorr==null && other.getCodItemCorr()==null) || 
             (this.codItemCorr!=null &&
              this.codItemCorr.equals(other.getCodItemCorr()))) &&
            ((this.qtdCorPos==null && other.getQtdCorPos()==null) || 
             (this.qtdCorPos!=null &&
              this.qtdCorPos.equals(other.getQtdCorPos()))) &&
            ((this.qtdCorNeg==null && other.getQtdCorNeg()==null) || 
             (this.qtdCorNeg!=null &&
              this.qtdCorNeg.equals(other.getQtdCorNeg()))) &&
            ((this.dmOrigem==null && other.getDmOrigem()==null) || 
             (this.dmOrigem!=null &&
              this.dmOrigem.equals(other.getDmOrigem()))) &&
            ((this.corrApontRetIns==null && other.getCorrApontRetIns()==null) || 
             (this.corrApontRetIns!=null &&
              java.util.Arrays.equals(this.corrApontRetIns, other.getCorrApontRetIns())));
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
        if (getDtIniAp() != null) {
            _hashCode += getDtIniAp().hashCode();
        }
        if (getDtFinAp() != null) {
            _hashCode += getDtFinAp().hashCode();
        }
        if (getCodOpOs() != null) {
            _hashCode += getCodOpOs().hashCode();
        }
        if (getCodItemCorr() != null) {
            _hashCode += getCodItemCorr().hashCode();
        }
        if (getQtdCorPos() != null) {
            _hashCode += getQtdCorPos().hashCode();
        }
        if (getQtdCorNeg() != null) {
            _hashCode += getQtdCorNeg().hashCode();
        }
        if (getDmOrigem() != null) {
            _hashCode += getDmOrigem().hashCode();
        }
        if (getCorrApontRetIns() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCorrApontRetIns());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCorrApontRetIns(), i);
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
        new org.apache.axis.description.TypeDesc(TpCorrApontReg.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/perContrProdEstq", "tpCorrApontReg"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dtIniAp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/perContrProdEstq", "dtIniAp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dtFinAp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/perContrProdEstq", "dtFinAp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codOpOs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/perContrProdEstq", "codOpOs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codItemCorr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/perContrProdEstq", "codItemCorr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qtdCorPos");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/perContrProdEstq", "qtdCorPos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalThreePrec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qtdCorNeg");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/perContrProdEstq", "qtdCorNeg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalThreePrec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dmOrigem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/perContrProdEstq", "dmOrigem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/perContrProdEstq", "tpStringOne"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("corrApontRetIns");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/perContrProdEstq", "corrApontRetIns"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/perContrProdEstq", "tpCorrApontRetIns"));
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
