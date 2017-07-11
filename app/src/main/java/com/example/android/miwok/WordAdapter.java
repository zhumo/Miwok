package com.example.android.miwok;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by coding on 7/10/17.
 */

public class WordAdapter extends ArrayAdapter<Word> {
    ArrayList<Word> numbers;

    public WordAdapter(Context context, ArrayList<Word> numbers) {
        super(context, 0, numbers);
    }

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View translationView = convertView;
        if (translationView == null) {
            translationView = LayoutInflater.from(getContext()).inflate(
                    R.layout.translation_layout, parent, false
            );
        }

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
