package Lista1;

import java.util.Scanner;

public class Questao14 {
    public static void main(String[] args) {

        Scanner Scan = new Scanner(System.in);
        System.out.println("Quantos Kg você pescou hoje ?");
        double peso = Scan.nextDouble();

        double exces ;
        double multa ;

        if (peso > 50){

            exces = peso - 50;
            System.out.println("Peso excedente: " + exces + " Kg");

            multa = exces * 4;
            System.out.println("A multa sera de: R$" + multa);
        } else{
            System.out.println("Tudo certo, bom dia :)");
        }

    }
}