public class Filme {
    String nomeDoFilme;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double somaDasAvaliacoes;
    int totalDeAvaliacoes;
    int duracaoEmMinutos;

        void exibeFichaTecnica(){
            System.out.println("Nome do filme: " + nomeDoFilme);
            System.out.println("Ano de lançamento: " + anoDeLancamento);
            System.out.println("Duração em minutos: " + duracaoEmMinutos);
            System.out.println("Incluido no plano: " + incluidoNoPlano);
        }

        void avalia(double nota){
            somaDasAvaliacoes += nota;
            totalDeAvaliacoes++;
        }

        double retornaMedia(){
            return somaDasAvaliacoes / totalDeAvaliacoes;
        }
}
