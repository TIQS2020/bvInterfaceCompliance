/**
 * TpItens.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServicos;

public class TpItens  implements java.io.Serializable {
    private org.apache.axis.types.NonNegativeInteger nroItem;

    private java.lang.String codItemServ;

    private java.lang.String descricao;

    private org.apache.axis.types.NonNegativeInteger cfop;

    private java.lang.String cnae;

    private java.math.BigInteger cdListaServ;

    private java.lang.String codTribMunicipio;

    private java.lang.String codBaseCalcCredPc;

    private org.apache.axis.types.NonNegativeInteger dmIndOrigCred;

    private java.util.Date dtPgtoPis;

    private java.util.Date dtPgtoCofins;

    private org.apache.axis.types.NonNegativeInteger dmLocalExecServ;

    private org.apache.axis.types.NonNegativeInteger dmTribMunPrest;

    private java.lang.String cidadeIbge;

    private java.lang.String codCta;

    private java.lang.String codCentroCusto;

    private br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServicos.TpValores valores;

    private br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServicos.TpImpostos[] impostos;

    private java.lang.String cdCidadeBeneficFiscal;

    private java.lang.String cdTpServReinf;

    private java.math.BigInteger dmIndCprb;

    public TpItens() {
    }

    public TpItens(
           org.apache.axis.types.NonNegativeInteger nroItem,
           java.lang.String codItemServ,
           java.lang.String descricao,
           org.apache.axis.types.NonNegativeInteger cfop,
           java.lang.String cnae,
           java.math.BigInteger cdListaServ,
           java.lang.String codTribMunicipio,
           java.lang.String codBaseCalcCredPc,
           org.apache.axis.types.NonNegativeInteger dmIndOrigCred,
           java.util.Date dtPgtoPis,
           java.util.Date dtPgtoCofins,
           org.apache.axis.types.NonNegativeInteger dmLocalExecServ,
           org.apache.axis.types.NonNegativeInteger dmTribMunPrest,
           java.lang.String cidadeIbge,
           java.lang.String codCta,
           java.lang.String codCentroCusto,
           br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServicos.TpValores valores,
           br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServicos.TpImpostos[] impostos,
           java.lang.String cdCidadeBeneficFiscal,
           java.lang.String cdTpServReinf,
           java.math.BigInteger dmIndCprb) {
           this.nroItem = nroItem;
           this.codItemServ = codItemServ;
           this.descricao = descricao;
           this.cfop = cfop;
           this.cnae = cnae;
           this.cdListaServ = cdListaServ;
           this.codTribMunicipio = codTribMunicipio;
           this.codBaseCalcCredPc = codBaseCalcCredPc;
           this.dmIndOrigCred = dmIndOrigCred;
           this.dtPgtoPis = dtPgtoPis;
           this.dtPgtoCofins = dtPgtoCofins;
           this.dmLocalExecServ = dmLocalExecServ;
           this.dmTribMunPrest = dmTribMunPrest;
           this.cidadeIbge = cidadeIbge;
           this.codCta = codCta;
           this.codCentroCusto = codCentroCusto;
           this.valores = valores;
           this.impostos = impostos;
           this.cdCidadeBeneficFiscal = cdCidadeBeneficFiscal;
           this.cdTpServReinf = cdTpServReinf;
           this.dmIndCprb = dmIndCprb;
    }


    /**
     * Gets the nroItem value for this TpItens.
     * 
     * @return nroItem
     */
    public org.apache.axis.types.NonNegativeInteger getNroItem() {
        return nroItem;
    }


    /**
     * Sets the nroItem value for this TpItens.
     * 
     * @param nroItem
     */
    public void setNroItem(org.apache.axis.types.NonNegativeInteger nroItem) {
        this.nroItem = nroItem;
    }


    /**
     * Gets the codItemServ value for this TpItens.
     * 
     * @return codItemServ
     */
    public java.lang.String getCodItemServ() {
        return codItemServ;
    }


    /**
     * Sets the codItemServ value for this TpItens.
     * 
     * @param codItemServ
     */
    public void setCodItemServ(java.lang.String codItemServ) {
        this.codItemServ = codItemServ;
    }


    /**
     * Gets the descricao value for this TpItens.
     * 
     * @return descricao
     */
    public java.lang.String getDescricao() {
        return descricao;
    }


    /**
     * Sets the descricao value for this TpItens.
     * 
     * @param descricao
     */
    public void setDescricao(java.lang.String descricao) {
        this.descricao = descricao;
    }


    /**
     * Gets the cfop value for this TpItens.
     * 
     * @return cfop
     */
    public org.apache.axis.types.NonNegativeInteger getCfop() {
        return cfop;
    }


    /**
     * Sets the cfop value for this TpItens.
     * 
     * @param cfop
     */
    public void setCfop(org.apache.axis.types.NonNegativeInteger cfop) {
        this.cfop = cfop;
    }


    /**
     * Gets the cnae value for this TpItens.
     * 
     * @return cnae
     */
    public java.lang.String getCnae() {
        return cnae;
    }


    /**
     * Sets the cnae value for this TpItens.
     * 
     * @param cnae
     */
    public void setCnae(java.lang.String cnae) {
        this.cnae = cnae;
    }


    /**
     * Gets the cdListaServ value for this TpItens.
     * 
     * @return cdListaServ
     */
    public java.math.BigInteger getCdListaServ() {
        return cdListaServ;
    }


    /**
     * Sets the cdListaServ value for this TpItens.
     * 
     * @param cdListaServ
     */
    public void setCdListaServ(java.math.BigInteger cdListaServ) {
        this.cdListaServ = cdListaServ;
    }


    /**
     * Gets the codTribMunicipio value for this TpItens.
     * 
     * @return codTribMunicipio
     */
    public java.lang.String getCodTribMunicipio() {
        return codTribMunicipio;
    }


    /**
     * Sets the codTribMunicipio value for this TpItens.
     * 
     * @param codTribMunicipio
     */
    public void setCodTribMunicipio(java.lang.String codTribMunicipio) {
        this.codTribMunicipio = codTribMunicipio;
    }


    /**
     * Gets the codBaseCalcCredPc value for this TpItens.
     * 
     * @return codBaseCalcCredPc
     */
    public java.lang.String getCodBaseCalcCredPc() {
        return codBaseCalcCredPc;
    }


    /**
     * Sets the codBaseCalcCredPc value for this TpItens.
     * 
     * @param codBaseCalcCredPc
     */
    public void setCodBaseCalcCredPc(java.lang.String codBaseCalcCredPc) {
        this.codBaseCalcCredPc = codBaseCalcCredPc;
    }


    /**
     * Gets the dmIndOrigCred value for this TpItens.
     * 
     * @return dmIndOrigCred
     */
    public org.apache.axis.types.NonNegativeInteger getDmIndOrigCred() {
        return dmIndOrigCred;
    }


    /**
     * Sets the dmIndOrigCred value for this TpItens.
     * 
     * @param dmIndOrigCred
     */
    public void setDmIndOrigCred(org.apache.axis.types.NonNegativeInteger dmIndOrigCred) {
        this.dmIndOrigCred = dmIndOrigCred;
    }


    /**
     * Gets the dtPgtoPis value for this TpItens.
     * 
     * @return dtPgtoPis
     */
    public java.util.Date getDtPgtoPis() {
        return dtPgtoPis;
    }


    /**
     * Sets the dtPgtoPis value for this TpItens.
     * 
     * @param dtPgtoPis
     */
    public void setDtPgtoPis(java.util.Date dtPgtoPis) {
        this.dtPgtoPis = dtPgtoPis;
    }


    /**
     * Gets the dtPgtoCofins value for this TpItens.
     * 
     * @return dtPgtoCofins
     */
    public java.util.Date getDtPgtoCofins() {
        return dtPgtoCofins;
    }


    /**
     * Sets the dtPgtoCofins value for this TpItens.
     * 
     * @param dtPgtoCofins
     */
    public void setDtPgtoCofins(java.util.Date dtPgtoCofins) {
        this.dtPgtoCofins = dtPgtoCofins;
    }


    /**
     * Gets the dmLocalExecServ value for this TpItens.
     * 
     * @return dmLocalExecServ
     */
    public org.apache.axis.types.NonNegativeInteger getDmLocalExecServ() {
        return dmLocalExecServ;
    }


    /**
     * Sets the dmLocalExecServ value for this TpItens.
     * 
     * @param dmLocalExecServ
     */
    public void setDmLocalExecServ(org.apache.axis.types.NonNegativeInteger dmLocalExecServ) {
        this.dmLocalExecServ = dmLocalExecServ;
    }


    /**
     * Gets the dmTribMunPrest value for this TpItens.
     * 
     * @return dmTribMunPrest
     */
    public org.apache.axis.types.NonNegativeInteger getDmTribMunPrest() {
        return dmTribMunPrest;
    }


    /**
     * Sets the dmTribMunPrest value for this TpItens.
     * 
     * @param dmTribMunPrest
     */
    public void setDmTribMunPrest(org.apache.axis.types.NonNegativeInteger dmTribMunPrest) {
        this.dmTribMunPrest = dmTribMunPrest;
    }


    /**
     * Gets the cidadeIbge value for this TpItens.
     * 
     * @return cidadeIbge
     */
    public java.lang.String getCidadeIbge() {
        return cidadeIbge;
    }


    /**
     * Sets the cidadeIbge value for this TpItens.
     * 
     * @param cidadeIbge
     */
    public void setCidadeIbge(java.lang.String cidadeIbge) {
        this.cidadeIbge = cidadeIbge;
    }


    /**
     * Gets the codCta value for this TpItens.
     * 
     * @return codCta
     */
    public java.lang.String getCodCta() {
        return codCta;
    }


    /**
     * Sets the codCta value for this TpItens.
     * 
     * @param codCta
     */
    public void setCodCta(java.lang.String codCta) {
        this.codCta = codCta;
    }


    /**
     * Gets the codCentroCusto value for this TpItens.
     * 
     * @return codCentroCusto
     */
    public java.lang.String getCodCentroCusto() {
        return codCentroCusto;
    }


    /**
     * Sets the codCentroCusto value for this TpItens.
     * 
     * @param codCentroCusto
     */
    public void setCodCentroCusto(java.lang.String codCentroCusto) {
        this.codCentroCusto = codCentroCusto;
    }


    /**
     * Gets the valores value for this TpItens.
     * 
     * @return valores
     */
    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServicos.TpValores getValores() {
        return valores;
    }


    /**
     * Sets the valores value for this TpItens.
     * 
     * @param valores
     */
    public void setValores(br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServicos.TpValores valores) {
        this.valores = valores;
    }


    /**
     * Gets the impostos value for this TpItens.
     * 
     * @return impostos
     */
    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServicos.TpImpostos[] getImpostos() {
        return impostos;
    }


    /**
     * Sets the impostos value for this TpItens.
     * 
     * @param impostos
     */
    public void setImpostos(br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServicos.TpImpostos[] impostos) {
        this.impostos = impostos;
    }

    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServicos.TpImpostos getImpostos(int i) {
        return this.impostos[i];
    }

    public void setImpostos(int i, br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServicos.TpImpostos _value) {
        this.impostos[i] = _value;
    }


    /**
     * Gets the cdCidadeBeneficFiscal value for this TpItens.
     * 
     * @return cdCidadeBeneficFiscal
     */
    public java.lang.String getCdCidadeBeneficFiscal() {
        return cdCidadeBeneficFiscal;
    }


    /**
     * Sets the cdCidadeBeneficFiscal value for this TpItens.
     * 
     * @param cdCidadeBeneficFiscal
     */
    public void setCdCidadeBeneficFiscal(java.lang.String cdCidadeBeneficFiscal) {
        this.cdCidadeBeneficFiscal = cdCidadeBeneficFiscal;
    }


    /**
     * Gets the cdTpServReinf value for this TpItens.
     * 
     * @return cdTpServReinf
     */
    public java.lang.String getCdTpServReinf() {
        return cdTpServReinf;
    }


    /**
     * Sets the cdTpServReinf value for this TpItens.
     * 
     * @param cdTpServReinf
     */
    public void setCdTpServReinf(java.lang.String cdTpServReinf) {
        this.cdTpServReinf = cdTpServReinf;
    }


    /**
     * Gets the dmIndCprb value for this TpItens.
     * 
     * @return dmIndCprb
     */
    public java.math.BigInteger getDmIndCprb() {
        return dmIndCprb;
    }


    /**
     * Sets the dmIndCprb value for this TpItens.
     * 
     * @param dmIndCprb
     */
    public void setDmIndCprb(java.math.BigInteger dmIndCprb) {
        this.dmIndCprb = dmIndCprb;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TpItens)) return false;
        TpItens other = (TpItens) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nroItem==null && other.getNroItem()==null) || 
             (this.nroItem!=null &&
              this.nroItem.equals(other.getNroItem()))) &&
            ((this.codItemServ==null && other.getCodItemServ()==null) || 
             (this.codItemServ!=null &&
              this.codItemServ.equals(other.getCodItemServ()))) &&
            ((this.descricao==null && other.getDescricao()==null) || 
             (this.descricao!=null &&
              this.descricao.equals(other.getDescricao()))) &&
            ((this.cfop==null && other.getCfop()==null) || 
             (this.cfop!=null &&
              this.cfop.equals(other.getCfop()))) &&
            ((this.cnae==null && other.getCnae()==null) || 
             (this.cnae!=null &&
              this.cnae.equals(other.getCnae()))) &&
            ((this.cdListaServ==null && other.getCdListaServ()==null) || 
             (this.cdListaServ!=null &&
              this.cdListaServ.equals(other.getCdListaServ()))) &&
            ((this.codTribMunicipio==null && other.getCodTribMunicipio()==null) || 
             (this.codTribMunicipio!=null &&
              this.codTribMunicipio.equals(other.getCodTribMunicipio()))) &&
            ((this.codBaseCalcCredPc==null && other.getCodBaseCalcCredPc()==null) || 
             (this.codBaseCalcCredPc!=null &&
              this.codBaseCalcCredPc.equals(other.getCodBaseCalcCredPc()))) &&
            ((this.dmIndOrigCred==null && other.getDmIndOrigCred()==null) || 
             (this.dmIndOrigCred!=null &&
              this.dmIndOrigCred.equals(other.getDmIndOrigCred()))) &&
            ((this.dtPgtoPis==null && other.getDtPgtoPis()==null) || 
             (this.dtPgtoPis!=null &&
              this.dtPgtoPis.equals(other.getDtPgtoPis()))) &&
            ((this.dtPgtoCofins==null && other.getDtPgtoCofins()==null) || 
             (this.dtPgtoCofins!=null &&
              this.dtPgtoCofins.equals(other.getDtPgtoCofins()))) &&
            ((this.dmLocalExecServ==null && other.getDmLocalExecServ()==null) || 
             (this.dmLocalExecServ!=null &&
              this.dmLocalExecServ.equals(other.getDmLocalExecServ()))) &&
            ((this.dmTribMunPrest==null && other.getDmTribMunPrest()==null) || 
             (this.dmTribMunPrest!=null &&
              this.dmTribMunPrest.equals(other.getDmTribMunPrest()))) &&
            ((this.cidadeIbge==null && other.getCidadeIbge()==null) || 
             (this.cidadeIbge!=null &&
              this.cidadeIbge.equals(other.getCidadeIbge()))) &&
            ((this.codCta==null && other.getCodCta()==null) || 
             (this.codCta!=null &&
              this.codCta.equals(other.getCodCta()))) &&
            ((this.codCentroCusto==null && other.getCodCentroCusto()==null) || 
             (this.codCentroCusto!=null &&
              this.codCentroCusto.equals(other.getCodCentroCusto()))) &&
            ((this.valores==null && other.getValores()==null) || 
             (this.valores!=null &&
              this.valores.equals(other.getValores()))) &&
            ((this.impostos==null && other.getImpostos()==null) || 
             (this.impostos!=null &&
              java.util.Arrays.equals(this.impostos, other.getImpostos()))) &&
            ((this.cdCidadeBeneficFiscal==null && other.getCdCidadeBeneficFiscal()==null) || 
             (this.cdCidadeBeneficFiscal!=null &&
              this.cdCidadeBeneficFiscal.equals(other.getCdCidadeBeneficFiscal()))) &&
            ((this.cdTpServReinf==null && other.getCdTpServReinf()==null) || 
             (this.cdTpServReinf!=null &&
              this.cdTpServReinf.equals(other.getCdTpServReinf()))) &&
            ((this.dmIndCprb==null && other.getDmIndCprb()==null) || 
             (this.dmIndCprb!=null &&
              this.dmIndCprb.equals(other.getDmIndCprb())));
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
        if (getNroItem() != null) {
            _hashCode += getNroItem().hashCode();
        }
        if (getCodItemServ() != null) {
            _hashCode += getCodItemServ().hashCode();
        }
        if (getDescricao() != null) {
            _hashCode += getDescricao().hashCode();
        }
        if (getCfop() != null) {
            _hashCode += getCfop().hashCode();
        }
        if (getCnae() != null) {
            _hashCode += getCnae().hashCode();
        }
        if (getCdListaServ() != null) {
            _hashCode += getCdListaServ().hashCode();
        }
        if (getCodTribMunicipio() != null) {
            _hashCode += getCodTribMunicipio().hashCode();
        }
        if (getCodBaseCalcCredPc() != null) {
            _hashCode += getCodBaseCalcCredPc().hashCode();
        }
        if (getDmIndOrigCred() != null) {
            _hashCode += getDmIndOrigCred().hashCode();
        }
        if (getDtPgtoPis() != null) {
            _hashCode += getDtPgtoPis().hashCode();
        }
        if (getDtPgtoCofins() != null) {
            _hashCode += getDtPgtoCofins().hashCode();
        }
        if (getDmLocalExecServ() != null) {
            _hashCode += getDmLocalExecServ().hashCode();
        }
        if (getDmTribMunPrest() != null) {
            _hashCode += getDmTribMunPrest().hashCode();
        }
        if (getCidadeIbge() != null) {
            _hashCode += getCidadeIbge().hashCode();
        }
        if (getCodCta() != null) {
            _hashCode += getCodCta().hashCode();
        }
        if (getCodCentroCusto() != null) {
            _hashCode += getCodCentroCusto().hashCode();
        }
        if (getValores() != null) {
            _hashCode += getValores().hashCode();
        }
        if (getImpostos() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getImpostos());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getImpostos(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCdCidadeBeneficFiscal() != null) {
            _hashCode += getCdCidadeBeneficFiscal().hashCode();
        }
        if (getCdTpServReinf() != null) {
            _hashCode += getCdTpServReinf().hashCode();
        }
        if (getDmIndCprb() != null) {
            _hashCode += getDmIndCprb().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TpItens.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServicos", "tpItens"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nroItem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServicos", "nroItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codItemServ");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServicos", "codItemServ"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descricao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServicos", "descricao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cfop");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServicos", "cfop"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cnae");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServicos", "cnae"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cdListaServ");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServicos", "cdListaServ"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codTribMunicipio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServicos", "codTribMunicipio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codBaseCalcCredPc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServicos", "codBaseCalcCredPc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dmIndOrigCred");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServicos", "dmIndOrigCred"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "tpDominio"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dtPgtoPis");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServicos", "dtPgtoPis"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dtPgtoCofins");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServicos", "dtPgtoCofins"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dmLocalExecServ");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServicos", "dmLocalExecServ"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "tpDominio"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dmTribMunPrest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServicos", "dmTribMunPrest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "tpDominio"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cidadeIbge");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServicos", "cidadeIbge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codCta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServicos", "codCta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "tpStringSize255"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codCentroCusto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServicos", "codCentroCusto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valores");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServicos", "valores"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServicos", "tpValores"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("impostos");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServicos", "impostos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServicos", "tpImpostos"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cdCidadeBeneficFiscal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServicos", "cdCidadeBeneficFiscal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cdTpServReinf");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServicos", "cdTpServReinf"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dmIndCprb");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServicos", "dmIndCprb"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
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
