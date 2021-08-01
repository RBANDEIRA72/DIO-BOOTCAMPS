package Desafios;

import java.io.IOException;
import java.util.Scanner;


public class Desafio2 {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int x = leitor.nextInt();
        int cont = 0;

//continue a solucao de acordo com o solicitado no enunciado

        while (cont <  6) {
            if (  x % 2 != 0) {
                System.out.println(x);
                ++cont;
            }
            x++;
        }
    }

}
