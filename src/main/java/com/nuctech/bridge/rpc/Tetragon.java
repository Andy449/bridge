/**
 * Autogenerated by Thrift Compiler (0.12.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.nuctech.bridge.rpc;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.12.0)", date = "2019-12-16")
public class Tetragon implements org.apache.thrift.TBase<Tetragon, Tetragon._Fields>, java.io.Serializable, Cloneable, Comparable<Tetragon> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Tetragon");

  private static final org.apache.thrift.protocol.TField X1_FIELD_DESC = new org.apache.thrift.protocol.TField("x1", org.apache.thrift.protocol.TType.DOUBLE, (short)1);
  private static final org.apache.thrift.protocol.TField Y1_FIELD_DESC = new org.apache.thrift.protocol.TField("y1", org.apache.thrift.protocol.TType.DOUBLE, (short)2);
  private static final org.apache.thrift.protocol.TField X2_FIELD_DESC = new org.apache.thrift.protocol.TField("x2", org.apache.thrift.protocol.TType.DOUBLE, (short)3);
  private static final org.apache.thrift.protocol.TField Y2_FIELD_DESC = new org.apache.thrift.protocol.TField("y2", org.apache.thrift.protocol.TType.DOUBLE, (short)4);
  private static final org.apache.thrift.protocol.TField X3_FIELD_DESC = new org.apache.thrift.protocol.TField("x3", org.apache.thrift.protocol.TType.DOUBLE, (short)5);
  private static final org.apache.thrift.protocol.TField Y3_FIELD_DESC = new org.apache.thrift.protocol.TField("y3", org.apache.thrift.protocol.TType.DOUBLE, (short)6);
  private static final org.apache.thrift.protocol.TField X4_FIELD_DESC = new org.apache.thrift.protocol.TField("x4", org.apache.thrift.protocol.TType.DOUBLE, (short)7);
  private static final org.apache.thrift.protocol.TField Y4_FIELD_DESC = new org.apache.thrift.protocol.TField("y4", org.apache.thrift.protocol.TType.DOUBLE, (short)8);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TetragonStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TetragonTupleSchemeFactory();

  public double x1; // required
  public double y1; // required
  public double x2; // required
  public double y2; // required
  public double x3; // required
  public double y3; // required
  public double x4; // required
  public double y4; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    X1((short)1, "x1"),
    Y1((short)2, "y1"),
    X2((short)3, "x2"),
    Y2((short)4, "y2"),
    X3((short)5, "x3"),
    Y3((short)6, "y3"),
    X4((short)7, "x4"),
    Y4((short)8, "y4");

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
        case 1: // X1
          return X1;
        case 2: // Y1
          return Y1;
        case 3: // X2
          return X2;
        case 4: // Y2
          return Y2;
        case 5: // X3
          return X3;
        case 6: // Y3
          return Y3;
        case 7: // X4
          return X4;
        case 8: // Y4
          return Y4;
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
  private static final int __X1_ISSET_ID = 0;
  private static final int __Y1_ISSET_ID = 1;
  private static final int __X2_ISSET_ID = 2;
  private static final int __Y2_ISSET_ID = 3;
  private static final int __X3_ISSET_ID = 4;
  private static final int __Y3_ISSET_ID = 5;
  private static final int __X4_ISSET_ID = 6;
  private static final int __Y4_ISSET_ID = 7;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.X1, new org.apache.thrift.meta_data.FieldMetaData("x1", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.Y1, new org.apache.thrift.meta_data.FieldMetaData("y1", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.X2, new org.apache.thrift.meta_data.FieldMetaData("x2", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.Y2, new org.apache.thrift.meta_data.FieldMetaData("y2", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.X3, new org.apache.thrift.meta_data.FieldMetaData("x3", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.Y3, new org.apache.thrift.meta_data.FieldMetaData("y3", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.X4, new org.apache.thrift.meta_data.FieldMetaData("x4", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.Y4, new org.apache.thrift.meta_data.FieldMetaData("y4", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Tetragon.class, metaDataMap);
  }

  public Tetragon() {
  }

  public Tetragon(
    double x1,
    double y1,
    double x2,
    double y2,
    double x3,
    double y3,
    double x4,
    double y4)
  {
    this();
    this.x1 = x1;
    setX1IsSet(true);
    this.y1 = y1;
    setY1IsSet(true);
    this.x2 = x2;
    setX2IsSet(true);
    this.y2 = y2;
    setY2IsSet(true);
    this.x3 = x3;
    setX3IsSet(true);
    this.y3 = y3;
    setY3IsSet(true);
    this.x4 = x4;
    setX4IsSet(true);
    this.y4 = y4;
    setY4IsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Tetragon(Tetragon other) {
    __isset_bitfield = other.__isset_bitfield;
    this.x1 = other.x1;
    this.y1 = other.y1;
    this.x2 = other.x2;
    this.y2 = other.y2;
    this.x3 = other.x3;
    this.y3 = other.y3;
    this.x4 = other.x4;
    this.y4 = other.y4;
  }

  public Tetragon deepCopy() {
    return new Tetragon(this);
  }

  @Override
  public void clear() {
    setX1IsSet(false);
    this.x1 = 0.0;
    setY1IsSet(false);
    this.y1 = 0.0;
    setX2IsSet(false);
    this.x2 = 0.0;
    setY2IsSet(false);
    this.y2 = 0.0;
    setX3IsSet(false);
    this.x3 = 0.0;
    setY3IsSet(false);
    this.y3 = 0.0;
    setX4IsSet(false);
    this.x4 = 0.0;
    setY4IsSet(false);
    this.y4 = 0.0;
  }

  public double getX1() {
    return this.x1;
  }

  public Tetragon setX1(double x1) {
    this.x1 = x1;
    setX1IsSet(true);
    return this;
  }

  public void unsetX1() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __X1_ISSET_ID);
  }

  /** Returns true if field x1 is set (has been assigned a value) and false otherwise */
  public boolean isSetX1() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __X1_ISSET_ID);
  }

  public void setX1IsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __X1_ISSET_ID, value);
  }

  public double getY1() {
    return this.y1;
  }

  public Tetragon setY1(double y1) {
    this.y1 = y1;
    setY1IsSet(true);
    return this;
  }

  public void unsetY1() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __Y1_ISSET_ID);
  }

  /** Returns true if field y1 is set (has been assigned a value) and false otherwise */
  public boolean isSetY1() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __Y1_ISSET_ID);
  }

  public void setY1IsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __Y1_ISSET_ID, value);
  }

  public double getX2() {
    return this.x2;
  }

  public Tetragon setX2(double x2) {
    this.x2 = x2;
    setX2IsSet(true);
    return this;
  }

  public void unsetX2() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __X2_ISSET_ID);
  }

  /** Returns true if field x2 is set (has been assigned a value) and false otherwise */
  public boolean isSetX2() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __X2_ISSET_ID);
  }

  public void setX2IsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __X2_ISSET_ID, value);
  }

  public double getY2() {
    return this.y2;
  }

  public Tetragon setY2(double y2) {
    this.y2 = y2;
    setY2IsSet(true);
    return this;
  }

  public void unsetY2() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __Y2_ISSET_ID);
  }

  /** Returns true if field y2 is set (has been assigned a value) and false otherwise */
  public boolean isSetY2() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __Y2_ISSET_ID);
  }

  public void setY2IsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __Y2_ISSET_ID, value);
  }

  public double getX3() {
    return this.x3;
  }

  public Tetragon setX3(double x3) {
    this.x3 = x3;
    setX3IsSet(true);
    return this;
  }

  public void unsetX3() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __X3_ISSET_ID);
  }

  /** Returns true if field x3 is set (has been assigned a value) and false otherwise */
  public boolean isSetX3() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __X3_ISSET_ID);
  }

  public void setX3IsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __X3_ISSET_ID, value);
  }

  public double getY3() {
    return this.y3;
  }

  public Tetragon setY3(double y3) {
    this.y3 = y3;
    setY3IsSet(true);
    return this;
  }

  public void unsetY3() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __Y3_ISSET_ID);
  }

  /** Returns true if field y3 is set (has been assigned a value) and false otherwise */
  public boolean isSetY3() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __Y3_ISSET_ID);
  }

  public void setY3IsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __Y3_ISSET_ID, value);
  }

  public double getX4() {
    return this.x4;
  }

  public Tetragon setX4(double x4) {
    this.x4 = x4;
    setX4IsSet(true);
    return this;
  }

  public void unsetX4() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __X4_ISSET_ID);
  }

  /** Returns true if field x4 is set (has been assigned a value) and false otherwise */
  public boolean isSetX4() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __X4_ISSET_ID);
  }

  public void setX4IsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __X4_ISSET_ID, value);
  }

  public double getY4() {
    return this.y4;
  }

  public Tetragon setY4(double y4) {
    this.y4 = y4;
    setY4IsSet(true);
    return this;
  }

  public void unsetY4() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __Y4_ISSET_ID);
  }

  /** Returns true if field y4 is set (has been assigned a value) and false otherwise */
  public boolean isSetY4() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __Y4_ISSET_ID);
  }

  public void setY4IsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __Y4_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field,  java.lang.Object value) {
    switch (field) {
    case X1:
      if (value == null) {
        unsetX1();
      } else {
        setX1((java.lang.Double)value);
      }
      break;

    case Y1:
      if (value == null) {
        unsetY1();
      } else {
        setY1((java.lang.Double)value);
      }
      break;

    case X2:
      if (value == null) {
        unsetX2();
      } else {
        setX2((java.lang.Double)value);
      }
      break;

    case Y2:
      if (value == null) {
        unsetY2();
      } else {
        setY2((java.lang.Double)value);
      }
      break;

    case X3:
      if (value == null) {
        unsetX3();
      } else {
        setX3((java.lang.Double)value);
      }
      break;

    case Y3:
      if (value == null) {
        unsetY3();
      } else {
        setY3((java.lang.Double)value);
      }
      break;

    case X4:
      if (value == null) {
        unsetX4();
      } else {
        setX4((java.lang.Double)value);
      }
      break;

    case Y4:
      if (value == null) {
        unsetY4();
      } else {
        setY4((java.lang.Double)value);
      }
      break;

    }
  }

  
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case X1:
      return getX1();

    case Y1:
      return getY1();

    case X2:
      return getX2();

    case Y2:
      return getY2();

    case X3:
      return getX3();

    case Y3:
      return getY3();

    case X4:
      return getX4();

    case Y4:
      return getY4();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case X1:
      return isSetX1();
    case Y1:
      return isSetY1();
    case X2:
      return isSetX2();
    case Y2:
      return isSetY2();
    case X3:
      return isSetX3();
    case Y3:
      return isSetY3();
    case X4:
      return isSetX4();
    case Y4:
      return isSetY4();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof Tetragon)
      return this.equals((Tetragon)that);
    return false;
  }

  public boolean equals(Tetragon that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_x1 = true;
    boolean that_present_x1 = true;
    if (this_present_x1 || that_present_x1) {
      if (!(this_present_x1 && that_present_x1))
        return false;
      if (this.x1 != that.x1)
        return false;
    }

    boolean this_present_y1 = true;
    boolean that_present_y1 = true;
    if (this_present_y1 || that_present_y1) {
      if (!(this_present_y1 && that_present_y1))
        return false;
      if (this.y1 != that.y1)
        return false;
    }

    boolean this_present_x2 = true;
    boolean that_present_x2 = true;
    if (this_present_x2 || that_present_x2) {
      if (!(this_present_x2 && that_present_x2))
        return false;
      if (this.x2 != that.x2)
        return false;
    }

    boolean this_present_y2 = true;
    boolean that_present_y2 = true;
    if (this_present_y2 || that_present_y2) {
      if (!(this_present_y2 && that_present_y2))
        return false;
      if (this.y2 != that.y2)
        return false;
    }

    boolean this_present_x3 = true;
    boolean that_present_x3 = true;
    if (this_present_x3 || that_present_x3) {
      if (!(this_present_x3 && that_present_x3))
        return false;
      if (this.x3 != that.x3)
        return false;
    }

    boolean this_present_y3 = true;
    boolean that_present_y3 = true;
    if (this_present_y3 || that_present_y3) {
      if (!(this_present_y3 && that_present_y3))
        return false;
      if (this.y3 != that.y3)
        return false;
    }

    boolean this_present_x4 = true;
    boolean that_present_x4 = true;
    if (this_present_x4 || that_present_x4) {
      if (!(this_present_x4 && that_present_x4))
        return false;
      if (this.x4 != that.x4)
        return false;
    }

    boolean this_present_y4 = true;
    boolean that_present_y4 = true;
    if (this_present_y4 || that_present_y4) {
      if (!(this_present_y4 && that_present_y4))
        return false;
      if (this.y4 != that.y4)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(x1);

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(y1);

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(x2);

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(y2);

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(x3);

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(y3);

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(x4);

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(y4);

    return hashCode;
  }

  @Override
  public int compareTo(Tetragon other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetX1()).compareTo(other.isSetX1());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetX1()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.x1, other.x1);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetY1()).compareTo(other.isSetY1());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetY1()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.y1, other.y1);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetX2()).compareTo(other.isSetX2());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetX2()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.x2, other.x2);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetY2()).compareTo(other.isSetY2());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetY2()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.y2, other.y2);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetX3()).compareTo(other.isSetX3());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetX3()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.x3, other.x3);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetY3()).compareTo(other.isSetY3());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetY3()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.y3, other.y3);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetX4()).compareTo(other.isSetX4());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetX4()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.x4, other.x4);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetY4()).compareTo(other.isSetY4());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetY4()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.y4, other.y4);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("Tetragon(");
    boolean first = true;

    sb.append("x1:");
    sb.append(this.x1);
    first = false;
    if (!first) sb.append(", ");
    sb.append("y1:");
    sb.append(this.y1);
    first = false;
    if (!first) sb.append(", ");
    sb.append("x2:");
    sb.append(this.x2);
    first = false;
    if (!first) sb.append(", ");
    sb.append("y2:");
    sb.append(this.y2);
    first = false;
    if (!first) sb.append(", ");
    sb.append("x3:");
    sb.append(this.x3);
    first = false;
    if (!first) sb.append(", ");
    sb.append("y3:");
    sb.append(this.y3);
    first = false;
    if (!first) sb.append(", ");
    sb.append("x4:");
    sb.append(this.x4);
    first = false;
    if (!first) sb.append(", ");
    sb.append("y4:");
    sb.append(this.y4);
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TetragonStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TetragonStandardScheme getScheme() {
      return new TetragonStandardScheme();
    }
  }

  private static class TetragonStandardScheme extends org.apache.thrift.scheme.StandardScheme<Tetragon> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Tetragon struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // X1
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.x1 = iprot.readDouble();
              struct.setX1IsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // Y1
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.y1 = iprot.readDouble();
              struct.setY1IsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // X2
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.x2 = iprot.readDouble();
              struct.setX2IsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // Y2
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.y2 = iprot.readDouble();
              struct.setY2IsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // X3
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.x3 = iprot.readDouble();
              struct.setX3IsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // Y3
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.y3 = iprot.readDouble();
              struct.setY3IsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // X4
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.x4 = iprot.readDouble();
              struct.setX4IsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 8: // Y4
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.y4 = iprot.readDouble();
              struct.setY4IsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, Tetragon struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(X1_FIELD_DESC);
      oprot.writeDouble(struct.x1);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(Y1_FIELD_DESC);
      oprot.writeDouble(struct.y1);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(X2_FIELD_DESC);
      oprot.writeDouble(struct.x2);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(Y2_FIELD_DESC);
      oprot.writeDouble(struct.y2);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(X3_FIELD_DESC);
      oprot.writeDouble(struct.x3);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(Y3_FIELD_DESC);
      oprot.writeDouble(struct.y3);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(X4_FIELD_DESC);
      oprot.writeDouble(struct.x4);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(Y4_FIELD_DESC);
      oprot.writeDouble(struct.y4);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TetragonTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TetragonTupleScheme getScheme() {
      return new TetragonTupleScheme();
    }
  }

  private static class TetragonTupleScheme extends org.apache.thrift.scheme.TupleScheme<Tetragon> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Tetragon struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetX1()) {
        optionals.set(0);
      }
      if (struct.isSetY1()) {
        optionals.set(1);
      }
      if (struct.isSetX2()) {
        optionals.set(2);
      }
      if (struct.isSetY2()) {
        optionals.set(3);
      }
      if (struct.isSetX3()) {
        optionals.set(4);
      }
      if (struct.isSetY3()) {
        optionals.set(5);
      }
      if (struct.isSetX4()) {
        optionals.set(6);
      }
      if (struct.isSetY4()) {
        optionals.set(7);
      }
      oprot.writeBitSet(optionals, 8);
      if (struct.isSetX1()) {
        oprot.writeDouble(struct.x1);
      }
      if (struct.isSetY1()) {
        oprot.writeDouble(struct.y1);
      }
      if (struct.isSetX2()) {
        oprot.writeDouble(struct.x2);
      }
      if (struct.isSetY2()) {
        oprot.writeDouble(struct.y2);
      }
      if (struct.isSetX3()) {
        oprot.writeDouble(struct.x3);
      }
      if (struct.isSetY3()) {
        oprot.writeDouble(struct.y3);
      }
      if (struct.isSetX4()) {
        oprot.writeDouble(struct.x4);
      }
      if (struct.isSetY4()) {
        oprot.writeDouble(struct.y4);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Tetragon struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(8);
      if (incoming.get(0)) {
        struct.x1 = iprot.readDouble();
        struct.setX1IsSet(true);
      }
      if (incoming.get(1)) {
        struct.y1 = iprot.readDouble();
        struct.setY1IsSet(true);
      }
      if (incoming.get(2)) {
        struct.x2 = iprot.readDouble();
        struct.setX2IsSet(true);
      }
      if (incoming.get(3)) {
        struct.y2 = iprot.readDouble();
        struct.setY2IsSet(true);
      }
      if (incoming.get(4)) {
        struct.x3 = iprot.readDouble();
        struct.setX3IsSet(true);
      }
      if (incoming.get(5)) {
        struct.y3 = iprot.readDouble();
        struct.setY3IsSet(true);
      }
      if (incoming.get(6)) {
        struct.x4 = iprot.readDouble();
        struct.setX4IsSet(true);
      }
      if (incoming.get(7)) {
        struct.y4 = iprot.readDouble();
        struct.setY4IsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

