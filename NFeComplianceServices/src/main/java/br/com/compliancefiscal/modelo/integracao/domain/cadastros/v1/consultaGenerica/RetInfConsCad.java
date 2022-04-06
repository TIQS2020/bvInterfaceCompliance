/**
 * RetInfConsCad.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.consultaGenerica;

public class RetInfConsCad  implements java.io.Serializable {
    private java.math.BigInteger idIntegr;

    private java.lang.String siglaEstado;

    private java.lang.String ie;

    private java.lang.String cnpj;

    private java.lang.String cpf;

    private org.apache.axis.types.NonNegativeInteger dmSitContr;

    private org.apache.axis.types.NonNegativeInteger dmIndContrNfe;

    private org.apache.axis.types.NonNegativeInteger dmIndContrCte;

    private java.lang.String nome;

    private java.lang.String fant;

    private java.lang.String regApur;

    private java.lang.String cnae;

    private java.util.Date dtIniAtiv;

    private java.util.Date dtUltSit;

    private java.util.Date dtBaixa;

    private java.lang.String ieUnica;

    private java.lang.String ieAtual;

    private java.lang.String lograd;

    private java.lang.String nro;

    private java.lang.String compl;

    private java.lang.String bairro;

    private java.math.BigInteger ibgeCidade;

    private java.lang.String descrCidade;

    private java.math.BigInteger cep;

    public RetInfConsCad() {
    }

    public RetInfConsCad(
           java.math.BigInteger idIntegr,
           java.lang.String siglaEstado,
           java.lang.String ie,
           java.lang.String cnpj,
           java.lang.String cpf,
           org.apache.axis.types.NonNegativeInteger dmSitContr,
           org.apache.axis.types.NonNegativeInteger dmIndContrNfe,
           org.apache.axis.types.NonNegativeInteger dmIndContrCte,
           java.lang.String nome,
           java.lang.String fant,
           java.lang.String regApur,
           java.lang.String cnae,
           java.util.Date dtIniAtiv,
           java.util.Date dtUltSit,
           java.util.Date dtBaixa,
           java.lang.String ieUnica,
           java.lang.String ieAtual,
           java.lang.String lograd,
           java.lang.String nro,
           java.lang.String compl,
           java.lang.String bairro,
           java.math.BigInteger ibgeCidade,
           java.lang.String descrCidade,
           java.math.BigInteger cep) {
           this.idIntegr = idIntegr;
           this.siglaEstado = siglaEstado;
           this.ie = ie;
           this.cnpj = cnpj;
           this.cpf = cpf;
           this.dmSitContr = dmSitContr;
           this.dmIndContrNfe = dmIndContrNfe;
           this.dmIndContrCte = dmIndContrCte;
           this.nome = nome;
           this.fant = fant;
           this.regApur = regApur;
           this.cnae = cnae;
           this.dtIniAtiv = dtIniAtiv;
           this.dtUltSit = dtUltSit;
           this.dtBaixa = dtBaixa;
           this.ieUnica = ieUnica;
           this.ieAtual = ieAtual;
           this.lograd = lograd;
           this.nro = nro;
           this.compl = compl;
           this.bairro = bairro;
           this.ibgeCidade = ibgeCidade;
           this.descrCidade = descrCidade;
           this.cep = cep;
    }


    /**
     * Gets the idIntegr value for this RetInfConsCad.
     * 
     * @return idIntegr
     */
    public java.math.BigInteger getIdIntegr() {
        return idIntegr;
    }


    /**
     * Sets the idIntegr value for this RetInfConsCad.
     * 
     * @param idIntegr
     */
    public void setIdIntegr(java.math.BigInteger idIntegr) {
        this.idIntegr = idIntegr;
    }


    /**
     * Gets the siglaEstado value for this RetInfConsCad.
     * 
     * @return siglaEstado
     */
    public java.lang.String getSiglaEstado() {
        return siglaEstado;
    }


    /**
     * Sets the siglaEstado value for this RetInfConsCad.
     * 
     * @param siglaEstado
     */
    public void setSiglaEstado(java.lang.String siglaEstado) {
        this.siglaEstado = siglaEstado;
    }


    /**
     * Gets the ie value for this RetInfConsCad.
     * 
     * @return ie
     */
    public java.lang.String getIe() {
        return ie;
    }


    /**
     * Sets the ie value for this RetInfConsCad.
     * 
     * @param ie
     */
    public void setIe(java.lang.String ie) {
        this.ie = ie;
    }


    /**
     * Gets the cnpj value for this RetInfConsCad.
     * 
     * @return cnpj
     */
    public java.lang.String getCnpj() {
        return cnpj;
    }


    /**
     * Sets the cnpj value for this RetInfConsCad.
     * 
     * @param cnpj
     */
    public void setCnpj(java.lang.String cnpj) {
        this.cnpj = cnpj;
    }


    /**
     * Gets the cpf value for this RetInfConsCad.
     * 
     * @return cpf
     */
    public java.lang.String getCpf() {
        return cpf;
    }


    /**
     * Sets the cpf value for this RetInfConsCad.
     * 
     * @param cpf
     */
    public void setCpf(java.lang.String cpf) {
        this.cpf = cpf;
    }


    /**
     * Gets the dmSitContr value for this RetInfConsCad.
     * 
     * @return dmSitContr
     */
    public org.apache.axis.types.NonNegativeInteger getDmSitContr() {
        return dmSitContr;
    }


    /**
     * Sets the dmSitContr value for this RetInfConsCad.
     * 
     * @param dmSitContr
     */
    public void setDmSitContr(org.apache.axis.types.NonNegativeInteger dmSitContr) {
        this.dmSitContr = dmSitContr;
    }


    /**
     * Gets the dmIndContrNfe value for this RetInfConsCad.
     * 
     * @return dmIndContrNfe
     */
    public org.apache.axis.types.NonNegativeInteger getDmIndContrNfe() {
        return dmIndContrNfe;
    }


    /**
     * Sets the dmIndContrNfe value for this RetInfConsCad.
     * 
     * @param dmIndContrNfe
     */
    public void setDmIndContrNfe(org.apache.axis.types.NonNegativeInteger dmIndContrNfe) {
        this.dmIndContrNfe = dmIndContrNfe;
    }


    /**
     * Gets the dmIndContrCte value for this RetInfConsCad.
     * 
     * @return dmIndContrCte
     */
    public org.apache.axis.types.NonNegativeInteger getDmIndContrCte() {
        return dmIndContrCte;
    }


    /**
     * Sets the dmIndContrCte value for this RetInfConsCad.
     * 
     * @param dmIndContrCte
     */
    public void setDmIndContrCte(org.apache.axis.types.NonNegativeInteger dmIndContrCte) {
        this.dmIndContrCte = dmIndContrCte;
    }


    /**
     * Gets the nome value for this RetInfConsCad.
     * 
     * @return nome
     */
    public java.lang.String getNome() {
        return nome;
    }


    /**
     * Sets the nome value for this RetInfConsCad.
     * 
     * @param nome
     */
    public void setNome(java.lang.String nome) {
        this.nome = nome;
    }


    /**
     * Gets the fant value for this RetInfConsCad.
     * 
     * @return fant
     */
    public java.lang.String getFant() {
        return fant;
    }


    /**
     * Sets the fant value for this RetInfConsCad.
     * 
     * @param fant
     */
    public void setFant(java.lang.String fant) {
        this.fant = fant;
    }


    /**
     * Gets the regApur value for this RetInfConsCad.
     * 
     * @return regApur
     */
    public java.lang.String getRegApur() {
        return regApur;
    }


    /**
     * Sets the regApur value for this RetInfConsCad.
     * 
     * @param regApur
     */
    public void setRegApur(java.lang.String regApur) {
        this.regApur = regApur;
    }


    /**
     * Gets the cnae value for this RetInfConsCad.
     * 
     * @return cnae
     */
    public java.lang.String getCnae() {
        return cnae;
    }


    /**
     * Sets the cnae value for this RetInfConsCad.
     * 
     * @param cnae
     */
    public void setCnae(java.lang.String cnae) {
        this.cnae = cnae;
    }


    /**
     * Gets the dtIniAtiv value for this RetInfConsCad.
     * 
     * @return dtIniAtiv
     */
    public java.util.Date getDtIniAtiv() {
        return dtIniAtiv;
    }


    /**
     * Sets the dtIniAtiv value for this RetInfConsCad.
     * 
     * @param dtIniAtiv
     */
    public void setDtIniAtiv(java.util.Date dtIniAtiv) {
        this.dtIniAtiv = dtIniAtiv;
    }


    /**
     * Gets the dtUltSit value for this RetInfConsCad.
     * 
     * @return dtUltSit
     */
    public java.util.Date getDtUltSit() {
        return dtUltSit;
    }


    /**
     * Sets the dtUltSit value for this RetInfConsCad.
     * 
     * @param dtUltSit
     */
    public void setDtUltSit(java.util.Date dtUltSit) {
        this.dtUltSit = dtUltSit;
    }


    /**
     * Gets the dtBaixa value for this RetInfConsCad.
     * 
     * @return dtBaixa
     */
    public java.util.Date getDtBaixa() {
        return dtBaixa;
    }


    /**
     * Sets the dtBaixa value for this RetInfConsCad.
     * 
     * @param dtBaixa
     */
    public void setDtBaixa(java.util.Date dtBaixa) {
        this.dtBaixa = dtBaixa;
    }


    /**
     * Gets the ieUnica value for this RetInfConsCad.
     * 
     * @return ieUnica
     */
    public java.lang.String getIeUnica() {
        return ieUnica;
    }


    /**
     * Sets the ieUnica value for this RetInfConsCad.
     * 
     * @param ieUnica
     */
    public void setIeUnica(java.lang.String ieUnica) {
        this.ieUnica = ieUnica;
    }


    /**
     * Gets the ieAtual value for this RetInfConsCad.
     * 
     * @return ieAtual
     */
    public java.lang.String getIeAtual() {
        return ieAtual;
    }


    /**
     * Sets the ieAtual value for this RetInfConsCad.
     * 
     * @param ieAtual
     */
    public void setIeAtual(java.lang.String ieAtual) {
        this.ieAtual = ieAtual;
    }


    /**
     * Gets the lograd value for this RetInfConsCad.
     * 
     * @return lograd
     */
    public java.lang.String getLograd() {
        return lograd;
    }


    /**
     * Sets the lograd value for this RetInfConsCad.
     * 
     * @param lograd
     */
    public void setLograd(java.lang.String lograd) {
        this.lograd = lograd;
    }


    /**
     * Gets the nro value for this RetInfConsCad.
     * 
     * @return nro
     */
    public java.lang.String getNro() {
        return nro;
    }


    /**
     * Sets the nro value for this RetInfConsCad.
     * 
     * @param nro
     */
    public void setNro(java.lang.String nro) {
        this.nro = nro;
    }


    /**
     * Gets the compl value for this RetInfConsCad.
     * 
     * @return compl
     */
    public java.lang.String getCompl() {
        return compl;
    }


    /**
     * Sets the compl value for this RetInfConsCad.
     * 
     * @param compl
     */
    public void setCompl(java.lang.String compl) {
        this.compl = compl;
    }


    /**
     * Gets the bairro value for this RetInfConsCad.
     * 
     * @return bairro
     */
    public java.lang.String getBairro() {
        return bairro;
    }


    /**
     * Sets the bairro value for this RetInfConsCad.
     * 
     * @param bairro
     */
    public void setBairro(java.lang.String bairro) {
        this.bairro = bairro;
    }


    /**
     * Gets the ibgeCidade value for this RetInfConsCad.
     * 
     * @return ibgeCidade
     */
    public java.math.BigInteger getIbgeCidade() {
        return ibgeCidade;
    }


    /**
     * Sets the ibgeCidade value for this RetInfConsCad.
     * 
     * @param ibgeCidade
     */
    public void setIbgeCidade(java.math.BigInteger ibgeCidade) {
        this.ibgeCidade = ibgeCidade;
    }


    /**
     * Gets the descrCidade value for this RetInfConsCad.
     * 
     * @return descrCidade
     */
    public java.lang.String getDescrCidade() {
        return descrCidade;
    }


    /**
     * Sets the descrCidade value for this RetInfConsCad.
     * 
     * @param descrCidade
     */
    public void setDescrCidade(java.lang.String descrCidade) {
        this.descrCidade = descrCidade;
    }


    /**
     * Gets the cep value for this RetInfConsCad.
     * 
     * @return cep
     */
    public java.math.BigInteger getCep() {
        return cep;
    }


    /**
     * Sets the cep value for this RetInfConsCad.
     * 
     * @param cep
     */
    public void setCep(java.math.BigInteger cep) {
        this.cep = cep;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RetInfConsCad)) return false;
        RetInfConsCad other = (RetInfConsCad) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.idIntegr==null && other.getIdIntegr()==null) || 
             (this.idIntegr!=null &&
              this.idIntegr.equals(other.getIdIntegr()))) &&
            ((this.siglaEstado==null && other.getSiglaEstado()==null) || 
             (this.siglaEstado!=null &&
              this.siglaEstado.equals(other.getSiglaEstado()))) &&
            ((this.ie==null && other.getIe()==null) || 
             (this.ie!=null &&
              this.ie.equals(other.getIe()))) &&
            ((this.cnpj==null && other.getCnpj()==null) || 
             (this.cnpj!=null &&
              this.cnpj.equals(other.getCnpj()))) &&
            ((this.cpf==null && other.getCpf()==null) || 
             (this.cpf!=null &&
              this.cpf.equals(other.getCpf()))) &&
            ((this.dmSitContr==null && other.getDmSitContr()==null) || 
             (this.dmSitContr!=null &&
              this.dmSitContr.equals(other.getDmSitContr()))) &&
            ((this.dmIndContrNfe==null && other.getDmIndContrNfe()==null) || 
             (this.dmIndContrNfe!=null &&
              this.dmIndContrNfe.equals(other.getDmIndContrNfe()))) &&
            ((this.dmIndContrCte==null && other.getDmIndContrCte()==null) || 
             (this.dmIndContrCte!=null &&
              this.dmIndContrCte.equals(other.getDmIndContrCte()))) &&
            ((this.nome==null && other.getNome()==null) || 
             (this.nome!=null &&
              this.nome.equals(other.getNome()))) &&
            ((this.fant==null && other.getFant()==null) || 
             (this.fant!=null &&
              this.fant.equals(other.getFant()))) &&
            ((this.regApur==null && other.getRegApur()==null) || 
             (this.regApur!=null &&
              this.regApur.equals(other.getRegApur()))) &&
            ((this.cnae==null && other.getCnae()==null) || 
             (this.cnae!=null &&
              this.cnae.equals(other.getCnae()))) &&
            ((this.dtIniAtiv==null && other.getDtIniAtiv()==null) || 
             (this.dtIniAtiv!=null &&
              this.dtIniAtiv.equals(other.getDtIniAtiv()))) &&
            ((this.dtUltSit==null && other.getDtUltSit()==null) || 
             (this.dtUltSit!=null &&
              this.dtUltSit.equals(other.getDtUltSit()))) &&
            ((this.dtBaixa==null && other.getDtBaixa()==null) || 
             (this.dtBaixa!=null &&
              this.dtBaixa.equals(other.getDtBaixa()))) &&
            ((this.ieUnica==null && other.getIeUnica()==null) || 
             (this.ieUnica!=null &&
              this.ieUnica.equals(other.getIeUnica()))) &&
            ((this.ieAtual==null && other.getIeAtual()==null) || 
             (this.ieAtual!=null &&
              this.ieAtual.equals(other.getIeAtual()))) &&
            ((this.lograd==null && other.getLograd()==null) || 
             (this.lograd!=null &&
              this.lograd.equals(other.getLograd()))) &&
            ((this.nro==null && other.getNro()==null) || 
             (this.nro!=null &&
              this.nro.equals(other.getNro()))) &&
            ((this.compl==null && other.getCompl()==null) || 
             (this.compl!=null &&
              this.compl.equals(other.getCompl()))) &&
            ((this.bairro==null && other.getBairro()==null) || 
             (this.bairro!=null &&
              this.bairro.equals(other.getBairro()))) &&
            ((this.ibgeCidade==null && other.getIbgeCidade()==null) || 
             (this.ibgeCidade!=null &&
              this.ibgeCidade.equals(other.getIbgeCidade()))) &&
            ((this.descrCidade==null && other.getDescrCidade()==null) || 
             (this.descrCidade!=null &&
              this.descrCidade.equals(other.getDescrCidade()))) &&
            ((this.cep==null && other.getCep()==null) || 
             (this.cep!=null &&
              this.cep.equals(other.getCep())));
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
        if (getIdIntegr() != null) {
            _hashCode += getIdIntegr().hashCode();
        }
        if (getSiglaEstado() != null) {
            _hashCode += getSiglaEstado().hashCode();
        }
        if (getIe() != null) {
            _hashCode += getIe().hashCode();
        }
        if (getCnpj() != null) {
            _hashCode += getCnpj().hashCode();
        }
        if (getCpf() != null) {
            _hashCode += getCpf().hashCode();
        }
        if (getDmSitContr() != null) {
            _hashCode += getDmSitContr().hashCode();
        }
        if (getDmIndContrNfe() != null) {
            _hashCode += getDmIndContrNfe().hashCode();
        }
        if (getDmIndContrCte() != null) {
            _hashCode += getDmIndContrCte().hashCode();
        }
        if (getNome() != null) {
            _hashCode += getNome().hashCode();
        }
        if (getFant() != null) {
            _hashCode += getFant().hashCode();
        }
        if (getRegApur() != null) {
            _hashCode += getRegApur().hashCode();
        }
        if (getCnae() != null) {
            _hashCode += getCnae().hashCode();
        }
        if (getDtIniAtiv() != null) {
            _hashCode += getDtIniAtiv().hashCode();
        }
        if (getDtUltSit() != null) {
            _hashCode += getDtUltSit().hashCode();
        }
        if (getDtBaixa() != null) {
            _hashCode += getDtBaixa().hashCode();
        }
        if (getIeUnica() != null) {
            _hashCode += getIeUnica().hashCode();
        }
        if (getIeAtual() != null) {
            _hashCode += getIeAtual().hashCode();
        }
        if (getLograd() != null) {
            _hashCode += getLograd().hashCode();
        }
        if (getNro() != null) {
            _hashCode += getNro().hashCode();
        }
        if (getCompl() != null) {
            _hashCode += getCompl().hashCode();
        }
        if (getBairro() != null) {
            _hashCode += getBairro().hashCode();
        }
        if (getIbgeCidade() != null) {
            _hashCode += getIbgeCidade().hashCode();
        }
        if (getDescrCidade() != null) {
            _hashCode += getDescrCidade().hashCode();
        }
        if (getCep() != null) {
            _hashCode += getCep().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RetInfConsCad.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "retInfConsCad"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idIntegr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "idIntegr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("siglaEstado");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "siglaEstado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ie");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "ie"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cnpj");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "cnpj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpf");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "cpf"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dmSitContr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "dmSitContr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "tpDominio"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dmIndContrNfe");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "dmIndContrNfe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "tpDominio"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dmIndContrCte");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "dmIndContrCte"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "tpDominio"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nome");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "nome"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fant");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "fant"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regApur");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "regApur"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cnae");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "cnae"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dtIniAtiv");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "dtIniAtiv"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dtUltSit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "dtUltSit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dtBaixa");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "dtBaixa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ieUnica");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "ieUnica"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ieAtual");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "ieAtual"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lograd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "lograd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nro");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "nro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("compl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "compl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bairro");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "bairro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ibgeCidade");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "ibgeCidade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descrCidade");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "descrCidade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cep");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/consultaGenerica", "cep"));
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
