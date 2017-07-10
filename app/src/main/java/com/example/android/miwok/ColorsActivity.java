package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.translations_list);

        ArrayList<Word> numbers = new ArrayList<Word>();
        numbers.add(new Word("weṭeṭṭi", "red"));
        numbers.add(new Word("chokokki", "green"));
        numbers.add(new Word("ṭakaakki", "brown"));
        numbers.add(new Word("ṭopoppi", "gray"));
        numbers.add(new Word("kululli", "black"));
        numbers.add(new Word("kelelli", "white"));
        numbers.add(new Word("ṭopiisә", "dusty yellow"));
        numbers.add(new Word("chiwiiṭә", "mustard yellow"));

        WordAdapter colorsAdapter = new WordAdapter(this, numbers);
        ListView colorsList = (ListView) findViewById(R.id.translations_list);
        colorsList.setAdapter(colorsAdapter);
    }
}
