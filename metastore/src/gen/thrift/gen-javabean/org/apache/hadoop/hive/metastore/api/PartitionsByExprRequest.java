/**
 * Autogenerated by Thrift Compiler (0.14.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hive.metastore.api;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.14.1)")
public class PartitionsByExprRequest implements org.apache.thrift.TBase<PartitionsByExprRequest, PartitionsByExprRequest._Fields>, java.io.Serializable, Cloneable, Comparable<PartitionsByExprRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("PartitionsByExprRequest");

  private static final org.apache.thrift.protocol.TField DB_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("dbName", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField TBL_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("tblName", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField EXPR_FIELD_DESC = new org.apache.thrift.protocol.TField("expr", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField DEFAULT_PARTITION_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("defaultPartitionName", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField MAX_PARTS_FIELD_DESC = new org.apache.thrift.protocol.TField("maxParts", org.apache.thrift.protocol.TType.I16, (short)5);
  private static final org.apache.thrift.protocol.TField CAT_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("catName", org.apache.thrift.protocol.TType.STRING, (short)6);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new PartitionsByExprRequestStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new PartitionsByExprRequestTupleSchemeFactory();

  private @org.apache.thrift.annotation.Nullable java.lang.String dbName; // required
  private @org.apache.thrift.annotation.Nullable java.lang.String tblName; // required
  private @org.apache.thrift.annotation.Nullable java.nio.ByteBuffer expr; // required
  private @org.apache.thrift.annotation.Nullable java.lang.String defaultPartitionName; // optional
  private short maxParts; // optional
  private @org.apache.thrift.annotation.Nullable java.lang.String catName; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    DB_NAME((short)1, "dbName"),
    TBL_NAME((short)2, "tblName"),
    EXPR((short)3, "expr"),
    DEFAULT_PARTITION_NAME((short)4, "defaultPartitionName"),
    MAX_PARTS((short)5, "maxParts"),
    CAT_NAME((short)6, "catName");

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
        case 2: // TBL_NAME
          return TBL_NAME;
        case 3: // EXPR
          return EXPR;
        case 4: // DEFAULT_PARTITION_NAME
          return DEFAULT_PARTITION_NAME;
        case 5: // MAX_PARTS
          return MAX_PARTS;
        case 6: // CAT_NAME
          return CAT_NAME;
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
  private static final int __MAXPARTS_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.DEFAULT_PARTITION_NAME,_Fields.MAX_PARTS,_Fields.CAT_NAME};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.DB_NAME, new org.apache.thrift.meta_data.FieldMetaData("dbName", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TBL_NAME, new org.apache.thrift.meta_data.FieldMetaData("tblName", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.EXPR, new org.apache.thrift.meta_data.FieldMetaData("expr", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    tmpMap.put(_Fields.DEFAULT_PARTITION_NAME, new org.apache.thrift.meta_data.FieldMetaData("defaultPartitionName", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.MAX_PARTS, new org.apache.thrift.meta_data.FieldMetaData("maxParts", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I16)));
    tmpMap.put(_Fields.CAT_NAME, new org.apache.thrift.meta_data.FieldMetaData("catName", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(PartitionsByExprRequest.class, metaDataMap);
  }

  public PartitionsByExprRequest() {
    this.maxParts = (short)-1;

  }

  public PartitionsByExprRequest(
    java.lang.String dbName,
    java.lang.String tblName,
    java.nio.ByteBuffer expr)
  {
    this();
    this.dbName = dbName;
    this.tblName = tblName;
    this.expr = org.apache.thrift.TBaseHelper.copyBinary(expr);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public PartitionsByExprRequest(PartitionsByExprRequest other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetDbName()) {
      this.dbName = other.dbName;
    }
    if (other.isSetTblName()) {
      this.tblName = other.tblName;
    }
    if (other.isSetExpr()) {
      this.expr = org.apache.thrift.TBaseHelper.copyBinary(other.expr);
    }
    if (other.isSetDefaultPartitionName()) {
      this.defaultPartitionName = other.defaultPartitionName;
    }
    this.maxParts = other.maxParts;
    if (other.isSetCatName()) {
      this.catName = other.catName;
    }
  }

  public PartitionsByExprRequest deepCopy() {
    return new PartitionsByExprRequest(this);
  }

  @Override
  public void clear() {
    this.dbName = null;
    this.tblName = null;
    this.expr = null;
    this.defaultPartitionName = null;
    this.maxParts = (short)-1;

    this.catName = null;
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
  public java.lang.String getTblName() {
    return this.tblName;
  }

  public void setTblName(@org.apache.thrift.annotation.Nullable java.lang.String tblName) {
    this.tblName = tblName;
  }

  public void unsetTblName() {
    this.tblName = null;
  }

  /** Returns true if field tblName is set (has been assigned a value) and false otherwise */
  public boolean isSetTblName() {
    return this.tblName != null;
  }

  public void setTblNameIsSet(boolean value) {
    if (!value) {
      this.tblName = null;
    }
  }

  public byte[] getExpr() {
    setExpr(org.apache.thrift.TBaseHelper.rightSize(expr));
    return expr == null ? null : expr.array();
  }

  public java.nio.ByteBuffer bufferForExpr() {
    return org.apache.thrift.TBaseHelper.copyBinary(expr);
  }

  public void setExpr(byte[] expr) {
    this.expr = expr == null ? (java.nio.ByteBuffer)null   : java.nio.ByteBuffer.wrap(expr.clone());
  }

  public void setExpr(@org.apache.thrift.annotation.Nullable java.nio.ByteBuffer expr) {
    this.expr = org.apache.thrift.TBaseHelper.copyBinary(expr);
  }

  public void unsetExpr() {
    this.expr = null;
  }

  /** Returns true if field expr is set (has been assigned a value) and false otherwise */
  public boolean isSetExpr() {
    return this.expr != null;
  }

  public void setExprIsSet(boolean value) {
    if (!value) {
      this.expr = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getDefaultPartitionName() {
    return this.defaultPartitionName;
  }

  public void setDefaultPartitionName(@org.apache.thrift.annotation.Nullable java.lang.String defaultPartitionName) {
    this.defaultPartitionName = defaultPartitionName;
  }

  public void unsetDefaultPartitionName() {
    this.defaultPartitionName = null;
  }

  /** Returns true if field defaultPartitionName is set (has been assigned a value) and false otherwise */
  public boolean isSetDefaultPartitionName() {
    return this.defaultPartitionName != null;
  }

  public void setDefaultPartitionNameIsSet(boolean value) {
    if (!value) {
      this.defaultPartitionName = null;
    }
  }

  public short getMaxParts() {
    return this.maxParts;
  }

  public void setMaxParts(short maxParts) {
    this.maxParts = maxParts;
    setMaxPartsIsSet(true);
  }

  public void unsetMaxParts() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __MAXPARTS_ISSET_ID);
  }

  /** Returns true if field maxParts is set (has been assigned a value) and false otherwise */
  public boolean isSetMaxParts() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __MAXPARTS_ISSET_ID);
  }

  public void setMaxPartsIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __MAXPARTS_ISSET_ID, value);
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getCatName() {
    return this.catName;
  }

  public void setCatName(@org.apache.thrift.annotation.Nullable java.lang.String catName) {
    this.catName = catName;
  }

  public void unsetCatName() {
    this.catName = null;
  }

  /** Returns true if field catName is set (has been assigned a value) and false otherwise */
  public boolean isSetCatName() {
    return this.catName != null;
  }

  public void setCatNameIsSet(boolean value) {
    if (!value) {
      this.catName = null;
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

    case TBL_NAME:
      if (value == null) {
        unsetTblName();
      } else {
        setTblName((java.lang.String)value);
      }
      break;

    case EXPR:
      if (value == null) {
        unsetExpr();
      } else {
        if (value instanceof byte[]) {
          setExpr((byte[])value);
        } else {
          setExpr((java.nio.ByteBuffer)value);
        }
      }
      break;

    case DEFAULT_PARTITION_NAME:
      if (value == null) {
        unsetDefaultPartitionName();
      } else {
        setDefaultPartitionName((java.lang.String)value);
      }
      break;

    case MAX_PARTS:
      if (value == null) {
        unsetMaxParts();
      } else {
        setMaxParts((java.lang.Short)value);
      }
      break;

    case CAT_NAME:
      if (value == null) {
        unsetCatName();
      } else {
        setCatName((java.lang.String)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case DB_NAME:
      return getDbName();

    case TBL_NAME:
      return getTblName();

    case EXPR:
      return getExpr();

    case DEFAULT_PARTITION_NAME:
      return getDefaultPartitionName();

    case MAX_PARTS:
      return getMaxParts();

    case CAT_NAME:
      return getCatName();

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
    case TBL_NAME:
      return isSetTblName();
    case EXPR:
      return isSetExpr();
    case DEFAULT_PARTITION_NAME:
      return isSetDefaultPartitionName();
    case MAX_PARTS:
      return isSetMaxParts();
    case CAT_NAME:
      return isSetCatName();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof PartitionsByExprRequest)
      return this.equals((PartitionsByExprRequest)that);
    return false;
  }

  public boolean equals(PartitionsByExprRequest that) {
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

    boolean this_present_tblName = true && this.isSetTblName();
    boolean that_present_tblName = true && that.isSetTblName();
    if (this_present_tblName || that_present_tblName) {
      if (!(this_present_tblName && that_present_tblName))
        return false;
      if (!this.tblName.equals(that.tblName))
        return false;
    }

    boolean this_present_expr = true && this.isSetExpr();
    boolean that_present_expr = true && that.isSetExpr();
    if (this_present_expr || that_present_expr) {
      if (!(this_present_expr && that_present_expr))
        return false;
      if (!this.expr.equals(that.expr))
        return false;
    }

    boolean this_present_defaultPartitionName = true && this.isSetDefaultPartitionName();
    boolean that_present_defaultPartitionName = true && that.isSetDefaultPartitionName();
    if (this_present_defaultPartitionName || that_present_defaultPartitionName) {
      if (!(this_present_defaultPartitionName && that_present_defaultPartitionName))
        return false;
      if (!this.defaultPartitionName.equals(that.defaultPartitionName))
        return false;
    }

    boolean this_present_maxParts = true && this.isSetMaxParts();
    boolean that_present_maxParts = true && that.isSetMaxParts();
    if (this_present_maxParts || that_present_maxParts) {
      if (!(this_present_maxParts && that_present_maxParts))
        return false;
      if (this.maxParts != that.maxParts)
        return false;
    }

    boolean this_present_catName = true && this.isSetCatName();
    boolean that_present_catName = true && that.isSetCatName();
    if (this_present_catName || that_present_catName) {
      if (!(this_present_catName && that_present_catName))
        return false;
      if (!this.catName.equals(that.catName))
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

    hashCode = hashCode * 8191 + ((isSetTblName()) ? 131071 : 524287);
    if (isSetTblName())
      hashCode = hashCode * 8191 + tblName.hashCode();

    hashCode = hashCode * 8191 + ((isSetExpr()) ? 131071 : 524287);
    if (isSetExpr())
      hashCode = hashCode * 8191 + expr.hashCode();

    hashCode = hashCode * 8191 + ((isSetDefaultPartitionName()) ? 131071 : 524287);
    if (isSetDefaultPartitionName())
      hashCode = hashCode * 8191 + defaultPartitionName.hashCode();

    hashCode = hashCode * 8191 + ((isSetMaxParts()) ? 131071 : 524287);
    if (isSetMaxParts())
      hashCode = hashCode * 8191 + maxParts;

    hashCode = hashCode * 8191 + ((isSetCatName()) ? 131071 : 524287);
    if (isSetCatName())
      hashCode = hashCode * 8191 + catName.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(PartitionsByExprRequest other) {
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
    lastComparison = java.lang.Boolean.compare(isSetTblName(), other.isSetTblName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTblName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tblName, other.tblName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetExpr(), other.isSetExpr());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetExpr()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.expr, other.expr);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetDefaultPartitionName(), other.isSetDefaultPartitionName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDefaultPartitionName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.defaultPartitionName, other.defaultPartitionName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetMaxParts(), other.isSetMaxParts());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMaxParts()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.maxParts, other.maxParts);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetCatName(), other.isSetCatName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCatName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.catName, other.catName);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("PartitionsByExprRequest(");
    boolean first = true;

    sb.append("dbName:");
    if (this.dbName == null) {
      sb.append("null");
    } else {
      sb.append(this.dbName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("tblName:");
    if (this.tblName == null) {
      sb.append("null");
    } else {
      sb.append(this.tblName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("expr:");
    if (this.expr == null) {
      sb.append("null");
    } else {
      org.apache.thrift.TBaseHelper.toString(this.expr, sb);
    }
    first = false;
    if (isSetDefaultPartitionName()) {
      if (!first) sb.append(", ");
      sb.append("defaultPartitionName:");
      if (this.defaultPartitionName == null) {
        sb.append("null");
      } else {
        sb.append(this.defaultPartitionName);
      }
      first = false;
    }
    if (isSetMaxParts()) {
      if (!first) sb.append(", ");
      sb.append("maxParts:");
      sb.append(this.maxParts);
      first = false;
    }
    if (isSetCatName()) {
      if (!first) sb.append(", ");
      sb.append("catName:");
      if (this.catName == null) {
        sb.append("null");
      } else {
        sb.append(this.catName);
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

    if (!isSetTblName()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'tblName' is unset! Struct:" + toString());
    }

    if (!isSetExpr()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'expr' is unset! Struct:" + toString());
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class PartitionsByExprRequestStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public PartitionsByExprRequestStandardScheme getScheme() {
      return new PartitionsByExprRequestStandardScheme();
    }
  }

  private static class PartitionsByExprRequestStandardScheme extends org.apache.thrift.scheme.StandardScheme<PartitionsByExprRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, PartitionsByExprRequest struct) throws org.apache.thrift.TException {
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
          case 2: // TBL_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.tblName = iprot.readString();
              struct.setTblNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // EXPR
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.expr = iprot.readBinary();
              struct.setExprIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // DEFAULT_PARTITION_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.defaultPartitionName = iprot.readString();
              struct.setDefaultPartitionNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // MAX_PARTS
            if (schemeField.type == org.apache.thrift.protocol.TType.I16) {
              struct.maxParts = iprot.readI16();
              struct.setMaxPartsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // CAT_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.catName = iprot.readString();
              struct.setCatNameIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, PartitionsByExprRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.dbName != null) {
        oprot.writeFieldBegin(DB_NAME_FIELD_DESC);
        oprot.writeString(struct.dbName);
        oprot.writeFieldEnd();
      }
      if (struct.tblName != null) {
        oprot.writeFieldBegin(TBL_NAME_FIELD_DESC);
        oprot.writeString(struct.tblName);
        oprot.writeFieldEnd();
      }
      if (struct.expr != null) {
        oprot.writeFieldBegin(EXPR_FIELD_DESC);
        oprot.writeBinary(struct.expr);
        oprot.writeFieldEnd();
      }
      if (struct.defaultPartitionName != null) {
        if (struct.isSetDefaultPartitionName()) {
          oprot.writeFieldBegin(DEFAULT_PARTITION_NAME_FIELD_DESC);
          oprot.writeString(struct.defaultPartitionName);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetMaxParts()) {
        oprot.writeFieldBegin(MAX_PARTS_FIELD_DESC);
        oprot.writeI16(struct.maxParts);
        oprot.writeFieldEnd();
      }
      if (struct.catName != null) {
        if (struct.isSetCatName()) {
          oprot.writeFieldBegin(CAT_NAME_FIELD_DESC);
          oprot.writeString(struct.catName);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class PartitionsByExprRequestTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public PartitionsByExprRequestTupleScheme getScheme() {
      return new PartitionsByExprRequestTupleScheme();
    }
  }

  private static class PartitionsByExprRequestTupleScheme extends org.apache.thrift.scheme.TupleScheme<PartitionsByExprRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, PartitionsByExprRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      oprot.writeString(struct.dbName);
      oprot.writeString(struct.tblName);
      oprot.writeBinary(struct.expr);
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetDefaultPartitionName()) {
        optionals.set(0);
      }
      if (struct.isSetMaxParts()) {
        optionals.set(1);
      }
      if (struct.isSetCatName()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetDefaultPartitionName()) {
        oprot.writeString(struct.defaultPartitionName);
      }
      if (struct.isSetMaxParts()) {
        oprot.writeI16(struct.maxParts);
      }
      if (struct.isSetCatName()) {
        oprot.writeString(struct.catName);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, PartitionsByExprRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      struct.dbName = iprot.readString();
      struct.setDbNameIsSet(true);
      struct.tblName = iprot.readString();
      struct.setTblNameIsSet(true);
      struct.expr = iprot.readBinary();
      struct.setExprIsSet(true);
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.defaultPartitionName = iprot.readString();
        struct.setDefaultPartitionNameIsSet(true);
      }
      if (incoming.get(1)) {
        struct.maxParts = iprot.readI16();
        struct.setMaxPartsIsSet(true);
      }
      if (incoming.get(2)) {
        struct.catName = iprot.readString();
        struct.setCatNameIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

