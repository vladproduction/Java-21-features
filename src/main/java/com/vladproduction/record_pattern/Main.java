package com.vladproduction.record_pattern;

public class Main {
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

    private static void printDetails(Item item) {
        if(item instanceof FoodItem){
            FoodItem item1 = (FoodItem)item;
            var name = item1.name();
            var price = item1.price();
            System.out.println("Food Item: " + name + " and price is $" + price);
        } else if (item instanceof DrinkItem) {
            DrinkItem item1 = (DrinkItem)item;
            var name = item1.name();
            var price = item1.price();
            System.out.println("Drink Item: " + name + " and price is $" + price);

        }
    }
}
