/**
 * NfInutMercantil.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfInutMercantil;

public class NfInutMercantil  implements java.io.Serializable {
    private br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.TpCpfCnpj cpfCnpjEmit;

    private java.math.BigInteger ano;

    private java.lang.String serie;

    private org.apache.axis.types.NonNegativeInteger nroIni;

    private org.apache.axis.types.NonNegativeInteger nroFim;

    private java.lang.String justif;

    private java.math.BigInteger dmStProc;

    private org.apache.axis.types.NonNegativeInteger codigoModeloFiscal;

    private java.math.BigInteger ibgeUf;

    public NfInutMercantil() {
    }

    public NfInutMercantil(
           br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.TpCpfCnpj cpfCnpjEmit,
           java.math.BigInteger ano,
           java.lang.String serie,
           org.apache.axis.types.NonNegativeInteger nroIni,
           org.apache.axis.types.NonNegativeInteger nroFim,
           java.lang.String justif,
           java.math.BigInteger dmStProc,
           org.apache.axis.types.NonNegativeInteger codigoModeloFiscal,
           java.math.BigInteger ibgeUf) {
           this.cpfCnpjEmit = cpfCnpjEmit;
           this.ano = ano;
           this.serie = serie;
           this.nroIni = nroIni;
           this.nroFim = nroFim;
           this.justif = justif;
           this.dmStProc = dmStProc;
           this.codigoModeloFiscal = codigoModeloFiscal;
           this.ibgeUf = ibgeUf;
    }


    /**
     * Gets the cpfCnpjEmit value for this NfInutMercantil.
     * 
     * @return cpfCnpjEmit
     */
    public br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.TpCpfCnpj getCpfCnpjEmit() {
        return cpfCnpjEmit;
    }


    /**
     * Sets the cpfCnpjEmit value for this NfInutMercantil.
     * 
     * @param cpfCnpjEmit
     */
    public void setCpfCnpjEmit(br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.TpCpfCnpj cpfCnpjEmit) {
        this.cpfCnpjEmit = cpfCnpjEmit;
    }


    /**
     * Gets the ano value for this NfInutMercantil.
     * 
     * @return ano
     */
    public java.math.BigInteger getAno() {
        return ano;
    }


    /**
     * Sets the ano value for this NfInutMercantil.
     * 
     * @param ano
     */
    public void setAno(java.math.BigInteger ano) {
        this.ano = ano;
    }


    /**
     * Gets the serie value for this NfInutMercantil.
     * 
     * @return serie
     */
    public java.lang.String getSerie() {
        return serie;
    }


    /**
     * Sets the serie value for this NfInutMercantil.
     * 
     * @param serie
     */
    public void setSerie(java.lang.String serie) {
        this.serie = serie;
    }


    /**
     * Gets the nroIni value for this NfInutMercantil.
     * 
     * @return nroIni
     */
    public org.apache.axis.types.NonNegativeInteger getNroIni() {
        return nroIni;
    }


    /**
     * Sets the nroIni value for this NfInutMercantil.
     * 
     * @param nroIni
     */
    public void setNroIni(org.apache.axis.types.NonNegativeInteger nroIni) {
        this.nroIni = nroIni;
    }


    /**
     * Gets the nroFim value for this NfInutMercantil.
     * 
     * @return nroFim
     */
    public org.apache.axis.types.NonNegativeInteger getNroFim() {
        return nroFim;
    }


    /**
     * Sets the nroFim value for this NfInutMercantil.
     * 
     * @param nroFim
     */
    public void setNroFim(org.apache.axis.types.NonNegativeInteger nroFim) {
        this.nroFim = nroFim;
    }


    /**
     * Gets the justif value for this NfInutMercantil.
     * 
     * @return justif
     */
    public java.lang.String getJustif() {
        return justif;
    }


    /**
     * Sets the justif value for this NfInutMercantil.
     * 
     * @param justif
     */
    public void setJustif(java.lang.String justif) {
        this.justif = justif;
    }


    /**
     * Gets the dmStProc value for this NfInutMercantil.
     * 
     * @return dmStProc
     */
    public java.math.BigInteger getDmStProc() {
        return dmStProc;
    }


    /**
     * Sets the dmStProc value for this NfInutMercantil.
     * 
     * @param dmStProc
     */
    public void setDmStProc(java.math.BigInteger dmStProc) {
        this.dmStProc = dmStProc;
    }


    /**
     * Gets the codigoModeloFiscal value for this NfInutMercantil.
     * 
     * @return codigoModeloFiscal
     */
    public org.apache.axis.types.NonNegativeInteger getCodigoModeloFiscal() {
        return codigoModeloFiscal;
    }


    /**
     * Sets the codigoModeloFiscal value for this NfInutMercantil.
     * 
     * @param codigoModeloFiscal
     */
    public void setCodigoModeloFiscal(org.apache.axis.types.NonNegativeInteger codigoModeloFiscal) {
        this.codigoModeloFiscal = codigoModeloFiscal;
    }


    /**
     * Gets the ibgeUf value for this NfInutMercantil.
     * 
     * @return ibgeUf
     */
    public java.math.BigInteger getIbgeUf() {
        return ibgeUf;
    }


    /**
     * Sets the ibgeUf value for this NfInutMercantil.
     * 
     * @param ibgeUf
     */
    public void setIbgeUf(java.math.BigInteger ibgeUf) {
        this.ibgeUf = ibgeUf;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NfInutMercantil)) return false;
        NfInutMercantil other = (NfInutMercantil) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cpfCnpjEmit==null && other.getCpfCnpjEmit()==null) || 
             (this.cpfCnpjEmit!=null &&
              this.cpfCnpjEmit.equals(other.getCpfCnpjEmit()))) &&
            ((this.ano==null && other.getAno()==null) || 
             (this.ano!=null &&
              this.ano.equals(other.getAno()))) &&
            ((this.serie==null && other.getSerie()==null) || 
             (this.serie!=null &&
              this.serie.equals(other.getSerie()))) &&
            ((this.nroIni==null && other.getNroIni()==null) || 
             (this.nroIni!=null &&
              this.nroIni.equals(other.getNroIni()))) &&
            ((this.nroFim==null && other.getNroFim()==null) || 
             (this.nroFim!=null &&
              this.nroFim.equals(other.getNroFim()))) &&
            ((this.justif==null && other.getJustif()==null) || 
             (this.justif!=null &&
              this.justif.equals(other.getJustif()))) &&
            ((this.dmStProc==null && other.getDmStProc()==null) || 
             (this.dmStProc!=null &&
              this.dmStProc.equals(other.getDmStProc()))) &&
            ((this.codigoModeloFiscal==null && other.getCodigoModeloFiscal()==null) || 
             (this.codigoModeloFiscal!=null &&
              this.codigoModeloFiscal.equals(other.getCodigoModeloFiscal()))) &&
            ((this.ibgeUf==null && other.getIbgeUf()==null) || 
             (this.ibgeUf!=null &&
              this.ibgeUf.equals(other.getIbgeUf())));
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
        if (getCpfCnpjEmit() != null) {
            _hashCode += getCpfCnpjEmit().hashCode();
        }
        if (getAno() != null) {
            _hashCode += getAno().hashCode();
        }
        if (getSerie() != null) {
            _hashCode += getSerie().hashCode();
        }
        if (getNroIni() != null) {
            _hashCode += getNroIni().hashCode();
        }
        if (getNroFim() != null) {
            _hashCode += getNroFim().hashCode();
        }
        if (getJustif() != null) {
            _hashCode += getJustif().hashCode();
        }
        if (getDmStProc() != null) {
            _hashCode += getDmStProc().hashCode();
        }
        if (getCodigoModeloFiscal() != null) {
            _hashCode += getCodigoModeloFiscal().hashCode();
        }
        if (getIbgeUf() != null) {
            _hashCode += getIbgeUf().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NfInutMercantil.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfInutMercantil", "nfInutMercantil"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpfCnpjEmit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfInutMercantil", "cpfCnpjEmit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "tpCpfCnpj"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ano");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfInutMercantil", "ano"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serie");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfInutMercantil", "serie"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nroIni");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfInutMercantil", "nroIni"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nroFim");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfInutMercantil", "nroFim"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("justif");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfInutMercantil", "justif"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dmStProc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfInutMercantil", "dmStProc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoModeloFiscal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfInutMercantil", "codigoModeloFiscal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ibgeUf");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfInutMercantil", "ibgeUf"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
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
