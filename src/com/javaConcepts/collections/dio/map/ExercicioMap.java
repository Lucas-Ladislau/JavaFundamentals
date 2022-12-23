package com.javaConcepts.collections.dio.map;

import java.text.NumberFormat;
import java.util.*;

/**
 * Created by Lucas Anderson Ladislau Aguiar on 22/12/2022.
 */
/* Dada a população estimada de alguns estados do NE brasileiro, faça:
Crie um dicionário e relacione os estados e suas populações;
Substitua a população do estado do RN por 3.534.165;
Confira se o estado PB está no dicionário, caso não adicione: PB -
4.039.277;
Exiba a população PE;*/
public class ExercicioMap {
    public static void main(String[] args) {
        Map<String, Integer> estados = new HashMap<>(){{
           put("PE", 9616621);
           put("AL", 3351543);
           put("CE", 9187103);
           put("RN", 3534265);
        }};
        System.out.println(estados);
        //Put tanto insere quanto atualiza
        estados.put("RN", 3534165);
        System.out.println(estados);
        if(!estados.containsKey("PB")){
            estados.put("PB", 4039277);
        }
        System.out.println(estados);

        System.out.print("Exibindo a população PE: ");
        for (Map.Entry<String, Integer> entry: estados.entrySet()) {
            if (entry.getKey().equals("PE")){
                System.out.println(entry.getValue());
            }
        }

    /*Exiba todos os estados e suas populações na ordem que foi
    informado;
    Exiba os estados e suas populações em ordem alfabética;
    Exiba o estado com o menor população e sua quantidade;
    Exiba o estado com a maior população e sua quantidade;
    Exiba a soma da população desses estados;
    Exiba a média da população deste dicionário de estados;
    Remova os estados com a população menor que 4.000.000;
    Apague o dicionário de estados;
    Confira se o dicionário está vazio.*/
        Map<String, Integer> estados2 = new LinkedHashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        System.out.println(estados2);

        Map<String, Integer> estados3 = new TreeMap<>(estados);
        System.out.println(estados3);

        Integer menorPopulacao = Collections.min(estados.values());
        for (Map.Entry<String, Integer> entry: estados.entrySet()) {
            if (entry.getValue().equals(menorPopulacao)){
                System.out.println("Menor população "+entry.getKey()+"-> "+ entry.getValue());
            }
        }

        Integer maiorPopulacao = Collections.max(estados.values());
        for (Map.Entry<String, Integer> entry: estados.entrySet()) {
            if (entry.getValue().equals(maiorPopulacao)){
                System.out.println("Maior população "+entry.getKey()+"-> "+ entry.getValue());
            }
        }

        Iterator<Integer> iterator = estados.values().iterator();
        Integer somaPopulacional = 0;
        while (iterator.hasNext()){
            somaPopulacional += iterator.next();
        }
        NumberFormat myFormat = NumberFormat.getInstance();
        System.out.println("Soma populacional: "+ myFormat.format(somaPopulacional)+" habitantes");
        System.out.println("Média da amostra = "+ myFormat.format(somaPopulacional/estados.size()));

        Iterator<Integer> iterator2 = estados.values().iterator();
        while (iterator2.hasNext()){
            if(iterator2.next() < 4000000) iterator2.remove();
        }
        System.out.println(estados);

        estados.clear();
        System.out.println(estados.isEmpty());


    }

}
