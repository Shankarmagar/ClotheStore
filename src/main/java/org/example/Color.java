package org.example;

import java.util.ArrayList;

public enum Color {
    Black("Color is Black"),
    White("Color is White"),
    green("Color is green"),
    grey("Color is grey"),
    Brown("Color is Brown"),
    Yellow("Color is Yellow");

    private String colorName;
    Color(String colorName)
    {
       this.colorName = colorName;
    }

    public String getColorName() {
        return colorName;
    }


}
