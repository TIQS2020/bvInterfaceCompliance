/**
 * TpMarcaComercial.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.item;

public class TpMarcaComercial  implements java.io.Serializable {
    private java.lang.String dmCodTab;

    private java.lang.String codigoGrupo;

    private java.lang.String marcaComercial;

    public TpMarcaComercial() {
    }

    public TpMarcaComercial(
           java.lang.String dmCodTab,
           java.lang.String codigoGrupo,
           java.lang.String marcaComercial) {
           this.dmCodTab = dmCodTab;
           this.codigoGrupo = codigoGrupo;
           this.marcaComercial = marcaComercial;
    }


    /**
     * Gets the dmCodTab value for this TpMarcaComercial.
     * 
     * @return dmCodTab
     */
    public java.lang.String getDmCodTab() {
        return dmCodTab;
    }


    /**
     * Sets the dmCodTab value for this TpMarcaComercial.
     * 
     * @param dmCodTab
     */
    public void setDmCodTab(java.lang.String dmCodTab) {
        this.dmCodTab = dmCodTab;
    }


    /**
     * Gets the codigoGrupo value for this TpMarcaComercial.
     * 
     * @return codigoGrupo
     */
    public java.lang.String getCodigoGrupo() {
        return codigoGrupo;
    }


    /**
     * Sets the codigoGrupo value for this TpMarcaComercial.
     * 
     * @param codigoGrupo
     */
    public void setCodigoGrupo(java.lang.String codigoGrupo) {
        this.codigoGrupo = codigoGrupo;
    }


    /**
     * Gets the marcaComercial value for this TpMarcaComercial.
     * 
     * @return marcaComercial
     */
    public java.lang.String getMarcaComercial() {
        return marcaComercial;
    }


    /**
     * Sets the marcaComercial value for this TpMarcaComercial.
     * 
     * @param marcaComercial
     */
    public void setMarcaComercial(java.lang.String marcaComercial) {
        this.marcaComercial = marcaComercial;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TpMarcaComercial)) return false;
        TpMarcaComercial other = (TpMarcaComercial) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dmCodTab==null && other.getDmCodTab()==null) || 
             (this.dmCodTab!=null &&
              this.dmCodTab.equals(other.getDmCodTab()))) &&
            ((this.codigoGrupo==null && other.getCodigoGrupo()==null) || 
             (this.codigoGrupo!=null &&
              this.codigoGrupo.equals(other.getCodigoGrupo()))) &&
            ((this.marcaComercial==null && other.getMarcaComercial()==null) || 
             (this.marcaComercial!=null &&
              this.marcaComercial.equals(other.getMarcaComercial())));
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
        if (getDmCodTab() != null) {
            _hashCode += getDmCodTab().hashCode();
        }
        if (getCodigoGrupo() != null) {
            _hashCode += getCodigoGrupo().hashCode();
        }
        if (getMarcaComercial() != null) {
            _hashCode += getMarcaComercial().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TpMarcaComercial.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/item", "tpMarcaComercial"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dmCodTab");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/item", "dmCodTab"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoGrupo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/item", "codigoGrupo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("marcaComercial");
        elemField.setXmlName(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/item", "marcaComercial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
