public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("2376506");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            // TODO: handle exception
            System.out.println("O cep não corresponde com as regras de negocio");
        }
    }
        static String formatarCep(String cep) throws CepInvalidoException {
            if(cep.length() != 8){
                throw new CepInvalidoException();
            }

                return "23.765-064";
}}
