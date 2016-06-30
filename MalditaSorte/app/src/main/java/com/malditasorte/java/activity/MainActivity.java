package com.malditasorte.java.activity;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import com.malditasorte.java.model.Jogo;
import com.malditasorte.java.model.Numero;
import com.malditasorte.java.util.MetodosBasicos;
import com.malditasorte.java.util.VariaveisEstaticas;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

    private FrameLayout llPrincipal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        llPrincipal = (FrameLayout) findViewById(R.id.llPrincipal);

        VariaveisEstaticas.setJogos(MetodosBasicos.leArquivo(this));

        populaNumeros();

        llPrincipal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),TelaPrincipal.class);
                startActivity(intent);
            }
        });

    }

    private void populaNumeros(){

        List<Numero> listaNumero = new ArrayList<Numero>(){{ add(new Numero(1)); add(new Numero(2)); add(new Numero(3)); add(new Numero(4)); add(new Numero(5));
                                                             add(new Numero(6)); add(new Numero(7)); add(new Numero(8)); add(new Numero(9)); add(new Numero(10));
                                                             add(new Numero(11)); add(new Numero(12)); add(new Numero(13)); add(new Numero(14)); add(new Numero(15));
                                                             add(new Numero(16)); add(new Numero(17)); add(new Numero(18)); add(new Numero(19)); add(new Numero(20));
                                                             add(new Numero(21)); add(new Numero(22)); add(new Numero(23)); add(new Numero(24)); add(new Numero(25));
                                                          }};

        for(Numero numAux :listaNumero){
            numAux.setnAcertos(0);
            for (Jogo jogoAux :VariaveisEstaticas.getJogos()){
                numAux.setnAcertos(numAux.getnAcertos() + MetodosBasicos.acertoNumero(jogoAux,numAux));
            }
        }

        VariaveisEstaticas.setNumeros(listaNumero);

    }

}
