package com.ars.javaDate;

import java.time.LocalDate;

public class DataTempo {
    public static void main(String[] args){
        LocalDate dataHoje = LocalDate.now();
        //formato americano yyyy-MM-dd
        System.out.println(dataHoje);
    }
}
