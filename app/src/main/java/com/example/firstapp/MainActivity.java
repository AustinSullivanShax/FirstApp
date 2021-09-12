package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MyActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {
            String nullStr = null;
            System.out.println(nullStr.length()); // NullPointerException
        }
        catch(NullPointerException e) {
            Log.e(TAG, "Error: This a NullPointerException");
        }

    }
}