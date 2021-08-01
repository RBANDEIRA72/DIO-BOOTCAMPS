package Exercicios;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExercicioSet {

    public static void main(String[] args) {

        Set<Integer> numeros = new HashSet<>();

        // Adiciona 5 numeros inteiros
        numeros.add(3);
        numeros.add(88);
        numeros.add(20);
        numeros.add(44);
        numeros.add(3);

        System.out.println(numeros);

        // Navega em todos os itens do iterarator
        Iterator<Integer> iterator = numeros.iterator();

                while(iterator.hasNext()) {
                    System.out.println(iterator.next());
                }

                numeros.remove(3 );

        System.out.println(numeros);

        numeros.add(23);

        System.out.println(numeros);

        System.out.println(numeros.isEmpty());
    }
}
