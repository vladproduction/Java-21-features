package com.vladproduction.sequenced_collections;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class Main21 {
    public static void main(String[] args) {

        System.out.println("===ArrayList example===");
        var arrayList = new ArrayList<>(Arrays.asList("Banana", "Cherry", "Date"));
//        arrayList.add(0, "Apple");
        arrayList.addFirst("Apple");
//        arrayList.add(arrayList.size(),"Elderberry");
        arrayList.addLast("Elderberry");

        System.out.println(arrayList); //[Apple, Banana, Cherry, Date, Elderberry]
//        System.out.println(arrayList.get(0));
        System.out.println(arrayList.getFirst()); //Apple
//        System.out.println(arrayList.get(arrayList.size() - 1));
        System.out.println(arrayList.getLast()); //Elderberry

        System.out.println("\n===Deque example===");
        //available to add first and last, and also to get first and last
        var deque = new ArrayDeque<>(Arrays.asList("Banana", "Cherry", "Date"));
        deque.addFirst("Apple");
        deque.addLast("Elderberry");

        System.out.println(deque);
        System.out.println(deque.getFirst());
        System.out.println(deque.getLast());

        System.out.println("\n===LinkedHashSet example===");
        var linkedHashSet = new LinkedHashSet<>(Arrays.asList("Banana", "Cherry", "Date"));
//        linkedHashSet.add("Elderberry"); //in this case added to the end of this LinkedHashSet
        linkedHashSet.addLast("Elderberry"); //in this case added to the end of this LinkedHashSet

        System.out.println(linkedHashSet); //[Banana, Cherry, Date, Elderberry]
//        System.out.println(linkedHashSet.iterator().next());//Banana
        System.out.println(linkedHashSet.getFirst());//Banana
//        System.out.println(linkedHashSet.toArray()[linkedHashSet.size() - 1]); //Elderberry
        System.out.println(linkedHashSet.getLast()); //Elderberry

        //and it possible to addFirst:
        linkedHashSet.addFirst("Apple");
        System.out.println(linkedHashSet); //[Apple, Banana, Cherry, Date, Elderberry]

    }
}
