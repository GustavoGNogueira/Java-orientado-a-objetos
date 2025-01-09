package Desafio.OrientacaoObjeto2;

public class GeradorPrimo extends NumerosPrimos{

    public void gerarProximoPrimo (int numeroPrimo) {
        int proximo = numeroPrimo + 1;

        while (!super.verificarPrimalidade(proximo)){
            proximo++;
        }

        System.out.println("O número primo após o " + numeroPrimo + " é o número " + proximo);
    }
}
