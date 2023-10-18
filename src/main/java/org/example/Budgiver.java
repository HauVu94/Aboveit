package org.example;

public class Budgiver {
    // fields
    private String navn;
    private String telefonNummer;

    //constructor
    public Budgiver(String navn, String telefonNummer) {
        this.navn = navn;
        this.telefonNummer = telefonNummer;
    }

    // Methods
    public Bud opprettBud(Bolig bolig, int timerTilFrist, int minutterTilFrist, int belop){
        long akseptFrist = System.currentTimeMillis() + (timerTilFrist * 3600 * 1000) + (minutterTilFrist * 60 * 1000);
        Bud nyttBud = new Bud(bolig, this, belop, akseptFrist);
        bolig.leggTilBud(nyttBud);
        return nyttBud;
    }

    //getters
    public String getNavn() {
        return navn;
    }

    public String getTelefonNummer() {
        return telefonNummer;
    }
}
