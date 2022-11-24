package com.example.appfrasesdodiaexerccio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void gerarFrase(View view){

        String[] frases = {
            "frase1",
            "frase2",
            "frase3",
            "frase4"
        };
        int numeroRandom = new Random().nextInt(4);
        TextView texto = findViewById(R.id.texto_resultado);
        texto.setText(frases[numeroRandom]);
    }


}