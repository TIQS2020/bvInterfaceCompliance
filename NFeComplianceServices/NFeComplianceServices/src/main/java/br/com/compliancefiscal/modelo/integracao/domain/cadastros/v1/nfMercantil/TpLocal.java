/**
 * TpLocal.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil;

public class TpLocal  implements java.io.Serializable {
    private org.apache.axis.types.NonNegativeInteger dmTipoLocal;

    private br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.TpCpfCnpj cpfCnpj;

    private java.lang.String lograd;

    private java.lang.String nro;

    private java.lang.String compl;

    private java.lang.String bairro;

    private java.lang.String cidade;

    private java.lang.String cidadeIbge;

    private java.lang.String uf;

    private java.lang.String ie;

    private org.apache.axis.types.NonNegativeInteger dmIndCarga;

    public TpLocal() {
    }

    public TpLocal(
           org.apache.axis.types.NonNegativeInteger dmTipoLocal,
           br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.TpCpfCnpj cpfCnpj,
           java.lang.String lograd,
           java.lang.String nro,
           java.lang.String compl,
           java.lang.String bairro,
           java.lang.String cidade,
           java.lang.String cidadeIbge,
           java.lang.String uf,
           java.lang.String ie,
           org.apache.axis.types.NonNegativeInteger dmIndCarga) {
           this.dmTipoLocal = dmTipoLocal;
           this.cpfCnpj = cpfCnpj;
           this.lograd = lograd;
           this.nro = nro;
           this.compl = compl;
           this.bairro = bairro;
           this.cidade = cidade;
           this.cidadeIbge = cidadeIbge;
           this.uf = uf;
           this.ie = ie;
           this.dmIndCarga = dmIndCarga;
    }


    /**
     * Gets the dmTipoLocal value for this TpLocal.
     * 
     * @return dmTipoLocal
     */
    public org.apache.axis.types.NonNegativeInteger getDmTipoLocal() {
        return dmTipoLocal;
    }


    /**
     * Sets the dmTipoLocal value for this TpLocal.
     * 
     * @param dmTipoLocal
     */
    public void setDmTipoLocal(org.apache.axis.types.NonNegativeInteger dmTipoLocal) {
        this.dmTipoLocal = dmTipoLocal;
    }


    /**
     * Gets the cpfCnpj value for this TpLocal.
     * 
     * @return cpfCnpj
     */
    public br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.TpCpfCnpj getCpfCnpj() {
        return cpfCnpj;
    }


    /**
     * Sets the cpfCnpj value for this TpLocal.
     * 
     * @param cpfCnpj
     */
    public void setCpfCnpj(br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.TpCpfCnpj cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }


    /**
     * Gets the lograd value for this TpLocal.
     * 
     * @return lograd
     */
    public java.lang.String getLograd() {
        return lograd;
    }


    /**
     * Sets the lograd value for this TpLocal.
     * 
     * @param lograd
     */
    public void setLograd(java.lang.String lograd) {
        this.lograd = lograd;
    }


    /**
     * Gets the nro value for this TpLocal.
     * 
     * @return nro
     */
    public java.lang.String getNro() {
        return nro;
    }


    /**
     * Sets the nro value for this TpLocal.
     * 
     * @param nro
     */
    public void setNro(java.lang.String nro) {
        this.nro = nro;
    }


    /**
     * Gets the compl value for this TpLocal.
     * 
     * @return compl
     */
    public java.lang.String getCompl() {
        return compl;
    }


    /**
     * Sets the compl value for this TpLocal.
     * 
     * @param compl
     */
    public void setCompl(java.lang.String compl) {
        this.compl = compl;
    }


    /**
     * Gets the bairro value for this TpLocal.
     * 
     * @return bairro
     */
    public java.lang.String getBairro() {
        return bairro;
    }


    /**
     * Sets the bairro value for this TpLocal.
     * 
     * @param bairro
     */
    public void setBairro(java.lang.String bairro) {
        this.bairro = bairro;
    }


    /**
     * Gets the cidade value for this TpLocal.
     * 
     * @return cidade
     */
    public java.lang.String getCidade() {
        return cidade;
    }


    /**
     * Sets the cidade value for this TpLocal.
     * 
     * @param cidade
     */
    public void setCidade(java.lang.String cidade) {
        this.cidade = cidade;
    }


    /**
     * Gets the cidadeIbge value for this TpLocal.
     * 
     * @return cidadeIbge
     */
    public java.lang.String getCidadeIbge() {
        return cidadeIbge;
    }


    /**
     * Sets the cidadeIbge value for this TpLocal.
     * 
     * @param cidadeIbge
     */
    public void setCidadeIbge(java.lang.String cidadeIbge) {
        this.cidadeIbge = cidadeIbge;
    }


    /**
     * Gets the uf value for this TpLocal.
     * 
     * @return uf
     */
    public java.lang.String getUf() {
        return uf;
    }


    /**
     * Sets the uf value for this TpLocal.
     * 
     * @param uf
     */
    public void setUf(java.lang.String uf) {
        this.uf = uf;
    }


    /**
     * Gets the ie value for this TpLocal.
     * 
     * @return ie
     */
    public java.lang.String getIe() {
        return ie;
    }


    /**
     * Sets the ie value for this TpLocal.
     * 
     * @param ie
     */
    public void setIe(java.lang.String ie) {
        this.ie = ie;
    }


    /**
     * Gets the dmIndCarga value for this TpLocal.
     * 
     * @return dmIndCarga
     */
    public org.apache.axis.types.NonNegativeInteger getDmIndCarga() {
        return dmIndCarga;
    }


    /**
     * Sets the dmIndCarga value for this TpLocal.
     * 
     * @param dmIndCarga
     */
    public void setDmIndCarga(org.apache.axis.types.NonNegativeInteger dmIndCarga) {
        this.dmIndCarga = dmIndCarga;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TpLocal)) return false;
        TpLocal other = (TpLocal) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dmTipoLocal==null && other.getDmTipoLocal()==null) || 
             (this.dmTipoLocal!=null &&
              this.dmTipoLocal.equals(other.getDmTipoLocal()))) &&
            ((this.cpfCnpj==null && other.getCpfCnpj()==null) || 
             (this.cpfCnpj!=null &&
              this.cpfCnpj.equals(other.getCpfCnpj()))) &&
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
            ((this.ie==null && other.getIe()==null) || 
             (this.ie!=null &&
              this.ie.equals(other.getIe()))) &&
            ((this.dmIndCarga==null && other.getDmIndCarga()==null) || 
             (this.dmIndCarga!=null &&
              this.dmIndCarga.equals(other.getDmIndCarga())));
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
        if (getDmTipoLocal() != null) {
            _hashCode += getDmTipoLocal().hashCode();
        }
        if (getCpfCnpj() != null) {
            _hashCode += getCpfCnpj().hashCode();
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
        if (getIe() != null) {
            _hashCode += getIe().hashCode();
        }
        if (getDmIndCarga() != null) {
            _hashCode += getDmIndCarga().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TpLocal.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "tpLocal"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dmTipoLocal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "dmTipoLocal"));
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
        elemField.setFieldName("lograd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "lograd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nro");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "nro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cidade");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "cidade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("ie");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "ie"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dmIndCarga");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "dmIndCarga"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "tpDominio"));
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
