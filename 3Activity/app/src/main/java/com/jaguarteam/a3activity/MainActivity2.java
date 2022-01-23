package com.jaguarteam.a3activity;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.jaguarteam.a3activity.databinding.ActivityMain2Binding;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void onClick(View view){
        if(view.getId()==R.id.Panel0) {
            Intent miIntent = new Intent(MainActivity2.this, MainActivity.class);
            startActivity(miIntent);
        }
        else{
            Intent miIntent = new Intent(MainActivity2.this, MainActivity3.class);
            startActivity(miIntent);
        }
    }
}