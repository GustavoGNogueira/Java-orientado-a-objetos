import Desafio.OrientacaoObjetos.ContaBancaria;
import Desafio.OrientacaoObjetos.IdadePessoa;
import Desafio.OrientacaoObjetos.Produto;
import Desafio.OrientacaoObjetos.Aluno;
import Desafio.OrientacaoObjetos.Livro;
public class Main {
    public static void main(String[] args) {
       System.out.println("Desafio de Orientação a objetos");
        System.out.println("=========================");
        System.out.println("Parte 1: ");
        ContaBancaria c1 = new ContaBancaria();
        c1.setNumeroConta(123);
        c1.setSaldo(5000);
        c1.titular = "Gustavo";
        System.out.println("Nome do titular: " + c1.titular);
        System.out.println("Número da conta: " + c1.getNumeroConta());
        System.out.println("Saldo: R$" + c1.getSaldo());
        System.out.println("=========================");

        System.out.println();

        System.out.println("=========================");
        System.out.println("Parte 2: ");
        IdadePessoa p1 = new IdadePessoa();
        p1.setNome("Gustavo");
        p1.setIdade(18);
        System.out.println("Nome: " + p1.getNome());
        System.out.println("Idade: " + p1.getIdade());
        p1.verificarIdade();
        System.out.println("=========================");

        System.out.println();

        System.out.println("=========================");
        System.out.println("Parte 3: ");
        Produto pd1 = new Produto();
        pd1.setNome("Celular");
        pd1.setPreco(5000);
        System.out.println("Nome do produto: " + pd1.getNome());
        System.out.println("Preço: R$" + pd1.getPreco());
        pd1.aplicarDesconto(0.5);
        System.out.println("=========================");

        System.out.println();

        System.out.println("=========================");
        System.out.println("Parte 4: ");
        Aluno a1 = new Aluno();
        a1.setNome("Gustavo");
        a1.setNota1(10);
        a1.setNota2(9);
        System.out.println("Nome do aluno: " + a1.getNome());
        System.out.println("Nota 1: " + a1.getNota1());
        System.out.println("Nota 2: " + a1.getNota2());
        System.out.println("Média das notas: " + a1.calcularMedia());
        System.out.println("=========================");

        System.out.println();

        System.out.println("=========================");
        System.out.println("Parte 5: ");
        Livro l1 = new Livro();
        l1.setTitulo("Diário de um banana");
        l1.setAutor("Gustavo");
        l1.setAnoLancamento(2006);
        l1.exibirDetalhes();
        System.out.println("=========================");
    }
}