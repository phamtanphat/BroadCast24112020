package com.example.broadcast24112020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.IntentFilter;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private MyBroadCast mMyBroadCast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mMyBroadCast = new MyBroadCast();
    }

    @Override
    protected void onStart() {
        super.onStart();
        IntentFilter filter = new IntentFilter("android.example.sendBroadCast");
        registerReceiver(mMyBroadCast,filter);
    }

    @Override
    protected void onStop() {
        super.onStop();
        unregisterReceiver(mMyBroadCast);
    }
}