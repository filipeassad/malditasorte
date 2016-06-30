package com.malditasorte.java.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by Filipe on 29/06/2016.
 */
public class Jogo {

    private Integer codJogo;
    private String desJogo;
    private String numJogo;
    private Date datJogo;
    private BigDecimal vlrJogo;
    private int[] aNumeros;

    public Jogo() {
    }

    public Jogo(Integer codJogo, String desJogo, String numJogo, Date datJogo, BigDecimal vlrJogo) {
        this.codJogo = codJogo;
        this.desJogo = desJogo;
        this.numJogo = numJogo;
        this.datJogo = datJogo;
        this.vlrJogo = vlrJogo;
    }

    public Integer getCodJogo() {
        return codJogo;
    }

    public void setCodJogo(Integer codJogo) {
        this.codJogo = codJogo;
    }

    public String getDesJogo() {
        return desJogo;
    }

    public void setDesJogo(String desJogo) {
        this.desJogo = desJogo;
    }

    public String getNumJogo() {
        return numJogo;
    }

    public void setNumJogo(String numJogo) {
        this.numJogo = numJogo;
    }

    public Date getDatJogo() {
        return datJogo;
    }

    public void setDatJogo(Date datJogo) {
        this.datJogo = datJogo;
    }

    public BigDecimal getVlrJogo() {
        return vlrJogo;
    }

    public void setVlrJogo(BigDecimal vlrJogo) {
        this.vlrJogo = vlrJogo;
    }

    public int[] getaNumeros() {
        return aNumeros;
    }

    public void setaNumeros(int[] aNumeros) {

        this.aNumeros = aNumeros;

        if(aNumeros != null){
            numJogo = "";

            for(int i = 0; i < aNumeros.length; i++){
                numJogo += aNumeros[i];
                if(i == 4 || i == 9 || i == 14){
                    numJogo += "\n";
                }else{
                    numJogo += " - ";
                }
            }
        }

    }
}
