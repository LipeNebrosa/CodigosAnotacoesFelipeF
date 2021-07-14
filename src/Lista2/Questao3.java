package Lista2;

import java.util.Scanner;

public class Questao3 {

        public static void main(String[] args) {


            Scanner Scan = new Scanner(System.in);
            System.out.println("Informe o sexo");
            String sexo = Scan.next();

            if ("f" .equalsIgnoreCase(sexo)){
                System.out.println("É Feminino! ");
            }
            if ("m" .equalsIgnoreCase(sexo)){
                System.out.println("É Masculino!");
            }else{
                System.out.println("Sexo invalido");
            }




        }
}
