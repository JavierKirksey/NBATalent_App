package com.example.jellybean.nbatalent;
//Created By Javier Kirksey on Dec. 4th, 2016


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class NBA_SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);

        Thread myThread = new Thread(){

            @Override
            public void run(){
                try{
                    sleep(3000);
                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);

                    startActivity(intent);
                    finish();

                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        };
        myThread.start();

    }
}