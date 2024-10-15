package com.vladproduction.sequenced_collections;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ShoppingListTest {

    ShoppingList shoppingList;
    @BeforeEach
    void setUp() {
        shoppingList = new ShoppingList();
    }

    @Test
    public void getFirstItemTest() {
        assertEquals("Bread", shoppingList.getFirstItem());
    }

    @Test
    public void getLastItemTest() {
        assertEquals("Butter", shoppingList.getLastItem());
    }

    @Test
    public void getAllItemsTest() {
        assertEquals(List.of("Bread", "Milk", "Eggs", "Butter"), shoppingList.getAllItems());
    }

    @Test
    public void getItemByIndexTest() {
        assertEquals("Eggs", shoppingList.getItemByIndex(2));
    }
}