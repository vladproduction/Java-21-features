package com.vladproduction.sequenced_collections;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) {

        System.out.println("===ArrayList example===");

        var arrayList = new ArrayList<>(Arrays.asList("Banana", "Cherry", "Date"));
        arrayList.add(0, "Apple");
        arrayList.add(arrayList.size(),"Elderberry");


        System.out.println(arrayList); //[Apple, Banana, Cherry, Date, Elderberry]
        System.out.println(arrayList.get(0)); //first element
        System.out.println(arrayList.get(arrayList.size() - 1));//last element


        System.out.println("\n===Deque example===");

        var deque = new ArrayDeque<>(Arrays.asList("Banana", "Cherry", "Date"));
        deque.addFirst("Apple");
        deque.addLast("Elderberry");

        System.out.println(deque);
        System.out.println(deque.getFirst());
        System.out.println(deque.getLast());

        System.out.println("\n===LinkedHashSet example===");

        var linkedHashSet = new LinkedHashSet<>(Arrays.asList("Banana", "Cherry", "Date"));
        linkedHashSet.add("Elderberry"); //in this case added to the end of this LinkedHashSet

        System.out.println(linkedHashSet); //[Banana, Cherry, Date, Elderberry]
        System.out.println(linkedHashSet.iterator().next());//get first element Banana
        System.out.println(linkedHashSet.toArray()[linkedHashSet.size() - 1]); //get last element Elderberry


    }
}
