public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada? " + smartTv.ligada );
        System.out.println("Canal atual? " + smartTv.canal );
        System.out.println("Volume atual? " + smartTv.volume);

        smartTv.ligar();
        System.out.println("novo status->" + smartTv.ligada);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();

        smartTv.aumentarVolume();
        System.out.println("novo status->" + smartTv.volume);

        smartTv.mudarCanal(20);
        
    }
}
