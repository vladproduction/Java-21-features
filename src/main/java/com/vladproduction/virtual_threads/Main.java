package com.vladproduction.virtual_threads;

import java.time.Duration;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        /*try (var executor = Executors.newFixedThreadPool(1)) {
            IntStream.range(0, 99999).forEach(i -> {
                executor.submit(() -> {
                    Thread.sleep(Duration.ofSeconds(1));
                    System.out.println(i);
                    return i;
                });
            });
        }*/

        //virtual threads is used:
        try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {
            IntStream.range(0, 99999).forEach(i -> {
                executor.submit(() -> {
                    Thread.sleep(Duration.ofSeconds(1));
                    System.out.println(i);
                    return i;
                });
            });
        }

    }
}
