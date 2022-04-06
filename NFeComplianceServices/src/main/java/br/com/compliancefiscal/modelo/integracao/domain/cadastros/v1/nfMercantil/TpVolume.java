/**
 * TpVolume.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil;

public class TpVolume  implements java.io.Serializable {
    private java.lang.String nroVolume;

    private java.math.BigInteger qtdeVol;

    private java.lang.String especie;

    private java.lang.String marca;

    private java.math.BigDecimal pesoBruto;

    private java.math.BigDecimal pesoLiquido;

    private br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpLacre[] lacre;

    public TpVolume() {
    }

    public TpVolume(
           java.lang.String nroVolume,
           java.math.BigInteger qtdeVol,
           java.lang.String especie,
           java.lang.String marca,
           java.math.BigDecimal pesoBruto,
           java.math.BigDecimal pesoLiquido,
           br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpLacre[] lacre) {
           this.nroVolume = nroVolume;
           this.qtdeVol = qtdeVol;
           this.especie = especie;
           this.marca = marca;
           this.pesoBruto = pesoBruto;
           this.pesoLiquido = pesoLiquido;
           this.lacre = lacre;
    }


    /**
     * Gets the nroVolume value for this TpVolume.
     * 
     * @return nroVolume
     */
    public java.lang.String getNroVolume() {
        return nroVolume;
    }


    /**
     * Sets the nroVolume value for this TpVolume.
     * 
     * @param nroVolume
     */
    public void setNroVolume(java.lang.String nroVolume) {
        this.nroVolume = nroVolume;
    }


    /**
     * Gets the qtdeVol value for this TpVolume.
     * 
     * @return qtdeVol
     */
    public java.math.BigInteger getQtdeVol() {
        return qtdeVol;
    }


    /**
     * Sets the qtdeVol value for this TpVolume.
     * 
     * @param qtdeVol
     */
    public void setQtdeVol(java.math.BigInteger qtdeVol) {
        this.qtdeVol = qtdeVol;
    }


    /**
     * Gets the especie value for this TpVolume.
     * 
     * @return especie
     */
    public java.lang.String getEspecie() {
        return especie;
    }


    /**
     * Sets the especie value for this TpVolume.
     * 
     * @param especie
     */
    public void setEspecie(java.lang.String especie) {
        this.especie = especie;
    }


    /**
     * Gets the marca value for this TpVolume.
     * 
     * @return marca
     */
    public java.lang.String getMarca() {
        return marca;
    }


    /**
     * Sets the marca value for this TpVolume.
     * 
     * @param marca
     */
    public void setMarca(java.lang.String marca) {
        this.marca = marca;
    }


    /**
     * Gets the pesoBruto value for this TpVolume.
     * 
     * @return pesoBruto
     */
    public java.math.BigDecimal getPesoBruto() {
        return pesoBruto;
    }


    /**
     * Sets the pesoBruto value for this TpVolume.
     * 
     * @param pesoBruto
     */
    public void setPesoBruto(java.math.BigDecimal pesoBruto) {
        this.pesoBruto = pesoBruto;
    }


    /**
     * Gets the pesoLiquido value for this TpVolume.
     * 
     * @return pesoLiquido
     */
    public java.math.BigDecimal getPesoLiquido() {
        return pesoLiquido;
    }


    /**
     * Sets the pesoLiquido value for this TpVolume.
     * 
     * @param pesoLiquido
     */
    public void setPesoLiquido(java.math.BigDecimal pesoLiquido) {
        this.pesoLiquido = pesoLiquido;
    }


    /**
     * Gets the lacre value for this TpVolume.
     * 
     * @return lacre
     */
    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpLacre[] getLacre() {
        return lacre;
    }


    /**
     * Sets the lacre value for this TpVolume.
     * 
     * @param lacre
     */
    public void setLacre(br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpLacre[] lacre) {
        this.lacre = lacre;
    }

    public br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpLacre getLacre(int i) {
        return this.lacre[i];
    }

    public void setLacre(int i, br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfMercantil.TpLacre _value) {
        this.lacre[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TpVolume)) return false;
        TpVolume other = (TpVolume) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nroVolume==null && other.getNroVolume()==null) || 
             (this.nroVolume!=null &&
              this.nroVolume.equals(other.getNroVolume()))) &&
            ((this.qtdeVol==null && other.getQtdeVol()==null) || 
             (this.qtdeVol!=null &&
              this.qtdeVol.equals(other.getQtdeVol()))) &&
            ((this.especie==null && other.getEspecie()==null) || 
             (this.especie!=null &&
              this.especie.equals(other.getEspecie()))) &&
            ((this.marca==null && other.getMarca()==null) || 
             (this.marca!=null &&
              this.marca.equals(other.getMarca()))) &&
            ((this.pesoBruto==null && other.getPesoBruto()==null) || 
             (this.pesoBruto!=null &&
              this.pesoBruto.equals(other.getPesoBruto()))) &&
            ((this.pesoLiquido==null && other.getPesoLiquido()==null) || 
             (this.pesoLiquido!=null &&
              this.pesoLiquido.equals(other.getPesoLiquido()))) &&
            ((this.lacre==null && other.getLacre()==null) || 
             (this.lacre!=null &&
              java.util.Arrays.equals(this.lacre, other.getLacre())));
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
        if (getNroVolume() != null) {
            _hashCode += getNroVolume().hashCode();
        }
        if (getQtdeVol() != null) {
            _hashCode += getQtdeVol().hashCode();
        }
        if (getEspecie() != null) {
            _hashCode += getEspecie().hashCode();
        }
        if (getMarca() != null) {
            _hashCode += getMarca().hashCode();
        }
        if (getPesoBruto() != null) {
            _hashCode += getPesoBruto().hashCode();
        }
        if (getPesoLiquido() != null) {
            _hashCode += getPesoLiquido().hashCode();
        }
        if (getLacre() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLacre());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLacre(), i);
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
        new org.apache.axis.description.TypeDesc(TpVolume.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "tpVolume"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nroVolume");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "nroVolume"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qtdeVol");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "qtdeVol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("especie");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "especie"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("marca");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "marca"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pesoBruto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "pesoBruto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalThreePrec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pesoLiquido");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "pesoLiquido"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/v1/tiposGenericos", "decimalThreePrec"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lacre");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "lacre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/nfMercantil", "tpLacre"));
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
