package com.javaConcepts.collections.dio.streamsAPI;

import java.util.*;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Created by Lucas Anderson Ladislau Aguiar on 26/12/2022.
 */
public class ExercitandoStreams {
    public static void main(String[] args) {
        List<String> numerosAleatorios =
                Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

        System.out.println("Imprima todos os elementos dessa lista de String: ");
        numerosAleatorios.stream().forEach(System.out::println);

        System.out.println("Pegue os 5 primeiros números e coloque dentro de um Set:");
        Set<String> cincoPrimeiros = numerosAleatorios.stream().limit(5).collect(Collectors.toSet());
        cincoPrimeiros.forEach(System.out::println);
        System.out.println("Transforme esta lista de String em uma lista de números inteiros.");
//        List<Integer> numerosInteiros = numerosAleatorios.stream().map(new Function<String, Integer>() {
//            @Override
//            public Integer apply(String s) {
//                return Integer.parseInt(s);
//            }
//        }).collect(Collectors.toList());
        //reduzindo
        List<Integer> listaInteiros = numerosAleatorios.stream().map(Integer::parseInt).collect(Collectors.toList());
        System.out.println(listaInteiros);
        System.out.println("Pegue os números pares e maiores que 2 e coloque em uma lista:");
        List<Integer> pares = listaInteiros.stream().filter(i -> i % 2 == 0 && i>2).collect(Collectors.toList());
        System.out.println(pares);

        System.out.println("Mostre a média dos números: ");
        numerosAleatorios.stream().mapToInt(Integer::parseInt).average().ifPresent(System.out::println);

        System.out.println("Ignore os 3 primeiros elementos da lista e imprima o restante:");
        numerosAleatorios.stream().skip(3).forEach(System.out::println);
        System.out.println("Mostre o menor valor da lista: ");
        listaInteiros.stream().min((num1, num2)->(num1.compareTo(num2))).ifPresent(System.out::println);
        System.out.println("Mostre o maior valor da lista: ");
        listaInteiros.stream().max((num1, num2)->(num1.compareTo(num2))).ifPresent(System.out::println);
        System.out.println("Pegue apenas os números pares e some: ");
        int soma = pares.stream().mapToInt(Integer::intValue).sum();
        System.out.println(soma);
        System.out.println("Mostre a lista na ordem númerica: ");
        List<Integer> ordenado = listaInteiros.stream().sorted((num1, num2) -> (num1.compareTo(num2)))
                .collect(Collectors.toList());
        System.out.println(ordenado);

        System.out.println("Agrupe os valores ímpares múltiplos de 3 ou de 5:");
        Map<Boolean, List<Integer>> multiplos3E5 = listaInteiros.stream()
                .collect(Collectors.groupingBy(i -> (i % 3 == 0 || i % 5 == 0)));
        System.out.println(multiplos3E5.get(true));

        System.out.println("Remova os valores ímpares: ");
        listaInteiros.removeIf(i -> i%2 != 0);
        System.out.println(listaInteiros);
    }

}
