package com.example.android.miwok;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by coding on 7/15/17.
 */

public class CategoryActivity extends AppCompatActivity {
    private static MediaPlayer player;
    protected static final TranslationListItemClickListener translationListItemClickListener = new TranslationListItemClickListener();
    protected WordAdapter adapter;

    AudioManager audioManager;
    AudioManager.OnAudioFocusChangeListener audioFocusChangeListener = new AudioManager.OnAudioFocusChangeListener() {
        public void onAudioFocusChange(int newFocus) {
            switch (newFocus) {
                case AudioManager.AUDIOFOCUS_GAIN:
                    player.start();
                    break;
                case AudioManager.AUDIOFOCUS_LOSS:
                    player.pause();
                    releaseMediaPlayer();
                    break;
                case AudioManager.AUDIOFOCUS_LOSS_TRANSIENT:
                    player.pause();
                    break;
                case AudioManager.AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK:
                    player.pause();
                    break;
            }
        }
    };

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.translations_list);
        audioManager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);
    }

    public int requestAudioFocus() {
        return audioManager.requestAudioFocus(
                audioFocusChangeListener,
                AudioManager.STREAM_MUSIC,
                AudioManager.AUDIOFOCUS_GAIN_TRANSIENT);
    }

    public void releaseMediaPlayer() {
        if (player != null) {
            player.release();
            player = null;

            audioManager.abandonAudioFocus(audioFocusChangeListener);
        }
    }

    public void playWordAtIndex(int wordIndex) {
        Word word = adapter.getItem(wordIndex);
        playWord(word);
    }

    public void playWord(Word word) {
        player = MediaPlayer.create(this, word.getAudioResourceID());
        player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer player) {
                releaseMediaPlayer();
            }
        });
        player.start();
    }

    @Override
    protected void onStop() {
        super.onStop();
        if(player != null) {
            player.release();
            player = null;
        }
    }
}
