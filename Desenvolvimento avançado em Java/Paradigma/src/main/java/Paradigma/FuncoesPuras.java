package Paradigma;

import java.util.function.BiPredicate;

public class FuncoesPuras {

    public static void main (String[] arqs) {
        BiPredicate<Integer,Integer> verificarSeEMaior =
                (parametro, valorComparacao) -> parametro > valorComparacao;

        System.out.println(verificarSeEMaior.test(13,12));
        System.out.println(verificarSeEMaior.test(13,12));

    }

}
