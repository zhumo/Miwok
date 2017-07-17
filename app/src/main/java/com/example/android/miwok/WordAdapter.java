package com.example.android.miwok;

import android.app.Activity;
import android.content.Context;
import android.media.MediaPlayer;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by coding on 7/10/17.
 */

public class WordAdapter extends ArrayAdapter<Word> {
    ArrayList<Word> numbers;
    int mcategoryColorID;

    public WordAdapter(Context context, ArrayList<Word> numbers, int categoryColorID) {
        super(context, 0, numbers);
        mcategoryColorID = categoryColorID;
    }

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View translationView = convertView;
        if (translationView == null) {
            translationView = LayoutInflater.from(getContext()).inflate(
                R.layout.translation_layout, parent, false
            );
        }

        // Set the color of the row.
        LinearLayout translationTextView = (LinearLayout) translationView.findViewById(R.id.translation_text);
        int color = ContextCompat.getColor(getContext(), mcategoryColorID);
        translationView.setBackgroundColor(color);

        Word currentWord = getItem(position);

        ImageView translationImageView = (ImageView) translationView.findViewById(R.id.translation_image);
        if (currentWord.hasImage()) {
            translationImageView.setImageResource(currentWord.getImageResourceID());
            // Ensure that the image is visibile
            translationImageView.setVisibility(View.VISIBLE);
        } else {
            translationImageView.setVisibility(View.GONE);
        }

        TextView miwokTextView = (TextView) translationView.findViewById(R.id.miwok_word);
        miwokTextView.setText(currentWord.getMiwokWord());

        TextView defaultTextView = (TextView) translationView.findViewById(R.id.default_word);
        defaultTextView.setText(currentWord.getDefaultTranslation());

        return translationView;
    }
}
