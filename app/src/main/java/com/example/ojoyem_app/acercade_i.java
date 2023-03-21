package com.example.ojoyem_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class acercade_i extends AppCompatActivity {
    ImageButton regresar_p;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acercade_i);

        //Boton de regresar
        regresar_p = (ImageButton) findViewById(R.id.regresar);
        regresar_p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }

    public void inicio_s(View view){
        Intent inicio_se = new Intent( this, inicio_sesion.class);
        startActivity(inicio_se);
    }
}