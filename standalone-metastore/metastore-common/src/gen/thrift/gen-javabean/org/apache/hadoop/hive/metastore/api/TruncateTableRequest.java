/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hive.metastore.api;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.16.0)")
@org.apache.hadoop.classification.InterfaceAudience.Public @org.apache.hadoop.classification.InterfaceStability.Stable public class TruncateTableRequest implements org.apache.thrift.TBase<TruncateTableRequest, TruncateTableRequest._Fields>, java.io.Serializable, Cloneable, Comparable<TruncateTableRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TruncateTableRequest");

  private static final org.apache.thrift.protocol.TField DB_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("dbName", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField TABLE_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("tableName", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField PART_NAMES_FIELD_DESC = new org.apache.thrift.protocol.TField("partNames", org.apache.thrift.protocol.TType.LIST, (short)3);
  private static final org.apache.thrift.protocol.TField WRITE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("writeId", org.apache.thrift.protocol.TType.I64, (short)4);
  private static final org.apache.thrift.protocol.TField VALID_WRITE_ID_LIST_FIELD_DESC = new org.apache.thrift.protocol.TField("validWriteIdList", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField ENVIRONMENT_CONTEXT_FIELD_DESC = new org.apache.thrift.protocol.TField("environmentContext", org.apache.thrift.protocol.TType.STRUCT, (short)6);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TruncateTableRequestStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TruncateTableRequestTupleSchemeFactory();

  private @org.apache.thrift.annotation.Nullable java.lang.String dbName; // required
  private @org.apache.thrift.annotation.Nullable java.lang.String tableName; // required
  private @org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> partNames; // optional
  private long writeId; // optional
  private @org.apache.thrift.annotation.Nullable java.lang.String validWriteIdList; // optional
  private @org.apache.thrift.annotation.Nullable EnvironmentContext environmentContext; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    DB_NAME((short)1, "dbName"),
    TABLE_NAME((short)2, "tableName"),
    PART_NAMES((short)3, "partNames"),
    WRITE_ID((short)4, "writeId"),
    VALID_WRITE_ID_LIST((short)5, "validWriteIdList"),
    ENVIRONMENT_CONTEXT((short)6, "environmentContext");

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
        case 1: // DB_NAME
          return DB_NAME;
        case 2: // TABLE_NAME
          return TABLE_NAME;
        case 3: // PART_NAMES
          return PART_NAMES;
        case 4: // WRITE_ID
          return WRITE_ID;
        case 5: // VALID_WRITE_ID_LIST
          return VALID_WRITE_ID_LIST;
        case 6: // ENVIRONMENT_CONTEXT
          return ENVIRONMENT_CONTEXT;
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
  private static final int __WRITEID_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.PART_NAMES,_Fields.WRITE_ID,_Fields.VALID_WRITE_ID_LIST,_Fields.ENVIRONMENT_CONTEXT};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.DB_NAME, new org.apache.thrift.meta_data.FieldMetaData("dbName", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TABLE_NAME, new org.apache.thrift.meta_data.FieldMetaData("tableName", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PART_NAMES, new org.apache.thrift.meta_data.FieldMetaData("partNames", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.WRITE_ID, new org.apache.thrift.meta_data.FieldMetaData("writeId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.VALID_WRITE_ID_LIST, new org.apache.thrift.meta_data.FieldMetaData("validWriteIdList", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ENVIRONMENT_CONTEXT, new org.apache.thrift.meta_data.FieldMetaData("environmentContext", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, EnvironmentContext.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TruncateTableRequest.class, metaDataMap);
  }

  public TruncateTableRequest() {
    this.writeId = -1L;

  }

  public TruncateTableRequest(
    java.lang.String dbName,
    java.lang.String tableName)
  {
    this();
    this.dbName = dbName;
    this.tableName = tableName;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TruncateTableRequest(TruncateTableRequest other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetDbName()) {
      this.dbName = other.dbName;
    }
    if (other.isSetTableName()) {
      this.tableName = other.tableName;
    }
    if (other.isSetPartNames()) {
      java.util.List<java.lang.String> __this__partNames = new java.util.ArrayList<java.lang.String>(other.partNames);
      this.partNames = __this__partNames;
    }
    this.writeId = other.writeId;
    if (other.isSetValidWriteIdList()) {
      this.validWriteIdList = other.validWriteIdList;
    }
    if (other.isSetEnvironmentContext()) {
      this.environmentContext = new EnvironmentContext(other.environmentContext);
    }
  }

  public TruncateTableRequest deepCopy() {
    return new TruncateTableRequest(this);
  }

  @Override
  public void clear() {
    this.dbName = null;
    this.tableName = null;
    this.partNames = null;
    this.writeId = -1L;

    this.validWriteIdList = null;
    this.environmentContext = null;
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getDbName() {
    return this.dbName;
  }

  public void setDbName(@org.apache.thrift.annotation.Nullable java.lang.String dbName) {
    this.dbName = dbName;
  }

  public void unsetDbName() {
    this.dbName = null;
  }

  /** Returns true if field dbName is set (has been assigned a value) and false otherwise */
  public boolean isSetDbName() {
    return this.dbName != null;
  }

  public void setDbNameIsSet(boolean value) {
    if (!value) {
      this.dbName = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getTableName() {
    return this.tableName;
  }

  public void setTableName(@org.apache.thrift.annotation.Nullable java.lang.String tableName) {
    this.tableName = tableName;
  }

  public void unsetTableName() {
    this.tableName = null;
  }

  /** Returns true if field tableName is set (has been assigned a value) and false otherwise */
  public boolean isSetTableName() {
    return this.tableName != null;
  }

  public void setTableNameIsSet(boolean value) {
    if (!value) {
      this.tableName = null;
    }
  }

  public int getPartNamesSize() {
    return (this.partNames == null) ? 0 : this.partNames.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<java.lang.String> getPartNamesIterator() {
    return (this.partNames == null) ? null : this.partNames.iterator();
  }

  public void addToPartNames(java.lang.String elem) {
    if (this.partNames == null) {
      this.partNames = new java.util.ArrayList<java.lang.String>();
    }
    this.partNames.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<java.lang.String> getPartNames() {
    return this.partNames;
  }

  public void setPartNames(@org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> partNames) {
    this.partNames = partNames;
  }

  public void unsetPartNames() {
    this.partNames = null;
  }

  /** Returns true if field partNames is set (has been assigned a value) and false otherwise */
  public boolean isSetPartNames() {
    return this.partNames != null;
  }

  public void setPartNamesIsSet(boolean value) {
    if (!value) {
      this.partNames = null;
    }
  }

  public long getWriteId() {
    return this.writeId;
  }

  public void setWriteId(long writeId) {
    this.writeId = writeId;
    setWriteIdIsSet(true);
  }

  public void unsetWriteId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __WRITEID_ISSET_ID);
  }

  /** Returns true if field writeId is set (has been assigned a value) and false otherwise */
  public boolean isSetWriteId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __WRITEID_ISSET_ID);
  }

  public void setWriteIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __WRITEID_ISSET_ID, value);
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getValidWriteIdList() {
    return this.validWriteIdList;
  }

  public void setValidWriteIdList(@org.apache.thrift.annotation.Nullable java.lang.String validWriteIdList) {
    this.validWriteIdList = validWriteIdList;
  }

  public void unsetValidWriteIdList() {
    this.validWriteIdList = null;
  }

  /** Returns true if field validWriteIdList is set (has been assigned a value) and false otherwise */
  public boolean isSetValidWriteIdList() {
    return this.validWriteIdList != null;
  }

  public void setValidWriteIdListIsSet(boolean value) {
    if (!value) {
      this.validWriteIdList = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public EnvironmentContext getEnvironmentContext() {
    return this.environmentContext;
  }

  public void setEnvironmentContext(@org.apache.thrift.annotation.Nullable EnvironmentContext environmentContext) {
    this.environmentContext = environmentContext;
  }

  public void unsetEnvironmentContext() {
    this.environmentContext = null;
  }

  /** Returns true if field environmentContext is set (has been assigned a value) and false otherwise */
  public boolean isSetEnvironmentContext() {
    return this.environmentContext != null;
  }

  public void setEnvironmentContextIsSet(boolean value) {
    if (!value) {
      this.environmentContext = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case DB_NAME:
      if (value == null) {
        unsetDbName();
      } else {
        setDbName((java.lang.String)value);
      }
      break;

    case TABLE_NAME:
      if (value == null) {
        unsetTableName();
      } else {
        setTableName((java.lang.String)value);
      }
      break;

    case PART_NAMES:
      if (value == null) {
        unsetPartNames();
      } else {
        setPartNames((java.util.List<java.lang.String>)value);
      }
      break;

    case WRITE_ID:
      if (value == null) {
        unsetWriteId();
      } else {
        setWriteId((java.lang.Long)value);
      }
      break;

    case VALID_WRITE_ID_LIST:
      if (value == null) {
        unsetValidWriteIdList();
      } else {
        setValidWriteIdList((java.lang.String)value);
      }
      break;

    case ENVIRONMENT_CONTEXT:
      if (value == null) {
        unsetEnvironmentContext();
      } else {
        setEnvironmentContext((EnvironmentContext)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case DB_NAME:
      return getDbName();

    case TABLE_NAME:
      return getTableName();

    case PART_NAMES:
      return getPartNames();

    case WRITE_ID:
      return getWriteId();

    case VALID_WRITE_ID_LIST:
      return getValidWriteIdList();

    case ENVIRONMENT_CONTEXT:
      return getEnvironmentContext();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case DB_NAME:
      return isSetDbName();
    case TABLE_NAME:
      return isSetTableName();
    case PART_NAMES:
      return isSetPartNames();
    case WRITE_ID:
      return isSetWriteId();
    case VALID_WRITE_ID_LIST:
      return isSetValidWriteIdList();
    case ENVIRONMENT_CONTEXT:
      return isSetEnvironmentContext();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof TruncateTableRequest)
      return this.equals((TruncateTableRequest)that);
    return false;
  }

  public boolean equals(TruncateTableRequest that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_dbName = true && this.isSetDbName();
    boolean that_present_dbName = true && that.isSetDbName();
    if (this_present_dbName || that_present_dbName) {
      if (!(this_present_dbName && that_present_dbName))
        return false;
      if (!this.dbName.equals(that.dbName))
        return false;
    }

    boolean this_present_tableName = true && this.isSetTableName();
    boolean that_present_tableName = true && that.isSetTableName();
    if (this_present_tableName || that_present_tableName) {
      if (!(this_present_tableName && that_present_tableName))
        return false;
      if (!this.tableName.equals(that.tableName))
        return false;
    }

    boolean this_present_partNames = true && this.isSetPartNames();
    boolean that_present_partNames = true && that.isSetPartNames();
    if (this_present_partNames || that_present_partNames) {
      if (!(this_present_partNames && that_present_partNames))
        return false;
      if (!this.partNames.equals(that.partNames))
        return false;
    }

    boolean this_present_writeId = true && this.isSetWriteId();
    boolean that_present_writeId = true && that.isSetWriteId();
    if (this_present_writeId || that_present_writeId) {
      if (!(this_present_writeId && that_present_writeId))
        return false;
      if (this.writeId != that.writeId)
        return false;
    }

    boolean this_present_validWriteIdList = true && this.isSetValidWriteIdList();
    boolean that_present_validWriteIdList = true && that.isSetValidWriteIdList();
    if (this_present_validWriteIdList || that_present_validWriteIdList) {
      if (!(this_present_validWriteIdList && that_present_validWriteIdList))
        return false;
      if (!this.validWriteIdList.equals(that.validWriteIdList))
        return false;
    }

    boolean this_present_environmentContext = true && this.isSetEnvironmentContext();
    boolean that_present_environmentContext = true && that.isSetEnvironmentContext();
    if (this_present_environmentContext || that_present_environmentContext) {
      if (!(this_present_environmentContext && that_present_environmentContext))
        return false;
      if (!this.environmentContext.equals(that.environmentContext))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetDbName()) ? 131071 : 524287);
    if (isSetDbName())
      hashCode = hashCode * 8191 + dbName.hashCode();

    hashCode = hashCode * 8191 + ((isSetTableName()) ? 131071 : 524287);
    if (isSetTableName())
      hashCode = hashCode * 8191 + tableName.hashCode();

    hashCode = hashCode * 8191 + ((isSetPartNames()) ? 131071 : 524287);
    if (isSetPartNames())
      hashCode = hashCode * 8191 + partNames.hashCode();

    hashCode = hashCode * 8191 + ((isSetWriteId()) ? 131071 : 524287);
    if (isSetWriteId())
      hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(writeId);

    hashCode = hashCode * 8191 + ((isSetValidWriteIdList()) ? 131071 : 524287);
    if (isSetValidWriteIdList())
      hashCode = hashCode * 8191 + validWriteIdList.hashCode();

    hashCode = hashCode * 8191 + ((isSetEnvironmentContext()) ? 131071 : 524287);
    if (isSetEnvironmentContext())
      hashCode = hashCode * 8191 + environmentContext.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TruncateTableRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetDbName(), other.isSetDbName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDbName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.dbName, other.dbName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetTableName(), other.isSetTableName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTableName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tableName, other.tableName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetPartNames(), other.isSetPartNames());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPartNames()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.partNames, other.partNames);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetWriteId(), other.isSetWriteId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetWriteId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.writeId, other.writeId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetValidWriteIdList(), other.isSetValidWriteIdList());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetValidWriteIdList()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.validWriteIdList, other.validWriteIdList);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetEnvironmentContext(), other.isSetEnvironmentContext());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEnvironmentContext()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.environmentContext, other.environmentContext);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TruncateTableRequest(");
    boolean first = true;

    sb.append("dbName:");
    if (this.dbName == null) {
      sb.append("null");
    } else {
      sb.append(this.dbName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("tableName:");
    if (this.tableName == null) {
      sb.append("null");
    } else {
      sb.append(this.tableName);
    }
    first = false;
    if (isSetPartNames()) {
      if (!first) sb.append(", ");
      sb.append("partNames:");
      if (this.partNames == null) {
        sb.append("null");
      } else {
        sb.append(this.partNames);
      }
      first = false;
    }
    if (isSetWriteId()) {
      if (!first) sb.append(", ");
      sb.append("writeId:");
      sb.append(this.writeId);
      first = false;
    }
    if (isSetValidWriteIdList()) {
      if (!first) sb.append(", ");
      sb.append("validWriteIdList:");
      if (this.validWriteIdList == null) {
        sb.append("null");
      } else {
        sb.append(this.validWriteIdList);
      }
      first = false;
    }
    if (isSetEnvironmentContext()) {
      if (!first) sb.append(", ");
      sb.append("environmentContext:");
      if (this.environmentContext == null) {
        sb.append("null");
      } else {
        sb.append(this.environmentContext);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetDbName()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'dbName' is unset! Struct:" + toString());
    }

    if (!isSetTableName()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'tableName' is unset! Struct:" + toString());
    }

    // check for sub-struct validity
    if (environmentContext != null) {
      environmentContext.validate();
    }
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

  private static class TruncateTableRequestStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TruncateTableRequestStandardScheme getScheme() {
      return new TruncateTableRequestStandardScheme();
    }
  }

  private static class TruncateTableRequestStandardScheme extends org.apache.thrift.scheme.StandardScheme<TruncateTableRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TruncateTableRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // DB_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.dbName = iprot.readString();
              struct.setDbNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TABLE_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.tableName = iprot.readString();
              struct.setTableNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // PART_NAMES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list136 = iprot.readListBegin();
                struct.partNames = new java.util.ArrayList<java.lang.String>(_list136.size);
                @org.apache.thrift.annotation.Nullable java.lang.String _elem137;
                for (int _i138 = 0; _i138 < _list136.size; ++_i138)
                {
                  _elem137 = iprot.readString();
                  struct.partNames.add(_elem137);
                }
                iprot.readListEnd();
              }
              struct.setPartNamesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // WRITE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.writeId = iprot.readI64();
              struct.setWriteIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // VALID_WRITE_ID_LIST
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.validWriteIdList = iprot.readString();
              struct.setValidWriteIdListIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // ENVIRONMENT_CONTEXT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.environmentContext = new EnvironmentContext();
              struct.environmentContext.read(iprot);
              struct.setEnvironmentContextIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TruncateTableRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.dbName != null) {
        oprot.writeFieldBegin(DB_NAME_FIELD_DESC);
        oprot.writeString(struct.dbName);
        oprot.writeFieldEnd();
      }
      if (struct.tableName != null) {
        oprot.writeFieldBegin(TABLE_NAME_FIELD_DESC);
        oprot.writeString(struct.tableName);
        oprot.writeFieldEnd();
      }
      if (struct.partNames != null) {
        if (struct.isSetPartNames()) {
          oprot.writeFieldBegin(PART_NAMES_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.partNames.size()));
            for (java.lang.String _iter139 : struct.partNames)
            {
              oprot.writeString(_iter139);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetWriteId()) {
        oprot.writeFieldBegin(WRITE_ID_FIELD_DESC);
        oprot.writeI64(struct.writeId);
        oprot.writeFieldEnd();
      }
      if (struct.validWriteIdList != null) {
        if (struct.isSetValidWriteIdList()) {
          oprot.writeFieldBegin(VALID_WRITE_ID_LIST_FIELD_DESC);
          oprot.writeString(struct.validWriteIdList);
          oprot.writeFieldEnd();
        }
      }
      if (struct.environmentContext != null) {
        if (struct.isSetEnvironmentContext()) {
          oprot.writeFieldBegin(ENVIRONMENT_CONTEXT_FIELD_DESC);
          struct.environmentContext.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TruncateTableRequestTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TruncateTableRequestTupleScheme getScheme() {
      return new TruncateTableRequestTupleScheme();
    }
  }

  private static class TruncateTableRequestTupleScheme extends org.apache.thrift.scheme.TupleScheme<TruncateTableRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TruncateTableRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeString(struct.dbName);
      oprot.writeString(struct.tableName);
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetPartNames()) {
        optionals.set(0);
      }
      if (struct.isSetWriteId()) {
        optionals.set(1);
      }
      if (struct.isSetValidWriteIdList()) {
        optionals.set(2);
      }
      if (struct.isSetEnvironmentContext()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetPartNames()) {
        {
          oprot.writeI32(struct.partNames.size());
          for (java.lang.String _iter140 : struct.partNames)
          {
            oprot.writeString(_iter140);
          }
        }
      }
      if (struct.isSetWriteId()) {
        oprot.writeI64(struct.writeId);
      }
      if (struct.isSetValidWriteIdList()) {
        oprot.writeString(struct.validWriteIdList);
      }
      if (struct.isSetEnvironmentContext()) {
        struct.environmentContext.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TruncateTableRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.dbName = iprot.readString();
      struct.setDbNameIsSet(true);
      struct.tableName = iprot.readString();
      struct.setTableNameIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list141 = iprot.readListBegin(org.apache.thrift.protocol.TType.STRING);
          struct.partNames = new java.util.ArrayList<java.lang.String>(_list141.size);
          @org.apache.thrift.annotation.Nullable java.lang.String _elem142;
          for (int _i143 = 0; _i143 < _list141.size; ++_i143)
          {
            _elem142 = iprot.readString();
            struct.partNames.add(_elem142);
          }
        }
        struct.setPartNamesIsSet(true);
      }
      if (incoming.get(1)) {
        struct.writeId = iprot.readI64();
        struct.setWriteIdIsSet(true);
      }
      if (incoming.get(2)) {
        struct.validWriteIdList = iprot.readString();
        struct.setValidWriteIdListIsSet(true);
      }
      if (incoming.get(3)) {
        struct.environmentContext = new EnvironmentContext();
        struct.environmentContext.read(iprot);
        struct.setEnvironmentContextIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

