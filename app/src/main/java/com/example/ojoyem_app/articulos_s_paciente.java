package com.example.ojoyem_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class articulos_s_paciente extends AppCompatActivity {

    ListView articulos;
    List<String> titulo;
    List<String> nombre;
    List<String> descripcion;
    int [] perfil;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_articulos_pacientes);

        articulos = findViewById(R.id.lista_a);

        nombre = new ArrayList<String>();
        nombre.add("Raul ramirez perez");
        nombre.add("radan rikmnos perez");

        titulo = new ArrayList<String>();
        titulo.add("chochito");
        titulo.add("chalo");

        descripcion = new ArrayList<String>();
        descripcion.add("asdasdjkahdjaskdhasjkdhaskd");
        descripcion.add("adskjdhajkdhkashdakdhakjshdkas");

        int [] perfil={
                R.drawable.arrow_arrows_48,
                R.drawable.arrow_left,
        };

        plantilla_articulo articulo_n = new plantilla_articulo(this, R.layout.articulos, nombre,titulo,descripcion,perfil);

        articulos.setAdapter(articulo_n);
        
        articulos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(articulos_s_paciente.this, "", Toast.LENGTH_SHORT).show();
            }
        });
    }
}