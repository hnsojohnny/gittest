package com.githubtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e(TAG, "onCreate: ");
        Log.e(TAG, "onStop");
        Log.e(TAG, "onResume: ");
        Log.e(TAG, "onStart " );
        Log.e(TAG, "onResume " );
        Log.e(TAG, "onPause " );
    }
}
