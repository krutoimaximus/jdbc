/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.benfante.jdbc.swig;

public class PGnotify {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected PGnotify(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(PGnotify obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        pqJNI.delete_PGnotify(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setRelname(String value) {
    pqJNI.PGnotify_relname_set(swigCPtr, this, value);
  }

  public String getRelname() {
    return pqJNI.PGnotify_relname_get(swigCPtr, this);
  }

  public void setBe_pid(int value) {
    pqJNI.PGnotify_be_pid_set(swigCPtr, this, value);
  }

  public int getBe_pid() {
    return pqJNI.PGnotify_be_pid_get(swigCPtr, this);
  }

  public void setExtra(String value) {
    pqJNI.PGnotify_extra_set(swigCPtr, this, value);
  }

  public String getExtra() {
    return pqJNI.PGnotify_extra_get(swigCPtr, this);
  }

  public void setNext(PGnotify value) {
    pqJNI.PGnotify_next_set(swigCPtr, this, PGnotify.getCPtr(value), value);
  }

  public PGnotify getNext() {
    long cPtr = pqJNI.PGnotify_next_get(swigCPtr, this);
    return (cPtr == 0) ? null : new PGnotify(cPtr, false);
  }

  public PGnotify() {
    this(pqJNI.new_PGnotify(), true);
  }

}
