package chef.dishes;

import chef.CaloriesCalculator;
import chef.ingredients.ChickenBreast;
import chef.ingredients.Kale;

public class Salad {

    // all amounts should be set in grams
    double kaleAmount;
    double chickenBreastAmount;

    public Salad(double kaleAmount, double chickenBreastAmount) {
        this.kaleAmount = kaleAmount;
        this.chickenBreastAmount = chickenBreastAmount;
    }


    Kale kale = new Kale();
    ChickenBreast chickenBreast = new ChickenBreast();

   public double calculateSaladEnergy(Salad salad) {

        double kaleEnergy = CaloriesCalculator.getCalories(salad.kaleAmount, kale.energyValue100g);
        double chickenBreastEnergy = CaloriesCalculator.getCalories(salad.chickenBreastAmount, chickenBreast.energyValue100g);
        double saladEnergy = kaleEnergy + chickenBreastEnergy ;
        return saladEnergy;
    }
}
