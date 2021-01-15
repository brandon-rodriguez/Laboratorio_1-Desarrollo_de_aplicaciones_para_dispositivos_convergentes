package com.example.laboratorio1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Enviar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enviar);
        String mensaje=  getIntent().getStringExtra("MENSAJE");
        TextView et = (TextView) findViewById(R.id.mensajeEnviado);
        et.setText(mensaje);
    }
}