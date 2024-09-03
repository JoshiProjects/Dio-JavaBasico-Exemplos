package main.java.list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    //atributo
    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }
    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();

        if (!livroList.isEmpty()){
            for (Livro l : livroList){
                if (l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAno(int anoInicial, int anoFinal){
        List<Livro> livrosPorAno = new ArrayList<>();

        if (!livroList.isEmpty()){
            for (Livro l: livroList){
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livrosPorAno.add(l);
                }
            }
        }
        return livrosPorAno;
    }

    public Livro pesqiosarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if (!livroList.isEmpty()){
            for (Livro l: livroList){
                if (l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("Livro 1", "Autor 1",2020);
        catalogoLivros.adicionarLivro("Livro 1", "Autor 2",2021);
        catalogoLivros.adicionarLivro("Livro 2", "Autor 2",2022);
        catalogoLivros.adicionarLivro("Livro 3", "Autor 3",2023);
        catalogoLivros.adicionarLivro("Livro 4", "Autor 4",1994);

        System.out.println(catalogoLivros.pesquisarPorAutor("Autor 2") + "\n");
        System.out.println(catalogoLivros.pesquisarPorIntervaloAno(2020, 2022)+"\n");
        System.out.println(catalogoLivros.pesqiosarPorTitulo("Livro 1")); // mostra o primeiro livro adicionado com esse título

    }

}
