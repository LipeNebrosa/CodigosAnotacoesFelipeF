package Lista3;

import java.util.Scanner;

public class Questao2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Nome de usuário:");
        String user = scan.next();

        System.out.println("Senha:");
        String senha = scan.next();

        while (senha.equals(user)){              //Strig não pode ser comparado com "=="
            System.out.println("ERRO !");
            System.out.println("Usuário:");
            user = scan.next();
            System.out.println("Senha:");
            senha = scan.next();
        }

        System.out.println("OK");
    }
}
