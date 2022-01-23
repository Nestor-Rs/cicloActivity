package com.JaguarTeam.claseanahuacdam;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    //Se crea el activity
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Depura", "Se creo");
    }
    //Inicia el activity
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Depura", "Inicio");
    }
    //el activity esta en resumen (primer plano)
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Depura", "Esta en el resumen");
    }
    //El activity esta en pausa (segundo plano)
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Depura", "Esta en Pausa");
    }
    //El activity esta detenido (segundo plano)
    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Depura", "Se detuvo");
    }
    //Se destruyo el activity al salir de la aplicacion
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Depura", "Se destruyo");
    }


}