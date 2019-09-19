package unama.com;

import java.util.Scanner;

public class EX3LeA {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Informe a Quantidades de Notas: ");
        Double Aval = a.nextDouble();
        double media = 0;
        for (int i=1; i<=Aval; i++) {
            System.out.println("Informe a nota: " + i);
            Double nota = a.nextDouble();
            media = media + nota;
        }
        media = media / Aval;
        System.out.println("Media final e de: " + media);
    }
}
