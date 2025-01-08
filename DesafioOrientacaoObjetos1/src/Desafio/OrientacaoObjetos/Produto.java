package Desafio.OrientacaoObjetos;

public class Produto {
    private String nome;
    private double preco;

    public String getNome () {
        return nome;
    }

    public void setNome (String nome) {
        this.nome = nome;
    }

    public double getPreco () {
        return preco;
    }

    public void setPreco (double preco) {
        this.preco = preco;
    }

    public void aplicarDesconto (double porcentagem) {
        if (porcentagem <= 0.0 || porcentagem > 1.0){
            System.out.println("Erro ao calcular o desconto");
        }else{
            System.out.println("Preço com desconto: R$" + (preco - (preco * porcentagem)));
        }
    }
}
