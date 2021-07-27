package Lista3;

import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Insira uma nota: (0 - 10)");
        int nota = scan.nextInt();


        while (nota < 0 || nota > 10 ){
            System.out.println(" Nota invalida, repita:");
            nota = scan.nextInt();
        }


        System.out.println(" Obrigado pela avaliação!");








    }
}
