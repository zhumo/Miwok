package com.example.android.miwok;

import android.content.Context;
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
        WordAdapter adapter = (WordAdapter) parent.getAdapter();
        Word word = adapter.getItem(position);
        CategoryActivity activity = (CategoryActivity) view.getContext();
        if (activity.getPlayer() != null) {
            activity.getPlayer().release();
            activity.setPlayer(null);
        }
        MediaPlayer player = MediaPlayer.create(parent.getContext(), word.getAudioResourceID());
        activity.setPlayer(player);
        player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer player) {
                player.release();
            }
        });
        player.start();
    }
}
