import Desafio.Orientacao.Objetos3.Interfaces.Parte1.ConversorMoeda;
import Desafio.Orientacao.Objetos3.Interfaces.Parte2.CalculadoraSalaRetangular;
import Desafio.Orientacao.Objetos3.Interfaces.Parte3.TabuadaMultiplicacao;
import Desafio.Orientacao.Objetos3.Interfaces.Parte4.ConversorTemperaturaPadrao;
import Desafio.Orientacao.Objetos3.Interfaces.Parte5.Livro;
import Desafio.Orientacao.Objetos3.Interfaces.Parte5.ProdutoFisico;
import Desafio.Orientacao.Objetos3.Interfaces.Parte6.Produto;
import Desafio.Orientacao.Objetos3.Interfaces.Parte6.Servico;

public class Main {
    public static void main(String[] args) {
        System.out.println("Desafio de orientação a objetos 3");

        System.out.println();

        System.out.println("======================");
        System.out.println("Parte 1: ");
        ConversorMoeda cm = new ConversorMoeda();
        cm.converterDolarParaReal(100);
        System.out.println("======================");

        System.out.println();

        System.out.println("======================");
        System.out.println("Parte 2: ");
        CalculadoraSalaRetangular csr = new CalculadoraSalaRetangular();
        csr.calcularArea(10,10);
        csr.calcularPerimetro(10,10);
        System.out.println("======================");

        System.out.println();

        System.out.println("======================");
        System.out.println("Parte 3: ");
        TabuadaMultiplicacao tm = new TabuadaMultiplicacao();
        tm.mostrarTabuada(10);
        System.out.println("======================");

        System.out.println();

        System.out.println("======================");
        System.out.println("Parte 4: ");
        ConversorTemperaturaPadrao ctp = new ConversorTemperaturaPadrao();
        ctp.celsiusParaFahrenheit(32);
        ctp.fahrenheitParaCelsius(32);
        System.out.println("======================");

        System.out.println();

        System.out.println("======================");
        System.out.println("Parte 5: ");
        Livro l = new Livro();
        ProdutoFisico pf = new ProdutoFisico();
        l.setTitulo("Diário de um banana");
        l.setAutor("Gustavo Gomes Nogueira");
        l.setPreco(15);
        l.exibeDetalhes();
        System.out.println("Preço final: R$" + l.calcularPrecoFinal());
        System.out.println("====");
        pf.setTitulo("Diario de um banana");
        pf.setAutor("Gustavo Gomes Nogueira");
        pf.setPreco(20);
        pf.exibeDetalhes();
        System.out.println("Preço final: R$" + pf.calcularPrecoFinal());
        System.out.println("=======================");

        System.out.println();

        System.out.println("=======================");
        System.out.println("Parte 6: ");
        Produto p = new Produto();
        Servico s = new Servico();
        p.setPrecoProduto(10);
        System.out.println("Preço do produto: R$" + p.getPrecoProduto());
        System.out.println("Preço Final: R$" + p.precoFinal(10));
        System.out.println("====");
        s.setPrecoServico(100);
        System.out.println("Preço do serviço: R$" + s.getPrecoServico());
        System.out.println("Preço final: R$" + s.precoFinal(15));
        System.out.println("=======================");

    }
}