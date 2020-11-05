package com.example.biblioteca_cadetrobenson;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

import Clases.Libros;

public class Github_act extends AppCompatActivity {


    private Spinner spin;
    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_github_act);

        spin = (Spinner) findViewById(R.id.spinLibros);
        text = (TextView) findViewById(R.id.tv);

        ArrayList<String> listaLibros = (ArrayList<String>) getIntent().getSerializableExtra("listaLibros");

        ArrayAdapter<String> adapt = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listaLibros);

        spin.setAdapter(adapt);

    }
    public void Text(View v)
    {
            String libro = spin.getSelectedItem().toString();

            Libros libros = new Libros();

            int precioFarenheit = libros.getFarenheit();
            int precioRevival = libros.getRevival();
            int precioElAlquimista = libros.getElAlquimista();

            if (libro.equals("Farenheit")) {
                text.setText("El valor de " + libro + " es: " + precioFarenheit);
            }

            if (libro.equals("Revival")) {
                text.setText("El valor de " + libro + " es: " + precioRevival);
            }

            if (libro.equals("El Alquimista")) {
                text.setText("El valor de " + libro + " es: " + precioElAlquimista);
            }
    }


}