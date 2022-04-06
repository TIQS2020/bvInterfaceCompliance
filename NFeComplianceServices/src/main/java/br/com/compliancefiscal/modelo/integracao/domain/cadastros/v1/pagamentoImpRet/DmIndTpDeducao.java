/**
 * DmIndTpDeducao.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.pagamentoImpRet;

public class DmIndTpDeducao implements java.io.Serializable {
    private org.apache.axis.types.NonNegativeInteger _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected DmIndTpDeducao(org.apache.axis.types.NonNegativeInteger value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.NonNegativeInteger _value1 = new org.apache.axis.types.NonNegativeInteger("0");
    public static final org.apache.axis.types.NonNegativeInteger _value2 = new org.apache.axis.types.NonNegativeInteger("1");
    public static final org.apache.axis.types.NonNegativeInteger _value3 = new org.apache.axis.types.NonNegativeInteger("2");
    public static final org.apache.axis.types.NonNegativeInteger _value4 = new org.apache.axis.types.NonNegativeInteger("3");
    public static final org.apache.axis.types.NonNegativeInteger _value5 = new org.apache.axis.types.NonNegativeInteger("4");
    public static final org.apache.axis.types.NonNegativeInteger _value6 = new org.apache.axis.types.NonNegativeInteger("5");
    public static final org.apache.axis.types.NonNegativeInteger _value7 = new org.apache.axis.types.NonNegativeInteger("6");
    public static final DmIndTpDeducao value1 = new DmIndTpDeducao(_value1);
    public static final DmIndTpDeducao value2 = new DmIndTpDeducao(_value2);
    public static final DmIndTpDeducao value3 = new DmIndTpDeducao(_value3);
    public static final DmIndTpDeducao value4 = new DmIndTpDeducao(_value4);
    public static final DmIndTpDeducao value5 = new DmIndTpDeducao(_value5);
    public static final DmIndTpDeducao value6 = new DmIndTpDeducao(_value6);
    public static final DmIndTpDeducao value7 = new DmIndTpDeducao(_value7);
    public org.apache.axis.types.NonNegativeInteger getValue() { return _value_;}
    public static DmIndTpDeducao fromValue(org.apache.axis.types.NonNegativeInteger value)
          throws java.lang.IllegalArgumentException {
        DmIndTpDeducao enumeration = (DmIndTpDeducao)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static DmIndTpDeducao fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        try {
            return fromValue(new org.apache.axis.types.NonNegativeInteger(value));
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
        new org.apache.axis.description.TypeDesc(DmIndTpDeducao.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/pagamentoImpRet", "dmIndTpDeducao"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
