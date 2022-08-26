package com.alura.javaConcepts.oopBytebank;

/**
 * Created by Lucas Anderson Ladislau Aguiar on 09/08/2022.
 */
public class CalculadorImposto {

    private double total;

    public void registra(Tributavel t){
        double valor  = t.getValorImposto();
        this.total += valor;
    }

    public double getTotal() {
        return total;
    }
}
