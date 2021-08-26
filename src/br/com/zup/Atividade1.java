package br.com.zup;

import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero1 = leitor.nextInt();
        System.out.print("Digite outro número: ");
        int numero2 = leitor.nextInt();

        if (numero1 > numero2){
            System.out.println("O número " + numero1 + " é o maior dentre eles");
        }
        else {
            System.out.println("O número " + numero2 + " é o maior dentre eles");
        }
    }
}
