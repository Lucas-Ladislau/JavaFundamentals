package com.alura.javaConcepts.oopBytebank;

/**
 * Created by Lucas Anderson Ladislau Aguiar on 08/08/2022.
 */
public abstract interface Autenticavel {

    public abstract boolean autentica(int senha);

    public abstract void setSenha(int senha);
}
