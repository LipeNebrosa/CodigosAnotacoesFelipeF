package Lista2;

import java.util.Scanner;

public class Questao8 {

    public static void main(String[] args) {


        Scanner Scan1 = new Scanner(System.in);

        System.out.println("Qual o preço do 1º produto ? ");
        double prod1 = Scan1.nextDouble();

        System.out.println("Qual o preço do 2º produto ? ");
        double prod2 = Scan1.nextDouble();

        System.out.println("Qual o preço do 3º produto ? ");
        double prod3 = Scan1.nextDouble();


        if ((prod1 < prod2) & (prod1 < prod3)){
            System.out.println("Você deve comprar o 1º produto que custa R$" + prod1);
        }
        if ((prod2 < prod1) & (prod2 < prod3)){
            System.out.println("Você deve comprar o 2º produto que custa R$" + prod2);
        }
        if ((prod3 < prod2) & (prod3 < prod1)){
            System.out.println("Você deve comprar o 3º produto que custa R$" + prod1);
        }
    }
}
