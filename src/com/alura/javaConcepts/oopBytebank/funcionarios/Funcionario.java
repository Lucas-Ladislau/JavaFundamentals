package com.alura.javaConcepts.oopBytebank.funcionarios;

/**
 * Created by Lucas Anderson Ladislau Aguiar on 05/08/2022.
 */
public abstract class Funcionario {

    private String nome;
    private String cpf;
    private double salario;

    public abstract double getBonificação();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}
