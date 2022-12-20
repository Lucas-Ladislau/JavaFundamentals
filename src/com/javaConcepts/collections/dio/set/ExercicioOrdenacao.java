package com.javaConcepts.collections.dio.set;

import java.util.*;

/**
 * Created by Lucas Anderson Ladislau Aguiar on 20/12/2022.
 */
/*
Crie uma classe LinguagemFavorita que possua os atributos nome, anoDeCriacao e IDE.
Em seguida, crie um conjunto com 3 linguagens e faça um programa que ordene esse conjunto por:
a) Ordem de inserção;
b) Ordem natural(nome);
c) IDE;
d) Ano de criação e nome;
e) Nome, ano de criação e IDE;
Ao final, exiba as linguagens no console, um abaixo da outra.
*/
public class ExercicioOrdenacao {
    public static void main(String[] args) {
        Set<Linguagem> linguagens = new LinkedHashSet<>(){{
            add(new Linguagem("Python", 1992, "Pycharm"));
            add(new Linguagem("Lua", 1995, "MetaLua"));
            add(new Linguagem("Java", 1991, "InteliJ"));
        }};
        System.out.println("Ordem inserção");
        System.out.println(linguagens);

        System.out.println("\nOrdem nome");
        Set<Linguagem> linguagensProg = new TreeSet<>(new CompartaratorNome()){{
            addAll(linguagens);
        }};
        System.out.println(linguagensProg);

        System.out.println("\nOrdem IDE");
        Set<Linguagem> linguagensProgIDE = new TreeSet<>(new CompartaratorIDE()){{
            addAll(linguagens);
        }};
        System.out.println(linguagensProgIDE);

        System.out.println("\nOrdem Ano e nome");
        Set<Linguagem> linguagensProgAnoNome = new TreeSet<>(new CompartaratorAnoNome()){{
            addAll(linguagens);
        }};
        System.out.println(linguagensProgAnoNome);

        System.out.println("\nOrdem nome, ano e ide");
        Set<Linguagem> linguagensProgNomeAnoIDE = new TreeSet<>(new CompartaratorNomeAnoIDE()){{
            addAll(linguagens);
        }};
        System.out.println(linguagensProgNomeAnoIDE);

    }
}

class Linguagem {
    private String nome;
    private Integer anoDeCriacao;
    private String IDE;

    public Linguagem(String nome, Integer anoDeCriacao, String IDE) {
        this.nome = nome;
        this.anoDeCriacao = anoDeCriacao;
        this.IDE = IDE;
    }

    public String getNome() {
        return nome;
    }

    public Integer getAnoDeCriacao() {
        return anoDeCriacao;
    }

    public String getIDE() {
        return IDE;
    }

    @Override
    public String toString() {
        return  "{"+nome + '\'' + " - " + anoDeCriacao +
                " - " + IDE + '\'' + '}';
    }
}

class CompartaratorNome implements Comparator<Linguagem>{
    @Override
    public int compare(Linguagem o1, Linguagem o2) {
        return o1.getNome().compareTo(o2.getNome());
    }
}
class CompartaratorIDE implements Comparator<Linguagem>{
    @Override
    public int compare(Linguagem o1, Linguagem o2) {
        return o1.getIDE().compareTo(o2.getIDE());
    }
}
class CompartaratorAnoNome implements Comparator<Linguagem>{
    @Override
    public int compare(Linguagem o1, Linguagem o2) {
        int ano = o1.getAnoDeCriacao().compareTo(o2.getAnoDeCriacao());
        if(ano != 0) return ano;
        return o1.getNome().compareTo(o2.getNome());
    }
}
class CompartaratorNomeAnoIDE implements Comparator<Linguagem>{
    @Override
    public int compare(Linguagem o1, Linguagem o2) {
        int nome = o1.getNome().compareTo(o2.getNome());
        if(nome != 0) return nome;
        int ano = o1.getAnoDeCriacao().compareTo(o2.getAnoDeCriacao());
        if(ano != 0) return ano;
        return o1.getIDE().compareTo(o2.getIDE());
    }
}

