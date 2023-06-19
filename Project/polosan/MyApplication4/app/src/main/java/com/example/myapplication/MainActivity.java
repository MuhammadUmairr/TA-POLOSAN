package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Login(View view) {
        startActivity(new Intent(MainActivity.this, Activity_login.class));
    }

    public void MediaSosial(View view) {
        startActivity(new Intent(MainActivity.this, Activity_SocialMedia.class));
    }

    public void info(View view) {
        startActivity(new Intent(MainActivity.this, InfoActivity.class));
    }

    public void Maps_Link(View view) {
        startActivity(new Intent(MainActivity.this, MapsActivity.class));
    }

}
