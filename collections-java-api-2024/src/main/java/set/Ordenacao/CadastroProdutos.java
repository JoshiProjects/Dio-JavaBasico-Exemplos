package main.java.set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProdutos(long cod, String nome, double preco, int quantidade){
        produtoSet.add(new Produto(cod, nome, preco, quantidade));
    }

    public Set<Produto> exibirPorNome() {
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;

    }
    public Set<Produto> exibirPoPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;

    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProdutos(1L, "Produto 5", 15D, 5);
        cadastroProdutos.adicionarProdutos(2L, "Produto 0", 20D, 10);
        cadastroProdutos.adicionarProdutos(1L, "Produto 3", 10D, 2);
        cadastroProdutos.adicionarProdutos(9L, "Produto 9", 2D, 5);

        System.out.println(cadastroProdutos.produtoSet);
        System.out.println("Abaixo o set organizado por Nomes");
        System.out.println(cadastroProdutos.exibirPorNome());
        System.out.println("Abaixo o set organizado por preco");
        System.out.println(cadastroProdutos.exibirPoPreco());
    }


}
