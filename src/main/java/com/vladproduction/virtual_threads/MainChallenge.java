package com.vladproduction.virtual_threads;

import java.time.Duration;
import java.util.concurrent.Executors;

/**
 * challenge: to make try block with virtual threads;
 * */
public class MainChallenge {
    public static void main(String[] args) {

        long time_started = System.currentTimeMillis();

//        singleThreadExecutor(); //~15600

        virtualThreadPerTaskExecutor(); //~77

        System.out.print("Working time: ");
        System.out.println(System.currentTimeMillis() - time_started);

    }

    private static void virtualThreadPerTaskExecutor() {
        try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {

            int i = 0;

            while (i < 1000) {
                int finalI = i;
                executor.execute(() -> {
                    try {
                        System.out.println(STR."Task-Virtual: \{finalI} STARTED");
                        Thread.sleep(Duration.ofMillis(10));
                        System.out.println(STR."Task-Virtual: \{finalI} FINISHED");
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                });
                i++;
            }
        }
    }

    private static void singleThreadExecutor() {
        try (var executor = Executors.newSingleThreadExecutor()) {

            int i = 0;

            while (i < 1000) {
                int finalI = i;
                executor.execute(() -> {
                    try {
                        System.out.println(STR."Task: \{finalI} started");
                        Thread.sleep(Duration.ofMillis(10));
                        System.out.println(STR."Task: \{finalI} finished");
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                });
                i++;
            }
        }
    }
}
