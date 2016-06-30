package com.malditasorte.java.util;

import android.content.Context;
import android.content.res.AssetManager;

import com.malditasorte.java.model.Jogo;
import com.malditasorte.java.model.Numero;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Filipe on 29/06/2016.
 */
public class MetodosBasicos {

    public static Date stringToDate(String data){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date date = null;
        try {
            date = sdf.parse(data);
            return date;

        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String DateToString(Date data){
        if(data != null){
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            return sdf.format(data);
        }
        return "";
    }

    public static List<Jogo> leArquivo(Context mContext){
        
        List<Jogo> listaJogos = new ArrayList<>();
        AssetManager am = mContext.getAssets();

        try {

            InputStream is = am.open("jogosAnteriores.txt");
            InputStreamReader isr = new InputStreamReader(is);

            BufferedReader br = new BufferedReader(isr);

            String linha = br.readLine();
            int cod = 1;

            while(linha != null){
                listaJogos.add(jogoByString(linha, cod));
                cod++;
                linha = br.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return listaJogos;
    }

    public static Jogo jogoByString(String linha, int cod){

        String[] pString = linha.split("\\t");

        int[] numero = new int[15];
        Date data = stringToDate(pString[0]);

        for(int i = 0; i < 15; i++){
            numero[i] = Integer.parseInt(pString[i + 1]);
        }

        Jogo jogo = new Jogo();
        
        jogo.setCodJogo(cod);
        jogo.setDesJogo("Jogo de " + pString[0]);
        jogo.setaNumeros(numero);
        jogo.setDatJogo(data);

        return jogo;
    }

    public static List<Jogo> buscaJogo(List<Jogo> lista, Jogo jogo){

        List<Jogo> jogosIguais = new ArrayList<>();

        for(Jogo jogoAux :lista){
            if(comparaJogo(jogoAux,jogo)){
                jogosIguais.add(jogoAux);
            }
        }

        return jogosIguais;
    }

    public static boolean comparaJogo(Jogo jogo1, Jogo jogo2){

        for(int i = 0; i < jogo1.getaNumeros().length; i++){

            boolean encontrou = false;

            for(int j = 0; j < jogo2.getaNumeros().length; j++){
                if(jogo1.getaNumeros()[i] ==  jogo2.getaNumeros()[j]){
                    encontrou = true;
                    break;
                }
            }

            if(!encontrou){
                return false;
            }
        }
        return true;
    }

    public static int acertoNumero(Jogo jogo, Numero numero){

        int acerto = 0;
        for(int i = 0; i < jogo.getaNumeros().length; i++){
            if(numero.getValorN() == jogo.getaNumeros()[i]){
                acerto ++;
            }
        }

        return acerto;
    }

    public static int nAcertosJogo(Jogo jogo1, Jogo jogo2){

        int acerto = 0;

        for(int i = 0; i < jogo1.getaNumeros().length; i++){
            for(int j = 0; j < jogo2.getaNumeros().length; j++){
                if(jogo1.getaNumeros()[i] ==  jogo2.getaNumeros()[j]){
                    acerto ++;
                }
            }

        }
        return acerto;
    }

}
