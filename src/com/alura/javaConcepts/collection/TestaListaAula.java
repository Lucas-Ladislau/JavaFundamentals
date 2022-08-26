package com.alura.javaConcepts.collection;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Lucas Anderson Ladislau Aguiar on 19/08/2022.
 */
public class TestaListaAula {

    public static void main(String[] args) {
        Aula a1 = new Aula("Revisando arrayLists", 21);
        Aula a2 = new Aula("Listas de Objetos", 20);
        Aula a3 = new Aula("Relacionamento de listas de objetos", 15);

        ArrayList<Aula> aulas = new ArrayList<>();
        aulas.add(a1);
        aulas.add(a2);
        aulas.add(a3);

        Collections.sort(aulas);
        aulas.forEach(aula -> {
            System.out.println("Aula: " + aula.getTitulo());
        });

        aulas.sort( (aula1, aula2) -> Integer.compare(aula1.getTempo(), aula2.getTempo()));

        System.out.println("");
        aulas.forEach(aula -> {
            System.out.println("Aula: " + aula.getTitulo()+", duração: "+aula.getTempo()+"min");
        });
    }
}
