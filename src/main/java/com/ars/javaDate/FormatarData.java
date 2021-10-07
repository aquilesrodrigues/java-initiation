package com.ars.javaDate;



import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class FormatarData {
    public static void main(String[] args){
        Date atual = new Date();

        // DateFormat:
        // Padrão de data por extenso
        String dataTexto = DateFormat.getDateInstance().format(atual);
        //
        System.out.println(dataTexto);

        // Extenso LONGO e CURTO:

        //Variável recebe string de data formatada com parâmetros para melhorar a escrita da data
        dataTexto = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.SHORT).format(atual);
        System.out.println(dataTexto);


        //SimpleDateFormat:

        SimpleDateFormat dataFormatoSimples = new SimpleDateFormat("dd/MM/yyyy");

        //Recebe string de data formatada com padrão dia, mês e ano completo
        String dataFormatada = dataFormatoSimples.format(atual);

        System.out.println(dataFormatada);

    }

}
