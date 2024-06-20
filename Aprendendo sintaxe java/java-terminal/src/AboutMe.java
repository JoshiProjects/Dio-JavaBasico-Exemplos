public class AboutMe {
    public static void main(String[] args) {
        
        String nome = args[0];
        String sobrenome = args[1];
        int idade = Integer.valueOf(args[2]);
        double altura = Double.valueOf(args[3]);

        // if (args.length != 0) {
            System.out.println("Olá, me chamo "+nome+" "+ sobrenome);
            System.out.println("Tenho "+idade+ " anos de idade");
            System.out.println("Minha altura é "+altura+" m ");
        // } else {
        //     System.out.println("por favor, insira seus dados como argumentos na execução da classe");
        // }

    }
}
