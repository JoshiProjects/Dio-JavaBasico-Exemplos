public class ExemploBreakContinue {
    public static void main(String[] args) {
        for(int numero = 1; numero <= 5; numero++){
            if(numero == 3)
                continue; //break interromperia todo o fluxo, já o continue, mudou o fluxo, pulou o 3

            System.out.println(numero);
        }
    }
}
