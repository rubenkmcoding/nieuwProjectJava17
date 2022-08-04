package com.company;

public class Stookketel implements Vervuiler {

    float CONorm;

    public Stookketel(float CONorm) {
        this.CONorm = CONorm;
    }

    public float getCONorm() {
        return CONorm;
    }

    public void setCONorm(float CONorm) {
        if (CONorm > 0.0){
            this.CONorm = CONorm;
        }
    }

    @Override
    public double berekenVerluiling() {
        return CONorm * 100.0F;
    }

    @Override
    public String toString() {
        return "Stookketel" + CONorm ;
    }


}
