package com.example.mat_assignment6;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

public class Q5 extends AppCompatActivity {
    TextView q5tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q5);
        q5tv = findViewById(R.id.q5tv);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.q5, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.maths:
            case R.id.ds:
            case R.id.logout:
                q5tv.setText("You have selected " + item);
                break;
            case R.id.sub1:
            case R.id.sub2:
            case R.id.sub3:
                q5tv.setText("You have selected " + item + " from Java submenu");
                break;
            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}