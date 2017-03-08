package com.libraryapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.mylibrary.Mylibrary;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Mylibrary mylibrary=new Mylibrary(MainActivity.this);
        mylibrary.callMethod();
    }
}
