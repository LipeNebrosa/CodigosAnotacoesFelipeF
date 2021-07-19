package Lista1;

import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {

        Scanner Scan = new Scanner(System.in);
        System.out.println("Qual a nota do 1º bimestre : ");
        double nota1 = Scan.nextDouble();

        System.out.println("Qual a nota do 2º bimestre : ");
        double nota2 = Scan.nextDouble();

        System.out.println("Qual a nota do 3º bimestre : ");
        double nota3 = Scan.nextDouble();

        System.out.println("Qual a nota do 4º bimestre : ");
        double nota4 = Scan.nextDouble();

        System.out.println("Sua media é : " + (nota1 + nota2 + nota3 + nota4) / 4);
    }
}
