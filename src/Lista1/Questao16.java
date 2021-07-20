package Lista1;

import java.util.Scanner;

public class Questao16 {
    public static void main(String[] args) {

        Scanner Scan = new Scanner(System.in);

        System.out.println("Quantos metros quadrados você pretende pintar ?");
        double metrosQuad = Scan.nextDouble();

        double litros = metrosQuad / 3;
        int latas;


        if (litros <= 18) {
            latas = 1;
            System.out.println("Você precisará de " + latas + " latas.");
            System.out.println("Total : RS" + latas * 80);

        } else {
            if (litros > 18 && litros < 36) {
                latas = 2;
                System.out.println("Você precisará de " + latas + " latas.");
                System.out.println("Total : RS" + latas * 80);
            } else {
                if (litros > 36 && litros < 54) {
                    latas = 3;
                    System.out.println("Você precisará de " + latas + " latas.");
                    System.out.println("Total : RS" + latas * 80);

                } else {
                    if (litros > 54 && litros < 72) {
                        latas = 4;
                        System.out.println("Você precisará de " + latas + " latas.");
                        System.out.println("Total : RS" + latas * 80);

                    } else {
                        if (litros > 72 && litros < 90) {
                            latas = 5;
                            System.out.println("Você precisará de " + latas + " latas.");
                            System.out.println("Total : RS" + latas * 80);

                        } else {
                            if (litros > 90 && litros < 108) {
                                latas = 6;
                                System.out.println("Você precisará de " + latas + " latas.");
                                System.out.println("Total : RS" + latas * 80);

                            } else {
                                if (litros > 108 && litros < 126) {
                                    latas = 7;
                                    System.out.println("Você precisará de " + latas + " latas.");
                                    System.out.println("Total : RS" + latas * 80);

                                } else {
                                    if (litros > 126 && litros < 144) {
                                        latas = 8;
                                        System.out.println("Você precisará de " + latas + " latas.");
                                        System.out.println("Total : RS" + latas * 80);

                                    } else {
                                        if (litros > 144 && litros < 162) {
                                            latas = 9;
                                            System.out.println("Você precisará de " + latas + " latas.");
                                            System.out.println("Total : RS" + latas * 80);

                                        } else {
                                            if (litros > 162 && litros < 180) {
                                                latas = 10;
                                                System.out.println("Você precisará de " + latas + " latas.");
                                                System.out.println("Total : RS" + latas * 80);

                                            }


                                        }


                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}