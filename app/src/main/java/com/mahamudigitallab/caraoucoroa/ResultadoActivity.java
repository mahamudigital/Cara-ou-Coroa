package com.mahamudigitallab.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ResultadoActivity extends AppCompatActivity {

    private Button botaoVoltar;
    private ImageView imagemResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);
        imagemResultado = findViewById(R.id.imageResultado);

        //recupera dados que veio da activity principal
        logicaDoJogo();

        botaoVoltar = findViewById(R.id.buttonVoltar);
        botaoVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


    }

    private void logicaDoJogo() {// captura o número gerado na tela anterior e aplica a regra de negocio
        Bundle dados = getIntent().getExtras();
        int numero = dados.getInt("numero"); // recuperou o numero
        if (numero == 0) {//cara
            imagemResultado.setImageResource(R.drawable.moeda_cara);
        } else {// coroa
            imagemResultado.setImageResource(R.drawable.moeda_coroa);
        }
    }
}