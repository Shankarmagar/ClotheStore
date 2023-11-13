package org.example;

import java.util.ArrayList;

public class ClothingStore {
    public static void main(String[] args) {
        ArrayList<Clothes> listOfClothes = new ArrayList<>();
        Clothes c = new Clothes(Color.Brown,FitType.Women,Size.Medium, "Shirt" );
        listOfClothes.add(c);

        Clothes p = new Clothes(Color.Yellow, FitType.Men, Size.X_Large, "Pants");
        listOfClothes.add(p);

        Clothes p2 = new Clothes(Color.green, FitType.MenPlus, Size.Small, "Jacket");
        listOfClothes.add(p2);

        System.out.println("""
                             
                             ---------List of clothes in our Clothing Store-------
                """);
        for(Clothes c1: listOfClothes)
        {
            c1.displayClotheDescription();
            System.out.println();
        }


    }
}