package chef;


import chef.dishes.Borscht;
import chef.ingredients.Apple;

public class Meals {

    public static void main(String[] args) {

        Apple apple = new Apple();

        System.out.println(apple.energyValue100g + " " + apple.color + " " + apple.isStoredInFrige + " " + apple.isSweet);


    }

}
