package com.example.unite3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Uyg6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uyg6);
         final int PI=3;
         int yarıCap=2;
         int cevre=2*yarıCap*PI;
        System.out.println("dairenin çevresi"+cevre);
    }
}