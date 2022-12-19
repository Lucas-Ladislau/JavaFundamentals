package com.javaConcepts.collections.dio.list;


import java.util.*;

/**
 * Created by Lucas Anderson Ladislau Aguiar on 19/12/2022.
 */
public class PraticaList {
    public static void main(String[] args) {
        //Formas de inicializar a interface List
        List<Double> notas = new ArrayList<>();
//    ArrayList<Double> notas = new ArrayList<>();
        //Inicializar um arrayList com valores
//    List<Double> notas = new ArrayList<>(Arrays.asList(7d, 6.7,8.2, 9d));
        //Gerar uma Lista imutável
//    List<Double> notas = Arrays.asList(7d, 6.7,8.2, 9d);
//    List<Double> notas = List.of(7d, 6.7,8.2, 9d);


        //Exercitando
        System.out.println("Inserindo dados na lista notas...");
        notas.add(5.6);
        notas.add(4.3);
        notas.add(5d);
        notas.add(7.2);
        notas.add(8d);
        notas.add(1.3);
        System.out.println(notas);

        System.out.println("Exibindo a posição da nota 4.3: " + notas.indexOf(4.3));
        System.out.println("Inserindo um valor em uma determinada posição, 3");
        notas.add(3,2d);
        System.out.println(notas);
        System.out.println("Substituindo um valor com base no seu index, com o método set");
        notas.set(notas.indexOf(4.3), 3.2 );
        System.out.println(notas);
        System.out.println("Verificar se um elemento consta na lista, procurando por 4.3: "+notas.contains(4.3));
        System.out.println("Exibindo a 4° nota: "+ notas.get(3));
        System.out.println("Exibindo a menor nota: "+ Collections.min(notas));
        System.out.println("Exibindo a maior nota: "+ Collections.max(notas));
        System.out.print("Soma dos valores = ");
        Double soma = 0d;
        Iterator<Double> iterator = notas.iterator();
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println(soma);
        System.out.println("Removendo a nota 7.2...");
        notas.remove(7.2);
        System.out.println(notas);
        System.out.println("Remover todos os elementos maiores que 5");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){
            Double next = iterator1.next();
            if (next >=5) iterator1.remove();
        }
        System.out.println(notas);

        System.out.println("Apagando toda a lista");
        notas.clear();
        System.out.println("Lista vazia = " + notas.isEmpty());
    }

}

