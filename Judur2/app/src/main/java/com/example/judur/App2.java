package com.example.judur;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class App2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app2);

        Bundle bun = getIntent().getExtras();
        food recipe = (food) bun.getSerializable("ap1");

        ImageView image = findViewById(R.id.imageView6);
        TextView name = findViewById(R.id.textView4);
        TextView Recipe = findViewById(R.id.textView6);

        image.setImageResource(recipe.getImage());
        name.setText(recipe.getName());
    }
}