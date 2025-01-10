package Desafio.Orientacao.Objetos3.Interfaces.Parte3;

public class TabuadaMultiplicacao implements Tabuada {

    @Override
    public void mostrarTabuada(int numero) {
        System.out.println("Tabuada do número: " + numero);
        for (int i = 0; i <= numero; i++) {
            System.out.println(i + " x " + numero + " = " + (i * numero));
            System.out.println();
        }
    }
}
