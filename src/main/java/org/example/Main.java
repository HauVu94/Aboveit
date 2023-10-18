package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Bolig bolig = new Bolig("Adresseveien 1", "1111", 1100);

        Budgiver budgiver1 = new Budgiver("Erlend", "12345678");
        Budgiver budgiver2 = new Budgiver("Martine", "87654321");

        Bud bud1 = budgiver1.opprettBud(bolig, 1, 40 , 1100);
        Bud bud2 = budgiver2.opprettBud(bolig, 1, 30 , 1200);
        Bud bud3 = budgiver1.opprettBud(bolig, 0, 14 , 1600);


        List<Bud> aktiveBud = bolig.hentAktiveBudSortertEtterFristen();
        for (Bud bud : aktiveBud){
            System.out.println("Akrive bud: " + bud.getBelop() + " NOK, fra " + bud.getBudgiver().getNavn());
        }

        System.out.println("\n");

        Bud hoyesteBud = bolig.hentHoyesteAktiveBud();
        if (hoyesteBud != null){
            System.out.println("Høyeste bud: " + hoyesteBud.getBelop() + "Nok, fra " + hoyesteBud.getBudgiver().getNavn());
        }else{
            System.out.println("Ingen aktive bud");
        }

        System.out.println("\n");

        boolean suksess = bolig.aksepterBud(bud3);
        if (suksess){
            System.out.println("Budet ble akseptert som vinnerbud.");
        }else {
            System.out.println("Budet kunne ikke aksepteres som vinnerbud.");
        }

        System.out.println("\n");
        System.out.println(bolig);
    }
}