package com.example.calculonota;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void teste (View view){
        EditText nome = findViewById(R.id.editTextTextNome);
        EditText nota1 = findViewById(R.id.editTextNumberNota1);
        EditText nota2 = findViewById(R.id.editTextNumberNota2);
        EditText frequencia = findViewById(R.id.editTextNumberFrequencia);

        String nomefinal = nome.getText().toString();
        Double nota1final = Double.parseDouble(nota1.getText().toString());
        Double nota2final = Double.parseDouble(nota2.getText().toString());
        Double frequenciafinal = Double.parseDouble(frequencia.getText().toString());


        Intent it = new Intent(this,funfou.class);
        Bundle parametros = new Bundle();
        parametros.putString("nome", nomefinal);
        parametros.putDouble("nota1", nota1final);
        parametros.putDouble("nota2", nota2final);
        parametros.putDouble("frequencia", frequenciafinal);
        it.putExtras(parametros);
        startActivity(it);
    }
}