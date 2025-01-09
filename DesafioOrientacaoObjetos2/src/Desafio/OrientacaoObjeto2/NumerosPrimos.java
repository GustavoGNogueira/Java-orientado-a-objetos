package Desafio.OrientacaoObjeto2;

public class NumerosPrimos {
    
    public boolean verificarPrimalidade(int numeroPrimo) {
        if (numeroPrimo <= 1){
            System.out.println("O número " + numeroPrimo + " não é primo");
            return false;
        }

        for (int i = 2; i <= Math.sqrt(numeroPrimo); i++) {
            if (numeroPrimo % i == 0){
                System.out.println("O número " + numeroPrimo + " não é primo");
                return false;
            }
        }

        System.out.println("O número " + numeroPrimo + " é primo");
        return true;
    }

    public void listarPrimos (int numeroPrimo) {
        for (int i = 2; i <= numeroPrimo ; i++) {
            verificarPrimalidade(i);
        }
    }
}
