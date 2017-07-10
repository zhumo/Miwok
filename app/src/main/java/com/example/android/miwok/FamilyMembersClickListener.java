package com.example.android.miwok;

import android.view.View;
import android.widget.Toast;

/**
 * Created by coding on 7/10/17.
 */

public class FamilyMembersClickListener implements View.OnClickListener {
    @Override
    public void onClick(View view) {
        Toast.makeText(view.getContext(), "Show the Family Members List", Toast.LENGTH_SHORT).show();
    }
}
