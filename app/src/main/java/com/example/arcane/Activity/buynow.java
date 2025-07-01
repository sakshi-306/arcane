package com.example.arcane.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.arcane.R;

public class buynow extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.buynow);
        EditText name = findViewById(R.id.name);
        EditText mobileno = findViewById(R.id.mobile_no);
        EditText email = findViewById(R.id.email);
        EditText address = findViewById(R.id.address);
        EditText pincode = findViewById(R.id.pincode);
        Button submit = findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(buynow.this,ordercon.class);
                String nam = name.getText().toString();
                String mob = mobileno.getText().toString();
                String em = email.getText().toString();
                String add = address.getText().toString();
                String pin = pincode.getText().toString();

                intent.putExtra("name", nam);
                intent.putExtra("mobile", mob);
                intent.putExtra("email", em);
                intent.putExtra("address",add);
                intent.putExtra("pincode",pin);
                startActivity(intent);

            }
        });

    }
}