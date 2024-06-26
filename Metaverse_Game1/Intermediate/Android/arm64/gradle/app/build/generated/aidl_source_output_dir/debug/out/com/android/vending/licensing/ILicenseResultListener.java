/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: /Users/germancantu/Library/Android/sdk/build-tools/35.0.0-rc4/aidl -p/Users/germancantu/Library/Android/sdk/platforms/android-32/framework.aidl -o/Users/germancantu/Documents/GitHub/Metaverse-Game1/Metaverse_Game1/Intermediate/Android/arm64/gradle/app/build/generated/aidl_source_output_dir/debug/out -I/Users/germancantu/Documents/GitHub/Metaverse-Game1/Metaverse_Game1/Intermediate/Android/arm64/gradle/app/src/main/java -I/Users/germancantu/Documents/GitHub/Metaverse-Game1/Metaverse_Game1/Intermediate/Android/arm64/gradle/app/src/debug/aidl -I/Users/germancantu/.gradle/caches/transforms-3/abedd8388bdbd55803e370bace33339f/transformed/media-1.0.0/aidl -I/Users/germancantu/.gradle/caches/transforms-3/87c712ceb280b89563e287f590257de7/transformed/core-1.3.0/aidl -I/Users/germancantu/.gradle/caches/transforms-3/7a1ff5a23d45e8270cb10429ea4d29f7/transformed/versionedparcelable-1.1.0/aidl -I/Users/germancantu/Documents/GitHub/Metaverse-Game1/Metaverse_Game1/Intermediate/Android/arm64/gradle/downloader_library/build/intermediates/aidl_parcelable/debug/out -I/Users/germancantu/Documents/GitHub/Metaverse-Game1/Metaverse_Game1/Intermediate/Android/arm64/gradle/permission_library/build/intermediates/aidl_parcelable/debug/out -d/var/folders/y3/zn5b6c_5253g6ykct6d4zhcr0000gn/T/aidl270970709385257366.d /Users/germancantu/Documents/GitHub/Metaverse-Game1/Metaverse_Game1/Intermediate/Android/arm64/gradle/app/src/main/java/com/android/vending/licensing/ILicenseResultListener.aidl
 */
package com.android.vending.licensing;
public interface ILicenseResultListener extends android.os.IInterface
{
  /** Default implementation for ILicenseResultListener. */
  public static class Default implements com.android.vending.licensing.ILicenseResultListener
  {
    @Override public void verifyLicense(int responseCode, java.lang.String signedData, java.lang.String signature) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements com.android.vending.licensing.ILicenseResultListener
  {
    /** Construct the stub at attach it to the interface. */
    @SuppressWarnings("this-escape")
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an com.android.vending.licensing.ILicenseResultListener interface,
     * generating a proxy if needed.
     */
    public static com.android.vending.licensing.ILicenseResultListener asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof com.android.vending.licensing.ILicenseResultListener))) {
        return ((com.android.vending.licensing.ILicenseResultListener)iin);
      }
      return new com.android.vending.licensing.ILicenseResultListener.Stub.Proxy(obj);
    }
    @Override public android.os.IBinder asBinder()
    {
      return this;
    }
    @Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
    {
      java.lang.String descriptor = DESCRIPTOR;
      if (code >= android.os.IBinder.FIRST_CALL_TRANSACTION && code <= android.os.IBinder.LAST_CALL_TRANSACTION) {
        data.enforceInterface(descriptor);
      }
      if (code == INTERFACE_TRANSACTION) {
        reply.writeString(descriptor);
        return true;
      }
      switch (code)
      {
        case TRANSACTION_verifyLicense:
        {
          int _arg0;
          _arg0 = data.readInt();
          java.lang.String _arg1;
          _arg1 = data.readString();
          java.lang.String _arg2;
          _arg2 = data.readString();
          this.verifyLicense(_arg0, _arg1, _arg2);
          break;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
      return true;
    }
    private static class Proxy implements com.android.vending.licensing.ILicenseResultListener
    {
      private android.os.IBinder mRemote;
      Proxy(android.os.IBinder remote)
      {
        mRemote = remote;
      }
      @Override public android.os.IBinder asBinder()
      {
        return mRemote;
      }
      public java.lang.String getInterfaceDescriptor()
      {
        return DESCRIPTOR;
      }
      @Override public void verifyLicense(int responseCode, java.lang.String signedData, java.lang.String signature) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(responseCode);
          _data.writeString(signedData);
          _data.writeString(signature);
          boolean _status = mRemote.transact(Stub.TRANSACTION_verifyLicense, _data, null, android.os.IBinder.FLAG_ONEWAY);
        }
        finally {
          _data.recycle();
        }
      }
    }
    static final int TRANSACTION_verifyLicense = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
  }
  /** @hide */
  public static final java.lang.String DESCRIPTOR = "com.android.vending.licensing.ILicenseResultListener";
  public void verifyLicense(int responseCode, java.lang.String signedData, java.lang.String signature) throws android.os.RemoteException;
}
