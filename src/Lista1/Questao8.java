package Lista1;

import java.util.Scanner;

public class Questao8 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Quanto você ganha por hora?");
        float hora = scan.nextFloat();

        Scanner Scan = new Scanner(System.in);
        System.out.println("Quantas horas você trabalha por mês?");
        float sal = scan.nextFloat();

        System.out.println(hora * sal);

    }
}
