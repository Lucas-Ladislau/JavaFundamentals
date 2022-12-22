package com.javaConcepts.collections.dio.map;

import java.util.*;

/**
 * Created by Lucas Anderson Ladislau Aguiar on 22/12/2022.
 */
public class OrdenacaoMap {
    public static void main(String[] args) {
        System.out.println("--\tOrdem aleatória\t--");
        Map<String, Livro> livros = new HashMap<>(){{
            put(" Hawking, Stephen", new Livro("Uma Breve História do Tempo", 256));
            put(" Duhigg, Charles", new Livro("O Poder do Hábito", 408));
            put(" Harari, Yuval Noah", new Livro("21 Lições Para o Século 21", 432));
        }};

        for (Map.Entry<String, Livro> entry: livros.entrySet()) {
            System.out.println(entry.getKey()+" - livro: "+ entry.getValue().getNome());
        }
        System.out.println("--\tOrdem Inserção\t--");
        Map<String, Livro> livros2 = new LinkedHashMap<>(){{
            put(" Hawking, Stephen", new Livro("Uma Breve História do Tempo", 256));
            put(" Duhigg, Charles", new Livro("O Poder do Hábito", 408));
            put(" Harari, Yuval Noah", new Livro("21 Lições Para o Século 21", 432));
        }};

        for (Map.Entry<String, Livro> entry: livros2.entrySet()) {
            System.out.println(entry.getKey()+" - livro: "+ entry.getValue().getNome());
        }
        System.out.println("--\tOrdem alfabética autores\t--");
        Map<String, Livro> livros3 = new TreeMap<>(livros);
        for (Map.Entry<String, Livro> entry: livros3.entrySet()) {
            System.out.println(entry.getKey()+" - livro: "+ entry.getValue().getNome());
        }
        System.out.println("--\tOrdem alfabética nomes dos livros\t--");
        Set<Map.Entry<String, Livro>> livros4 = new TreeSet<>(new NomeLivroComparator());
        livros4.addAll(livros.entrySet());
        for (Map.Entry<String, Livro> entry: livros4) {
            System.out.println(entry.getKey()+" - livro: "+ entry.getValue().getNome());
        }

        System.out.println("--\tOrdem número de página\t--");
        Set<Map.Entry<String, Livro>> livros5 = new TreeSet<>(new PaginaComparator());
        livros4.addAll(livros.entrySet());
        for (Map.Entry<String, Livro> entry: livros4) {
            System.out.println(entry.getKey()+" - livro: "+ entry.getValue().getPaginas());
        }
    }
}

class Livro {
    private String nome;
    private Integer paginas;

    public Livro(String nome, Integer paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }

    public String getNome() {
        return nome;
    }

    public Integer getPaginas() {
        return paginas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return Objects.equals(nome, livro.nome) && Objects.equals(paginas, livro.paginas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, paginas);
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", paginas=" + paginas +
                '}';
    }
}

class NomeLivroComparator implements Comparator<Map.Entry<String, Livro>>{

    @Override
    public int compare(Map.Entry<String, Livro> livro1, Map.Entry<String, Livro> livro2) {
        return livro1.getValue().getNome().compareTo(livro2.getValue().getNome());
    }
}

class PaginaComparator implements Comparator<Map.Entry<String, Livro>>{

    @Override
    public int compare(Map.Entry<String, Livro> livro1, Map.Entry<String, Livro> livro2) {
        return livro1.getValue().getPaginas().compareTo(livro2.getValue().getPaginas());
    }
}
