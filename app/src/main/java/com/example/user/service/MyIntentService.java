package com.example.user.service;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

/**
 * Created by user on 2016/6/14.
 */
public class MyIntentService extends IntentService {

    public MyIntentService() {
        super("MyIntentService");//call super class constructor
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        //print current thread ID
        Log.d("MyIntentService","Thread id is"+Thread.currentThread().getId());
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("MyIntendService", "onDestroy executed");
    }
}
