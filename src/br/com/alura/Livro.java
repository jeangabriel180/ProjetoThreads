package br.com.alura;

public class Livro {
    private String nome;
    private Boolean reservado = false;

    public Livro(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Boolean getReservado() {
        return reservado;
    }

    public void reservarLivro(){
        this.reservado = true;
    }
}
