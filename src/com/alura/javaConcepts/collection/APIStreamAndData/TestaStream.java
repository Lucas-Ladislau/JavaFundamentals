package com.alura.javaConcepts.collection.APIStreamAndData;


import com.alura.javaConcepts.collection.Aula;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Lucas Anderson Ladislau Aguiar on 23/08/2022.
 */
public class TestaStream {
    public static void main(String[] args) {

        List<Aula> aulas = new ArrayList<>();

        aulas.add(new Aula("Flutter", 78));
        aulas.add(new Aula("Kotlin", 100));
        aulas.add(new Aula("C", 50));
        aulas.add(new Aula("Ruby on Rails", 30));
        aulas.add(new Aula("Pythom", 15));

        //Filtra de acordo com um predicate(valor condicional) e imprimi os valores no fim
        aulas.stream().filter(aula -> aula.getTempo() <= 50).forEach(print -> System.out.println(print));

        int sum = aulas.stream().filter(aula -> aula.getTempo() <= 50).mapToInt(Aula::getTempo).sum();
        System.out.println("O tempo total dos cursos com menos de 50 min é: "+sum+" min\n");

        System.out.println("=====Ordendando com o comparing e method reference");
        aulas.sort(Comparator.comparing(Aula::getTempo));
        aulas.forEach(System.out::println);

        //Para tratar os nulls a classe padrão implementada é a Optional que possui o ifPresent
        aulas.stream().filter(aula -> aula.getTempo()>=100).findAny().ifPresent(System.out::println);

        //Passar o stream para um List através do collectors, pois como é um stream ele é somente um fluxo
        //se for chamado novamente ele perde o filtro da lista caso não seja armazenado com collect
        List<Aula> listaAulasMenor50 = aulas.stream().filter(aula -> aula.getTempo() <= 50).collect(Collectors.toList());


        System.out.println("");
        //Um stream com chave-valor para pegar as aulas com tempo menor a 50 min
        aulas.stream().filter(aula -> aula.getTempo() <= 50)
                .collect(Collectors.toMap(Aula::getTitulo, Aula::getTempo))
                .forEach((titulo, tempo) -> System.out.println("Temos aula de "+ titulo+", com duração total de "+tempo+"min"));
        //Dica: streams do Java 8 temos o parallelStream, que realiza um stream parelelo, porém deve ser utilizado com cuidado

        //Fazendo a media de duração das aulas com o stream
        double somaTempoToal = aulas.stream().mapToInt(Aula::getTempo).sum();
        System.out.println("\nMédia de tempo das aulas: "+somaTempoToal/aulas.stream().count());
    }
}
