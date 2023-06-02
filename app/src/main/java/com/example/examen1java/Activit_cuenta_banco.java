package com.example.examen1java;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Activit_cuenta_banco extends AppCompatActivity {

    private TextView lblNombre;
    private TextView lblSaldo;
    private TextView lblBanco;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activit_cuenta_banco);

        iniciarComponentes();

        String nombre = getIntent().getStringExtra("nombre");
        String banco = getIntent().getStringExtra("banco");
        String saldo = getIntent().getStringExtra("saldo");

        lblNombre.setText(nombre);
        lblBanco.setText(banco);
        lblSaldo.setText(saldo);
    }

    private void iniciarComponentes() {
        lblNombre = findViewById(R.id.lblNombreCliente);
        lblBanco = findViewById(R.id.lblBanco);
        lblSaldo = findViewById(R.id.lblSaldo);
    }
}

