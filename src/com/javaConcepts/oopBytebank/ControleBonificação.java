package com.javaConcepts.oopBytebank;


import com.javaConcepts.oopBytebank.funcionarios.Funcionario;

/**
 * Created by Lucas Anderson Ladislau Aguiar on 05/08/2022.
 */
public class ControleBonificação {

    private double soma;

    public void registra(Funcionario f){
        double boni = f.getBonificação();
        this.soma += boni;
    }

    public double getSoma() {
        return soma;
    }
}
