package com.javaConcepts.oopBytebank;


import com.javaConcepts.oopBytebank.funcionarios.Administrador;
import com.javaConcepts.oopBytebank.funcionarios.Gerente;

/**
 * Created by Lucas Anderson Ladislau Aguiar on 03/08/2022.
 */
public class App {
    public static void main(String[] args) {
        Gerente f1 = new Gerente();
        Administrador f2 = new Administrador();

//        f1.setSalario(1200.0);
//        f2.setSalario(1100.0);
//
        f1.setSenha(2222);
        f2.setSenha(333);
        SistemaInterno si = new SistemaInterno();
        si.autentica(f1);
        si.autentica(f2);
        boolean autenticou = f1.autentica(222);
        System.out.println(autenticou);

//
//        System.out.println(f1.getBonificação());
//        System.out.println( f2.getBonificação());
//
//        ControleBonificação cb  = new ControleBonificação();
//        cb.registra(f1);
//        cb.registra(f2);
//        System.out.println(cb.getSoma());

    }
}
