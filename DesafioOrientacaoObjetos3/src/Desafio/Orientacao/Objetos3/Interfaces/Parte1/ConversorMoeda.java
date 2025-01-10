package Desafio.Orientacao.Objetos3.Interfaces.Parte1;

public class ConversorMoeda implements ConversaoFinanceira {

    @Override
    public void converterDolarParaReal(double dolar) {
        System.out.println("O valor $" + dolar + " é R$" + (dolar * 5) + " em reais");
    }
}
