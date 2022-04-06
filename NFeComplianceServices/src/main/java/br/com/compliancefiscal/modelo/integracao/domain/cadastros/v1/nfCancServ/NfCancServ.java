/**
 * NfCancServ.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfCancServ;

public class NfCancServ  implements java.io.Serializable {
    private br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.TpCpfCnpj cpfCnpj;

    private org.apache.axis.types.NonNegativeInteger dmIndEmit;

    private org.apache.axis.types.NonNegativeInteger dmIndOper;

    private java.lang.String codPart;

    private java.lang.String serie;

    private org.apache.axis.types.NonNegativeInteger nroNf;

    private org.apache.axis.types.NonNegativeInteger codigoModeloFiscal;

    private java.util.Date dtCanc;

    private java.lang.String justif;

    private org.apache.axis.types.NonNegativeInteger idNfErp;

    public NfCancServ() {
    }

    public NfCancServ(
           br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.TpCpfCnpj cpfCnpj,
           org.apache.axis.types.NonNegativeInteger dmIndEmit,
           org.apache.axis.types.NonNegativeInteger dmIndOper,
           java.lang.String codPart,
           java.lang.String serie,
           org.apache.axis.types.NonNegativeInteger nroNf,
           org.apache.axis.types.NonNegativeInteger codigoModeloFiscal,
           java.util.Date dtCanc,
           java.lang.String justif,
           org.apache.axis.types.NonNegativeInteger idNfErp) {
           this.cpfCnpj = cpfCnpj;
           this.dmIndEmit = dmIndEmit;
           this.dmIndOper = dmIndOper;
           this.codPart = codPart;
           this.serie = serie;
           this.nroNf = nroNf;
           this.codigoModeloFiscal = codigoModeloFiscal;
           this.dtCanc = dtCanc;
           this.justif = justif;
           this.idNfErp = idNfErp;
    }


    /**
     * Gets the cpfCnpj value for this NfCancServ.
     * 
     * @return cpfCnpj
     */
    public br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.TpCpfCnpj getCpfCnpj() {
        return cpfCnpj;
    }


    /**
     * Sets the cpfCnpj value for this NfCancServ.
     * 
     * @param cpfCnpj
     */
    public void setCpfCnpj(br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.TpCpfCnpj cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }


    /**
     * Gets the dmIndEmit value for this NfCancServ.
     * 
     * @return dmIndEmit
     */
    public org.apache.axis.types.NonNegativeInteger getDmIndEmit() {
        return dmIndEmit;
    }


    /**
     * Sets the dmIndEmit value for this NfCancServ.
     * 
     * @param dmIndEmit
     */
    public void setDmIndEmit(org.apache.axis.types.NonNegativeInteger dmIndEmit) {
        this.dmIndEmit = dmIndEmit;
    }


    /**
     * Gets the dmIndOper value for this NfCancServ.
     * 
     * @return dmIndOper
     */
    public org.apache.axis.types.NonNegativeInteger getDmIndOper() {
        return dmIndOper;
    }


    /**
     * Sets the dmIndOper value for this NfCancServ.
     * 
     * @param dmIndOper
     */
    public void setDmIndOper(org.apache.axis.types.NonNegativeInteger dmIndOper) {
        this.dmIndOper = dmIndOper;
    }


    /**
     * Gets the codPart value for this NfCancServ.
     * 
     * @return codPart
     */
    public java.lang.String getCodPart() {
        return codPart;
    }


    /**
     * Sets the codPart value for this NfCancServ.
     * 
     * @param codPart
     */
    public void setCodPart(java.lang.String codPart) {
        this.codPart = codPart;
    }


    /**
     * Gets the serie value for this NfCancServ.
     * 
     * @return serie
     */
    public java.lang.String getSerie() {
        return serie;
    }


    /**
     * Sets the serie value for this NfCancServ.
     * 
     * @param serie
     */
    public void setSerie(java.lang.String serie) {
        this.serie = serie;
    }


    /**
     * Gets the nroNf value for this NfCancServ.
     * 
     * @return nroNf
     */
    public org.apache.axis.types.NonNegativeInteger getNroNf() {
        return nroNf;
    }


    /**
     * Sets the nroNf value for this NfCancServ.
     * 
     * @param nroNf
     */
    public void setNroNf(org.apache.axis.types.NonNegativeInteger nroNf) {
        this.nroNf = nroNf;
    }


    /**
     * Gets the codigoModeloFiscal value for this NfCancServ.
     * 
     * @return codigoModeloFiscal
     */
    public org.apache.axis.types.NonNegativeInteger getCodigoModeloFiscal() {
        return codigoModeloFiscal;
    }


    /**
     * Sets the codigoModeloFiscal value for this NfCancServ.
     * 
     * @param codigoModeloFiscal
     */
    public void setCodigoModeloFiscal(org.apache.axis.types.NonNegativeInteger codigoModeloFiscal) {
        this.codigoModeloFiscal = codigoModeloFiscal;
    }


    /**
     * Gets the dtCanc value for this NfCancServ.
     * 
     * @return dtCanc
     */
    public java.util.Date getDtCanc() {
        return dtCanc;
    }


    /**
     * Sets the dtCanc value for this NfCancServ.
     * 
     * @param dtCanc
     */
    public void setDtCanc(java.util.Date dtCanc) {
        this.dtCanc = dtCanc;
    }


    /**
     * Gets the justif value for this NfCancServ.
     * 
     * @return justif
     */
    public java.lang.String getJustif() {
        return justif;
    }


    /**
     * Sets the justif value for this NfCancServ.
     * 
     * @param justif
     */
    public void setJustif(java.lang.String justif) {
        this.justif = justif;
    }


    /**
     * Gets the idNfErp value for this NfCancServ.
     * 
     * @return idNfErp
     */
    public org.apache.axis.types.NonNegativeInteger getIdNfErp() {
        return idNfErp;
    }


    /**
     * Sets the idNfErp value for this NfCancServ.
     * 
     * @param idNfErp
     */
    public void setIdNfErp(org.apache.axis.types.NonNegativeInteger idNfErp) {
        this.idNfErp = idNfErp;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NfCancServ)) return false;
        NfCancServ other = (NfCancServ) obj;
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
            ((this.dmIndEmit==null && other.getDmIndEmit()==null) || 
             (this.dmIndEmit!=null &&
              this.dmIndEmit.equals(other.getDmIndEmit()))) &&
            ((this.dmIndOper==null && other.getDmIndOper()==null) || 
             (this.dmIndOper!=null &&
              this.dmIndOper.equals(other.getDmIndOper()))) &&
            ((this.codPart==null && other.getCodPart()==null) || 
             (this.codPart!=null &&
              this.codPart.equals(other.getCodPart()))) &&
            ((this.serie==null && other.getSerie()==null) || 
             (this.serie!=null &&
              this.serie.equals(other.getSerie()))) &&
            ((this.nroNf==null && other.getNroNf()==null) || 
             (this.nroNf!=null &&
              this.nroNf.equals(other.getNroNf()))) &&
            ((this.codigoModeloFiscal==null && other.getCodigoModeloFiscal()==null) || 
             (this.codigoModeloFiscal!=null &&
              this.codigoModeloFiscal.equals(other.getCodigoModeloFiscal()))) &&
            ((this.dtCanc==null && other.getDtCanc()==null) || 
             (this.dtCanc!=null &&
              this.dtCanc.equals(other.getDtCanc()))) &&
            ((this.justif==null && other.getJustif()==null) || 
             (this.justif!=null &&
              this.justif.equals(other.getJustif()))) &&
            ((this.idNfErp==null && other.getIdNfErp()==null) || 
             (this.idNfErp!=null &&
              this.idNfErp.equals(other.getIdNfErp())));
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
        if (getDmIndEmit() != null) {
            _hashCode += getDmIndEmit().hashCode();
        }
        if (getDmIndOper() != null) {
            _hashCode += getDmIndOper().hashCode();
        }
        if (getCodPart() != null) {
            _hashCode += getCodPart().hashCode();
        }
        if (getSerie() != null) {
            _hashCode += getSerie().hashCode();
        }
        if (getNroNf() != null) {
            _hashCode += getNroNf().hashCode();
        }
        if (getCodigoModeloFiscal() != null) {
            _hashCode += getCodigoModeloFiscal().hashCode();
        }
        if (getDtCanc() != null) {
            _hashCode += getDtCanc().hashCode();
        }
        if (getJustif() != null) {
            _hashCode += getJustif().hashCode();
        }
        if (getIdNfErp() != null) {
            _hashCode += getIdNfErp().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NfCancServ.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfCancServ", "nfCancServ"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpfCnpj");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfCancServ", "cpfCnpj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "tpCpfCnpj"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dmIndEmit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfCancServ", "dmIndEmit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "tpDominio"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dmIndOper");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfCancServ", "dmIndOper"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "tpDominio"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codPart");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfCancServ", "codPart"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serie");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfCancServ", "serie"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nroNf");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfCancServ", "nroNf"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoModeloFiscal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfCancServ", "codigoModeloFiscal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dtCanc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfCancServ", "dtCanc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("justif");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfCancServ", "justif"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idNfErp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfCancServ", "idNfErp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
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
