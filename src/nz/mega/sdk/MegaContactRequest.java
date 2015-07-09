/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package nz.mega.sdk;

public class MegaContactRequest {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected MegaContactRequest(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(MegaContactRequest obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  protected synchronized void delete() {   
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        megaJNI.delete_MegaContactRequest(swigCPtr);
      }
      swigCPtr = 0;
    }
}

   MegaContactRequest copy() {
    long cPtr = megaJNI.MegaContactRequest_copy(swigCPtr, this);
    return (cPtr == 0) ? null : new MegaContactRequest(cPtr, true);
  }

  public long getHandle() {
    return megaJNI.MegaContactRequest_getHandle(swigCPtr, this);
  }

  public String getSourceEmail() {
    return megaJNI.MegaContactRequest_getSourceEmail(swigCPtr, this);
  }

  public String getSourceMessage() {
    return megaJNI.MegaContactRequest_getSourceMessage(swigCPtr, this);
  }

  public String getTargetEmail() {
    return megaJNI.MegaContactRequest_getTargetEmail(swigCPtr, this);
  }

  public long getCreationTime() {
    return megaJNI.MegaContactRequest_getCreationTime(swigCPtr, this);
  }

  public long getModificationTime() {
    return megaJNI.MegaContactRequest_getModificationTime(swigCPtr, this);
  }

  public int getStatus() {
    return megaJNI.MegaContactRequest_getStatus(swigCPtr, this);
  }

  public boolean isOutgoing() {
    return megaJNI.MegaContactRequest_isOutgoing(swigCPtr, this);
  }

  public MegaContactRequest() {
    this(megaJNI.new_MegaContactRequest(), true);
  }

  public final static int STATUS_UNRESOLVED = 0;
  public final static int STATUS_ACCEPTED = STATUS_UNRESOLVED + 1;
  public final static int STATUS_DENIED = STATUS_ACCEPTED + 1;
  public final static int STATUS_IGNORED = STATUS_DENIED + 1;
  public final static int STATUS_DELETED = STATUS_IGNORED + 1;
  public final static int STATUS_REMINDED = STATUS_DELETED + 1;

  public final static int REPLY_ACTION_ACCEPT = 0;
  public final static int REPLY_ACTION_DENY = REPLY_ACTION_ACCEPT + 1;
  public final static int REPLY_ACTION_IGNORE = REPLY_ACTION_DENY + 1;

  public final static int INVITE_ACTION_ADD = 0;
  public final static int INVITE_ACTION_DELETE = INVITE_ACTION_ADD + 1;
  public final static int INVITE_ACTION_REMIND = INVITE_ACTION_DELETE + 1;

}