package com.vladproduction.sequenced_collections;

import java.util.ArrayList;
import java.util.List;

public class ShoppingList {

    private final List<String> list = new ArrayList<>(List.of("Bread", "Milk", "Eggs", "Butter"));

    public String getFirstItem(){
        if (!list.isEmpty()) {
            return list.getFirst();
        }
        return null;
    }

    public String getLastItem() {
        if (!list.isEmpty()) {
            return list.getLast();
        }
        return null;
    }

    public List<String> getAllItems(){
        return new ArrayList<>(list);
    }

    public String getItemByIndex(int index) {
        if (index < 0 || index >= list.size()) {
            throw new IndexOutOfBoundsException(STR."Index: \{index}, Size: \{list.size()}");
        }
        return list.get(index);
    }
}
