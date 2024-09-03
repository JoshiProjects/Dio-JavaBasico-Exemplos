package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, double altura, int idade){
        pessoaList.add(new Pessoa(nome,altura,idade));
    }

    public List<Pessoa> ordenacaoPorIdade(){
        List<Pessoa> pessoaPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoaPorIdade);

        return pessoaPorIdade;
    }

    public List<Pessoa> ordenacaoPorAltura(){
        List<Pessoa> pessoaPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoaPorAltura, new ComparatorPorAltura());

        return pessoaPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();

        ordenacaoPessoa.adicionarPessoa("nome 1", 1.56, 20);
        ordenacaoPessoa.adicionarPessoa("nome 2", 1.80, 30);
        ordenacaoPessoa.adicionarPessoa("nome 3", 1.70, 25);
        ordenacaoPessoa.adicionarPessoa("nome 4", 1.56, 17);

        System.out.println(ordenacaoPessoa.ordenacaoPorIdade());
        System.out.println(ordenacaoPessoa.ordenacaoPorAltura());
    }
}
