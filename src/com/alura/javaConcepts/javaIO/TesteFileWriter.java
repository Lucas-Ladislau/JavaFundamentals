package com.alura.javaConcepts.javaIO;

import java.io.*;

/**
 * Created by Lucas Anderson Ladislau Aguiar on 29/08/2022.
 */
public class TesteFileWriter {

    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("lorem3.txt");
        fw.write("Testando escrita de arquivos com FileWriter e write");
        fw.write(System.lineSeparator()); //recurso próprio java para quebra de linha, independente do SO
        fw.write(System.lineSeparator());
        fw.close();


        //Outra forma de se escrever, mas com o bufferedWriter
        BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));
        bw.write("Testando escrita de arquivos com BufferedWriter e FileWriter e write");
        bw.newLine();
        bw.newLine();
        bw.close();

        //Utilizando o printWriter
        PrintWriter pw = new PrintWriter("lorem4.txt");
        pw.println("Testando escrita de arquivos com PrintWriter e write");
        pw.println();
        pw.println();
        pw.println("fim");
        pw.close();
    }
}
