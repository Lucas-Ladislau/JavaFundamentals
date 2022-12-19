package com.javaConcepts.oopBytebank;

/**
 * Created by Lucas Anderson Ladislau Aguiar on 09/08/2022.
 */
public class AutenticacaoUtil {

    private int senha;


    public boolean autentica(int senha) {
        if(this.senha == senha){
            return true;
        }
        return false;
    }


    public void setSenha(int senha) {
        this.senha = senha;
    }
}
