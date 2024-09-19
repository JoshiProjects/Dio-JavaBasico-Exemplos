package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }

    public void pesquisarContatoPorNome(String nome){
        Set<Contato> contatosPesquisado =new HashSet<>();
        for(Contato e: contatoSet){
            if(e.getNome().startsWith(nome)) {
                contatosPesquisado.add(e);
            }
        }
        System.out.println("os contatos encontrados foram \n" + contatosPesquisado.toString() );
    }
    public void exibirContatos(){
        System.out.println(contatoSet);
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for(Contato c: contatoSet){
            if (c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("Camila", 123456);
        agendaContatos.adicionarContato("Camila", 0);
        agendaContatos.adicionarContato("Camila Cavalcante", 1111111);
        agendaContatos.adicionarContato("Camila DIO", 654987);
        agendaContatos.adicionarContato("Maria Silva", 1111111);

        agendaContatos.exibirContatos();

        agendaContatos.pesquisarContatoPorNome("Camila");

        agendaContatos.atualizarNumeroContato("Maria Silva", 555555);

        agendaContatos.exibirContatos();
    }
}
