package unama.com;

import java.util.Scanner;

public class EX07LetraC {
    public static String vetificaParImpar (int numero){
            if (numero%2 > 0){
            return "Impar";
            } else {
            return "Par";
            }
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Entrada de dados
        System.out.println("Informe o Número: ");
        int numero = sc.nextInt();
        //chamada da Função
        String Resultado = vetificaParImpar(numero);
        //Saída de Dados
        System.out.println("O Numero " + "("+numero+")" + " é " + Resultado);

    }

}