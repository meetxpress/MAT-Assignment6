package com.example.mat_assignment6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
    }

    public void navigate(View v) {
        switch (v.getId()) {
            case R.id.btnQ1:
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                break;

            case R.id.btnQ2:
                startActivity(new Intent(getApplicationContext(), Q2.class));
                break;

            case R.id.btnQ3:
                //startActivity(new Intent(getApplicationContext(), Q2.class));
                break;

            default:
                break;
        }
    }
}