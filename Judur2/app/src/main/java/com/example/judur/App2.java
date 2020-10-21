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
        food recipee = (food) bun.getSerializable("ap1");

        ImageView image = findViewById(R.id.imageView6);
        TextView name = findViewById(R.id.textView4);
        TextView ingredients = findViewById(R.id.textView6);
        TextView recipe = findViewById(R.id.textView5);



        image.setImageResource(recipee.getImage());
        name.setText(recipee.getName());
        ingredients.setText(recipee.getName());
        recipe.setText(recipee.getName());

    }
}