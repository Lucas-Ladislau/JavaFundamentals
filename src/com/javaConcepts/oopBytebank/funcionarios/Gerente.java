package com.javaConcepts.oopBytebank.funcionarios;


import com.javaConcepts.oopBytebank.AutenticacaoUtil;
import com.javaConcepts.oopBytebank.Autenticavel;

/**
 * Created by Lucas Anderson Ladislau Aguiar on 05/08/2022.
 */
public class Gerente extends Funcionario implements Autenticavel {

    private AutenticacaoUtil util;

    public Gerente(){
        this.util = new AutenticacaoUtil();
    }

    @Override
    public boolean autentica(int senha) {
        return this.util.autentica(senha);
    }

    @Override
    public void setSenha(int senha) {
        this.util.setSenha(senha);
    }

    public double getBonificação() {
        return getSalario()*0.1;
    }

}
