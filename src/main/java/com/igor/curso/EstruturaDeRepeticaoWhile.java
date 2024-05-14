package com.igor.curso;

import java.util.concurrent.ThreadLocalRandom;

public class EstruturaDeRepeticaoWhile {
    public static void main(String[] args) {
        double mesada = 50.00;
        while (mesada > 0) {
            double valorDoce = valorAleatorio();
            if (valorDoce > mesada)
                valorDoce = mesada;

            System.out.println("Doce no valor de: " + valorDoce + " Adicionado no carrinho.");
            mesada = mesada - valorDoce;
        }
        System.out.println("Mesada: " + mesada);
        System.out.println("Toda mesada gasta.");
    }
    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}
