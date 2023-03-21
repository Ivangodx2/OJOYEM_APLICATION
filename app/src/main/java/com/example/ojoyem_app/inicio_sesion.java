package com.example.ojoyem_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class inicio_sesion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio_sesion);
    }

    public void volver_p(View view){
        Intent pantalla_p = new Intent( this, MainActivity.class);
        startActivity(pantalla_p);
    }

    public void crearcuenta(View view){
        Intent crearc = new Intent( this, crearcuenta_1.class);
        startActivity(crearc);
    }

    public void acerca_de(View view){
        Intent acerca_p = new Intent( this, acercade_i.class);
        startActivity(acerca_p);
    }
}