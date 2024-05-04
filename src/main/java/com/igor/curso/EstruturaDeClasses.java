package com.igor.curso;

public class EstruturaDeClasses {
    public static void main (String [] args){
        String primeiroNome = "Igor";
        String segundoNome = "Pinto Santos";
        String nomeCompleto = nomeCompleto(primeiroNome,segundoNome);
        System.out.println(nomeCompleto);
    }
    public static String nomeCompleto(String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
