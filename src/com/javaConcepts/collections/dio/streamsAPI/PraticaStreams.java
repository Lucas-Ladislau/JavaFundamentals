package com.javaConcepts.collections.dio.streamsAPI;

import com.javaConcepts.collections.dio.map.Contato;

import java.util.*;
import java.util.function.Function;

/**
 * Created by Lucas Anderson Ladislau Aguiar on 26/12/2022.
 */
public class PraticaStreams {
    public static void main(String[] args) {
        Map<Integer, Contato> agenda = new HashMap<>() {{
            put(1, new Contato("Simba", 5555));
            put(4, new Contato("Cami", 1111));
            put(3, new Contato("Jon", 2222));
        }};
        for (Map.Entry<Integer, Contato> entry: agenda.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNumero() +
                    ": " +entry.getValue().getNome());
        }

        System.out.println("\n\nOrdenando pelo numero com functional interface");
        //Ordenação Usando o Functional interface
        Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(Comparator.comparing(
                new Function<Map.Entry<Integer, Contato>, Integer>() {
                    @Override
                    public Integer apply(Map.Entry<Integer, Contato> cont) {
                        return cont.getValue().getNumero();
                    }
                }));
        set.addAll(agenda.entrySet());
        for (Map.Entry<Integer, Contato> entry: set) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNumero() +
                    ": " +entry.getValue().getNome());
        }

        System.out.println("\n\nOrdenando pelo numero com Lambda Expression");
        //Ordenação Usando o Lambda
        Set<Map.Entry<Integer, Contato>> lambdaExample = new TreeSet<>(Comparator.comparing((cont)-> (cont.getValue().getNumero())));
        lambdaExample.addAll(agenda.entrySet());
        for (Map.Entry<Integer, Contato> entry: lambdaExample) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNumero() +
                    ": " +entry.getValue().getNome());
        }
    }
}
