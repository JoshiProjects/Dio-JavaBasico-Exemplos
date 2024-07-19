public class Main {
    public static void main(String[] args) {
        System.out.println("Iniciou do programa no método main");
        a();
        System.out.println("Finalizou o programa no método main.");
    }
    static void a(){
       System.out.println("Entrou no método a.");
       b();
       System.out.println("Finalizou o método a.");
    }
    static void b(){
        System.out.println("Entrou no método b.");
        for (int c = 0; c <= 4; c++){System.out.println(c);}
        c();
        System.out.println("Finalizou o método b.");
    }
    static void c(){
        System.out.println("Entrou no método c.");
        //Thread.dumpStack;
        System.out.println("Finalizou o método c.");
    }
}
