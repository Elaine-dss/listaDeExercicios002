package br.com.zup;

import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        System.out.println("-------------------------");
        System.out.println("|    TABELA DA SEMANA!  |");
        System.out.println("|  1 - Domingo          |");
        System.out.println("|  2 - Segunda-feira    |");
        System.out.println("|  3 - Terça-feira      |");
        System.out.println("|  4 - Quarta-feira     |");
        System.out.println("|  5 - Quinta-feira     |");
        System.out.println("|  6 - Sexta            |");
        System.out.println("|  7 - Sábado           |");
        System.out.println("-------------------------");
        System.out.println();
        System.out.print("Selecione um número correspondente ao dia da semana desejado: ");
        int diaEscolhido = leitor.nextInt();

        if(diaEscolhido == 1){
            System.out.println("Você escolheu domingo!");
        }
        else if(diaEscolhido == 2){
            System.out.println("Você escolheu segunda-feira!");
        }
        else if(diaEscolhido == 3){
            System.out.println("Você escolheu terça-feira!");
        }
        else if(diaEscolhido == 4){
            System.out.println("Você escolheu quarta-feira!");
        }
        else if(diaEscolhido == 5){
            System.out.println("Você escolheu quinta-feira!");
        }
        else if(diaEscolhido == 6){
            System.out.println("Você escolheu sexta-feira!");
        }
        else if(diaEscolhido == 7){
            System.out.println("Você escolheu sábado!");
        }
        else{
            System.out.println("VALOR INVÁLIDO!");
        }
    }
}
