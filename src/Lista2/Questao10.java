package Lista2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Questao10 {

    public static void main(String[] args) {

        System.out.println("Ola! ");
        System.out.println("Qual o seu turno de estudo ?");


        Scanner Scan1 = new Scanner(System.in);
        System.out.println("Digite 'M' para Matutino, 'V' para Vespertino 'N' para Noturno. ");
        String turno = Scan1.next();

        switch (turno){

            case "M":
            case "m":
                System.out.println("Bom dia !");
                break;
            case "V":
            case "v":
                System.out.println("Boa tarde !");
                break;
            case "N":
            case "n":
                System.out.println("Boa noite !");
                break;
            default:
                System.out.println("Valor inválido !");
                break;

        }

    }
}
