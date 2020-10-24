package com.example.judur;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.Html;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //getSupportActionBar().setTitle(Html.fromHtml("<font color=\"black\">"+ getString(R.string.app_name)+ "</font/"));
        //getSupportActionBar().setIcon(R.drawable.logo);


        ImageView fa = findViewById(R.id.imageView);
        ImageView cz =findViewById(R.id.imageView2);
        ImageView md =findViewById(R.id.imageView3);

        Toolbar tb =findViewById(R.id.ct);
        tb.setTitle("");
        setSupportActionBar(tb);




        fa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sa = new Intent(MainActivity.this,MainActivity_app.class);
                startActivity(sa);
            }
        });

        cz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            Intent cak = new Intent(MainActivity.this,MainActivity_sw.class);
            startActivity(cak);
            }
        });

        md.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mach = new Intent(MainActivity.this,MainActivity_ar.class);
                startActivity(mach);
            }
        });


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inf = getMenuInflater();
        inf.inflate(R.menu.menu, menu);
        return true;
    }
}