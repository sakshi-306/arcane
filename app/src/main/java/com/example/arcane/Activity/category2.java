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

public class category2 extends AppCompatActivity {

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
        items.add(new PopularDomain("","","s_1",15,4,2000));
        items.add(new PopularDomain("","","s_2",10, 4,1800));
        items.add(new PopularDomain("","","s_3",10, 4,1900));
        items.add(new PopularDomain("","","s_4",10, 4,1400));
        items.add(new PopularDomain("","","s_5",10, 4,1600));
        items.add(new PopularDomain("","","s_6",10, 4,17000));
        items.add(new PopularDomain("","","s_8",10, 4,1300));
        items.add(new PopularDomain("","","s_10",10, 4,1250));
        items.add(new PopularDomain("","","s_7",10, 4,1200));
        items.add(new PopularDomain("","","s_11",10, 4,1200));
        items.add(new PopularDomain("","","s_12",10, 4,1270));
        items.add(new PopularDomain("","","s_13",10, 4,1600));
        items.add(new PopularDomain("","","s_14",10, 4,1200));
        items.add(new PopularDomain("","","s_15",10, 4,1200));
        items.add(new PopularDomain("","","s_16",10, 4,1500));
        items.add(new PopularDomain("","","s_17",10, 4,1200));
        items.add(new PopularDomain("","","s_18",10, 4,1600));
        items.add(new PopularDomain("","","s_9",10, 4,1700));
        items.add(new PopularDomain("","","s_20",10, 4,1700));
        items.add(new PopularDomain("","","s_21",10, 4,1700));
        items.add(new PopularDomain("","","s_22",10, 4,1700));
        items.add(new PopularDomain("","","s_23",10, 4,1700));





        recyclerViewPopular=findViewById(R.id.view2);
        recyclerViewPopular.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false ));

        GridLayoutManager gridLayoutManager = new GridLayoutManager(getApplicationContext(),2);
        gridLayoutManager.setOrientation(LinearLayoutManager.VERTICAL); // set Horizontal Orientation
        recyclerViewPopular.setLayoutManager(gridLayoutManager);

        adapterPopular=new PopularAdapter(items);
        recyclerViewPopular.setAdapter(adapterPopular);

    }

}