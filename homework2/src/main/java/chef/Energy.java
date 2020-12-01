package chef;

import chef.CaloriesCalculator;
import chef.dishes.Borscht;

/** This interface is used to calculate energy value for any provided ingredient in kkal */

public interface Energy {

    double getCalories(double ingredientAmount, double energyValue100g);
}
