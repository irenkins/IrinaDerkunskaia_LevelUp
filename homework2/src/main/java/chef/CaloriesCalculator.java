package chef;

public abstract class CaloriesCalculator implements Energy {


    @Override
    public double getCalories(double ingredientAmount, double energyValue100g) {
        double calories;
        calories = ingredientAmount * energyValue100g/100;
        return calories;
    }
}
