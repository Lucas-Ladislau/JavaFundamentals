package com.javaConcepts.collections.APIStreamAndData;

import java.time.*;
import java.time.format.DateTimeFormatter;

/**
 * Created by Lucas Anderson Ladislau Aguiar on 24/08/2022.
 */
public class Data {
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);

        LocalDate olimpiadasRio = LocalDate.of(2024, Month.JUNE, 5);

        int anos = olimpiadasRio.getYear() - hoje.getYear();
        System.out.println(anos);

        Period periodo = Period.between(olimpiadasRio,hoje);


        LocalDate proximasOlimpiadas = olimpiadasRio.plusYears(4);
        System.out.println(proximasOlimpiadas);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String valorFormatado = proximasOlimpiadas.format(formatter);
        System.out.println(valorFormatado);

        DateTimeFormatter formatterHour = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
        LocalDateTime agora = LocalDateTime.now();
        System.out.println(agora.format(formatterHour));

        LocalTime intervalo = LocalTime.of(15,30);
        System.out.println(intervalo);


    }
}
