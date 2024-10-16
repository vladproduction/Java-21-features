package com.vladproduction.unnamed_patterns_variables;

/**
 * using '_' instead unused variable
 * */
public class Main {
    public static void main(String[] args) {
        var house = new HouseB("Downing str., 45", 3, true);
        printNumberOfLevels(house);
    }

    //old version:
    /*private static void printNumberOfLevels(Building building) {
        if(building instanceof HouseB houseB){
            System.out.println("Number of levels: " + houseB.levels());
        }
    }*/

    //java 21 feature (unnamed variable pattern):
    /*private static void printNumberOfLevels(Building building) {
        if(building instanceof HouseB(var address, var levels, var hasBasement)){
            System.out.println(STR."Number of levels: \{levels}");
        }
    }*/

    //java 21 feature (unused variables could replace with '_'):
    private static void printNumberOfLevels(Building building) {
        if(building instanceof HouseB(_, var levels, _)){
            System.out.println(STR."Number of levels: \{levels}");
        }
    }
}
