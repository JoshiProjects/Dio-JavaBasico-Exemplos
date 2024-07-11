import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.0;
        while (mesada > 0) {
            double valorDoce = valorAleatorio();
            if (valorDoce > mesada) {
                valorDoce = mesada;
            }
            mesada = mesada - valorDoce;
            System.out.println("Um Doce foi adicionado ao carrinho, valor do doce: " +valorDoce);
        }

        System.out.println("O que restou da sua mesada foi: R$"+mesada);
    }

    public static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}
