package com.example.yatri;

public class Object {


    private int mIcon;
    private String mDefaultTranslation;
    private String mMiwokTranslation;

    public Object(String mDefaultTranslation, String mMiwokTranslation, int mIcon) {
        this.mIcon = mIcon;
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiwokTranslation = mMiwokTranslation;
    }


    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }
    public int getmIcon() { return mIcon; }
}