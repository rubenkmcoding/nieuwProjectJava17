package com.company;

import java.text.DecimalFormat;

public class VoertuigMain {

    public static void main(String[] args) {


        Personenwagen opel1 = new Personenwagen();
        opel1.toon();
        System.out.println(opel1);
        Personenwagen opel2 = new Personenwagen("Jan Klaasen",
                14599.0F, 105, 6.8F, "1-KLM-099", 5, 5);
        opel2.toon();
        System.out.println(opel2);
        opel2.setKostprijs(-15000);
        opel2.setAantalDeuren(-7);
        opel2.setAantalPassagiers(0);
        System.out.println(opel2); //opel2 is niet gewijzigd
        Vrachtwagen volvo1 = new Vrachtwagen();
        volvo1.toon();
        System.out.println(volvo1);
        Vrachtwagen volvo2 = new Vrachtwagen("Michel Dewolf",
                214599.0F, 440, 33.1F, "1-PRD-441", 6000.0F);
        volvo2.toon();

        DecimalFormat fmt = new DecimalFormat("#0.00");
        System.out.println(volvo2);

        System.out.println();
        System.out.println("Kyotoscore personenwagen 1: " + opel1.getKyotoScore());
        System.out.println("Kyotoscore personenwagen 2: " + opel2.getKyotoScore());
        System.out.println("Kyotoscore vrachtwagen 1: " + volvo1.getKyotoScore());
        System.out.println("Kyotoscore vrachtwagen 2: " + volvo2.getKyotoScore());
        //polymorfisme
        Voertuig[] voertuigen = new Voertuig[4];
        voertuigen[0] = opel1;
        voertuigen[1] = opel2;
        voertuigen[2] = volvo1;
        voertuigen[3] = volvo2;
        System.out.println("\n--- toString()---");
        for (Voertuig voertuig : voertuigen){
            System.out.println(voertuig);
        }
        System.out.println("\n--- method toon() ---");
        for (Voertuig voertuig : voertuigen) {
            voertuig.toon();
        }

        Vervuiler[] vervuilers = new Vervuiler[4];
        vervuilers[0] = volvo1;
        vervuilers[1] = opel2;
        vervuilers[2] = volvo2;
        vervuilers[3] = new Stookketel(7.0F);

        for (Vervuiler vervuiler : vervuilers){
            System.out.println("vuil : " + fmt.format(vervuiler.berekenVerluiling()));
        }

        Private [] privates = new Private[4];

        privates [0] = volvo1;
        privates [1] = opel1;
        voertuigen[2] = opel2;
        voertuigen[3] = volvo2;

        for (Voertuig auto : voertuigen){
            auto.geefPrivateData();
        }

        Millieu[] millieus = new Millieu[4];
        millieus[0] = volvo2;
        millieus[1] = volvo1;
        millieus[2] = opel1;
        voertuigen[3] = opel2;

        for (Voertuig auto : voertuigen){
            auto.geefMillieuData();


        }



        // takenbundel pagina 20
    }
}
