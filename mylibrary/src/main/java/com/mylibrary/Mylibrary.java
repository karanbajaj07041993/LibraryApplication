package com.mylibrary;

import android.app.Activity;
import android.widget.Toast;

/**
 * Created by karan.bajaj on 3/8/2017.
 */

public class Mylibrary {
    private final Activity activity;

    public Mylibrary(Activity activity) {
        this.activity = activity;
    }

    public void callMethod() {
        Toast.makeText(activity, "called successfully...", Toast.LENGTH_SHORT).show();
    }
}
