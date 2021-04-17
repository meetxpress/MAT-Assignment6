package com.example.mat_assignment6;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Q3 extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Spinner q3Spinner;
    ImageView imgView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q3);

        q3Spinner = findViewById(R.id.q3Spinner);
        imgView = findViewById(R.id.q3imgView);
        q3Spinner.setOnItemSelectedListener(this);
        List<String> country = new ArrayList<>();
        country.add("Select Item");
        country.add("India");
        country.add("USA");
        country.add("Canada");
        country.add("UK");

        ArrayAdapter<String> da = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, country);
        q3Spinner.setAdapter(da);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        //Toast.makeText(parent.getContext(), "Selected: " + item, Toast.LENGTH_SHORT).show();
        switch (parent.getItemAtPosition(position).toString()) {
            case "Select Item":
                Toast.makeText(parent.getContext(), "Selected Item", Toast.LENGTH_SHORT).show();
                break;
            case "India":
                imgView.setImageResource(R.drawable.india);
                break;
            case "USA":
                imgView.setImageResource(R.drawable.usa);
                break;
            case "Canada":
                imgView.setImageResource(R.drawable.canada);
                break;
            case "UK":
                imgView.setImageResource(R.drawable.uk);
                break;
            default:
                break;
        }
    }

    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub
    }
}