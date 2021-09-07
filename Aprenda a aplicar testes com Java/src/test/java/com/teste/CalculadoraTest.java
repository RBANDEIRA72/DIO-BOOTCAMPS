package com.teste;

import static org.junit.Assert.*;

public class CalculadoraTest {

    @org.junit.Test
    public void testesomar() {

        Calculadora calculadora = new Calculadora();

        int soma = calculadora.somar("1+1+3");
        assertEquals(5, soma);

    }
}