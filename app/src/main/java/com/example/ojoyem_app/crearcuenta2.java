package com.example.ojoyem_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class crearcuenta2 extends AppCompatActivity {
    ImageButton regresar_p;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crearcuenta2);

        //Si es especialista implementar radioboton

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
}