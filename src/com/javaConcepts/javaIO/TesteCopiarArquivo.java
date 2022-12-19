package com.javaConcepts.javaIO;

import java.io.*;

/**
 * Created by Lucas Anderson Ladislau Aguiar on 29/08/2022.
 */
public class TesteCopiarArquivo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("lorem.txt"); //System.in
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader bis = new BufferedReader(isr);

        FileOutputStream fos = new FileOutputStream("lorem2.txt"); //System.out
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        String line = bis.readLine();
        while (line != null && line.isEmpty()){
            bw.write(line);
            bw.newLine();
            //bw.flush(); //faz a impressão automaticamente no console
            line = bis.readLine();
        }

        bis.close();
        bw.close();
    }
}
