package com.company;

import java.util.ArrayList;

public class Rose {
    //region Properties
    private Petal petal;
    private Bud bud;
    private ArrayList<Petal> petals;
    //endregion

    //region Methods
    public void bloom() {
        System.out.println("The petals is opening");
    }

    public void wild() {
        System.out.println("The petals is falling");
    }

    public void printQuantityOfPetals() {
        System.out.println("The quality of petals is " + petals.size());
    }
    //endregion

    //region Constructors
    public Rose() {
    }

    public Rose(Petal petal, Bud bud, ArrayList<Petal> petals) {
        this.petal = petal;
        this.bud = bud;
        this.petals = petals;
    }

    //endregion

    //region Getters Setters

    public Petal getPetal() {
        return petal;
    }

    public void setPetal(Petal petal) {
        this.petal = petal;
    }

    public Bud getBud() {
        return bud;
    }

    public void setBud(Bud bud) {
        this.bud = bud;
    }

    public ArrayList<Petal> getPetals() {
        return petals;
    }

    public void setPetals(ArrayList<Petal> petals) {
        this.petals = petals;
    }

    //endregion

    //region toString equals hashcode

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rose rose = (Rose) o;

        if (petal != null ? !petal.equals(rose.petal) : rose.petal != null) return false;
        if (bud != null ? !bud.equals(rose.bud) : rose.bud != null) return false;
        return petals != null ? petals.equals(rose.petals) : rose.petals == null;
    }

    @Override
    public int hashCode() {
        int result = petal != null ? petal.hashCode() : 0;
        result = 31 * result + (bud != null ? bud.hashCode() : 0);
        result = 31 * result + (petals != null ? petals.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Rose{" +
                "petal=" + petal +
                ", bud=" + bud +
                ", petals=" + petals +
                '}';
    }
    //endregion
}

