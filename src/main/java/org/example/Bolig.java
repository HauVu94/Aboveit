package org.example;

public class Bolig {
    //fields
    private String gateAdresse;
    private String postNummer;
    private int takstPris;

    // constructor
    public Bolig(String gateAdresse, String postNummer, int takstPris) {
        this.gateAdresse = gateAdresse;
        this.postNummer = postNummer;
        this.takstPris = takstPris;
    }


    // getters

    public String getGateAdresse() {
        return gateAdresse;
    }

    public String getPostNummer() {
        return postNummer;
    }

    public int getTakstPris() {
        return takstPris;
    }
}
