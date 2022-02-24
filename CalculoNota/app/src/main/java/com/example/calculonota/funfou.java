package com.example.calculonota;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class funfou extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_funfou);
        Intent it = getIntent();
        if(it!= null){
            Bundle parametros = it.getExtras();
            if(parametros!=null){
                String nome = parametros.getString("nome");
                Double nota1 = parametros.getDouble("nota1");
                Double nota2 = parametros.getDouble("nota2");
                Double frequencia = parametros.getDouble("frequencia");
                TextView saida = findViewById(R.id.saida);
             //   saida.setText(nome);
                if(frequencia < 75){
                    saida.setText("voce reprovou por falta " + nome + " :/");
                }else{
                    if(nota1 + nota2 >= 7){
                        saida.setText("Aprovado " + nome);
                    }else{
                        if((nota1 + nota2 >=4) && (nota1 + nota2 < 7)){
                            saida.setText("Ficou para exame final "+ nome);
                        }else{
                            saida.setText("Reprovado por nota "+ nome +" :/");
                        }
                    }
                }
            }
        }
    }
}