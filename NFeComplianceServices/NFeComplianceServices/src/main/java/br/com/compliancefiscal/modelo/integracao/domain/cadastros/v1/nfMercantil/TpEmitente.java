/**
 * TpEmitente.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil;

public class TpEmitente  implements java.io.Serializable {
    private br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.TpCpfCnpj cpfCnpj;

    private java.lang.String nome;

    private java.lang.String fantasia;

    private java.lang.String lograd;

    private java.lang.String nro;

    private java.lang.String compl;

    private java.lang.String bairro;

    private java.lang.String cidade;

    private java.lang.String cidadeIbge;

    private java.lang.String uf;

    private java.math.BigInteger cep;

    private java.math.BigInteger codSiscomexPais;

    private java.lang.String pais;

    private java.lang.String fone;

    private java.lang.String ie;

    private java.lang.String ieSt;

    private java.lang.String im;

    private java.lang.String cnae;

    private org.apache.axis.types.NonNegativeInteger dmRegTribNf;

    private java.lang.String suframa;

    private java.math.BigInteger dmIndIePart;

    public TpEmitente() {
    }

    public TpEmitente(
           br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.TpCpfCnpj cpfCnpj,
           java.lang.String nome,
           java.lang.String fantasia,
           java.lang.String lograd,
           java.lang.String nro,
           java.lang.String compl,
           java.lang.String bairro,
           java.lang.String cidade,
           java.lang.String cidadeIbge,
           java.lang.String uf,
           java.math.BigInteger cep,
           java.math.BigInteger codSiscomexPais,
           java.lang.String pais,
           java.lang.String fone,
           java.lang.String ie,
           java.lang.String ieSt,
           java.lang.String im,
           java.lang.String cnae,
           org.apache.axis.types.NonNegativeInteger dmRegTribNf,
           java.lang.String suframa,
           java.math.BigInteger dmIndIePart) {
           this.cpfCnpj = cpfCnpj;
           this.nome = nome;
           this.fantasia = fantasia;
           this.lograd = lograd;
           this.nro = nro;
           this.compl = compl;
           this.bairro = bairro;
           this.cidade = cidade;
           this.cidadeIbge = cidadeIbge;
           this.uf = uf;
           this.cep = cep;
           this.codSiscomexPais = codSiscomexPais;
           this.pais = pais;
           this.fone = fone;
           this.ie = ie;
           this.ieSt = ieSt;
           this.im = im;
           this.cnae = cnae;
           this.dmRegTribNf = dmRegTribNf;
           this.suframa = suframa;
           this.dmIndIePart = dmIndIePart;
    }


    /**
     * Gets the cpfCnpj value for this TpEmitente.
     * 
     * @return cpfCnpj
     */
    public br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.TpCpfCnpj getCpfCnpj() {
        return cpfCnpj;
    }


    /**
     * Sets the cpfCnpj value for this TpEmitente.
     * 
     * @param cpfCnpj
     */
    public void setCpfCnpj(br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.TpCpfCnpj cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }


    /**
     * Gets the nome value for this TpEmitente.
     * 
     * @return nome
     */
    public java.lang.String getNome() {
        return nome;
    }


    /**
     * Sets the nome value for this TpEmitente.
     * 
     * @param nome
     */
    public void setNome(java.lang.String nome) {
        this.nome = nome;
    }


    /**
     * Gets the fantasia value for this TpEmitente.
     * 
     * @return fantasia
     */
    public java.lang.String getFantasia() {
        return fantasia;
    }


    /**
     * Sets the fantasia value for this TpEmitente.
     * 
     * @param fantasia
     */
    public void setFantasia(java.lang.String fantasia) {
        this.fantasia = fantasia;
    }


    /**
     * Gets the lograd value for this TpEmitente.
     * 
     * @return lograd
     */
    public java.lang.String getLograd() {
        return lograd;
    }


    /**
     * Sets the lograd value for this TpEmitente.
     * 
     * @param lograd
     */
    public void setLograd(java.lang.String lograd) {
        this.lograd = lograd;
    }


    /**
     * Gets the nro value for this TpEmitente.
     * 
     * @return nro
     */
    public java.lang.String getNro() {
        return nro;
    }


    /**
     * Sets the nro value for this TpEmitente.
     * 
     * @param nro
     */
    public void setNro(java.lang.String nro) {
        this.nro = nro;
    }


    /**
     * Gets the compl value for this TpEmitente.
     * 
     * @return compl
     */
    public java.lang.String getCompl() {
        return compl;
    }


    /**
     * Sets the compl value for this TpEmitente.
     * 
     * @param compl
     */
    public void setCompl(java.lang.String compl) {
        this.compl = compl;
    }


    /**
     * Gets the bairro value for this TpEmitente.
     * 
     * @return bairro
     */
    public java.lang.String getBairro() {
        return bairro;
    }


    /**
     * Sets the bairro value for this TpEmitente.
     * 
     * @param bairro
     */
    public void setBairro(java.lang.String bairro) {
        this.bairro = bairro;
    }


    /**
     * Gets the cidade value for this TpEmitente.
     * 
     * @return cidade
     */
    public java.lang.String getCidade() {
        return cidade;
    }


    /**
     * Sets the cidade value for this TpEmitente.
     * 
     * @param cidade
     */
    public void setCidade(java.lang.String cidade) {
        this.cidade = cidade;
    }


    /**
     * Gets the cidadeIbge value for this TpEmitente.
     * 
     * @return cidadeIbge
     */
    public java.lang.String getCidadeIbge() {
        return cidadeIbge;
    }


    /**
     * Sets the cidadeIbge value for this TpEmitente.
     * 
     * @param cidadeIbge
     */
    public void setCidadeIbge(java.lang.String cidadeIbge) {
        this.cidadeIbge = cidadeIbge;
    }


    /**
     * Gets the uf value for this TpEmitente.
     * 
     * @return uf
     */
    public java.lang.String getUf() {
        return uf;
    }


    /**
     * Sets the uf value for this TpEmitente.
     * 
     * @param uf
     */
    public void setUf(java.lang.String uf) {
        this.uf = uf;
    }


    /**
     * Gets the cep value for this TpEmitente.
     * 
     * @return cep
     */
    public java.math.BigInteger getCep() {
        return cep;
    }


    /**
     * Sets the cep value for this TpEmitente.
     * 
     * @param cep
     */
    public void setCep(java.math.BigInteger cep) {
        this.cep = cep;
    }


    /**
     * Gets the codSiscomexPais value for this TpEmitente.
     * 
     * @return codSiscomexPais
     */
    public java.math.BigInteger getCodSiscomexPais() {
        return codSiscomexPais;
    }


    /**
     * Sets the codSiscomexPais value for this TpEmitente.
     * 
     * @param codSiscomexPais
     */
    public void setCodSiscomexPais(java.math.BigInteger codSiscomexPais) {
        this.codSiscomexPais = codSiscomexPais;
    }


    /**
     * Gets the pais value for this TpEmitente.
     * 
     * @return pais
     */
    public java.lang.String getPais() {
        return pais;
    }


    /**
     * Sets the pais value for this TpEmitente.
     * 
     * @param pais
     */
    public void setPais(java.lang.String pais) {
        this.pais = pais;
    }


    /**
     * Gets the fone value for this TpEmitente.
     * 
     * @return fone
     */
    public java.lang.String getFone() {
        return fone;
    }


    /**
     * Sets the fone value for this TpEmitente.
     * 
     * @param fone
     */
    public void setFone(java.lang.String fone) {
        this.fone = fone;
    }


    /**
     * Gets the ie value for this TpEmitente.
     * 
     * @return ie
     */
    public java.lang.String getIe() {
        return ie;
    }


    /**
     * Sets the ie value for this TpEmitente.
     * 
     * @param ie
     */
    public void setIe(java.lang.String ie) {
        this.ie = ie;
    }


    /**
     * Gets the ieSt value for this TpEmitente.
     * 
     * @return ieSt
     */
    public java.lang.String getIeSt() {
        return ieSt;
    }


    /**
     * Sets the ieSt value for this TpEmitente.
     * 
     * @param ieSt
     */
    public void setIeSt(java.lang.String ieSt) {
        this.ieSt = ieSt;
    }


    /**
     * Gets the im value for this TpEmitente.
     * 
     * @return im
     */
    public java.lang.String getIm() {
        return im;
    }


    /**
     * Sets the im value for this TpEmitente.
     * 
     * @param im
     */
    public void setIm(java.lang.String im) {
        this.im = im;
    }


    /**
     * Gets the cnae value for this TpEmitente.
     * 
     * @return cnae
     */
    public java.lang.String getCnae() {
        return cnae;
    }


    /**
     * Sets the cnae value for this TpEmitente.
     * 
     * @param cnae
     */
    public void setCnae(java.lang.String cnae) {
        this.cnae = cnae;
    }


    /**
     * Gets the dmRegTribNf value for this TpEmitente.
     * 
     * @return dmRegTribNf
     */
    public org.apache.axis.types.NonNegativeInteger getDmRegTribNf() {
        return dmRegTribNf;
    }


    /**
     * Sets the dmRegTribNf value for this TpEmitente.
     * 
     * @param dmRegTribNf
     */
    public void setDmRegTribNf(org.apache.axis.types.NonNegativeInteger dmRegTribNf) {
        this.dmRegTribNf = dmRegTribNf;
    }


    /**
     * Gets the suframa value for this TpEmitente.
     * 
     * @return suframa
     */
    public java.lang.String getSuframa() {
        return suframa;
    }


    /**
     * Sets the suframa value for this TpEmitente.
     * 
     * @param suframa
     */
    public void setSuframa(java.lang.String suframa) {
        this.suframa = suframa;
    }


    /**
     * Gets the dmIndIePart value for this TpEmitente.
     * 
     * @return dmIndIePart
     */
    public java.math.BigInteger getDmIndIePart() {
        return dmIndIePart;
    }


    /**
     * Sets the dmIndIePart value for this TpEmitente.
     * 
     * @param dmIndIePart
     */
    public void setDmIndIePart(java.math.BigInteger dmIndIePart) {
        this.dmIndIePart = dmIndIePart;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TpEmitente)) return false;
        TpEmitente other = (TpEmitente) obj;
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
            ((this.nome==null && other.getNome()==null) || 
             (this.nome!=null &&
              this.nome.equals(other.getNome()))) &&
            ((this.fantasia==null && other.getFantasia()==null) || 
             (this.fantasia!=null &&
              this.fantasia.equals(other.getFantasia()))) &&
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
            ((this.cidade==null && other.getCidade()==null) || 
             (this.cidade!=null &&
              this.cidade.equals(other.getCidade()))) &&
            ((this.cidadeIbge==null && other.getCidadeIbge()==null) || 
             (this.cidadeIbge!=null &&
              this.cidadeIbge.equals(other.getCidadeIbge()))) &&
            ((this.uf==null && other.getUf()==null) || 
             (this.uf!=null &&
              this.uf.equals(other.getUf()))) &&
            ((this.cep==null && other.getCep()==null) || 
             (this.cep!=null &&
              this.cep.equals(other.getCep()))) &&
            ((this.codSiscomexPais==null && other.getCodSiscomexPais()==null) || 
             (this.codSiscomexPais!=null &&
              this.codSiscomexPais.equals(other.getCodSiscomexPais()))) &&
            ((this.pais==null && other.getPais()==null) || 
             (this.pais!=null &&
              this.pais.equals(other.getPais()))) &&
            ((this.fone==null && other.getFone()==null) || 
             (this.fone!=null &&
              this.fone.equals(other.getFone()))) &&
            ((this.ie==null && other.getIe()==null) || 
             (this.ie!=null &&
              this.ie.equals(other.getIe()))) &&
            ((this.ieSt==null && other.getIeSt()==null) || 
             (this.ieSt!=null &&
              this.ieSt.equals(other.getIeSt()))) &&
            ((this.im==null && other.getIm()==null) || 
             (this.im!=null &&
              this.im.equals(other.getIm()))) &&
            ((this.cnae==null && other.getCnae()==null) || 
             (this.cnae!=null &&
              this.cnae.equals(other.getCnae()))) &&
            ((this.dmRegTribNf==null && other.getDmRegTribNf()==null) || 
             (this.dmRegTribNf!=null &&
              this.dmRegTribNf.equals(other.getDmRegTribNf()))) &&
            ((this.suframa==null && other.getSuframa()==null) || 
             (this.suframa!=null &&
              this.suframa.equals(other.getSuframa()))) &&
            ((this.dmIndIePart==null && other.getDmIndIePart()==null) || 
             (this.dmIndIePart!=null &&
              this.dmIndIePart.equals(other.getDmIndIePart())));
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
        if (getNome() != null) {
            _hashCode += getNome().hashCode();
        }
        if (getFantasia() != null) {
            _hashCode += getFantasia().hashCode();
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
        if (getCidade() != null) {
            _hashCode += getCidade().hashCode();
        }
        if (getCidadeIbge() != null) {
            _hashCode += getCidadeIbge().hashCode();
        }
        if (getUf() != null) {
            _hashCode += getUf().hashCode();
        }
        if (getCep() != null) {
            _hashCode += getCep().hashCode();
        }
        if (getCodSiscomexPais() != null) {
            _hashCode += getCodSiscomexPais().hashCode();
        }
        if (getPais() != null) {
            _hashCode += getPais().hashCode();
        }
        if (getFone() != null) {
            _hashCode += getFone().hashCode();
        }
        if (getIe() != null) {
            _hashCode += getIe().hashCode();
        }
        if (getIeSt() != null) {
            _hashCode += getIeSt().hashCode();
        }
        if (getIm() != null) {
            _hashCode += getIm().hashCode();
        }
        if (getCnae() != null) {
            _hashCode += getCnae().hashCode();
        }
        if (getDmRegTribNf() != null) {
            _hashCode += getDmRegTribNf().hashCode();
        }
        if (getSuframa() != null) {
            _hashCode += getSuframa().hashCode();
        }
        if (getDmIndIePart() != null) {
            _hashCode += getDmIndIePart().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TpEmitente.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "tpEmitente"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpfCnpj");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "cpfCnpj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "tpCpfCnpj"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nome");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "nome"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fantasia");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "fantasia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lograd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "lograd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nro");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "nro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("compl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "compl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bairro");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "bairro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cidade");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "cidade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cidadeIbge");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "cidadeIbge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uf");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "uf"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cep");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "cep"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codSiscomexPais");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "codSiscomexPais"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pais");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "pais"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "fone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ie");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "ie"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ieSt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "ieSt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("im");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "im"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cnae");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "cnae"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dmRegTribNf");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "dmRegTribNf"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "tpDominio"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("suframa");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "suframa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dmIndIePart");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "dmIndIePart"));
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
