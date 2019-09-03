package unama.com;

import java.util.Scanner;

public class Aula03_LetraA {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalcopias;
        System.out.println("Informe o Total de Copias: ");
        totalcopias = sc.nextInt();
        Double totalpago;
        if (totalcopias <= 100){
            totalpago = totalcopias*0.25;
        } else {
            totalpago = totalcopias*0.20;
        }
        System.out.println("O valor a sar pago é R$" + totalpago);
    }
}
