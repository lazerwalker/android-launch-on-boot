package com.lazerwalker.launchonboot;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        switch(keyCode){
            case KeyEvent.KEYCODE_MENU:
                Intent settings = new Intent(android.provider.Settings.ACTION_SETTINGS);
                settings.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(settings);
        }
        return super.onKeyDown(keyCode, event);
    }
}
