package com.example.mat_assignment6;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.Adapter;

import java.util.ArrayList;
import java.util.Arrays;

public class Q4 extends AppCompatActivity {

    RecyclerView recyclerView;

    // Using ArrayList to store images data
    ArrayList FImg = new ArrayList<>(Arrays.asList(R.drawable.apple, R.drawable.kiwi, R.drawable.orange, R.drawable.sb));
    ArrayList FName = new ArrayList<>(Arrays.asList("Apple", "Kiwi", "Orange", "Strawberry"));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q4);

        recyclerView = (RecyclerView) findViewById(R.id.q4RecyclerView);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        //Adapter adapter = new Adapter(getApplicationContext(), FImg, FName);
        //recyclerView.setAdapter((RecyclerView.Adapter) adapter);
    }
}