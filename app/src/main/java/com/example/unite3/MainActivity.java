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

    public void Uyg3goster(View view) {
        Intent i= new Intent(MainActivity.this, Uyg2.class);
        startActivity(i);
    }

    public void Uyg4goster(View view) {
        Intent i = new Intent(MainActivity.this, Uyg4.class);
        startActivity(i);
    }

     public void Uyg6goster(View view) {
         Intent i = new Intent(MainActivity.this, Uyg6.class);
         startActivity(i);
     }
         public void Uyg7goster(View view) {
             Intent i= new Intent(MainActivity.this, Uyg7.class);
             startActivity(i);


    }

    public void Uyg8goster(View view) {
        Intent i = new Intent(MainActivity.this, Uyg8.class);
        startActivity(i);
    }
    public void Uyg9goster(View view) {
        Intent i = new Intent(MainActivity.this, Uyg9.class);
        startActivity(i);

    }
    public void Uyg10goster(View view) {
        Intent i = new Intent(MainActivity.this, Uyg10.class);
        startActivity(i);
    }

    public void Uygulama11goster(View view) {
        Intent i = new Intent(MainActivity.this, Uyg11.class);
        startActivity(i);
    }
}