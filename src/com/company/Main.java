package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Rose rose = new Rose();
        ArrayList<Petal> petals = new ArrayList<>();
        Petal petal1 = new Petal();
        Petal petal2 = new Petal();
        Petal petal3 = new Petal();
        petals.add(petal1);
        petals.add(petal2);
        petals.add(petal3);
        rose.setPetals(petals);
        rose.printQuantityOfPetals();
        rose.bloom();
        rose.wild();
    }
}
