package com.example.judur;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Ar2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ar2);

        Bundle bun2 = getIntent().getExtras();
        food ir2 = (food) bun2.getSerializable("ar1");

        ImageView img2 = findViewById(R.id.imageView6);
        TextView name2 = findViewById(R.id.textView4);
        TextView ingredients2 = findViewById(R.id.textView6);
        TextView recipe2 = findViewById(R.id.textView5);

        img2.setImageResource(ir2.getImage());
        name2.setText(ir2.getName());
        ingredients2.setText(ir2.getName());
        recipe2.setText(ir2.getName());

    }
}