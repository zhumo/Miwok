package com.example.android.miwok;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;

/**
 * Created by coding on 7/10/17.
 */

public class ColorsClickListener implements View.OnClickListener {
    @Override
    public void onClick(View view) {
        Context context = view.getContext();
        Intent i = new Intent(context, ColorsActivity.class);
        context.startActivity(i);
    }
}