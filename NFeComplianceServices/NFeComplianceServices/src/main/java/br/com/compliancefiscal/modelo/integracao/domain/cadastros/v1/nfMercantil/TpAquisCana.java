/**
 * TpAquisCana.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil;

public class TpAquisCana  implements java.io.Serializable {
    private java.lang.String safra;

    private java.lang.String mesAnoSafra;

    private java.math.BigDecimal qtdeTotalMes;

    private java.math.BigDecimal qtdeTotalAnterior;

    private java.math.BigDecimal qtdeTotalGeral;

    private java.math.BigDecimal vlForn;

    private java.math.BigDecimal vlTotalDed;

    private java.math.BigDecimal vlLiqForn;

    private br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpAquisCanaDia[] aquisCanaDia;

    private br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpAquisCanaDed[] aquisCanaDed;

    public TpAquisCana() {
    }

    public TpAquisCana(
           java.lang.String safra,
           java.lang.String mesAnoSafra,
           java.math.BigDecimal qtdeTotalMes,
           java.math.BigDecimal qtdeTotalAnterior,
           java.math.BigDecimal qtdeTotalGeral,
           java.math.BigDecimal vlForn,
           java.math.BigDecimal vlTotalDed,
           java.math.BigDecimal vlLiqForn,
           br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpAquisCanaDia[] aquisCanaDia,
           br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpAquisCanaDed[] aquisCanaDed) {
           this.safra = safra;
           this.mesAnoSafra = mesAnoSafra;
           this.qtdeTotalMes = qtdeTotalMes;
           this.qtdeTotalAnterior = qtdeTotalAnterior;
           this.qtdeTotalGeral = qtdeTotalGeral;
           this.vlForn = vlForn;
           this.vlTotalDed = vlTotalDed;
           this.vlLiqForn = vlLiqForn;
           this.aquisCanaDia = aquisCanaDia;
           this.aquisCanaDed = aquisCanaDed;
    }


    /**
     * Gets the safra value for this TpAquisCana.
     * 
     * @return safra
     */
    public java.lang.String getSafra() {
        return safra;
    }


    /**
     * Sets the safra value for this TpAquisCana.
     * 
     * @param safra
     */
    public void setSafra(java.lang.String safra) {
        this.safra = safra;
    }


    /**
     * Gets the mesAnoSafra value for this TpAquisCana.
     * 
     * @return mesAnoSafra
     */
    public java.lang.String getMesAnoSafra() {
        return mesAnoSafra;
    }


    /**
     * Sets the mesAnoSafra value for this TpAquisCana.
     * 
     * @param mesAnoSafra
     */
    public void setMesAnoSafra(java.lang.String mesAnoSafra) {
        this.mesAnoSafra = mesAnoSafra;
    }


    /**
     * Gets the qtdeTotalMes value for this TpAquisCana.
     * 
     * @return qtdeTotalMes
     */
    public java.math.BigDecimal getQtdeTotalMes() {
        return qtdeTotalMes;
    }


    /**
     * Sets the qtdeTotalMes value for this TpAquisCana.
     * 
     * @param qtdeTotalMes
     */
    public void setQtdeTotalMes(java.math.BigDecimal qtdeTotalMes) {
        this.qtdeTotalMes = qtdeTotalMes;
    }


    /**
     * Gets the qtdeTotalAnterior value for this TpAquisCana.
     * 
     * @return qtdeTotalAnterior
     */
    public java.math.BigDecimal getQtdeTotalAnterior() {
        return qtdeTotalAnterior;
    }


    /**
     * Sets the qtdeTotalAnterior value for this TpAquisCana.
     * 
     * @param qtdeTotalAnterior
     */
    public void setQtdeTotalAnterior(java.math.BigDecimal qtdeTotalAnterior) {
        this.qtdeTotalAnterior = qtdeTotalAnterior;
    }


    /**
     * Gets the qtdeTotalGeral value for this TpAquisCana.
     * 
     * @return qtdeTotalGeral
     */
    public java.math.BigDecimal getQtdeTotalGeral() {
        return qtdeTotalGeral;
    }


    /**
     * Sets the qtdeTotalGeral value for this TpAquisCana.
     * 
     * @param qtdeTotalGeral
     */
    public void setQtdeTotalGeral(java.math.BigDecimal qtdeTotalGeral) {
        this.qtdeTotalGeral = qtdeTotalGeral;
    }


    /**
     * Gets the vlForn value for this TpAquisCana.
     * 
     * @return vlForn
     */
    public java.math.BigDecimal getVlForn() {
        return vlForn;
    }


    /**
     * Sets the vlForn value for this TpAquisCana.
     * 
     * @param vlForn
     */
    public void setVlForn(java.math.BigDecimal vlForn) {
        this.vlForn = vlForn;
    }


    /**
     * Gets the vlTotalDed value for this TpAquisCana.
     * 
     * @return vlTotalDed
     */
    public java.math.BigDecimal getVlTotalDed() {
        return vlTotalDed;
    }


    /**
     * Sets the vlTotalDed value for this TpAquisCana.
     * 
     * @param vlTotalDed
     */
    public void setVlTotalDed(java.math.BigDecimal vlTotalDed) {
        this.vlTotalDed = vlTotalDed;
    }


    /**
     * Gets the vlLiqForn value for this TpAquisCana.
     * 
     * @return vlLiqForn
     */
    public java.math.BigDecimal getVlLiqForn() {
        return vlLiqForn;
    }


    /**
     * Sets the vlLiqForn value for this TpAquisCana.
     * 
     * @param vlLiqForn
     */
    public void setVlLiqForn(java.math.BigDecimal vlLiqForn) {
        this.vlLiqForn = vlLiqForn;
    }


    /**
     * Gets the aquisCanaDia value for this TpAquisCana.
     * 
     * @return aquisCanaDia
     */
    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpAquisCanaDia[] getAquisCanaDia() {
        return aquisCanaDia;
    }


    /**
     * Sets the aquisCanaDia value for this TpAquisCana.
     * 
     * @param aquisCanaDia
     */
    public void setAquisCanaDia(br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpAquisCanaDia[] aquisCanaDia) {
        this.aquisCanaDia = aquisCanaDia;
    }

    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpAquisCanaDia getAquisCanaDia(int i) {
        return this.aquisCanaDia[i];
    }

    public void setAquisCanaDia(int i, br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpAquisCanaDia _value) {
        this.aquisCanaDia[i] = _value;
    }


    /**
     * Gets the aquisCanaDed value for this TpAquisCana.
     * 
     * @return aquisCanaDed
     */
    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpAquisCanaDed[] getAquisCanaDed() {
        return aquisCanaDed;
    }


    /**
     * Sets the aquisCanaDed value for this TpAquisCana.
     * 
     * @param aquisCanaDed
     */
    public void setAquisCanaDed(br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpAquisCanaDed[] aquisCanaDed) {
        this.aquisCanaDed = aquisCanaDed;
    }

    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpAquisCanaDed getAquisCanaDed(int i) {
        return this.aquisCanaDed[i];
    }

    public void setAquisCanaDed(int i, br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpAquisCanaDed _value) {
        this.aquisCanaDed[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TpAquisCana)) return false;
        TpAquisCana other = (TpAquisCana) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.safra==null && other.getSafra()==null) || 
             (this.safra!=null &&
              this.safra.equals(other.getSafra()))) &&
            ((this.mesAnoSafra==null && other.getMesAnoSafra()==null) || 
             (this.mesAnoSafra!=null &&
              this.mesAnoSafra.equals(other.getMesAnoSafra()))) &&
            ((this.qtdeTotalMes==null && other.getQtdeTotalMes()==null) || 
             (this.qtdeTotalMes!=null &&
              this.qtdeTotalMes.equals(other.getQtdeTotalMes()))) &&
            ((this.qtdeTotalAnterior==null && other.getQtdeTotalAnterior()==null) || 
             (this.qtdeTotalAnterior!=null &&
              this.qtdeTotalAnterior.equals(other.getQtdeTotalAnterior()))) &&
            ((this.qtdeTotalGeral==null && other.getQtdeTotalGeral()==null) || 
             (this.qtdeTotalGeral!=null &&
              this.qtdeTotalGeral.equals(other.getQtdeTotalGeral()))) &&
            ((this.vlForn==null && other.getVlForn()==null) || 
             (this.vlForn!=null &&
              this.vlForn.equals(other.getVlForn()))) &&
            ((this.vlTotalDed==null && other.getVlTotalDed()==null) || 
             (this.vlTotalDed!=null &&
              this.vlTotalDed.equals(other.getVlTotalDed()))) &&
            ((this.vlLiqForn==null && other.getVlLiqForn()==null) || 
             (this.vlLiqForn!=null &&
              this.vlLiqForn.equals(other.getVlLiqForn()))) &&
            ((this.aquisCanaDia==null && other.getAquisCanaDia()==null) || 
             (this.aquisCanaDia!=null &&
              java.util.Arrays.equals(this.aquisCanaDia, other.getAquisCanaDia()))) &&
            ((this.aquisCanaDed==null && other.getAquisCanaDed()==null) || 
             (this.aquisCanaDed!=null &&
              java.util.Arrays.equals(this.aquisCanaDed, other.getAquisCanaDed())));
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
        if (getSafra() != null) {
            _hashCode += getSafra().hashCode();
        }
        if (getMesAnoSafra() != null) {
            _hashCode += getMesAnoSafra().hashCode();
        }
        if (getQtdeTotalMes() != null) {
            _hashCode += getQtdeTotalMes().hashCode();
        }
        if (getQtdeTotalAnterior() != null) {
            _hashCode += getQtdeTotalAnterior().hashCode();
        }
        if (getQtdeTotalGeral() != null) {
            _hashCode += getQtdeTotalGeral().hashCode();
        }
        if (getVlForn() != null) {
            _hashCode += getVlForn().hashCode();
        }
        if (getVlTotalDed() != null) {
            _hashCode += getVlTotalDed().hashCode();
        }
        if (getVlLiqForn() != null) {
            _hashCode += getVlLiqForn().hashCode();
        }
        if (getAquisCanaDia() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAquisCanaDia());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAquisCanaDia(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAquisCanaDed() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAquisCanaDed());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAquisCanaDed(), i);
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
        new org.apache.axis.description.TypeDesc(TpAquisCana.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "tpAquisCana"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("safra");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "safra"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mesAnoSafra");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "mesAnoSafra"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qtdeTotalMes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "qtdeTotalMes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTenPrec"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qtdeTotalAnterior");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "qtdeTotalAnterior"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTenPrec"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qtdeTotalGeral");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "qtdeTotalGeral"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTenPrec"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlForn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "vlForn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlTotalDed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "vlTotalDed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlLiqForn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "vlLiqForn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aquisCanaDia");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "aquisCanaDia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "tpAquisCanaDia"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aquisCanaDed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "aquisCanaDed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "tpAquisCanaDed"));
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
