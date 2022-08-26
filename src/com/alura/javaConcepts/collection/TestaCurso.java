package com.alura.javaConcepts.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lucas Anderson Ladislau Aguiar on 19/08/2022.
 */
public class TestaCurso {

    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando Collection","Lucas Anderson");

        javaColecoes.adiciona(new Aula("Trabalhando com Arraylist", 22));
        javaColecoes.adiciona(new Aula("Criando uma aula", 15));
        javaColecoes.adiciona(new Aula("Modelando coleções", 17));

        /*Em tempo de execução será lançada uma exception,código nos comentários , pois o get aulas é somente uma cópia
        * feita justamente para não ser alterada diretamente
        *
        * javaColecoes.getAulas().add(new Aula("Modelando coleções", 17))*/
        List<Aula> aulasImutavel = javaColecoes.getAulas();
        System.out.println(aulasImutavel);

        /*Produz uma cópia que poderá ser alterada, dado que o valor a lista foi passado em um
        * novo array, em seu construtor, possibilitando sua alteração*/
        List<Aula> aulas = new ArrayList<>(aulasImutavel);
        System.out.println(aulas);

        System.out.println(javaColecoes.getTempoTotal());
        System.out.println(javaColecoes);





    }
}
