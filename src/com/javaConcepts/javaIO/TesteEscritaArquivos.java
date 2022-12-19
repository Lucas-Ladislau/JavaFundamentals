package com.javaConcepts.javaIO;

import java.io.*;

/**
 * Created by Lucas Anderson Ladislau Aguiar on 29/08/2022.
 */
public class TesteEscritaArquivos {

    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("lorem2.txt");
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        bw.write("Testando escrita de arquivos com OutputStream e write");
        bw.newLine();

        bw.close();
    }
}
