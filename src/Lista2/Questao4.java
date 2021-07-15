package Lista2;

import java.util.Scanner;

public class Questao4 {

    public static void main(String[] args) {

        Scanner Scan = new Scanner(System.in);
        System.out.println("Informe a letra");
        String letra = Scan.next();

        switch (letra){
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
            case "A":
            case "E":
            case "I":
            case "O":
            case "U":
                System.out.println("A letra é uma vogal!");
                break;
            default:
                System.out.println("A letra é uma consoante!");

        }


    }
}
