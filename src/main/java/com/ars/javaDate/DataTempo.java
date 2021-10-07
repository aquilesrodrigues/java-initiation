package com.ars.javaDate;

import java.time.LocalDate;
import java.time.LocalTime;

public class DataTempo {
    public static void main(String[] args){
        LocalDate dataHoje = LocalDate.now();
        //formato americano yyyy-MM-dd
        System.out.println(dataHoje);

        //Subtrai 1 dia de dataHoje
        LocalDate dataOntem = dataHoje.minusDays(1);
        System.out.println(dataOntem);

        // LocalTime é uma classe imutável no padrão de hora:minuto:nanosegundos
        // 13:02:19.113123800
        LocalTime horaHoje = LocalTime.now();
        System.out.println(horaHoje);

        // Método que adiciona horas
        // 14:02:19.113123800
        LocalTime horaHojeMaisH = horaHoje.plusHours(1);
        System.out.println(horaHojeMaisH);

        // Método que subtrai horas
        // 11:02:19.113123800
        LocalTime horaHojeMenosH = horaHoje.minusHours(2);
        System.out.println(horaHojeMenosH);

    }
}
