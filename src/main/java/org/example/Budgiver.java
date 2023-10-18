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

    //getters
    public String getNavn() {
        return navn;
    }

    public String getTelefonNummer() {
        return telefonNummer;
    }
}
