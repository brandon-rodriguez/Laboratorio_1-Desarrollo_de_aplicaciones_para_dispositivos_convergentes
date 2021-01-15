package com.example.laboratorio1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText et= (EditText) findViewById(R.id.mensaje);
        Button bt= (Button) findViewById(R.id.enviar);
        Button bt1= (Button) findViewById(R.id.enviarSimple);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mensaje = et.getText().toString();
                String escogerTexto = "Enviar via...";
                Intent enviar = new Intent(Intent.ACTION_SEND);
               // Intent enviar = new Intent(MainActivity.this, Enviar.class);
                enviar.setType("text/plain");
                enviar.putExtra(Intent.EXTRA_TEXT, mensaje);
                Intent escoger = Intent.createChooser(enviar, escogerTexto);
                startActivity(escoger);

            }
        });

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mensaje = et.getText().toString();
                 Intent enviar = new Intent(MainActivity.this, Enviar.class);
                enviar.setType("text/plain");
                enviar.putExtra("MENSAJE", mensaje);
                startActivity(enviar);
            }
        });
    }
}