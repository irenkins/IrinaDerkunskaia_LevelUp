package chef.dishes;

import chef.Energy;
import chef.ingredients.Beetroot;
import chef.ingredients.Cabbage;

public class Borscht {

    double beetrootAmount;
    double cabbageAmount;

    public Borscht(double beetrootAmount, double cabbageAmount) {
        this.beetrootAmount = beetrootAmount;
        this.cabbageAmount = cabbageAmount;
    }

    Beetroot beetroot = new Beetroot();
    Cabbage cabbage = new Cabbage();

/*
    public static void main(String[] args) {
        Borscht borscht = new Borscht(5, 10);
        borscht.print(borscht);
    }

    void print(Borscht borscht) {
        System.out.println(getBorschtEnergy(borscht));
    }
*/

    double getBorschtEnergy(Borscht borscht) {

        double beetrootEnergy = Energy.getCalories(borscht.beetrootAmount, beetroot.energyValue100g);
        double cabbageEnergy = Energy.getCalories(borscht.cabbageAmount,cabbage.energyValue100g);
        double borschtEnergy = beetrootEnergy + cabbageEnergy;
        System.out.println(borschtEnergy);
        return borschtEnergy;
    }

}
