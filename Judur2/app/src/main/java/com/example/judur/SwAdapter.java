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

public class SwAdapter extends RecyclerView.Adapter {

    ArrayList<food> SweetArray;
    Context SweetContext;

    public SwAdapter(ArrayList<food> sweetArray, Context sweetContext) {
        SweetArray = sweetArray;
        SweetContext = sweetContext;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vi = LayoutInflater.from(parent.getContext()).inflate(R.layout.sw_food,parent,false);
        ViewHolder vh = new ViewHolder(vi);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position) {
        ((ViewHolder)holder).img2.setImageResource(SweetArray.get(position).getImage());
        ((ViewHolder)holder).name2.setText(SweetArray.get(position).getName());
        ((ViewHolder)holder).view2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(SweetContext,Sw2.class);
                in.putExtra("sw1",SweetArray.get(position));
                SweetContext.startActivity(in);
            }
        });
    }

    @Override
    public int getItemCount() {
        return SweetArray.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public ImageView img2;
        public TextView name2;
        public View view2;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            view2 = itemView; // اهم سطر
            img2 = itemView.findViewById(R.id.imageView5);
            name2 =itemView.findViewById(R.id.textView2);
        }
    }
}
