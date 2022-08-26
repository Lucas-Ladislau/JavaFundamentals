package com.alura.javaConcepts.oopBytebank;


import com.alura.javaConcepts.oopBytebank.contas.ContaCorrente;

/**
 * Created by Lucas Anderson Ladislau Aguiar on 09/08/2022.
 */
public class TesteTributável {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(222,333);
        cc.deposita(100.0);

        SeguroDeVida seguroDeVida = new SeguroDeVida();
        seguroDeVida.getValorImposto();

        CalculadorImposto ca = new CalculadorImposto();
        ca.registra(cc);
        ca.registra(seguroDeVida);
        System.out.println("hello");
        System.out.println(ca.getTotal());
    }
}
