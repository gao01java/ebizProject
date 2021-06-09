package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton menuB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        menuB = (ImageButton) findViewById(R.id.menuButton);
        menuB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // drawerLayout.openDrawer(Gravity.LEFT);
            }
        });
    }
}