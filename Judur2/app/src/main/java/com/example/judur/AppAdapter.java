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

public class AppAdapter extends RecyclerView.Adapter {

    ArrayList<food> AppetizarsArray;
    Context AppContext;

    public AppAdapter(ArrayList<food> appetizarsArray, Context appContext) {
        AppetizarsArray = appetizarsArray;
        AppContext = appContext;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vi = LayoutInflater.from(parent.getContext()).inflate(R.layout.app_food,parent,false);
       ViewHolder vh = new ViewHolder(vi);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        
    }

    @Override
    public int getItemCount() {
        return AppetizarsArray.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView img;
        public TextView name;
        public View view;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            view = itemView; // اهم سطر
            img = itemView.findViewById(R.id.textView);
            name =itemView.findViewById(R.id.textView2);

        }
    }
}