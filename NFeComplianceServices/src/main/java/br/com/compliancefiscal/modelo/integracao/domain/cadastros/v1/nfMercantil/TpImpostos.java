/**
 * TpImpostos.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil;

public class TpImpostos  implements java.io.Serializable {
    private org.apache.axis.types.NonNegativeInteger codImposto;

    private org.apache.axis.types.NonNegativeInteger tipo;

    private java.lang.String codSt;

    private java.lang.String tipoRetencaoImposto;

    private java.lang.String naturezaReceitaPisCofins;

    private java.math.BigDecimal vlBaseCalc;

    private java.math.BigDecimal aliquota;

    private java.math.BigDecimal vlImpTrib;

    private java.math.BigDecimal percReduc;

    private java.math.BigDecimal percAdic;

    private java.math.BigDecimal qtdeBaseCalcProd;

    private java.math.BigDecimal vlAliqProd;

    private java.math.BigDecimal percBaseCalcOperProd;

    private java.math.BigDecimal vlImpNaoDest;

    private br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpDadosIcmsSt dadosIcmsSt;

    private br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpDadosIcms dadosIcms;

    private br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpDadosOutros dadosOutros;

    private br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpImpItemNfIcmsDest impItemIcmsDest;

    private java.lang.String codReceita;

    private java.math.BigDecimal vlBcFCP;

    private java.math.BigDecimal aliqFCP;

    private java.math.BigDecimal vlFCP;

    public TpImpostos() {
    }

    public TpImpostos(
           org.apache.axis.types.NonNegativeInteger codImposto,
           org.apache.axis.types.NonNegativeInteger tipo,
           java.lang.String codSt,
           java.lang.String tipoRetencaoImposto,
           java.lang.String naturezaReceitaPisCofins,
           java.math.BigDecimal vlBaseCalc,
           java.math.BigDecimal aliquota,
           java.math.BigDecimal vlImpTrib,
           java.math.BigDecimal percReduc,
           java.math.BigDecimal percAdic,
           java.math.BigDecimal qtdeBaseCalcProd,
           java.math.BigDecimal vlAliqProd,
           java.math.BigDecimal percBaseCalcOperProd,
           java.math.BigDecimal vlImpNaoDest,
           br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpDadosIcmsSt dadosIcmsSt,
           br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpDadosIcms dadosIcms,
           br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpDadosOutros dadosOutros,
           br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpImpItemNfIcmsDest impItemIcmsDest,
           java.lang.String codReceita,
           java.math.BigDecimal vlBcFCP,
           java.math.BigDecimal aliqFCP,
           java.math.BigDecimal vlFCP) {
           this.codImposto = codImposto;
           this.tipo = tipo;
           this.codSt = codSt;
           this.tipoRetencaoImposto = tipoRetencaoImposto;
           this.naturezaReceitaPisCofins = naturezaReceitaPisCofins;
           this.vlBaseCalc = vlBaseCalc;
           this.aliquota = aliquota;
           this.vlImpTrib = vlImpTrib;
           this.percReduc = percReduc;
           this.percAdic = percAdic;
           this.qtdeBaseCalcProd = qtdeBaseCalcProd;
           this.vlAliqProd = vlAliqProd;
           this.percBaseCalcOperProd = percBaseCalcOperProd;
           this.vlImpNaoDest = vlImpNaoDest;
           this.dadosIcmsSt = dadosIcmsSt;
           this.dadosIcms = dadosIcms;
           this.dadosOutros = dadosOutros;
           this.impItemIcmsDest = impItemIcmsDest;
           this.codReceita = codReceita;
           this.vlBcFCP = vlBcFCP;
           this.aliqFCP = aliqFCP;
           this.vlFCP = vlFCP;
    }


    /**
     * Gets the codImposto value for this TpImpostos.
     * 
     * @return codImposto
     */
    public org.apache.axis.types.NonNegativeInteger getCodImposto() {
        return codImposto;
    }


    /**
     * Sets the codImposto value for this TpImpostos.
     * 
     * @param codImposto
     */
    public void setCodImposto(org.apache.axis.types.NonNegativeInteger codImposto) {
        this.codImposto = codImposto;
    }


    /**
     * Gets the tipo value for this TpImpostos.
     * 
     * @return tipo
     */
    public org.apache.axis.types.NonNegativeInteger getTipo() {
        return tipo;
    }


    /**
     * Sets the tipo value for this TpImpostos.
     * 
     * @param tipo
     */
    public void setTipo(org.apache.axis.types.NonNegativeInteger tipo) {
        this.tipo = tipo;
    }


    /**
     * Gets the codSt value for this TpImpostos.
     * 
     * @return codSt
     */
    public java.lang.String getCodSt() {
        return codSt;
    }


    /**
     * Sets the codSt value for this TpImpostos.
     * 
     * @param codSt
     */
    public void setCodSt(java.lang.String codSt) {
        this.codSt = codSt;
    }


    /**
     * Gets the tipoRetencaoImposto value for this TpImpostos.
     * 
     * @return tipoRetencaoImposto
     */
    public java.lang.String getTipoRetencaoImposto() {
        return tipoRetencaoImposto;
    }


    /**
     * Sets the tipoRetencaoImposto value for this TpImpostos.
     * 
     * @param tipoRetencaoImposto
     */
    public void setTipoRetencaoImposto(java.lang.String tipoRetencaoImposto) {
        this.tipoRetencaoImposto = tipoRetencaoImposto;
    }


    /**
     * Gets the naturezaReceitaPisCofins value for this TpImpostos.
     * 
     * @return naturezaReceitaPisCofins
     */
    public java.lang.String getNaturezaReceitaPisCofins() {
        return naturezaReceitaPisCofins;
    }


    /**
     * Sets the naturezaReceitaPisCofins value for this TpImpostos.
     * 
     * @param naturezaReceitaPisCofins
     */
    public void setNaturezaReceitaPisCofins(java.lang.String naturezaReceitaPisCofins) {
        this.naturezaReceitaPisCofins = naturezaReceitaPisCofins;
    }


    /**
     * Gets the vlBaseCalc value for this TpImpostos.
     * 
     * @return vlBaseCalc
     */
    public java.math.BigDecimal getVlBaseCalc() {
        return vlBaseCalc;
    }


    /**
     * Sets the vlBaseCalc value for this TpImpostos.
     * 
     * @param vlBaseCalc
     */
    public void setVlBaseCalc(java.math.BigDecimal vlBaseCalc) {
        this.vlBaseCalc = vlBaseCalc;
    }


    /**
     * Gets the aliquota value for this TpImpostos.
     * 
     * @return aliquota
     */
    public java.math.BigDecimal getAliquota() {
        return aliquota;
    }


    /**
     * Sets the aliquota value for this TpImpostos.
     * 
     * @param aliquota
     */
    public void setAliquota(java.math.BigDecimal aliquota) {
        this.aliquota = aliquota;
    }


    /**
     * Gets the vlImpTrib value for this TpImpostos.
     * 
     * @return vlImpTrib
     */
    public java.math.BigDecimal getVlImpTrib() {
        return vlImpTrib;
    }


    /**
     * Sets the vlImpTrib value for this TpImpostos.
     * 
     * @param vlImpTrib
     */
    public void setVlImpTrib(java.math.BigDecimal vlImpTrib) {
        this.vlImpTrib = vlImpTrib;
    }


    /**
     * Gets the percReduc value for this TpImpostos.
     * 
     * @return percReduc
     */
    public java.math.BigDecimal getPercReduc() {
        return percReduc;
    }


    /**
     * Sets the percReduc value for this TpImpostos.
     * 
     * @param percReduc
     */
    public void setPercReduc(java.math.BigDecimal percReduc) {
        this.percReduc = percReduc;
    }


    /**
     * Gets the percAdic value for this TpImpostos.
     * 
     * @return percAdic
     */
    public java.math.BigDecimal getPercAdic() {
        return percAdic;
    }


    /**
     * Sets the percAdic value for this TpImpostos.
     * 
     * @param percAdic
     */
    public void setPercAdic(java.math.BigDecimal percAdic) {
        this.percAdic = percAdic;
    }


    /**
     * Gets the qtdeBaseCalcProd value for this TpImpostos.
     * 
     * @return qtdeBaseCalcProd
     */
    public java.math.BigDecimal getQtdeBaseCalcProd() {
        return qtdeBaseCalcProd;
    }


    /**
     * Sets the qtdeBaseCalcProd value for this TpImpostos.
     * 
     * @param qtdeBaseCalcProd
     */
    public void setQtdeBaseCalcProd(java.math.BigDecimal qtdeBaseCalcProd) {
        this.qtdeBaseCalcProd = qtdeBaseCalcProd;
    }


    /**
     * Gets the vlAliqProd value for this TpImpostos.
     * 
     * @return vlAliqProd
     */
    public java.math.BigDecimal getVlAliqProd() {
        return vlAliqProd;
    }


    /**
     * Sets the vlAliqProd value for this TpImpostos.
     * 
     * @param vlAliqProd
     */
    public void setVlAliqProd(java.math.BigDecimal vlAliqProd) {
        this.vlAliqProd = vlAliqProd;
    }


    /**
     * Gets the percBaseCalcOperProd value for this TpImpostos.
     * 
     * @return percBaseCalcOperProd
     */
    public java.math.BigDecimal getPercBaseCalcOperProd() {
        return percBaseCalcOperProd;
    }


    /**
     * Sets the percBaseCalcOperProd value for this TpImpostos.
     * 
     * @param percBaseCalcOperProd
     */
    public void setPercBaseCalcOperProd(java.math.BigDecimal percBaseCalcOperProd) {
        this.percBaseCalcOperProd = percBaseCalcOperProd;
    }


    /**
     * Gets the vlImpNaoDest value for this TpImpostos.
     * 
     * @return vlImpNaoDest
     */
    public java.math.BigDecimal getVlImpNaoDest() {
        return vlImpNaoDest;
    }


    /**
     * Sets the vlImpNaoDest value for this TpImpostos.
     * 
     * @param vlImpNaoDest
     */
    public void setVlImpNaoDest(java.math.BigDecimal vlImpNaoDest) {
        this.vlImpNaoDest = vlImpNaoDest;
    }


    /**
     * Gets the dadosIcmsSt value for this TpImpostos.
     * 
     * @return dadosIcmsSt
     */
    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpDadosIcmsSt getDadosIcmsSt() {
        return dadosIcmsSt;
    }


    /**
     * Sets the dadosIcmsSt value for this TpImpostos.
     * 
     * @param dadosIcmsSt
     */
    public void setDadosIcmsSt(br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpDadosIcmsSt dadosIcmsSt) {
        this.dadosIcmsSt = dadosIcmsSt;
    }


    /**
     * Gets the dadosIcms value for this TpImpostos.
     * 
     * @return dadosIcms
     */
    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpDadosIcms getDadosIcms() {
        return dadosIcms;
    }


    /**
     * Sets the dadosIcms value for this TpImpostos.
     * 
     * @param dadosIcms
     */
    public void setDadosIcms(br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpDadosIcms dadosIcms) {
        this.dadosIcms = dadosIcms;
    }


    /**
     * Gets the dadosOutros value for this TpImpostos.
     * 
     * @return dadosOutros
     */
    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpDadosOutros getDadosOutros() {
        return dadosOutros;
    }


    /**
     * Sets the dadosOutros value for this TpImpostos.
     * 
     * @param dadosOutros
     */
    public void setDadosOutros(br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpDadosOutros dadosOutros) {
        this.dadosOutros = dadosOutros;
    }


    /**
     * Gets the impItemIcmsDest value for this TpImpostos.
     * 
     * @return impItemIcmsDest
     */
    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpImpItemNfIcmsDest getImpItemIcmsDest() {
        return impItemIcmsDest;
    }


    /**
     * Sets the impItemIcmsDest value for this TpImpostos.
     * 
     * @param impItemIcmsDest
     */
    public void setImpItemIcmsDest(br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpImpItemNfIcmsDest impItemIcmsDest) {
        this.impItemIcmsDest = impItemIcmsDest;
    }


    /**
     * Gets the codReceita value for this TpImpostos.
     * 
     * @return codReceita
     */
    public java.lang.String getCodReceita() {
        return codReceita;
    }


    /**
     * Sets the codReceita value for this TpImpostos.
     * 
     * @param codReceita
     */
    public void setCodReceita(java.lang.String codReceita) {
        this.codReceita = codReceita;
    }


    /**
     * Gets the vlBcFCP value for this TpImpostos.
     * 
     * @return vlBcFCP
     */
    public java.math.BigDecimal getVlBcFCP() {
        return vlBcFCP;
    }


    /**
     * Sets the vlBcFCP value for this TpImpostos.
     * 
     * @param vlBcFCP
     */
    public void setVlBcFCP(java.math.BigDecimal vlBcFCP) {
        this.vlBcFCP = vlBcFCP;
    }


    /**
     * Gets the aliqFCP value for this TpImpostos.
     * 
     * @return aliqFCP
     */
    public java.math.BigDecimal getAliqFCP() {
        return aliqFCP;
    }


    /**
     * Sets the aliqFCP value for this TpImpostos.
     * 
     * @param aliqFCP
     */
    public void setAliqFCP(java.math.BigDecimal aliqFCP) {
        this.aliqFCP = aliqFCP;
    }


    /**
     * Gets the vlFCP value for this TpImpostos.
     * 
     * @return vlFCP
     */
    public java.math.BigDecimal getVlFCP() {
        return vlFCP;
    }


    /**
     * Sets the vlFCP value for this TpImpostos.
     * 
     * @param vlFCP
     */
    public void setVlFCP(java.math.BigDecimal vlFCP) {
        this.vlFCP = vlFCP;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TpImpostos)) return false;
        TpImpostos other = (TpImpostos) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codImposto==null && other.getCodImposto()==null) || 
             (this.codImposto!=null &&
              this.codImposto.equals(other.getCodImposto()))) &&
            ((this.tipo==null && other.getTipo()==null) || 
             (this.tipo!=null &&
              this.tipo.equals(other.getTipo()))) &&
            ((this.codSt==null && other.getCodSt()==null) || 
             (this.codSt!=null &&
              this.codSt.equals(other.getCodSt()))) &&
            ((this.tipoRetencaoImposto==null && other.getTipoRetencaoImposto()==null) || 
             (this.tipoRetencaoImposto!=null &&
              this.tipoRetencaoImposto.equals(other.getTipoRetencaoImposto()))) &&
            ((this.naturezaReceitaPisCofins==null && other.getNaturezaReceitaPisCofins()==null) || 
             (this.naturezaReceitaPisCofins!=null &&
              this.naturezaReceitaPisCofins.equals(other.getNaturezaReceitaPisCofins()))) &&
            ((this.vlBaseCalc==null && other.getVlBaseCalc()==null) || 
             (this.vlBaseCalc!=null &&
              this.vlBaseCalc.equals(other.getVlBaseCalc()))) &&
            ((this.aliquota==null && other.getAliquota()==null) || 
             (this.aliquota!=null &&
              this.aliquota.equals(other.getAliquota()))) &&
            ((this.vlImpTrib==null && other.getVlImpTrib()==null) || 
             (this.vlImpTrib!=null &&
              this.vlImpTrib.equals(other.getVlImpTrib()))) &&
            ((this.percReduc==null && other.getPercReduc()==null) || 
             (this.percReduc!=null &&
              this.percReduc.equals(other.getPercReduc()))) &&
            ((this.percAdic==null && other.getPercAdic()==null) || 
             (this.percAdic!=null &&
              this.percAdic.equals(other.getPercAdic()))) &&
            ((this.qtdeBaseCalcProd==null && other.getQtdeBaseCalcProd()==null) || 
             (this.qtdeBaseCalcProd!=null &&
              this.qtdeBaseCalcProd.equals(other.getQtdeBaseCalcProd()))) &&
            ((this.vlAliqProd==null && other.getVlAliqProd()==null) || 
             (this.vlAliqProd!=null &&
              this.vlAliqProd.equals(other.getVlAliqProd()))) &&
            ((this.percBaseCalcOperProd==null && other.getPercBaseCalcOperProd()==null) || 
             (this.percBaseCalcOperProd!=null &&
              this.percBaseCalcOperProd.equals(other.getPercBaseCalcOperProd()))) &&
            ((this.vlImpNaoDest==null && other.getVlImpNaoDest()==null) || 
             (this.vlImpNaoDest!=null &&
              this.vlImpNaoDest.equals(other.getVlImpNaoDest()))) &&
            ((this.dadosIcmsSt==null && other.getDadosIcmsSt()==null) || 
             (this.dadosIcmsSt!=null &&
              this.dadosIcmsSt.equals(other.getDadosIcmsSt()))) &&
            ((this.dadosIcms==null && other.getDadosIcms()==null) || 
             (this.dadosIcms!=null &&
              this.dadosIcms.equals(other.getDadosIcms()))) &&
            ((this.dadosOutros==null && other.getDadosOutros()==null) || 
             (this.dadosOutros!=null &&
              this.dadosOutros.equals(other.getDadosOutros()))) &&
            ((this.impItemIcmsDest==null && other.getImpItemIcmsDest()==null) || 
             (this.impItemIcmsDest!=null &&
              this.impItemIcmsDest.equals(other.getImpItemIcmsDest()))) &&
            ((this.codReceita==null && other.getCodReceita()==null) || 
             (this.codReceita!=null &&
              this.codReceita.equals(other.getCodReceita()))) &&
            ((this.vlBcFCP==null && other.getVlBcFCP()==null) || 
             (this.vlBcFCP!=null &&
              this.vlBcFCP.equals(other.getVlBcFCP()))) &&
            ((this.aliqFCP==null && other.getAliqFCP()==null) || 
             (this.aliqFCP!=null &&
              this.aliqFCP.equals(other.getAliqFCP()))) &&
            ((this.vlFCP==null && other.getVlFCP()==null) || 
             (this.vlFCP!=null &&
              this.vlFCP.equals(other.getVlFCP())));
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
        if (getCodImposto() != null) {
            _hashCode += getCodImposto().hashCode();
        }
        if (getTipo() != null) {
            _hashCode += getTipo().hashCode();
        }
        if (getCodSt() != null) {
            _hashCode += getCodSt().hashCode();
        }
        if (getTipoRetencaoImposto() != null) {
            _hashCode += getTipoRetencaoImposto().hashCode();
        }
        if (getNaturezaReceitaPisCofins() != null) {
            _hashCode += getNaturezaReceitaPisCofins().hashCode();
        }
        if (getVlBaseCalc() != null) {
            _hashCode += getVlBaseCalc().hashCode();
        }
        if (getAliquota() != null) {
            _hashCode += getAliquota().hashCode();
        }
        if (getVlImpTrib() != null) {
            _hashCode += getVlImpTrib().hashCode();
        }
        if (getPercReduc() != null) {
            _hashCode += getPercReduc().hashCode();
        }
        if (getPercAdic() != null) {
            _hashCode += getPercAdic().hashCode();
        }
        if (getQtdeBaseCalcProd() != null) {
            _hashCode += getQtdeBaseCalcProd().hashCode();
        }
        if (getVlAliqProd() != null) {
            _hashCode += getVlAliqProd().hashCode();
        }
        if (getPercBaseCalcOperProd() != null) {
            _hashCode += getPercBaseCalcOperProd().hashCode();
        }
        if (getVlImpNaoDest() != null) {
            _hashCode += getVlImpNaoDest().hashCode();
        }
        if (getDadosIcmsSt() != null) {
            _hashCode += getDadosIcmsSt().hashCode();
        }
        if (getDadosIcms() != null) {
            _hashCode += getDadosIcms().hashCode();
        }
        if (getDadosOutros() != null) {
            _hashCode += getDadosOutros().hashCode();
        }
        if (getImpItemIcmsDest() != null) {
            _hashCode += getImpItemIcmsDest().hashCode();
        }
        if (getCodReceita() != null) {
            _hashCode += getCodReceita().hashCode();
        }
        if (getVlBcFCP() != null) {
            _hashCode += getVlBcFCP().hashCode();
        }
        if (getAliqFCP() != null) {
            _hashCode += getAliqFCP().hashCode();
        }
        if (getVlFCP() != null) {
            _hashCode += getVlFCP().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TpImpostos.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "tpImpostos"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codImposto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "codImposto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "tipo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "tpDominio"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codSt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "codSt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoRetencaoImposto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "tipoRetencaoImposto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("naturezaReceitaPisCofins");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "naturezaReceitaPisCofins"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlBaseCalc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "vlBaseCalc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aliquota");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "aliquota"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlImpTrib");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "vlImpTrib"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("percReduc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "percReduc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("percAdic");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "percAdic"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qtdeBaseCalcProd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "qtdeBaseCalcProd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalFourPrec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlAliqProd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "vlAliqProd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalFourPrec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("percBaseCalcOperProd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "percBaseCalcOperProd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlImpNaoDest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "vlImpNaoDest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dadosIcmsSt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "dadosIcmsSt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "tpDadosIcmsSt"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dadosIcms");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "dadosIcms"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "tpDadosIcms"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dadosOutros");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "dadosOutros"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "tpDadosOutros"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("impItemIcmsDest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "impItemIcmsDest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "tpImpItemNfIcmsDest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codReceita");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "codReceita"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlBcFCP");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "vlBcFCP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aliqFCP");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "aliqFCP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalFourPrec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlFCP");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "vlFCP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
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
