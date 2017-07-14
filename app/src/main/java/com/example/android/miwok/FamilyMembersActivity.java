package com.example.android.miwok;

import android.graphics.drawable.RippleDrawable;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

import static java.security.AccessController.getContext;

public class FamilyMembersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.translations_list);

        ArrayList<Word> familyMembers = new ArrayList<Word>();
        familyMembers.add(new Word("әpә", "father", R.drawable.family_father, R.raw.family_father));
        familyMembers.add(new Word("әṭa", "mother", R.drawable.family_mother, R.raw.family_mother));
        familyMembers.add(new Word("angsi", "son", R.drawable.family_son, R.raw.family_son));
        familyMembers.add(new Word("tune", "daughter", R.drawable.family_daughter, R.raw.family_daughter));
        familyMembers.add(new Word("taachi", "older brother", R.drawable.family_older_brother, R.raw.family_older_brother));
        familyMembers.add(new Word("chalitti", "younger brother", R.drawable.family_younger_brother, R.raw.family_younger_brother));
        familyMembers.add(new Word("teṭe", "older sister", R.drawable.family_older_sister, R.raw.family_older_sister));
        familyMembers.add(new Word("kolliti", "younger sister", R.drawable.family_younger_sister, R.raw.family_younger_sister));
        familyMembers.add(new Word("ama", "grandmother", R.drawable.family_grandmother, R.raw.family_grandmother));
        familyMembers.add(new Word("paapa", "grandfather", R.drawable.family_grandfather, R.raw.family_grandfather));

        WordAdapter familyMembersAdapter = new WordAdapter(this, familyMembers, R.color.category_family_members);
        ListView familyMembersList = (ListView) findViewById(R.id.translations_list);
        familyMembersList.setAdapter(familyMembersAdapter);
        familyMembersList.setOnItemClickListener(new TranslationListItemClickListener());
    }
}
