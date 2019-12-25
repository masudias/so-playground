package com.example.masud.stackoverflow;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView tw = findViewById(R.id.txt);
        Button btn = findViewById(R.id.btn);

        btn.setOnClickListener(v -> {
            tw.setText("Changed text");
        });
    }
}