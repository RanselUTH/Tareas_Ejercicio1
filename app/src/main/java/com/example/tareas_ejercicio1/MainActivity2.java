package com.example.tareas_ejercicio1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    EditText resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        resultado = (EditText) findViewById(R.id.txtResultado);
        resultado.setText(getIntent().getExtras().getString("resultado"));
    }
}