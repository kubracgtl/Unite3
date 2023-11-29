package com.example.unite3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Uyg7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uyg7);
        int x=15;
        int y=10;
        int toplama =x+y;
        int cikarma =x-y;
        int  carpma =x*y;
        int bolme=x/y;
        int modalma=x%y;
        x++;
        y--;
        System.out.println("toplamanın sonucu"+toplama);
        System.out.println("cıkarmanın sonucu"+cikarma);
        System.out.println("carpmanın sonucu "+carpma);
        System.out.println("bolmenin sonucu"+bolme);
        System.out.println("mod almanın sonucu"+modalma);
    }
}