package com.alura.javaConcepts.collection;

/**
 * Created by Lucas Anderson Ladislau Aguiar on 22/08/2022.
 */
public class TestaMap {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando Maps","Lucas Anderson");

        javaColecoes.adiciona(new Aula("Trabalhando com Array", 22));
        javaColecoes.adiciona(new Aula("Criando uma aula Set", 15));
        javaColecoes.adiciona(new Aula("Modelando coleções Map", 17));

        Aluno a1 = new Aluno("Joao Ptlomeu", 1223);
        Aluno a2 = new Aluno("Claudio", 7484);
        Aluno a3 = new Aluno("Jonas", 5418);

        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);

        Aluno aluno = javaColecoes.buscaMatricula(5418);
    }
}
