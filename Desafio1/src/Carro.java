public class Carro {
    String modelo;
    int ano;
    String cor;

    void exibeFichaCarro(){
        System.out.println("Modelo do carro: " + modelo);
        System.out.println("Ano de fabricação: " + ano);
        System.out.println("Cor do carro: " + cor);
    }

    int calculaIdade(int anoAtual){
        return anoAtual - ano;
    }
}
