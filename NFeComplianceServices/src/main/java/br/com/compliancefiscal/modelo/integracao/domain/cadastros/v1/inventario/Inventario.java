/**
 * Inventario.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.inventario;

public class Inventario  implements java.io.Serializable {
    private br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.TpCpfCnpj cpfCnpj;

    private java.lang.String codigoItem;

    private java.util.Date dtInventario;

    private java.lang.String siglaUnidade;

    private java.math.BigDecimal qtde;

    private java.math.BigDecimal vlUnit;

    private java.math.BigDecimal vlItem;

    private java.math.BigInteger dmIndProp;

    private java.lang.String codPart;

    private java.lang.String txtCompl;

    private java.lang.String codCta;

    private java.util.Date dtReferencia;

    private java.lang.String dmMotInv;

    private br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.inventario.TpInventCst[] inventCst;

    public Inventario() {
    }

    public Inventario(
           br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.TpCpfCnpj cpfCnpj,
           java.lang.String codigoItem,
           java.util.Date dtInventario,
           java.lang.String siglaUnidade,
           java.math.BigDecimal qtde,
           java.math.BigDecimal vlUnit,
           java.math.BigDecimal vlItem,
           java.math.BigInteger dmIndProp,
           java.lang.String codPart,
           java.lang.String txtCompl,
           java.lang.String codCta,
           java.util.Date dtReferencia,
           java.lang.String dmMotInv,
           br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.inventario.TpInventCst[] inventCst) {
           this.cpfCnpj = cpfCnpj;
           this.codigoItem = codigoItem;
           this.dtInventario = dtInventario;
           this.siglaUnidade = siglaUnidade;
           this.qtde = qtde;
           this.vlUnit = vlUnit;
           this.vlItem = vlItem;
           this.dmIndProp = dmIndProp;
           this.codPart = codPart;
           this.txtCompl = txtCompl;
           this.codCta = codCta;
           this.dtReferencia = dtReferencia;
           this.dmMotInv = dmMotInv;
           this.inventCst = inventCst;
    }


    /**
     * Gets the cpfCnpj value for this Inventario.
     * 
     * @return cpfCnpj
     */
    public br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.TpCpfCnpj getCpfCnpj() {
        return cpfCnpj;
    }


    /**
     * Sets the cpfCnpj value for this Inventario.
     * 
     * @param cpfCnpj
     */
    public void setCpfCnpj(br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.TpCpfCnpj cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }


    /**
     * Gets the codigoItem value for this Inventario.
     * 
     * @return codigoItem
     */
    public java.lang.String getCodigoItem() {
        return codigoItem;
    }


    /**
     * Sets the codigoItem value for this Inventario.
     * 
     * @param codigoItem
     */
    public void setCodigoItem(java.lang.String codigoItem) {
        this.codigoItem = codigoItem;
    }


    /**
     * Gets the dtInventario value for this Inventario.
     * 
     * @return dtInventario
     */
    public java.util.Date getDtInventario() {
        return dtInventario;
    }


    /**
     * Sets the dtInventario value for this Inventario.
     * 
     * @param dtInventario
     */
    public void setDtInventario(java.util.Date dtInventario) {
        this.dtInventario = dtInventario;
    }


    /**
     * Gets the siglaUnidade value for this Inventario.
     * 
     * @return siglaUnidade
     */
    public java.lang.String getSiglaUnidade() {
        return siglaUnidade;
    }


    /**
     * Sets the siglaUnidade value for this Inventario.
     * 
     * @param siglaUnidade
     */
    public void setSiglaUnidade(java.lang.String siglaUnidade) {
        this.siglaUnidade = siglaUnidade;
    }


    /**
     * Gets the qtde value for this Inventario.
     * 
     * @return qtde
     */
    public java.math.BigDecimal getQtde() {
        return qtde;
    }


    /**
     * Sets the qtde value for this Inventario.
     * 
     * @param qtde
     */
    public void setQtde(java.math.BigDecimal qtde) {
        this.qtde = qtde;
    }


    /**
     * Gets the vlUnit value for this Inventario.
     * 
     * @return vlUnit
     */
    public java.math.BigDecimal getVlUnit() {
        return vlUnit;
    }


    /**
     * Sets the vlUnit value for this Inventario.
     * 
     * @param vlUnit
     */
    public void setVlUnit(java.math.BigDecimal vlUnit) {
        this.vlUnit = vlUnit;
    }


    /**
     * Gets the vlItem value for this Inventario.
     * 
     * @return vlItem
     */
    public java.math.BigDecimal getVlItem() {
        return vlItem;
    }


    /**
     * Sets the vlItem value for this Inventario.
     * 
     * @param vlItem
     */
    public void setVlItem(java.math.BigDecimal vlItem) {
        this.vlItem = vlItem;
    }


    /**
     * Gets the dmIndProp value for this Inventario.
     * 
     * @return dmIndProp
     */
    public java.math.BigInteger getDmIndProp() {
        return dmIndProp;
    }


    /**
     * Sets the dmIndProp value for this Inventario.
     * 
     * @param dmIndProp
     */
    public void setDmIndProp(java.math.BigInteger dmIndProp) {
        this.dmIndProp = dmIndProp;
    }


    /**
     * Gets the codPart value for this Inventario.
     * 
     * @return codPart
     */
    public java.lang.String getCodPart() {
        return codPart;
    }


    /**
     * Sets the codPart value for this Inventario.
     * 
     * @param codPart
     */
    public void setCodPart(java.lang.String codPart) {
        this.codPart = codPart;
    }


    /**
     * Gets the txtCompl value for this Inventario.
     * 
     * @return txtCompl
     */
    public java.lang.String getTxtCompl() {
        return txtCompl;
    }


    /**
     * Sets the txtCompl value for this Inventario.
     * 
     * @param txtCompl
     */
    public void setTxtCompl(java.lang.String txtCompl) {
        this.txtCompl = txtCompl;
    }


    /**
     * Gets the codCta value for this Inventario.
     * 
     * @return codCta
     */
    public java.lang.String getCodCta() {
        return codCta;
    }


    /**
     * Sets the codCta value for this Inventario.
     * 
     * @param codCta
     */
    public void setCodCta(java.lang.String codCta) {
        this.codCta = codCta;
    }


    /**
     * Gets the dtReferencia value for this Inventario.
     * 
     * @return dtReferencia
     */
    public java.util.Date getDtReferencia() {
        return dtReferencia;
    }


    /**
     * Sets the dtReferencia value for this Inventario.
     * 
     * @param dtReferencia
     */
    public void setDtReferencia(java.util.Date dtReferencia) {
        this.dtReferencia = dtReferencia;
    }


    /**
     * Gets the dmMotInv value for this Inventario.
     * 
     * @return dmMotInv
     */
    public java.lang.String getDmMotInv() {
        return dmMotInv;
    }


    /**
     * Sets the dmMotInv value for this Inventario.
     * 
     * @param dmMotInv
     */
    public void setDmMotInv(java.lang.String dmMotInv) {
        this.dmMotInv = dmMotInv;
    }


    /**
     * Gets the inventCst value for this Inventario.
     * 
     * @return inventCst
     */
    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.inventario.TpInventCst[] getInventCst() {
        return inventCst;
    }


    /**
     * Sets the inventCst value for this Inventario.
     * 
     * @param inventCst
     */
    public void setInventCst(br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.inventario.TpInventCst[] inventCst) {
        this.inventCst = inventCst;
    }

    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.inventario.TpInventCst getInventCst(int i) {
        return this.inventCst[i];
    }

    public void setInventCst(int i, br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.inventario.TpInventCst _value) {
        this.inventCst[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Inventario)) return false;
        Inventario other = (Inventario) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cpfCnpj==null && other.getCpfCnpj()==null) || 
             (this.cpfCnpj!=null &&
              this.cpfCnpj.equals(other.getCpfCnpj()))) &&
            ((this.codigoItem==null && other.getCodigoItem()==null) || 
             (this.codigoItem!=null &&
              this.codigoItem.equals(other.getCodigoItem()))) &&
            ((this.dtInventario==null && other.getDtInventario()==null) || 
             (this.dtInventario!=null &&
              this.dtInventario.equals(other.getDtInventario()))) &&
            ((this.siglaUnidade==null && other.getSiglaUnidade()==null) || 
             (this.siglaUnidade!=null &&
              this.siglaUnidade.equals(other.getSiglaUnidade()))) &&
            ((this.qtde==null && other.getQtde()==null) || 
             (this.qtde!=null &&
              this.qtde.equals(other.getQtde()))) &&
            ((this.vlUnit==null && other.getVlUnit()==null) || 
             (this.vlUnit!=null &&
              this.vlUnit.equals(other.getVlUnit()))) &&
            ((this.vlItem==null && other.getVlItem()==null) || 
             (this.vlItem!=null &&
              this.vlItem.equals(other.getVlItem()))) &&
            ((this.dmIndProp==null && other.getDmIndProp()==null) || 
             (this.dmIndProp!=null &&
              this.dmIndProp.equals(other.getDmIndProp()))) &&
            ((this.codPart==null && other.getCodPart()==null) || 
             (this.codPart!=null &&
              this.codPart.equals(other.getCodPart()))) &&
            ((this.txtCompl==null && other.getTxtCompl()==null) || 
             (this.txtCompl!=null &&
              this.txtCompl.equals(other.getTxtCompl()))) &&
            ((this.codCta==null && other.getCodCta()==null) || 
             (this.codCta!=null &&
              this.codCta.equals(other.getCodCta()))) &&
            ((this.dtReferencia==null && other.getDtReferencia()==null) || 
             (this.dtReferencia!=null &&
              this.dtReferencia.equals(other.getDtReferencia()))) &&
            ((this.dmMotInv==null && other.getDmMotInv()==null) || 
             (this.dmMotInv!=null &&
              this.dmMotInv.equals(other.getDmMotInv()))) &&
            ((this.inventCst==null && other.getInventCst()==null) || 
             (this.inventCst!=null &&
              java.util.Arrays.equals(this.inventCst, other.getInventCst())));
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
        if (getCpfCnpj() != null) {
            _hashCode += getCpfCnpj().hashCode();
        }
        if (getCodigoItem() != null) {
            _hashCode += getCodigoItem().hashCode();
        }
        if (getDtInventario() != null) {
            _hashCode += getDtInventario().hashCode();
        }
        if (getSiglaUnidade() != null) {
            _hashCode += getSiglaUnidade().hashCode();
        }
        if (getQtde() != null) {
            _hashCode += getQtde().hashCode();
        }
        if (getVlUnit() != null) {
            _hashCode += getVlUnit().hashCode();
        }
        if (getVlItem() != null) {
            _hashCode += getVlItem().hashCode();
        }
        if (getDmIndProp() != null) {
            _hashCode += getDmIndProp().hashCode();
        }
        if (getCodPart() != null) {
            _hashCode += getCodPart().hashCode();
        }
        if (getTxtCompl() != null) {
            _hashCode += getTxtCompl().hashCode();
        }
        if (getCodCta() != null) {
            _hashCode += getCodCta().hashCode();
        }
        if (getDtReferencia() != null) {
            _hashCode += getDtReferencia().hashCode();
        }
        if (getDmMotInv() != null) {
            _hashCode += getDmMotInv().hashCode();
        }
        if (getInventCst() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInventCst());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInventCst(), i);
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
        new org.apache.axis.description.TypeDesc(Inventario.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/inventario", "inventario"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpfCnpj");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/inventario", "cpfCnpj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "tpCpfCnpj"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoItem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/inventario", "codigoItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dtInventario");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/inventario", "dtInventario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("siglaUnidade");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/inventario", "siglaUnidade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qtde");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/inventario", "qtde"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalThreePrec"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/inventario", "vlUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlItem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/inventario", "vlItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dmIndProp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/inventario", "dmIndProp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codPart");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/inventario", "codPart"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("txtCompl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/inventario", "txtCompl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codCta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/inventario", "codCta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "tpStringSize255"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dtReferencia");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/inventario", "dtReferencia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dmMotInv");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/inventario", "dmMotInv"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "tpStringSizeTwoComplementos"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inventCst");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/inventario", "inventCst"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/inventario", "tpInventCst"));
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
