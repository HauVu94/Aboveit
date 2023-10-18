package org.example;

import java.util.*;

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

    public boolean aksepterBud(Bud vinnerBud){
        if (budList.contains(vinnerBud) && System.currentTimeMillis() < vinnerBud.getAkseptfrist()){
            this.vinnerBud = vinnerBud;
            return true;
        }
        return false;
    }

    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Adresse: ").append(gateAdresse).append("\n");
        stringBuilder.append("Postnummer: ").append(postNummer).append("\n");
        stringBuilder.append("Taktpris: ").append(takstPris).append("\n");
        stringBuilder.append("Salgsproses: \n");

        if (vinnerBud == null){
            stringBuilder.append("Bolig er ikke solgt. \n");

            List<Bud> aktivBud = hentAktiveBudSortertEtterFristen();
            if (!aktivBud.isEmpty()){
                stringBuilder.append("Aktiv Bud (Sotert etter akseptfrist) \n");
                for (Bud bud : aktivBud){
                    stringBuilder.append("Budgiver: ").append(bud.getBudgiver().getNavn())
                            .append(", Bud:").append(bud.getBelop()).append(" NOK, Akseptfrist: ")
                            .append(new Date(bud.getAkseptfrist())).append("\n");
                }
            }else {
                stringBuilder.append("Ingen akrive bud.");
            }
        }else {
            stringBuilder.append("Solgt til: ").append(vinnerBud.getBudgiver().getNavn())
                    .append(" for ").append(vinnerBud.getBelop()).append(" Nok.");
        }
        return stringBuilder.toString();
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
