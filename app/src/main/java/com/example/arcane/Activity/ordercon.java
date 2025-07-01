package com.example.arcane.Activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.arcane.R;

public class ordercon extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ordercon);
        TextView text = findViewById(R.id.name);
        TextView text1 = findViewById(R.id.address);
        TextView text2 = findViewById(R.id.pin);
        TextView text3 = findViewById(R.id.mobile);
        TextView text4 = findViewById(R.id.email);
        Button btn = findViewById(R.id.button);



        String a = getIntent().getStringExtra("name");
        String b = getIntent().getStringExtra("address");
        String c = getIntent().getStringExtra("pincode");
        String d = getIntent().getStringExtra("mobile");
        String e = getIntent().getStringExtra("email");

        text.setText("Name: "+ a);
        text1.setText("Address: "+b);
        text2.setText("Pincode.: "+c);
        text3.setText("Phone No: "+d);
        text4.setText("Email Id: "+e);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(), "Order Confirm" , Toast.LENGTH_SHORT ).show();
            }
        });


    }
}