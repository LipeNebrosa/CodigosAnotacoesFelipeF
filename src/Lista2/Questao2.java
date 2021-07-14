package Lista2;

import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {

        Scanner Scan = new Scanner(System.in);
        System.out.println("Informe o valor");
        int valor1 = Scan.nextInt();
        if (valor1 > 0) {
            System.out.println("O Valor é positivo!");
        } else {
            System.out.println("O valor é negativo!");
        }
    }
}
