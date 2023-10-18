package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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

    public List<Bud> hentAktiveBudSortertEtterFristen(){
        List<Bud> aktivbud = new ArrayList<>();
        long tid = System.currentTimeMillis();

        for (Bud bud : budList){
            if (bud.getAkseptfrist() > tid){
                aktivbud.add(bud);
            }
        }
        Collections.sort(aktivbud, Comparator.comparing(Bud::getAkseptfrist));

        return aktivbud;
    }

    public Bud hentHoyesteAktiveBud(){
        List<Bud> aktiveBud = hentAktiveBudSortertEtterFristen();

        if (!aktiveBud.isEmpty()){
            Bud hoyesteBud = aktiveBud.get(0);
            for (var i = 0; i < aktiveBud.size(); i++){
                Bud temp = aktiveBud.get(i);
                if (hoyesteBud.getBelop() < temp.getBelop()){
                    hoyesteBud = temp;
                }
            }
            return hoyesteBud;
        }else {
            return null;
        }
    }

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
