package unama.com;

import java.util.Scanner;

public class EX3LeC {
    public static void main(String[] args) {
        Scanner W = new Scanner(System.in);
        System.out.println("Informe o Capital: ");
        Double capital = W.nextDouble();
        System.out.println("Informe os juros: ");
        Double juros = W.nextDouble();
        System.out.println("Informe o Periodo do Contrato: ");
        Double periodo = W.nextDouble();

        juros = juros/100;
        for (int i=1; i <=periodo; i++) {
            capital = capital + (capital*juros);
            System.out.println(i+"º " + "mes: "+ capital);
        }
    }
}
