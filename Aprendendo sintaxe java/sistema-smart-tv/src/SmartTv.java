public class SmartTv {
    
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
        System.out.println("vc mudou para o canal " + canal);
    }

    public void avancarCanal(){
        canal++;
        System.out.println("o canal atual é o " + canal);
    }

    public void voltarCanal(){
        canal--;
        System.out.println("o canal atual é o " + canal);
    }

    public void desligar(){
        ligada = false;
        System.out.println("Sua smartTv foi desligada");
    }

    public void ligar(){
        ligada = true;
        System.out.println("Sua smartTv foi ligada");
        
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("O volume foi aumentado para "+ volume);
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("O volume foi diminuido para "+ volume);
    }
}
