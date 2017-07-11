package com.example.android.miwok;

import android.support.annotation.Nullable;

/**
 * Created by coding on 7/10/17.
 */

public class Word {
    private String _miwokWord;
    private String _defaultTranslation;
    private int _imageResourceID = NO_IMAGE;
    private static final int NO_IMAGE = -1;

    public Word(String miwokWord, String defaultTranslation) {
        _miwokWord = miwokWord;
        _defaultTranslation = defaultTranslation;
    }

    public Word(String miwokWord, String defaultTranslation, int imageResourceID) {
        _miwokWord = miwokWord;
        _defaultTranslation = defaultTranslation;
        _imageResourceID = imageResourceID;
    }

    public String getMiwokWord() { return _miwokWord; }
    public String getDefaultTranslation() { return _defaultTranslation; }
    public int getImageResourceID() { return _imageResourceID; }
    public boolean hasImage() { return _imageResourceID != NO_IMAGE; }
}
