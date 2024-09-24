package main.java.map.Ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    private Map<LocalDate,Evento> agendaEventosMap;

    public AgendaEventos() {
        this.agendaEventosMap = new HashMap();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        agendaEventosMap.put(data,new Evento(nome, atracao));
    }

    public void exibirEventos(){
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(agendaEventosMap);
        System.out.println(eventosTreeMap);

    }

    public void obterProximoEvento(){
        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;

        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(agendaEventosMap);

        for (Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()){
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O proximo evento: " + proximoEvento + "acontecerá na data" + proximaData);
                break;
            }
        }
    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEvento(LocalDate.of(2023, Month.APRIL, 30), "Evento 1", "Atração 1");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 9, 28), "Evento 1", "Atração 1");
        agendaEventos.adicionarEvento(LocalDate.of(2005, Month.DECEMBER, 25), "Evento 1", "Atração 1");

        agendaEventos.exibirEventos();

        agendaEventos.obterProximoEvento();
    }
}
