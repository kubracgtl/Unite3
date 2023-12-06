package com.example.unite3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Uyg10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uyg10);
        int x = 16;
        int y = 5;
        System.out.println(" x 20 den büyük mü ve y 10 dan küçük mü?" + (x > 20 && y < 10));
        System.out.println(" x 20 den büyük mü ve y 10 dan küçük mü tersi" + !(x > 20 && y < 10));
        System.out.println(" x 20 den büyük mü veya y 10 dan küçük mü?" + (x > 20 || y < 10));
        System.out.println(" x 20 den büyük mü veya y 10 dan küçük mü?" + !(x > 20 || y < 10));
    }

}