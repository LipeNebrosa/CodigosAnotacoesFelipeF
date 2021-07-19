package Lista1;

import java.util.Scanner;

public class Questao13 {
    public static void main(String[] args) {

        Scanner Scan = new Scanner(System.in);
        System.out.println("Qual sua altura em metros?");
        double alt = Scan.nextDouble();

        System.out.println("Caso seja homem, seu peso ideal seria  : " + ((72.7 * alt) - 58) + " Kg");
        System.out.println("Caso seja mulher, seu peso ideal seria  : " + ((62.1 * alt) - 44.7) + " Kg");


    }
}
