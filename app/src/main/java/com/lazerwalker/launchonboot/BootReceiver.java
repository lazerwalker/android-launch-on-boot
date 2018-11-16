package com.lazerwalker.launchonboot;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import static android.content.Intent.ACTION_BOOT_COMPLETED;

public class BootReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d("LaunchOnBoot", "In OnReceive");
        if (ACTION_BOOT_COMPLETED.equals(intent.getAction())) {
            Log.d("LaunchOnBoot", "Correct message trying");

            // TODO: Try launching a Service that does nothing but launch the Activity?
            Intent serviceIntent = new Intent(context, MainActivity.class);
            serviceIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(serviceIntent);
        }
    }
}
