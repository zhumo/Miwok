package com.example.android.miwok;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;

/**
 * Created by coding on 7/14/17.
 */

public class TranslationListItemClickListener implements AdapterView.OnItemClickListener {
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        CategoryActivity activity = (CategoryActivity) view.getContext();
        if (activity.requestAudioFocus() == AudioManager.AUDIOFOCUS_REQUEST_GRANTED) {
            activity.releaseMediaPlayer();
            activity.playWordAtIndex(position);
        }
    }
}
