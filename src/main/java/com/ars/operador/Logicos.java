package com.ars.operador;

public class Logicos {
    public static void main(String[] args) {
        final var numero = 6; //não permite que o valor da variável seja alterado após a primeira atribuição.
        final var letra = "B";
        System.out.println("Valores atribuídas as variáveis:");
        System.out.println("Número = "+numero+"%s e letra = "+letra);

        System.out.println("\n* Sort Circuit ══> if (numero &&  letra) ══> Se número e Letra forem verdadeiros\n═══════════════════════════════════════════");
        if (verifica(numero) && verifica(letra)) {
            System.out.println("As duas condições foram testadas e ambas são verdadeiras\n");
        } else {
            System.out.println("A primeira condição não é verdadeira, então a segunda não foi testada!\n");
        }
        System.out.println("\n* Non Sort Circuit ══> if (numero &  letra) ══> Se número e Letra forem verdadeiros\n═══════════════════════════════════════════");
        if (verifica(numero) & verifica(letra)) {
            System.out.println("As duas condições foram testadas e ambas são verdadeiras");
        } else {
            System.out.println("A primeira condição não é verdadeira, Independente disto a segunda foi verificada ");
        }
        /*
         * Lógico OU
         */

        System.out.println("\n************************************************************************************");
        System.out.println("\n* Sort Circuit ══> if (numero ||  letra) ══> Se número ou Letra for verdadeiro\n═══════════════════════════════════════════");
        if (verifica(numero) || verifica(letra)) {
            System.out.println("Opa!!! Validou! foi a 1ª ou a  2ª ?\n Vamos verificar!");
            if (verifica(numero)) {
                System.out.println("A 1ª condição é verdadeira, então a segunda que é String não foi testadaª\n");
            } else {
                System.out.println("A primeira condição não é verdadeira, por isso a segunda foi testada e é verdadeira!\n");
            }
        } else {
            System.out.println("As duas condições não são verdadeiras. Com o uso do operador lógico '||' Se  o 1º método é falso, o 2º também será verificado!\n");
        }
        System.out.println("\n* Non Sort Circuit ══> if (numero |  letra) ══> Se número ou Letra for verdadeiro \n═══════════════════════════════════════════");
        if (verifica(numero) | verifica(letra)) {
            System.out.println("Opa!!! Validou! Como não é Sort Circuit ambas sempre são validadas!\n Vamos verificar!");
            if (verifica(numero)) {
                System.out.println("A 1ª condição é verdadeira, mesmo assim a segunda que é String foi testadaª\n");
            } else {
                System.out.println("A primeira condição não é verdadeira, mas, ele sempre irá verificar as duas e a 2ª é verdadeira!\n");
            }
        } else {
            System.out.println("As duas condições não são verdadeiras. Lembrando que o uso do operador lógico '|' sempre as duas serão verificadas ");
        }
    }

    private static boolean verifica(String letra) {
        System.out.println("Método Verificando se letra é equals 'A'...");
        return letra.equals("A");
    }

    private static boolean verifica(Integer numero) {
        System.out.println("Método verificando se o número é menor que 5 ...");
        return numero < 5;
    }

}
