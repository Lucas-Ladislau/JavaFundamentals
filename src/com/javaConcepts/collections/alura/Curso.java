package com.javaConcepts.collections.alura;

import java.util.*;

/**
 * Created by Lucas Anderson Ladislau Aguiar on 19/08/2022.
 */
public class Curso {

    private String nome;
    private String instrutor;
    private List<Aula> aulas = new LinkedList<>();
    private Set<Aluno> alunos = new HashSet<>();

//  Temos também o liinkedHashMap, que guarda a ordem das linhas
    private Map<Integer, Aluno> matriculasPorAluno= new HashMap<>();


    public Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public String getNome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public Set<Aluno> getAlunos() { return Collections.unmodifiableSet(alunos); }

    //    O metodo da collection faz com que o get retorne uma copia somente
//    de leitura da lista, evitando que ela seja modificada
    public List<Aula> getAulas() {
        return Collections.unmodifiableList(aulas);
    }

    public void adiciona(Aula aula){
        this.aulas.add(aula);
    }

    public int getTempoTotal(){
        int tempoTotal = 0;
        for (Aula aula: aulas) {
            tempoTotal += aula.getTempo();
        }
        return tempoTotal;
    /*Outra forma mais enxuta
    return this.aulas.stream.mapToInt(Aula::getTempo).sum()*/
    }

    @Override
    public String toString() {
        return "Curso{" + "nome='" + nome + "/ Tempo total: "+ getTempoTotal()+'\'' + '}';
    }

    public void matricula(Aluno aluno) {
        this.alunos.add(aluno);
        this.matriculasPorAluno.put(aluno.getNumeroMatricula(), aluno);
    }

    public boolean estaMatriculado(Aluno aluno) {
        return this.alunos.contains(aluno);
    }

    public Aluno buscaMatricula(int matricula) {
        if (!matriculasPorAluno.containsKey(matricula)){
            throw new NoSuchElementException("Não encontrado");
        }
        return matriculasPorAluno.get(matricula);
    }
}
