package Lista1;

import java.util.Scanner;

public class Questao15 {
    public static void main(String[] args) {

        Scanner Scan = new Scanner(System.in);

        System.out.println("Quanto você ganha por hora ? ");
        double hora = Scan.nextDouble();

        System.out.println("Quantas horas você trabalhou este mês ?");
        double hMes = Scan.nextDouble();

        double salBruto = hora * hMes;
        System.out.println("+ Salário Bruto   : R$" + salBruto);
        System.out.println("- IR (11%)        : R$" + (salBruto * 0.11));
        System.out.println("- INSS (8%)       : R$" + (salBruto * 0.08));
        System.out.println("- Sindicato (5%)  : R$" + (salBruto * 0.05));
        System.out.println("= Salário Liquido : R$" + (salBruto - (salBruto * 0.11) - (salBruto * 0.08)
                - (salBruto * 0.05)));

    }
}
