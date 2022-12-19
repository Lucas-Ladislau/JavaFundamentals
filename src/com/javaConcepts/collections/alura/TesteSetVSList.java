package com.javaConcepts.collections.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * Created by Lucas Anderson Ladislau Aguiar on 22/08/2022.
 */
public class TesteSetVSList {
    public static void main(String[] args) {

        Collection<Integer> listaArray = new ArrayList<>();
        Collection<Integer> listaHash = new HashSet<>();

        long tempoExecucaoArray = tempoExecucao(listaArray);
        long tempoExecucaoHash = tempoExecucao(listaHash);
        System.out.println("Tempo gasto ArrayList: "+ tempoExecucaoArray);
        System.out.println("Tempo gasto Hashset: "+ tempoExecucaoHash);

    }

    public static long tempoExecucao(Collection<Integer> lista){
        long inicio = System.currentTimeMillis();

        for (int i = 1; i <= 50000; i++) {
            lista.add(i);
        }

        for (Integer numero : lista) {
            lista.contains(numero);
        }

        long fim = System.currentTimeMillis();

        return fim - inicio;
    }
}
