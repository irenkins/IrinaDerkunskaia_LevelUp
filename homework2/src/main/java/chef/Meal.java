package chef;


import chef.dishes.Borscht;
import chef.dishes.Salad;

public class Meal {

    double mealEnergy;

    public static void main(String[] args) {
        Meal meal = new Meal();
        System.out.println(meal.calculateMealEnergy());
    }

    double calculateMealEnergy() {
        Borscht borscht = new Borscht(300, 400, 100,
                30, 50, 300, 150);
        Salad salad = new Salad(200, 100);
        mealEnergy = borscht.calculateBorschtEnergy(borscht) + salad.calculateSaladEnergy(salad);
        return mealEnergy;
    }

}
