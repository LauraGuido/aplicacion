package com.carlosnunez.week2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

import java.time.format.DateTimeFormatter;

public class MainActivity extends AppCompatActivity {
    //declaro el botón
    Button  botonSig;
    private EditText campoNombre, campoTelefono, campoEMail, campoDescripcion;
    private DatePicker campoFecha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        campoNombre = (EditText) findViewById(R.id.txt_Nombre);
        campoTelefono = (EditText) findViewById(R.id.txt_Tel);
        campoEMail = (EditText) findViewById(R.id.txt_Mail);
        campoDescripcion = (EditText) findViewById(R.id.txt_Descri);
        campoFecha = (DatePicker) findViewById(R.id.datePicker1);
        //voy a convertir la fecha en un string
        //String date = campoFecha.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));

        botonSig = (Button) findViewById(R.id.btnNext);
        botonSig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //startActivity(new Intent(MainActivity.this, ConfirmarDatos.class)); //esto solo redireciona

                Intent i = new Intent (MainActivity.this, ConfirmarDatos.class);
                i.putExtra("nombre", campoNombre.getText().toString());
                i.putExtra("telefono", campoTelefono.getText().toString());
                i.putExtra("email", campoEMail.getText().toString());
                i.putExtra("descripcion", campoDescripcion.getText().toString());
                i.putExtra("fecha", campoFecha.getDayOfMonth() + "/" + campoFecha.getMonth()+ "/" + campoFecha.getYear());

                startActivity(i);

            }
        });




    }
}