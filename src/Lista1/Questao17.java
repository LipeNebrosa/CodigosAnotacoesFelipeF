package Lista1;

import java.util.Scanner;

public class Questao17 {
    public static void main(String[] args) {

        Scanner Scan = new Scanner(System.in);

        System.out.println("Quantos metros quadrados você pretende pintar ?");
        double m2 = Scan.nextDouble();

        double litros = (m2 / 6);
        double galoes18 = litros / 18;
        double latas3 = litros / 3.6;

        int galoesA18 = (int) Math.ceil(galoes18);
        int latasA3 = (int) Math.ceil(latas3);

        int valor18 = galoesA18 * 80;
        int valor3 = latasA3 * 25;

        System.out.println("Usando latas de 18 litros, você precisará de " + galoesA18 + " latas.");
        System.out.println("Valor total: R$" + valor18);
        System.out.println("");
        System.out.println("Usando latas de 3,6 litros, você precisará de " + latasA3 + " latas.");
        System.out.println("Valor total: R$" + valor3);
        System.out.println("");
        ///////////////////////////////////////////////////////////////////////////////////////////////////////

        double litrosPconta = litros * 1.1;

        double galoes18Pconta = litrosPconta / 18;

        int qtGaloes18Arrendodado = (int) Math.floor(galoes18Pconta);   // Quantidade de galões

        double litrosPLatas3 = litrosPconta - (qtGaloes18Arrendodado * 18);

        double qtLatas3 = (litrosPLatas3 / 3.6);

        int qtLatas3Arrendondado = (int) Math.ceil(qtLatas3);           // Quantidade de latas

        System.out.println("Você precisará de "+ qtGaloes18Arrendodado + " Galões de 18 litros, e " + qtLatas3Arrendondado+
                " Latas de 3,6 Litros");

        System.out.println("Valor total: R$" + ((qtGaloes18Arrendodado * 80) + (qtLatas3Arrendondado * 25)));


    }
}
