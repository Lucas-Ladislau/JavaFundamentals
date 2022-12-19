package com.javaConcepts.oopBytebank.funcionarios;


import com.javaConcepts.oopBytebank.Autenticavel;

/**
 * Created by Lucas Anderson Ladislau Aguiar on 08/08/2022.
 */
public class Cliente2 implements Autenticavel {

    private int senha;

    @Override
    public boolean autentica(int senha) {
        if(this.senha == senha){
            return true;
        }
        return false;
    }

    @Override
    public void setSenha(int senha) {
        this.senha = senha;
    }
}
