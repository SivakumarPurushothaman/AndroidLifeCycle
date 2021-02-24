package com.example.androidlifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onActivityState: "+"Activity Created");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onActivityState: "+"Activity Started");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onActivityState: "+"Activity Resumed");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onActivityState: "+"Activity Paused");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onActivityState: "+"Activity Stopped");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onActivityState: "+"Activity Destroyed");
    }


}