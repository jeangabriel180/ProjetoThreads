package br.com.alura;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TesteMultiplasThreads {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(100000);
      //  ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor();

        Instant inicio = Instant.now();

        try (ExecutorService e = executor) {
            for (int i = 1; i <= 100000; i++) {
                new ExecutaTarefa().run();
            }
        }

        Instant fim = Instant.now();

        System.out.println("Tempo gasto " + Duration.between(inicio, fim));

    }
}
