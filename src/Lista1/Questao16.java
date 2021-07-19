package Lista1;

import java.util.Scanner;

public class Questao16 {
    public static void main(String[] args) {

        Scanner Scan = new Scanner(System.in);

        System.out.println("Quantos metro quadrados você pretende pintar ?");
        double metrosQuad = Scan.nextDouble();

        double litros = metrosQuad / 3;
        double latas;

        if (litros > 18){
            latas = litros / 18;
            System.out.println("Você precisará de " + latas + "latas." );

        }else {
            System.out.println("Você precisará de 1 lata");
            System.out.println("Total : RS80,00");
        }

        //1 litro pinta 3 metros quadrados

        //1 lata = 18 litros

        //1 lata R$80,00
    }
}
