package Exemplo3;

public class Exercicio03 {

    public static void main(String[] args) {

        Funcionarios func = new Funcionarios();
        func.setNome("João");
        func.setSalario(100.0);
        System.out.println(func.getNome());
        System.out.println(func.getSalario());

        Gerente gerente = new Gerente();
        gerente.setSalario(100.0);
        System.out.println("Imposto do Gerente: " + gerente.calculaImposto()); //10.0

        Supervisor supervisor = new Supervisor();
        supervisor.setSalario(100.0);
        System.out.println("Imposto do Supervisor: " + supervisor.calculaImposto()); //10.0

        Atendente atendente = new Atendente();
        atendente.setSalario(100.0);
        System.out.println("Imposto do Atendente: " + atendente.calculaImposto()); //10.0


    }



}
