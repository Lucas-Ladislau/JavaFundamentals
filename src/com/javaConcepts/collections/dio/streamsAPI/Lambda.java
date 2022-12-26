package com.javaConcepts.collections.dio.streamsAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Lucas Anderson Ladislau Aguiar on 26/12/2022.
 */
public class Lambda {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>(){{
            add("tiago");
            add("joão");
            add("claudio");
        }};
        System.out.println(nomes);
        nomes.sort(Comparator.comparing((String nome)-> (nome)));
        System.out.println(nomes);
    }
}
