package com.example.kulinerr311910244;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Toolbar;

public class SplashScreenActivity extends AppCompatActivity {

    public static int SPLASH_TIME_OUT = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        getSupportActionBar().hide();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent utamaInten = new Intent(SplashScreenActivity.this,
MainActivity.class);
                startActivity(utamaInten);
                finish();
            }
        }, SPLASH_TIME_OUT) ;
    }
}