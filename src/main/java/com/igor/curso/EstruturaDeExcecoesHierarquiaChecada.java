package com.igor.curso;

import java.text.NumberFormat;
import java.text.ParseException;

public class EstruturaDeExcecoesHierarquiaChecada {
    public static void main(String[] args) {
        Number valor;
        try {
            valor = NumberFormat.getInstance().parse("a1.75");
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        System.out.println(valor);
    }
}
