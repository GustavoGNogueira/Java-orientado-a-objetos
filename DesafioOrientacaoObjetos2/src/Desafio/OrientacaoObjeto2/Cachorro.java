package Desafio.OrientacaoObjeto2;

public class Cachorro extends Animal{

    @Override
    public void emitirSom() {
        System.out.println("au au");
    }

    public void abanarRabo () {
        System.out.println("O rabo está abanando");
    }
}
