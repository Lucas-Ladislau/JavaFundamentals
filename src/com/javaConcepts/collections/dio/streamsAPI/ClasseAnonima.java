package com.javaConcepts.collections.dio.streamsAPI;

import java.util.ArrayList;
import java.util.Collections;

import java.util.Comparator;
import java.util.List;

/**
 * Created by Lucas Anderson Ladislau Aguiar on 26/12/2022.
 */
public class ClasseAnonima {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>(){{
            add("tiago");
            add("joão");
            add("claudio");
        }};
        System.out.println(nomes);
        nomes.sort(new Comparator<String>(){
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println(nomes);
    }
}

