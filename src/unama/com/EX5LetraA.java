package unama.com;

import java.util.Scanner;

public class EX5LetraA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] x = new int[10];
        Double notas;
        for (int i = 0; i<x.length; i++){
            System.out.println("Entre com o numero " + i);
            x[i] = sc.nextInt();
        }
        for (int i = 0; i<x.length; i++){
            System.out.println(x[i]);
        }
    }
}
