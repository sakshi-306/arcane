package com.example.arcane.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.GranularRoundedCorners;
import com.example.arcane.Activity.buynow;
import com.example.arcane.Activity.ordercon;
import com.example.arcane.Domain.PopularDomain;
import com.example.arcane.R;

import java.util.ArrayList;

public class PopularAdapter extends RecyclerView.Adapter<PopularAdapter.Viewholder> {
    ArrayList<PopularDomain> item;

    Context context;

    public PopularAdapter(ArrayList<PopularDomain> item) {
        this.item = item;
    }

    @NonNull
    @Override
    public PopularAdapter.Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context=parent.getContext();
        View inflate= LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_pup_list,parent,false);


        return new Viewholder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull PopularAdapter.Viewholder holder, int position) {
        holder.titleTxt.setText(item.get(position).getTitle());
        holder.feeTxt.setText("Rs."+item.get(position).getPrice());
        holder.scoreTxt.setText(""+item.get(position).getScore());

        int drawableResourceId=holder.itemView.getResources().getIdentifier(item.get(position).getPicUrl(),
                "drawable",holder.itemView.getContext().getPackageName());
        Glide.with(holder.itemView.getContext())
                .load(drawableResourceId)
                .transform(new GranularRoundedCorners(30,30,0,0))
                .into(holder.pic);

    }

    @Override
    public int getItemCount() {
        return item.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder{
        TextView titleTxt,feeTxt,scoreTxt;
        ImageView pic;
        Button buy;

        public Viewholder(@NonNull View itemView) {
            super(itemView);
            titleTxt=itemView.findViewById(R.id.titleTxt);
            feeTxt=itemView.findViewById(R.id.feetxt);
            scoreTxt=itemView.findViewById(R.id.scoreText);
            pic=itemView.findViewById(R.id.pic);
            buy = itemView.findViewById(R.id.buy);

            buy.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent (view.getContext(),buynow.class);
                    view.getContext().startActivity(intent);
                }
            });


        }
    }
}
