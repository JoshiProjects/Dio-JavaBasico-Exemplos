public class MinhaClasse {
    public static void main ( String [] args){
        String primeiroNome = "Marília";
        String segundoNome = "Sara";
        String mensagem = "eu te amo";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto.concat(" ,").concat(mensagem));

    }

    public static String nomeCompleto (String primeiroNome, String segundoNome){

        return "Resultado do método: " +  primeiroNome.concat(" ").concat(segundoNome);

    }
}
