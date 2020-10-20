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

        food food1 = new food("كيكة زعفران ",R.drawable.cz);
        food food2 = new food("  جيزكيك",R.drawable.cc);
        food food3 = new food("لقيمات ",R.drawable.lm);
        food food4 = new food("قرص عقيلي",R.drawable.go);
        food food5 = new food("بقلاوه ",R.drawable.ba);

        sweet.add(food1);
        sweet.add(food2);
        sweet.add(food3);
        sweet.add(food4);
        sweet.add(food5);

        RecyclerView rect =findViewById(R.id.recy);

        rect.setHasFixedSize(true);
        RecyclerView.LayoutManager am = new LinearLayoutManager(this);
        rect.setLayoutManager(am);

        SwAdapter sw = new SwAdapter(sweet,this);
        rect.setAdapter(sw);
    }
}