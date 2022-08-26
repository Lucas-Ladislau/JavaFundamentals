package com.alura.javaConcepts.oopBytebank;




import com.alura.javaConcepts.oopBytebank.contas.*;
import com.alura.javaConcepts.oopBytebank.funcionarios.Cliente;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lucas Anderson Ladislau Aguiar on 16/08/2022.
 * Teste para ordenação em lists, usando o comparator
 */
public class TesteClasseAnonima {

    public static void main(String[] args) {

        Conta cc1 = new ContaCorrente(22, 33);
        Cliente clienteCC1 = new Cliente();
        clienteCC1.setNome("Nico");
        cc1.setTitular(clienteCC1);
        cc1.deposita(333.0);

        Conta cc2 = new ContaPoupanca(22, 44);
        Cliente clienteCC2 = new Cliente();
        clienteCC2.setNome("Guilherme");
        cc2.setTitular(clienteCC2);
        cc2.deposita(444.0);

        Conta cc3 = new ContaCorrente(22, 11);
        Cliente clienteCC3 = new Cliente();
        clienteCC3.setNome("Paulo");
        cc3.setTitular(clienteCC3);
        cc3.deposita(111.0);

        Conta cc4 = new ContaPoupanca(22, 22);
        Cliente clienteCC4 = new Cliente();
        clienteCC4.setNome("Ana");
        cc4.setTitular(clienteCC4);
        cc4.deposita(222.0);


        List<Conta> lista = new ArrayList<>();
        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);

        System.out.println("--------------------Lista Original--------------------");
        for (Conta conta : lista) {
            System.out.println(conta);
        }

//      Criação de uma labmda function

        lista.sort((Conta c1, Conta c2)-> {
                String nomeC1 = c1.getTitular().getNome();
                String nomeC2 = c2.getTitular().getNome();
                return nomeC1.compareTo(nomeC2);
            }
        );

        System.out.println("");
        System.out.println("--------------------Lambda 1--------------------");

        for (Conta conta : lista) {
            System.out.println(conta);
        }

        lista.sort((c1, c2) -> Integer.compare(c1.getNumero(), c2.getNumero()));

        System.out.println("");
        System.out.println("--------------------Lambda 2--------------------");

//        Usando o foreach com a própria lista utilizando o new Consumer(Interface)
//        para a impressão dos dados
//        consumer + implementação da lambda function
        lista.forEach((conta) -> System.out.println(conta));

    }

}

