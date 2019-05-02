package com.example.masud.stackoverflow;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView bonusSampleImage = findViewById(R.id.bonusSampleImage);
        Glide.with(this)
                .load("https://i.imgur.com/DvpvklR.png")
                .placeholder(R.drawable.ic_launcher_foreground)
                .into(bonusSampleImage);
    }
}