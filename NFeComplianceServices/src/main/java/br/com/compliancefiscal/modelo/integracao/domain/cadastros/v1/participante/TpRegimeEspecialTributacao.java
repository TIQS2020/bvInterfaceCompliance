/**
 * TpRegimeEspecialTributacao.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.participante;

public class TpRegimeEspecialTributacao implements java.io.Serializable {
    private org.apache.axis.types.PositiveInteger _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected TpRegimeEspecialTributacao(org.apache.axis.types.PositiveInteger value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.PositiveInteger _value1 = new org.apache.axis.types.PositiveInteger("1");
    public static final org.apache.axis.types.PositiveInteger _value2 = new org.apache.axis.types.PositiveInteger("2");
    public static final org.apache.axis.types.PositiveInteger _value3 = new org.apache.axis.types.PositiveInteger("3");
    public static final org.apache.axis.types.PositiveInteger _value4 = new org.apache.axis.types.PositiveInteger("4");
    public static final org.apache.axis.types.PositiveInteger _value5 = new org.apache.axis.types.PositiveInteger("5");
    public static final org.apache.axis.types.PositiveInteger _value6 = new org.apache.axis.types.PositiveInteger("6");
    public static final TpRegimeEspecialTributacao value1 = new TpRegimeEspecialTributacao(_value1);
    public static final TpRegimeEspecialTributacao value2 = new TpRegimeEspecialTributacao(_value2);
    public static final TpRegimeEspecialTributacao value3 = new TpRegimeEspecialTributacao(_value3);
    public static final TpRegimeEspecialTributacao value4 = new TpRegimeEspecialTributacao(_value4);
    public static final TpRegimeEspecialTributacao value5 = new TpRegimeEspecialTributacao(_value5);
    public static final TpRegimeEspecialTributacao value6 = new TpRegimeEspecialTributacao(_value6);
    public org.apache.axis.types.PositiveInteger getValue() { return _value_;}
    public static TpRegimeEspecialTributacao fromValue(org.apache.axis.types.PositiveInteger value)
          throws java.lang.IllegalArgumentException {
        TpRegimeEspecialTributacao enumeration = (TpRegimeEspecialTributacao)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static TpRegimeEspecialTributacao fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        try {
            return fromValue(new org.apache.axis.types.PositiveInteger(value));
        } catch (Exception e) {
            throw new java.lang.IllegalArgumentException();
        }
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_.toString();}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TpRegimeEspecialTributacao.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/participante", "tpRegimeEspecialTributacao"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
