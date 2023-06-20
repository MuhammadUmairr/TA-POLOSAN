package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DownloadManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MapsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
    }

    public void Maps_Link(View view) {
        Uri urllokasi = Uri.parse("google.navigation:q=Pantai+Mutun");
        Intent myintent = new Intent(Intent.ACTION_VIEW,urllokasi);
        myintent.setPackage("com.google.android.apps.maps");
        startActivity(myintent);
    }

    public void Back_Home(View view) {
        startActivity(new Intent(MapsActivity.this, MainActivity.class));
    }
}