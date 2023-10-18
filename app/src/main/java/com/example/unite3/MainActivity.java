package com.example.unite3;

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

    public void Uyg1goster(View view) {
        Intent i= new Intent(MainActivity.this, Uyg1.class);
        startActivity(i);
    }
    public void Uyg2goster(View view) {
        Intent i= new Intent(MainActivity.this, Uyg2.class);
        startActivity(i);
    }
}