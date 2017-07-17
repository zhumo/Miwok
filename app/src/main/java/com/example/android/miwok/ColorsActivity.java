package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ColorsActivity extends CategoryActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.translations_list);

        ArrayList<Word> numbers = new ArrayList<Word>();
        numbers.add(new Word("weṭeṭṭi", "red", R.drawable.color_red, R.raw.color_red));
        numbers.add(new Word("chokokki", "green", R.drawable.color_green, R.raw.color_green));
        numbers.add(new Word("ṭakaakki", "brown", R.drawable.color_brown, R.raw.color_brown));
        numbers.add(new Word("ṭopoppi", "gray", R.drawable.color_gray, R.raw.color_gray));
        numbers.add(new Word("kululli", "black", R.drawable.color_black, R.raw.color_black));
        numbers.add(new Word("kelelli", "white", R.drawable.color_white, R.raw.color_white));
        numbers.add(new Word("ṭopiisә", "dusty yellow", R.drawable.color_dusty_yellow, R.raw.color_dusty_yellow));
        numbers.add(new Word("chiwiiṭә", "mustard yellow", R.drawable.color_mustard_yellow, R.raw.color_mustard_yellow));

        adapter = new WordAdapter(this, numbers, R.color.category_colors);
        ListView colorsList = (ListView) findViewById(R.id.translations_list);
        colorsList.setAdapter(adapter);
        colorsList.setOnItemClickListener(translationListItemClickListener);
    }
}
