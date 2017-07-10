package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyMembersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.translations_list);

        ArrayList<Word> familyMembers = new ArrayList<Word>();
        familyMembers.add(new Word("әpә", "father"));
        familyMembers.add(new Word("әṭa", "mother"));
        familyMembers.add(new Word("angsi", "son"));
        familyMembers.add(new Word("tune", "daughter"));
        familyMembers.add(new Word("taachi", "older brother"));
        familyMembers.add(new Word("chalitti", "younger brother"));
        familyMembers.add(new Word("teṭe", "older sister"));
        familyMembers.add(new Word("kolliti", "younger sister"));
        familyMembers.add(new Word("ama", "grandmother"));
        familyMembers.add(new Word("paapa", "grandfather"));

        WordAdapter familyMembersAdapter = new WordAdapter(this, familyMembers);
        ListView familyMembersList = (ListView) findViewById(R.id.translations_list);
        familyMembersList.setAdapter(familyMembersAdapter);
    }
}
