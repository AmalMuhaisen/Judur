package com.example.judur;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Sw2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sw2);

        Bundle bun3 = getIntent().getExtras();
        food ir = (food) bun3.getSerializable("sw1");

        ImageView img3 = findViewById(R.id.imageView6);
        TextView name3 = findViewById(R.id.textView4);
        TextView ingredients3 = findViewById(R.id.textView6);
        TextView recipe3 = findViewById(R.id.textView5);

        img3.setImageResource(ir.getImage());
        name3.setText(ir.getName());
        ingredients3.setText(ir.getName());
        recipe3.setText(ir.getName());

    }
}