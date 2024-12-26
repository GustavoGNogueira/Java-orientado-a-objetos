public class Aluno {
    String nome;
    int idade;
    double nota1;
    double nota2;
    double media;

    void exibeAluno(){
        System.out.println("Nome do aluno: " + nome);
        System.out.println("Idade do aluno: " + idade);
    }

    void exibeMedia(){
        media = (nota1 + nota2) / 2;
        if (media >= 6){
            System.out.println("Aprovado!");
            System.out.println("Média: " + media);
        }else{
            System.out.println("Reprovado!");
            System.out.println("Média: " + media);
        }
    }
}
