public class Carros {

    public Carros(Integer qtdPessoas) {
        this.qtdPessoas = qtdPessoas;

    }
    public Integer qtdPessoas;

    public String getQtdPessoas() {return "Quantidade de pessoas que cabem no carro: " + qtdPessoas; }

    public String adicionarPessoas() { return "Adicionando uma pessoa... " + (++qtdPessoas); }

    public String removerPessoas() { return "Excluindo 2 pessoas... " + (qtdPessoas - 2); }
}

