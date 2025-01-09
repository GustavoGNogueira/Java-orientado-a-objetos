package Desafio.OrientacaoObjeto2;

public class ContaBancaria {
    private String nome;
    private  double saldoConta;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(double saldoConta) {
        this.saldoConta = saldoConta;
    }

    public void consultarSaldo(){
        System.out.println("O seu saldo é: R$" + saldoConta);
    }

    public void depositar (double deposito) {
        saldoConta += deposito;
        System.out.println("Dinheiro depositado: R$" + deposito);
        System.out.println("Novo saldo: R$" + saldoConta);
    }

    public void sacar (double sacado) {
        if (saldoConta >= sacado){
            saldoConta -= sacado;
            System.out.println("Dinheiro sacado: R$" + sacado);
            System.out.println("Novo saldo: R$" + saldoConta);
        }else{
            System.out.println("Erro ao fazer o saque");
        }

    }
}
