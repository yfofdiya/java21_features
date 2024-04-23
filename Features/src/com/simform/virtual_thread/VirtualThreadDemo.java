package com.simform.virtual_thread;

import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class VirtualThreadDemo {

    void main() {
        createVirtualThread();
    }

    public void createVirtualThread() {
        long startTime = System.currentTimeMillis();

        try(var executor = Executors.newVirtualThreadPerTaskExecutor()) {
            IntStream.range(0,100000).forEach(i -> {
                executor.submit(() -> {
                    Thread.sleep(1000);
                    return i;
                });
            });
        } catch (Exception _) {
            System.out.println("Something went wrong");
        }

        long endTime = System.currentTimeMillis();

        long totalTime = (endTime - startTime) / 1000;

        System.out.println(STR."Total time taken to create virtual threads : \{totalTime}");
    }
}
