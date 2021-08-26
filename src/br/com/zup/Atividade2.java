package br.com.zup;

import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe o valor do primeiro produto: R$");
        double produto1 = leitor.nextDouble();
        System.out.print("Informe o valor do segundo produto: R$");
        double produto2 = leitor.nextDouble();
        System.out.print("Informe o valor do terceiro produto: R$");
        double produto3 = leitor.nextDouble();

        if(produto1 > 0 & produto2 > 0 & produto3 > 0){
            if(produto1 < produto2 & produto1 < produto3){
                System.out.println("O primeiro produto é o mais barato dentre eles!");
            }
            else if(produto2 < produto1 & produto2 < produto3){
                System.out.println("O segundo produto é o mais barato dentre eles!");
            }
            else if(produto3 < produto1 & produto3 < produto2){
                System.out.println("O terceiro produto é o mais barato dentre eles!");
            }
            else {
                System.out.println("Todos os produtos informados possuem o mesmo valor!");
            }
        }
        else{
            System.out.println("Certifique-se que todos os produtos tenham um valor maior que R$0,00");
        }
    }
}
