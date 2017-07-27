package com.lianxi.huang.hellonewworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class SecondActivity extends AppCompatActivity {


    private final String TAG = "SecondActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        Log.i(TAG,"name="+name);
        int age = intent.getIntExtra("age",0);//如果找不到，赋值0
        Log.i(TAG,"age="+age);
    }
}
