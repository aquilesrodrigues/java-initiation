package com.ars.javaDate;

import java.util.Calendar;

public class Calendario {

    public static void main(String[] args) {

        Calendar dataAtual = Calendar.getInstance();
        System.out.println("A data atual é:: "+ dataAtual.getTime());

        dataAtual.add(Calendar.DATE, -15);
        System.out.println("A 15 dias atrás era: " + dataAtual.getTime());

        dataAtual.add(Calendar.MONTH,  4);
        System.out.println("Daqui a 4 meses será: " + dataAtual.getTime());

        dataAtual.add(Calendar.YEAR,  2);
        System.out.println("Daqui a 2 anos será: " + dataAtual.getTime());
    }
}
