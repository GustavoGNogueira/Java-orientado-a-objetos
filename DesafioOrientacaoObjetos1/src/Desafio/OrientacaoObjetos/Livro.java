package Desafio.OrientacaoObjetos;

public class Livro {
    private String titulo;
    private String autor;
    private int anoLancamento;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public void exibirDetalhes () {
        System.out.println("Nome do livro: " + getTitulo());
        System.out.println("Nome do autor: " + getAutor());
        System.out.println("Ano de lançamento: " + getAnoLancamento());
    }
}
