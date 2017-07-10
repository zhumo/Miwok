package com.example.android.miwok;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;

/**
 * Created by coding on 7/10/17.
 */

public class CategoryClickListener implements View.OnClickListener {
    private Class<? extends Activity> _activity;

    public CategoryClickListener(Class<? extends Activity> activity) {
        super();
        _activity = activity;
    }

    @Override
    public void onClick(View view) {
        Context context = view.getContext();
        Intent i = new Intent(context, _activity);
        context.startActivity(i);
    }
}
