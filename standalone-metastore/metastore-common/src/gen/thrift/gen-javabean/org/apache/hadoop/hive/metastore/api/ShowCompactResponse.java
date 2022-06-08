/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hive.metastore.api;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.16.0)")
@org.apache.hadoop.classification.InterfaceAudience.Public @org.apache.hadoop.classification.InterfaceStability.Stable public class ShowCompactResponse implements org.apache.thrift.TBase<ShowCompactResponse, ShowCompactResponse._Fields>, java.io.Serializable, Cloneable, Comparable<ShowCompactResponse> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ShowCompactResponse");

  private static final org.apache.thrift.protocol.TField COMPACTS_FIELD_DESC = new org.apache.thrift.protocol.TField("compacts", org.apache.thrift.protocol.TType.LIST, (short)1);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new ShowCompactResponseStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new ShowCompactResponseTupleSchemeFactory();

  private @org.apache.thrift.annotation.Nullable java.util.List<ShowCompactResponseElement> compacts; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    COMPACTS((short)1, "compacts");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // COMPACTS
          return COMPACTS;
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
    @org.apache.thrift.annotation.Nullable
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
    tmpMap.put(_Fields.COMPACTS, new org.apache.thrift.meta_data.FieldMetaData("compacts", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ShowCompactResponseElement.class))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ShowCompactResponse.class, metaDataMap);
  }

  public ShowCompactResponse() {
  }

  public ShowCompactResponse(
    java.util.List<ShowCompactResponseElement> compacts)
  {
    this();
    this.compacts = compacts;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ShowCompactResponse(ShowCompactResponse other) {
    if (other.isSetCompacts()) {
      java.util.List<ShowCompactResponseElement> __this__compacts = new java.util.ArrayList<ShowCompactResponseElement>(other.compacts.size());
      for (ShowCompactResponseElement other_element : other.compacts) {
        __this__compacts.add(new ShowCompactResponseElement(other_element));
      }
      this.compacts = __this__compacts;
    }
  }

  public ShowCompactResponse deepCopy() {
    return new ShowCompactResponse(this);
  }

  @Override
  public void clear() {
    this.compacts = null;
  }

  public int getCompactsSize() {
    return (this.compacts == null) ? 0 : this.compacts.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<ShowCompactResponseElement> getCompactsIterator() {
    return (this.compacts == null) ? null : this.compacts.iterator();
  }

  public void addToCompacts(ShowCompactResponseElement elem) {
    if (this.compacts == null) {
      this.compacts = new java.util.ArrayList<ShowCompactResponseElement>();
    }
    this.compacts.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<ShowCompactResponseElement> getCompacts() {
    return this.compacts;
  }

  public void setCompacts(@org.apache.thrift.annotation.Nullable java.util.List<ShowCompactResponseElement> compacts) {
    this.compacts = compacts;
  }

  public void unsetCompacts() {
    this.compacts = null;
  }

  /** Returns true if field compacts is set (has been assigned a value) and false otherwise */
  public boolean isSetCompacts() {
    return this.compacts != null;
  }

  public void setCompactsIsSet(boolean value) {
    if (!value) {
      this.compacts = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case COMPACTS:
      if (value == null) {
        unsetCompacts();
      } else {
        setCompacts((java.util.List<ShowCompactResponseElement>)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case COMPACTS:
      return getCompacts();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case COMPACTS:
      return isSetCompacts();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof ShowCompactResponse)
      return this.equals((ShowCompactResponse)that);
    return false;
  }

  public boolean equals(ShowCompactResponse that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_compacts = true && this.isSetCompacts();
    boolean that_present_compacts = true && that.isSetCompacts();
    if (this_present_compacts || that_present_compacts) {
      if (!(this_present_compacts && that_present_compacts))
        return false;
      if (!this.compacts.equals(that.compacts))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetCompacts()) ? 131071 : 524287);
    if (isSetCompacts())
      hashCode = hashCode * 8191 + compacts.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(ShowCompactResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetCompacts(), other.isSetCompacts());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCompacts()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.compacts, other.compacts);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("ShowCompactResponse(");
    boolean first = true;

    sb.append("compacts:");
    if (this.compacts == null) {
      sb.append("null");
    } else {
      sb.append(this.compacts);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetCompacts()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'compacts' is unset! Struct:" + toString());
    }

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

  private static class ShowCompactResponseStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ShowCompactResponseStandardScheme getScheme() {
      return new ShowCompactResponseStandardScheme();
    }
  }

  private static class ShowCompactResponseStandardScheme extends org.apache.thrift.scheme.StandardScheme<ShowCompactResponse> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ShowCompactResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // COMPACTS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list864 = iprot.readListBegin();
                struct.compacts = new java.util.ArrayList<ShowCompactResponseElement>(_list864.size);
                @org.apache.thrift.annotation.Nullable ShowCompactResponseElement _elem865;
                for (int _i866 = 0; _i866 < _list864.size; ++_i866)
                {
                  _elem865 = new ShowCompactResponseElement();
                  _elem865.read(iprot);
                  struct.compacts.add(_elem865);
                }
                iprot.readListEnd();
              }
              struct.setCompactsIsSet(true);
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
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, ShowCompactResponse struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.compacts != null) {
        oprot.writeFieldBegin(COMPACTS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.compacts.size()));
          for (ShowCompactResponseElement _iter867 : struct.compacts)
          {
            _iter867.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ShowCompactResponseTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ShowCompactResponseTupleScheme getScheme() {
      return new ShowCompactResponseTupleScheme();
    }
  }

  private static class ShowCompactResponseTupleScheme extends org.apache.thrift.scheme.TupleScheme<ShowCompactResponse> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ShowCompactResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      {
        oprot.writeI32(struct.compacts.size());
        for (ShowCompactResponseElement _iter868 : struct.compacts)
        {
          _iter868.write(oprot);
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ShowCompactResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      {
        org.apache.thrift.protocol.TList _list869 = iprot.readListBegin(org.apache.thrift.protocol.TType.STRUCT);
        struct.compacts = new java.util.ArrayList<ShowCompactResponseElement>(_list869.size);
        @org.apache.thrift.annotation.Nullable ShowCompactResponseElement _elem870;
        for (int _i871 = 0; _i871 < _list869.size; ++_i871)
        {
          _elem870 = new ShowCompactResponseElement();
          _elem870.read(iprot);
          struct.compacts.add(_elem870);
        }
      }
      struct.setCompactsIsSet(true);
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

