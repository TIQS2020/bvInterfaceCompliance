/**
 * TpTransp.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil;

public class TpTransp  implements java.io.Serializable {
    private org.apache.axis.types.NonNegativeInteger dmModFrete;

    private br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.TpCpfCnpj cpfCnpj;

    private java.lang.String codPartTransp;

    private java.lang.String nome;

    private java.lang.String ie;

    private java.lang.String ender;

    private java.lang.String cidade;

    private java.lang.String cidadeIbge;

    private java.lang.String uf;

    private java.math.BigDecimal vlServ;

    private java.math.BigDecimal vlBaseCalcRet;

    private java.math.BigDecimal aliqIcmsRet;

    private java.math.BigDecimal vlIcmsRet;

    private org.apache.axis.types.NonNegativeInteger cfop;

    private java.lang.String cpfMotorista;

    private java.lang.String nomeMotorista;

    private br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpVeiculo[] veiculo;

    private br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpVolume[] volume;

    public TpTransp() {
    }

    public TpTransp(
           org.apache.axis.types.NonNegativeInteger dmModFrete,
           br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.TpCpfCnpj cpfCnpj,
           java.lang.String codPartTransp,
           java.lang.String nome,
           java.lang.String ie,
           java.lang.String ender,
           java.lang.String cidade,
           java.lang.String cidadeIbge,
           java.lang.String uf,
           java.math.BigDecimal vlServ,
           java.math.BigDecimal vlBaseCalcRet,
           java.math.BigDecimal aliqIcmsRet,
           java.math.BigDecimal vlIcmsRet,
           org.apache.axis.types.NonNegativeInteger cfop,
           java.lang.String cpfMotorista,
           java.lang.String nomeMotorista,
           br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpVeiculo[] veiculo,
           br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpVolume[] volume) {
           this.dmModFrete = dmModFrete;
           this.cpfCnpj = cpfCnpj;
           this.codPartTransp = codPartTransp;
           this.nome = nome;
           this.ie = ie;
           this.ender = ender;
           this.cidade = cidade;
           this.cidadeIbge = cidadeIbge;
           this.uf = uf;
           this.vlServ = vlServ;
           this.vlBaseCalcRet = vlBaseCalcRet;
           this.aliqIcmsRet = aliqIcmsRet;
           this.vlIcmsRet = vlIcmsRet;
           this.cfop = cfop;
           this.cpfMotorista = cpfMotorista;
           this.nomeMotorista = nomeMotorista;
           this.veiculo = veiculo;
           this.volume = volume;
    }


    /**
     * Gets the dmModFrete value for this TpTransp.
     * 
     * @return dmModFrete
     */
    public org.apache.axis.types.NonNegativeInteger getDmModFrete() {
        return dmModFrete;
    }


    /**
     * Sets the dmModFrete value for this TpTransp.
     * 
     * @param dmModFrete
     */
    public void setDmModFrete(org.apache.axis.types.NonNegativeInteger dmModFrete) {
        this.dmModFrete = dmModFrete;
    }


    /**
     * Gets the cpfCnpj value for this TpTransp.
     * 
     * @return cpfCnpj
     */
    public br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.TpCpfCnpj getCpfCnpj() {
        return cpfCnpj;
    }


    /**
     * Sets the cpfCnpj value for this TpTransp.
     * 
     * @param cpfCnpj
     */
    public void setCpfCnpj(br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.TpCpfCnpj cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }


    /**
     * Gets the codPartTransp value for this TpTransp.
     * 
     * @return codPartTransp
     */
    public java.lang.String getCodPartTransp() {
        return codPartTransp;
    }


    /**
     * Sets the codPartTransp value for this TpTransp.
     * 
     * @param codPartTransp
     */
    public void setCodPartTransp(java.lang.String codPartTransp) {
        this.codPartTransp = codPartTransp;
    }


    /**
     * Gets the nome value for this TpTransp.
     * 
     * @return nome
     */
    public java.lang.String getNome() {
        return nome;
    }


    /**
     * Sets the nome value for this TpTransp.
     * 
     * @param nome
     */
    public void setNome(java.lang.String nome) {
        this.nome = nome;
    }


    /**
     * Gets the ie value for this TpTransp.
     * 
     * @return ie
     */
    public java.lang.String getIe() {
        return ie;
    }


    /**
     * Sets the ie value for this TpTransp.
     * 
     * @param ie
     */
    public void setIe(java.lang.String ie) {
        this.ie = ie;
    }


    /**
     * Gets the ender value for this TpTransp.
     * 
     * @return ender
     */
    public java.lang.String getEnder() {
        return ender;
    }


    /**
     * Sets the ender value for this TpTransp.
     * 
     * @param ender
     */
    public void setEnder(java.lang.String ender) {
        this.ender = ender;
    }


    /**
     * Gets the cidade value for this TpTransp.
     * 
     * @return cidade
     */
    public java.lang.String getCidade() {
        return cidade;
    }


    /**
     * Sets the cidade value for this TpTransp.
     * 
     * @param cidade
     */
    public void setCidade(java.lang.String cidade) {
        this.cidade = cidade;
    }


    /**
     * Gets the cidadeIbge value for this TpTransp.
     * 
     * @return cidadeIbge
     */
    public java.lang.String getCidadeIbge() {
        return cidadeIbge;
    }


    /**
     * Sets the cidadeIbge value for this TpTransp.
     * 
     * @param cidadeIbge
     */
    public void setCidadeIbge(java.lang.String cidadeIbge) {
        this.cidadeIbge = cidadeIbge;
    }


    /**
     * Gets the uf value for this TpTransp.
     * 
     * @return uf
     */
    public java.lang.String getUf() {
        return uf;
    }


    /**
     * Sets the uf value for this TpTransp.
     * 
     * @param uf
     */
    public void setUf(java.lang.String uf) {
        this.uf = uf;
    }


    /**
     * Gets the vlServ value for this TpTransp.
     * 
     * @return vlServ
     */
    public java.math.BigDecimal getVlServ() {
        return vlServ;
    }


    /**
     * Sets the vlServ value for this TpTransp.
     * 
     * @param vlServ
     */
    public void setVlServ(java.math.BigDecimal vlServ) {
        this.vlServ = vlServ;
    }


    /**
     * Gets the vlBaseCalcRet value for this TpTransp.
     * 
     * @return vlBaseCalcRet
     */
    public java.math.BigDecimal getVlBaseCalcRet() {
        return vlBaseCalcRet;
    }


    /**
     * Sets the vlBaseCalcRet value for this TpTransp.
     * 
     * @param vlBaseCalcRet
     */
    public void setVlBaseCalcRet(java.math.BigDecimal vlBaseCalcRet) {
        this.vlBaseCalcRet = vlBaseCalcRet;
    }


    /**
     * Gets the aliqIcmsRet value for this TpTransp.
     * 
     * @return aliqIcmsRet
     */
    public java.math.BigDecimal getAliqIcmsRet() {
        return aliqIcmsRet;
    }


    /**
     * Sets the aliqIcmsRet value for this TpTransp.
     * 
     * @param aliqIcmsRet
     */
    public void setAliqIcmsRet(java.math.BigDecimal aliqIcmsRet) {
        this.aliqIcmsRet = aliqIcmsRet;
    }


    /**
     * Gets the vlIcmsRet value for this TpTransp.
     * 
     * @return vlIcmsRet
     */
    public java.math.BigDecimal getVlIcmsRet() {
        return vlIcmsRet;
    }


    /**
     * Sets the vlIcmsRet value for this TpTransp.
     * 
     * @param vlIcmsRet
     */
    public void setVlIcmsRet(java.math.BigDecimal vlIcmsRet) {
        this.vlIcmsRet = vlIcmsRet;
    }


    /**
     * Gets the cfop value for this TpTransp.
     * 
     * @return cfop
     */
    public org.apache.axis.types.NonNegativeInteger getCfop() {
        return cfop;
    }


    /**
     * Sets the cfop value for this TpTransp.
     * 
     * @param cfop
     */
    public void setCfop(org.apache.axis.types.NonNegativeInteger cfop) {
        this.cfop = cfop;
    }


    /**
     * Gets the cpfMotorista value for this TpTransp.
     * 
     * @return cpfMotorista
     */
    public java.lang.String getCpfMotorista() {
        return cpfMotorista;
    }


    /**
     * Sets the cpfMotorista value for this TpTransp.
     * 
     * @param cpfMotorista
     */
    public void setCpfMotorista(java.lang.String cpfMotorista) {
        this.cpfMotorista = cpfMotorista;
    }


    /**
     * Gets the nomeMotorista value for this TpTransp.
     * 
     * @return nomeMotorista
     */
    public java.lang.String getNomeMotorista() {
        return nomeMotorista;
    }


    /**
     * Sets the nomeMotorista value for this TpTransp.
     * 
     * @param nomeMotorista
     */
    public void setNomeMotorista(java.lang.String nomeMotorista) {
        this.nomeMotorista = nomeMotorista;
    }


    /**
     * Gets the veiculo value for this TpTransp.
     * 
     * @return veiculo
     */
    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpVeiculo[] getVeiculo() {
        return veiculo;
    }


    /**
     * Sets the veiculo value for this TpTransp.
     * 
     * @param veiculo
     */
    public void setVeiculo(br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpVeiculo[] veiculo) {
        this.veiculo = veiculo;
    }

    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpVeiculo getVeiculo(int i) {
        return this.veiculo[i];
    }

    public void setVeiculo(int i, br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpVeiculo _value) {
        this.veiculo[i] = _value;
    }


    /**
     * Gets the volume value for this TpTransp.
     * 
     * @return volume
     */
    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpVolume[] getVolume() {
        return volume;
    }


    /**
     * Sets the volume value for this TpTransp.
     * 
     * @param volume
     */
    public void setVolume(br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpVolume[] volume) {
        this.volume = volume;
    }

    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpVolume getVolume(int i) {
        return this.volume[i];
    }

    public void setVolume(int i, br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpVolume _value) {
        this.volume[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TpTransp)) return false;
        TpTransp other = (TpTransp) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dmModFrete==null && other.getDmModFrete()==null) || 
             (this.dmModFrete!=null &&
              this.dmModFrete.equals(other.getDmModFrete()))) &&
            ((this.cpfCnpj==null && other.getCpfCnpj()==null) || 
             (this.cpfCnpj!=null &&
              this.cpfCnpj.equals(other.getCpfCnpj()))) &&
            ((this.codPartTransp==null && other.getCodPartTransp()==null) || 
             (this.codPartTransp!=null &&
              this.codPartTransp.equals(other.getCodPartTransp()))) &&
            ((this.nome==null && other.getNome()==null) || 
             (this.nome!=null &&
              this.nome.equals(other.getNome()))) &&
            ((this.ie==null && other.getIe()==null) || 
             (this.ie!=null &&
              this.ie.equals(other.getIe()))) &&
            ((this.ender==null && other.getEnder()==null) || 
             (this.ender!=null &&
              this.ender.equals(other.getEnder()))) &&
            ((this.cidade==null && other.getCidade()==null) || 
             (this.cidade!=null &&
              this.cidade.equals(other.getCidade()))) &&
            ((this.cidadeIbge==null && other.getCidadeIbge()==null) || 
             (this.cidadeIbge!=null &&
              this.cidadeIbge.equals(other.getCidadeIbge()))) &&
            ((this.uf==null && other.getUf()==null) || 
             (this.uf!=null &&
              this.uf.equals(other.getUf()))) &&
            ((this.vlServ==null && other.getVlServ()==null) || 
             (this.vlServ!=null &&
              this.vlServ.equals(other.getVlServ()))) &&
            ((this.vlBaseCalcRet==null && other.getVlBaseCalcRet()==null) || 
             (this.vlBaseCalcRet!=null &&
              this.vlBaseCalcRet.equals(other.getVlBaseCalcRet()))) &&
            ((this.aliqIcmsRet==null && other.getAliqIcmsRet()==null) || 
             (this.aliqIcmsRet!=null &&
              this.aliqIcmsRet.equals(other.getAliqIcmsRet()))) &&
            ((this.vlIcmsRet==null && other.getVlIcmsRet()==null) || 
             (this.vlIcmsRet!=null &&
              this.vlIcmsRet.equals(other.getVlIcmsRet()))) &&
            ((this.cfop==null && other.getCfop()==null) || 
             (this.cfop!=null &&
              this.cfop.equals(other.getCfop()))) &&
            ((this.cpfMotorista==null && other.getCpfMotorista()==null) || 
             (this.cpfMotorista!=null &&
              this.cpfMotorista.equals(other.getCpfMotorista()))) &&
            ((this.nomeMotorista==null && other.getNomeMotorista()==null) || 
             (this.nomeMotorista!=null &&
              this.nomeMotorista.equals(other.getNomeMotorista()))) &&
            ((this.veiculo==null && other.getVeiculo()==null) || 
             (this.veiculo!=null &&
              java.util.Arrays.equals(this.veiculo, other.getVeiculo()))) &&
            ((this.volume==null && other.getVolume()==null) || 
             (this.volume!=null &&
              java.util.Arrays.equals(this.volume, other.getVolume())));
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
        if (getDmModFrete() != null) {
            _hashCode += getDmModFrete().hashCode();
        }
        if (getCpfCnpj() != null) {
            _hashCode += getCpfCnpj().hashCode();
        }
        if (getCodPartTransp() != null) {
            _hashCode += getCodPartTransp().hashCode();
        }
        if (getNome() != null) {
            _hashCode += getNome().hashCode();
        }
        if (getIe() != null) {
            _hashCode += getIe().hashCode();
        }
        if (getEnder() != null) {
            _hashCode += getEnder().hashCode();
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
        if (getVlServ() != null) {
            _hashCode += getVlServ().hashCode();
        }
        if (getVlBaseCalcRet() != null) {
            _hashCode += getVlBaseCalcRet().hashCode();
        }
        if (getAliqIcmsRet() != null) {
            _hashCode += getAliqIcmsRet().hashCode();
        }
        if (getVlIcmsRet() != null) {
            _hashCode += getVlIcmsRet().hashCode();
        }
        if (getCfop() != null) {
            _hashCode += getCfop().hashCode();
        }
        if (getCpfMotorista() != null) {
            _hashCode += getCpfMotorista().hashCode();
        }
        if (getNomeMotorista() != null) {
            _hashCode += getNomeMotorista().hashCode();
        }
        if (getVeiculo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVeiculo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVeiculo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVolume() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVolume());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVolume(), i);
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
        new org.apache.axis.description.TypeDesc(TpTransp.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "tpTransp"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dmModFrete");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "dmModFrete"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "tpDominio"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpfCnpj");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "cpfCnpj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "tpCpfCnpj"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codPartTransp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "codPartTransp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nome");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "nome"));
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
        elemField.setFieldName("ender");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "ender"));
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
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uf");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "uf"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlServ");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "vlServ"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlBaseCalcRet");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "vlBaseCalcRet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aliqIcmsRet");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "aliqIcmsRet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlIcmsRet");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "vlIcmsRet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cfop");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "cfop"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpfMotorista");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "cpfMotorista"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomeMotorista");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "NomeMotorista"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("veiculo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "veiculo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "tpVeiculo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("volume");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "volume"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "tpVolume"));
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
