package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity_SocialMedia extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_social_media);

        Button buttonFacebook = findViewById(R.id.buttonFacebook);
        Button buttonTwitter = findViewById(R.id.buttonTwitter);
        Button buttonInstagram = findViewById(R.id.buttonInstagram);

        buttonFacebook.setOnClickListener(this);
        buttonTwitter.setOnClickListener(this);
        buttonInstagram.setOnClickListener(this);
    }

    public void MediaSosial(View view) {
        String url = "https://www.example.com";

        switch (view.getId()) {
            case R.id.buttonFacebook:
                url = "https://m.facebook.com/p/Polosan-Store-100078651274371/";
                break;
            case R.id.buttonTwitter:
                url = "https://twitter.com/polosanstore";
                break;
            case R.id.buttonInstagram:
                url = "https://instagram.com/polosannstore?igshid=MzNlNGNkZWQ4Mg==";
                break;
        }

        openSocialMediaLink(url);
    }

    private void openSocialMediaLink(String url) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(intent);
    }

    @Override
    public void onClick(View view) {

    }
}