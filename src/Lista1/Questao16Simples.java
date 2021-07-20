package Lista1;

import java.util.Scanner;

public class Questao16Simples {
    public static void main(String[] args) {

        Scanner Scan = new Scanner(System.in);

        System.out.println("Quantos metros quadrados você pretende pintar ?");
        double metrosQuad = Scan.nextDouble();

        double litros = metrosQuad / 3;
        double latas = litros / 18;

        int latasC = (int) Math.round(latas);

        System.out.println("Você precisará de " + latasC + " latas.");
        System.out.println("Total: R$" + (latasC * 80));

    }
}
