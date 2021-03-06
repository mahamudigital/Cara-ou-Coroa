package com.mahamudigitallab.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button botaoJogar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        botaoJogar = findViewById(R.id.buttonJogar);
        // botao abre a proxima tela
        botaoJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ResultadoActivity.class);

                // passar dados para a proxima tela

                int numero = new Random().nextInt(2); // numero 0 e 1
                intent.putExtra("numero", numero);
                startActivity(intent);
            }
        });
    }
}