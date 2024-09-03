package main.java.list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;
public class ListaTarefa {

    //atributo
    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
      List<Tarefa> tarefasParaRemover = new ArrayList<>();

      for(Tarefa t : tarefaList){
          if (t.getDescricao().equalsIgnoreCase(descricao)){
              tarefasParaRemover.add(t);
          }
      }
      tarefaList.removeAll(tarefasParaRemover);

    }

    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(tarefaList.toString());
    }
    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        //verificando a quantidade
        System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        //adicionando tarefas
        listaTarefa.adicionarTarefa("Tarefa 1");
        System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());


        listaTarefa.adicionarTarefa("Tarefa 1");
        System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.adicionarTarefa("Tarefa 2");
        System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        //removendo uma tarefa
        listaTarefa.removerTarefa("Tarefa 1");
        System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        //listando tarefas
        listaTarefa.obterDescricoesTarefas();
    }
}
