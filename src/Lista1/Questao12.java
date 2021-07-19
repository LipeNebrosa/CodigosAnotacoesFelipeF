package Lista1;

import java.util.Scanner;

public class Questao12 {
    public static void main(String[] args) {

        Scanner Scan = new Scanner(System.in);
        System.out.println("Qual sua altura em metros?");
        double alt = Scan.nextDouble();

        System.out.println("Seu peso ideal deve ser : " + ((72.7 * alt) - 58) + "Kg");

    }
}
