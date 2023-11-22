package com.example.unite3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.Settings;

public class uygulama4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uygulama4);
        char karakter = '0';
        int ascii = (int) karakter;
        if (ascii >= 48 && ascii <= 57) {
            System.out.println("rakam girildi");
        } else {
            System.out.println("yazı girildi");
        }


    }
}