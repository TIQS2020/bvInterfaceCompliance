/**
 * ParametrosIcmsStItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.parametrosIcmsStItem;

public class ParametrosIcmsStItem  implements java.io.Serializable {
    private br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.TpCpfCnpj cpfCnpj;

    private java.lang.String codigoItem;

    private java.lang.String siglaUFDestinatario;

    private org.apache.axis.types.NonNegativeInteger codigoCfopOrigem;

    private java.util.Date dataInicioValidade;

    private java.util.Date dataFinalValidade;

    private java.math.BigInteger modalidadeBaseCalculoIcmsSt;

    private java.math.BigDecimal aliquotaDestino;

    private java.lang.String codigoObsLanctoFiscal;

    private org.apache.axis.types.NonNegativeInteger codigoCfopDestino;

    private java.lang.String codigoStIcms;

    private java.math.BigDecimal indice;

    private java.math.BigDecimal percentualReducaoBaseCalculo;

    private org.apache.axis.types.NonNegativeInteger utilizaMva;

    private org.apache.axis.types.NonNegativeInteger efeitoParametro;

    public ParametrosIcmsStItem() {
    }

    public ParametrosIcmsStItem(
           br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.TpCpfCnpj cpfCnpj,
           java.lang.String codigoItem,
           java.lang.String siglaUFDestinatario,
           org.apache.axis.types.NonNegativeInteger codigoCfopOrigem,
           java.util.Date dataInicioValidade,
           java.util.Date dataFinalValidade,
           java.math.BigInteger modalidadeBaseCalculoIcmsSt,
           java.math.BigDecimal aliquotaDestino,
           java.lang.String codigoObsLanctoFiscal,
           org.apache.axis.types.NonNegativeInteger codigoCfopDestino,
           java.lang.String codigoStIcms,
           java.math.BigDecimal indice,
           java.math.BigDecimal percentualReducaoBaseCalculo,
           org.apache.axis.types.NonNegativeInteger utilizaMva,
           org.apache.axis.types.NonNegativeInteger efeitoParametro) {
           this.cpfCnpj = cpfCnpj;
           this.codigoItem = codigoItem;
           this.siglaUFDestinatario = siglaUFDestinatario;
           this.codigoCfopOrigem = codigoCfopOrigem;
           this.dataInicioValidade = dataInicioValidade;
           this.dataFinalValidade = dataFinalValidade;
           this.modalidadeBaseCalculoIcmsSt = modalidadeBaseCalculoIcmsSt;
           this.aliquotaDestino = aliquotaDestino;
           this.codigoObsLanctoFiscal = codigoObsLanctoFiscal;
           this.codigoCfopDestino = codigoCfopDestino;
           this.codigoStIcms = codigoStIcms;
           this.indice = indice;
           this.percentualReducaoBaseCalculo = percentualReducaoBaseCalculo;
           this.utilizaMva = utilizaMva;
           this.efeitoParametro = efeitoParametro;
    }


    /**
     * Gets the cpfCnpj value for this ParametrosIcmsStItem.
     * 
     * @return cpfCnpj
     */
    public br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.TpCpfCnpj getCpfCnpj() {
        return cpfCnpj;
    }


    /**
     * Sets the cpfCnpj value for this ParametrosIcmsStItem.
     * 
     * @param cpfCnpj
     */
    public void setCpfCnpj(br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.TpCpfCnpj cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }


    /**
     * Gets the codigoItem value for this ParametrosIcmsStItem.
     * 
     * @return codigoItem
     */
    public java.lang.String getCodigoItem() {
        return codigoItem;
    }


    /**
     * Sets the codigoItem value for this ParametrosIcmsStItem.
     * 
     * @param codigoItem
     */
    public void setCodigoItem(java.lang.String codigoItem) {
        this.codigoItem = codigoItem;
    }


    /**
     * Gets the siglaUFDestinatario value for this ParametrosIcmsStItem.
     * 
     * @return siglaUFDestinatario
     */
    public java.lang.String getSiglaUFDestinatario() {
        return siglaUFDestinatario;
    }


    /**
     * Sets the siglaUFDestinatario value for this ParametrosIcmsStItem.
     * 
     * @param siglaUFDestinatario
     */
    public void setSiglaUFDestinatario(java.lang.String siglaUFDestinatario) {
        this.siglaUFDestinatario = siglaUFDestinatario;
    }


    /**
     * Gets the codigoCfopOrigem value for this ParametrosIcmsStItem.
     * 
     * @return codigoCfopOrigem
     */
    public org.apache.axis.types.NonNegativeInteger getCodigoCfopOrigem() {
        return codigoCfopOrigem;
    }


    /**
     * Sets the codigoCfopOrigem value for this ParametrosIcmsStItem.
     * 
     * @param codigoCfopOrigem
     */
    public void setCodigoCfopOrigem(org.apache.axis.types.NonNegativeInteger codigoCfopOrigem) {
        this.codigoCfopOrigem = codigoCfopOrigem;
    }


    /**
     * Gets the dataInicioValidade value for this ParametrosIcmsStItem.
     * 
     * @return dataInicioValidade
     */
    public java.util.Date getDataInicioValidade() {
        return dataInicioValidade;
    }


    /**
     * Sets the dataInicioValidade value for this ParametrosIcmsStItem.
     * 
     * @param dataInicioValidade
     */
    public void setDataInicioValidade(java.util.Date dataInicioValidade) {
        this.dataInicioValidade = dataInicioValidade;
    }


    /**
     * Gets the dataFinalValidade value for this ParametrosIcmsStItem.
     * 
     * @return dataFinalValidade
     */
    public java.util.Date getDataFinalValidade() {
        return dataFinalValidade;
    }


    /**
     * Sets the dataFinalValidade value for this ParametrosIcmsStItem.
     * 
     * @param dataFinalValidade
     */
    public void setDataFinalValidade(java.util.Date dataFinalValidade) {
        this.dataFinalValidade = dataFinalValidade;
    }


    /**
     * Gets the modalidadeBaseCalculoIcmsSt value for this ParametrosIcmsStItem.
     * 
     * @return modalidadeBaseCalculoIcmsSt
     */
    public java.math.BigInteger getModalidadeBaseCalculoIcmsSt() {
        return modalidadeBaseCalculoIcmsSt;
    }


    /**
     * Sets the modalidadeBaseCalculoIcmsSt value for this ParametrosIcmsStItem.
     * 
     * @param modalidadeBaseCalculoIcmsSt
     */
    public void setModalidadeBaseCalculoIcmsSt(java.math.BigInteger modalidadeBaseCalculoIcmsSt) {
        this.modalidadeBaseCalculoIcmsSt = modalidadeBaseCalculoIcmsSt;
    }


    /**
     * Gets the aliquotaDestino value for this ParametrosIcmsStItem.
     * 
     * @return aliquotaDestino
     */
    public java.math.BigDecimal getAliquotaDestino() {
        return aliquotaDestino;
    }


    /**
     * Sets the aliquotaDestino value for this ParametrosIcmsStItem.
     * 
     * @param aliquotaDestino
     */
    public void setAliquotaDestino(java.math.BigDecimal aliquotaDestino) {
        this.aliquotaDestino = aliquotaDestino;
    }


    /**
     * Gets the codigoObsLanctoFiscal value for this ParametrosIcmsStItem.
     * 
     * @return codigoObsLanctoFiscal
     */
    public java.lang.String getCodigoObsLanctoFiscal() {
        return codigoObsLanctoFiscal;
    }


    /**
     * Sets the codigoObsLanctoFiscal value for this ParametrosIcmsStItem.
     * 
     * @param codigoObsLanctoFiscal
     */
    public void setCodigoObsLanctoFiscal(java.lang.String codigoObsLanctoFiscal) {
        this.codigoObsLanctoFiscal = codigoObsLanctoFiscal;
    }


    /**
     * Gets the codigoCfopDestino value for this ParametrosIcmsStItem.
     * 
     * @return codigoCfopDestino
     */
    public org.apache.axis.types.NonNegativeInteger getCodigoCfopDestino() {
        return codigoCfopDestino;
    }


    /**
     * Sets the codigoCfopDestino value for this ParametrosIcmsStItem.
     * 
     * @param codigoCfopDestino
     */
    public void setCodigoCfopDestino(org.apache.axis.types.NonNegativeInteger codigoCfopDestino) {
        this.codigoCfopDestino = codigoCfopDestino;
    }


    /**
     * Gets the codigoStIcms value for this ParametrosIcmsStItem.
     * 
     * @return codigoStIcms
     */
    public java.lang.String getCodigoStIcms() {
        return codigoStIcms;
    }


    /**
     * Sets the codigoStIcms value for this ParametrosIcmsStItem.
     * 
     * @param codigoStIcms
     */
    public void setCodigoStIcms(java.lang.String codigoStIcms) {
        this.codigoStIcms = codigoStIcms;
    }


    /**
     * Gets the indice value for this ParametrosIcmsStItem.
     * 
     * @return indice
     */
    public java.math.BigDecimal getIndice() {
        return indice;
    }


    /**
     * Sets the indice value for this ParametrosIcmsStItem.
     * 
     * @param indice
     */
    public void setIndice(java.math.BigDecimal indice) {
        this.indice = indice;
    }


    /**
     * Gets the percentualReducaoBaseCalculo value for this ParametrosIcmsStItem.
     * 
     * @return percentualReducaoBaseCalculo
     */
    public java.math.BigDecimal getPercentualReducaoBaseCalculo() {
        return percentualReducaoBaseCalculo;
    }


    /**
     * Sets the percentualReducaoBaseCalculo value for this ParametrosIcmsStItem.
     * 
     * @param percentualReducaoBaseCalculo
     */
    public void setPercentualReducaoBaseCalculo(java.math.BigDecimal percentualReducaoBaseCalculo) {
        this.percentualReducaoBaseCalculo = percentualReducaoBaseCalculo;
    }


    /**
     * Gets the utilizaMva value for this ParametrosIcmsStItem.
     * 
     * @return utilizaMva
     */
    public org.apache.axis.types.NonNegativeInteger getUtilizaMva() {
        return utilizaMva;
    }


    /**
     * Sets the utilizaMva value for this ParametrosIcmsStItem.
     * 
     * @param utilizaMva
     */
    public void setUtilizaMva(org.apache.axis.types.NonNegativeInteger utilizaMva) {
        this.utilizaMva = utilizaMva;
    }


    /**
     * Gets the efeitoParametro value for this ParametrosIcmsStItem.
     * 
     * @return efeitoParametro
     */
    public org.apache.axis.types.NonNegativeInteger getEfeitoParametro() {
        return efeitoParametro;
    }


    /**
     * Sets the efeitoParametro value for this ParametrosIcmsStItem.
     * 
     * @param efeitoParametro
     */
    public void setEfeitoParametro(org.apache.axis.types.NonNegativeInteger efeitoParametro) {
        this.efeitoParametro = efeitoParametro;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ParametrosIcmsStItem)) return false;
        ParametrosIcmsStItem other = (ParametrosIcmsStItem) obj;
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
            ((this.siglaUFDestinatario==null && other.getSiglaUFDestinatario()==null) || 
             (this.siglaUFDestinatario!=null &&
              this.siglaUFDestinatario.equals(other.getSiglaUFDestinatario()))) &&
            ((this.codigoCfopOrigem==null && other.getCodigoCfopOrigem()==null) || 
             (this.codigoCfopOrigem!=null &&
              this.codigoCfopOrigem.equals(other.getCodigoCfopOrigem()))) &&
            ((this.dataInicioValidade==null && other.getDataInicioValidade()==null) || 
             (this.dataInicioValidade!=null &&
              this.dataInicioValidade.equals(other.getDataInicioValidade()))) &&
            ((this.dataFinalValidade==null && other.getDataFinalValidade()==null) || 
             (this.dataFinalValidade!=null &&
              this.dataFinalValidade.equals(other.getDataFinalValidade()))) &&
            ((this.modalidadeBaseCalculoIcmsSt==null && other.getModalidadeBaseCalculoIcmsSt()==null) || 
             (this.modalidadeBaseCalculoIcmsSt!=null &&
              this.modalidadeBaseCalculoIcmsSt.equals(other.getModalidadeBaseCalculoIcmsSt()))) &&
            ((this.aliquotaDestino==null && other.getAliquotaDestino()==null) || 
             (this.aliquotaDestino!=null &&
              this.aliquotaDestino.equals(other.getAliquotaDestino()))) &&
            ((this.codigoObsLanctoFiscal==null && other.getCodigoObsLanctoFiscal()==null) || 
             (this.codigoObsLanctoFiscal!=null &&
              this.codigoObsLanctoFiscal.equals(other.getCodigoObsLanctoFiscal()))) &&
            ((this.codigoCfopDestino==null && other.getCodigoCfopDestino()==null) || 
             (this.codigoCfopDestino!=null &&
              this.codigoCfopDestino.equals(other.getCodigoCfopDestino()))) &&
            ((this.codigoStIcms==null && other.getCodigoStIcms()==null) || 
             (this.codigoStIcms!=null &&
              this.codigoStIcms.equals(other.getCodigoStIcms()))) &&
            ((this.indice==null && other.getIndice()==null) || 
             (this.indice!=null &&
              this.indice.equals(other.getIndice()))) &&
            ((this.percentualReducaoBaseCalculo==null && other.getPercentualReducaoBaseCalculo()==null) || 
             (this.percentualReducaoBaseCalculo!=null &&
              this.percentualReducaoBaseCalculo.equals(other.getPercentualReducaoBaseCalculo()))) &&
            ((this.utilizaMva==null && other.getUtilizaMva()==null) || 
             (this.utilizaMva!=null &&
              this.utilizaMva.equals(other.getUtilizaMva()))) &&
            ((this.efeitoParametro==null && other.getEfeitoParametro()==null) || 
             (this.efeitoParametro!=null &&
              this.efeitoParametro.equals(other.getEfeitoParametro())));
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
        if (getSiglaUFDestinatario() != null) {
            _hashCode += getSiglaUFDestinatario().hashCode();
        }
        if (getCodigoCfopOrigem() != null) {
            _hashCode += getCodigoCfopOrigem().hashCode();
        }
        if (getDataInicioValidade() != null) {
            _hashCode += getDataInicioValidade().hashCode();
        }
        if (getDataFinalValidade() != null) {
            _hashCode += getDataFinalValidade().hashCode();
        }
        if (getModalidadeBaseCalculoIcmsSt() != null) {
            _hashCode += getModalidadeBaseCalculoIcmsSt().hashCode();
        }
        if (getAliquotaDestino() != null) {
            _hashCode += getAliquotaDestino().hashCode();
        }
        if (getCodigoObsLanctoFiscal() != null) {
            _hashCode += getCodigoObsLanctoFiscal().hashCode();
        }
        if (getCodigoCfopDestino() != null) {
            _hashCode += getCodigoCfopDestino().hashCode();
        }
        if (getCodigoStIcms() != null) {
            _hashCode += getCodigoStIcms().hashCode();
        }
        if (getIndice() != null) {
            _hashCode += getIndice().hashCode();
        }
        if (getPercentualReducaoBaseCalculo() != null) {
            _hashCode += getPercentualReducaoBaseCalculo().hashCode();
        }
        if (getUtilizaMva() != null) {
            _hashCode += getUtilizaMva().hashCode();
        }
        if (getEfeitoParametro() != null) {
            _hashCode += getEfeitoParametro().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ParametrosIcmsStItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/parametrosIcmsStItem", "parametrosIcmsStItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpfCnpj");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/parametrosIcmsStItem", "cpfCnpj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "tpCpfCnpj"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoItem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/parametrosIcmsStItem", "codigoItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("siglaUFDestinatario");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/parametrosIcmsStItem", "siglaUFDestinatario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoCfopOrigem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/parametrosIcmsStItem", "codigoCfopOrigem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataInicioValidade");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/parametrosIcmsStItem", "dataInicioValidade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataFinalValidade");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/parametrosIcmsStItem", "dataFinalValidade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modalidadeBaseCalculoIcmsSt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/parametrosIcmsStItem", "modalidadeBaseCalculoIcmsSt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aliquotaDestino");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/parametrosIcmsStItem", "aliquotaDestino"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoObsLanctoFiscal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/parametrosIcmsStItem", "codigoObsLanctoFiscal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoCfopDestino");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/parametrosIcmsStItem", "codigoCfopDestino"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoStIcms");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/parametrosIcmsStItem", "codigoStIcms"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/parametrosIcmsStItem", "indice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("percentualReducaoBaseCalculo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/parametrosIcmsStItem", "percentualReducaoBaseCalculo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("utilizaMva");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/parametrosIcmsStItem", "utilizaMva"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "tpDominio"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("efeitoParametro");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/parametrosIcmsStItem", "efeitoParametro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "tpDominio"));
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
