package com.javaConcepts.javaIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

/**
 * Created by Lucas Anderson Ladislau Aguiar on 30/08/2022.
 */
public class TesteScanner {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("contas.csv"));
        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            System.out.println(line);

            //Funciona como se fosse um regex para separar os dados entre virgulas
            Scanner separatorScanner = new Scanner(line);

            //useLocale é para definir o pattern do double, como sendo ".", caso contrário
            //seria lançada uma exception InputMismatchException
            separatorScanner.useLocale(Locale.US);
            separatorScanner.useDelimiter(",");

            String tipoConta = separatorScanner.next();
            int agencia = separatorScanner.nextInt();
            int numConte = separatorScanner.nextInt();
            String nome = separatorScanner.next();
            double saldo = separatorScanner.nextDouble();

            String format = String.format("%s %s-%s, %s -> %s", tipoConta, agencia, numConte, nome, saldo);
            System.out.println(format+"\n");
            separatorScanner.close();
        }
        scanner.close();

    }
}
