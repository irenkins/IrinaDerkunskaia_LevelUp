package chef;

/**
 * This interface is used to calculate energy value for any provided ingredient in kkal
 */

public interface CaloriesCalculator {

    static double getCalories(double ingredientAmount, double energyValue100g) {
        double calories;
        calories = ingredientAmount * energyValue100g / 100;
        return calories;
    }
}
