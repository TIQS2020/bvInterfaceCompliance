/**
 * TpDecImpor.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil;

public class TpDecImpor  implements java.io.Serializable {
    private java.lang.String nroDi;

    private java.util.Date dtDi;

    private java.lang.String localDesemb;

    private java.lang.String ufDesemb;

    private java.util.Date dtDesemb;

    private java.lang.String codPartExport;

    private org.apache.axis.types.NonNegativeInteger dmCodDocImp;

    private java.lang.String numAcdraw;

    private org.apache.axis.types.NonNegativeInteger dmTpViaTransp;

    private java.math.BigDecimal vlVafrmm;

    private org.apache.axis.types.NonNegativeInteger dmTpIntermedio;

    private java.lang.String cnpj;

    private java.lang.String ufTerceiro;

    private br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpAdicaoDecImpor[] adicaoDecImpor;

    public TpDecImpor() {
    }

    public TpDecImpor(
           java.lang.String nroDi,
           java.util.Date dtDi,
           java.lang.String localDesemb,
           java.lang.String ufDesemb,
           java.util.Date dtDesemb,
           java.lang.String codPartExport,
           org.apache.axis.types.NonNegativeInteger dmCodDocImp,
           java.lang.String numAcdraw,
           org.apache.axis.types.NonNegativeInteger dmTpViaTransp,
           java.math.BigDecimal vlVafrmm,
           org.apache.axis.types.NonNegativeInteger dmTpIntermedio,
           java.lang.String cnpj,
           java.lang.String ufTerceiro,
           br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpAdicaoDecImpor[] adicaoDecImpor) {
           this.nroDi = nroDi;
           this.dtDi = dtDi;
           this.localDesemb = localDesemb;
           this.ufDesemb = ufDesemb;
           this.dtDesemb = dtDesemb;
           this.codPartExport = codPartExport;
           this.dmCodDocImp = dmCodDocImp;
           this.numAcdraw = numAcdraw;
           this.dmTpViaTransp = dmTpViaTransp;
           this.vlVafrmm = vlVafrmm;
           this.dmTpIntermedio = dmTpIntermedio;
           this.cnpj = cnpj;
           this.ufTerceiro = ufTerceiro;
           this.adicaoDecImpor = adicaoDecImpor;
    }


    /**
     * Gets the nroDi value for this TpDecImpor.
     * 
     * @return nroDi
     */
    public java.lang.String getNroDi() {
        return nroDi;
    }


    /**
     * Sets the nroDi value for this TpDecImpor.
     * 
     * @param nroDi
     */
    public void setNroDi(java.lang.String nroDi) {
        this.nroDi = nroDi;
    }


    /**
     * Gets the dtDi value for this TpDecImpor.
     * 
     * @return dtDi
     */
    public java.util.Date getDtDi() {
        return dtDi;
    }


    /**
     * Sets the dtDi value for this TpDecImpor.
     * 
     * @param dtDi
     */
    public void setDtDi(java.util.Date dtDi) {
        this.dtDi = dtDi;
    }


    /**
     * Gets the localDesemb value for this TpDecImpor.
     * 
     * @return localDesemb
     */
    public java.lang.String getLocalDesemb() {
        return localDesemb;
    }


    /**
     * Sets the localDesemb value for this TpDecImpor.
     * 
     * @param localDesemb
     */
    public void setLocalDesemb(java.lang.String localDesemb) {
        this.localDesemb = localDesemb;
    }


    /**
     * Gets the ufDesemb value for this TpDecImpor.
     * 
     * @return ufDesemb
     */
    public java.lang.String getUfDesemb() {
        return ufDesemb;
    }


    /**
     * Sets the ufDesemb value for this TpDecImpor.
     * 
     * @param ufDesemb
     */
    public void setUfDesemb(java.lang.String ufDesemb) {
        this.ufDesemb = ufDesemb;
    }


    /**
     * Gets the dtDesemb value for this TpDecImpor.
     * 
     * @return dtDesemb
     */
    public java.util.Date getDtDesemb() {
        return dtDesemb;
    }


    /**
     * Sets the dtDesemb value for this TpDecImpor.
     * 
     * @param dtDesemb
     */
    public void setDtDesemb(java.util.Date dtDesemb) {
        this.dtDesemb = dtDesemb;
    }


    /**
     * Gets the codPartExport value for this TpDecImpor.
     * 
     * @return codPartExport
     */
    public java.lang.String getCodPartExport() {
        return codPartExport;
    }


    /**
     * Sets the codPartExport value for this TpDecImpor.
     * 
     * @param codPartExport
     */
    public void setCodPartExport(java.lang.String codPartExport) {
        this.codPartExport = codPartExport;
    }


    /**
     * Gets the dmCodDocImp value for this TpDecImpor.
     * 
     * @return dmCodDocImp
     */
    public org.apache.axis.types.NonNegativeInteger getDmCodDocImp() {
        return dmCodDocImp;
    }


    /**
     * Sets the dmCodDocImp value for this TpDecImpor.
     * 
     * @param dmCodDocImp
     */
    public void setDmCodDocImp(org.apache.axis.types.NonNegativeInteger dmCodDocImp) {
        this.dmCodDocImp = dmCodDocImp;
    }


    /**
     * Gets the numAcdraw value for this TpDecImpor.
     * 
     * @return numAcdraw
     */
    public java.lang.String getNumAcdraw() {
        return numAcdraw;
    }


    /**
     * Sets the numAcdraw value for this TpDecImpor.
     * 
     * @param numAcdraw
     */
    public void setNumAcdraw(java.lang.String numAcdraw) {
        this.numAcdraw = numAcdraw;
    }


    /**
     * Gets the dmTpViaTransp value for this TpDecImpor.
     * 
     * @return dmTpViaTransp
     */
    public org.apache.axis.types.NonNegativeInteger getDmTpViaTransp() {
        return dmTpViaTransp;
    }


    /**
     * Sets the dmTpViaTransp value for this TpDecImpor.
     * 
     * @param dmTpViaTransp
     */
    public void setDmTpViaTransp(org.apache.axis.types.NonNegativeInteger dmTpViaTransp) {
        this.dmTpViaTransp = dmTpViaTransp;
    }


    /**
     * Gets the vlVafrmm value for this TpDecImpor.
     * 
     * @return vlVafrmm
     */
    public java.math.BigDecimal getVlVafrmm() {
        return vlVafrmm;
    }


    /**
     * Sets the vlVafrmm value for this TpDecImpor.
     * 
     * @param vlVafrmm
     */
    public void setVlVafrmm(java.math.BigDecimal vlVafrmm) {
        this.vlVafrmm = vlVafrmm;
    }


    /**
     * Gets the dmTpIntermedio value for this TpDecImpor.
     * 
     * @return dmTpIntermedio
     */
    public org.apache.axis.types.NonNegativeInteger getDmTpIntermedio() {
        return dmTpIntermedio;
    }


    /**
     * Sets the dmTpIntermedio value for this TpDecImpor.
     * 
     * @param dmTpIntermedio
     */
    public void setDmTpIntermedio(org.apache.axis.types.NonNegativeInteger dmTpIntermedio) {
        this.dmTpIntermedio = dmTpIntermedio;
    }


    /**
     * Gets the cnpj value for this TpDecImpor.
     * 
     * @return cnpj
     */
    public java.lang.String getCnpj() {
        return cnpj;
    }


    /**
     * Sets the cnpj value for this TpDecImpor.
     * 
     * @param cnpj
     */
    public void setCnpj(java.lang.String cnpj) {
        this.cnpj = cnpj;
    }


    /**
     * Gets the ufTerceiro value for this TpDecImpor.
     * 
     * @return ufTerceiro
     */
    public java.lang.String getUfTerceiro() {
        return ufTerceiro;
    }


    /**
     * Sets the ufTerceiro value for this TpDecImpor.
     * 
     * @param ufTerceiro
     */
    public void setUfTerceiro(java.lang.String ufTerceiro) {
        this.ufTerceiro = ufTerceiro;
    }


    /**
     * Gets the adicaoDecImpor value for this TpDecImpor.
     * 
     * @return adicaoDecImpor
     */
    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpAdicaoDecImpor[] getAdicaoDecImpor() {
        return adicaoDecImpor;
    }


    /**
     * Sets the adicaoDecImpor value for this TpDecImpor.
     * 
     * @param adicaoDecImpor
     */
    public void setAdicaoDecImpor(br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpAdicaoDecImpor[] adicaoDecImpor) {
        this.adicaoDecImpor = adicaoDecImpor;
    }

    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpAdicaoDecImpor getAdicaoDecImpor(int i) {
        return this.adicaoDecImpor[i];
    }

    public void setAdicaoDecImpor(int i, br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpAdicaoDecImpor _value) {
        this.adicaoDecImpor[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TpDecImpor)) return false;
        TpDecImpor other = (TpDecImpor) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nroDi==null && other.getNroDi()==null) || 
             (this.nroDi!=null &&
              this.nroDi.equals(other.getNroDi()))) &&
            ((this.dtDi==null && other.getDtDi()==null) || 
             (this.dtDi!=null &&
              this.dtDi.equals(other.getDtDi()))) &&
            ((this.localDesemb==null && other.getLocalDesemb()==null) || 
             (this.localDesemb!=null &&
              this.localDesemb.equals(other.getLocalDesemb()))) &&
            ((this.ufDesemb==null && other.getUfDesemb()==null) || 
             (this.ufDesemb!=null &&
              this.ufDesemb.equals(other.getUfDesemb()))) &&
            ((this.dtDesemb==null && other.getDtDesemb()==null) || 
             (this.dtDesemb!=null &&
              this.dtDesemb.equals(other.getDtDesemb()))) &&
            ((this.codPartExport==null && other.getCodPartExport()==null) || 
             (this.codPartExport!=null &&
              this.codPartExport.equals(other.getCodPartExport()))) &&
            ((this.dmCodDocImp==null && other.getDmCodDocImp()==null) || 
             (this.dmCodDocImp!=null &&
              this.dmCodDocImp.equals(other.getDmCodDocImp()))) &&
            ((this.numAcdraw==null && other.getNumAcdraw()==null) || 
             (this.numAcdraw!=null &&
              this.numAcdraw.equals(other.getNumAcdraw()))) &&
            ((this.dmTpViaTransp==null && other.getDmTpViaTransp()==null) || 
             (this.dmTpViaTransp!=null &&
              this.dmTpViaTransp.equals(other.getDmTpViaTransp()))) &&
            ((this.vlVafrmm==null && other.getVlVafrmm()==null) || 
             (this.vlVafrmm!=null &&
              this.vlVafrmm.equals(other.getVlVafrmm()))) &&
            ((this.dmTpIntermedio==null && other.getDmTpIntermedio()==null) || 
             (this.dmTpIntermedio!=null &&
              this.dmTpIntermedio.equals(other.getDmTpIntermedio()))) &&
            ((this.cnpj==null && other.getCnpj()==null) || 
             (this.cnpj!=null &&
              this.cnpj.equals(other.getCnpj()))) &&
            ((this.ufTerceiro==null && other.getUfTerceiro()==null) || 
             (this.ufTerceiro!=null &&
              this.ufTerceiro.equals(other.getUfTerceiro()))) &&
            ((this.adicaoDecImpor==null && other.getAdicaoDecImpor()==null) || 
             (this.adicaoDecImpor!=null &&
              java.util.Arrays.equals(this.adicaoDecImpor, other.getAdicaoDecImpor())));
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
        if (getNroDi() != null) {
            _hashCode += getNroDi().hashCode();
        }
        if (getDtDi() != null) {
            _hashCode += getDtDi().hashCode();
        }
        if (getLocalDesemb() != null) {
            _hashCode += getLocalDesemb().hashCode();
        }
        if (getUfDesemb() != null) {
            _hashCode += getUfDesemb().hashCode();
        }
        if (getDtDesemb() != null) {
            _hashCode += getDtDesemb().hashCode();
        }
        if (getCodPartExport() != null) {
            _hashCode += getCodPartExport().hashCode();
        }
        if (getDmCodDocImp() != null) {
            _hashCode += getDmCodDocImp().hashCode();
        }
        if (getNumAcdraw() != null) {
            _hashCode += getNumAcdraw().hashCode();
        }
        if (getDmTpViaTransp() != null) {
            _hashCode += getDmTpViaTransp().hashCode();
        }
        if (getVlVafrmm() != null) {
            _hashCode += getVlVafrmm().hashCode();
        }
        if (getDmTpIntermedio() != null) {
            _hashCode += getDmTpIntermedio().hashCode();
        }
        if (getCnpj() != null) {
            _hashCode += getCnpj().hashCode();
        }
        if (getUfTerceiro() != null) {
            _hashCode += getUfTerceiro().hashCode();
        }
        if (getAdicaoDecImpor() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAdicaoDecImpor());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAdicaoDecImpor(), i);
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
        new org.apache.axis.description.TypeDesc(TpDecImpor.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "tpDecImpor"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nroDi");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "nroDi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dtDi");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "dtDi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localDesemb");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "localDesemb"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ufDesemb");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "ufDesemb"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dtDesemb");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "dtDesemb"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codPartExport");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "codPartExport"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dmCodDocImp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "dmCodDocImp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "tpDominio"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numAcdraw");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "numAcdraw"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dmTpViaTransp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "dmTpViaTransp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "tpDominio"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlVafrmm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "vlVafrmm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalTwoPrec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dmTpIntermedio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "dmTpIntermedio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "tpDominio"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cnpj");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "cnpj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ufTerceiro");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "ufTerceiro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adicaoDecImpor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "adicaoDecImpor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "tpAdicaoDecImpor"));
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
