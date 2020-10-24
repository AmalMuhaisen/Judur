package com.example.judur;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class App2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app2);

        Bundle bun = getIntent().getExtras();
        final food ir1 = (food) bun.getSerializable("ap1");

        ImageView image = findViewById(R.id.imageView6);
        TextView name = findViewById(R.id.textView4);
        TextView ingredients = findViewById(R.id.textView6);
        TextView recipe = findViewById(R.id.textView5);
        Button button = findViewById(R.id.button9);
        Button button11 = findViewById(R.id.button11);



        image.setImageResource(ir1.getImage());
        name.setText(ir1.getName());
        ingredients.setText(ir1.getIngredients());
        recipe.setText(ir1.getRecipe());
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = ir1.getLink();
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = ir1.getLinkG();
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

    }
}