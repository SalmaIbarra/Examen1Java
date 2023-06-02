package com.example.examen1java;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText numCuenta;
    private EditText nombre;
    private EditText banco;
    private EditText saldo;
    private Button enviar;
    private Button salir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Obtener referencias de los elementos del layout
        TextView encabezadoTextView = findViewById(R.id.encabezado);
        numCuenta = findViewById(R.id.numCuenta);
        nombre = findViewById(R.id.nombre);
        banco = findViewById(R.id.banco);
        saldo = findViewById(R.id.saldo);
        enviar = findViewById(R.id.enviar);
        salir = findViewById(R.id.salir);

        // Configurar el click listener para el botón "Enviar"
        enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Obtener los valores ingresados en los campos de texto
                String numCuenta = numCuenta.getText().toString();
                String nombre = nombre.getText().toString();
                String banco = banco.getText().toString();
                String saldo = saldo.getText().toString();

                // Realizar acciones con los valores ingresados, como enviarlos a través de una API o almacenarlos en una base de datos

                // Ejemplo: Mostrar los valores ingresados en el encabezado
                encabezadoTextView.setText("Información ingresada:\n" +
                        "Número de cuenta: " + numCuenta + "\n" +
                        "Nombre: " + nombre + "\n" +
                        "Banco: " + banco + "\n" +
                        "Saldo: " + saldo);
            }
        });

        // Configurar el click listener para el botón "Salir"
        salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); // Cierra la actividad y vuelve a la actividad anterior (o sale de la aplicación si no hay ninguna actividad anterior)
            }
        });
    }
}

}
