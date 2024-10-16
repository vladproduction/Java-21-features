package com.vladproduction.unnamed_patterns_variables;

import java.util.List;
/**
 * using '_' instead unused variable
 * */
public class Main2 {
    public static void main(String[] args) {
        List<String> items = List.of(
                "1",
                "2",
                "3"
        );

        var basketTotal = 0;

        for (String _ : items) { //using '_' instead unused variable: (String item : items) --> (String _ : items)
            basketTotal ++;
        }

        System.out.println(STR."Basket total: \{basketTotal}");

        var lastItem = items.getLast();
        try {
            int i = Integer.parseInt(lastItem);
            System.out.println(STR."Last item: \{i}");
        } catch (NumberFormatException _) { //here as well instead e --> '_'
            System.out.println(STR."Bad number: \{lastItem}");
        }
    }
}
