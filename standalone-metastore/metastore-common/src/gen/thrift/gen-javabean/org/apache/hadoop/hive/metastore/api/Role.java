/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hive.metastore.api;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.16.0)")
@org.apache.hadoop.classification.InterfaceAudience.Public @org.apache.hadoop.classification.InterfaceStability.Stable public class Role implements org.apache.thrift.TBase<Role, Role._Fields>, java.io.Serializable, Cloneable, Comparable<Role> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Role");

  private static final org.apache.thrift.protocol.TField ROLE_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("roleName", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField CREATE_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("createTime", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField OWNER_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("ownerName", org.apache.thrift.protocol.TType.STRING, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new RoleStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new RoleTupleSchemeFactory();

  private @org.apache.thrift.annotation.Nullable java.lang.String roleName; // required
  private int createTime; // required
  private @org.apache.thrift.annotation.Nullable java.lang.String ownerName; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ROLE_NAME((short)1, "roleName"),
    CREATE_TIME((short)2, "createTime"),
    OWNER_NAME((short)3, "ownerName");

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
        case 1: // ROLE_NAME
          return ROLE_NAME;
        case 2: // CREATE_TIME
          return CREATE_TIME;
        case 3: // OWNER_NAME
          return OWNER_NAME;
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
  private static final int __CREATETIME_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ROLE_NAME, new org.apache.thrift.meta_data.FieldMetaData("roleName", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CREATE_TIME, new org.apache.thrift.meta_data.FieldMetaData("createTime", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.OWNER_NAME, new org.apache.thrift.meta_data.FieldMetaData("ownerName", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Role.class, metaDataMap);
  }

  public Role() {
  }

  public Role(
    java.lang.String roleName,
    int createTime,
    java.lang.String ownerName)
  {
    this();
    this.roleName = roleName;
    this.createTime = createTime;
    setCreateTimeIsSet(true);
    this.ownerName = ownerName;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Role(Role other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetRoleName()) {
      this.roleName = other.roleName;
    }
    this.createTime = other.createTime;
    if (other.isSetOwnerName()) {
      this.ownerName = other.ownerName;
    }
  }

  public Role deepCopy() {
    return new Role(this);
  }

  @Override
  public void clear() {
    this.roleName = null;
    setCreateTimeIsSet(false);
    this.createTime = 0;
    this.ownerName = null;
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getRoleName() {
    return this.roleName;
  }

  public void setRoleName(@org.apache.thrift.annotation.Nullable java.lang.String roleName) {
    this.roleName = roleName;
  }

  public void unsetRoleName() {
    this.roleName = null;
  }

  /** Returns true if field roleName is set (has been assigned a value) and false otherwise */
  public boolean isSetRoleName() {
    return this.roleName != null;
  }

  public void setRoleNameIsSet(boolean value) {
    if (!value) {
      this.roleName = null;
    }
  }

  public int getCreateTime() {
    return this.createTime;
  }

  public void setCreateTime(int createTime) {
    this.createTime = createTime;
    setCreateTimeIsSet(true);
  }

  public void unsetCreateTime() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __CREATETIME_ISSET_ID);
  }

  /** Returns true if field createTime is set (has been assigned a value) and false otherwise */
  public boolean isSetCreateTime() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __CREATETIME_ISSET_ID);
  }

  public void setCreateTimeIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __CREATETIME_ISSET_ID, value);
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getOwnerName() {
    return this.ownerName;
  }

  public void setOwnerName(@org.apache.thrift.annotation.Nullable java.lang.String ownerName) {
    this.ownerName = ownerName;
  }

  public void unsetOwnerName() {
    this.ownerName = null;
  }

  /** Returns true if field ownerName is set (has been assigned a value) and false otherwise */
  public boolean isSetOwnerName() {
    return this.ownerName != null;
  }

  public void setOwnerNameIsSet(boolean value) {
    if (!value) {
      this.ownerName = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case ROLE_NAME:
      if (value == null) {
        unsetRoleName();
      } else {
        setRoleName((java.lang.String)value);
      }
      break;

    case CREATE_TIME:
      if (value == null) {
        unsetCreateTime();
      } else {
        setCreateTime((java.lang.Integer)value);
      }
      break;

    case OWNER_NAME:
      if (value == null) {
        unsetOwnerName();
      } else {
        setOwnerName((java.lang.String)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case ROLE_NAME:
      return getRoleName();

    case CREATE_TIME:
      return getCreateTime();

    case OWNER_NAME:
      return getOwnerName();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case ROLE_NAME:
      return isSetRoleName();
    case CREATE_TIME:
      return isSetCreateTime();
    case OWNER_NAME:
      return isSetOwnerName();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof Role)
      return this.equals((Role)that);
    return false;
  }

  public boolean equals(Role that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_roleName = true && this.isSetRoleName();
    boolean that_present_roleName = true && that.isSetRoleName();
    if (this_present_roleName || that_present_roleName) {
      if (!(this_present_roleName && that_present_roleName))
        return false;
      if (!this.roleName.equals(that.roleName))
        return false;
    }

    boolean this_present_createTime = true;
    boolean that_present_createTime = true;
    if (this_present_createTime || that_present_createTime) {
      if (!(this_present_createTime && that_present_createTime))
        return false;
      if (this.createTime != that.createTime)
        return false;
    }

    boolean this_present_ownerName = true && this.isSetOwnerName();
    boolean that_present_ownerName = true && that.isSetOwnerName();
    if (this_present_ownerName || that_present_ownerName) {
      if (!(this_present_ownerName && that_present_ownerName))
        return false;
      if (!this.ownerName.equals(that.ownerName))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetRoleName()) ? 131071 : 524287);
    if (isSetRoleName())
      hashCode = hashCode * 8191 + roleName.hashCode();

    hashCode = hashCode * 8191 + createTime;

    hashCode = hashCode * 8191 + ((isSetOwnerName()) ? 131071 : 524287);
    if (isSetOwnerName())
      hashCode = hashCode * 8191 + ownerName.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(Role other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetRoleName(), other.isSetRoleName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRoleName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.roleName, other.roleName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetCreateTime(), other.isSetCreateTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCreateTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.createTime, other.createTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetOwnerName(), other.isSetOwnerName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOwnerName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.ownerName, other.ownerName);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("Role(");
    boolean first = true;

    sb.append("roleName:");
    if (this.roleName == null) {
      sb.append("null");
    } else {
      sb.append(this.roleName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("createTime:");
    sb.append(this.createTime);
    first = false;
    if (!first) sb.append(", ");
    sb.append("ownerName:");
    if (this.ownerName == null) {
      sb.append("null");
    } else {
      sb.append(this.ownerName);
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class RoleStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public RoleStandardScheme getScheme() {
      return new RoleStandardScheme();
    }
  }

  private static class RoleStandardScheme extends org.apache.thrift.scheme.StandardScheme<Role> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Role struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ROLE_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.roleName = iprot.readString();
              struct.setRoleNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // CREATE_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.createTime = iprot.readI32();
              struct.setCreateTimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // OWNER_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.ownerName = iprot.readString();
              struct.setOwnerNameIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, Role struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.roleName != null) {
        oprot.writeFieldBegin(ROLE_NAME_FIELD_DESC);
        oprot.writeString(struct.roleName);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(CREATE_TIME_FIELD_DESC);
      oprot.writeI32(struct.createTime);
      oprot.writeFieldEnd();
      if (struct.ownerName != null) {
        oprot.writeFieldBegin(OWNER_NAME_FIELD_DESC);
        oprot.writeString(struct.ownerName);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class RoleTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public RoleTupleScheme getScheme() {
      return new RoleTupleScheme();
    }
  }

  private static class RoleTupleScheme extends org.apache.thrift.scheme.TupleScheme<Role> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Role struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetRoleName()) {
        optionals.set(0);
      }
      if (struct.isSetCreateTime()) {
        optionals.set(1);
      }
      if (struct.isSetOwnerName()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetRoleName()) {
        oprot.writeString(struct.roleName);
      }
      if (struct.isSetCreateTime()) {
        oprot.writeI32(struct.createTime);
      }
      if (struct.isSetOwnerName()) {
        oprot.writeString(struct.ownerName);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Role struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.roleName = iprot.readString();
        struct.setRoleNameIsSet(true);
      }
      if (incoming.get(1)) {
        struct.createTime = iprot.readI32();
        struct.setCreateTimeIsSet(true);
      }
      if (incoming.get(2)) {
        struct.ownerName = iprot.readString();
        struct.setOwnerNameIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

