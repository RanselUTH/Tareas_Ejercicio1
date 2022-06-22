package com.example.tareas_ejercicio1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText numero1, numero2;
    Button suma, resta, division, multi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numero1 = (EditText) findViewById(R.id.txtnumero1);
        numero2 = (EditText) findViewById(R.id.txtnumero2);
        suma = (Button) findViewById(R.id.butsuma);
        resta = (Button) findViewById(R.id.butresta);
        division = (Button) findViewById(R.id.butdivision);
        multi = (Button) findViewById(R.id.butmulti);

        suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                int n1 = Integer.parseInt(numero1.getText().toString());
                int n2 = Integer.parseInt(numero2.getText().toString());
                int result = n1 + n2;
                String res;
                res = String.valueOf(result);
                intent.putExtra("resultado", res);
                startActivity(intent);
            }
        });

        resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                int n1 = Integer.parseInt(numero1.getText().toString());
                int n2 = Integer.parseInt(numero2.getText().toString());
                int result = n1 - n2;
                String res;
                res = String.valueOf(result);
                intent.putExtra("resultado", res);
                startActivity(intent);
            }
        });

        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                int n1 = Integer.parseInt(numero1.getText().toString());
                int n2 = Integer.parseInt(numero2.getText().toString());
                int result = n1 / n2;
                String res;
                res = String.valueOf(result);
                intent.putExtra("resultado", res);
                startActivity(intent);
            }
        });

        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                int n1 = Integer.parseInt(numero1.getText().toString());
                int n2 = Integer.parseInt(numero2.getText().toString());
                int result = n1 * n2;
                String res;
                res = String.valueOf(result);
                intent.putExtra("resultado", res);
                startActivity(intent);
            }
        });
    }
    }
