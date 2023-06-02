package com.example.examen1java;import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button btnIngresar;
    private Button btnSalir;
    private EditText txtNumeroCuenta;
    private EditText txtNombre;
    private EditText txtBanco;
    private EditText txtSaldo;

    private String nombre = "";
    private String banco = "";
    private String saldo = "";
    private String numCuenta = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iniciarComponentes();

        btnIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnIngresar();
            }
        });

        btnSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnSalir();
            }
        });
    }

    private void iniciarComponentes() {
        btnIngresar = findViewById(R.id.btnEnviar);
        btnSalir = findViewById(R.id.btnSalir);
        txtNumeroCuenta = findViewById(R.id.txtNumeroCuenta);
        txtNombre = findViewById(R.id.txtNombre);
        txtBanco = findViewById(R.id.txtBanco);
        txtSaldo = findViewById(R.id.txtSaldo);
    }

    private void btnIngresar() {
        nombre = txtNombre.getText().toString();
        banco = txtBanco.getText().toString();
        saldo = txtSaldo.getText().toString();
        numCuenta = txtNumeroCuenta.getText().toString();

        if (txtNombre.getText().toString().equals("") || txtBanco.getText().toString().equals("") || txtSaldo.getText().toString().equals("") || txtNumeroCuenta.getText().toString().equals("")) {
            Toast.makeText(getApplicationContext(), "No deje campos vacíos", Toast.LENGTH_SHORT).show();
        } else {
            Intent intent = new Intent(this, CuentaBancoActivity.class);
            intent.putExtra("nombre", nombre);
            intent.putExtra("banco", banco);
            intent.putExtra("saldo", saldo);
            intent.putExtra("numCuenta", numCuenta);
            startActivity(intent);
        }
    }

    private void btnSalir() {
        AlertDialog.Builder confirmar = new AlertDialog.Builder(this);
        confirmar.setTitle("BANCO");
        confirmar.setMessage("¿Desea Salir?");
        confirmar.setPositiveButton("Confirmar", (dialog, which) -> finish());
        confirmar.setNegativeButton("Cancelar", (dialog, which) -> {
            // No hacer nada
        });

        confirmar.show();
    }
}



