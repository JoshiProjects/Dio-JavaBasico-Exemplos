import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args){

    try{
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Qual é o seu nome");
        String nome = scanner.next();

        System.out.println(" Qual é o seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Quantos ano você tem?");
        int idade = scanner.nextInt();

        System.out.println("Qual é a sua altura em metros?");
        double altura = scanner.nextDouble();

        System.out.println("Você se chama "+nome+" "+ sobrenome);
        System.out.println("Tem "+idade+ " anos de idade");
        System.out.println("Sua altura é "+altura+" metros ");

        scanner.close();
    }catch(InputMismatchException e){
        System.err.println("Os campos idade e altura precisam ser numéricos");
    }
    }
}
