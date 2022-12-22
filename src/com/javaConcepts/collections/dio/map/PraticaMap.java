package com.javaConcepts.collections.dio.map;

import java.util.*;

/**
 * Created by Lucas Anderson Ladislau Aguiar on 21/12/2022.
 */
public class PraticaMap {
    public static void main(String[] args) {
        //Inicialização
//        Map<String, Double> carros = new HashMap<>();
//        Map<String, Double> carros = Map.of("Sedan",14.5,"gol",12.2);
        System.out.println("Criando um dicionário e adicionando elementos nele");
        Map<String, Double> carros = new HashMap<>(){{
           put("Gol", 11.4);
           put("Ford Ka", 13d);
           put("Gran Siena", 9.5);
           put("Lamborguini", 7d);
        }};
        System.out.println(carros.toString());
        System.out.println("Substituir o consumo do Gran Siena por 10.2");
        carros.put("Gran Siena", 10.2);
        System.out.println(carros.toString());
        System.out.println("O elemento lamborguini está presente? "+ carros.containsKey("Lamborguini"));
        System.out.println("Valor de consumo do Ford Ka: "+ carros.get("Ford Ka"));

        //exibi somente as chaves do map
        System.out.println("Exiba os modelos: ");
        Set<String> modelos = carros.keySet();
        System.out.println(modelos);

        //exibi os valores das chaves
        System.out.println("Exiba os consumos dos carros: ");
        Collection<Double> consumos = carros.values();
        System.out.println(consumos);

        System.out.println("Exiba o modelo mais econômico e seu consumo: ");

        Double consumoMaisEficiente = Collections.max(carros.values());
        //Traz o conjunto de chave e valores em forma de entry
        Set<Map.Entry<String, Double>> entries = carros.entrySet();
        String modeloMaisEficiente = "";

        //buscar o modelo(key) pelo valor
        for (Map.Entry<String, Double> entry : entries) {
            if (entry.getValue().equals(consumoMaisEficiente)) {
                modeloMaisEficiente = entry.getKey();
                System.out.println("Modelo mais eficiente: " + modeloMaisEficiente + " - " + consumoMaisEficiente);
            }
        }

        System.out.println("Exiba o modelo menos econômico e seu consumo: " );

        Double consumoMenosEficiente = Collections.min(carros.values());
        String modeloMenosEficiente = "";
        for (Map.Entry<String, Double> entry: carros.entrySet()) {
            if(entry.getValue().equals(consumoMenosEficiente)) {
                modeloMenosEficiente = entry.getKey();
                System.out.println("Modelo menos eficiente: " + modeloMenosEficiente + " - " + consumoMenosEficiente);
            }
        }

        Iterator<Double> iterator = carros.values().iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println("Exiba a soma dos consumos: " + soma);

        System.out.println("Exiba a média dos consumos deste dicionário de carros: " + (soma/carros.size()));

        System.out.println(carros);
        System.out.println("Remova os modelos com o consumo igual a 15,6 km/l: ");
        Iterator<Double> iterator1 = carros.values().iterator();
        while(iterator1.hasNext()){
            if(iterator1.next().equals(15.6)) iterator1.remove();
        }
        System.out.println(carros);

        System.out.println("Exiba todos os carros na ordem em que foram informados: ");
        Map<String, Double> carrosPopulares1 = new LinkedHashMap<>() {{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares1.toString());

        System.out.println("Exiba o dicionário ordenado pelo modelo: ");
        Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1);
        System.out.println(carrosPopulares2.toString());

        System.out.println("Apague o dicionario de carros: ");
        carros.clear();

        System.out.println("Confira se o dicionário está vazio: " + carros.isEmpty());

    }
}
