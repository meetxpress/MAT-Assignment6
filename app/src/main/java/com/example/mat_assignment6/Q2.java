package com.example.mat_assignment6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

public class Q2 extends AppCompatActivity {
    GridView simpleGrid;
    int logos[] = {R.drawable.india, R.drawable.usa, R.drawable.uk, R.drawable.canada};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q2);

        simpleGrid = findViewById(R.id.simpleGrid);
        Q2BaseAdpater ba = new Q2BaseAdpater(getApplicationContext(), logos);
        simpleGrid.setAdapter(ba);
    }
}