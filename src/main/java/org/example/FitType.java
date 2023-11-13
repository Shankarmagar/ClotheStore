package org.example;

public enum FitType {
    Men("FitType is Men"),
    Women("FitType is Women"),
    WomenPlus("FitType is WomenPlus"),
    Youth("FitType is Youth"),
    MenPlus("FitType is MenPlus");

    public String getFitting() {
        return fitting;
    }


    private String fitting;

    FitType(String fitting) // tiny c
    {
     this.fitting = fitting;
    }
}
