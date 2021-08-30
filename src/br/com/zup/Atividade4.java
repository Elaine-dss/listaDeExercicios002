package br.com.zup;

import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o salário do colaborador: R$");
        double salarioInicial = leitor.nextDouble();

        String porcentagemDoReajuste;
        double reajuste;

        if(salarioInicial > 0){

            if(salarioInicial <= 280){
                porcentagemDoReajuste = "20%";
                reajuste = 0.2 * salarioInicial;
            }
            else if(salarioInicial <= 700){
                porcentagemDoReajuste = "15%";
                reajuste = 0.15 * salarioInicial;
            }
            else if(salarioInicial <= 1500){
                porcentagemDoReajuste = "10%";
                reajuste = 0.1 * salarioInicial;
            }
            else{
                porcentagemDoReajuste = "5%";
                reajuste = 0.05 * salarioInicial;
            }

            double salarioReajustado = salarioInicial + reajuste;

            System.out.println("O salário inicial deste colaborador era de R$" + salarioInicial);
            System.out.println("O reajuste aplicado com base nesse salário foi de " + porcentagemDoReajuste);
            System.out.println("O valor desse reajuste foi de R$" + reajuste);
            System.out.println("O novo salário deste colaborador será de R$" +salarioReajustado);
        }
        else{
            System.out.println("Digite um valor acima de R$0,00");
        }
    }
}
