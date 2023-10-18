package org.example;

public class Bud {
    //fields
    private Bolig bolig;
    private Budgiver budgiver;
    private int belop;
    private long akseptfrist;

    //constructor
    public Bud(Bolig bolig, Budgiver budgiver, int belop, long akseptfrist) {
        this.bolig = bolig;
        this.budgiver = budgiver;
        this.belop = belop;
        this.akseptfrist = akseptfrist;
    }

    // getters

    public Bolig getBolig() {
        return bolig;
    }

    public Budgiver getBudgiver() {
        return budgiver;
    }

    public int getBelop() {
        return belop;
    }

    public long getAkseptfrist() {
        return akseptfrist;
    }
}
