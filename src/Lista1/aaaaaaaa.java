package Lista1;

import java.util.Scanner;

public class aaaaaaaa {

    public static void main(String[] args) {

        Scanner Scan = new Scanner(System.in);
        System.out.println("A quanto tempo você trabalha na empresa ?");
        int anos = Scan.nextInt();

        System.out.println("Quanto você ganha?");
        double salario = Scan.nextDouble();


        if (anos >= 5 ) {
            System.out.println("Seu aumento será de: R$" + (salario * 0.15));
            System.out.println("Seu salário será de: R$" + (salario + (salario* 0.15)));
        }else {
            System.out.println("Vai trabalhar mais!");
        }
    }
}
