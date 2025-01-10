package Desafio.Orientacao.Objetos3.Interfaces.Parte5;

public class Livro implements Calculavel{
    private String Titulo;
    private String autor;
    private double preco;

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void exibeDetalhes(){
        System.out.println("Nome do livro: " + getTitulo());
        System.out.println("Autor do livro: " + getAutor());
        System.out.println("Preço do livro: R$" + getPreco());
    }

    @Override
    public double calcularPrecoFinal() {
        return preco * 0.5;
    }
}
