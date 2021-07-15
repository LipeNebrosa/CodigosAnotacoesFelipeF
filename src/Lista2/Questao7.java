package Lista2;

import java.util.Scanner;

public class Questao7 {

    public static void main(String[] args) {

        Scanner Scan1 = new Scanner(System.in);

        System.out.println("1º numero: ");
        double num1 = Scan1.nextDouble();

        System.out.println("2º numero: ");
        double num2 = Scan1.nextDouble();

        System.out.println("3º numero: ");
        double num3 = Scan1.nextDouble();



        if ((num1 > num2) & (num1 > num3)){
            System.out.println(num1 + " é o maior.");
        }
        if ((num2 > num1) & (num2 > num3)){
            System.out.println(num2 + " é o maior.");
        }
        if ((num3 > num2) & (num3 > num1)){
            System.out.println(num3 + " é o maior.");
        }

        if ((num1 < num2) & (num1 < num3)){
            System.out.println(num1 + " é o menor.");
        }
        if ((num2 < num1) & (num2 < num3)){
            System.out.println(num2 + " é o menor.");
        }
        if ((num3 < num2) & (num3 < num1)){
            System.out.println(num3 + " é o menor.");
        }
    }
}
