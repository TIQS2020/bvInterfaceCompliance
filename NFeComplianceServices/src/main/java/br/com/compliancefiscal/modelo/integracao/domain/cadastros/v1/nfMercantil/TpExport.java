/**
 * TpExport.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil;

public class TpExport  implements java.io.Serializable {
    private java.lang.String numAcdraw;

    private java.math.BigInteger numRegExport;

    private java.lang.String chaveAcessoNfeExport;

    private java.math.BigDecimal qtdeExport;

    private br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpItemNfExportCompl itemNfExportCompl;

    public TpExport() {
    }

    public TpExport(
           java.lang.String numAcdraw,
           java.math.BigInteger numRegExport,
           java.lang.String chaveAcessoNfeExport,
           java.math.BigDecimal qtdeExport,
           br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpItemNfExportCompl itemNfExportCompl) {
           this.numAcdraw = numAcdraw;
           this.numRegExport = numRegExport;
           this.chaveAcessoNfeExport = chaveAcessoNfeExport;
           this.qtdeExport = qtdeExport;
           this.itemNfExportCompl = itemNfExportCompl;
    }


    /**
     * Gets the numAcdraw value for this TpExport.
     * 
     * @return numAcdraw
     */
    public java.lang.String getNumAcdraw() {
        return numAcdraw;
    }


    /**
     * Sets the numAcdraw value for this TpExport.
     * 
     * @param numAcdraw
     */
    public void setNumAcdraw(java.lang.String numAcdraw) {
        this.numAcdraw = numAcdraw;
    }


    /**
     * Gets the numRegExport value for this TpExport.
     * 
     * @return numRegExport
     */
    public java.math.BigInteger getNumRegExport() {
        return numRegExport;
    }


    /**
     * Sets the numRegExport value for this TpExport.
     * 
     * @param numRegExport
     */
    public void setNumRegExport(java.math.BigInteger numRegExport) {
        this.numRegExport = numRegExport;
    }


    /**
     * Gets the chaveAcessoNfeExport value for this TpExport.
     * 
     * @return chaveAcessoNfeExport
     */
    public java.lang.String getChaveAcessoNfeExport() {
        return chaveAcessoNfeExport;
    }


    /**
     * Sets the chaveAcessoNfeExport value for this TpExport.
     * 
     * @param chaveAcessoNfeExport
     */
    public void setChaveAcessoNfeExport(java.lang.String chaveAcessoNfeExport) {
        this.chaveAcessoNfeExport = chaveAcessoNfeExport;
    }


    /**
     * Gets the qtdeExport value for this TpExport.
     * 
     * @return qtdeExport
     */
    public java.math.BigDecimal getQtdeExport() {
        return qtdeExport;
    }


    /**
     * Sets the qtdeExport value for this TpExport.
     * 
     * @param qtdeExport
     */
    public void setQtdeExport(java.math.BigDecimal qtdeExport) {
        this.qtdeExport = qtdeExport;
    }


    /**
     * Gets the itemNfExportCompl value for this TpExport.
     * 
     * @return itemNfExportCompl
     */
    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpItemNfExportCompl getItemNfExportCompl() {
        return itemNfExportCompl;
    }


    /**
     * Sets the itemNfExportCompl value for this TpExport.
     * 
     * @param itemNfExportCompl
     */
    public void setItemNfExportCompl(br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpItemNfExportCompl itemNfExportCompl) {
        this.itemNfExportCompl = itemNfExportCompl;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TpExport)) return false;
        TpExport other = (TpExport) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.numAcdraw==null && other.getNumAcdraw()==null) || 
             (this.numAcdraw!=null &&
              this.numAcdraw.equals(other.getNumAcdraw()))) &&
            ((this.numRegExport==null && other.getNumRegExport()==null) || 
             (this.numRegExport!=null &&
              this.numRegExport.equals(other.getNumRegExport()))) &&
            ((this.chaveAcessoNfeExport==null && other.getChaveAcessoNfeExport()==null) || 
             (this.chaveAcessoNfeExport!=null &&
              this.chaveAcessoNfeExport.equals(other.getChaveAcessoNfeExport()))) &&
            ((this.qtdeExport==null && other.getQtdeExport()==null) || 
             (this.qtdeExport!=null &&
              this.qtdeExport.equals(other.getQtdeExport()))) &&
            ((this.itemNfExportCompl==null && other.getItemNfExportCompl()==null) || 
             (this.itemNfExportCompl!=null &&
              this.itemNfExportCompl.equals(other.getItemNfExportCompl())));
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
        if (getNumAcdraw() != null) {
            _hashCode += getNumAcdraw().hashCode();
        }
        if (getNumRegExport() != null) {
            _hashCode += getNumRegExport().hashCode();
        }
        if (getChaveAcessoNfeExport() != null) {
            _hashCode += getChaveAcessoNfeExport().hashCode();
        }
        if (getQtdeExport() != null) {
            _hashCode += getQtdeExport().hashCode();
        }
        if (getItemNfExportCompl() != null) {
            _hashCode += getItemNfExportCompl().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TpExport.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "tpExport"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numAcdraw");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "numAcdraw"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numRegExport");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "numRegExport"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chaveAcessoNfeExport");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "chaveAcessoNfeExport"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qtdeExport");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "qtdeExport"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalFourPrec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemNfExportCompl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "itemNfExportCompl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "tpItemNfExportCompl"));
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
