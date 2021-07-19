package Lista1;

import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {


        Scanner Scan = new Scanner(System.in);
        System.out.println("Qual a temperatura em graus  Celsius?");
        float temp = Scan.nextFloat();

        System.out.println("Esta temperatura em Fº é : " + (temp * 1.8) + 32);

    }
}
