package chef.dishes;

import chef.CaloriesCalculator;
import chef.ingredients.*;

public class Borscht {

    // all amounts should be set in grams
    double beetrootAmount;
    double cabbageAmount;
    double carrotAmount;
    double garlicAmount;
    double onionAmount;
    double potatoAmount;
    double beefAmount;

    public Borscht(double beetrootAmount, double cabbageAmount, double carrotAmount,
                   double garlicAmount, double onionAmount, double potatoAmount,
                   double beefAmount) {
        this.beetrootAmount = beetrootAmount;
        this.cabbageAmount = cabbageAmount;
        this.carrotAmount = carrotAmount;
        this.garlicAmount = garlicAmount;
        this.onionAmount = onionAmount;
        this.potatoAmount = potatoAmount;
        this.beefAmount = beefAmount;
    }


    Beetroot beetroot = new Beetroot();
    Cabbage cabbage = new Cabbage();
    Carrot carrot = new Carrot();
    Garlic garlic = new Garlic();
    Onion onion = new Onion();
    Potato potato = new Potato();
    Beef beef = new Beef();



    public double calculateBorschtEnergy(Borscht borscht) {

        double beetrootEnergy = CaloriesCalculator.getCalories(borscht.beetrootAmount, beetroot.energyValue100g);
        double cabbageEnergy = CaloriesCalculator.getCalories(borscht.cabbageAmount, cabbage.energyValue100g);
        double carrotEnergy = CaloriesCalculator.getCalories(borscht.carrotAmount, carrot.energyValue100g);
        double garlicEnergy = CaloriesCalculator.getCalories(borscht.garlicAmount, garlic.energyValue100g);
        double onionEnergy = CaloriesCalculator.getCalories(borscht.onionAmount, onion.energyValue100g);
        double potatoEnergy = CaloriesCalculator.getCalories(borscht.potatoAmount, potato.energyValue100g);
        double beefEnergy = CaloriesCalculator.getCalories(borscht.beefAmount, beef.energyValue100g);
        double borschtEnergy = beetrootEnergy + cabbageEnergy + carrotEnergy +
                garlicEnergy + onionEnergy + potatoEnergy + beefEnergy + beefEnergy;
        return borschtEnergy;
    }

}
