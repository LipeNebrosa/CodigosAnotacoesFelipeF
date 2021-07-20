package Lista1;

import java.util.Scanner;

public class Questao17 {
    public static void main(String[] args) {

        Scanner Scan = new Scanner(System.in);

        System.out.println("Quantos metros quadrados você pretende pintar ?");
        double metrosQuad = Scan.nextDouble();

        double litros = (metrosQuad / 6);
        double latas18 = litros / 18;
        double latas3 = litros / 3.6;

        int latasA18 = (int) Math.ceil(latas18);
        int latasA3 = (int) Math.ceil(latas3);

        int valor18 = latasA18 * 80;
        int valor3 = latasA3 * 25;

        System.out.println("Usando latas de 18 litros, você precisará de " + latasA18 + " latas.");
        System.out.println("Valor total: R$" + valor18);
        System.out.println("");
        System.out.println("Usando latas de 3,6 litros, você precisará de " + latasA3 + " latas.");
        System.out.println("Valor total: R$" + valor3);

        ///////////////////////////////////////////////////////////////////////////////////////////////////////


        // quantos galões: aproximação de: litros / 18
        //quantas latas : aproximação de  litros - quantos galões * 18

        // aproximação do litros -


    }
}
