package com.javaConcepts.collections.dio.set;

import java.util.*;

/**
 * Created by Lucas Anderson Ladislau Aguiar on 20/12/2022.
 */
public class PraticaSet {
    public static void main(String[] args) {
        //Formas de inicializar a interface List
//        Set<Double> notas = new HashSet<>();
//        HashSet<Double> notas = new HashSet<>();
        //Gerar uma Lista imutável
//    List<Double> notas = Arrays.asList(7d, 6.7,8.2, 9d);
//    List<Double> notas = Set.of(7d, 6.7,8.2, 9d);


        //Exercitando
        System.out.println("Inserindo dados na lista notas...");
        //Inicializar um arrayList com valores
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 6.7,8.2, 9d));
        System.out.println(notas);
        System.out.println("Verificar se um elemento consta na lista, procurando por 4.3: "+notas.contains(4.3));
        System.out.println("Exibindo a menor nota em Set: "+ Collections.min(notas));
        System.out.println("Exibindo a maior notaem Set: "+ Collections.max(notas));
        System.out.print("Soma dos valores em Set= ");
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

        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(7d);
        notas2.add(6.7);
        notas2.add(8.2);
        notas2.add(9d);
        System.out.println("Imprimir os elementos de acordo com a ordem de inserção");
        System.out.println(notas2);

        System.out.println("Exibir os elmentos na ordem crescente");
        //O treeSet utiliza a ordem natural dos elementos, logo utilizamos ele.
        //Precisa que o objeto possua comparator ou comparable
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);
    }
}
