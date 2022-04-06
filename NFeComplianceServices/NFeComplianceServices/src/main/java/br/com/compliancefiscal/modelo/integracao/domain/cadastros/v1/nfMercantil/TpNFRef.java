/**
 * TpNFRef.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil;

public class TpNFRef  implements java.io.Serializable {
    private java.lang.String nroChaveNfe;

    private java.lang.String ibgeEstadoEmit;

    private br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.TpCpfCnpj cpfCnpj;

    private java.util.Date dtEmiss;

    private java.lang.String codMod;

    private org.apache.axis.types.NonNegativeInteger nroNf;

    private java.lang.String serie;

    private java.math.BigInteger subSerie;

    private java.lang.String codPart;

    private org.apache.axis.types.NonNegativeInteger dmIndEmit;

    private org.apache.axis.types.NonNegativeInteger dmIndOper;

    private java.lang.String ie;

    public TpNFRef() {
    }

    public TpNFRef(
           java.lang.String nroChaveNfe,
           java.lang.String ibgeEstadoEmit,
           br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.TpCpfCnpj cpfCnpj,
           java.util.Date dtEmiss,
           java.lang.String codMod,
           org.apache.axis.types.NonNegativeInteger nroNf,
           java.lang.String serie,
           java.math.BigInteger subSerie,
           java.lang.String codPart,
           org.apache.axis.types.NonNegativeInteger dmIndEmit,
           org.apache.axis.types.NonNegativeInteger dmIndOper,
           java.lang.String ie) {
           this.nroChaveNfe = nroChaveNfe;
           this.ibgeEstadoEmit = ibgeEstadoEmit;
           this.cpfCnpj = cpfCnpj;
           this.dtEmiss = dtEmiss;
           this.codMod = codMod;
           this.nroNf = nroNf;
           this.serie = serie;
           this.subSerie = subSerie;
           this.codPart = codPart;
           this.dmIndEmit = dmIndEmit;
           this.dmIndOper = dmIndOper;
           this.ie = ie;
    }


    /**
     * Gets the nroChaveNfe value for this TpNFRef.
     * 
     * @return nroChaveNfe
     */
    public java.lang.String getNroChaveNfe() {
        return nroChaveNfe;
    }


    /**
     * Sets the nroChaveNfe value for this TpNFRef.
     * 
     * @param nroChaveNfe
     */
    public void setNroChaveNfe(java.lang.String nroChaveNfe) {
        this.nroChaveNfe = nroChaveNfe;
    }


    /**
     * Gets the ibgeEstadoEmit value for this TpNFRef.
     * 
     * @return ibgeEstadoEmit
     */
    public java.lang.String getIbgeEstadoEmit() {
        return ibgeEstadoEmit;
    }


    /**
     * Sets the ibgeEstadoEmit value for this TpNFRef.
     * 
     * @param ibgeEstadoEmit
     */
    public void setIbgeEstadoEmit(java.lang.String ibgeEstadoEmit) {
        this.ibgeEstadoEmit = ibgeEstadoEmit;
    }


    /**
     * Gets the cpfCnpj value for this TpNFRef.
     * 
     * @return cpfCnpj
     */
    public br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.TpCpfCnpj getCpfCnpj() {
        return cpfCnpj;
    }


    /**
     * Sets the cpfCnpj value for this TpNFRef.
     * 
     * @param cpfCnpj
     */
    public void setCpfCnpj(br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.TpCpfCnpj cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }


    /**
     * Gets the dtEmiss value for this TpNFRef.
     * 
     * @return dtEmiss
     */
    public java.util.Date getDtEmiss() {
        return dtEmiss;
    }


    /**
     * Sets the dtEmiss value for this TpNFRef.
     * 
     * @param dtEmiss
     */
    public void setDtEmiss(java.util.Date dtEmiss) {
        this.dtEmiss = dtEmiss;
    }


    /**
     * Gets the codMod value for this TpNFRef.
     * 
     * @return codMod
     */
    public java.lang.String getCodMod() {
        return codMod;
    }


    /**
     * Sets the codMod value for this TpNFRef.
     * 
     * @param codMod
     */
    public void setCodMod(java.lang.String codMod) {
        this.codMod = codMod;
    }


    /**
     * Gets the nroNf value for this TpNFRef.
     * 
     * @return nroNf
     */
    public org.apache.axis.types.NonNegativeInteger getNroNf() {
        return nroNf;
    }


    /**
     * Sets the nroNf value for this TpNFRef.
     * 
     * @param nroNf
     */
    public void setNroNf(org.apache.axis.types.NonNegativeInteger nroNf) {
        this.nroNf = nroNf;
    }


    /**
     * Gets the serie value for this TpNFRef.
     * 
     * @return serie
     */
    public java.lang.String getSerie() {
        return serie;
    }


    /**
     * Sets the serie value for this TpNFRef.
     * 
     * @param serie
     */
    public void setSerie(java.lang.String serie) {
        this.serie = serie;
    }


    /**
     * Gets the subSerie value for this TpNFRef.
     * 
     * @return subSerie
     */
    public java.math.BigInteger getSubSerie() {
        return subSerie;
    }


    /**
     * Sets the subSerie value for this TpNFRef.
     * 
     * @param subSerie
     */
    public void setSubSerie(java.math.BigInteger subSerie) {
        this.subSerie = subSerie;
    }


    /**
     * Gets the codPart value for this TpNFRef.
     * 
     * @return codPart
     */
    public java.lang.String getCodPart() {
        return codPart;
    }


    /**
     * Sets the codPart value for this TpNFRef.
     * 
     * @param codPart
     */
    public void setCodPart(java.lang.String codPart) {
        this.codPart = codPart;
    }


    /**
     * Gets the dmIndEmit value for this TpNFRef.
     * 
     * @return dmIndEmit
     */
    public org.apache.axis.types.NonNegativeInteger getDmIndEmit() {
        return dmIndEmit;
    }


    /**
     * Sets the dmIndEmit value for this TpNFRef.
     * 
     * @param dmIndEmit
     */
    public void setDmIndEmit(org.apache.axis.types.NonNegativeInteger dmIndEmit) {
        this.dmIndEmit = dmIndEmit;
    }


    /**
     * Gets the dmIndOper value for this TpNFRef.
     * 
     * @return dmIndOper
     */
    public org.apache.axis.types.NonNegativeInteger getDmIndOper() {
        return dmIndOper;
    }


    /**
     * Sets the dmIndOper value for this TpNFRef.
     * 
     * @param dmIndOper
     */
    public void setDmIndOper(org.apache.axis.types.NonNegativeInteger dmIndOper) {
        this.dmIndOper = dmIndOper;
    }


    /**
     * Gets the ie value for this TpNFRef.
     * 
     * @return ie
     */
    public java.lang.String getIe() {
        return ie;
    }


    /**
     * Sets the ie value for this TpNFRef.
     * 
     * @param ie
     */
    public void setIe(java.lang.String ie) {
        this.ie = ie;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TpNFRef)) return false;
        TpNFRef other = (TpNFRef) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nroChaveNfe==null && other.getNroChaveNfe()==null) || 
             (this.nroChaveNfe!=null &&
              this.nroChaveNfe.equals(other.getNroChaveNfe()))) &&
            ((this.ibgeEstadoEmit==null && other.getIbgeEstadoEmit()==null) || 
             (this.ibgeEstadoEmit!=null &&
              this.ibgeEstadoEmit.equals(other.getIbgeEstadoEmit()))) &&
            ((this.cpfCnpj==null && other.getCpfCnpj()==null) || 
             (this.cpfCnpj!=null &&
              this.cpfCnpj.equals(other.getCpfCnpj()))) &&
            ((this.dtEmiss==null && other.getDtEmiss()==null) || 
             (this.dtEmiss!=null &&
              this.dtEmiss.equals(other.getDtEmiss()))) &&
            ((this.codMod==null && other.getCodMod()==null) || 
             (this.codMod!=null &&
              this.codMod.equals(other.getCodMod()))) &&
            ((this.nroNf==null && other.getNroNf()==null) || 
             (this.nroNf!=null &&
              this.nroNf.equals(other.getNroNf()))) &&
            ((this.serie==null && other.getSerie()==null) || 
             (this.serie!=null &&
              this.serie.equals(other.getSerie()))) &&
            ((this.subSerie==null && other.getSubSerie()==null) || 
             (this.subSerie!=null &&
              this.subSerie.equals(other.getSubSerie()))) &&
            ((this.codPart==null && other.getCodPart()==null) || 
             (this.codPart!=null &&
              this.codPart.equals(other.getCodPart()))) &&
            ((this.dmIndEmit==null && other.getDmIndEmit()==null) || 
             (this.dmIndEmit!=null &&
              this.dmIndEmit.equals(other.getDmIndEmit()))) &&
            ((this.dmIndOper==null && other.getDmIndOper()==null) || 
             (this.dmIndOper!=null &&
              this.dmIndOper.equals(other.getDmIndOper()))) &&
            ((this.ie==null && other.getIe()==null) || 
             (this.ie!=null &&
              this.ie.equals(other.getIe())));
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
        if (getNroChaveNfe() != null) {
            _hashCode += getNroChaveNfe().hashCode();
        }
        if (getIbgeEstadoEmit() != null) {
            _hashCode += getIbgeEstadoEmit().hashCode();
        }
        if (getCpfCnpj() != null) {
            _hashCode += getCpfCnpj().hashCode();
        }
        if (getDtEmiss() != null) {
            _hashCode += getDtEmiss().hashCode();
        }
        if (getCodMod() != null) {
            _hashCode += getCodMod().hashCode();
        }
        if (getNroNf() != null) {
            _hashCode += getNroNf().hashCode();
        }
        if (getSerie() != null) {
            _hashCode += getSerie().hashCode();
        }
        if (getSubSerie() != null) {
            _hashCode += getSubSerie().hashCode();
        }
        if (getCodPart() != null) {
            _hashCode += getCodPart().hashCode();
        }
        if (getDmIndEmit() != null) {
            _hashCode += getDmIndEmit().hashCode();
        }
        if (getDmIndOper() != null) {
            _hashCode += getDmIndOper().hashCode();
        }
        if (getIe() != null) {
            _hashCode += getIe().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TpNFRef.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "tpNFRef"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nroChaveNfe");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "nroChaveNfe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ibgeEstadoEmit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "ibgeEstadoEmit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("dtEmiss");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "dtEmiss"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codMod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "codMod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nroNf");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "nroNf"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serie");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "serie"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subSerie");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "subSerie"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codPart");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "codPart"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dmIndEmit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "dmIndEmit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "tpDominio"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dmIndOper");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "dmIndOper"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "tpDominio"));
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
