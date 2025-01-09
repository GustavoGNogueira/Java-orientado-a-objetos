package Desafio.OrientacaoObjeto2;

public class ContaCorrente extends ContaBancaria{

    public void cobrarTarifaMensal (double tarifaMensal) {
        if (tarifaMensal <= getSaldoConta()){
            setSaldoConta( getSaldoConta() - tarifaMensal);
            System.out.println("A tarifa mensal de R$" + tarifaMensal + " foi cobrada");
        }else{
            System.out.println("Saldo insulficiente para cobrar a tarifa mensal");
        }
    }
}
