package com.javaConcepts.collections.dio.map;

import java.util.*;

/**
 * Created by Lucas Anderson Ladislau Aguiar on 23/12/2022.
 */
/*
Faça um programa que simule um lançamento de dados. Lance o dado 100 vezes e armazene.
Depois, mostre quantas vezes cada valor foi conseguido.
 */
public class Desafio {
    public static void main(String[] args) {
        Map<Integer,Integer> numerosDado = new HashMap(){{
            put(1,0);
            put(2,0);
            put(3,0);
            put(4,0);
            put(5,0);
            put(6,0);
        }};
        Random random = new Random();
        for (int i = 0; i <100; i++){
            int numeroSorteado = 1 + random.nextInt(6);
            numerosDado.put(numeroSorteado, numerosDado.get(numeroSorteado)+1);
        }
        for (Map.Entry < Integer,Integer> numero: numerosDado.entrySet()){
            System.out.println("O número "+ numero.getKey()+ " se repetiu "+ numero.getValue()+" vezes");
        }
        System.out.println("\n"+numerosDado);

    }

}
