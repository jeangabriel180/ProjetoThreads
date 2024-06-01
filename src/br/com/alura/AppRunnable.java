package br.com.alura;

public class AppRunnable {
    public static void main(String[] args) {

        Runnable c = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) System.out.println("programa 1 valor " + i);
            }
        };

        Runnable r = () -> {
            for (int i = 0; i < 10000; i++) {
                System.out.println("programa 1 valor " + i);
            }
        };

        Thread t = new Thread(r);
        t.start();

    }


}
