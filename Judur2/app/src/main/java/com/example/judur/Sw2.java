package com.example.judur;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Sw2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sw2);

        Bundle bun3 = getIntent().getExtras();
        final food ir3 = (food) bun3.getSerializable("sw1");

        ImageView img3 = findViewById(R.id.imageView6);
        TextView name3 = findViewById(R.id.textView4);
        TextView ingredients3 = findViewById(R.id.textView6);
        TextView recipe3 = findViewById(R.id.textView5);
        Button button3 = findViewById(R.id.button5);
        Button button33 = findViewById(R.id.button33);

        img3.setImageResource(ir3.getImage());
        name3.setText(ir3.getName());
        ingredients3.setText( " المقادير :" + ir3.getIngredients());
        recipe3.setText(" الوصفة : " +ir3.getRecipe());
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = ir3.getLink();
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        button33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = ir3.getLinkG();
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });


    }
}