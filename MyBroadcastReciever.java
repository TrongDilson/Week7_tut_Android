package com.example.week7_tut;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class MyBroadcastReciever extends BroadcastReceiver {
    public static final String HAPPY_ACTION = "MOM, I'M HAPPY!";
    public static final String MISS_ACTION = "MOM, I MISS YOU!";

    @Override
    public void onReceive(Context context, Intent intent)
    {
        if (intent.getAction().equals(MainActivity.HAPPY_ACTION))
            sendMessage(context, HAPPY_ACTION)
    }

    private void sendMessage(Context context, String message)
    {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }

}
