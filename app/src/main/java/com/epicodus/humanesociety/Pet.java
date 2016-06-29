package com.epicodus.humanesociety;

import android.os.Parcel;
import android.os.Parcelable;

public class Pet implements Parcelable {
    String mName;
    String mAge;
    String mWeight;
    String mSex;
    String mColor;
    int mImageId;

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel out, int flags) {
        out.writeString(mName);
        out.writeString(mAge);
        out.writeString(mWeight);
        out.writeString(mSex);
        out.writeString(mColor);
        out.writeInt(mImageId);
    }
    public Pet (String sName, String sAge, String sWeight, String sSex, String sColor, int sImageId) {
        this.mName = sName;
        this.mAge = sAge;
        this.mWeight = sWeight;
        this.mSex = sSex;
        this.mColor = sColor;
        this.mImageId = sImageId;
    }
    public static final Parcelable.Creator<Pet> CREATOR = new Parcelable.Creator<Pet>() {
        public Pet createFromParcel(Parcel in) {
            return new Pet(in);
        }

        public Pet[] newArray(int size) {
            return new Pet[size];
        }
    };

    private Pet(Parcel in) {
        mName = in.readString();
        mAge = in.readString();
        mWeight = in.readString();
        mSex = in.readString();
        mColor = in.readString();
        mImageId = in.readInt();
    }
}

