/**
 * DmInd2.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.pagamentoImpRet;

public class DmInd2 implements java.io.Serializable {
    private org.apache.axis.types.NonNegativeInteger _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected DmInd2(org.apache.axis.types.NonNegativeInteger value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.NonNegativeInteger _value1 = new org.apache.axis.types.NonNegativeInteger("1");
    public static final org.apache.axis.types.NonNegativeInteger _value2 = new org.apache.axis.types.NonNegativeInteger("2");
    public static final DmInd2 value1 = new DmInd2(_value1);
    public static final DmInd2 value2 = new DmInd2(_value2);
    public org.apache.axis.types.NonNegativeInteger getValue() { return _value_;}
    public static DmInd2 fromValue(org.apache.axis.types.NonNegativeInteger value)
          throws java.lang.IllegalArgumentException {
        DmInd2 enumeration = (DmInd2)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static DmInd2 fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(DmInd2.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://modelo.compliancefiscal.com.br/integracao/domain/cadastros/v1/pagamentoImpRet", "dmInd2"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
