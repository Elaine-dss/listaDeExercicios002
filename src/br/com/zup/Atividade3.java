package br.com.zup;

import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nomeDoAluno = leitor.nextLine();
        System.out.print("Digite a primeira nota: ");
        float nota1 = leitor.nextFloat();
        System.out.print("Digite a segunda nota: ");
        float nota2 = leitor.nextFloat();

        float media = (nota1 + nota2) / 2;

        if(media >= 0 & media < 7){
            System.out.println(nomeDoAluno + " obteve média " + media + " nesse bimestre e foi REPROVADO(A)!");
        }
        else if(media >= 7 & media < 10){
            System.out.println(nomeDoAluno + " obteve média " + media + " nesse bimestre e foi APROVADO(A)!");
        }
        else if(media == 10){
            System.out.println(nomeDoAluno + " obteve média " + media + " nesse bimestre e foi APROVADO(A) COM DISTINÇÃO!");
        }
        else{
            System.out.println("NOTA INVÁLIDA!");
        }
    }
}
