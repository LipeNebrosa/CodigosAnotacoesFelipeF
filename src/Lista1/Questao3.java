package Lista1;

import java.util.Scanner;

public class Questao3 {

    public static void main(String[] args) {

        Scanner Scan = new Scanner(System.in);
        System.out.println("Digite um numero : ");

        double num1 = Scan.nextDouble();
        System.out.println(" + ");

        double num2 = Scan.nextDouble();
        System.out.println(" = " + (num1 + num2));
    }
}
