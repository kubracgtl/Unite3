package com.example.unite3;

import androidx.appcompat.app.AppCompatActivity;

import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class Uyg11 extends AppCompatActivity {
private final String TAG="ETİKET";
private int sayi=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uyg11);
        Log.d(TAG,"debug (hata ayıklama");

    }
    public void islemYap(View view){
        Log.i(TAG,"DÜGMEYE TIKLANDI");
        EditText editText =(EditText) findViewById(R.id.editText);
        Log.i(TAG,"EDİT  TEXT tanımlandı");
        String sl= editText.getText().toString();
        Log.i(TAG,"EDİT TEXT  içindeki yazı alındı ");
        sayi=Integer.parseInt(sl);
        Log.i(TAG,"yazı  sayıya çevrildi");
        sayi=sayi+2;
        Log.i(TAG,"sayıya 2 eklendi");

    }
}