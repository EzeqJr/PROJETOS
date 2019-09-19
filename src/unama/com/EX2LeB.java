package unama.com;

import java.util.Scanner;

public class EX2LeB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int TotalProd;
        int TotalDef;
        System.out.println("Informe a Quantidade Produzida: ");
        TotalProd = sc.nextInt();
        System.out.println("Informe a Quantidade com Defeitos: ");
        TotalDef = sc.nextInt();

        Double Manutencao = TotalProd * 0.1;
        if (TotalDef <= Manutencao) {
            System.out.println("A Máquina esta boa, não precisa de manuntenção, fique tranquilo meu amigo");
        } else {
            System.out.println("Urgente, Precisa de Manutenção!!!");
        }
    }
}