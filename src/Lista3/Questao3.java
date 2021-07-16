package Lista3;

import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

//        System.out.println("Nome: ");
//        String nome = scan.next();
//
//        while (nome);


        System.out.println("Idade: ");
        int idade = scan.nextInt();
        while (idade < 0 || idade > 150){
            System.out.println("Erro, repita");
            idade = scan.nextInt();
        }

    }
}
