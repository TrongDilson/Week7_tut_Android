package com.example.week7_tut;

import android.content.IntentFilter;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    public static final String HAPPY_ACTION = "I'M HAPPY!";
    public static final String MISS_ACTION = "I MISS YOU!";
    protected MyBroadcastReciever myBroadcastReciever;
    protected IntentFilter intentFilter;
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        registerService();
    }

    private void registerService()
    {
        myBroadcastReciever = new MyBroadcastReciever();
        intentFilter = new IntentFilter(HAPPY_ACTION);
        intentFilter.addAction(MISS_ACTION);
        this.registerReceiver(myBroadcastReciever,intentFilter);
    }
}