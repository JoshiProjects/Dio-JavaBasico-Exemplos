import java.util.Scanner;

public class CalculadoraMedias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] alunos = {"Marília", "José", "bob", "marley"};

        double media = calcularMediasTurma(alunos, scanner);

        System.out.printf("Média da turma %.1f",media); // %d é pra números inteiros, %f é para double. a expressão "%.1f" trata o número, dizendo quantas casas depois da vírgula teremos.
    }

    public static double calcularMediasTurma(String[] alunos, Scanner scanner){
        double soma = 0;
        for(String aluno: alunos){
            System.out.printf("Nota do Aluno %s: ", aluno);
            double nota = scanner.nextInt();
            soma += nota;
        }
        return soma / alunos.length;
    }
}
