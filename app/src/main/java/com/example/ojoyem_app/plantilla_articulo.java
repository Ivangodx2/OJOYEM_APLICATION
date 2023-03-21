package com.example.ojoyem_app;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class plantilla_articulo extends BaseAdapter {

    private Context context;
    private int layout;
    private List<String> titulo;
    private List<String> nombre;
    private List<String> descripcion;
    private int [] perfil;

    public plantilla_articulo(Context context, int layout, List<String> titulo, List<String> nombre, List<String> descripcion, int [] perfil){
        this.context=context;
        this.layout= layout;
        this.nombre=nombre;
        this.titulo=titulo;
        this.descripcion=descripcion;
        this.perfil=perfil;
    }




    @Override
    public int getCount() {

        return nombre.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View view1= view ;
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        view1 = layoutInflater.inflate(R.layout.articulos,null);

        TextView txtNombre = view1.findViewById(R.id.txtnombre);
        txtNombre.setText(nombre.get(i));

        TextView txttitulo = view1.findViewById(R.id.txtitulo);
        txttitulo.setText(titulo.get(i));

        TextView txtDes = view1.findViewById(R.id.txdescription);
        txtDes.setText(descripcion.get(i));

        ImageView ftoperfil = view1.findViewById(R.id.ftoperfil);
        ftoperfil.setImageResource(perfil[i]);

        return view1;
    }
}
