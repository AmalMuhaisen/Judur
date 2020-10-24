package com.example.judur;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Ar2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ar2);

        Bundle bun2 = getIntent().getExtras();
        final food ir2 = (food) bun2.getSerializable("ar1");

        ImageView img2 = findViewById(R.id.imageView6);
        TextView name2 = findViewById(R.id.textView4);
        TextView ingredients2 = findViewById(R.id.textView6);
        TextView recipe2 = findViewById(R.id.textView5);
        Button button2 = findViewById(R.id.button14);
        Button button22 = findViewById(R.id.button22);

        img2.setImageResource(ir2.getImage());
        name2.setText(ir2.getName());
        ingredients2.setText(ir2.getIngredients());
        recipe2.setText(ir2.getRecipe());
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = ir2.getLink();
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = ir2.getLinkG();
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

    }
}