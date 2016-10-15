package com.example.satyam.myapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreen extends Activity {

    //Splash screen timer
    private static int splashScreenTimeOut=3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                // This method will be executed once the timer is over
                // Start your app main activity
                Intent intentMain = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(intentMain);

                // close this activity
                finish();
            }
        }, splashScreenTimeOut);

    }
}
