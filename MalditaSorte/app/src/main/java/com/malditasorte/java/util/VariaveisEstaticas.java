package com.malditasorte.java.util;

import com.malditasorte.java.model.Jogo;
import com.malditasorte.java.model.Numero;

import java.util.List;

/**
 * Created by 0118431 on 30/06/2016.
 */
public class VariaveisEstaticas {
    public static List<Jogo> Jogos;
    public static List<Numero> numeros;
    public static List<Numero> numerosSemana;
    public static List<Numero> numerosMes;

    public static List<Jogo> getJogos() {
        return Jogos;
    }

    public static void setJogos(List<Jogo> jogos) {
        Jogos = jogos;
    }

    public static List<Numero> getNumeros() {
        return numeros;
    }

    public static void setNumeros(List<Numero> numeros) {
        VariaveisEstaticas.numeros = numeros;
    }

    public static List<Numero> getNumerosSemana() {
        return numerosSemana;
    }

    public static void setNumerosSemana(List<Numero> numerosSemana) {
        VariaveisEstaticas.numerosSemana = numerosSemana;
    }

    public static List<Numero> getNumerosMes() {
        return numerosMes;
    }

    public static void setNumerosMes(List<Numero> numerosMes) {
        VariaveisEstaticas.numerosMes = numerosMes;
    }
}
