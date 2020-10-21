package com.example.judur;

import android.content.Context;
import android.content.Intent;
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
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position) {
        ((AppAdapter.ViewHolder)holder).img.setImageResource(AppetizarsArray.get(position).getImage());
        ((AppAdapter.ViewHolder)holder).name.setText(AppetizarsArray.get(position).getName());
        ((ViewHolder)holder).view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(AppContext,App2.class);
                in.putExtra("ap1",AppetizarsArray.get(position)); 
                AppContext.startActivity(in);
            }
        });
    }

    @Override
    public int getItemCount() {
        return AppetizarsArray.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public ImageView img;
        public TextView name;
        public View view;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            view = itemView; // اهم سطر
            img = itemView.findViewById(R.id.imageView5);
            name =itemView.findViewById(R.id.textView2);

        }
    }
}
