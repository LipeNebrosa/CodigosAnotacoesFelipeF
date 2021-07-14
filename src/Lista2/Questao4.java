package Lista2;

import java.util.Scanner;

public class Questao4 {

    public static void main(String[] args) {

        Scanner Scan = new Scanner(System.in);
        System.out.println("Informe a letra");
        String letra = Scan.next();

        if ("a".equalsIgnoreCase(letra)) {
            System.out.println("A letra é uma vogal!");
        }
        if ("e".equalsIgnoreCase(letra)) {
            System.out.println("A letra é uma vogal!");
        }
        if ("i".equalsIgnoreCase(letra)) {
            System.out.println("A letra é uma vogal!");
        }
        if ("o".equalsIgnoreCase(letra)) {
            System.out.println("A letra é uma vogal!");
        }
        if ("u".equalsIgnoreCase(letra)) {
            System.out.println("A letra é uma vogal!");
        } else {
            System.out.println("É uma consoante!");
        }


    }
}
