/**
 * Autogenerated by Thrift Compiler (0.12.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.nuctech.bridge.rpc;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.12.0)", date = "2019-12-16")
public class GoodsLabelReply implements org.apache.thrift.TBase<GoodsLabelReply, GoodsLabelReply._Fields>, java.io.Serializable, Cloneable, Comparable<GoodsLabelReply> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("GoodsLabelReply");

  private static final org.apache.thrift.protocol.TField OBJS_FIELD_DESC = new org.apache.thrift.protocol.TField("objs", org.apache.thrift.protocol.TType.LIST, (short)1);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new GoodsLabelReplyStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new GoodsLabelReplyTupleSchemeFactory();

  public  java.util.List<TextObject> objs; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    OBJS((short)1, "objs");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // OBJS
          return OBJS;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.OBJS, new org.apache.thrift.meta_data.FieldMetaData("objs", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TextObject.class))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(GoodsLabelReply.class, metaDataMap);
  }

  public GoodsLabelReply() {
  }

  public GoodsLabelReply(
    java.util.List<TextObject> objs)
  {
    this();
    this.objs = objs;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public GoodsLabelReply(GoodsLabelReply other) {
    if (other.isSetObjs()) {
      java.util.List<TextObject> __this__objs = new java.util.ArrayList<TextObject>(other.objs.size());
      for (TextObject other_element : other.objs) {
        __this__objs.add(new TextObject(other_element));
      }
      this.objs = __this__objs;
    }
  }

  public GoodsLabelReply deepCopy() {
    return new GoodsLabelReply(this);
  }

  @Override
  public void clear() {
    this.objs = null;
  }

  public int getObjsSize() {
    return (this.objs == null) ? 0 : this.objs.size();
  }

  
  public java.util.Iterator<TextObject> getObjsIterator() {
    return (this.objs == null) ? null : this.objs.iterator();
  }

  public void addToObjs(TextObject elem) {
    if (this.objs == null) {
      this.objs = new java.util.ArrayList<TextObject>();
    }
    this.objs.add(elem);
  }

  
  public java.util.List<TextObject> getObjs() {
    return this.objs;
  }

  public GoodsLabelReply setObjs( java.util.List<TextObject> objs) {
    this.objs = objs;
    return this;
  }

  public void unsetObjs() {
    this.objs = null;
  }

  /** Returns true if field objs is set (has been assigned a value) and false otherwise */
  public boolean isSetObjs() {
    return this.objs != null;
  }

  public void setObjsIsSet(boolean value) {
    if (!value) {
      this.objs = null;
    }
  }

  public void setFieldValue(_Fields field,  java.lang.Object value) {
    switch (field) {
    case OBJS:
      if (value == null) {
        unsetObjs();
      } else {
        setObjs((java.util.List<TextObject>)value);
      }
      break;

    }
  }

  
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case OBJS:
      return getObjs();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case OBJS:
      return isSetObjs();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof GoodsLabelReply)
      return this.equals((GoodsLabelReply)that);
    return false;
  }

  public boolean equals(GoodsLabelReply that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_objs = true && this.isSetObjs();
    boolean that_present_objs = true && that.isSetObjs();
    if (this_present_objs || that_present_objs) {
      if (!(this_present_objs && that_present_objs))
        return false;
      if (!this.objs.equals(that.objs))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetObjs()) ? 131071 : 524287);
    if (isSetObjs())
      hashCode = hashCode * 8191 + objs.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(GoodsLabelReply other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetObjs()).compareTo(other.isSetObjs());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetObjs()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.objs, other.objs);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("GoodsLabelReply(");
    boolean first = true;

    sb.append("objs:");
    if (this.objs == null) {
      sb.append("null");
    } else {
      sb.append(this.objs);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class GoodsLabelReplyStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public GoodsLabelReplyStandardScheme getScheme() {
      return new GoodsLabelReplyStandardScheme();
    }
  }

  private static class GoodsLabelReplyStandardScheme extends org.apache.thrift.scheme.StandardScheme<GoodsLabelReply> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, GoodsLabelReply struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // OBJS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list16 = iprot.readListBegin();
                struct.objs = new java.util.ArrayList<TextObject>(_list16.size);
                 TextObject _elem17;
                for (int _i18 = 0; _i18 < _list16.size; ++_i18)
                {
                  _elem17 = new TextObject();
                  _elem17.read(iprot);
                  struct.objs.add(_elem17);
                }
                iprot.readListEnd();
              }
              struct.setObjsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, GoodsLabelReply struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.objs != null) {
        oprot.writeFieldBegin(OBJS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.objs.size()));
          for (TextObject _iter19 : struct.objs)
          {
            _iter19.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class GoodsLabelReplyTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public GoodsLabelReplyTupleScheme getScheme() {
      return new GoodsLabelReplyTupleScheme();
    }
  }

  private static class GoodsLabelReplyTupleScheme extends org.apache.thrift.scheme.TupleScheme<GoodsLabelReply> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, GoodsLabelReply struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetObjs()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetObjs()) {
        {
          oprot.writeI32(struct.objs.size());
          for (TextObject _iter20 : struct.objs)
          {
            _iter20.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, GoodsLabelReply struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list21 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.objs = new java.util.ArrayList<TextObject>(_list21.size);
           TextObject _elem22;
          for (int _i23 = 0; _i23 < _list21.size; ++_i23)
          {
            _elem22 = new TextObject();
            _elem22.read(iprot);
            struct.objs.add(_elem22);
          }
        }
        struct.setObjsIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

