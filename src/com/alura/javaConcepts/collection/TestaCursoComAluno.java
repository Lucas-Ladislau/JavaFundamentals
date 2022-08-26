package com.alura.javaConcepts.collection;

/**
 * Created by Lucas Anderson Ladislau Aguiar on 22/08/2022.
 */
public class TestaCursoComAluno {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando Collection","Lucas Anderson");

        javaColecoes.adiciona(new Aula("Trabalhando com Arraylist", 22));
        javaColecoes.adiciona(new Aula("Criando uma aula", 15));
        javaColecoes.adiciona(new Aula("Modelando coleções", 17));

        Aluno a1 = new Aluno("Joao", 1223);
        Aluno a2 = new Aluno("Claudio", 7484);
        Aluno a3 = new Aluno("Jonas", 5418);

        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);

        javaColecoes.getAlunos().forEach(System.out::println);

        System.out.println(javaColecoes.estaMatriculado(a1));

//        Hash e o equal devem ser iguais
        Aluno joao = new Aluno("Joao", 1223);
        System.out.println("Equals: "+a1.equals(joao));
        System.out.print("HashCode: ");
        System.out.println(a1.hashCode() == joao.hashCode());

    }
}
