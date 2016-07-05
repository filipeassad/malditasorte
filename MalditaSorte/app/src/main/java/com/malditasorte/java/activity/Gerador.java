package com.malditasorte.java.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.malditasorte.java.model.Numero;
import com.malditasorte.java.util.VariaveisEstaticas;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by 0118431 on 29/06/2016.
 */
public class Gerador extends Activity {

    private Button btnGerar;
    private EditText edtVarSem;
    private EditText edtVarMes;
    private EditText edtDinoSem;
    private EditText edtDinoMes;
    private EditText edtRandom;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gerador);

        btnGerar        = (Button) findViewById(R.id.btnGerar);
        edtVarSem       = (EditText) findViewById(R.id.edtVarSem);
        edtVarMes       = (EditText) findViewById(R.id.edtVarMes);
        edtDinoSem      = (EditText) findViewById(R.id.edtDinoSem);
        edtDinoMes      = (EditText) findViewById(R.id.edtDinoMes);
        edtRandom       = (EditText) findViewById(R.id.edtRandom);

        acoes();
    }

    private void acoes(){
        btnGerar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                montaJogos();
            }
        });
    }

    private void montaJogos(){

        List<Numero> nS = VariaveisEstaticas.getNumerosSemana();
        List<Numero> nM = VariaveisEstaticas.getNumerosMes();



        String variadoSemana = "";
        String variadoMes = "";
        String dinossauroSemana = "";
        String dinossauroMes = "";
        String random = "";

        variadoSemana = nS.get(1).getValorN() + " - "  + nS.get(2).getValorN() + " - "  + nS.get(3).getValorN() + " - "  + nS.get(5).getValorN() + " - "  + nS.get(7).getValorN() + " - "  +
                        nS.get(9).getValorN() + " - "  + nS.get(11).getValorN() + " - "  + nS.get(12).getValorN() + " - "  + nS.get(13).getValorN() + " - "  + nS.get(15).getValorN() + " - "  +
                        nS.get(17).getValorN() + " - "  + nS.get(19).getValorN() + " - "  + nS.get(21).getValorN() + " - "  + nS.get(22).getValorN() + " - "  + nS.get(23).getValorN();

        variadoMes =    nM.get(1).getValorN() + " - "  + nM.get(2).getValorN() + " - "  + nM.get(3).getValorN() + " - "  + nM.get(5).getValorN() + " - "  + nM.get(7).getValorN() + " - "  +
                        nM.get(9).getValorN() + " - "  + nM.get(11).getValorN() + " - "  + nM.get(12).getValorN() + " - "  + nM.get(13).getValorN() + " - "  + nM.get(15).getValorN() + " - "  +
                        nM.get(17).getValorN() + " - "  + nM.get(19).getValorN() + " - "  + nM.get(21).getValorN() + " - "  + nM.get(22).getValorN() + " - "  + nM.get(23).getValorN();

        dinossauroSemana = nS.get(0).getValorN() + " - "  + nS.get(4).getValorN() + " - "  + nS.get(6).getValorN() + " - "  + nS.get(7).getValorN() + " - "  + nS.get(8).getValorN() + " - "  +
                           nS.get(10).getValorN() + " - "  + nS.get(11).getValorN() + " - "  + nS.get(12).getValorN() + " - "  + nS.get(13).getValorN() + " - "  + nS.get(14).getValorN() + " - "  +
                           nS.get(16).getValorN() + " - "  + nS.get(17).getValorN() + " - "  + nS.get(18).getValorN() + " - "  + nS.get(20).getValorN() + " - "  + nS.get(24).getValorN();

        dinossauroMes =    nM.get(0).getValorN() + " - "  + nM.get(4).getValorN() + " - "  + nM.get(6).getValorN() + " - "  + nM.get(7).getValorN() + " - "  + nM.get(8).getValorN() + " - "  +
                           nM.get(10).getValorN() + " - "  + nM.get(11).getValorN() + " - "  + nM.get(12).getValorN() + " - "  + nM.get(13).getValorN() + " - "  + nM.get(14).getValorN()+ " - "  +
                           nM.get(16).getValorN() + " - "  + nM.get(17).getValorN() + " - "  + nM.get(18).getValorN() + " - "  + nM.get(20).getValorN() + " - "  + nM.get(24).getValorN();

        Random aleatorio = new Random();
        List<Integer> historico = new ArrayList<>();

        for(int i = 0; i < 15; i++){
            int valor = aleatorio.nextInt(25);
            if(verificaRepetido(historico,valor)){
                while (verificaRepetido(historico,valor)){
                    valor = aleatorio.nextInt(25);
                }
            }
            historico.add(valor);
        }

        random = historico.get(0) + " - " + historico.get(1) + " - " + historico.get(2) + " - " + historico.get(3) + " - " + historico.get(4) + " - " +
                 historico.get(5) + " - " + historico.get(6) + " - " + historico.get(7) + " - " + historico.get(8) + " - " + historico.get(9) + " - " +
                 historico.get(10) + " - " + historico.get(11) + " - " + historico.get(12) + " - " + historico.get(13) + " - " + historico.get(14);


        edtVarSem.setText(variadoSemana);
        edtVarMes.setText(variadoMes);
        edtDinoSem.setText(dinossauroSemana);
        edtDinoMes.setText(dinossauroMes);
        edtRandom.setText(random);

    }

    private boolean verificaRepetido(List<Integer> hist, int valor){

        for(Integer valorAux: hist){
            if(valor == valorAux){
                return true;
            }
        }

        return false;
    }
}
