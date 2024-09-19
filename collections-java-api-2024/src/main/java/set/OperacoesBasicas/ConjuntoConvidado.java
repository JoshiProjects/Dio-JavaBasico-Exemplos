package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidado {
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidado() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }
    public void removerCandidato(int codigoConvite){
        Convidado convidadoParaRemover = null;
        for(Convidado c : convidadoSet){
            if (c.getCodigoConvite() == codigoConvite){
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }
    public int contarConvidados(){
        return convidadoSet.size();
    }

    public void exibirConvidado(){
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidado conjuntoConvidado = new ConjuntoConvidado();

        System.out.println(conjuntoConvidado.contarConvidados());

        conjuntoConvidado.adicionarConvidado("Convidado 1", 1);
        conjuntoConvidado.adicionarConvidado("Convidado 2", 2);
        conjuntoConvidado.adicionarConvidado("Convidado 3", 2);
        conjuntoConvidado.adicionarConvidado("Convidado 4", 4);
        conjuntoConvidado.adicionarConvidado("Convidado 5", 5);

        System.out.println(conjuntoConvidado.contarConvidados());

        conjuntoConvidado.exibirConvidado();

        conjuntoConvidado.removerCandidato(4);
        System.out.println(conjuntoConvidado.contarConvidados());

        conjuntoConvidado.exibirConvidado();





    }
}
