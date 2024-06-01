package br.com.alura;

public class OperacaoLivro implements Runnable {
    private Livro livro;


    public OperacaoLivro(Livro livro) {
        this.livro = livro;
    }

    public synchronized void alugarLivro() {
        System.out.println("Iniciando reserva");
        if (livro.getReservado()) {
            System.out.println("O livro já foi reservado, " + Thread.currentThread().getName());
        } else {
            System.out.println("Reserva efetuada com sucesso! Aproveite a leitura, " + Thread.currentThread().getName());
            livro.reservarLivro();
        }
    }

    @Override
    public void run() {
        alugarLivro();
    }
}
