package br.com.alura;

public class AppBiblioteca {

    public static void main(String[] args) {
        var livro = new Livro("O Senhor dos aneis");
        var operacao = new OperacaoLivro(livro);

        Thread operacaoJoao = new Thread(operacao, "João");
        Thread operacaoMaria = new Thread(operacao, "Maria");

        operacaoMaria.start();
        operacaoJoao.start();
        try {
            operacaoMaria.join();
            operacaoJoao.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("Reservas finalizadas!");
        }
    }
}
