package com.example.android.miwok;

import android.media.MediaPlayer;
import android.view.View;
import android.widget.AdapterView;

/**
 * Created by coding on 7/14/17.
 */

public class TranslationListItemClickListener implements AdapterView.OnItemClickListener {
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        WordAdapter adapter = (WordAdapter) parent.getAdapter();
        Word word = adapter.getItem(position);
        MediaPlayer player = MediaPlayer.create(parent.getContext(), word.getAudioResourceID());
        player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer player) {
                player.release();
            }
        });
        player.start();
    }
}
