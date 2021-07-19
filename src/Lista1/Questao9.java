package Lista1;

import java.util.Scanner;

public class Questao9 {
    public static void main(String[] args) {

        Scanner Scan = new Scanner(System.in);
        System.out.println("Qual a temperatura em Fahrenheit");
        float temp = Scan.nextFloat();

        System.out.println("Esta temperatura em Celsius é : " + (temp - 32) / 1.8);
    }
}
