package com.example.ojoyem_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.RadioButton;

public class crearcuenta_1 extends AppCompatActivity {

    ImageButton regresar_p;

    RadioButton hom,mu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crearcuenta1);

        hom = (RadioButton) findViewById(R.id.radio_Hom);
        mu = (RadioButton) findViewById(R.id.radio_Mu);
        //if para que se envien datos si es hombre o mujer

        //Boton de regresar
        regresar_p = (ImageButton) findViewById(R.id.regresar);
        regresar_p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }

    public void acerca_de(View view){
        Intent acerca_p = new Intent( this, acercade_i.class);
        startActivity(acerca_p);
    }

    public void siguiente_p1(View view){
        Intent siguiente = new Intent( this, crearcuenta2.class);
        startActivity(siguiente);
    }
}