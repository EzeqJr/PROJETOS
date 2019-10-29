package unama.com;

import java.util.Scanner;

public class EX5LetraB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[10];
        for (int i=0; i <vet.length; i++) {
            System.out.println("Entre com o numero " + 1 + 1);
            vet[1] = sc.nextInt();
        }
        int maior = 0;
        for(int numero : vet)
        {
            if (maior<numero){
                maior = numero;
            }
        }
        System.out.println("O Maior Valor do Vetor é " + maior);
    }
}
