
package com.example.rider;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class complaint extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complaint);






        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        //set home selected
        bottomNavigationView.setSelectedItemId(R.id.complaint);


        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {

                    case R.id.wallet:
                        startActivity(new Intent(getApplicationContext(), wallet.class));
                        overridePendingTransition(0, 0);
                        finish();
                        return true;


                    case R.id.home:
                        startActivity(new Intent(getApplicationContext(), dashboard.class));
                        overridePendingTransition(0, 0);
                        finish();
                        return true;

                    case R.id.inbox:
                        startActivity(new Intent(getApplicationContext(), inbox.class));
                        overridePendingTransition(0, 0);
                        finish();
                        return true;

                    case R.id.setting:
                        startActivity(new Intent(getApplicationContext(), setting.class));
                        overridePendingTransition(0, 0);
                        finish();
                        return true;

                    case R.id.complaint:
                       return true;
                }
                return false;
            }
        });

    }
}