package com.example.arcane.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.arcane.Adapter.PopularAdapter;
import com.example.arcane.Domain.PopularDomain;
import com.example.arcane.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView.Adapter adapterPopular;
    private  RecyclerView recyclerViewPopular;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView category1=findViewById(R.id.imageView4);
        ImageView category2=findViewById(R.id.imageView5);
        ImageView category3=findViewById(R.id.image6);
        ImageView category4=findViewById(R.id.imageView9);
        ImageView gallery=findViewById(R.id.imageView2);
        TextView seeAll = findViewById(R.id.seeAll);






        initRecyclerView();

        category1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,category1.class);
                startActivity(intent);
            }
        });

        category2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,category2.class);
                startActivity(intent);
            }
        });

        category3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,category3.class);
                startActivity(intent);
            }
        });

        category4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,profile.class);
                startActivity(intent);
            }
        });
        gallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,gallery.class);
                startActivity(intent);
            }
        });

        seeAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,categorynew.class);
                startActivity(intent);
            }
        });




    }

    private void initRecyclerView() {
        ArrayList<PopularDomain> items=new ArrayList<>();
        items.add(new PopularDomain("Building","","p_6",15,4,2000));
        items.add(new PopularDomain("","","v_3",10, 4,1800));
        items.add(new PopularDomain("","","p_5",10, 4,1900));
        items.add(new PopularDomain("","","s_7",10, 4,1400));
        items.add(new PopularDomain("","","s_3",10, 4,1600));
        items.add(new PopularDomain("","","v_5",10, 4,1200));

        recyclerViewPopular=findViewById(R.id.view1);
        recyclerViewPopular.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));

        adapterPopular=new PopularAdapter(items);
        recyclerViewPopular.setAdapter(adapterPopular);

    }
}