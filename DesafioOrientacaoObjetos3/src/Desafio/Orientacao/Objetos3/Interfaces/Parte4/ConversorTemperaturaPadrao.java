package Desafio.Orientacao.Objetos3.Interfaces.Parte4;

public class ConversorTemperaturaPadrao implements ConversorTemperatura{

    @Override
    public void celsiusParaFahrenheit(double celsius) {
        System.out.println("Conversão de celsius para fahrenheit");
        System.out.println("A temperatura " + celsius + " em celsius é: " + ((celsius * 1.8)+32) + " em fahrenheit");
    }

    @Override
    public void fahrenheitParaCelsius(double fahrenheit) {
        System.out.println("Conversão de fahrenheit para celcius");
        System.out.println("A temperatura " + fahrenheit + " em fahrenheit é: " + ((fahrenheit - 32)/1.8) + " em celsius");
    }
}
