package com.javaConcepts.collections.dio.set;

import java.util.*;

/**
 * Created by Lucas Anderson Ladislau Aguiar on 20/12/2022.
 */
public class OrdenacaoSet {
    public static void main(String[] args) {
        System.out.println("Imprimindo de forma aleatória o set");
        Set<Serie> series = new HashSet<>(){{
           add(new Serie("Peaky Blinders", "Historico", 60));
           add(new Serie("La casa de papel", "Ficção", 50));
           add(new Serie("The chosen", "Religioso", 45));
           add(new Serie("Suits", "Comedia", 55));
        }};
        System.out.println(series);

        System.out.println("\n===Imprimindo de forma ordenada de acordo com a inserção o set");
        Set<Serie> series2 = new LinkedHashSet<>(){{
           add(new Serie("Peaky Blinders", "Historico", 60));
           add(new Serie("La casa de papel", "Ficção", 50));
           add(new Serie("The chosen", "Religioso", 45));
           add(new Serie("Suits", "Comedia", 55));
        }};
        System.out.println(series2);

        System.out.println("\n===Imprimindo de forma natural(tempo de ep) o set");
        Set<Serie> series3 = new TreeSet<>(series2);
        System.out.println(series3);
    }

}

class Serie implements Comparable<Serie>{
    private String nome;
    private String genero;
    private Integer tempoDeEpisodio;

    public Serie(String nome, String genero, Integer tempoDeEpisodio) {
        this.nome = nome;
        this.genero = genero;
        this.tempoDeEpisodio = tempoDeEpisodio;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public Integer getTempoDeEpisodio() {
        return tempoDeEpisodio;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", tempoDeEpisodio=" + tempoDeEpisodio +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return Objects.equals(nome, serie.nome) && Objects.equals(genero, serie.genero) && Objects.equals(tempoDeEpisodio, serie.tempoDeEpisodio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, tempoDeEpisodio);
    }

    @Override
    public int compareTo(Serie o) {
        int tempoDeEp = this.tempoDeEpisodio.compareTo(o.getTempoDeEpisodio());
        if(tempoDeEp != 0) return tempoDeEp;
        return this.genero.compareTo(o.genero);
    }
}
