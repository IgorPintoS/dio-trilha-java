package com.igor.curso;

public class EstruturasDeRepeticaoForArray {
    public static void main(String[] args) {
        String alunos [] = {"Felipe", "Jonas", "Julia", "Igor"};
        System.out.println(alunos.length);
        for (int x = 0; x < alunos.length; x++){
            System.out.println("O aluno do indice " + x + " é " + alunos[x]);
        }

    }
}
