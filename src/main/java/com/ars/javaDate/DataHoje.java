package com.ars.javaDate;


import java.util.Date;

public class DataHoje {
    public static void main(String[] args) {
        Date atualData = new Date();
        System.out.println(atualData);

        Long tempoAtualSegundos = System.currentTimeMillis();
        System.out.println(tempoAtualSegundos);
        Date novaData = new Date(tempoAtualSegundos);
        System.out.println(novaData);
    }
}
