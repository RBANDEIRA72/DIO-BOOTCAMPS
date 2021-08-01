package Exercicio2;

public class CarrosCompleto {

    public CarrosCompleto(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    //(String modelo) {this.modelo = modelo;}
    //public CarrosCompleto(String ano) {this.modelo = ano;}
    //public CarrosCompleto(String variante) {this.modelo = variante;}


    public String marca;  //, modelo, ano, variante;
    public String modelo;

    public String getMarca() {
        return marca;

        //public String modelo;  //, modelo, ano, variante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setMarca(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
}



