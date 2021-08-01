package Exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExercicioLista {

    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();

        nomes.add("Juliana");
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("Larissa");
        nomes.add("João");

        for (String nomeDoItem: nomes){

            System.out.println(nomeDoItem);

        }

        nomes.set(2,"Roberto");

        System.out.println(nomes);

        String nomePosicaoUm = nomes.get(0);

        System.out.println(nomePosicaoUm);

        nomes.remove(3);

        System.out.println(nomes);

        nomes.remove("João");

        System.out.println(nomes);

        int qtdItemLista = nomes.size();

        System.out.println(qtdItemLista);

        boolean temJuliano = nomes.contains("Juliano");

        System.out.println(temJuliano);

        List<String> novaLista = new ArrayList<>();

        novaLista.add("Ismael");
        novaLista.add("Rodrigo");

        System.out.println(novaLista);

        nomes.addAll(novaLista);

        System.out.println(nomes);

        Collections.sort(nomes);

        System.out.println(nomes);

        boolean listaEstaVazia = nomes.isEmpty();

        System.out.println(listaEstaVazia);

    }

}
