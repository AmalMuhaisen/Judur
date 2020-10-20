package com.example.judur;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity_sw extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_sw);


        ArrayList<food> sweet = new ArrayList<>();

        food foo1 = new food("مجبوس دجاج ",R.drawable.md);
        food foo2 = new food(" مجبوس لحم",R.drawable.ml);
        food foo3 = new food("ستيك ",R.drawable.st);
        food foo4 = new food("سمك",R.drawable.rf);
        food foo5 = new food("مرق دجاج ",R.drawable.mad);

        sweet.add(foo1);
        sweet.add(foo2);
        sweet.add(foo3);
        sweet.add(foo4);
        sweet.add(foo5);

        RecyclerView recv =findViewById(R.id.recy);

        recv.setHasFixedSize(true);
        RecyclerView.LayoutManager am = new LinearLayoutManager(this);
        recv.setLayoutManager(am);
    }
}