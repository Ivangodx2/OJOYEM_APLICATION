package com.example.ojoyem_app;

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
    public void inicios(View view){
        Intent siguiente = new Intent( this, acercade_i.class);
        startActivity(siguiente);
    }

    public void inicio_S(View view){
        Intent inicios = new Intent( this, inicio_sesion.class);
        startActivity(inicios);
    }
}