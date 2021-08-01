public class ExercicioCarros {

    public static void main(String[] args) {
        Carros carros = new Carros(9);

        System.out.println(carros.getQtdPessoas());
        // quantidade de pessoas = 5

        System.out.println(carros.adicionarPessoas());
        // quantidade de pessoas = 6

        System.out.println(carros.removerPessoas());
        // quantidade de pessoas = 5

    }

}
