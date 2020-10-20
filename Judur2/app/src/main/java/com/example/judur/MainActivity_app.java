package com.example.judur;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.provider.MediaStore;

import java.util.ArrayList;

public class MainActivity_app extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_app);

        ArrayList<food> Appetizars = new ArrayList<>();

        food fo1 = new food("سلطة كينوا",R.drawable.ke);
        food fo2 = new food("سلطة فاصوليا بالذرة",R.drawable.fa);
        food fo3 = new food("شوربة عدس",R.drawable.ad);
        food fo4 = new food("حمص",R.drawable.hm);
        food fo5 = new food("شوربة يقطين",R.drawable.ga);

        Appetizars.add(fo1);
        Appetizars.add(fo2);
        Appetizars.add(fo3);
        Appetizars.add(fo4);
        Appetizars.add(fo5);

        RecyclerView rv =findViewById(R.id.rv);

        rv.setHasFixedSize(true);
        RecyclerView.LayoutManager am = new LinearLayoutManager(this);
        rv.setLayoutManager(am);

        AppAdapter ap = new AppAdapter(Appetizars,this);
        rv.setAdapter(ap);
    }
}