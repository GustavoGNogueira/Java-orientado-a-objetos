package Desafio.Orientacao.Objetos3.Interfaces.Parte6;

public class Servico implements Vendavel{
    private int precoServico;

    public int getPrecoServico() {
        return precoServico;
    }

    public void setPrecoServico(int precoServico) {
        this.precoServico = precoServico;
    }

    @Override
    public double precoFinal(int quantidadeDeHoras) {
        if (quantidadeDeHoras <= 10){
            return precoServico - (precoServico * 0.5);
        }else{
            return precoServico * quantidadeDeHoras;
        }
    }
}
