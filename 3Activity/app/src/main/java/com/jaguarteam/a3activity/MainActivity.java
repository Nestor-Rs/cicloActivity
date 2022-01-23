package com.jaguarteam.a3activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick(View view){
        if(view.getId()==R.id.Panel1){
            Intent miIntent = new Intent(MainActivity.this,MainActivity2.class);
            startActivity(miIntent);
        }
        else{
            Intent miIntent = new Intent(MainActivity.this,MainActivity3.class);
            startActivity(miIntent);
        }
    }
}