package com.malditasorte.java.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by 0118431 on 29/06/2016.
 */
public class TelaPrincipal extends Activity {

    private Button btnGerador;
    private Button btnBusca;
    private Button btnDadosSalvos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_principal);

        btnGerador      = (Button) findViewById(R.id.btnGerador);
        btnBusca        = (Button) findViewById(R.id.btnBusca);
        btnDadosSalvos  = (Button) findViewById(R.id.btnDadosSalvos);

        acoes();
    }

    private void acoes(){

        btnGerador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Gerador.class);
                startActivity(intent);
            }
        });

        btnBusca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), BuscaJogo.class);
                startActivity(intent);
            }
        });

        btnDadosSalvos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), DadosSalvos.class);
                startActivity(intent);
            }
        });

    }
}
