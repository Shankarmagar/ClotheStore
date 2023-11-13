package org.example;

import java.util.ArrayList;

public class Clothes {
    Color clotheColor = Color.Black;
    FitType clotheFitType = FitType.Men;
    Size clotheSize = Size.Small;

    String name;

    public Clothes(Color clotheColor, FitType clotheFitType, Size clotheSize, String name) {
        this.clotheColor = clotheColor;
        this.clotheFitType = clotheFitType;
        this.clotheSize = clotheSize;
        this.name = name;
    }
    public void displayClotheDescription()
    {
      System.out.println("Name: "+ this.name +
              "\n"+ this.clotheColor.getColorName()+
              "\n"+ this.clotheFitType.getFitting() +
              "\n"+ this.clotheSize.getDisplaySize());
    }
}
