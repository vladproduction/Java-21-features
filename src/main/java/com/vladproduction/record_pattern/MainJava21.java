package com.vladproduction.record_pattern;

public class MainJava21 {
    public static void main(String[] args) {
        var product1 = new FoodItem("Bread", 2);
        var product2 = new FoodItem("Milk", 4);
        var product3 = new DrinkItem("Water", 1);
        var product4 = new DrinkItem("Juice", 3);

        printDetails(product1);
        printDetails(product2);
        printDetails(product3);
        printDetails(product4);
    }

    //record feature and string template is used here
    private static void printDetails(Item item) {
        if(item instanceof FoodItem(var name, var price)){
            System.out.println(STR."Food Item: \{name} and price is $\{price}");
        } else if (item instanceof DrinkItem(var name, var price)) {
            System.out.println(STR."Drink Item: \{name} and price is $\{price}");
        }
    }
}
