    package com.example.myidealpc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

    public class Splash_Activity extends AppCompatActivity {

    int splashTime = 4000; // time will be in Milli Seconds. 1 = 1000 ms :. 4 sec = 4000 ms

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_);

        // Thread = it is a simple class which gives our app a super power to run multiple tasks  at the same time
        // for example downloading image and even showing the image at the same time
        Thread splashThread = new Thread(){
            @Override
            public void run() {
                try{
                    int waitTime = 0;
                    while (waitTime < splashTime){
                        sleep(100);
                        waitTime += 100;
                    }
                }catch (Exception e){
                    Log.d("ex",e.toString());
                }finally {
                    Intent intent = new Intent(Splash_Activity.this,signin.class);
                    startActivity(intent);
                    finish();
                }
            };
        };

        splashThread.start();
        Toast.makeText(Splash_Activity.this,"Firebase connection successfull",Toast.LENGTH_LONG).show();
    }
}