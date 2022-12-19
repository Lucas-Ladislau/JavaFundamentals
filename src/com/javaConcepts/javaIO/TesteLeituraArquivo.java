package com.javaConcepts.javaIO;

import java.io.*;

/**
 * Created by Lucas Anderson Ladislau Aguiar on 29/08/2022.
 */
public class TesteLeituraArquivo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("lorem.txt");
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader bis = new BufferedReader(isr);

        String line = bis.readLine();
        while (line != null){
            System.out.println(line);
            line = bis.readLine();
        }

        bis.close();

    }
}
