package com.javaConcepts.oopBytebank;

/**
 * Created by Lucas Anderson Ladislau Aguiar on 08/08/2022.
 */
public class SistemaInterno {


    private int senha = 2222;

    public void autentica(Autenticavel auth){

        boolean autenticou = auth.autentica(this.senha);

        if(autenticou){
            System.out.println("Pode entrar no sistema");
        } else {
            System.out.println("Não pode entrar no sistema");
        }
    }

}
