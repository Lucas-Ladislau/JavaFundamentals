package com.javaConcepts.collections.dio.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Lucas Anderson Ladislau Aguiar on 19/12/2022.
 */
public class OrdenacaoList {
    public static void main(String[] args) {
        List<Gato> gatos = new ArrayList<>(){{
            add(new Gato("Felix", 12, "Tigrado"));
            add(new Gato("Garfield", 4, "Laranja"));
            add(new Gato("Tom", 7, "Cinza"));
        }};
        System.out.println(gatos);

        Collections.shuffle(gatos);
        System.out.println(gatos);
        Collections.sort(gatos);
        System.out.println(gatos);
        gatos.sort(new ComparatorIdade());
        System.out.println(gatos);
        System.out.println("\n Comparando por cor, nome e idade");
        gatos.sort(new ComparatorCorNomeIdade());
        System.out.println(gatos);
    }
}

class Gato implements Comparable<Gato> {
    private String nome;
    private Integer idade;
    private String cor;

    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return  "{"+
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\''+"}";
    }

    @Override
    public int compareTo(Gato gato) {
        return this.getNome().compareTo(gato.getNome());
    }
}

class ComparatorIdade implements Comparator<Gato> {

    @Override
    public int compare(Gato o1, Gato o2) {
        return Integer.compare(o1.getIdade(), o2.getIdade());
    }
}

class ComparatorCorNomeIdade implements Comparator<Gato> {

    @Override
    public int compare(Gato o1, Gato o2) {
        int cor = o1.getCor().compareTo(o2.getCor());
        if(cor != 0) return cor;

        int nome = o1.getNome().compareTo(o2.getNome());
        if(nome != 0) return nome;
        return Integer.compare(o1.getIdade(), o2.getIdade());
    }
}
