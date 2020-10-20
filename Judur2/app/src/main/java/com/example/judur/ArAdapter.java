package com.example.judur;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ArAdapter extends RecyclerView.Adapter {

    ArrayList<food> MainDishArray;
    Context MdContext;

    public ArAdapter(ArrayList<food> mainDishArray, Context mdContext) {
        MainDishArray = mainDishArray;
        MdContext = mdContext;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vi = LayoutInflater.from(parent.getContext()).inflate(R.layout.ar_food,parent,false);
        ViewHolder vh = new ViewHolder(vi);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ((ViewHolder)holder).img3.setImageResource(MainDishArray.get(position).getImage());
        ((ViewHolder)holder).name3.setText(MainDishArray.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return MainDishArray.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public ImageView img3;
        public TextView name3;
        public View view3;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            view3 = itemView; // اهم سطر
            img3 = itemView.findViewById(R.id.imageView4);
            name3 =itemView.findViewById(R.id.textView2);
        }
    }


}
