package com.javaConcepts.collections.dio.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/* Faça um programa que receba a temperatura média dos 6
primeiros meses do ano e armazene-as em uma lista.
Após isto, calcule a média semestral das temperaturas e
mostre todas as temperaturas acima desta média, e em que
mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2
– Fevereiro e etc).*/

public class ExercicioTemperatura {

    public static void main(String[] args) {
        List<Double> temperaturas = new ArrayList<>();
        double soma = 0d;

        System.out.println("Digite as 6 primeiras temperaturas do ano:");
        Scanner entrada = new Scanner(System.in);
        int i = 0;
        while (i < 6) {
            double temp = entrada.nextDouble();
            temperaturas.add(temp);
            soma += temp;
            i += 1;
        }
        System.out.println(temperaturas);
        double media = soma/temperaturas.size();
        System.out.println("Media :"+media);

        for (double temp: temperaturas) {
            if (temp >= media) {
                int index = temperaturas.indexOf(temp);
                switch (index) {
                    case 0:
                        System.out.println("1 - Janeiro" + temp);
                        break;
                    case 1:
                        System.out.println("2 - Fevereiro"+ temp);
                        break;
                    case 2:
                        System.out.println("3 - Marco"+ temp);
                        break;
                    case 3:
                        System.out.println("4 - Abril"+ temp);
                        break;
                    case 4:
                        System.out.println("5 - Maio"+ temp);
                        break;
                    case 5:
                        System.out.println("6 - Junho"+ temp);
                        break;
                    default:
                       break;
                }
            }
        }
        System.out.println(temperaturas);

    }
}
