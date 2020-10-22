package com.example.judur;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class M1 extends AppCompatActivity {
    private static int TIME_OUT = 2500;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m1);

       new Handler().postDelayed(new Runnable() {
           @Override
           public void run(){
               Intent In = new Intent(M1.this,FirstPage.class);
               startActivity(In);
               finish();
       }
       },TIME_OUT);

    }
}