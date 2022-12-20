package com.javaConcepts.collections.dio.set;

import java.util.*;

/**
 * Created by Lucas Anderson Ladislau Aguiar on 20/12/2022.
 */
/*
Crie uma conjunto contendo as cores do arco-íris e:
a) Exiba todas as cores o arco-íris uma abaixo da outra;
b) A quantidade de cores que o arco-íris tem;
c) Exiba as cores em ordem alfabética;
d) Exiba as cores na ordem inversa da que foi informada;
e) Exiba todas as cores que começam com a letra ”v”;
f) Remova todas as cores que não começam com a letra “v”;
g) Limpe o conjunto;
h) Confira se o conjunto está vazio;
 */
public class ExercicioArcoIris {
    public static void main(String[] args) {
        Set<String> coresArcoIris = new TreeSet<>(){{
            add("vermelho");
            add("laranja");
            add("amarelo");
            add("verde");
            add("azul");
            add("anil");
            add("violeta");
        }};
        for (String cor: coresArcoIris) {
            System.out.println(cor);
        }
        System.out.println("Quantidade de cores: "+ coresArcoIris.size());
        System.out.println(coresArcoIris);
        Set<String> coresInverso = new TreeSet<>(Collections.reverseOrder(new ColorComparator())){{
            addAll(coresArcoIris);
        }};
        System.out.println(coresInverso);
        for (String cor: coresArcoIris) {
            if(cor.startsWith("v")){
                System.out.println(cor);
            }
        }
        Iterator<String> iterator = coresArcoIris.iterator();
        while (iterator.hasNext()){
            if(!iterator.next().contains("v")) iterator.remove();
        }
        System.out.println(coresArcoIris);
        coresArcoIris.clear();
        System.out.println(coresArcoIris.isEmpty());
    }
}

class ColorComparator implements Comparator<String>{
    @Override
    public int compare(String cor1, String cor2) {
        return cor1.compareTo(cor2);
    }
}
