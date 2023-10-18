package org.example;

import java.util.ArrayList;
import java.util.List;

public class Bolig {
    //fields
    private String gateAdresse;
    private String postNummer;
    private int takstPris;

    private Bud vinnerBud;
    private List<Bud> budList;

    // constructor
    public Bolig(String gateAdresse, String postNummer, int takstPris) {
        this.gateAdresse = gateAdresse;
        this.postNummer = postNummer;
        this.takstPris = takstPris;
        this.budList = new ArrayList<>();
    }

    // methods
    public void leggTilBud(Bud bud){
        budList.add(bud);
    }

    public void solgt(Bud vinnerBud){
        this.vinnerBud = vinnerBud;
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

    public Bud getVinnerBud() {
        return vinnerBud;
    }

    public List<Bud> getBudList() {
        return budList;
    }
}
