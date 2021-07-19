package Lista1;

import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {


        Scanner Scan = new Scanner(System.in);
        System.out.println("Quantos metros ?");
        double metros = Scan.nextDouble();
        System.out.println("Essa medida em centimetros é : " + (metros * 100));
    }
}
