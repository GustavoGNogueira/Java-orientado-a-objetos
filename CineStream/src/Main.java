public class Main {
    public static void main(String[] args) {
        Filme f1 = new Filme();
        f1.nomeDoFilme = "Velozes e Furiosos";
        f1.anoDeLancamento = 2000;
        f1.duracaoEmMinutos = 180;
        f1.incluidoNoPlano = true;

        System.out.println("Bem-Vindo ao CineStream");
        System.out.println("=======================");
        f1.exibeFichaTecnica();
        System.out.println("=======================");
        f1.avalia(9);
        f1.avalia(10);
        System.out.println("Soma das avaliações: " + f1.somaDasAvaliacoes);
        System.out.println("Total de avaliações: " + f1.totalDeAvaliacoes);
        System.out.println("Media das avaliações: " + f1.retornaMedia());
        System.out.println("========================");
    }
}