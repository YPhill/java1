package alunos;

import java.util.Scanner;


public class Main {

   
    public static void main(String[] args) {
        Scanner grava = new Scanner(System.in);
        int entrar = 1;
        int idade = 0;
        double media = 0;
        int divisao = 0;
        int soma =0;
        
        while (entrar == 1){
        entrar--;
        System.out.println("Digite a idade do aluno:");
        idade = grava.nextInt();
        soma = soma + idade;
        divisao++;
        System.out.println("1 - digitar nova idade: \n2 - sair:");
        entrar = grava.nextInt();
    }
        media = soma / divisao;
        System.out.println("A média de idade é: "+ media);
        
    }
}
