package com.example.arcane.Activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.arcane.Adapter.PopularAdapter;
import com.example.arcane.Domain.PopularDomain;
import com.example.arcane.R;

import java.util.ArrayList;

public class category1 extends AppCompatActivity{

    private RecyclerView.Adapter adapterPopular;
    private  RecyclerView recyclerViewPopular;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categorynew);

        initRecyclerView();

    }

    private void initRecyclerView() {
        ArrayList<PopularDomain> items=new ArrayList<>();
        items.add(new PopularDomain("","","p_1",15,4,2000));
        items.add(new PopularDomain("","","p_2",10, 4,1800));
        items.add(new PopularDomain("","","p_3",10, 4,1900));
        items.add(new PopularDomain("","","p_4",10, 4,1400));
        items.add(new PopularDomain("","","p_5",10, 4,1600));
        items.add(new PopularDomain("","","p_6",10, 4,1300));


        recyclerViewPopular=findViewById(R.id.view2);
        recyclerViewPopular.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false ));

        GridLayoutManager gridLayoutManager = new GridLayoutManager(getApplicationContext(),2);
        gridLayoutManager.setOrientation(LinearLayoutManager.VERTICAL); // set Horizontal Orientation
        recyclerViewPopular.setLayoutManager(gridLayoutManager);

        adapterPopular=new PopularAdapter(items);
        recyclerViewPopular.setAdapter(adapterPopular);

    }

}