package Exercicios;

import java.util.LinkedList;
import java.util.Queue;

public class ExercicioQueue {

    public static void main(String[] args) {

        Queue<String> filaExercicio = new LinkedList<>();

        filaExercicio.add("Juliana");
        filaExercicio.add("Pedro");
        filaExercicio.add("Carlos");
        filaExercicio.add("Larissa");
        filaExercicio.add("João");

        System.out.println(filaExercicio);

        for (String clientes: filaExercicio){
            System.out.println(clientes);
        }

        String primeiroNomeDaLista = filaExercicio.peek();

        System.out.println(primeiroNomeDaLista);

        System.out.println(filaExercicio);

        String primeiroNomeDaListaRemove = filaExercicio.poll();

        System.out.println(primeiroNomeDaListaRemove);

        System.out.println(filaExercicio);

        filaExercicio.add("Daniel");

        System.out.println(filaExercicio);

        int tamanhoLista = filaExercicio.size();

        System.out.println(tamanhoLista);

        boolean filaVazia = filaExercicio.isEmpty();

        System.out.println(filaVazia);

        boolean nomeCarlosEstaNaLista = filaExercicio.contains("Carlos");

        System.out.println(nomeCarlosEstaNaLista);

    }

}
