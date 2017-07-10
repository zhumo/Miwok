package com.example.android.miwok;

import android.view.View;
import android.widget.Toast;

/**
 * Created by coding on 7/10/17.
 */

public class ColorsClickListener implements View.OnClickListener {
    @Override
    public void onClick(View view) {
        Toast.makeText(view.getContext(), "Show the Colors List", Toast.LENGTH_SHORT).show();
    }
}
