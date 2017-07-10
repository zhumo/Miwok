package com.example.android.miwok;

/**
 * Created by coding on 7/10/17.
 */

public class Word {
    private String _miwokWord;
    private String _defaultTranslation;

    public Word(String miwokWord, String defaultTranslation) {
        _miwokWord = miwokWord;
        _defaultTranslation = defaultTranslation;
    }

    public String getMiwokWord() { return _miwokWord; }
    public String getDefaultTranslation() { return _defaultTranslation; }
}
