package Desafio.Orientacao.Objetos3.Interfaces.Parte6;

public class Produto implements Vendavel {
    private int precoProduto;

    public int getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(int precoProduto) {
        this.precoProduto = precoProduto;
    }

    @Override
    public double precoFinal(int quantidadeDeProdutos) {
        if (quantidadeDeProdutos >= 5) {
            return precoProduto - (precoProduto * 0.5);
        } else {
            return precoProduto * quantidadeDeProdutos;
        }
    }

}
