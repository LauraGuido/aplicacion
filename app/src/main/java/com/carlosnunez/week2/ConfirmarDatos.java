package com.carlosnunez.week2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class ConfirmarDatos extends AppCompatActivity {

    private TextView textNombre, textTel, textMail, textDescri;
    private TextView textFecha;
    Button botonAtras;
    private int foto;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmar_datos);

        textNombre = (TextView) findViewById(R.id.textNombre);
        textTel = (TextView) findViewById(R.id.textTel);
        textMail = (TextView) findViewById(R.id.textMail);
        textDescri = (TextView) findViewById(R.id.textDescri);
        textFecha = (TextView) findViewById(R.id.textFecha);

        String nombre = getIntent().getStringExtra("nombre");
        textNombre.setText(nombre);

        String  telefono = getIntent().getStringExtra("telefono");
        textTel.setText(telefono);

        String  email = getIntent().getStringExtra("email");
        textMail.setText(email);

        String  descripcion = getIntent().getStringExtra("descripcion");
        textDescri.setText(descripcion);

        String  fecha = getIntent().getStringExtra("fecha");
        textFecha.setText(fecha.toString());


        Button botonAtras = (Button) findViewById(R.id.btnAtras);
        botonAtras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
                //Añade más funcionalidades
            }
        });

    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}