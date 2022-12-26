package com.javaConcepts.collections.dio.map;

import java.util.Objects;

/**
 * Created by Lucas Anderson Ladislau Aguiar on 26/12/2022.
 */
public class Contato {
        private String nome;
        private Integer numero;

        public Contato(String nome, Integer numero) {
            this.nome = nome;
            this.numero = numero;
        }

        public String getNome() {
            return nome;
        }

        public Integer getNumero() {
            return numero;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Contato contato = (Contato) o;
            return Objects.equals(nome, contato.nome) && Objects.equals(numero, contato.numero);
        }

        @Override
        public int hashCode() {
            return Objects.hash(nome, numero);
        }

        @Override
        public String toString() {
            return "Contato{" +
                    "nome='" + nome + '\'' +
                    ", numero='" + numero + '\'' +
                    '}';
        }
}
