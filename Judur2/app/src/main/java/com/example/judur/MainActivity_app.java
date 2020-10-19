package com.example.judur;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.MediaStore;

import java.util.ArrayList;

public class MainActivity_app extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_app);

        ArrayList<MediaStore.Images> Appetizars = new ArrayList<>();

        food fo1 = new food("سلطة كينوا",R.drawable.ke);
        food fo2 = new food("سلطة فاصوليا بالذرة",R.drawable.fa);
        food fo3 = new food("شوربة عدس",R.drawable.ad);
        food fo4 = new food("حمص",R.drawable.hm);
        food fo5 = new food("",R.drawable.ga);
    }
}