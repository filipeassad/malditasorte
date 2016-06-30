package com.malditasorte.java.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.malditasorte.java.adapter.HistoricoAdapter;
import com.malditasorte.java.model.Jogo;
import com.malditasorte.java.util.MetodosBasicos;
import com.malditasorte.java.util.VariaveisEstaticas;

import java.util.List;

/**
 * Created by 0118431 on 29/06/2016.
 */
public class BuscaJogo extends Activity {

    private ListView lvResultado;
    private Button btnBuscar;

    private EditText edtNumero1;
    private EditText edtNumero2;
    private EditText edtNumero3;
    private EditText edtNumero4;
    private EditText edtNumero5;
    private EditText edtNumero6;
    private EditText edtNumero7;
    private EditText edtNumero8;
    private EditText edtNumero9;
    private EditText edtNumero10;
    private EditText edtNumero11;
    private EditText edtNumero12;
    private EditText edtNumero13;
    private EditText edtNumero14;
    private EditText edtNumero15;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.busca_jogo);

        lvResultado     = (ListView) findViewById(R.id.lvResultado);
        btnBuscar       = (Button) findViewById(R.id.btnBuscar);

        edtNumero1      = (EditText) findViewById(R.id.edtNumero1);
        edtNumero2      = (EditText) findViewById(R.id.edtNumero2);
        edtNumero3      = (EditText) findViewById(R.id.edtNumero3);
        edtNumero4      = (EditText) findViewById(R.id.edtNumero4);
        edtNumero5      = (EditText) findViewById(R.id.edtNumero5);
        edtNumero6      = (EditText) findViewById(R.id.edtNumero6);
        edtNumero7      = (EditText) findViewById(R.id.edtNumero7);
        edtNumero8      = (EditText) findViewById(R.id.edtNumero8);
        edtNumero9      = (EditText) findViewById(R.id.edtNumero9);
        edtNumero10     = (EditText) findViewById(R.id.edtNumero10);
        edtNumero11     = (EditText) findViewById(R.id.edtNumero11);
        edtNumero12     = (EditText) findViewById(R.id.edtNumero12);
        edtNumero13     = (EditText) findViewById(R.id.edtNumero13);
        edtNumero14     = (EditText) findViewById(R.id.edtNumero14);
        edtNumero15     = (EditText) findViewById(R.id.edtNumero15);

        acoes();

    }

    private void acoes(){

        btnBuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(verificaPreechimento()){
                    return;
                }

                Jogo jogo = new Jogo();
                jogo.setaNumeros(new int[15]);

                jogo.getaNumeros()[0] = Integer.parseInt(edtNumero1.getText().toString());
                jogo.getaNumeros()[1] = Integer.parseInt(edtNumero2.getText().toString());
                jogo.getaNumeros()[2] = Integer.parseInt(edtNumero3.getText().toString());
                jogo.getaNumeros()[3] = Integer.parseInt(edtNumero4.getText().toString());
                jogo.getaNumeros()[4] = Integer.parseInt(edtNumero5.getText().toString());
                jogo.getaNumeros()[5] = Integer.parseInt(edtNumero6.getText().toString());
                jogo.getaNumeros()[6] = Integer.parseInt(edtNumero7.getText().toString());
                jogo.getaNumeros()[7] = Integer.parseInt(edtNumero8.getText().toString());
                jogo.getaNumeros()[8] = Integer.parseInt(edtNumero9.getText().toString());
                jogo.getaNumeros()[9] = Integer.parseInt(edtNumero10.getText().toString());
                jogo.getaNumeros()[10] = Integer.parseInt(edtNumero11.getText().toString());
                jogo.getaNumeros()[11] = Integer.parseInt(edtNumero12.getText().toString());
                jogo.getaNumeros()[12] = Integer.parseInt(edtNumero13.getText().toString());
                jogo.getaNumeros()[13] = Integer.parseInt(edtNumero14.getText().toString());
                jogo.getaNumeros()[14] = Integer.parseInt(edtNumero15.getText().toString());

                List<Jogo> listaJogo = MetodosBasicos.buscaJogo(VariaveisEstaticas.getJogos(), jogo);

                HistoricoAdapter historicoAdapter = new HistoricoAdapter(v.getContext(), R.layout.list_adapter_historico, listaJogo);
                lvResultado.setAdapter(historicoAdapter);

            }
        });

    }

    private boolean verificaPreechimento(){

        if(edtNumero1.getText().toString().trim().equals("")){
            edtNumero1.setError("Valor não informado!");
            return true;
        }

        if(edtNumero2.getText().toString().trim().equals("")){
            edtNumero2.setError("Valor não informado!");
            return true;
        }

        if(edtNumero3.getText().toString().trim().equals("")){
            edtNumero3.setError("Valor não informado!");
            return true;
        }

        if(edtNumero4.getText().toString().trim().equals("")){
            edtNumero4.setError("Valor não informado!");
            return true;
        }

        if(edtNumero5.getText().toString().trim().equals("")){
            edtNumero5.setError("Valor não informado!");
            return true;
        }

        if(edtNumero6.getText().toString().trim().equals("")){
            edtNumero6.setError("Valor não informado!");
            return true;
        }

        if(edtNumero7.getText().toString().trim().equals("")){
            edtNumero7.setError("Valor não informado!");
            return true;
        }

        if(edtNumero8.getText().toString().trim().equals("")){
            edtNumero8.setError("Valor não informado!");
            return true;
        }

        if(edtNumero9.getText().toString().trim().equals("")){
            edtNumero9.setError("Valor não informado!");
            return true;
        }

        if(edtNumero10.getText().toString().trim().equals("")){
            edtNumero10.setError("Valor não informado!");
            return true;
        }

        if(edtNumero11.getText().toString().trim().equals("")){
            edtNumero11.setError("Valor não informado!");
            return true;
        }

        if(edtNumero12.getText().toString().trim().equals("")){
            edtNumero12.setError("Valor não informado!");
            return true;
        }

        if(edtNumero13.getText().toString().trim().equals("")){
            edtNumero13.setError("Valor não informado!");
            return true;
        }

        if(edtNumero14.getText().toString().trim().equals("")){
            edtNumero14.setError("Valor não informado!");
            return true;
        }

        if(edtNumero15.getText().toString().trim().equals("")){
            edtNumero15.setError("Valor não informado!");
            return true;
        }

        return false;
    }
}
