package Desafio.Orientacao.Objetos3.Interfaces.Parte2;

public class CalculadoraSalaRetangular implements CalculoGeometrico{

    @Override
    public void calcularArea(double base, double altura) {
        System.out.println("A area do retângulo de base " + base + " e " + altura + " é: " + (base * altura));
    }

    @Override
    public void calcularPerimetro(double base, double altura) {
        System.out.println("O perimetro do retângulo de base " + base + " e " + altura + " é: " + (2 * (base + altura)));
    }
}
