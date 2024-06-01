package br.com.alura;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ContadorLock {
    private int contagem = 0;
    private final Lock lock = new ReentrantLock();

    public void incrementar() {
        lock.lock();
        try {
            contagem++;
        } finally {
            lock.unlock();
        }
    }
}
