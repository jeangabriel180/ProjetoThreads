package br.com.alura;

public class AppImpressora {
    public static void main(String[] args) throws InterruptedException {
        var imp1 = new Impressora(1);
        var imp2 = new Impressora(2);

        var t1 = new Thread(imp1);
        var t2 = new Thread(imp2);

        t2.setPriority(1);
        t1.setPriority(10);


        System.out.println(t1.isAlive());
        t1.start();
//        System.out.println(t1.isAlive());
        t2.start();

//        t1.join();

        System.out.println(t1.isAlive());

    }
}
