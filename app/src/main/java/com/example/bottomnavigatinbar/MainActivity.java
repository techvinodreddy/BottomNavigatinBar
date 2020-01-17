package com.example.bottomnavigatinbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

public class MainActivity extends AppCompatActivity {
    BottomNavigationViewEx bnve;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bnve = (BottomNavigationViewEx) findViewById(R.id.bottom_bar);
        bnve.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.id_home:
                        Toast.makeText(MainActivity.this,"Home Tab",Toast.LENGTH_LONG).show();
                        break;
                    case R.id.id_search:
                        Toast.makeText(MainActivity.this,"Search Tab",Toast.LENGTH_LONG).show();
                        break;
                    case R.id.id_notifications:
                        Toast.makeText(MainActivity.this,"Notifications Tab",Toast.LENGTH_LONG).show();
                        break;
                    case R.id.id_messages:
                        Toast.makeText(MainActivity.this,"Message Tab",Toast.LENGTH_LONG).show();
                        break;
                    default:
                }
                return true;

            }

        });


    }

}
