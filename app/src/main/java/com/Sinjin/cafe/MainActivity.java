package com.Sinjin.cafe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button exitapp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //This process is used for exiting app using the exit button , Note: Very Important for future applications.

        exitapp = (Button) findViewById(R.id.exitapp);
        exitapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moveTaskToBack(true);
                android.os.Process.killProcess(android.os.Process.myPid());
                System.exit(1);

            }
        });




        }
    public void appOpen(View view){
        Intent intent = new Intent(this,MainPage.class);
        startActivity(intent);
    }



}