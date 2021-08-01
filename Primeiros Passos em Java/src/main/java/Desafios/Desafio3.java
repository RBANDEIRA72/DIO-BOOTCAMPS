package Desafios;

import java.util.Locale;
import java.util.Scanner;

public class Desafio3 {

    public static void main(String[] args) {

        int qtdValores = 1;
        int qtdValoresPares = 0;

        Locale.setDefault(Locale.US);

        Scanner leitor = new Scanner(System.in);

                while( qtdValores <= 6) {

                    Double valor = leitor.nextDouble();
                    if ( valor > 0) {
                        qtdValoresPares++;
                    }
                    qtdValores++;

                }
        leitor.close();
        System.out.println(qtdValoresPares + " valores positivos");

    }
}