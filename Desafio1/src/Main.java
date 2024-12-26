public class Main {
    public static void main(String[] args) {
        System.out.println("Parte 1");
        Pessoa p1 = new Pessoa();
        p1.nome = "Gustavo";
        p1.exibeMensagem();
        System.out.println("==================");

        System.out.println();

        System.out.println("Parte 2");
        Calculadora c1 = new Calculadora();
        System.out.println("Dobro do número: " + c1.retornaDobro(2));
        System.out.println("===================");

        System.out.println();

        System.out.println("Parte 3");
        Musica m1 = new Musica();
        m1.titulo = "Céu Azul";
        m1.artista = "Charlie Brown JR";
        m1.anoLancamento = 2012;
        m1.exibeFichaTecnica();
        System.out.println("==========");
        m1.avaliaMusica(10);
        m1.avaliaMusica(9);
        System.out.println("Média de avalição: " + m1.mediaAvaliacao());
        System.out.println("====================");

        System.out.println();

        System.out.println("Parte 4");
        Carro ca1 = new Carro();
        ca1.modelo = "Volkswagen Nivus";
        ca1.ano = 2022;
        ca1.cor = "Preto";
        ca1.exibeFichaCarro();
        System.out.println("==========");
        System.out.println("Idade do carro: " + ca1.calculaIdade(2024));
        System.out.println("======================");

        System.out.println();

        System.out.println("Parte 5");
        Aluno a1 = new Aluno();
        a1.nome = "Gustavo Gomes Nogueira";
        a1.idade = 18;
        a1.exibeAluno();
        System.out.println("==========");
        a1.nota1 = 10;
        a1.nota2 = 9;
        a1.exibeMedia();
    }
}