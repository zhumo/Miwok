package com.example.android.miwok;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by coding on 7/15/17.
 */

public class CategoryActivity extends AppCompatActivity {
    MediaPlayer player;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.translations_list);
    }

    public void setPlayer(MediaPlayer inputtedPlayer) { player = inputtedPlayer; }
    public MediaPlayer getPlayer() { return player; }

    @Override
    protected void onStop() {
        super.onStop();
        if(player != null) {
            player.release();
            player = null;
        }
    }
}
