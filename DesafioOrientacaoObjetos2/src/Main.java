import Desafio.OrientacaoObjeto2.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Desafio de orientação a objetos 2");
        System.out.println("=========================");
        System.out.println("Parte 1: ");
        ModeloCarro mc = new ModeloCarro();
        mc.definirModelo("Nivus");
        mc.definirPrecos(30000, 32000, 35000);
        mc.exibirInfo();
        System.out.println("=========================");

        System.out.println();


        System.out.println("=========================");
        System.out.println("Parte 2: ");
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();
        cachorro.emitirSom();
        cachorro.abanarRabo();
        System.out.println("======");
        gato.emitirSom();
        gato.arranharMoveis();
        System.out.println("=========================");

        System.out.println();

        System.out.println("=========================");
        System.out.println("Parte 3: ");
        ContaCorrente cc1 = new ContaCorrente();
        cc1.setNome("Gustavo Gomes Nogueira");
        cc1.setSaldoConta(10000);
        System.out.println("Nome: " + cc1.getNome());
        cc1.consultarSaldo();
        System.out.println("=====");
        cc1.sacar(200);
        System.out.println("=====");
        cc1.depositar(1000);
        System.out.println("=====");
        cc1.cobrarTarifaMensal(100);
        cc1.consultarSaldo();
        System.out.println("========================");

        System.out.println();

        System.out.println("========================");
        System.out.println("Parte 4: ");
        NumerosPrimos np = new NumerosPrimos();
        VerificadorPrimo vp = new VerificadorPrimo();
        GeradorPrimo gp = new GeradorPrimo();
        np.listarPrimos(10);
        System.out.println("====");
        vp.verificarSeEhPrimo(10);
        System.out.println("====");
        gp.gerarProximoPrimo(10);




        
    }
}