package Desafio.OrientacaoObjeto2;

public class Gato extends Animal {

    @Override
    public void emitirSom() {
        System.out.println("Miau");
    }

    public void arranharMoveis () {
        System.out.println("O móvel está sendo arranhado");
    }
}
