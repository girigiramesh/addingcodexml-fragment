package com.fragment;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = " LifeCycle Of Activity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e(TAG, "onCreate: Activity");
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        Log.e(TAG, "onStart: Activity");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.e(TAG, "onResume: Activity");
        super.onResume();
    }

    @Override
    protected void onRestart() {
        Log.e(TAG, "onRestart: Activity");
        super.onRestart();
    }

    @Override
    protected void onPause() {
        Log.e(TAG, "onPause: Activity");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.e(TAG, "onStop: Activity");
        super.onStop();
    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        Log.e(TAG, "onSaveInstanceState: Activity");
        super.onSaveInstanceState(outState, outPersistentState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        Log.e(TAG, "onRestoreInstanceState: Activity");
        super.onRestoreInstanceState(savedInstanceState);
    }

    @Override
    protected void onDestroy() {
        Log.e(TAG, "onDestroy: Activity");
        super.onDestroy();
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.main,menu);
//        return true;
//    }
}
