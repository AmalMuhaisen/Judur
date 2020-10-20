package com.example.judur;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity_ar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_ar);

        ArrayList<food> MainDish = new ArrayList<>();

        food foo1 = new food("مجبوس دجاج ",R.drawable.md);
        food foo2 = new food(" مجبوس لحم",R.drawable.ml);
        food foo3 = new food("ستيك ",R.drawable.st);
        food foo4 = new food("سمك",R.drawable.rf);
        food foo5 = new food("مرق دجاج ",R.drawable.mad);

        MainDish.add(foo1);
        MainDish.add(foo2);
        MainDish.add(foo3);
        MainDish.add(foo4);
        MainDish.add(foo5);

        RecyclerView rev =findViewById(R.id.rec);

        rev.setHasFixedSize(true);
        RecyclerView.LayoutManager am = new LinearLayoutManager(this);
        rev.setLayoutManager(am);
    }
}