/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.benfante.jdbc.swig;

public final class ExecStatusType {
  public final static ExecStatusType PGRES_EMPTY_QUERY = new ExecStatusType("PGRES_EMPTY_QUERY", pqJNI.PGRES_EMPTY_QUERY_get());
  public final static ExecStatusType PGRES_COMMAND_OK = new ExecStatusType("PGRES_COMMAND_OK");
  public final static ExecStatusType PGRES_TUPLES_OK = new ExecStatusType("PGRES_TUPLES_OK");
  public final static ExecStatusType PGRES_COPY_OUT = new ExecStatusType("PGRES_COPY_OUT");
  public final static ExecStatusType PGRES_COPY_IN = new ExecStatusType("PGRES_COPY_IN");
  public final static ExecStatusType PGRES_BAD_RESPONSE = new ExecStatusType("PGRES_BAD_RESPONSE");
  public final static ExecStatusType PGRES_NONFATAL_ERROR = new ExecStatusType("PGRES_NONFATAL_ERROR");
  public final static ExecStatusType PGRES_FATAL_ERROR = new ExecStatusType("PGRES_FATAL_ERROR");
  public final static ExecStatusType PGRES_COPY_BOTH = new ExecStatusType("PGRES_COPY_BOTH");
  public final static ExecStatusType PGRES_SINGLE_TUPLE = new ExecStatusType("PGRES_SINGLE_TUPLE");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static ExecStatusType swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + ExecStatusType.class + " with value " + swigValue);
  }

  private ExecStatusType(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private ExecStatusType(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private ExecStatusType(String swigName, ExecStatusType swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static ExecStatusType[] swigValues = { PGRES_EMPTY_QUERY, PGRES_COMMAND_OK, PGRES_TUPLES_OK, PGRES_COPY_OUT, PGRES_COPY_IN, PGRES_BAD_RESPONSE, PGRES_NONFATAL_ERROR, PGRES_FATAL_ERROR, PGRES_COPY_BOTH, PGRES_SINGLE_TUPLE };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

