package com.example.rider;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class signup extends AppCompatActivity {


    Button confirmbtn;
    TextView alreadytxt;
    ImageView backarrow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        alreadytxt= findViewById(R.id.alreadytxt);
        confirmbtn = findViewById(R.id.confirmbtn);
        backarrow=findViewById(R.id.backarrow);

        confirmbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(signup.this,otppage.class);
                startActivity(intent);
            }
        });



        alreadytxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(signup.this,login.class);
                startActivity(intent);
                finish();
            }
        });

    }
}