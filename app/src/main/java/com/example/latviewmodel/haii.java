package com.example.latviewmodel;

import android.content.Intent;
import android.os.Handler;

import android.os.Bundle;
import android.view.Menu;

import androidx.appcompat.app.AppCompatActivity;

public class haii extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_haii);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(haii.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        },3000L);
    }
}