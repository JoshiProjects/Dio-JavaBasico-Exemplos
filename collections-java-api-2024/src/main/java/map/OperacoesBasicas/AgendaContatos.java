package main.java.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatosMap;

    public AgendaContatos() {
        this.agendaContatosMap = new HashMap<>();
    }

    public void adicionarContato(String nome, int telefone){
        agendaContatosMap.put(nome, telefone);
    }

    public void removerContato(String nome){
        if (!agendaContatosMap.isEmpty()){
            agendaContatosMap.remove(nome);
        }
    }
    public void exibirContatos(){
        System.out.println(agendaContatosMap);
    }
    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if (!agendaContatosMap.isEmpty()){
            numeroPorNome = agendaContatosMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("Camila", 123456);
        agendaContatos.adicionarContato("Camila", 0);
        agendaContatos.adicionarContato("Camila Cavalcante", 1111111);
        agendaContatos.adicionarContato("Camila DIO", 654987);
        agendaContatos.adicionarContato("Maria Silva", 1111111);
        agendaContatos.adicionarContato("Camila", 4444);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Maria Silva");

        agendaContatos.exibirContatos();

    }
}
