package Lista1;

import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Qual a area do circulo?");
        double raio = scan.nextDouble();

        double area = Math.PI * Math.pow(raio, 2);

        System.out.println("A area do circulo é: " + area);
    }
}
