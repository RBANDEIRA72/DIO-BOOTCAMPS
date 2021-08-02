package Desafios;

/*
Desafio
Crie um programa que leia 6 valores. Você poderá receber valores negativos
e/ou positivos como entrada, devendo desconsiderar os valores nulos.
Em seguida, apresente a quantidade de valores positivos digitados.

Entrada
Você receberá seis valores, negativos e/ou positivos.

Saída
Exiba uma mensagem dizendo quantos valores positivos foram lidos assim
como é exibido abaixo no exemplo de saída. Não esqueça da mensagem
"valores positivos" ao final.


Exemplo de Entrada	Exemplo de Saída
7
-5
6
-3.4
4.6
12

4 valores positivos
*/

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