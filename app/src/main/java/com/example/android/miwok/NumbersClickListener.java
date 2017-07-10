package com.example.android.miwok;

import android.view.View;
import android.widget.Toast;

/**
 * Created by coding on 7/10/17.
 */

public class NumbersClickListener implements View.OnClickListener {
    @Override
    public void onClick(View view) {
        Toast.makeText(view.getContext(), "Open the Numbers List", Toast.LENGTH_SHORT).show();
    }
}
