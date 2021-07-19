package Lista1;

import java.util.Scanner;

public class Questao11 {
    public static void main(String[] args) {

        Scanner Scan = new Scanner(System.in);
        System.out.println("Digite o 1º numero inteiro: ");
        int num1 = Scan.nextInt();

        System.out.println("Digite o 2º numero inteiro: ");
        int num2 = Scan.nextInt();

        System.out.println("Digite o 3º numero inteiro: ");
        double num3 = Scan.nextDouble();

        System.out.println("Dobro do primeiro X metade do segundo é = " + ((num1* 2)*(num2/2)));

        System.out.println("Triplo do primeiro + o terceiro = " + ((num1 *3) + num3));

        System.out.println("Terceiro numero ao cubo = " + (num3 * num3 * num3));

    }
}
