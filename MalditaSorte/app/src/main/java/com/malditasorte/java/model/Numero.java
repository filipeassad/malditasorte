package com.malditasorte.java.model;


/**
 * Created by 0118431 on 30/06/2016.
 */
public class Numero implements Comparable<Numero>{

    int valorN;
    int nAcertos;

    public Numero() {
    }

    public Numero(int valorN, int nAcertos) {
        this.valorN = valorN;
        this.nAcertos = nAcertos;
    }

    public Numero(int valorN) {
        this.valorN = valorN;
    }

    public int getValorN() {
        return valorN;
    }

    public void setValorN(int valorN) {
        this.valorN = valorN;
    }

    public int getnAcertos() {
        return nAcertos;
    }

    public void setnAcertos(int nAcertos) {
        this.nAcertos = nAcertos;
    }

    @Override
    public int compareTo(Numero another) {
        if (this.getnAcertos() < another.getnAcertos()) {
            return -1;
        }
        if (this.getnAcertos() > another.getnAcertos()) {
            return 1;
        }
        return 0;
    }
}
