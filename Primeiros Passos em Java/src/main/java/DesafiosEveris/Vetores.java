package DesafiosEveris;

import java.io.IOException;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Vetores{

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);
        Double X = leitor.nextDouble();

        BigDecimal[] N = new BigDecimal[100];
        N[0] = new BigDecimal(X);

        for (int i = 1; i < 100; ++i) {
            N[i] = N[i - 1].divide(new BigDecimal(2));

        }
        leitor.close();
        DecimalFormat decFormat = new DecimalFormat("0.0000");

        for (int i = 0; i < 100 ; ++    i) {

            System.out.println(String.format("N[" + i + "] = " + decFormat.format(N[i])));
        }

    }
}