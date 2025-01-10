package Desafio.Orientacao.Objetos3.Interfaces.Parte5;

public class ProdutoFisico extends Livro implements Calculavel{

    @Override
    public double calcularPrecoFinal() {
        return getPreco() * 1.5;
    }
}
