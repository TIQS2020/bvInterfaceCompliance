/**
 * TpRegImpostoIcms.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServCont;

public class TpRegImpostoIcms  implements java.io.Serializable {
    private java.lang.String codStIcms;

    private org.apache.axis.types.NonNegativeInteger cfop;

    private java.math.BigInteger dmOrigMerc;

    private java.lang.String codObsLanctoFiscal;

    private java.math.BigDecimal vlOper;

    private java.math.BigDecimal aliquota;

    private java.math.BigDecimal vlBcIcms;

    private java.math.BigDecimal vlIcms;

    private java.math.BigDecimal vlRedBcIcms;

    private java.math.BigDecimal vlBcIcmsSt;

    private java.math.BigDecimal vlIcmsSt;

    private java.math.BigDecimal vlBaseOutro;

    private java.math.BigDecimal aliquotaOutro;

    private java.math.BigDecimal vlImpOutro;

    private java.math.BigDecimal vlBaseIsenta;

    private java.math.BigDecimal vlFcpIcms;

    private java.math.BigDecimal vlFcpIcmsSt;

    private br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServCont.TpNfRegAnalDifal[] nfRegAnalDifal;

    public TpRegImpostoIcms() {
    }

    public TpRegImpostoIcms(
           java.lang.String codStIcms,
           org.apache.axis.types.NonNegativeInteger cfop,
           java.math.BigInteger dmOrigMerc,
           java.lang.String codObsLanctoFiscal,
           java.math.BigDecimal vlOper,
           java.math.BigDecimal aliquota,
           java.math.BigDecimal vlBcIcms,
           java.math.BigDecimal vlIcms,
           java.math.BigDecimal vlRedBcIcms,
           java.math.BigDecimal vlBcIcmsSt,
           java.math.BigDecimal vlIcmsSt,
           java.math.BigDecimal vlBaseOutro,
           java.math.BigDecimal aliquotaOutro,
           java.math.BigDecimal vlImpOutro,
           java.math.BigDecimal vlBaseIsenta,
           java.math.BigDecimal vlFcpIcms,
           java.math.BigDecimal vlFcpIcmsSt,
           br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServCont.TpNfRegAnalDifal[] nfRegAnalDifal) {
           this.codStIcms = codStIcms;
           this.cfop = cfop;
           this.dmOrigMerc = dmOrigMerc;
           this.codObsLanctoFiscal = codObsLanctoFiscal;
           this.vlOper = vlOper;
           this.aliquota = aliquota;
           this.vlBcIcms = vlBcIcms;
           this.vlIcms = vlIcms;
           this.vlRedBcIcms = vlRedBcIcms;
           this.vlBcIcmsSt = vlBcIcmsSt;
           this.vlIcmsSt = vlIcmsSt;
           this.vlBaseOutro = vlBaseOutro;
           this.aliquotaOutro = aliquotaOutro;
           this.vlImpOutro = vlImpOutro;
           this.vlBaseIsenta = vlBaseIsenta;
           this.vlFcpIcms = vlFcpIcms;
           this.vlFcpIcmsSt = vlFcpIcmsSt;
           this.nfRegAnalDifal = nfRegAnalDifal;
    }


    /**
     * Gets the codStIcms value for this TpRegImpostoIcms.
     * 
     * @return codStIcms
     */
    public java.lang.String getCodStIcms() {
        return codStIcms;
    }


    /**
     * Sets the codStIcms value for this TpRegImpostoIcms.
     * 
     * @param codStIcms
     */
    public void setCodStIcms(java.lang.String codStIcms) {
        this.codStIcms = codStIcms;
    }


    /**
     * Gets the cfop value for this TpRegImpostoIcms.
     * 
     * @return cfop
     */
    public org.apache.axis.types.NonNegativeInteger getCfop() {
        return cfop;
    }


    /**
     * Sets the cfop value for this TpRegImpostoIcms.
     * 
     * @param cfop
     */
    public void setCfop(org.apache.axis.types.NonNegativeInteger cfop) {
        this.cfop = cfop;
    }


    /**
     * Gets the dmOrigMerc value for this TpRegImpostoIcms.
     * 
     * @return dmOrigMerc
     */
    public java.math.BigInteger getDmOrigMerc() {
        return dmOrigMerc;
    }


    /**
     * Sets the dmOrigMerc value for this TpRegImpostoIcms.
     * 
     * @param dmOrigMerc
     */
    public void setDmOrigMerc(java.math.BigInteger dmOrigMerc) {
        this.dmOrigMerc = dmOrigMerc;
    }


    /**
     * Gets the codObsLanctoFiscal value for this TpRegImpostoIcms.
     * 
     * @return codObsLanctoFiscal
     */
    public java.lang.String getCodObsLanctoFiscal() {
        return codObsLanctoFiscal;
    }


    /**
     * Sets the codObsLanctoFiscal value for this TpRegImpostoIcms.
     * 
     * @param codObsLanctoFiscal
     */
    public void setCodObsLanctoFiscal(java.lang.String codObsLanctoFiscal) {
        this.codObsLanctoFiscal = codObsLanctoFiscal;
    }


    /**
     * Gets the vlOper value for this TpRegImpostoIcms.
     * 
     * @return vlOper
     */
    public java.math.BigDecimal getVlOper() {
        return vlOper;
    }


    /**
     * Sets the vlOper value for this TpRegImpostoIcms.
     * 
     * @param vlOper
     */
    public void setVlOper(java.math.BigDecimal vlOper) {
        this.vlOper = vlOper;
    }


    /**
     * Gets the aliquota value for this TpRegImpostoIcms.
     * 
     * @return aliquota
     */
    public java.math.BigDecimal getAliquota() {
        return aliquota;
    }


    /**
     * Sets the aliquota value for this TpRegImpostoIcms.
     * 
     * @param aliquota
     */
    public void setAliquota(java.math.BigDecimal aliquota) {
        this.aliquota = aliquota;
    }


    /**
     * Gets the vlBcIcms value for this TpRegImpostoIcms.
     * 
     * @return vlBcIcms
     */
    public java.math.BigDecimal getVlBcIcms() {
        return vlBcIcms;
    }


    /**
     * Sets the vlBcIcms value for this TpRegImpostoIcms.
     * 
     * @param vlBcIcms
     */
    public void setVlBcIcms(java.math.BigDecimal vlBcIcms) {
        this.vlBcIcms = vlBcIcms;
    }


    /**
     * Gets the vlIcms value for this TpRegImpostoIcms.
     * 
     * @return vlIcms
     */
    public java.math.BigDecimal getVlIcms() {
        return vlIcms;
    }


    /**
     * Sets the vlIcms value for this TpRegImpostoIcms.
     * 
     * @param vlIcms
     */
    public void setVlIcms(java.math.BigDecimal vlIcms) {
        this.vlIcms = vlIcms;
    }


    /**
     * Gets the vlRedBcIcms value for this TpRegImpostoIcms.
     * 
     * @return vlRedBcIcms
     */
    public java.math.BigDecimal getVlRedBcIcms() {
        return vlRedBcIcms;
    }


    /**
     * Sets the vlRedBcIcms value for this TpRegImpostoIcms.
     * 
     * @param vlRedBcIcms
     */
    public void setVlRedBcIcms(java.math.BigDecimal vlRedBcIcms) {
        this.vlRedBcIcms = vlRedBcIcms;
    }


    /**
     * Gets the vlBcIcmsSt value for this TpRegImpostoIcms.
     * 
     * @return vlBcIcmsSt
     */
    public java.math.BigDecimal getVlBcIcmsSt() {
        return vlBcIcmsSt;
    }


    /**
     * Sets the vlBcIcmsSt value for this TpRegImpostoIcms.
     * 
     * @param vlBcIcmsSt
     */
    public void setVlBcIcmsSt(java.math.BigDecimal vlBcIcmsSt) {
        this.vlBcIcmsSt = vlBcIcmsSt;
    }


    /**
     * Gets the vlIcmsSt value for this TpRegImpostoIcms.
     * 
     * @return vlIcmsSt
     */
    public java.math.BigDecimal getVlIcmsSt() {
        return vlIcmsSt;
    }


    /**
     * Sets the vlIcmsSt value for this TpRegImpostoIcms.
     * 
     * @param vlIcmsSt
     */
    public void setVlIcmsSt(java.math.BigDecimal vlIcmsSt) {
        this.vlIcmsSt = vlIcmsSt;
    }


    /**
     * Gets the vlBaseOutro value for this TpRegImpostoIcms.
     * 
     * @return vlBaseOutro
     */
    public java.math.BigDecimal getVlBaseOutro() {
        return vlBaseOutro;
    }


    /**
     * Sets the vlBaseOutro value for this TpRegImpostoIcms.
     * 
     * @param vlBaseOutro
     */
    public void setVlBaseOutro(java.math.BigDecimal vlBaseOutro) {
        this.vlBaseOutro = vlBaseOutro;
    }


    /**
     * Gets the aliquotaOutro value for this TpRegImpostoIcms.
     * 
     * @return aliquotaOutro
     */
    public java.math.BigDecimal getAliquotaOutro() {
        return aliquotaOutro;
    }


    /**
     * Sets the aliquotaOutro value for this TpRegImpostoIcms.
     * 
     * @param aliquotaOutro
     */
    public void setAliquotaOutro(java.math.BigDecimal aliquotaOutro) {
        this.aliquotaOutro = aliquotaOutro;
    }


    /**
     * Gets the vlImpOutro value for this TpRegImpostoIcms.
     * 
     * @return vlImpOutro
     */
    public java.math.BigDecimal getVlImpOutro() {
        return vlImpOutro;
    }


    /**
     * Sets the vlImpOutro value for this TpRegImpostoIcms.
     * 
     * @param vlImpOutro
     */
    public void setVlImpOutro(java.math.BigDecimal vlImpOutro) {
        this.vlImpOutro = vlImpOutro;
    }


    /**
     * Gets the vlBaseIsenta value for this TpRegImpostoIcms.
     * 
     * @return vlBaseIsenta
     */
    public java.math.BigDecimal getVlBaseIsenta() {
        return vlBaseIsenta;
    }


    /**
     * Sets the vlBaseIsenta value for this TpRegImpostoIcms.
     * 
     * @param vlBaseIsenta
     */
    public void setVlBaseIsenta(java.math.BigDecimal vlBaseIsenta) {
        this.vlBaseIsenta = vlBaseIsenta;
    }


    /**
     * Gets the vlFcpIcms value for this TpRegImpostoIcms.
     * 
     * @return vlFcpIcms
     */
    public java.math.BigDecimal getVlFcpIcms() {
        return vlFcpIcms;
    }


    /**
     * Sets the vlFcpIcms value for this TpRegImpostoIcms.
     * 
     * @param vlFcpIcms
     */
    public void setVlFcpIcms(java.math.BigDecimal vlFcpIcms) {
        this.vlFcpIcms = vlFcpIcms;
    }


    /**
     * Gets the vlFcpIcmsSt value for this TpRegImpostoIcms.
     * 
     * @return vlFcpIcmsSt
     */
    public java.math.BigDecimal getVlFcpIcmsSt() {
        return vlFcpIcmsSt;
    }


    /**
     * Sets the vlFcpIcmsSt value for this TpRegImpostoIcms.
     * 
     * @param vlFcpIcmsSt
     */
    public void setVlFcpIcmsSt(java.math.BigDecimal vlFcpIcmsSt) {
        this.vlFcpIcmsSt = vlFcpIcmsSt;
    }


    /**
     * Gets the nfRegAnalDifal value for this TpRegImpostoIcms.
     * 
     * @return nfRegAnalDifal
     */
    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServCont.TpNfRegAnalDifal[] getNfRegAnalDifal() {
        return nfRegAnalDifal;
    }


    /**
     * Sets the nfRegAnalDifal value for this TpRegImpostoIcms.
     * 
     * @param nfRegAnalDifal
     */
    public void setNfRegAnalDifal(br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServCont.TpNfRegAnalDifal[] nfRegAnalDifal) {
        this.nfRegAnalDifal = nfRegAnalDifal;
    }

    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServCont.TpNfRegAnalDifal getNfRegAnalDifal(int i) {
        return this.nfRegAnalDifal[i];
    }

    public void setNfRegAnalDifal(int i, br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServCont.TpNfRegAnalDifal _value) {
        this.nfRegAnalDifal[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TpRegImpostoIcms)) return false;
        TpRegImpostoIcms other = (TpRegImpostoIcms) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codStIcms==null && other.getCodStIcms()==null) || 
             (this.codStIcms!=null &&
              this.codStIcms.equals(other.getCodStIcms()))) &&
            ((this.cfop==null && other.getCfop()==null) || 
             (this.cfop!=null &&
              this.cfop.equals(other.getCfop()))) &&
            ((this.dmOrigMerc==null && other.getDmOrigMerc()==null) || 
             (this.dmOrigMerc!=null &&
              this.dmOrigMerc.equals(other.getDmOrigMerc()))) &&
            ((this.codObsLanctoFiscal==null && other.getCodObsLanctoFiscal()==null) || 
             (this.codObsLanctoFiscal!=null &&
              this.codObsLanctoFiscal.equals(other.getCodObsLanctoFiscal()))) &&
            ((this.vlOper==null && other.getVlOper()==null) || 
             (this.vlOper!=null &&
              this.vlOper.equals(other.getVlOper()))) &&
            ((this.aliquota==null && other.getAliquota()==null) || 
             (this.aliquota!=null &&
              this.aliquota.equals(other.getAliquota()))) &&
            ((this.vlBcIcms==null && other.getVlBcIcms()==null) || 
             (this.vlBcIcms!=null &&
              this.vlBcIcms.equals(other.getVlBcIcms()))) &&
            ((this.vlIcms==null && other.getVlIcms()==null) || 
             (this.vlIcms!=null &&
              this.vlIcms.equals(other.getVlIcms()))) &&
            ((this.vlRedBcIcms==null && other.getVlRedBcIcms()==null) || 
             (this.vlRedBcIcms!=null &&
              this.vlRedBcIcms.equals(other.getVlRedBcIcms()))) &&
            ((this.vlBcIcmsSt==null && other.getVlBcIcmsSt()==null) || 
             (this.vlBcIcmsSt!=null &&
              this.vlBcIcmsSt.equals(other.getVlBcIcmsSt()))) &&
            ((this.vlIcmsSt==null && other.getVlIcmsSt()==null) || 
             (this.vlIcmsSt!=null &&
              this.vlIcmsSt.equals(other.getVlIcmsSt()))) &&
            ((this.vlBaseOutro==null && other.getVlBaseOutro()==null) || 
             (this.vlBaseOutro!=null &&
              this.vlBaseOutro.equals(other.getVlBaseOutro()))) &&
            ((this.aliquotaOutro==null && other.getAliquotaOutro()==null) || 
             (this.aliquotaOutro!=null &&
              this.aliquotaOutro.equals(other.getAliquotaOutro()))) &&
            ((this.vlImpOutro==null && other.getVlImpOutro()==null) || 
             (this.vlImpOutro!=null &&
              this.vlImpOutro.equals(other.getVlImpOutro()))) &&
            ((this.vlBaseIsenta==null && other.getVlBaseIsenta()==null) || 
             (this.vlBaseIsenta!=null &&
              this.vlBaseIsenta.equals(other.getVlBaseIsenta()))) &&
            ((this.vlFcpIcms==null && other.getVlFcpIcms()==null) || 
             (this.vlFcpIcms!=null &&
              this.vlFcpIcms.equals(other.getVlFcpIcms()))) &&
            ((this.vlFcpIcmsSt==null && other.getVlFcpIcmsSt()==null) || 
             (this.vlFcpIcmsSt!=null &&
              this.vlFcpIcmsSt.equals(other.getVlFcpIcmsSt()))) &&
            ((this.nfRegAnalDifal==null && other.getNfRegAnalDifal()==null) || 
             (this.nfRegAnalDifal!=null &&
              java.util.Arrays.equals(this.nfRegAnalDifal, other.getNfRegAnalDifal())));
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
        if (getCodStIcms() != null) {
            _hashCode += getCodStIcms().hashCode();
        }
        if (getCfop() != null) {
            _hashCode += getCfop().hashCode();
        }
        if (getDmOrigMerc() != null) {
            _hashCode += getDmOrigMerc().hashCode();
        }
        if (getCodObsLanctoFiscal() != null) {
            _hashCode += getCodObsLanctoFiscal().hashCode();
        }
        if (getVlOper() != null) {
            _hashCode += getVlOper().hashCode();
        }
        if (getAliquota() != null) {
            _hashCode += getAliquota().hashCode();
        }
        if (getVlBcIcms() != null) {
            _hashCode += getVlBcIcms().hashCode();
        }
        if (getVlIcms() != null) {
            _hashCode += getVlIcms().hashCode();
        }
        if (getVlRedBcIcms() != null) {
            _hashCode += getVlRedBcIcms().hashCode();
        }
        if (getVlBcIcmsSt() != null) {
            _hashCode += getVlBcIcmsSt().hashCode();
        }
        if (getVlIcmsSt() != null) {
            _hashCode += getVlIcmsSt().hashCode();
        }
        if (getVlBaseOutro() != null) {
            _hashCode += getVlBaseOutro().hashCode();
        }
        if (getAliquotaOutro() != null) {
            _hashCode += getAliquotaOutro().hashCode();
        }
        if (getVlImpOutro() != null) {
            _hashCode += getVlImpOutro().hashCode();
        }
        if (getVlBaseIsenta() != null) {
            _hashCode += getVlBaseIsenta().hashCode();
        }
        if (getVlFcpIcms() != null) {
            _hashCode += getVlFcpIcms().hashCode();
        }
        if (getVlFcpIcmsSt() != null) {
            _hashCode += getVlFcpIcmsSt().hashCode();
        }
        if (getNfRegAnalDifal() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNfRegAnalDifal());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNfRegAnalDifal(), i);
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
        new org.apache.axis.description.TypeDesc(TpRegImpostoIcms.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServCont", "tpRegImpostoIcms"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codStIcms");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServCont", "codStIcms"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cfop");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServCont", "cfop"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dmOrigMerc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServCont", "dmOrigMerc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codObsLanctoFiscal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServCont", "codObsLanctoFiscal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlOper");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServCont", "vlOper"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aliquota");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServCont", "aliquota"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlBcIcms");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServCont", "vlBcIcms"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlIcms");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServCont", "vlIcms"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlRedBcIcms");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServCont", "vlRedBcIcms"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlBcIcmsSt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServCont", "vlBcIcmsSt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlIcmsSt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServCont", "vlIcmsSt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlBaseOutro");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServCont", "vlBaseOutro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aliquotaOutro");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServCont", "aliquotaOutro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlImpOutro");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServCont", "vlImpOutro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlBaseIsenta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServCont", "vlBaseIsenta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlFcpIcms");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServCont", "vlFcpIcms"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlFcpIcmsSt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServCont", "vlFcpIcmsSt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nfRegAnalDifal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServCont", "nfRegAnalDifal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfServCont", "tpNfRegAnalDifal"));
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
