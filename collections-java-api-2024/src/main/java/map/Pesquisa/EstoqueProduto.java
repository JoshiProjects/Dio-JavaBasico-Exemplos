package main.java.map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProduto {
    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProduto() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome,int quantidade, double preco){
        estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade));

    }

    public void exibirProdutos(){
        System.out.println(estoqueProdutosMap);
    }

    public double calcularValorTotalEstoque(){
        double valorTotalEstoque = 0d;
        if (!estoqueProdutosMap.isEmpty()){
            for (Produto p : estoqueProdutosMap.values()){
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        }
        return valorTotalEstoque;
    }
    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!estoqueProdutosMap.isEmpty()){
            for (Produto p : estoqueProdutosMap.values()){
                if (p.getPreco() > maiorPreco){
                    produtoMaisCaro = p;
                }
            }
        }
        return produtoMaisCaro;
    }

    public static void main(String[] args) {
        EstoqueProduto estoqueProdutoMap = new EstoqueProduto();

        estoqueProdutoMap.exibirProdutos();

        estoqueProdutoMap.adicionarProduto(1L, "Produto A", 10, 5.0);
        estoqueProdutoMap.adicionarProduto(2L, "Produto B", 5, 10.0);
        estoqueProdutoMap.adicionarProduto(3L, "Produto C", 10, 15.0);

        estoqueProdutoMap.exibirProdutos();

        System.out.println("Valor total do estoque: R$" + estoqueProdutoMap.calcularValorTotalEstoque());
        System.out.println("produto mais barato: " + estoqueProdutoMap.obterProdutoMaisCaro());

    }
}
