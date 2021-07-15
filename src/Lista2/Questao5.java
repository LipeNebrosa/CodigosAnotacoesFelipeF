package Lista2;

import java.util.Scanner;

public class Questao5 {

    public static void main(String[] args) {

        System.out.println("Quer saber se foi aprovado ?");

        Scanner Scan1 = new Scanner(System.in);
        System.out.println("Digite uma das notas:");
        double nota1 = Scan1.nextDouble();

        Scanner Scan2 = new Scanner(System.in);
        System.out.println("Digite a outra nota:");
        double nota2 = Scan2.nextDouble();

        double media = (nota1 + nota2) / 2;
        System.out.println("Sua media é : " + media);

        if (media == 10) {
            System.out.println("APROVADO COM DISTINÇÃO !!!!!!");
        } else {
            if (media >= 7) {
                System.out.println("Aprovado !!!");
            } else {
                System.out.println("Reprovado :(");
            }
        }

    }
}
