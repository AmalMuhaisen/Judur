package com.example.judur;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toolbar;

import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        androidx.appcompat.widget.Toolbar tb = findViewById(R.id.ct);
        setSupportActionBar(tb);
        getSupportActionBar().setTitle("");

        ImageView fa = findViewById(R.id.imageView);
        ImageView cz =findViewById(R.id.imageView2);
        ImageView md =findViewById(R.id.imageView3);


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